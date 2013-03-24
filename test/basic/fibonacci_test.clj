(ns basic.fibonacci-test
  (:use clojure.test
        basic.fibonacci))

(deftest fibonacci-numbers
  (testing "Sequence"
    (is (= '(0 1 1 2 3 5 8) (take 7 (fibonacci)))))
  (testing "Even Fibonnacis")
    (is (= '(0 2 8 34) (take 4 (even-fibonacci))))
  (testing "Even fibonaccis less than"
    (is (= 144 (last (even-fibonacci-less-than 145)))))
  (testing "Sum even fibonaccis less than"
    (is (= 188 (sum-of-even-fibonacci-less-than 145))))
    (is (= 4613732 (sum-of-even-fibonacci-less-than 4e6))))



