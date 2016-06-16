(require '[cljs.build.api :as cljs])

(def compiler-options {:output-to "compiled.js"
                       :source-map "compiled.js.map"
                       :output-dir "out"
                       :optimizations :simple})

(cljs/build "cljs" compiler-options)
