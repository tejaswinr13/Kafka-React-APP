import axios from '../axios/axios';

const _getDetails = (details) => ({
    type: 'GET_DETAILS',
    details
});

export const getDetails = () => {
    return (dispatch) => {
        return axios.get('/details').then(result => {
            const details = [];

            result.data.forEach(item => {
                details.push(item);
            });

            dispatch(_getDetails(details));
        });
    };
};
