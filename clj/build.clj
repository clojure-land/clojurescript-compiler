(require '[cljs.build.api :as cljs])

(def compiler-options {:output-to "compiled.js"})

(cljs/build "cljs" compiler-options)
