# 面向对象大练习
用面向对象思想实现下面需求：
### 需求描述
1. 写一个`Person`类，要有`id`，`name`，`age`属性，靠`id`来判断是否是同一个人。要有一个`introduce`方法， `introduce`方法返回一个字符串形如：
```
My name is Tom. I am 21 years old.
```
2. 再写一个`Student`类继承`Person`类，除了`id`，`name`，`age`属性，还有要有`class`属性。也有一个`introduce`方法， `introduce`方法返回一个字符串形如：
```
My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
```
3. `Student`的`class`属性不是一个数字，而是一个对象，写一个`Class`类，有`number`属性还有一个`leader`属性。但是`leader`属性不在构造器里。
`Student`构造的时候把`Class`的一个实例传给`Student`，参见测试用例。 `Class`有一个`assignLeader`方法，接收一个`Student`实例。意为将一名学生设置为该`Class`的班长。 如果`Class`的`Leader`是`Tom`，那么`Tom`调用`introduce`的方法就要返回：
```
My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
```
如果没有就继续返回旧的字符串。
4. `Class`还有一个`appendMember`方法，接受一个`Student`实例。意为将一名学生加入该班级。 如果学生没有加入该班级，那么在调用`assignLeader`方法的时候，不会`assign`成功，会打印一句话：
```
It is not one of us.
```
相应的调用`Student`的`introduce`方法也只会返回旧的字符串
5. 再写一个`Teacher`类继承`Person`类，除了`id`，`name`，`age`属性，也有`classes`属性。也有一个`introduce`方法， `introduce`方法返回一个字符串形如：
```
My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3.
```
如果`classes`的长度为0，就会返回：
```
My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.
```
6. `Teacher`还有一个`isTeaching`方法，传入一个学生，返回`true`/`false`。只要学生在`classes`中的任一个`class`中，就是在教他。 而学生是否在`class`中这件事情，应该是`Class`有一个方法`isIn`来判断。当学生加入`Teacher`教的班级的时候，`Teacher`会打印一个句话，形如：
```
I am Tom. I know Jerry has joined Class 2.
```
当学生成为`Teacher`教的班级的班长的时候，`Teacher`会打印一句话，形如：
```
I am Tom. I know Jerry become Leader of Class 2.
```
7. 所有`Person`的子类的这段文字：
```
My name is Tom. I am 21 years old.
```
都应该调用`Person`的`introduce`方法来获得。