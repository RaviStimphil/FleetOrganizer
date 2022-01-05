package fleetorganizer;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * This class models an array-list-based min binary heap that implements the 
 * HeapAPI interface. The array holds objects that implement the 
 * parameterized Comparable interface.
 * @author Duncan, YOUR NAME
 * @see HeapAPI
 * @param <E> the heap element type. 
 * <pre>
 * Date: 99-99-9999
 * CSC 3102 Programming Project # 1
 * Instructor: Dr. Duncan 
 *
 * DO NOT REMOVE THIS NOTICE (GNU GPL V2):
 * Contact Information: duncanw@lsu.edu
 * Copyright (c) 2020 William E. Duncan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>
 * </pre>
 */
public class Heap<E extends Comparable<E>> implements HeapAPI<E>
{    
   /**
    * A complete tree stored in an array list representing this 
    * binary heap
    */
   private ArrayList<E> tree;
   /**
    * A comparator lambda function that compares two elements of this
    * heap when rebuilding it; cmp.compare(x,y) gives 1. negative when x less than y
    * 2. positive when x greater than y 3. 0 when x equal y
    */   
   private Comparator<? super E> cmp;
   
   /**
    * Constructs an empty heap using the compareTo method of its data type as the 
    * comparator
    */
   public Heap()
   {
      //implement this method

   }
   
   /**
    * A parameterized constructor that uses an externally defined comparator    
    * @param fn - a trichotomous integer value comparator function   
    */
   public Heap(Comparator<? super E> fn)
   {
	   
   }

   @Override
   public boolean isEmpty()
   {
      // implement this method
      return false;
   }

   @Override
   public void insert(E obj)
   {
      //implement this method

   }

   @Override
   public E remove() throws HeapException
   {
      
      return null;
   }
 
   @Override
   public E peek() throws HeapException
   {
      //implement this method
      return null;
   }

   @Override
   public int size()
   {
      //implement this method
      return 0;
   }
   
   /**
    * Swaps a parent and child elements of this heap at the specified indices
    * @param place an index of the child element on this heap
    * @param parent an index of the parent element on this heap
    */
   private void swap(int place, int parent)
   {
      //implement this method
   }

   /**
    * Rebuilds the heap to ensure that the heap property of the tree is preserved.
    * @param root the root index of the subtree to be rebuilt
    */
   private void rebuild(int root)
   {
      //implement this method
   }
}
