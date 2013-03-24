(ns basic.palindrome)
(require '[clojure.string :as str])

(defn palindrome-number? [n]
  (let [as-string (str n)]
    (= as-string (str/reverse as-string))))

(defn largest-palindrome-less-than [n]
  (first (filter palindrome-number? (range n 1 -1))))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn factors-range [num-digits]
  (range (dec (exp 10 num-digits)) (exp 10 (dec num-digits)) -1))

(defn next-factor
  ([a b] (map (fn [x] [a x]) (range b (dec a) -1))))

(defn all-factors [num-digits]
  (let
    [factors (factors-range num-digits)
     highest-factor (first factors)]
      (map (fn [x] (next-factor x highest-factor)) factors)

    ))