import React from 'react';
import { NavLink } from 'react-router-dom';

const Header = () => (
    <header>
        <h2>React Chart</h2>
        <div className='header__nav'>
            <NavLink to='/' activeClassName='activeNav' exact={true}>Kafka Bar Chart</NavLink>
            <NavLink to='/pie' activeClassName='activeNav' >Kafka Pie Chart</NavLink>
            <NavLink to='/table' activeClassName='activeNav'>Kafka Grid</NavLink>
        </div>
    </header>
);

export default Header;