# Multithreading
it is a process to execute multiple threads simultaneously.
multiprocessind & Multithreading used to achieve multitasking.
prefer M.T. oevr M.P. bcz it used shared memory area & context switching b/w threads takes less time than process. Threads are independent: so it doesn't affect other threads if an exception occurs in a single thread. and perform multiple operations at the same time. It doesn't block the user. 

# Multitasking
Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:
Process-based Multitasking (Multiprocessing) : Each process has an address in memory. In other words, each process allocates a separate memory area. A process is heavyweight.Cost of communication between the process is high. Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
Thread-based Multitasking (Multithreading): share the same address space. A thread is lightweight. Cost of communication between the thread is low.

** Theas executes inside a process. an OS has multiple process and a process can have multiple threads. but at a time only one thread will be executed only.

## Life Cycle of Thread:
1. New : when thread is created. not run yet.
2. Active : thread invokes start() method. two states(Runnable( the thread may be running or may be ready to run at any given instant of time.) & Running(hen the thread gets the CPU, it moves from the runnable to the running state.))
3. Blocked/waiting: Whenever a thread is inactive for a span of time (not permanently) then, either the thread is in the blocked state or is in the waiting state. When the main thread invokes the join() method then, it is said that the main thread is in the waiting state. The main thread then waits for the child threads to complete their tasks. When the child threads complete their job, a notification is sent to the main thread, which again moves the thread from waiting to the active state.
4. timed waiting: hread lies in the waiting state for a specific span of time, and not forever. 
5. terminate: A thread reaches the termination state. When a thread has finished its job OR caught unhandled exception.

## TWOWAYS TO CREATE A THREAD:
1. implementing Runnable interface. :  Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Thread class extends Object class and implements Runnable interface.
2. by extending Thread class. : provides constructors & methods to perform operations on thread.

## THREAD SCHEDULER
A component of Java that decides which thread to run or execute and which thread to wait
if there is more than one thread in the runnable state, it is up to the thread scheduler to pick one of the threads and ignore the other ones. 
There are two factors for scheduling a thread i.e. Priority and Time of arrival.
Priority: Priority of each thread lies between 1 to 10. If a thread has a higher priority, it means that thread has got a better chance of getting picked up by the thread scheduler.
Time of Arrival: Suppose two threads of the same priority enter the runnable state, Thread arrives foirst will get the priority first.
The thread scheduler selects the thread that has the highest priority, and the thread begins the execution of the job. If a thread is already in runnable state and another thread (that has higher priority) reaches in the runnable state, then the current thread is pre-empted from the processor, and the arrived thread with higher priority gets the CPU time. When two threads (Thread 2 and Thread 3) having the same priorities and arrival time, the scheduling will be decided on the basis of FCFS algorithm. Thus, the thread that arrives first gets the opportunity to execute first.

## Thread.sleep() : 
sleep() is being used to halt the working of a thread for a given amount of time.
there are 2 variant of sleep(). First one accepts only an arguments, whereas the other variant accepts two arguments.
public static void sleep(long mls) throws InterruptedException   
public static void sleep(long mls, int n) throws InterruptedException   

