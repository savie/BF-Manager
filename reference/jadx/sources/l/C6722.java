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

/* JADX INFO: renamed from: l.ۛ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6722 extends AbstractC8433 implements InterfaceC10449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C25368 f22357;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f22358;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HttpURLConnection f22359;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19400 f22360;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f22361;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f22362;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19400 f22363;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f22364;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12687 f22365;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f22366;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f22367;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InputStream f22368;

    public C6722(int i, int i2, C19400 c19400, C15866 c15866) {
        super(true);
        this.f22361 = i;
        this.f22364 = i2;
        this.f22360 = c19400;
        this.f22363 = new C19400();
        this.f22365 = c15866;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        HttpURLConnection httpURLConnection = this.f22359;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C25368 c25368 = this.f22357;
        if (c25368 != null) {
            return c25368.f81907;
        }
        return null;
    }

    @Override // l.InterfaceC10449
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo18764() {
        int i;
        if (this.f22359 == null || (i = this.f22367) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // l.AbstractC8433, l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        HttpURLConnection httpURLConnection = this.f22359;
        if (httpURLConnection == null) {
            return AbstractC17589.of();
        }
        return new C20892(httpURLConnection.getHeaderFields());
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws C18654 {
        byte[] bArrM15248;
        this.f22357 = c25368;
        long j = 0;
        this.f22366 = 0L;
        this.f22362 = 0L;
        m22621(c25368);
        try {
            HttpURLConnection httpURLConnectionM18763 = m18763(c25368);
            long j2 = c25368.f81909;
            long j3 = c25368.f81910;
            this.f22359 = httpURLConnectionM18763;
            this.f22367 = httpURLConnectionM18763.getResponseCode();
            httpURLConnectionM18763.getResponseMessage();
            int i = this.f22367;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM18763.getHeaderFields();
                if (this.f22367 == 416 && j2 == C1501.m5354(httpURLConnectionM18763.getHeaderField("Content-Range"))) {
                    this.f22358 = true;
                    m22619(c25368);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionM18763.getErrorStream();
                try {
                    bArrM15248 = errorStream != null ? C5020.m15248(errorStream) : C7116.f23453;
                } catch (IOException unused) {
                    bArrM15248 = C7116.f23453;
                }
                Uri uri = Uri.parse(httpURLConnectionM18763.getURL().toString());
                C8213 c8213 = new C8213(this.f22367, this.f22367 == 416 ? new C5976(2008) : null, headerFields, bArrM15248, uri);
                m18762();
                throw c8213;
            }
            httpURLConnectionM18763.getContentType();
            if (this.f22367 == 200 && j2 != 0) {
                j = j2;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM18763.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.f22362 = j3;
            } else {
                long jM5355 = C1501.m5355(httpURLConnectionM18763.getHeaderField("Content-Length"), httpURLConnectionM18763.getHeaderField("Content-Range"));
                this.f22362 = jM5355 != -1 ? jM5355 - j : -1L;
            }
            try {
                this.f22368 = httpURLConnectionM18763.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f22368 = new GZIPInputStream(this.f22368);
                }
                this.f22358 = true;
                m22619(c25368);
                try {
                    m18761(j);
                    return this.f22362;
                } catch (IOException e) {
                    m18762();
                    if (e instanceof C18654) {
                        throw ((C18654) e);
                    }
                    throw new C18654(e, 2000, 1);
                }
            } catch (IOException e2) {
                m18762();
                throw new C18654(e2, 2000, 1);
            }
        } catch (IOException e3) {
            m18762();
            throw C18654.m43415(e3, 1);
        }
    }

    @Override // l.InterfaceC13433
    public final void close() {
        try {
            InputStream inputStream = this.f22368;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = C7116.f23455;
                    throw new C18654(e, 2000, 3);
                }
            }
            this.f22368 = null;
            m18762();
            if (this.f22358) {
                this.f22358 = false;
                m22620();
            }
            this.f22359 = null;
            this.f22357 = null;
        } catch (Throwable th) {
            this.f22368 = null;
            m18762();
            if (this.f22358) {
                this.f22358 = false;
                m22620();
            }
            this.f22359 = null;
            this.f22357 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private HttpURLConnection m18763(C25368 c25368) throws IOException {
        C25368 c25369 = c25368;
        URL url = new URL(c25369.f81907.toString());
        int i = c25369.f81908;
        byte[] bArr = c25369.f81912;
        long j = c25369.f81909;
        long j2 = c25369.f81910;
        int i2 = 0;
        boolean z = (c25369.f81906 & 1) == 1;
        if (this.f22365 == null) {
            return m18759(url, i, bArr, j, j2, z, true, c25369.f81913);
        }
        URL urlM18760 = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        int i4 = 1;
        while (true) {
            int i5 = i2 + 1;
            if (i2 > 20) {
                throw new C18654(new NoRouteToHostException(C13645.m33382(i5, "Too many redirects: ")), 2001, 1);
            }
            Map map = c25369.f81913;
            long j3 = j;
            long j4 = j;
            int i6 = i3;
            int i7 = i4;
            URL url2 = urlM18760;
            long j5 = j2;
            HttpURLConnection httpURLConnectionM18759 = m18759(urlM18760, i3, bArr2, j3, j2, z, false, map);
            int responseCode = httpURLConnectionM18759.getResponseCode();
            String headerField = httpURLConnectionM18759.getHeaderField("Location");
            if ((i6 == i7 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM18759.disconnect();
                urlM18760 = m18760(url2, headerField);
                i3 = i6;
            } else {
                if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM18759;
                }
                httpURLConnectionM18759.disconnect();
                urlM18760 = m18760(url2, headerField);
                bArr2 = null;
                i3 = 1;
            }
            i4 = 1;
            c25369 = c25368;
            j = j4;
            i2 = i5;
            j2 = j5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HttpURLConnection m18759(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f22361);
        httpURLConnection.setReadTimeout(this.f22364);
        InterfaceC12687 interfaceC12687 = this.f22365;
        AbstractMap map2 = interfaceC12687 == null ? new HashMap() : new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C19400 c19400 = this.f22360;
        if (c19400 != null) {
            map2.putAll(c19400.m44854());
        }
        map2.putAll(this.f22363.m44854());
        map2.putAll(map);
        Map mapM37836 = map2;
        if (interfaceC12687 != null) {
            mapM37836 = ((C15866) interfaceC12687).m37836(url, map2);
        }
        for (Map.Entry entry : mapM37836.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i2 = C1501.f5229;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbM8289 = C2458.m8289("bytes=", "-", j);
            if (j2 != -1) {
                sbM8289.append((j + j2) - 1);
            }
            string = sbM8289.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i3 = C25368.f81904;
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
    private URL m18760(URL url, String str) throws C18654 {
        if (str == null) {
            throw new C18654("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!b.a.equals(protocol) && !a.s.equals(protocol)) {
                throw new C18654(C25272.m56409("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C18654("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + MotionUtils.EASING_TYPE_FORMAT_END, 2001);
        } catch (MalformedURLException e) {
            throw new C18654(e, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18761(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f22368;
            String str = C7116.f23455;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C18654(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new C18654();
            }
            j -= (long) i;
            m22622(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws C18654 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f22362;
            if (j != -1) {
                long j2 = j - this.f22366;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f22368;
                    String str = C7116.f23455;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f22366 += (long) i3;
                        m22622(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f22368;
                String str2 = C7116.f23455;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f22366 += (long) i3;
                    m22622(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = C7116.f23455;
            throw C18654.m43415(e, 2);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m18762() {
        HttpURLConnection httpURLConnection = this.f22359;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C1896.m6516("Unexpected error while disconnecting", e);
            }
        }
    }
}
