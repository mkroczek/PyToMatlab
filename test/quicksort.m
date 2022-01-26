A=[4,7,1,12,3,8,4,5,11]
T=[3,6,3,9,11,29,47,23,0,90,43,21,11,31,42,65]
A=quicksort(A,0,length(A)-1)
T=quicksort(T,0,length(T)-1)
disp(A)
disp(T)

function res=quicksort(A,p,k)
	if p>=k
		res=A
	else 
		pivot=A(k+1)
		i=p-1
		j=p
		while j<k
			if A(j+1)<=pivot
				i=i+1
				tmp=A(j+1)
				A(j+1)=A(i+1)
				A(i+1)=tmp
			end
			j=j+1
		end
		tmp=A(k+1)
		A(k+1)=A(i+1+1)
		A(i+1+1)=tmp
		pivot=i+1
		A=quicksort(A,p,pivot-1)
		A=quicksort(A,pivot+1,k)
		res=A
	end
end
