def quicksort(A,p,k):
    if p >= k:
        return A
    else:
        pivot = A[k]
        i = p-1
        j = p
        while j<k:
            if A[j]<=pivot:
                i+=1
                tmp = A[j]
                A[j] = A[i]
                A[i] = tmp
            j+=1
        tmp = A[k]
        A[k] = A[i+1]
        A[i+1] = tmp
        pivot = i+1
        A = quicksort(A,p,pivot-1)
        A = quicksort(A,pivot+1,k)
        return A

A=[4,7,1,12,3,8,4,5,11]
T=[3,6,3,9,11,29,47,23,0,90,43,21,11,31,42,65]
A = quicksort(A,0,len(A)-1)
T = quicksort(T,0,len(T)-1)
print(A)
print(T)
