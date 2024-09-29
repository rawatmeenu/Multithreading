# Multithreading
it is a process to execute multiple threads simultaneously.
multiprocessind & Multithreading used to achieve multitasking.
prefer M.T. oevr M.P. bcz it used shared memory area & context switching b/w threads takes less time than process. Threads are independent: so it doesn't affect other threads if an exception occurs in a single thread. and perform multiple operations at the same time. It doesn't block the user. 

# Multitasking
Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:
## Process-based Multitasking (Multiprocessing) : Each process has an address in memory. In other words, each process allocates a separate memory area. A process is heavyweight.Cost of communication between the process is high. Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
## Thread-based Multitasking (Multithreading): share the same address space. A thread is lightweight. Cost of communication between the thread is low.
