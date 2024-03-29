
/**
 * BookInformationServiceImplCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */

    package com.unilib.service.client;

    /**
     *  BookInformationServiceImplCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BookInformationServiceImplCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BookInformationServiceImplCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BookInformationServiceImplCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for isQualityWithinRange method
            * override this method for handling normal response from isQualityWithinRange operation
            */
           public void receiveResultisQualityWithinRange(
                    com.unilib.service.client.BookInformationServiceImplStub.IsQualityWithinRangeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isQualityWithinRange operation
           */
            public void receiveErrorisQualityWithinRange(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBookFromMarket method
            * override this method for handling normal response from getBookFromMarket operation
            */
           public void receiveResultgetBookFromMarket(
                    com.unilib.service.client.BookInformationServiceImplStub.GetBookFromMarketResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBookFromMarket operation
           */
            public void receiveErrorgetBookFromMarket(java.lang.Exception e) {
            }
                


    }
    