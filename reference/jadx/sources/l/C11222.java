package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۤ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11222 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f35388 = Charset.forName(a.D);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28280(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM8289 = C2458.m8289("size=", " offset=", j);
            sbM8289.append(j2);
            sbM8289.append(" byteCount=");
            sbM8289.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM8289.toString());
        }
    }
}
