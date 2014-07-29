# wheel
=====

wheel is base on [AndroidWheel](https://code.google.com/p/android-wheel/).
There are 4 attrs
wheel_background: change wheel background ,default wheel_bg
wheel_selector: change wheel selector, default wheel_val
shadow_enabled: make shadow enabled, default true
shadow_colors: change shadow colors,default " black to transparent"

### Gradle

```groovy
dependencies {
    compile 'com.michaelchou.wheel:wheel:+'
}

```

### In Layout

```xml
// url is the URL to download.
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:wheel="http://schemas.android.com/apk/res-auto"
	android:layout_height="fill_parent"
	android:orientation="vertical"
	android:layout_width="fill_parent">

   <com.michaelchou.wheel.WheelView
       android:id="@+id/country"
       wheel:wheel_background="@drawable/wheel_bg_demo"
       wheel:wheel_selector="@drawable/wheel_val_demo"
       wheel:shadow_enabled="false"
       wheel:shadow_colors="@array/shadow"
       android:layout_height="match_parent"
       android:layout_width="match_parent"/>
</LinearLayout>

```

### In Style

```xml
// url is the URL to download.
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="Widget" />

    <style name="Widget.Wheel">
    </style>
    <!-- Default Background,Default Shadow,My Selector -->
    <style name="Widget.Wheel.WithMySelector">
        <item name="wheel_selector">@drawable/wheel_val_demo</item>
    </style>
    <!-- Default Selector,Default Shadow,My Background -->
    <style name="Widget.Wheel.WithMyBackground">
        <item name="wheel_background">@drawable/wheel_bg_demo</item>
    </style>
    <!-- Default Selector,Default Background,No Shadow -->
    <style name="Widget.Wheel.WithoutShadow">
        <item name="shadow_enabled">false</item>
    </style>
    <!-- Default Selector,Default Background,My Shadow -->
    <style name="Widget.Wheel.WithMyShadow">
        <item name="shadow_colors">@array/shadow</item>
    </style>
    
</resources>

```
