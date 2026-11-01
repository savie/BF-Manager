package l;

import com.alipay.sdk.m.p.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55BL */
/* JADX INFO: loaded from: classes.dex */
public final class C23244 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f75421;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7015 f75422;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7015 f75423;

    public C23244(String str) {
        C7015 c7015 = new C7015();
        this.f75423 = c7015;
        this.f75422 = c7015;
        this.f75421 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51286(String str, boolean z) {
        m51281(str, String.valueOf(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51285(String str, int i) {
        m51281(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51282(long j, String str) {
        m51281(str, String.valueOf(j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f75421);
        sb.append('{');
        C7015 c7015 = this.f75423.f23582;
        String str = "";
        while (c7015 != null) {
            Object obj = c7015.f23581;
            sb.append(str);
            String str2 = c7015.f23580;
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
            c7015 = c7015.f23582;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51283(Object obj) {
        C7015 c7015 = new C7015();
        this.f75422.f23582 = c7015;
        this.f75422 = c7015;
        c7015.f23581 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51284(Object obj, String str) {
        C7015 c7015 = new C7015();
        this.f75422.f23582 = c7015;
        this.f75422 = c7015;
        c7015.f23581 = obj;
        c7015.f23580 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51281(String str, String str2) {
        C4192 c4192 = new C4192();
        this.f75422.f23582 = c4192;
        this.f75422 = c4192;
        c4192.f23581 = str2;
        c4192.f23580 = str;
    }
}
