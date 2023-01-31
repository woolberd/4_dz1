package com.example.a4_dz1.repository

import com.example.a4_dz1.model.HomeModel

class CatsRepository {
    private val catModelList: ArrayList<HomeModel> = ArrayList()

    fun getListOfCat(): ArrayList<HomeModel> {
        catModelList.add(HomeModel("https://http.cat/100", "Continue"))
        catModelList.add(HomeModel("https://http.cat/101", "Switching Protocols"))
        catModelList.add(HomeModel("https://http.cat/102", "Processing"))
        catModelList.add(HomeModel("https://http.cat/103", "Early Hints"))
        catModelList.add(HomeModel("https://http.cat/200", "OK"))
        catModelList.add(HomeModel("https://http.cat/201", "Created"))
        catModelList.add(HomeModel("https://http.cat/202", "Accepted"))
        catModelList.add(HomeModel("https://http.cat/203", "Non-Authoritative Information"))
        catModelList.add(HomeModel("https://http.cat/204", "No Content"))
        catModelList.add(HomeModel("https://http.cat/206", "Partial Content"))
        catModelList.add(HomeModel("https://http.cat/207", "Multi-Status"))
        catModelList.add(HomeModel("https://http.cat/300", "Multiple Choices"))
        catModelList.add(HomeModel("https://http.cat/301", "Moved Permanently"))
        catModelList.add(HomeModel("https://http.cat/302", "Found"))
        catModelList.add(HomeModel("https://http.cat/303", "See Other"))
        catModelList.add(HomeModel("https://http.cat/304", "Not Modified"))
        catModelList.add(HomeModel("https://http.cat/305", "Use Proxy"))
        return catModelList
    }
}