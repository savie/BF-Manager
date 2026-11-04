package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class UrlHttpClient {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Log f199 = LogFactory.m296(UrlHttpClient.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ClientConfiguration f200;

    public UrlHttpClient(ClientConfiguration clientConfiguration) {
        this.f200 = clientConfiguration;
        int i = TLS12SocketFactory.f197;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HttpResponse m272(HttpRequest httpRequest) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.m256().toURL().openConnection();
        ClientConfiguration clientConfiguration = this.f200;
        httpURLConnection.setConnectTimeout(clientConfiguration.m162());
        httpURLConnection.setReadTimeout(clientConfiguration.m168());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (httpRequest.m255()) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
        }
        if (httpRequest.m254() != null && !httpRequest.m254().isEmpty()) {
            for (Map.Entry entry : httpRequest.m254().entrySet()) {
                String str = (String) entry.getKey();
                if (!str.equals("Content-Length") && !str.equals("Host")) {
                    str.equals("Expect");
                    httpURLConnection.setRequestProperty(str, (String) entry.getValue());
                }
            }
        }
        httpURLConnection.setRequestMethod(httpRequest.m258());
        if (httpRequest.m252() != null && httpRequest.m257() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!httpRequest.m255()) {
                httpURLConnection.setFixedLengthStreamingMode((int) httpRequest.m257());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            InputStream inputStreamM252 = httpRequest.m252();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamM252.read(bArr);
                if (i == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i);
            }
            outputStream.flush();
            outputStream.close();
        }
        String responseMessage = httpURLConnection.getResponseMessage();
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null && !"HEAD".equals(httpRequest.m258())) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        HttpResponse.Builder builder = new HttpResponse.Builder();
        builder.m266(responseCode);
        builder.m268(responseMessage);
        builder.m267(errorStream);
        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry2.getKey() != null) {
                builder.m269(entry2.getKey(), entry2.getValue().get(0));
            }
        }
        return builder.m265();
    }
}
