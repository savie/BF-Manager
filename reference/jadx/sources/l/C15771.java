package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: l.ܺۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15771 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0247 f51080;

    public C15771(C0247 c0247) {
        this.f51080 = c0247;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str = "";
        C0247 c0247 = this.f51080;
        String strM34493 = ((C14277) c0247.f1473.m36673()).m34493();
        byte[] bytes = ((C14277) c0247.f1473.m36673()).m34493().getBytes();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((C14277) c0247.f1473.m36673()).m34493()).openConnection();
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/46.0.2486.0");
            httpURLConnection.setConnectTimeout(OpenAuthTask.Duplex);
            httpURLConnection.setReadTimeout(OpenAuthTask.Duplex);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            httpURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bytes);
            dataOutputStream.flush();
            dataOutputStream.close();
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
                str = new String(byteArrayOutputStream.toByteArray(), strM34493);
            }
        } catch (Exception unused) {
        }
        c0247.m1683(str);
    }
}
