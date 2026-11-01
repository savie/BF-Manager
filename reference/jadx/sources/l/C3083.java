package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ۗ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3083 extends AbstractC21428 implements InterfaceC4182 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f11662;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12257 f11663;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f11664;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C13356 f11665;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f11666;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HttpURLConnection f11667;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f11668;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13356 f11669;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f11670;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9435 f11671;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f11672;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InputStream f11673;

    public C3083(int i, int i2, C13356 c13356, C9836 c9836) {
        super(true);
        this.f11662 = i;
        this.f11668 = i2;
        this.f11665 = c13356;
        this.f11669 = new C13356();
        this.f11671 = c9836;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Uri mo9274() {
        HttpURLConnection httpURLConnection = this.f11667;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C12257 c12257 = this.f11663;
        if (c12257 != null) {
            return c12257.f41015;
        }
        return null;
    }

    @Override // l.InterfaceC4182
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo9271() {
        int i;
        if (this.f11667 == null || (i = this.f11670) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // l.AbstractC21428, l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map mo9273() {
        HttpURLConnection httpURLConnection = this.f11667;
        if (httpURLConnection == null) {
            return AbstractC6910.of();
        }
        return new C1672(httpURLConnection.getHeaderFields());
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo9272(C12257 c12257) throws C5594 {
        byte[] bArrM6841;
        this.f11663 = c12257;
        long j = 0;
        this.f11664 = 0L;
        this.f11672 = 0L;
        m48019(c12257);
        try {
            HttpURLConnection httpURLConnectionM9267 = m9267(c12257);
            long j2 = c12257.f41009;
            long j3 = c12257.f41017;
            this.f11667 = httpURLConnectionM9267;
            this.f11670 = httpURLConnectionM9267.getResponseCode();
            httpURLConnectionM9267.getResponseMessage();
            int i = this.f11670;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM9267.getHeaderFields();
                if (this.f11670 == 416 && j2 == C7005.m18810(httpURLConnectionM9267.getHeaderField("Content-Range"))) {
                    this.f11666 = true;
                    m48018(c12257);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionM9267.getErrorStream();
                try {
                    bArrM6841 = errorStream != null ? C2221.m6841(errorStream) : C17983.f57507;
                } catch (IOException unused) {
                    bArrM6841 = C17983.f57507;
                }
                Uri uri = Uri.parse(httpURLConnectionM9267.getURL().toString());
                C1360 c1360 = new C1360(this.f11670, this.f11670 == 416 ? new C20018(2008) : null, headerFields, bArrM6841, uri);
                m9266();
                throw c1360;
            }
            httpURLConnectionM9267.getContentType();
            if (this.f11670 == 200 && j2 != 0) {
                j = j2;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM9267.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.f11672 = j3;
            } else {
                long jM18811 = C7005.m18811(httpURLConnectionM9267.getHeaderField("Content-Length"), httpURLConnectionM9267.getHeaderField("Content-Range"));
                this.f11672 = jM18811 != -1 ? jM18811 - j : -1L;
            }
            try {
                this.f11673 = httpURLConnectionM9267.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f11673 = new GZIPInputStream(this.f11673);
                }
                this.f11666 = true;
                m48018(c12257);
                try {
                    m9270(j);
                    return this.f11672;
                } catch (IOException e) {
                    m9266();
                    if (e instanceof C5594) {
                        throw ((C5594) e);
                    }
                    throw new C5594(e, 2000, 1);
                }
            } catch (IOException e2) {
                m9266();
                throw new C5594(e2, 2000, 1);
            }
        } catch (IOException e3) {
            m9266();
            throw C5594.m15470(e3, 1);
        }
    }

    @Override // l.InterfaceC15785
    public final void close() {
        try {
            InputStream inputStream = this.f11673;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = C17983.f57504;
                    throw new C5594(e, 2000, 3);
                }
            }
            this.f11673 = null;
            m9266();
            if (this.f11666) {
                this.f11666 = false;
                m48020();
            }
            this.f11667 = null;
            this.f11663 = null;
        } catch (Throwable th) {
            this.f11673 = null;
            m9266();
            if (this.f11666) {
                this.f11666 = false;
                m48020();
            }
            this.f11667 = null;
            this.f11663 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private HttpURLConnection m9267(C12257 c12257) throws IOException {
        C12257 c12258 = c12257;
        URL url = new URL(c12258.f41015.toString());
        int i = c12258.f41014;
        byte[] bArr = c12258.f41016;
        long j = c12258.f41009;
        long j2 = c12258.f41017;
        int i2 = 0;
        boolean z = (c12258.f41012 & 1) == 1;
        if (this.f11671 == null) {
            return m9268(url, i, bArr, j, j2, z, true, c12258.f41010);
        }
        URL urlM9269 = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        int i4 = 1;
        while (true) {
            int i5 = i2 + 1;
            if (i2 > 20) {
                throw new C5594(new NoRouteToHostException(C8479.m22141(i5, "Too many redirects: ")), 2001, 1);
            }
            Map map = c12258.f41010;
            long j3 = j;
            long j4 = j;
            int i6 = i3;
            int i7 = i4;
            URL url2 = urlM9269;
            long j5 = j2;
            HttpURLConnection httpURLConnectionM9268 = m9268(urlM9269, i3, bArr2, j3, j2, z, false, map);
            int responseCode = httpURLConnectionM9268.getResponseCode();
            String headerField = httpURLConnectionM9268.getHeaderField("Location");
            if ((i6 == i7 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM9268.disconnect();
                urlM9269 = m9269(url2, headerField);
                i3 = i6;
            } else {
                if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM9268;
                }
                httpURLConnectionM9268.disconnect();
                urlM9269 = m9269(url2, headerField);
                bArr2 = null;
                i3 = 1;
            }
            i4 = 1;
            c12258 = c12257;
            j = j4;
            i2 = i5;
            j2 = j5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HttpURLConnection m9268(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f11662);
        httpURLConnection.setReadTimeout(this.f11668);
        InterfaceC9435 interfaceC9435 = this.f11671;
        AbstractMap map2 = interfaceC9435 == null ? new HashMap() : new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C13356 c13356 = this.f11665;
        if (c13356 != null) {
            map2.putAll(c13356.m32852());
        }
        map2.putAll(this.f11669.m32852());
        map2.putAll(map);
        Map mapM24942 = map2;
        if (interfaceC9435 != null) {
            mapM24942 = ((C9836) interfaceC9435).m24942(url, map2);
        }
        for (Map.Entry entry : mapM24942.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i2 = C7005.f23569;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbM39970 = C17114.m39970("bytes=", "-", j);
            if (j2 != -1) {
                sbM39970.append((j + j2) - 1);
            }
            string = sbM39970.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i3 = C12257.f41008;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private URL m9269(URL url, String str) throws C5594 {
        if (str == null) {
            throw new C5594("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!b.a.equals(protocol) && !a.s.equals(protocol)) {
                throw new C5594(C0252.m1693("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C5594("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + MotionUtils.EASING_TYPE_FORMAT_END, 2001);
        } catch (MalformedURLException e) {
            throw new C5594(e, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9270(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f11673;
            String str = C17983.f57504;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C5594(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new C5594();
            }
            j -= (long) i;
            m48017(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws C5594 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f11672;
            if (j != -1) {
                long j2 = j - this.f11664;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f11673;
                    String str = C17983.f57504;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f11664 += (long) i3;
                        m48017(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f11673;
                String str2 = C17983.f57504;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f11664 += (long) i3;
                    m48017(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = C17983.f57504;
            throw C5594.m15470(e, 2);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m9266() {
        HttpURLConnection httpURLConnection = this.f11667;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C0303.m1854("Unexpected error while disconnecting", e);
            }
        }
    }
}
