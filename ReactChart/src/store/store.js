import { createStore, applyMiddleware } from "redux";
import thunk from 'redux-thunk';
import details from "../reducers/details";

export default () => {
    return createStore(details, applyMiddleware(thunk));
};