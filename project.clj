(defproject jclemenson/lobos "1.0.2-SNAPSHOT"
  :description
  "A library to create and manipulate SQL database schemas. Forked from http://github.com/siscia/lobos."
  :url "http://github.com/jclemenson/lobos"
  :license {:name "Eclipse Public License"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [org.clojure/tools.macro "0.1.2"]]
  :profiles {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :dev
             {:dependencies
              [[lein-clojars "0.7.0"]
               [lein-marginalia "0.6.1"]
               [lein-multi "1.1.0"]
               [cljss "0.1.1"]
               [hiccup "0.3.1"]
               [com.h2database/h2 "1.3.160"]
               [postgresql/postgresql "8.4-702.jdbc4"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.3"]}
  :jar-exclusions [#"www.clj" #"config.clj" #"migrations.clj"]
  :min-lein-version "2.0.0")
