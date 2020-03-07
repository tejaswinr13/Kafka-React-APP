import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Header from '../components/Header';
import DashBoard from '../components/DashBoard';
import NotFound from '../components/NotFound';
import PieChart from '../components/PieChart';
import DetailTable from '../components/DetailTable';

const AppRouter = () => (
    <BrowserRouter>
        <div className='container'>
            <Header />
            <Switch>
                <Route path="/" component={DashBoard} exact={true}/>
                <Route path="/pie" component={PieChart} />
                <Route path="/table" component={DetailTable}/>
                <Route component={NotFound} />
            </Switch>
        </div>
    </BrowserRouter>
);

export default AppRouter;