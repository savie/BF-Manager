package l;

import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0N4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21298 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C24720 f67908 = C24720.m55194(1000);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48534(InputStream inputStream, OutputStream outputStream, long j, InterfaceC23711 interfaceC23711) {
        long j2;
        C3639 c3639M11788 = C3639.m11788(interfaceC23711);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j3 = 0;
            long j4 = 0;
            while (true) {
                int i = inputStream.read(bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                if (i == -1) {
                    if (c3639M11788 != null) {
                        c3639M11788.mo11791();
                        return;
                    }
                    return;
                }
                outputStream.write(bArr, 0, i);
                long j5 = ((long) i) + j3;
                if (c3639M11788 != null) {
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    if (jUptimeMillis2 - jUptimeMillis < c.a || !f67908.m55199()) {
                        j2 = jUptimeMillis;
                    } else {
                        c3639M11788.mo11789();
                        j2 = jUptimeMillis2;
                    }
                    long jMin = outputStream instanceof InterfaceC16251 ? Math.min(j5, Math.max(j4, ((InterfaceC16251) outputStream).mo29367())) : j5;
                    if (jMin > j4) {
                        c3639M11788.mo11790(jMin - j4, jMin, Math.max(j5, j));
                        j4 = jMin;
                    }
                    if (c3639M11788.f12461.mo924()) {
                        c3639M11788.mo11791();
                        return;
                    }
                    jUptimeMillis = j2;
                }
                j3 = j5;
            }
        } catch (Throwable th) {
            if (c3639M11788 != null) {
                c3639M11788.mo11791();
            }
            throw th;
        }
    }
}
