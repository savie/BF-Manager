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

/* JADX INFO: renamed from: l.᩹ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAHB */
/* JADX INFO: loaded from: classes.dex */
public final class C22318 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f72884;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f72886;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f72887;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f72888 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f72885 = a.D;

    public C22318(String str, boolean z) {
        this.f72886 = str;
        this.f72887 = z;
        this.f72884 = z ? new StringBuilder() : null;
        m49489("User-Agent", "Mozilla/5.0 (Linux; Android 6.0;)");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49489(String str, String str2) {
        this.f72888.put(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49487(String str, String str2) {
        StringBuilder sb = this.f72884;
        if (sb.length() == 0) {
            this.f72888.put("Content-Type", "application/x-www-form-urlencoded");
        } else {
            sb.append('&');
        }
        try {
            sb.append(str);
            sb.append(com.alipay.sdk.m.p.a.h);
            sb.append(C17290.encode(str2, this.f72885));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HttpURLConnection m49486() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f72886).openConnection();
        boolean z = this.f72887;
        httpURLConnection.setRequestMethod(z ? "POST" : "GET");
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoOutput(z);
        for (Map.Entry entry : this.f72888.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (z) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(this.f72884.toString().getBytes(this.f72885));
            outputStream.flush();
            outputStream.close();
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m49488() throws IOException {
        HttpURLConnection httpURLConnectionM49486 = m49486();
        int responseCode = httpURLConnectionM49486.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            throw new IOException(C8479.m22141(responseCode, "HTTP response code: "));
        }
        InputStream inputStream = httpURLConnectionM49486.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                inputStream.close();
                return byteArrayOutputStream.toString(this.f72885);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
