import StackNavigator from '../../navigators/StackNavigator';

/**
 * Declaring initial route of program
 */
export const initialState = StackNavigator.router.getStateForAction(StackNavigator.router.getActionForPathAndParams('InitializationScreen'));

/**
 * Creating navigation reducer
 * @param state passing current state  
 * @param action incoming action to change state
 * @returns new state 
 */
export default function navReducer (state = initialState, action) {
	let nextState = StackNavigator.router.getStateForAction(action, state);

	try {
        StackNavigator.router.getPathAndParamsForState(nextState);
    } catch(e) {
        console.log(e.message);
        nextState = state;
    }

	return nextState || state;
}