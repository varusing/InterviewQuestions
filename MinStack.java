{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf100
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red0\green0\blue192;\red106\green62\blue62;
\red42\green0\blue255;}
{\*\expandedcolortbl;;\csgenericrgb\c49804\c0\c33333;\csgenericrgb\c0\c0\c75294;\csgenericrgb\c41569\c24314\c24314;
\csgenericrgb\c16471\c0\c100000;}
\paperw11900\paperh16840\margl1440\margr1440\vieww33400\viewh17860\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs22 \cf2 import\cf0  java.util.Stack;\
\
\cf2 public\cf0  \cf2 class\cf0  MinStack \{\
	\
	Stack<Integer> \cf3 stack\cf0  = \cf2 new\cf0  Stack<Integer>();\
	Stack<Integer> \cf3 minStack\cf0  = \cf2 new\cf0  Stack<Integer>();\
	\
	\
	\cf2 public\cf0  \cf2 void\cf0  push(\cf2 int\cf0  \cf4 x\cf0 )\{\
		\cf3 stack\cf0 .push(\cf4 x\cf0 );\
		\cf2 if\cf0  (\cf3 minStack\cf0 .isEmpty() || \cf4 x\cf0  <= \cf3 minStack\cf0 .peek())\{\
			\cf3 minStack\cf0 .push(\cf4 x\cf0 );\
		\}\
	\}\
	\
	\cf2 public\cf0  \cf2 void\cf0  pop()\{\
		\
		\cf2 if\cf0  (\cf3 minStack\cf0 .peek() == \cf3 stack\cf0 .peek())\{\
			\cf3 minStack\cf0 .pop();\
		\}\
		\cf3 stack\cf0 .pop();\
	\}\
	\
	\cf2 public\cf0  \cf2 int\cf0  top()\{\
		\cf2 return\cf0  \cf3 stack\cf0 .peek();\
	\}\
	\
	\cf2 public\cf0  \cf2 int\cf0  min()\{\
		\cf2 return\cf0  \cf3 minStack\cf0 .peek();\
	\}\
	\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main(String \cf4 args\cf0 [])\{\
		\
		MinStack \cf4 obj\cf0  = \cf2 new\cf0  MinStack();\
		\cf4 obj\cf0 .push(1);\
		\cf4 obj\cf0 .push(2);\
		\cf4 obj\cf0 .push(3);\
		\
		\cf2 int\cf0  \cf4 top\cf0  = \cf4 obj\cf0 .top();\
		\cf2 int\cf0  \cf4 min\cf0  = \cf4 obj\cf0 .min();\
		\
		System.\cf3 out\cf0 .print(\cf5 "Top Element is "\cf0  + \cf4 top\cf0 );\
		System.\cf3 out\cf0 .print(\cf5 "Min Element is "\cf0  + \cf4 min\cf0 );\
		\
	\}\
	\
\
\}\
}