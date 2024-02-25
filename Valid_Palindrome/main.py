def is_palindrome(s):
      # Write your code here
  # Tip: You may use the code template provided
  # in the two_pointers.py file
  start = 0
  end = len(s) -1
  while start <= end:
    if s[start] == s[end]:
      if (start == end) or (start + 1 == end):
        return True
        break
      start = start  + 1
      end = end - 1
    else:
      return False


#TO RUN: CHANGE s TO THE STRING YOU WANT TO TEST.

def main():
    #s = input("Enter a string: ")
    if is_palindrome("ABCDABCD"):
        print("The string is a palindrome.")
    else:
        print("The string is not a palindrome.")

if __name__ == "__main__":
    main()
