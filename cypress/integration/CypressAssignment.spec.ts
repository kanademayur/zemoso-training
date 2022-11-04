import { RobotEyes, RobotHands, Dependencies } from './../robots/Robot';

context('Amazon Assignment', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()

    describe('Amazon Assignment', ()=>{
        
        it("navigate to Amazon page", () => {
            dependencies.visitAmazon();
        });

        it("Click On Todays Deal", () => {
            robotHands.clickOnTodaysDeal()
        });

        it("Get the third Deal", () => {
            robotHands.clickOnThirdItem()
            robotHands.clickOnFirstItem()
        });

        it("Verify the Quantity", () => {
            robotHands.clickOnAddToCart()
            
        });

        it("Search forMobiles", () => {
            robotHands.searchMobiles() 
            robotHands.clickOnsearch()
            robotHands.scrolling()
        });

        it("Last Displayed Item Details", () => {
            robotHands.getLastElementDetails()
        });

        it("Go to Main Menu", () => {
            robotHands.navigatingBack()
        });
        it("Login", () => {
            robotHands.clickOnSignIn()
            robotHands.enterloginId()
            
             
         })
         it("Select Prime Check Box", () => {
             robotHands.clickOnBabyBtn()
             robotHands.selectPrime()
             
             
              
          })
          it("Check Delivery Status", () => {
             robotEyes.checkDeliveryDate()
             
              
         })
         it("Select Past One Year Order", () => {
            robotHands.clickOnOrder()
            robotHands.enterloginId()
            robotHands.clickOnDropdownBtn()
            robotHands.selectYear()
            
             
        })
        
        it("Add New Address", () => {
            robotHands.clickOnAccount()
            robotHands.clickOnAddress()
            robotHands.enterloginId()
            robotHands.clickOnAddAddress()
            
            robotHands.enterName()
            robotHands.enterMobile()
            robotHands.enterPinCode()
            robotHands.enterFlatNo()
            robotHands.enterStreet()
            robotHands.enterLandMark()
            robotHands.clickOnAddAddressBtn()
            robotHands.clickOnAddAddressBtn()
            robotEyes.verifyNewAddress()
            
             
        })
        it("Verify New Payment Option ", () => {
            robotHands.clickOnAccount()
            robotHands.clickOnPaymentOption()
            robotHands.enterloginId()
            robotEyes.verifyCard()   
        })

        
 
        
    });

});