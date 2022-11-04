import React,{useState} from 'react';
import {Grid,Box} from '@mui/material';
import MediaCard from './Book';

import data from './Data';



function FinishGrid() {
  const[state, setState] =useState(true);
  return (
    <Box sx={{flexGrow:1}}>
        <Grid container spacing={{xs:3}}>
            {data.books.map((book)=>{
                return !book.status && (<Grid item xs={2}>
                    <Box onClick={()=> setState(!state)}><MediaCard book={book} /></Box> 
                    {/* <MediaCard book={book}/> */}
                </Grid>)
            })}
        </Grid>
    </Box>
  )
}

export default FinishGrid