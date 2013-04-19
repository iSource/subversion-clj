(defproject subversion-clj "0.2.2"
  :description "SVNKit based Subversion API for Clojure"
  :dependencies [[org.tmatesoft.svnkit/svnkit "1.7.9"]
                 [org.clojure/clojure "1.5.1"]
                 [org.apache.commons/commons-io "1.3.2"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]
                                  [com.stuartsierra/lazytest "1.2.3"]
                                  [lein-marginalia "0.7.1"]]
                   :plugins [[lein-midje "3.0.1"]
                             [lein-marginalia "0.7.1"]]}}
  :repositories {"tmatesoft" "http://maven.tmatesoft.com/content/repositories/releases/"
                 "stuartsierra-releases" "http://stuartsierra.com/maven2"}
  :aot [subversion-clj.diffs])