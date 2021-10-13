package com.faskn.app.weatherapp.utils



interface Mapper<R, D> {
    fun mapFrom(type: R): D
}
