package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܺۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15653 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f50852 = Charset.forName(a.D);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37329(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM39970 = C17114.m39970("size=", " offset=", j);
            sbM39970.append(j2);
            sbM39970.append(" byteCount=");
            sbM39970.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM39970.toString());
        }
    }
}
