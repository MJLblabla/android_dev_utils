
通用工具类封装库，不包含业务

#dialog相关util MultiDialogSynchronization

dialog异步获取数据，同步按序展示dialog工具

使用方法：
 * 1：调用init方法传入需要初始化的dialog的size
外部从0...size -1定义对应的globalIndex用于唯一定位dialog的Key
 * 2：外部获取到数据，解析之后判断可以显示dialog时，调用
public void onShow(int globalIndex, IDialogShower dialogShower)传递给工具，让工具判断是否立刻显示
 * 3：对于每个dialog，在无法显示dialog的任何场景以及dialog显示逻辑执行完毕需要销毁时，调用
public void onFinished(int globalIndex)告诉工具清除该dialog的相关控制


#属性动画工具类AnimatorBuilder

 * 属性动画工具类，支持多个动画同时播放，支持每个动画设置时间或者整体设置时间
 * 每个动画可以通过拿到自己的ObjectAnimator自定义操作
 * 动画组可以通过Builder控制AnimatorSet和animatorSetBuilder的行为

使用方法:
 * 1:使用AnimatorBuilder.playFloat(使用默认的Animator)或play(支持自定义Animator)开启一个AnimatorSet
 * 2：需要同时播放的动画，使用withFloat(使用默认的Animator)或with(支持自定义Animator)，进行同时播放
 * 3：需要连续播放的动画，使用thenFloat或then进行
 * 4：调用addAnimatorListener添加监听，setDuration设置时间，start方法开始动画





