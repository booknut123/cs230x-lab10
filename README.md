[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/o18CD0pv)
# CS230X-lab10-F24
# Decision Trees


##  Set up
Examine the contents of the **TreeDriver** class and run it to see what it produces.
Take a minute to arrange the classes within the javafoundations, on the project window of BlueJ in a meaningful way, to help you identify the relationships among those classes.

## Task 0: The BinaryTree Interface
Study the **BinaryTree Interface** given in the downloaded javafoundations.

Today we will use the **LinkedBinaryTree** implementation of this Interface.
Here are the available constructors for a LinkedBinaryTree object:

1. `public LinkedBinaryTree ()` //creates an empty Binary Tree
2. `public LinkedBinaryTree (T element)` // creates a Binary Tree of only one element at its root
3. `public LinkedBinaryTree (T element, LinkedBinaryTree<T> left, LinkedBinaryTree<T> right)` //Creates a binary tree with the specified element at its root and two subtrees.


## Task 1:  Create a BinaryTree on Paper
Think about the way to build a tree of half a dozen elements, and even more.
We recommend that you first draw your tree on a piece of paper, and then you write the lines of code to construct it. 

Decision trees are a natural fit to arrange
information that is related by simple YES or NO responses.  Your task
is to write a simple "expert system".

## Task 2: Construct the Decision Tree
Now edit the provided Driver program, named **TreeDriver**,  to
construct a few **LinkedBinaryTree** instances using the constructor(s) and methods available
in the **BinaryTree** Interface. Three sample trees are provided here.
A couple of trees with only one element each, and a third tree which build on top of the first two.
Observe how a tree is build from the leaves up!

In terms of code, answering the Yes/No questions effectively guides the user's path from the root of the tree to the leaf node containing the answer.

### Task2B: Query the Decision Tree
Add a method, **promptUser()**, to traverse the tree based on the user's answers (using a Scanner).


## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting TreeDriver.java to your Gradescope account for Lab10. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 
