# Data Clumps

"Bunches of data that hang around together really ought to be made into their own object."

# Why could this be bad?

Long parameters lists, complex method calls, no solid link between dependent data

# How can I fix it?

Use Extract Class to group clumps into an object. Look for Feature Envy.

---

Run the specs and make sure they pass

```shell
ruby customer_spec.rb
```
