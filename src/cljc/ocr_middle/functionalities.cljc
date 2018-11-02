(ns ocr-middle.functionalities
  (:require [common-middle.functionalities :as fns]))

(def document-create
     "document-create")

(def document-read
     "document-read")

(def document-update
     "document-update")

(def document-delete
     "document-delete")

(def process-images
     "process-images")

(def read-image
     "read-image")

(def save-sign
     "save-sign")

(def save-parameters
     "save-parameters")

(def test-document-entity
     "test-document-entity")

(def functionalities
     (conj
       fns/functionalities
       document-create
       document-read
       document-update
       document-delete
       process-images
       read-image
       save-sign
       save-parameters
       test-document-entity))

