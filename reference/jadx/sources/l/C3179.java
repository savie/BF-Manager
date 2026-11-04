package l;

import com.alipay.sdk.m.p.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55BL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3179 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f10308;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23317 f10309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23317 f10310;

    public C3179(String str) {
        C23317 c23317 = new C23317();
        this.f10310 = c23317;
        this.f10309 = c23317;
        this.f10308 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10381(String str, boolean z) {
        m10376(str, String.valueOf(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10380(String str, int i) {
        m10376(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10377(long j, String str) {
        m10376(str, String.valueOf(j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f10308);
        sb.append('{');
        C23317 c23317 = this.f10310.f75534;
        String str = "";
        while (c23317 != null) {
            Object obj = c23317.f75533;
            sb.append(str);
            String str2 = c23317.f75532;
            if (str2 != null) {
                sb.append(str2);
                sb.append(a.h);
            }
            if (obj != null && obj.getClass().isArray()) {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c23317 = c23317.f75534;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10378(Object obj) {
        C23317 c23317 = new C23317();
        this.f10309.f75534 = c23317;
        this.f10309 = c23317;
        c23317.f75533 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10379(Object obj, String str) {
        C23317 c23317 = new C23317();
        this.f10309.f75534 = c23317;
        this.f10309 = c23317;
        c23317.f75533 = obj;
        c23317.f75532 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10376(String str, String str2) {
        C15857 c15857 = new C15857();
        this.f10309.f75534 = c15857;
        this.f10309 = c15857;
        c15857.f75533 = str2;
        c15857.f75532 = str;
    }
}
