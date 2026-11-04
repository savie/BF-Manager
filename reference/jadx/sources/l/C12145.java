package l;

import com.alipay.sdk.m.c0.d;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f39053;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C23334[] f39054;

    static {
        C23334 c23334 = new C23334(C23334.f75573, "");
        C16794 c16794 = C23334.f75572;
        C23334 c23335 = new C23334(c16794, "GET");
        C23334 c23336 = new C23334(c16794, "POST");
        C16794 c16795 = C23334.f75571;
        C23334 c23337 = new C23334(c16795, "/");
        C23334 c23338 = new C23334(c16795, "/index.html");
        C16794 c16796 = C23334.f75570;
        C23334 c23339 = new C23334(c16796, a.s);
        C23334 c233310 = new C23334(c16796, b.a);
        C16794 c16797 = C23334.f75574;
        C23334[] c23334Arr = {c23334, c23335, c23336, c23337, c23338, c23339, c233310, new C23334(c16797, "200"), new C23334(c16797, "204"), new C23334(c16797, "206"), new C23334(c16797, "304"), new C23334(c16797, "400"), new C23334(c16797, "404"), new C23334(c16797, "500"), new C23334("accept-charset", ""), new C23334("accept-encoding", "gzip, deflate"), new C23334("accept-language", ""), new C23334("accept-ranges", ""), new C23334("accept", ""), new C23334("access-control-allow-origin", ""), new C23334("age", ""), new C23334("allow", ""), new C23334("authorization", ""), new C23334("cache-control", ""), new C23334("content-disposition", ""), new C23334("content-encoding", ""), new C23334("content-language", ""), new C23334("content-length", ""), new C23334("content-location", ""), new C23334("content-range", ""), new C23334(e.f, ""), new C23334("cookie", ""), new C23334("date", ""), new C23334("etag", ""), new C23334("expect", ""), new C23334("expires", ""), new C23334("from", ""), new C23334(c.f, ""), new C23334("if-match", ""), new C23334("if-modified-since", ""), new C23334("if-none-match", ""), new C23334("if-range", ""), new C23334("if-unmodified-since", ""), new C23334("last-modified", ""), new C23334("link", ""), new C23334("location", ""), new C23334("max-forwards", ""), new C23334("proxy-authenticate", ""), new C23334("proxy-authorization", ""), new C23334("range", ""), new C23334("referer", ""), new C23334(d.x, ""), new C23334("retry-after", ""), new C23334("server", ""), new C23334("set-cookie", ""), new C23334("strict-transport-security", ""), new C23334("transfer-encoding", ""), new C23334("user-agent", ""), new C23334("vary", ""), new C23334("via", ""), new C23334("www-authenticate", "")};
        f39054 = c23334Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c23334Arr.length);
        for (int i = 0; i < c23334Arr.length; i++) {
            if (!linkedHashMap.containsKey(c23334Arr[i].f75578)) {
                linkedHashMap.put(c23334Arr[i].f75578, Integer.valueOf(i));
            }
        }
        f39053 = C4681.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30352(C16794 c16794) throws IOException {
        int iMo23081 = c16794.mo23081();
        for (int i = 0; i < iMo23081; i++) {
            byte bMo23082 = c16794.mo23082(i);
            if (bMo23082 >= 65 && bMo23082 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c16794.mo23092());
            }
        }
    }
}
