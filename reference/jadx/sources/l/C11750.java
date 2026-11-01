package l;

import com.alipay.sdk.m.c0.d;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11750 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f39477;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C3013[] f39478;

    static {
        C3013 c3013 = new C3013(C3013.f11266, "");
        C14511 c14511 = C3013.f11261;
        C3013 c3014 = new C3013(c14511, "GET");
        C3013 c3015 = new C3013(c14511, "POST");
        C14511 c14512 = C3013.f11265;
        C3013 c3016 = new C3013(c14512, "/");
        C3013 c3017 = new C3013(c14512, "/index.html");
        C14511 c14513 = C3013.f11263;
        C3013 c3018 = new C3013(c14513, a.s);
        C3013 c3019 = new C3013(c14513, b.a);
        C14511 c14514 = C3013.f11264;
        C3013[] c3013Arr = {c3013, c3014, c3015, c3016, c3017, c3018, c3019, new C3013(c14514, "200"), new C3013(c14514, "204"), new C3013(c14514, "206"), new C3013(c14514, "304"), new C3013(c14514, "400"), new C3013(c14514, "404"), new C3013(c14514, "500"), new C3013("accept-charset", ""), new C3013("accept-encoding", "gzip, deflate"), new C3013("accept-language", ""), new C3013("accept-ranges", ""), new C3013("accept", ""), new C3013("access-control-allow-origin", ""), new C3013("age", ""), new C3013("allow", ""), new C3013("authorization", ""), new C3013("cache-control", ""), new C3013("content-disposition", ""), new C3013("content-encoding", ""), new C3013("content-language", ""), new C3013("content-length", ""), new C3013("content-location", ""), new C3013("content-range", ""), new C3013(e.f, ""), new C3013("cookie", ""), new C3013("date", ""), new C3013("etag", ""), new C3013("expect", ""), new C3013("expires", ""), new C3013("from", ""), new C3013(c.f, ""), new C3013("if-match", ""), new C3013("if-modified-since", ""), new C3013("if-none-match", ""), new C3013("if-range", ""), new C3013("if-unmodified-since", ""), new C3013("last-modified", ""), new C3013("link", ""), new C3013("location", ""), new C3013("max-forwards", ""), new C3013("proxy-authenticate", ""), new C3013("proxy-authorization", ""), new C3013("range", ""), new C3013("referer", ""), new C3013(d.x, ""), new C3013("retry-after", ""), new C3013("server", ""), new C3013("set-cookie", ""), new C3013("strict-transport-security", ""), new C3013("transfer-encoding", ""), new C3013("user-agent", ""), new C3013("vary", ""), new C3013("via", ""), new C3013("www-authenticate", "")};
        f39478 = c3013Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c3013Arr.length);
        for (int i = 0; i < c3013Arr.length; i++) {
            if (!linkedHashMap.containsKey(c3013Arr[i].f11269)) {
                linkedHashMap.put(c3013Arr[i].f11269, Integer.valueOf(i));
            }
        }
        f39477 = C0561.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29360(C14511 c14511) throws IOException {
        int iMo34938 = c14511.mo34938();
        for (int i = 0; i < iMo34938; i++) {
            byte bMo34939 = c14511.mo34939(i);
            if (bMo34939 >= 65 && bMo34939 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c14511.mo34948());
            }
        }
    }
}
