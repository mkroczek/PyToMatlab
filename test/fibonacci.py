def fib(n):
    if n == 1 or n==2:
        return 1
    elif n > 2:
        current = 1
        previous = 1
        i = 2
        while i < n:
            tmp = current+previous
            previous = current
            current = tmp
            i+=1
        return current
    else:
        return -1

wynik = fib(3)
print(wynik)
