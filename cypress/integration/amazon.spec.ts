import { RobotEyes, RobotHands, Dependencies } from './../robots/Robot';

context('Amazon Assignment', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()

    describe('Amazon Assignment', ()=>{
        before(function(){})

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

        

    });

});