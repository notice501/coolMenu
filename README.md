# coolMenu
The Android implementation of [Cards Menu Concept](https://dribbble.com/shots/2389505-Cards-Menu-Concept) by [Gal Shir](https://dribbble.com/galshir).

This is Gal Shir's awesome shot.
![](https://d13yacurqjgara.cloudfront.net/users/729829/screenshots/2389505/menu.gif)

## Usage
I published the library with [Jitpack](https://jitpack.io), so add it to your build.gradle with:
```gradle
repositories {
    ...
    maven { url "https://jitpack.io" }
}
```

Add the dependency:
```gradle
dependencies {
	compile 'com.github.DxTT:coolMenu:v1.1'
}
```

The usage is really like `ViewPager`, just add `CoolMenuFrameLayout` to your layout.

An example of basic usage in layout.xml:

```xml
<?xml version="1.0" encoding="utf-8"?>
<merge
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.foocoder.coolmenu.MainActivity"
    tools:ignore="all"
    tools:showIn="@layout/activity_main">

    <com.dxtt.coolmenu.CoolMenuFrameLayout
        android:id="@+id/rl_main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center"
        app:num="four"/>
</merge>
```

This statement declares the number of cards, The upper limit is five.
```xml
app:num="four"
```
You can set your title icon or title style in xml like this:
```xml
app:titleSize="@dimen/cl_title_size"
app:titleColor="@color/colorPrimary"
app:titleIcon="@drawable/menu"
```

Like `ViewPager`,set an Adapter for the `CoolMenuFrameLayout` view.
```java
coolMenuFrameLayout = $(R.id.rl_main);
String[] titles = {"CONTACT", "ABOUT", "TEAM", "PROJECTS"};
titleList = Arrays.asList(titles);
//set your titles,which is optional
coolMenuFrameLayout.setTitles(titleList);
//set your menu icon
coolMenuFrameLayout.setMenuIcon(R.drawable.menu2);

fragments.add(new Fragment1());
fragments.add(new Fragment2());
fragments.add(new Fragment3());
fragments.add(new Fragment4());

FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
		return fragments.size();
    }
};
coolMenuFrameLayout.setAdapter(adapter);
```

## Contributors
[@xuechister](https://github.com/xuechister),[@foocoder](https://github.com/notice501)

## License
`coolMenu` is available under the MIT license
