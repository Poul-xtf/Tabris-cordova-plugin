var exec = require('cordova/exec');

exports.show = function (arg0, success, error) {
    // exec(success, error, 'my-test-plugin', 'coolMethod', [arg0]);
     exec(null, null, "myPlugins", "showToast", [arg0]);
};
