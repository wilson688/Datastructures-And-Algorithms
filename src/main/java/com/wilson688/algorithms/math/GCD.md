# GCD (Greatest Common Factor)

## Definition 

Greatest common divisor (GCD) of two or more integers, which are not all zero, is the largest positive integer that divides each of the integers.

## How to find GCD?

The GCD of three or more numbers equals the <strong>product of the prime factors common to all the numbers </strong>,
 but it can also be calculated by <strong>repeatedly taking the GCDs of pairs of numbers</strong>.

```
gcd(a, b, c) = gcd(a, gcd(b, c))
             = gcd(gcd(a, b), c)
             = gcd(gcd(a, c), b)
```