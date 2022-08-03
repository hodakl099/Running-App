package com.androiddevs.runningappyt.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.ByteArrayOutputStream

class Convertors {

    fun toBitMap(byte: ByteArray) : Bitmap{
        return BitmapFactory.decodeByteArray(byte,0,byte.size)
    }

    fun fromBytes(bmp: Bitmap) : ByteArray {
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()

    }
}