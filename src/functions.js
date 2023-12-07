function CheckBase() {
    var url = "https://d5d4q51bs3b109d4i0vv.apigw.yandexcloud.net/getInfoFromBase"
    var options = {
                    headers: {
                            "Content-Type": "text/plain"
                            },
                    body: {
                           "product_id": 666, 
                           "object_id": 666, 
                           "client_id": 666, 
                           "phone_id": 666, 
                           "campaign_id": 666
                    }
                    };
    
    var response = $http.post(url, options);
    if(response.isOk) {
        return response.data
    } else {
        return "ERROR"
    };
}