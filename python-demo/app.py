# coding=utf-8
from flask import Flask, Response
import json
import os
import socket

app = Flask(__name__)


@app.route("/")
def hello():
    html = "<h3>Hello {name}!</h3>" \
           "<b>Hostname:</b> {hostname}<br/>"
    return html.format(name=os.getenv("NAME", "world"), hostname=socket.gethostname())


# 稍后我们将解释这个接口的作用
@app.route("/health")
def health():

    return Response(json.dumps({
        "status": "UP"
    }), mimetype="application/json")


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=4000)
