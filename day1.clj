(use 'clojure.java.io)

(defn part1 [fileName]
  (with-open [rdr (reader fileName)]
    (reduce + 
      (map #(Integer/parseInt %) (line-seq rdr)))))

(part1 "input/day1.txt")

(comment
  (defn part2 [fileName]
    (with-open [rdr (reader fileName)]
      (let [inputs (map #(Integer/parseInt %) (line-seq rdr))]
))))
