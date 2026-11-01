package l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.֫ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1886 {
    /* JADX INFO: renamed from: ֨ */
    public abstract String mo5281();

    /* JADX INFO: renamed from: ۖ */
    public abstract String mo5282();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo6138() {
        return true;
    }

    /* JADX INFO: renamed from: ۠ */
    public abstract C14588 mo5283();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public File mo6139() {
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo6140() {
        return this instanceof C1514;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract InputStream mo5285();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo6141() {
        return this instanceof C9277;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean m6142() {
        return this instanceof C17970;
    }

    static {
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6136(OutputStream outputStream, boolean z, InterfaceC5614 interfaceC5614) throws IOException {
        InputStream inputStreamMo5285 = mo5285();
        try {
            if (inputStreamMo5285 == null) {
                throw new IOException("Image source returned no stream");
            }
            byte[] bArr = new byte[32768];
            while (true) {
                m6135(interfaceC5614);
                int i = inputStreamMo5285.read(bArr);
                m6135(interfaceC5614);
                if (i < 0) {
                    inputStreamMo5285.close();
                    return;
                } else if (i > 0) {
                    outputStream.write(bArr, 0, i);
                }
            }
        } catch (Throwable th) {
            if (inputStreamMo5285 != null) {
                try {
                    inputStreamMo5285.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6135(InterfaceC5614 interfaceC5614) {
        if (interfaceC5614.mo2357()) {
            throw new InterruptedIOException("Image source request canceled");
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public File mo5284() {
        return mo6139();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1886 m6134(ActivityC15481 activityC15481, AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557) {
        AbstractC1886 abstractC1886M7432 = C2447.m7432(activityC15481, abstractC9677, interfaceC2557);
        return C13012.m32190(interfaceC2557) ? new C17970(abstractC1886M7432, abstractC9677, interfaceC2557) : abstractC1886M7432;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6137(C14588 c14588) {
        try {
            if (!c14588.equals(mo5283())) {
                throw new C23760("Image source version changed");
            }
        } catch (IOException e) {
            throw new C23760("Image source is no longer available", e);
        }
    }
}
