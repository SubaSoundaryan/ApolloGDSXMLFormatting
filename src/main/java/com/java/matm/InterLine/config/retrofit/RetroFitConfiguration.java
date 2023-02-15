//package com.java.matm.InterLine.config.retrofit;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
//
////@Service
//public class RetroFitConfiguration {
//
//    public static final String BASEURL = "http://localhost:8082";
////    public static final Gson gson = new GsonBuilder().setLenient().create();
//    private static final Retrofit.Builder builder
//            = new Retrofit.Builder()
//            .baseUrl(BASEURL)
//            .addConverterFactory(SimpleXmlConverterFactory.createNonStrict());
////            .addConverterFactory(SimpleXmlConverterFactory.create());
//    private static final Retrofit retrofit = builder.build();
//
//    private RetroFitConfiguration() {
//        //do nothing
//    }
//
//    public static <S> S createService(Class<S> serviceClass) {
//        return retrofit.create(serviceClass);
//    }
//}
