import React from 'react';
import { connect } from 'react-redux';

const Detail = ({ id, name, dts, address, amount, bank }) => (
        <tr>
            <td>{id}</td>
            <td>{name}</td>
            <td>{dts}</td>
            <td>{address.street}</td>
            <td>{address.city}</td>
            <td>{bank.name}</td>
            <td>{bank.type}</td>
            <td>{amount}</td>
        </tr>
);

export default connect()(Detail);
