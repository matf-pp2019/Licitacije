package Package

import java.rmi.{Remote, RemoteException}

trait RemoteServer extends Remote{

  /**
    *
    * @param ItemPrice price of item we are putting for licitation
    * @param ItemName name of item we are putting on licitation
    * @param CLientID id of client that is making licitation
    * @throws
    * @return return id of item wen server makes one
    */
  @throws[RemoteException]
  def createLictitation(itemPrice:Double,itemName:String, clientID: Int):Int

  /**
    *
    * @param itemID ID of item tjat we are bidding on
    * @param price new price we are setting
    * @param ClientID ID of client that is makeing the bid
    *
    *                 we might wanna add return value so we can know if bid was successful
    */
  @throws[RemoteException]
  def bid(itemID: Int,price: Double, clientID: Int)

  /**
    *  this method will be used only when we are second highest bidder and we dont want to buy item
    * @param itemID id of the item that we are offered to buy
    * @throws
    */
  @throws[RemoteException]
  def cancelTransaction(itemID:Int)

  /**
    *
    * @param itemID id of the item we are subscribing to
    * @throws
    */
  @throws[RemoteException]
  def subscribe(itemID:Int)
}
