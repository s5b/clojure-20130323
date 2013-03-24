(ns basic.multiples-test
  (:use clojure.test
        basic.multiples))

(deftest multiples-of-three-and-five
  (testing "Is a multiple of number"
    (is ((multiple-of? 3) 9))
    (is (not((multiple-of? 3) 4)))
    (is ((multiple-of? 5) 25)))
  (testing "filter a range by divisors"
    (is (= '(3 5 6 9) ((multiples-of [3 5]) (range 1 10))))))

(deftest check-sum
  (testing "Calculate sum of range divisors"
    (is (= 233168 (sum-divisors-below 1000 [3, 5])))
    (is (= 23 (sum-divisors-below 10 [3, 5])))
    (is (= [false true] (apply-all-divisors [3, 5] 10)))
    (is (= true ((factor? [3, 5]) 10)))
    ))
