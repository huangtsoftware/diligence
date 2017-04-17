/**
 * Created by huangteng on 2017/4/17.
 *
 */
requirejs.config({
    //By default load any module IDs from js/lib
    baseUrl: 'js',
    //except, if the module ID starts with "app",
    //load it from the js/app directory. paths
    //config is relative to the baseUrl, and
    //never includes a ".js" extension since
    //the paths config could be for a directory.
    paths: {
        lib: 'lib'
    }
});

// Start the main app logic.
requirejs(['lib/jquery', 'lib/echarts'], function () {
        // 加载完成后调用

    }
);