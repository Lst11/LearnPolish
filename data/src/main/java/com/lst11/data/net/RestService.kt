package com.lst11.data.net

import android.util.Log
import com.lst11.data.entity.WordRequest
import com.lst11.data.utils.Transformer
import com.lst11.domain.entity.Word
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class RestService(apiUrl: String) {

    private val restApi: RestApi

    init {
        val okHttpBuilder = OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)

        val logging = HttpLoggingInterceptor()
        okHttpBuilder.addInterceptor(logging)

        val retrofit = Retrofit.Builder()
                .baseUrl(apiUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .client(okHttpBuilder.build())
                .build()
        restApi = retrofit.create(RestApi::class.java)
    }

    fun getTranslate(wordPL: String): Observable<Word>? {
        val wordRequest = WordRequest(wordPL)
        return restApi.getTranslate(wordRequest.key,wordRequest.lang, wordRequest.wordPL)
                .doOnNext { Log.e("aaa","RestService: getTranslate ${it.listOfWords}") }
//                ?.observeOn(Schedulers.computation())
//                ?.subscribeOn(Schedulers.io())
                ?.map { Transformer.transformResponseToDomain(wordPL,it)}
    }
}




