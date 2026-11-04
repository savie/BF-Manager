package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.᩷᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22401 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8450 f72546;

    public C22401(C8450 c8450) {
        this.f72546 = c8450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50475(C5247 c5247, String str) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append('<');
        sb.append(c5247.m15806());
        String str2 = str + this.f72546.m22633();
        boolean z = true;
        if (c5247.m15800() == 1) {
            C6959 c6959M15801 = c5247.m15801(0);
            String str3 = c6959M15801.m19261() + "=" + c6959M15801.m19263() + c6959M15801.m19262() + c6959M15801.m19263();
            if (str3.length() > 80) {
                sb.append("\n");
                sb.append(str2);
            } else {
                sb.append(" ");
            }
            sb.append(str3);
        } else {
            for (int i = 0; i < c5247.m15800(); i++) {
                C6959 c6959M15802 = c5247.m15801(i);
                String strM19261 = c6959M15802.m19261();
                if (strM19261.startsWith("xmlns:") || strM19261.equals("xmlns")) {
                    if (z) {
                        sb.append(" ");
                        z = false;
                    } else {
                        sb.append("\n");
                        sb.append(str2);
                    }
                    sb.append(c6959M15802.m19261());
                    sb.append(a.h);
                    sb.append(c6959M15802.m19263());
                    sb.append(c6959M15802.m19262());
                    sb.append(c6959M15802.m19263());
                }
            }
            for (int i2 = 0; i2 < c5247.m15800(); i2++) {
                C6959 c6959M15803 = c5247.m15801(i2);
                String strM19262 = c6959M15803.m19261();
                if (!strM19262.startsWith("xmlns:") && !strM19262.equals("xmlns")) {
                    sb.append("\n");
                    sb.append(str2);
                    sb.append(c6959M15803.m19261());
                    sb.append(a.h);
                    sb.append(c6959M15803.m19263());
                    sb.append(c6959M15803.m19262());
                    sb.append(c6959M15803.m19263());
                }
            }
        }
        if (c5247.m15805()) {
            sb.append(" /");
        }
        sb.append('>');
        return sb.toString();
    }
}
