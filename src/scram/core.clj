(ns scram.core
  (:use clojure-csv.core))

(defn shuffle-columns [rows]
  (let [cols             (apply map vector rows)
        shuffled-columns (shuffle cols)
        shuffled-rows    (apply map vector shuffled-columns)]
    shuffled-rows))

(defn -main [& csv-files]
  (doseq [csv-file csv-files]
    (let [rows             (parse-csv (slurp csv-file))
          headers          (first rows)
          shuffled-rows    (shuffle-columns rows)
          shuffled-headers (first shuffled-rows)
          new-file         (str csv-file ".shuffled")]
      (spit new-file (write-csv shuffled-rows))
      (println "[" csv-file "] >" headers "->" shuffled-headers "> [" new-file "]"))))
