import React from 'react';
import { connect } from 'react-redux';
import Detail from './Detail';

const DetailList = (props) => (
    <div>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Timestamp</th>
                    <th>Street</th>
                    <th>City</th>
                    <th>Bank Name</th>
                    <th>Bank Type</th>
                    <th>Amount</th>
                </tr>
            </thead>
            {props.details.map(detail => {
                return (
                    <tbody key = {detail.id}>
                        <Detail {...detail} />
                    </tbody>
                );
            })}
        </table>
    </div>
);

const mapStateToProps = (state) => {
    return {
        details: state
    };
}

export default connect(mapStateToProps)(DetailList);