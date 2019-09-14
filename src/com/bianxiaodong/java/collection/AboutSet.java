package com.bianxiaodong.java.collection;

public class AboutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set知识点总结 无序集合 元素不可重复
		
		// Set是一个不允许包含相同元素的集合
		// HashSet不保证元素排列顺序，元素可以为null，有很好的存取性能 (添加，查询最好)
		// LinkedHashSet按照元素插入顺序进行保存，以链表方式维护元素顺序 (普通插入删除比HashSet略慢，但是遍历很快)
		// TreeSet确保集合元素处于排序状态，SortedSet的实现类 (需要维护集合元素顺序时最好)
		// EnumSet已枚举值定义排序，不允许null元素 (性能最好)
		
		// HashSet, LinkedHashSet, TreeSet, EnumSet都是线程不安全的
	}

}
