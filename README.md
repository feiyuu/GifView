# GifView
继承view，自定义播放gif控件，商用级

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.feiyuu:GifView:Tag'
	}


使用代码：

        GifView gif_view = findViewById(R.id.gif_view);

        gif_view.setGifResource(R.mipmap.demo1);
        gif_view.play();
	

内部有锁屏监听，回到桌面监听，以及失去焦点监听，做了暂停继续处理。
