package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: l.ܺۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16792 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3368 f54178;

    public C16792(C3368 c3368) {
        this.f54178 = c3368;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] byteArray;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((C14270) this.f54178.f10977.m45858()).m34647()).openConnection();
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
        C3368 c3368 = this.f54178;
        synchronized (c3368) {
            if (c3368.f10977 != null) {
                C14270 c14270 = new C14270();
                c14270.m34620(byteArray);
                c3368.f10977.m45857(c14270);
                c3368.f10978 = false;
                c3368.f10977 = null;
            }
        }
    }
}
