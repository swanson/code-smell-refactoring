# Method chains

"You see message chains when a client asks one object for another object, which the client then asks for yet another object, which the client then asks for yet another another object, and so on"

# Why could this be bad?

You are coupled to the structure of the data, if a "link" in the middle changes - you have to make changes downstream

# How can I fix it?

Use Hide Delegate to reduce your dependency on the "how"

---

Run the specs and make sure they pass

```shell
ruby invoice_spec.rb
```
