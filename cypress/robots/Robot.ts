import { BaseHands, BaseEyes, BaseDependencies } from './BaseRobot';


export class Dependencies extends BaseDependencies {
   
    visitAmazon(){
        this.accessUrl('https://www.amazon.in/');
    }
}

export class RobotEyes extends BaseEyes{
    verifyingTheCart(){
        this.seesDomContainText(".a-dropdown-prompt","1")
    }  
    checkDeliveryDate(){
        this.seesDomContainText("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-color-base a-text-bold']","tomorrow, September 28")
    }
    verifyNewAddress(){
        this.seesDomContainText("body > div:nth-child(7) > div:nth-child(31) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1) > span:nth-child(1)","Mayur") 
    }
    verifyCard(){
        this.seesDomContainText(".a-size-base.pmts-instrument-display-name","ICICI Bank Credit Card")
    }
}

export class RobotHands extends BaseHands{

    clickOnTodaysDeal(){
        this.clickOnText("Today's Deals")
    }
    clickOnThirdItem(){
        this.clickOnCss("div[data-testid=grid-deals-container]>div:nth-child(3)")
    }
    clickOnFirstItem(){
        this.clickOnDomElement("a[title='Fire TV Stick with all-new Alexa Voice Remote (includes TV and app controls) | HD streaming device'] div[class='a-section octopus-dlp-image-shield']")
    }
    clickOnAddToCart(){
        this.wait(2000)
        this.clickOnDomElement("#add-to-cart-button")
        
    }
    clickOnCart(){
        this.wait(2000)
        this.clickOnDomElement(".nav-cart-icon.nav-sprite")
        
    }
    searchMobiles(){
        this.typeTextonId("twotabsearchtextbox","Mobile")
    }
    clickOnsearch(){
        this.clickOnId("nav-search-submit-button")
    }
    scrolling(){
        cy.scrollTo(0,6500)
    }
    getLastMobile(){
        this.wait(2000)
        cy.get("body > div:nth-child(1) > div:nth-child(30) > div:nth-child(12) > div:nth-child(1) > div:nth-child(1) > span:nth-child(4) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)").then($ele=>{
            cy.log($ele.text())
          })
        //this.clickOnDomElement("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5'] div[class='a-section aok-relative s-image-fixed-height']")
    }
    navigatingBack(){
        this.navigatingBack
    }
    clickOnSignIn(){
        this.clickOnDomElement("span[class='nav-line-2 ']")
    }
    enterloginId(){
        this.wait(2000)
        this.typeTextonId("ap_email","9673146895")
        this.wait(2000)
        this.clickOnDomElement("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)")
        this.wait(2000)
        this.typeTextonId("ap_password","9673146895")
        this.clickOnId("signInSubmit")
    }
    clickOnContinue(){
        this.clickOnDomElement("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)")
    }
    enterPassword(){
        this.typeTextonId("ap_password","9673146895")
    }
    clickOnSignUp(){
        this.clickOnId("signInSubmit")
    }
    clickOnBabyBtn(){
        this.clickOnDomElement(".nav-a[href='/Baby/b/?ie=UTF8&node=1571274031&ref_=nav_cs_baby']")
    }
    selectPrime(){
        this.clickOnDomElement("body > div:nth-child(1) > div:nth-child(30) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)")
    }
    clickOnOrder(){
        this.clickOnDomElement("a[id='nav-orders'] span[class='nav-line-2']")
    }
    clickOnDropdownBtn(){
        this.clickOnDomElement("#a-autoid-1-announce")
    }
    selectYear(){
        this.clickOnDomElement("#time-filter_3")
    }
    clickOnAccount(){
        this.clickOnDomElement("#nav-link-accountList")
    }
    clickOnAddress(){
        this.wait(2000)
       this.clickOnDomElement("body > div:nth-child(1) > div:nth-child(30) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)") 
    }
    clickOnAddAddress(){
        this.wait(3000)
        this.clickOnDomElement(".a-box.first-desktop-address-tile")
    }
    enterName(){
        this.wait(3000)
        this.typeTextonId("address-ui-widgets-enterAddressFullName","Mayur")
    }
    enterMobile(){
        this.typeTextonId("address-ui-widgets-enterAddressPhoneNumber","9673146895")
    }
    enterPinCode(){
        this.typeTextonId("address-ui-widgets-enterAddressPostalCode","411018")
    }
    enterFlatNo(){
        this.typeTextonId("address-ui-widgets-enterAddressLine1","Flat No.301")
    }
    enterStreet(){
        this.typeTextonId("address-ui-widgets-enterAddressLine2","Pimpri")
    }
    enterLandMark(){
        this.typeTextonId("address-ui-widgets-landmark","Ajmera")
    }
    clickOnAddAddressBtn(){
        this.clickOnDomElement("input[aria-labelledby='address-ui-widgets-form-submit-button-announce']")
    }
    clickOnPaymentOption(){
        this.clickOnDomElement("div[data-card-identifier='PaymentOptions'] div[class='a-box-inner']")
    }
    clickTodays(){
        this.clickOnDomElement(".nav-a[href='/deals?ref_=nav_cs_gb']")
    }
    getFirstIteamDeliveryDate()
        {
      this.wait(3000)
      cy.get("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-row a-size-base a-color-secondary s-align-children-center'] span:nth-child(2)").then(function(text2){
      cy.log(text2.text())
        })
      }

getLastElementDetails()
{
    this.clickOnDomElement("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_22'] div[class='a-section aok-relative s-image-fixed-height']")
    this.wait(5000)
    cy.get("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_22'] span[class='a-size-medium a-color-base a-text-normal']").then(function(text1){
    cy.log(text1.text())
   })
   
}

    
}