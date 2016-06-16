(require '[cljs.build.api :as cljs])

(def compiler-options {:output-to "compiled.js"
                       :main 'demo.main})

(cljs/build "cljs" compiler-options)
