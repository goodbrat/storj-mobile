import { StackNavigator } from 'react-navigation';
import BucketsScreen from '../containers/BucketsListContainer';
import FilesScreen from '../containers/FilesListContainer';


const BucketsScreenNavigator = StackNavigator(
    {
        BucketsScreen: {
            screen: BucketsScreen,
            routeName: 'BucketsScreen'
        },
        FilesScreen: {
            screen: FilesScreen,
            routeName: 'FilesScreen'
        }
    }, 
    {
        initialRouteName: 'BucketsScreen'
    }
);

export default BucketsScreenNavigator;