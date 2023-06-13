const { createProxyMiddleware } = require("http-proxy-middleware");

module.exports = (app) => {
    app.use(
        createProxyMiddleware('/api/v1', {
            target : "http://localhost:8080",
            changeOrigin : true
        })
    );

    app.use(
        createProxyMiddleware("/api/v2/proxy", {
            target : "http://localhost:8080",
            changeOrigin : true
        })
    );


}