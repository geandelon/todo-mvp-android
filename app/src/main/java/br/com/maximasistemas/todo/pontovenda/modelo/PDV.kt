package br.com.maximasistemas.todo.pontovenda.modelo

import android.os.Parcel
import android.os.Parcelable

data class PDV(var codigo: String, var cpfCnpj: String, var razaoSocial: String, var nomeFantasia: String) : Parcelable {

    constructor() : this(
            "",
            "",
            "",
            ""
    )

    constructor(codigo: String) : this(
            codigo,
            "",
            "",
            ""
    )

    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            source.readString(),
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(codigo)
        writeString(cpfCnpj)
        writeString(razaoSocial)
        writeString(nomeFantasia)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<PDV> = object : Parcelable.Creator<PDV> {
            override fun createFromParcel(source: Parcel): PDV = PDV(source)
            override fun newArray(size: Int): Array<PDV?> = arrayOfNulls(size)
        }
    }
}