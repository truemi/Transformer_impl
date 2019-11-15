# Transformer_impl
ViewPager.PageTransformer的一些基本实现类,以及简单封装,提供了基本的动画,包括渐变,缩放,层叠,3D旋转等.

#### 点击标题查看源码
#### [3D水平旋转](https://github.com/truemi/Transformer_impl/blob/master/app/src/main/java/com/truemi/transformaer/transformerLib/PageTransformer3D.java)
![3d.gif](https://upload-images.jianshu.io/upload_images/4593470-4653b79f38dc5f5d.gif?imageMogr2/auto-orient/strip)
#### [3D水平旋转(内部视角)](https://github.com/truemi/Transformer_impl/blob/master/app/src/main/java/com/truemi/transformaer/transformerLib/PageTransformer3DInTo.java)
![3din.gif](https://upload-images.jianshu.io/upload_images/4593470-6fe949a6c9acdac9.gif?imageMogr2/auto-orient/strip)
#### [渐变](https://github.com/truemi/Transformer_impl/blob/master/app/src/main/java/com/truemi/transformaer/transformerLib/PageTransformerFadeIn.java)
![fadein.gif](https://upload-images.jianshu.io/upload_images/4593470-38198818d7970801.gif?imageMogr2/auto-orient/strip)
#### [缩放](https://github.com/truemi/Transformer_impl/blob/master/app/src/main/java/com/truemi/transformaer/transformerLib/PageTransformerTandem.java)
![scale.gif](https://upload-images.jianshu.io/upload_images/4593470-5f974d2cc5ea3b26.gif?imageMogr2/auto-orient/strip)
#### [层叠](https://github.com/truemi/Transformer_impl/blob/master/app/src/main/java/com/truemi/transformaer/transformerLib/PageTransformerOverlap.java)
![overlap.gif](https://upload-images.jianshu.io/upload_images/4593470-63a138d6d0e8e4c2.gif?imageMogr2/auto-orient/strip)

如果需要使用,将transformerLib包下的相关源码放入自己的项目中(不需要的效果可以删除),使用` viewpager.setPageTransformer(true, MyTransformer.getMyTransformer(TransType.H3D));`设置即可.