(ns demo.core
  (:require
    [reagent.dom :as rdom]
    [demo.ui :as ui]))

(defn render! []
  (rdom/render
    [ui/app-view]
    (js/document.getElementById "app")))
