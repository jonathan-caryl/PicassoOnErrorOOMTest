# PicassoOnErrorOOMTest
A Simple Android app to show Picasso triggering an OutOfMemoryError from ImageViewAction.error

Rotating the device deliberately leaks MainActivity, so after a few rotations hit the error case.

![image](picasso_oom_screenshot.png)