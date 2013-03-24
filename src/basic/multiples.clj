(ns basic.multiples)

(defn multiple-of? [divisor]
  (fn [number] (= 0 (mod number divisor))))

(defn apply-all-divisors [divisors, n]
 (map (fn [divisor] ((multiple-of? divisor) n)) divisors))

(defn factor? [divisors]
  (fn [n] (some true? (apply-all-divisors divisors, n))))

(defn multiples-of [divisors]
  (fn [collection]
    (filter (factor? divisors) collection)))

(defn sum-divisors-below [max divisors]
  (reduce + ((multiples-of divisors) (range 1 max))))

