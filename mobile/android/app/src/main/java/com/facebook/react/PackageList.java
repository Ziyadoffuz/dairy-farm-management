package com.facebook.react;

import android.app.Application;

import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.ArrayList;
import java.util.List;

public class PackageList {

  public PackageList(Application application) {
    // Hozircha bu yerda hech narsa qilmaymiz
  }

  public PackageList(ReactNativeHost reactNativeHost) {
    // Hozircha bu yerda hech narsa qilmaymiz
  }

  public List<ReactPackage> getPackages() {
    List<ReactPackage> packages = new ArrayList<>();

    // Asosiy React Native paket
    packages.add(new MainReactPackage());

    // Keyin kerak bo'lsa, boshqa paketlarni shu yerga qo'shamiz:
    // packages.add(new ReactNativeFirebaseAppPackage());
    // packages.add(new ReactNativeFirebaseMessagingPackage());
    // packages.add(new NotifeePackage());

    return packages;
  }
}
