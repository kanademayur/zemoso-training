import React,{useState} from 'react';
import MediaCard from './Book';
import data from './Data';
import{Grid,Box} from '@mui/material';


function AutoGrid(){
    const[state, setState] =useState(true);
    return(
        <Box sx={{flexGrow:1}}>
        <Grid container spacing={{xs:3}}>
            {data.books.map((book)=>{
                return book.status && (<Grid item xs={2}>
                    <Box onClick={()=> setState(!state)}><MediaCard book={book} /></Box>
                </Grid>)
            })}
        </Grid>
    </Box>
    );
}
export default AutoGrid;