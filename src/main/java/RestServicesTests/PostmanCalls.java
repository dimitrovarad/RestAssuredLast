package RestServicesTests;

public class PostmanCalls {

    public static void main(String[] args) throws Exception {
        RestAssuredPostManCalls restAssuredPostManCalls = new RestAssuredPostManCalls();

        restAssuredPostManCalls.testGetCall();
        restAssuredPostManCalls.testPostCall();

        OrdinaryPostmanCalls.executePostRequest(RestAssuredPostManCalls.baseUrl + "post");
        OrdinaryPostmanCalls.sendGet(RestAssuredPostManCalls.baseUrl+"time/now");
    }
}