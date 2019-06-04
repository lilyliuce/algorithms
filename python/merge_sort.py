import math
import random


def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2

        left_arr = arr[:mid]
        right_arr = arr[mid:]

        merge_sort(left_arr)
        merge_sort(right_arr)

        left_arr.append(math.inf)
        right_arr.append(math.inf)

        i = 0
        j = 0

        for k in range(0, len(arr)):
            if left_arr[i] < right_arr[j]:
                arr[k] = left_arr[i]
                i = i + 1
            else:
                arr[k] = right_arr[j]
                j = j + 1

#    return arr


if __name__ == "__main__":
    test = random.sample(range(1, 100), 10)

 #   test = 

    merge_sort(test)

    print(test)
