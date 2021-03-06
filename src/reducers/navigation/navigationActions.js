import { NavigationActions } from 'react-navigation';

export function redirectToOnBoardingScreen() {
    return NavigationActions.reset({
        index: 0,
        actions: [
          NavigationActions.navigate({ routeName: 'OnBoardingScreen'})
        ]
    });
};

export function redirectToLoginScreen() {
    return NavigationActions.reset({
        index: 0,
        actions: [
          NavigationActions.navigate({ routeName: 'LoginScreen'})
        ]
    });
};

export function redirectToMainScreen() {
    return NavigationActions.reset({
        index: 0,
        actions: [
          NavigationActions.navigate({ routeName: 'MainScreen'})
        ]
    });
};

export function redirectToMnemonicGenerationScreen() {
    return NavigationActions.reset({
        index: 0,
        actions: [
          NavigationActions.navigate({ routeName: 'MnemonicGenerationScreen'})
        ]
    });
};

export function navigateToFilesScreen(bucketId) {
    return NavigationActions.navigate({ routeName: 'FilesScreen', params: { bucketId } });
}

export function openImageViewer(fileId, localPath, bucketId) {
    return NavigationActions.navigate({ routeName: 'ImageViewerScreen', params: { fileId, localPath, bucketId } });
}

export function navigateBack() {
    return NavigationActions.back();
}

export function dashboardNavigateBack() {
    return NavigationActions.reset({
        index: 0,
        actions: [
          NavigationActions.navigate({ routeName: 'DashboardScreen'})
        ]
    });
}

export function bucketNavigateBack() {
    return NavigationActions.reset({
        index: 0,
        actions: [
          NavigationActions.navigate({ routeName: 'BucketsScreen'})
        ]
    });
}