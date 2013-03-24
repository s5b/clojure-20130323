(ns basic.fibonacci)

(defn fibonacci
  ([] (fibonacci 0 1))
  ([a b] (lazy-seq (cons a (fibonacci b (+ a b))))))

(defn even-fibonacci []
  (filter even? (fibonacci)))

(defn even-fibonacci-less-than [n]
  (take-while (fn [x] (< x n)) (even-fibonacci)))

(defn sum-of-even-fibonacci-less-than [n]
  (reduce + (even-fibonacci-less-than n)))
