# AndroidLayout
## 这里有三个Android布局，分别是LinearLayout(线性布局)、RelativeLayout(相对布局)、TableLayout(表格布局)。在布局(button.xml)通过设置按钮，来实现页面的跳转。
## 步骤：先建立四个layout(.xml)文件，分别是：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/9.png)
## 然后创建四个activity(.java)文件，分别是：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/15.png)
## 最后在manifests中的application标签中添加以下代码：
        <activity
            android:name=".LinearLayoutActivity">
        </activity>
        <activity
            android:name=".RelativeLayoutActivity">
        </activity>
        <activity
            android:name=".TableLayoutActivity">
        </activity>
### (1)LinearLayout(线性布局)
### 利用嵌套，利用orientation="vertical"来表示是线性布局垂直显示，利用orientation="horizontal"来表示是线性布局水平显示，部分代码如下：
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <Button
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:textAllCaps="false"
                android:text="One,One"/>
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/1.png)
### (2)RelativeLayout(相对布局)
### 通过设置控件位置的属性来布局，如：layout_alignParentTop="true"表示当前控件与父控件顶端对齐。部分代码如下：
    <TextView
        android:id="@+id/red"
        android:layout_width="70dp"
        android:layout_height="70dp"
        android:text="@string/red"
        android:textSize="15sp"
        android:gravity="center"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:background="#FF0000"/>

    <TextView
        android:id="@+id/green"
        android:layout_width="70dp"
        android:layout_height="70dp"
        android:text="@string/green"
        android:textSize="15sp"
        android:gravity="center"
        android:layout_alignTop="@+id/blue"
        android:layout_toStartOf="@+id/blue"
        android:layout_marginEnd="32dp"
        android:background="#00FF00"/>

    <TextView
        android:id="@+id/blue"
        android:layout_width="70dp"
        android:layout_height="70dp"
        android:text="@string/blue"
        android:textSize="15sp"
        android:gravity="center"
        android:layout_centerInParent="true"
        android:background="#0000FF"
        android:textColor="#FFFFFF"/>

    <TextView
        android:id="@+id/violet"
        android:layout_width="match_parent"
        android:layout_height="70dp"
        android:text="@string/violet"
        android:textSize="15sp"
        android:gravity="center"
        android:layout_alignParentBottom="true"
        android:background="#EF85EF"/>
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/2.png)
### (3)TableLayout(表格布局)
### 通过设置TableRow的数量来决定表格的行数，表格的列数则是由包含最多控件的TableRow决定。还有设置stretchColumns属性来表示第几列被拉伸，通过View控件来设置白线。部分代码如下：
    <TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#000000"
        android:stretchColumns="*">
        <TableRow android:layout_height="80dp">
                <TextView
                        android:layout_height="match_parent"
                        android:text="    Open..."
                        android:textSize="15sp"
                        android:textColor="#FFFFFF"
                        android:gravity="left"/>
                <TextView
                        android:layout_height="match_parent"
                        android:text="Ctrl-O"
                        android:textSize="15sp"
                        android:textColor="#FFFFFF"
                        android:gravity="right"/>
        </TableRow>

    <View
        android:layout_height="2px"
        android:layout_width="match_parent"
        android:background="#FFFFFF">
    </View>
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/3.png)
### (4)Button
### 通过设置Button按钮来实现页面的跳转，再在MainActivity中给按钮添加监听器，监听器中的点击事件的反馈就是页面的跳转。部分代码如下：
    <Button
        android:id="@+id/btn_one"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="LinearLayout"
        android:textAllCaps="false" />

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        myBtn_one = (Button)findViewById(R.id.btn_one);
        myBtn_two = (Button)findViewById(R.id.btn_two);
        myBtn_three = (Button)findViewById(R.id.btn_three);
        myBtn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
### 结果截图如下：
![](https://github.com/dj-jun/AndroidLayout/blob/master/images/14.png)
