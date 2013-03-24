(ns basic.palindrome-test
  (:use clojure.test
        basic.palindrome))

(deftest palindrome-finding
  (testing "palindrome-number?"
    (is (palindrome-number? 1))
    (is (palindrome-number? 11))
    (is (palindrome-number? 101))
    (is (not (palindrome-number? 12)))
    (is (not (palindrome-number? 123))))
  (testing "largest palindrome less than")
    (is (= 9009 (largest-palindrome-less-than 9010)))
    (is (= 88 (largest-palindrome-less-than 93)))
  ;(testing "multiples of n digit numbers"
    ;(is (= (range 99 1 -1) (reverse-multiples-of-magnitude 2))))
  )


(deftest factoring-range
  (testing ""
    (is (= (range 9 1 -1) (factors-range 1)))
    ))

;(deftest blah
;  (testing ""
;    (is (= '([99 99] [98 99] [98 98] [97 99] [97 98] [97 97]) (take 5 (all-factors 2))))
;    (is (= '([99 99]) (next-factor 99 99)))
;    (is (= '([98 99] [98 98]) (next-factor 98 99)))
;    (is (= '([97 99] [97 98] [97 97]) (next-factor 97 99)))
;      ))



