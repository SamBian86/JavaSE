package com.bianxiaodong.java.collection;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map知识点总结
		
		// Map保存具有映射关系的数据
		// HashMap 性能会好一点，但是线程不安全
		// Hashtable 线程安全
		// LinkedHashMap 只考虑key的双向链表，插入性能略低于HashMap，但是迭代性能好
		// Properties类是Hashtable的子类，可以用来读写属性文件
		// SortedMap接口实现类TreeMap，红黑树数据结构，根据key进行排序，可以自然排序以及定制排序
		// WeakHashMap实现类，HashMap是强引用，只要不被销毁，key对应的对象就不会销毁，WeakHashMap是弱引用，只要不被强引用引用，就可以被垃圾回收机制回收。
		// IdentityHashMap实现类，比较特别的地方是比较时需要两个key严格相等才为相等
		// EnumMap实现类，与枚举类一同使用的Map实现
		// HashSet通过hash算法控制集合大小，HashMap与Hashtable用hash算法来增加key集合的大小
	}

}
