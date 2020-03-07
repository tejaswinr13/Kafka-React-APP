
import React, { Component } from 'react';
import { Pie } from 'react-chartjs-2';
import axios from '../axios/axios';

export default class PieChartComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      Data: {}
    }
  }
  getChartData() {
    return axios.get('/details').then(result => {
      const name = [];
      const amount = [];
      const background = [];

      result.data.forEach(item => {
        name.push(item.name);
        amount.push(item.amount);
        background.push(
          "#000000".replace(/0/g, function () {
            return (~~(Math.random() * 16)).toString(16)
          })
        );
      });
      this.setState({
        Data: {
          labels: name,
          datasets: [
            {
              data: amount,
              backgroundColor: background
            }
          ]
        }
      });
    })
  }

  componentDidMount() {
    this.getChartData()
  }
  render() {
    return (
      <div className="App">
        <Pie
          data={this.state.Data}
          options={{ maintainAspectRatio: true }} />
      </div>
    )
  }
}