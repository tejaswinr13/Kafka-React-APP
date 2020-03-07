const detailsReducerDefaultState = [];

export default (state = detailsReducerDefaultState, action) => {
    switch (action.type) {
        case 'GET_DETAILS':
            console.log("Get Details");
            return action.details;
        default:
            console.log("Default Details");
            return state;
    }
};
