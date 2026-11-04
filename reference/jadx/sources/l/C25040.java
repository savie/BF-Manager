package l;

import android.text.TextUtils;
import java.util.Random;

/* JADX INFO: renamed from: l.᩻۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N795 */
/* JADX INFO: loaded from: classes.dex */
public final class C25040 implements InterfaceC22760, InterfaceC21931 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String f81010;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long f81011;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static long f81012;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized long m55859(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        long j = f81011 + 1;
        f81011 = j;
        f81012 = j;
        f81010 = str;
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized String m55860() {
        return f81010;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m55861(long j) {
        if (j != 0) {
            if (j == f81012) {
                f81010 = null;
                f81012 = 0L;
            }
        }
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public void mo1200(C19929 c19929) {
        int iM34627 = ((C14270) c19929.m45858()).m34627();
        Random random = new Random();
        StringBuilder sb = new StringBuilder(iM34627);
        sb.append(((random.nextInt() & 255) % 9) + 1);
        for (int i = 1; i < iM34627; i++) {
            sb.append((random.nextInt() & 255) % 10);
        }
        C14270 c14270 = new C14270();
        c14270.m34621(sb.toString());
        c19929.m45857(c14270);
    }

    @Override // l.InterfaceC21931
    /* JADX INFO: renamed from: ۙ */
    public Object mo6294(float f, Float f2, Float f3) {
        float fFloatValue = f2.floatValue();
        return Float.valueOf(((f3.floatValue() - fFloatValue) * f) + fFloatValue);
    }
}
