package l;

import com.alipay.sdk.m.w.a;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: VAHB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20094 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f64576;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f64577;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f64579;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f64578 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f64575 = a.D;

    public C20094(String str, boolean z) {
        this.f64577 = str;
        this.f64576 = z;
        this.f64579 = z ? new StringBuilder() : null;
        m46227("User-Agent", "Mozilla/5.0 (Linux; Android 6.0;)");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46227(String str, String str2) {
        this.f64578.put(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46225(String str, String str2) {
        StringBuilder sb = this.f64579;
        if (sb.length() == 0) {
            this.f64578.put("Content-Type", "application/x-www-form-urlencoded");
        } else {
            sb.append('&');
        }
        try {
            sb.append(str);
            sb.append(com.alipay.sdk.m.p.a.h);
            sb.append(C22837.encode(str2, this.f64575));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HttpURLConnection m46224() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f64577).openConnection();
        boolean z = this.f64576;
        httpURLConnection.setRequestMethod(z ? "POST" : "GET");
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoOutput(z);
        for (Map.Entry entry : this.f64578.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (z) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(this.f64579.toString().getBytes(this.f64575));
            outputStream.flush();
            outputStream.close();
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m46226() throws IOException {
        HttpURLConnection httpURLConnectionM46224 = m46224();
        int responseCode = httpURLConnectionM46224.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            throw new IOException(C13645.m33382(responseCode, "HTTP response code: "));
        }
        InputStream inputStream = httpURLConnectionM46224.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                inputStream.close();
                return byteArrayOutputStream.toString(this.f64575);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
