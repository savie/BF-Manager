package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5179 implements InterfaceC9149 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24363 f18082;

    public C5179(String str) {
        C13624 c13624 = new C13624(str);
        C6463 c6463 = new C6463();
        c6463.m18268(Arrays.asList(C1374.f4899, C1374.f4900));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6463.m18267(15000L, timeUnit);
        c6463.m18278(30000L, timeUnit);
        c6463.m18276(30000L, timeUnit);
        c6463.m18272((C3611) null);
        c6463.m18273(c13624);
        this.f18082 = c6463.m18265();
    }

    @Override // l.InterfaceC9149
    public final void a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        if (this.f18082.m54453() == j && this.f18082.m54455() == j2) {
            return;
        }
        C21587.m49113("OkHttpServiceImpl", "setTimeout changed.");
        C6463 c6463M54459 = this.f18082.m54459();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6463M54459.m18267(j, timeUnit);
        c6463M54459.m18278(j2, timeUnit);
        c6463M54459.m18276(j2, timeUnit);
        this.f18082 = c6463M54459.m18265();
    }

    @Override // l.InterfaceC9149
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11144 mo8231(String str, String str2) {
        C21587.m49118("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = C14483.m34972(str, "?");
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat(a.p);
            }
            str = C14483.m34972(str, str2);
        }
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2396();
        return new C6913(this.f18082.m54450(c0496.m2389()).execute(), str2.length());
    }

    @Override // l.InterfaceC9149
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11144 mo8233(String str, Map map) {
        C21587.m49118("OkHttpServiceImpl", "post data");
        C15411 c15411 = new C15411();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c15411.m36889(str2, str3);
                }
            }
        }
        C13174 c13174M36888 = c15411.m36888();
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2392("POST", c13174M36888);
        return new C6913(this.f18082.m54450(c0496.m2389()).execute(), (int) c13174M36888.mo26310());
    }

    @Override // l.InterfaceC9149
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11144 mo8232(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return mo8233(str, map);
        }
        C21587.m49118("OkHttpServiceImpl", "post data, has byte data");
        C23617 c23617 = new C23617();
        if (map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c23617.m52855(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = (byte[]) map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                c23617.m52856(str4, str4, AbstractC10190.m26309(C16157.m38331("content/unknown"), bArr));
                C21587.m49118("OkHttpServiceImpl", "post byte data.");
            }
        }
        C20633 c20633M52854 = c23617.m52854();
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2392("POST", c20633M52854);
        return new C6913(this.f18082.m54450(c0496.m2389()).execute(), (int) c20633M52854.mo26310());
    }
}
