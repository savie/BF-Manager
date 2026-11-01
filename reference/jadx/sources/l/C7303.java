package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: l.۟ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7303 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0247 f24238;

    public C7303(C0247 c0247) {
        this.f24238 = c0247;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] byteArray;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((C14277) this.f24238.f1473.m36673()).m34493()).openConnection();
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/46.0.2486.0");
            httpURLConnection.setConnectTimeout(OpenAuthTask.Duplex);
            httpURLConnection.setReadTimeout(OpenAuthTask.Duplex);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available() * 2);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
                inputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                byteArray = new byte[0];
            }
            httpURLConnection.disconnect();
        } catch (Exception unused) {
            byteArray = new byte[0];
        }
        C0247 c0247 = this.f24238;
        synchronized (c0247) {
            if (c0247.f1473 != null) {
                C14277 c14277 = new C14277();
                c14277.m34465(byteArray);
                c0247.f1473.m36672(c14277);
                c0247.f1474 = false;
                c0247.f1473 = null;
            }
        }
    }
}
