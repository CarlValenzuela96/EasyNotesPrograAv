/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



var color = Chart.helpers.color;
var barChartData = {
    labels: ramos,
    datasets: [{
            label: 'Notas',
            backgroundColor: color(window.chartColors.blue).alpha(0.5).rgbString(),

            borderColor: window.chartColors.blue,

            borderWidth: 1,
            data: notas
        }]

};

window.onload = function () {
    var ctx = document.getElementById('grafico').getContext('2d');
    window.myBar = new Chart(ctx, {
        type: 'bar',
        data: barChartData,
        options: {
            scales: {yAxes: [{ticks: {beginAtZero: true}}]},
            responsive: true,
            legend: {
                position: 'top',
            },
            title: {
                display: true,
                text: 'Historial'
            }
        }
    });

};

