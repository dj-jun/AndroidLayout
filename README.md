# AndroidLayout
## 这里有三个Android布局，分别是LinearLayout(线性布局)、RelativeLayout(相对布局)、TableLayout(表格布局)。在布局(button.xml)通过设置按钮，来实现页面的跳转。
## 步骤：先建立四个layout(.xml)文件，分别是：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/9.png)
## 然后创建四个activity(.java)文件，分别是：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/15.png)
## 最后在manifests中的application中添加以下代码：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/16.png)
### (1)LinearLayout(线性布局)
### 利用嵌套，利用orientation="vertical"来表示是线性布局垂直显示，利用orientation="horizontal"来表示是线性布局水平显示，部分代码如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/4.png)
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/5.png)
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/1.png)
### (2)RelativeLayout(相对布局)
### 通过设置控件位置的属性来布局，如：layout_alignParentTop="true"表示当前控件与父控件顶端对齐。部分代码如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/6.png)
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/7.png)
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/8.png)
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/13.png)
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/2.png)
### (3)TableLayout(表格布局)
### 通过设置TableRow的数量来决定表格的行数，表格的列数则是由包含最多控件的TableRow决定。还有设置stretchColumns属性来表示第几列被拉伸，通过View控件来设置白线。部分代码如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/10.png)
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/11.png)
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/12.png)
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/3.png)
### (4)Button
### 通过设置Button按钮来实现页面的跳转，再在MainActivity中给按钮添加监听器，监听器中的点击事件的反馈就是页面的跳转。部分代码如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/18.png)
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/17.png)
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/14.png)
