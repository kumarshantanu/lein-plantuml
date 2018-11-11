(ns ^{:author "Vladislav Bauer"}
  leiningen.plantuml
  (:require [lein-plantuml.core :as core]))


; External API: Leiningen tasks

(defn plantuml
  "Generate UML diagrams using PluntUML.

  Available file formats:
    - eps - Encapsulated PostScript format
    - svg - Scalable Vector Graphics format
    - png - Portable Network Graphics format
    - txt, utxt - Text file format
    - pdf - Portable Document Format

  Usage:
    lein plantuml <source folder> [<file format>] [<output folder>]"

; Unsupported formats:
;   - mjpeg - MJPEG format
;   - html, html5 - HTML documents

  [project & args]
  (core/plantuml project args))
