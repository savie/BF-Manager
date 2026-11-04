package l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.۫ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13057 {
    /* JADX INFO: renamed from: ۗ */
    public abstract C15294 mo17423();

    /* JADX INFO: renamed from: ۙ */
    public boolean mo23981() {
        return true;
    }

    /* JADX INFO: renamed from: ۚ */
    public File mo17424() {
        return null;
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract String mo17425();

    /* JADX INFO: renamed from: ۫ */
    public abstract String mo17426();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m32545() {
        return this instanceof C8977;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean mo32546() {
        return this instanceof C11960;
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo23982() {
        return this instanceof C25387;
    }

    /* JADX INFO: renamed from: ᩹ */
    public abstract InputStream mo17428();

    static {
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23980(OutputStream outputStream, boolean z, InterfaceC7509 interfaceC7509) throws IOException {
        InputStream inputStreamMo17428 = mo17428();
        try {
            if (inputStreamMo17428 == null) {
                throw new IOException("Image source returned no stream");
            }
            byte[] bArr = new byte[32768];
            while (true) {
                m32543(interfaceC7509);
                int i = inputStreamMo17428.read(bArr);
                m32543(interfaceC7509);
                if (i < 0) {
                    inputStreamMo17428.close();
                    return;
                } else if (i > 0) {
                    outputStream.write(bArr, 0, i);
                }
            }
        } catch (Throwable th) {
            if (inputStreamMo17428 != null) {
                try {
                    inputStreamMo17428.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32543(InterfaceC7509 interfaceC7509) {
        if (interfaceC7509.mo924()) {
            throw new InterruptedIOException("Image source request canceled");
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public File mo23983() {
        return mo17424();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13057 m32542(ActivityC15913 activityC15913, AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386) {
        AbstractC13057 abstractC13057M12196 = C3757.m12196(activityC15913, abstractC7629, interfaceC2386);
        return C6790.m18961(interfaceC2386) ? new C8977(abstractC13057M12196, abstractC7629, interfaceC2386) : abstractC13057M12196;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32544(C15294 c15294) {
        try {
            if (!c15294.equals(mo17423())) {
                throw new C19770("Image source version changed");
            }
        } catch (IOException e) {
            throw new C19770("Image source is no longer available", e);
        }
    }
}
