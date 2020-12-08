var exec = require('cordova/exec');

exports.getVersionSdkInt = function (success, error) {
    exec(success, error, 'BuildVersion', 'getVersionSdkInt', [""]);
};
