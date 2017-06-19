## Pastel

Provides different pre-made button styles removing the needs to create your custom `resources` and supporting different versions of android.

## Usage

1. Define your app theme and add the following attributes:

`pastelColorControlHighlightPre21` - Highlight for pre 21

`pastelColorButtonNormalHighlightPre21` - Highlight for pre 21 Normal Button

```
<style name="AppTheme" parent="Theme.AppCompat.DayNight.NoActionBar">
    <item name="colorAccent">@color/color_accent</item>
    <item name="colorPrimary">@color/color_primary</item>
    <item name="colorPrimaryDark">@color/color_primary_dark</item>
    <item name="pastelColorControlHighlightPre21">@color/color_control_highlight_pre21</item>
    <item name="pastelColorButtonNormalHighlightPre21">@color/color_button_normal_Highlight_pre21</item>
</style>
```

2. Use the Pastel Style in your Layout

```
<Button
    style="@style/Pastel.Button.Material.Rect.Rounded.Colored"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="@string/button_label"/>
```

## Download

* Root Build.gradle
```
allprojects {
    repositories {
        ...
	    maven { url 'https://jitpack.io' }
	}
}
```

* Core (Required)
```
compile 'com.github.giaquino.Pastel:pastel-buttons-core:0.2.0-alpha'
```

* Button Styles
```
compile 'com.github.giaquino.Pastel:pastel-buttons-rect:0.2.0-alpha'
compile 'com.github.giaquino.Pastel:pastel-buttons-rect-outline:0.2.0-alpha'
compile 'com.github.giaquino.Pastel:pastel-buttons-rect-rounded:0.2.0-alpha'
compile 'com.github.giaquino.Pastel:pastel-buttons-rect-oval:0.2.0-alpha'
```

## License
```
Copyright 2017 Gian Darren Azriel Aquino

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
