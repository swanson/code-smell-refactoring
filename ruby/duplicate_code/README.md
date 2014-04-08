# Duplicate code

"If you see the same code structure in more than one place, you can be sure that your program will be better if you find a way to unify them."

# Why could this be bad?

Duplicate code can indicate that you are doing the same thing in multiple places. If you make a change in
one place, you need to remember to change all of the other occurrences.

# How can I fix it?

Use the Extract Method refactoring to commonize the duplicate code.

---

Run the specs and make sure they pass

```shell
ruby account_spec.rb
```
