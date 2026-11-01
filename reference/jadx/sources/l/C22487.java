package l;

import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩹᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0N4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22487 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C22959 f73407 = C22959.m50799(1000);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49992(InputStream inputStream, OutputStream outputStream, long j, InterfaceC8978 interfaceC8978) {
        long j2;
        C4516 c4516M12618 = C4516.m12618(interfaceC8978);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j3 = 0;
            long j4 = 0;
            while (true) {
                int i = inputStream.read(bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                if (i == -1) {
                    if (c4516M12618 != null) {
                        c4516M12618.mo10128();
                        return;
                    }
                    return;
                }
                outputStream.write(bArr, 0, i);
                long j5 = ((long) i) + j3;
                if (c4516M12618 != null) {
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    if (jUptimeMillis2 - jUptimeMillis < c.a || !f73407.m50802()) {
                        j2 = jUptimeMillis;
                    } else {
                        c4516M12618.mo10126();
                        j2 = jUptimeMillis2;
                    }
                    long jMin = outputStream instanceof InterfaceC19561 ? Math.min(j5, Math.max(j4, ((InterfaceC19561) outputStream).mo44661())) : j5;
                    if (jMin > j4) {
                        c4516M12618.mo10127(jMin - j4, jMin, Math.max(j5, j));
                        j4 = jMin;
                    }
                    if (c4516M12618.f16073.mo2357()) {
                        c4516M12618.mo10128();
                        return;
                    }
                    jUptimeMillis = j2;
                }
                j3 = j5;
            }
        } catch (Throwable th) {
            if (c4516M12618 != null) {
                c4516M12618.mo10128();
            }
            throw th;
        }
    }
}
