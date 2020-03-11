{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf100
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red0\green0\blue192;\red106\green62\blue62;
\red63\green95\blue191;\red127\green127\blue159;\red42\green0\blue255;}
{\*\expandedcolortbl;;\csgenericrgb\c49804\c0\c33333;\csgenericrgb\c0\c0\c75294;\csgenericrgb\c41569\c24314\c24314;
\csgenericrgb\c24706\c37255\c74902;\csgenericrgb\c49804\c49804\c62353;\csgenericrgb\c16471\c0\c100000;}
\paperw11900\paperh16840\margl1440\margr1440\vieww33400\viewh17860\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs22 \cf2 public\cf0  \cf2 class\cf0  MyHashMap \{\
    \
    \cf2 private\cf0  \cf2 class\cf0  ListNode \{\
        \cf2 private\cf0  \cf2 int\cf0  \cf3 key\cf0 , \cf3 val\cf0 ;\
        ListNode \cf3 next\cf0 ;\
        \
        ListNode(\cf2 int\cf0  \cf4 key\cf0 , \cf2 int\cf0  \cf4 val\cf0 )\{\
            \cf2 this\cf0 .\cf3 key\cf0  = \cf4 key\cf0 ;\
            \cf2 this\cf0 .\cf3 val\cf0  = \cf4 val\cf0 ;\
        \}\
    \}\
    \
    ListNode[] \cf3 hashMap\cf0  = \cf2 new\cf0  ListNode[10000000];\
    \
    \cf2 private\cf0  \cf2 int\cf0  hashFunc(\cf2 int\cf0  \cf4 key\cf0 )\{\
        \cf2 return\cf0  Integer.hashCode(\cf4 key\cf0 )%\cf3 hashMap\cf0 .\cf3 length\cf0 ;\
    \}\
    \
    \cf2 private\cf0  ListNode findElem(\cf2 int\cf0  \cf4 index\cf0 , \cf2 int\cf0  \cf4 key\cf0 )\{\
        \
        \cf2 if\cf0  (\cf3 hashMap\cf0 [\cf4 index\cf0 ] == \cf2 null\cf0 )\{\
            \cf3 hashMap\cf0 [\cf4 index\cf0 ] = \cf2 new\cf0  ListNode(-1,-1);\
            \cf2 return\cf0  \cf3 hashMap\cf0 [\cf4 index\cf0 ];\
        \} \cf2 else\cf0  \{\
            ListNode \cf4 curr\cf0  = \cf3 hashMap\cf0 [\cf4 index\cf0 ];\
            \cf2 while\cf0  (\cf4 curr\cf0 .\cf3 next\cf0 .\cf3 key\cf0  != \cf4 key\cf0 )\{\
                \cf4 curr\cf0  = \cf4 curr\cf0 .\cf3 next\cf0 ;\
            \}\
            \cf2 return\cf0  \cf4 curr\cf0 ;\
        \}\
    \}\
\
    \cf5 /** Initialize your data structure here. */\cf0 \
    \cf2 public\cf0  MyHashMap() \{\
        \
    \}\
    \
    \cf5 /** value will always be non\cf6 -\cf5 negative. */\cf0 \
    \cf2 public\cf0  \cf2 void\cf0  put(\cf2 int\cf0  \cf4 key\cf0 , \cf2 int\cf0  \cf4 value\cf0 ) \{\
        \
        \cf2 int\cf0  \cf4 index\cf0  = hashFunc(\cf4 key\cf0 );\
        ListNode \cf4 prev\cf0  = findElem(\cf4 index\cf0 ,\cf4 key\cf0 );\
        \
        \cf2 if\cf0  (\cf4 prev\cf0 .\cf3 next\cf0  != \cf2 null\cf0 )\{\
            \cf4 prev\cf0 .\cf3 next\cf0 .\cf3 val\cf0  = \cf4 value\cf0 ;\
        \} \cf2 else\cf0  \{\
            \cf4 prev\cf0 .\cf3 next\cf0  = \cf2 new\cf0  ListNode(\cf4 key\cf0 ,\cf4 value\cf0 );\
        \}\
    \}\
    \
    \cf5 /** Returns the value to which the specified key is mapped, or \cf6 -\cf5 1 if this map contains no mapping for the key */\cf0 \
    \cf2 public\cf0  \cf2 int\cf0  get(\cf2 int\cf0  \cf4 key\cf0 ) \{\
        \cf2 int\cf0  \cf4 index\cf0  = hashFunc(\cf4 key\cf0 );\
        ListNode \cf4 prev\cf0  = findElem(\cf4 index\cf0 ,\cf4 key\cf0 );\
        \
        \cf2 if\cf0  (\cf4 prev\cf0 .\cf3 next\cf0  != \cf2 null\cf0 )\{\
            \cf2 return\cf0  \cf4 prev\cf0 .\cf3 next\cf0 .\cf3 val\cf0 ;\
        \}\cf2 else\cf0  \{\
            \cf2 return\cf0  -1;\
        \}\
    \}\
    \
    \cf5 /** Removes the mapping of the specified value key if this map contains a mapping for the key */\cf0 \
    \cf2 public\cf0  \cf2 void\cf0  remove(\cf2 int\cf0  \cf4 key\cf0 ) \{\
        \cf2 int\cf0  \cf4 index\cf0  = hashFunc(\cf4 key\cf0 );\
        ListNode \cf4 prev\cf0  = findElem(\cf4 index\cf0 ,\cf4 key\cf0 );\
        \
        \cf2 if\cf0  (\cf4 prev\cf0 .\cf3 next\cf0  == \cf2 null\cf0 )\{\
        	System.\cf3 out\cf0 .println(\cf7 "******Element not found*******"\cf0 );\
            \cf2 return\cf0 ;\
        \} \cf2 else\cf0  \{\
            \cf4 prev\cf0 .\cf3 next\cf0  = \cf4 prev\cf0 .\cf3 next\cf0 .\cf3 next\cf0 ;\
        \}\
    \}\
    \
    \cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main (String[] \cf4 args\cf0 )\{\
    	MyHashMap \cf4 obj\cf0  = \cf2 new\cf0  MyHashMap();\
    	\cf4 obj\cf0 .put(2,5);\
    	\cf4 obj\cf0 .put(4,5);\
    	System.\cf3 out\cf0 .println(\cf7 "******"\cf0 + \cf4 obj\cf0 .get(2));\
    	\cf4 obj\cf0 .remove(2);\
    \}\
\}\
\
\pard\pardeftab720\partightenfactor0
\cf5 /**\cf0 \
\cf5  * Your MyHashMap object will be instantiated and called as such:\cf0 \
\cf5  * MyHashMap \ul obj\ulnone  = new MyHashMap();\cf0 \
\cf5  * obj.put(key,value);\cf0 \
\cf5  * \ul int\ulnone  param_2 = obj.get(key);\cf0 \
\cf5  * obj.remove(key);\cf0 \
\cf5  */\cf0 \
}