(ns ocr-middle.functionalities-by-url
  (:require [ocr-middle.functionalities :as omfns]
            [ocr-middle.request-urls :as omrurls]
            [common-middle.functionalities-by-url :as fns-by-url]))

(defn bind-specific-functionalities-by-url
  "Adds specific CRUD functionalities beside the common ones"
  []
  (swap!
    fns-by-url/read-functionalities
    conj
    omfns/document-read)
  (swap!
    fns-by-url/update-functionalities
    conj
    omfns/document-update)
  (swap!
    fns-by-url/create-functionalities
    conj
    omfns/document-create)
  (swap!
    fns-by-url/delete-functionalities
    conj
    omfns/document-delete))

(defmethod fns-by-url/get-functionalities-by-url
  omrurls/save-sign-url
  [url]
  omfns/save-sign)

(defmethod fns-by-url/get-functionalities-by-url
  omrurls/save-parameters-url
  [url]
  omfns/save-parameters)

(defmethod fns-by-url/get-functionalities-by-url
  omrurls/read-image-ws-url
  [url]
  omfns/read-image)

(defmethod fns-by-url/get-functionalities-by-url
  omrurls/process-images-ws-url
  [url]
  omfns/process-images)

