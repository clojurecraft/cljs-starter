(ns demo.ui
 (:require
    [reagent.core :as r]))

(defonce state (r/atom {:counter 1}))

(defn app-view []
  [:div
   [:h1 "Hello World!"]
   (:counter @state)
   [:button {:on-click (fn []
                         (swap! state update :counter inc))}
    "+1"]])

#_(js/alert "yo")
#_(+ 1 2)
