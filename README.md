# 观察者模式

## 背景
```
  用户下单时, 经常需要减库存、发送短信通知等操作。
  此时可以用观察者模式让发送短信模块和减库存模块作为下订单这个主题的观察者,
  当下订单执行完成后, 直接在主线程中通知所有观察者即可。
```

### 缺点
```
  上述这种背景在实际上的项目其实不太符合，因为在这种case下一般不会用观察者
  模式来处理，通常是会使用消息队列来异步处理，但重点在于学习观察者设计模式
```

### observer1
* 此包下的观察者是正宗的观察者设计模式, 被观察者持有观察者的引用，由在关键时刻由被观察者通知观察者。

### observer2
* 此包下的观察者符合现实中的案例, 按照现实中的观察者设计模式进行开始, 即看电影的人看到精彩部分片段后就会做一个东西(eg: 上厕所)
  这种情况下有个缺点, 观察者需要一直看电影, 会开启线程一直占用cpu, 影响性能。
  观察者拥有被观察者的引用
  
### observer3
* 此包下的观察者设计模式中, 看电影的人什么时候去上厕所由电影的剧情决定。
  但有一个缺点, 是由被观察者主动调用观察者的方法, 此时已经没有"事件"的概念,
  比如说有两个人一起看这部电影, PersonA在电影出现精彩部分的时候是要去上厕所, 但是PersonB可能在要吃爆米花,
  此时我们还需要手动调用PersonB的对应方法. 
  所以Observer3的实现方式很荣誉，而且扩展性不高, 我们需要手动定义一个"精彩部分"镜头的抽象事件模型, 由Person
  自己去做对应的事. 电影本身只需要告知Persons们，我播放到精彩部分了