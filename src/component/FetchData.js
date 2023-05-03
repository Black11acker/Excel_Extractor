import React, { useState } from "react";
import axios from "axios";
import * as XLSX from "xlsx";

function FetchData() {
  const [startDate, setStartDate] = useState("");
  const [endDate, setEndDate] = useState("");
  const [data, setData] = useState([]);

  const fetchData = async () => {
    try {
      const response = await axios.get(
        `http://localhost:8080/Employee/getAll?from=${startDate}&to=${endDate}`
      );
      setData(response.data);
    } catch (error) {
      console.log(error);
    }
  };

  const exportData = () => {
    const worksheet = XLSX.utils.json_to_sheet(filteredData);
    const workbook = XLSX.utils.book_new();
    XLSX.utils.book_append_sheet(workbook, worksheet, "Data");
    XLSX.writeFile(workbook, "data.xlsx");
  };

  const filteredData = data.filter(
    (item) =>
      new Date(item.doj) >= new Date(startDate) &&
      new Date(item.doj) <= new Date(endDate)
  );

  return (
    <div>
      <div>
        <h1>Sundaram Employee Details</h1>
      </div>
      <div>
        <label>From:</label>
        <input
          type="date"
          value={startDate}
          onChange={(e) => setStartDate(e.target.value)}
        />
      </div>
      <div>
        <label>To:</label>
        <input
          type="date"
          value={endDate}
          onChange={(e) => setEndDate(e.target.value)}
        />
      </div>
      <button onClick={fetchData}>Fetch Data</button>
      {filteredData.length > 0 && (
        <div style={{ tableLayout: "arranged" }}>
          <h2>Data</h2>
          <button onClick={exportData}>Export Data/Download</button>
          <table align="center" border="1px">
            <thead>
              <tr>
                <th>empname</th>
                <th>role</th>
                <th>dept_id</th>
                <th>bcode</th>
                <th>mobile</th>
                <th>email</th>
                <th>doj</th>
                <th>dob</th>
                <th>age</th>
              </tr>
            </thead>
            <tbody>
              {filteredData.map((item, index) => (
                <tr key={index}>
                  <td>{item.empname}</td>
                  <td>{item.role}</td>
                  <td>{item.dept_id}</td>
                  <td>{item.bcode}</td>
                  <td>{item.mobile}</td>
                  <td>{item.email}</td>
                  <td>{item.doj}</td>
                  <td>{item.dob}</td>
                  <td>{item.age}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      )}
    </div>
  );
}

export default FetchData;
