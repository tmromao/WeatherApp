package com.example.weatherapp.domain.weather

data class WeatherInfo(
    //Map para mapear o Int da API com os dados sobre weather
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?

)