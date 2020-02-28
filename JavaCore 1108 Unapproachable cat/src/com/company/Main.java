package com.company;

/*

1108 Unapproachable cat
Hide all internal variables of the Cat class, as well as methods that allow you to change the internal state of objects of the Cat class.

Requirements:
1. The Cat variable name must be hidden.
2. The age variable of the Cat class must be hidden.
3. The weight variable of the Cat class must be hidden.
4. The getName getter must be public.
5. The setName setter must be private.
6. The getAge getter must be public.
7. The setAge setter must be private.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}



















