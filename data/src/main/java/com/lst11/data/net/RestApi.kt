package com.lst11.data.net

import com.lst11.data.entity.WordResponse
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface RestApi {

    @FormUrlEncoded
    @POST("translate")
    fun getTranslate(
            @Field("key") key: String,
            @Field("lang") lang: String,
            @Field("text") text: String): Observable<WordResponse>
}