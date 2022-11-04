import React from 'react';
import PropTypes from 'prop-types';
import {Tab,Box,Tabs,Grid } from '@mui/material';
import AutoGrid from './AutoGrid';
import books from './Data'

import FinishGrid from './FinishGrid';



function TabPanel(props) {
    const {children,value,index,...other} = props
  return (
    <div role="tabpanel"
        hidden={value !== index}
        id={`simple-tabpanel-${index}`}
        aria-labelledby={`simple-tab-${index}`}
        {...other}>

        {value === index && (
            <Box p={3}>
                {children}
            </Box>
        )}
    </div>
  )
}

TabPanel.prototype = {
    children : PropTypes.node,
    index : PropTypes.number.isRequired,
    value : PropTypes.number.isRequired
};

function allProps(index){
    return{
        id: `simple-tab-${index}`,
        'aria-controls':`simple-tabpanel-${index}`,
    };
}

export default function BasicTabs(){
    const[value,setValue]= React.useState(0);
    
    const handleTabs = (event,newval) => {
        
        setValue(newval);
    }
    return(
        <Box sx={{ maxWidth:'100%',paddingLeft:2}}>
            <Box sx={{borderBottom:1,borderColor:'divider'}}>
                <Tabs value={value} onChange={handleTabs} aria-label=" basic tab example">
                    <Tab label="Currently Reading"{...allProps(0)}></Tab>
                    <Tab label="Finished"{...allProps(1)}></Tab>
                </Tabs>
            </Box>
            <TabPanel value={value} index={0}>
                <Grid item xs={3}>
                    <AutoGrid/>
                    

                </Grid>
            </TabPanel>
            <TabPanel value={value} index={1}>
                <FinishGrid books={books}/>
            </TabPanel>
        </Box>
    )
}

