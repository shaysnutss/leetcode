def find_sum_of_three(nums, target):
    # Replace this placeholder return statement with your code

    nums.sort()

    start_index = 0
    index_store = len(nums) - 1
    end_index = index_store - 1

    while index_store >= 2:

        temp_sum = nums[start_index] + nums[end_index] + nums[index_store]
        if temp_sum  == target:
            return True
        elif temp_sum > target:
            end_index = end_index - 1
        elif temp_sum < target :
            start_index = start_index + 1
        
        if start_index >= end_index:
            index_store = index_store - 1
            start_index = 0
            end_index = index_store - 1

    return False;


def main():
    # Example usage:
    nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    target = 15
    result = find_sum_of_three(nums, target)
    if result:
        print("There exists a triplet in the array that sums up to the target value.")
    else:
        print("No such triplet exists in the array.")

    # You can test the function with other inputs as well.
    nums2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    target2 = 16
    result2 = find_sum_of_three(nums2, target2)
    if result2:
        print("There exists a triplet in the array that sums up to the target value.")
    else:
        print("No such triplet exists in the array.")

if __name__ == "__main__":
    main()