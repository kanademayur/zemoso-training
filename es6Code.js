// Here is a bunch of Lorem Ipsum. You will need it. I recomend using word wrap to view this! View > Toggle Word Wrap
const lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi dictum lorem vel elit laoreet, vitae maximus ligula consectetur. Etiam magna quam, varius at risus eu, rutrum commodo lacus. Maecenas felis sem, consequat non congue non, vestibulum vitae orci. Etiam laoreet ultricies enim, sit amet gravida massa sodales vel. Vivamus tempus neque sed mi elementum ornare eget non lorem. Donec dapibus ex tortor, ut vehicula metus scelerisque eget. Aenean dictum iaculis nulla, vel dapibus justo dignissim quis. Curabitur vitae efficitur neque. Ut vitae orci semper, efficitur dolor eget, porta dui. Cras eu sapien aliquam mauris facilisis ullamcorper. Nullam facilisis sem diam, quis tempor felis interdum ut. Praesent eu nibh arcu. Proin a quam augue. Integer malesuada finibus sem eget consectetur. Aenean non hendrerit purus, quis auctor elit. Duis ullamcorper, ex vitae rutrum ullamcorper, diam justo maximus quam, eget pellentesque metus nunc sit amet arcu. Nunc id eros leo. Praesent ultricies, nunc sit amet finibus posuere, quam magna viverra lectus, non tincidunt tellus mauris sit amet turpis. Nam eleifend quam vel justo pulvinar euismod. Duis ac elit id risus ultricies sollicitudin vitae ac quam. Donec et cursus leo, non dignissim enim. Vestibulum in felis imperdiet, venenatis tortor iaculis, congue augue. Nullam egestas dui nec quam sagittis sollicitudin ac blandit turpis. Nunc in fermentum odio. Morbi sodales mi nibh, ac cursus felis ultricies sed. Quisque at porttitor risus. Aenean a massa in libero venenatis tempus sed in mi. Nullam luctus sapien eget sagittis egestas. Pellentesque eros sem, semper eu molestie in, commodo a lacus. Phasellus pellentesque erat magna, eu facilisis nibh porttitor eget. Ut id mi lobortis, consequat orci ac, vulputate metus. Sed vulputate turpis nec lectus malesuada lacinia. Quisque non mattis eros. Aliquam pellentesque urna vulputate, auctor nibh in, fermentum odio. Suspendisse aliquam neque et aliquam facilisis. Donec sapien felis, molestie vel vestibulum non, sagittis sed felis. Aenean sodales iaculis dolor eget malesuada. Fusce ac libero hendrerit, viverra nunc iaculis, maximus nisi. Nulla volutpat nisi purus, non interdum erat hendrerit vitae. Integer viverra dignissim cursus. Phasellus eu libero sed ex faucibus convallis. In et egestas ipsum. Cras a metus mollis, laoreet risus eget, ultrices purus. Duis at ligula venenatis, imperdiet nulla et, bibendum augue. Pellentesque eleifend libero maximus, pretium lectus et, condimentum metus. Nulla vel est diam. In fermentum ut nulla eget finibus. Aliquam at turpis sagittis, feugiat diam ac, pulvinar quam. Phasellus pretium porta aliquet. Nunc sit amet nisl viverra justo porttitor egestas vel vitae eros. Fusce sit amet fringilla sapien. Nunc placerat, est sit amet laoreet pretium, augue turpis lacinia ipsum, non luctus magna ipsum vel sapien. Fusce luctus odio eget nunc rutrum ullamcorper. Integer vel ligula id elit viverra aliquam. Praesent id ultricies neque. Quisque molestie tellus ac ex vulputate rhoncus. Donec nec massa eget augue tincidunt ultrices vitae at diam. Ut risus purus, egestas eu eros sed, egestas auctor erat. Integer vulputate erat nisi, in aliquet turpis faucibus vel. Praesent neque augue, congue at nunc ut, congue ultricies erat. Ut sed erat in dui ornare malesuada. Nam id elementum ex. Vestibulum condimentum erat quis erat molestie hendrerit. Etiam laoreet volutpat quam, eget ornare ex molestie mollis. Phasellus eros mi, ultrices vel dui ac, facilisis consectetur nunc. Aliquam erat volutpat. Donec rutrum laoreet iaculis."

// Add a list of colors to this array
 const colors = ["red","blue","orange","Pink","black","purple","yellow","green","violet","indigo"]


// Use this object for your random name generator. Enter in a bunch of objects with first and last names. When generating a new random name, try to grab a random first or last name from any object. Don't just take object as a whole.
const names =
[
    {
        firstName: "Mayur",
        lastName: "Kanade"
    },
    {
        firstName: "Pratik",
        lastName: "Rakh"
    },
    {
        firstName: "Akash",
        lastName: "londhe"
    },
    {
        firstName: "Vinod",
        lastName: "Mane"
    },
    {
        firstName: "Prasad",
        lastName: "Galande"
    },
    {
        firstName: "Shubham",
        lastName: "Raut"
    }
]


//Random Number
const randomGenerator=(min,max)=>{
    min = Math.ceil(min);
    max = Math.floor(max);
    console.log(min)
    console.log(max)
    console.log(Math.random()*((max-min) + 1) + min)
    var num = Math.floor(Math.random() * (max - min)) + min;
    console.log(num)
    let randomN = num
    console.log(randomN)
    return randomN
}
const randomNumber=()=>{
    const radomNumber = randomGenerator(1,100)
    document.getElementById("c1").innerHTML = radomNumber
 }

 //Returns a random number between "Start" and "End"
 const randStartAndEnd=()=>{
    const startVal = document.getElementById("randStart").value
    const endVal = document.getElementById("randEnd").value

    const newRandVal = randomGenerator(startVal , endVal)
    document.getElementById("p2").innerHTML = newRandVal
 }

 //Returns a long Lorem Ipsum String
 const loremString=()=>{
    document.getElementById("p3").innerHTML = lorem
}

//Returns a Lorem Ipsum String based on the Number of Sentences Specified

const loremSentences=()=>{
    const numberOfSentences = document.getElementById("loreSentence").value
    //split array containing the sentences
    const newLoremSentence= lorem.split(".")

    let newLorem =""
    for (let i =0 ; i< numberOfSentences; i++){
        newLorem =newLorem+ newLoremSentence[i]+"."
    }
    document.getElementById("p4").innerHTML = newLorem
}

//Returns a Lorem Ipsum String based on the Number of Characters Specified
const loremCharacter=()=>{
    const numberOfSentences = document.getElementById("loremChar").value
    //split array for characters
    const newLoremCharacter= lorem.split("")

    let newLoremChars =""
    for (let i =0 ; i< numberOfSentences; i++){
        newLoremChars =newLoremChars+ newLoremCharacter[i]
    }
    document.getElementById("p5").innerHTML = newLoremChars
}

//Returns the current date(formatted)
const newDate=()=>{
    let myDate = new Date()
    let day = myDate.getDate()
    let month =myDate.getMonth()+1
    let year = myDate.getFullYear()

    let currentDate = day +"/" +month+ "/"+year
    document.getElementById("p6").innerHTML = currentDate
}

//Returns the current time(formatted)
const newTime=()=>{
    let myDate = new Date()
    let hours = myDate.getHours()
    let minutes = myDate.getMinutes()

    
    let ampm
    if (hours >=12) {
        ampm = "PM"
        hours = hours%12 || 12
    }else
    {
        ampm=" AM"
    }
    if (minutes < 10){
        minutes= "0" +minutes
    }
    if(hours<10){
    hours="0"+hours 
    }
   let currentTime = hours +":"+ minutes +" "+ ampm
   console.log(currentTime);
   
    document.getElementById("p7").innerHTML = currentTime
}

//Converts Inches to Feet
const convertInchesToFeet=()=>{
    let inches = document.getElementById("inches").value
    let convertedFeet= inches/12
    let conFeet = convertedFeet.toFixed(3) + " FT"
    document.getElementById("p8").innerHTML = conFeet
}

//Converts Feet to Inches
const convertFeetToInches=()=>{
    let feet = document.getElementById("feet").value
    let convertedInches= feet*12 + " Inches"
    document.getElementById("p9").innerHTML = convertedInches
}

//Compare if two words are the same length
const compareWords=()=>{
    let word1 = document.getElementById("firstWord").value
    let word2 = document.getElementById("secondWord").value
    let msg=""
    if(word1.length == word2.length){
        msg="Both words are the same length."
    }else{
        msg =" length is not same ."
    }
    document.getElementById("p10").innerHTML = msg
}

//Returns a random password
const passwordGen=()=>{
    const chars=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","!","@","#","$"]
    let newPass =""
    for(let i=0;i<7;i++){
        let num = randomGenerator(0,(chars.length-1))
        newPass=newPass + chars[num]
    }
    document.getElementById("p11").innerHTML = newPass
}

//Tells you if the number is even or odd
const evenOdd=()=>{
    let newNum = document.getElementById("num").value
    let newMsg=""
    if(newNum%2 ==0){
        newMsg = newNum +" is even number."
    }else{
        newMsg = newNum + " is odd number."
    }
    document.getElementById("p12").innerHTML =newMsg
}

//Returns a random color
const randColor=()=>
{
    let newcolor = colors[randomGenerator(0,(colors.length-1))]
    document.getElementById("p13").innerHTML = newcolor
    document.getElementById("p13").style.color=newcolor
    
}
const newColor=()=>{
    let color="#"
    let symbols ="0123456789ABCDEF"
    for(let i=0 ; i<6 ;i++){
       color =color+symbols[Math.floor(Math.random()*16)]
       document.body.style.background = color
       //document.getElementById("p13").innerHTML = color
   }
}

//Returns a random first and last name
const randName=()=>{
    let first =names[randomGenerator(0,(names.length-1))].firstName
    let last =names[randomGenerator(0,(names.length-1))].lastName
    let newName = first +" " +last
    document.getElementById("p14").innerHTML = newName
}