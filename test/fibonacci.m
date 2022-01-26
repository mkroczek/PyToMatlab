wynik=fib(3)
disp(wynik)

function res=fib(n)
	if n==1||n==2
		res=1
	elseif n>2
		current=1
		previous=1
		i=2
		while i<n
			tmp=current+previous
			previous=current
			current=tmp
			i=i+1
		end
		res=current
	else 
		res=-1
	end
end
