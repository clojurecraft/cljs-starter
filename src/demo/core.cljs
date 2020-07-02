(ns demo.core)

(defn greeting []
  (str "hello " (rand-nth ["world" "clojure" "clojurescript" "you"])))

#_(+ 1 2)

#_(greeting)

#_(println (greeting))

#_(js/alert (greeting))



