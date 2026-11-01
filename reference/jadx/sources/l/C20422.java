package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20422 implements InterfaceC9134 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5079 f66194;

    public C20422(String str) {
        C16189 c16189 = new C16189(str);
        C2256 c2256 = new C2256();
        c2256.m6925(Arrays.asList(C21494.f69843, C21494.f69845));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2256.m6924(15000L, timeUnit);
        c2256.m6933(30000L, timeUnit);
        c2256.m6932(30000L, timeUnit);
        c2256.m6929((C2921) null);
        c2256.m6928(c16189);
        this.f66194 = c2256.m6922();
    }

    @Override // l.InterfaceC9134
    public final void a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        if (this.f66194.m14155() == j && this.f66194.m14163() == j2) {
            return;
        }
        C23099.m51113("OkHttpServiceImpl", "setTimeout changed.");
        C2256 c2256M14172 = this.f66194.m14172();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2256M14172.m6924(j, timeUnit);
        c2256M14172.m6933(j2, timeUnit);
        c2256M14172.m6932(j2, timeUnit);
        this.f66194 = c2256M14172.m6922();
    }

    @Override // l.InterfaceC9134
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16894 mo23456(String str, String str2) {
        C23099.m51107("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = C15489.m37076(str, "?");
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat(a.p);
            }
            str = C15489.m37076(str, str2);
        }
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17685();
        return new C21127(this.f66194.m14157(c6490.m17678()).execute(), str2.length());
    }

    @Override // l.InterfaceC9134
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16894 mo23458(String str, Map map) {
        C23099.m51107("OkHttpServiceImpl", "post data");
        C16556 c16556 = new C16556();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c16556.m38976(str2, str3);
                }
            }
        }
        C12323 c12323M38975 = c16556.m38975();
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17681("POST", c12323M38975);
        return new C21127(this.f66194.m14157(c6490.m17678()).execute(), (int) c12323M38975.mo4375());
    }

    @Override // l.InterfaceC9134
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16894 mo23457(String str, HashMap map, HashMap map2) {
        if (map2.size() == 0) {
            return mo23458(str, map);
        }
        C23099.m51107("OkHttpServiceImpl", "post data, has byte data");
        C3149 c3149 = new C3149();
        if (map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    c3149.m9542(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = (byte[]) map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                c3149.m9543(str4, str4, AbstractC21307.m47777(C9501.m24336("content/unknown"), bArr));
                C23099.m51107("OkHttpServiceImpl", "post byte data.");
            }
        }
        C13547 c13547M9541 = c3149.m9541();
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17681("POST", c13547M9541);
        return new C21127(this.f66194.m14157(c6490.m17678()).execute(), (int) c13547M9541.mo4375());
    }
}
