import React,{useState} from 'react';
import {Card,Typography,Button,CardActions,CardMedia,CardContent} from '@mui/material';
import AccessTimeIcon from '@mui/icons-material/AccessTime';
import PermIdentitySharpIcon from '@mui/icons-material/PermIdentitySharp';


function MediaCard({book}) {
    const[state, setState ] =useState(book.status);
    const toggle = () => {
        setState(!state);
        book.status=!book.status;
    }
  return (
    <Card sx={{maxWidth:300,borderBottom:18,borderBlockColor:'lightgray',borderBottomLeftRadius:8,borderBottomRightRadius:8}}>
        <CardMedia
            component={"img"}
            width='300'
            height='300'
            image={book.image}
            alt={book.name}/>
        <CardContent>
            <Typography 
            variant='h5' 
            color='black'
            align='left'
            fontSize={20}
            paddingTop={2}>
                {book.name}
            </Typography>
            <Typography  
                variant='body1' 
                color='gray'
                align='left'
                fontSize={18}
                paddingTop={2}
                >        
                {book.author}
            </Typography>
            <Typography  
                variant='body1' 
                color='gray'
                align='left'
                fontSize={14}
                paddingTop={2}
                alignItems='center'
                flexWrap='wrap'
                display='flex'
                
                > <AccessTimeIcon/>      
                {book.time}<Typography paddingLeft={4} variant='body1' color='gray' fontSize={14} alignItems='center' flexWrap='wrap' display='flex'>  <PermIdentitySharpIcon/> 1.9k reads</Typography>
            </Typography>
        </CardContent>
       
        <CardActions>
            <Button onClick={toggle} size='small' className={'toggle--button' + (state ? 'toggle--ReadAgain' :'')}>
                {state ? 'Finished' : 'ReadAgain'}
            </Button>
        </CardActions>
    </Card>

  )
}

export default MediaCard