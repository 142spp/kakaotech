def do_fizzbuzz(num:int):
    """
    fizzbuz: print fizz buzz fizzbuzz
    3: fizz
    5: buzz
    15: fizzbuzz
    etc: num
    """
    print('hello')
    for i in range(1,num+1):
        if i % 3 == 0:
            print('fizz')
        else :
            print(f'{i}')



if __name__ == '__main__':
    do_fizzbuzz(16)

