import random

def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]

        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j+1] = key

    return arr


if __name__ == "__main__":
    test = random.sample(range(1, 100), 10)

    test = insertion_sort(test)

    print(test)