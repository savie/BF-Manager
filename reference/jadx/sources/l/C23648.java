package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes.dex */
public final class C23648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f76709;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3510 f76710;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3926 f76711;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f76712;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23056 f76713;

    public C23648(C16188 c16188) {
        this.f76710 = c16188.f52553;
        this.f76711 = c16188.f52549.finish();
        this.f76713 = c16188.f52551.m24859();
        this.f76712 = c16188.f52555;
        this.f76709 = c16188.f52552;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23648 m52884(C24965 c24965, InterfaceC24329 interfaceC24329, C0352 c0352, int i) {
        C23648 c23648M52882;
        synchronized (c24965) {
            C6781 c6781M18902 = C6781.m18902(c24965.m55765());
            if (!c6781M18902.m18906().equals(c24965.m55768())) {
                throw new IOException("Migration app identity does not match");
            }
            C7305 c7305M55767 = c24965.m55767();
            try {
                c23648M52882 = m52882(c7305M55767, c6781M18902, interfaceC24329, c0352, i);
                c7305M55767.close();
            } catch (Throwable th) {
                try {
                    c7305M55767.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return c23648M52882;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23648 m52882(C7305 c7305, C6781 c6781, InterfaceC24329 interfaceC24329, C0352 c0352, int i) throws IOException {
        if (!c6781.m18909() || i < 0 || c6781.m18910() > i) {
            throw new IOException("Migration app state is missing or exceeds limit");
        }
        C16188 c16188 = new C16188(c7305, i);
        try {
            C11254.m28488(c6781.m18903(interfaceC24329, c0352), c6781.m18910(), c0352, c16188);
            c16188.m38418();
            C23648 c23648 = new C23648(c16188);
            c16188.close();
            return c23648;
        } catch (Throwable th) {
            try {
                c16188.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
