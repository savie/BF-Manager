package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23382 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14210 f75753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1508 f75754;

    public RunnableC23382(C14210 c14210) {
        this.f75753 = c14210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51524(C6750 c6750) {
        C1508 c1508 = this.f75754;
        if (c1508 != null && c1508.f6156.f46598 == c6750) {
            return true;
        }
        C14210 c14210 = this.f75753;
        return c14210 != null && c14210.f46598 == c6750;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51523(C14210 c14210) {
        this.f75753 = c14210;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1508 c1508;
        while (true) {
            synchronized (C13732.class) {
                if (C13732.f45262 != this) {
                    return;
                }
                C14210 c14210 = this.f75753;
                if (c14210 == null) {
                    C13732.f45262 = null;
                    return;
                }
                this.f75753 = null;
                if (C13732.f45265 == c14210.f46598) {
                    try {
                        c1508 = new C1508(c14210, c14210.f46598.m18250());
                        try {
                            this.f75754 = c1508;
                        } catch (IOException | RuntimeException unused) {
                        }
                    } catch (IOException | RuntimeException unused2) {
                        c1508 = null;
                    }
                } else {
                    c1508 = null;
                }
                if (c1508 != null) {
                    C13732.m33433(c1508);
                }
                synchronized (C13732.class) {
                    if (C13732.f45262 != this) {
                        return;
                    }
                    if (this.f75754 == c1508) {
                        this.f75754 = null;
                    }
                    if (this.f75753 == null) {
                        C13732.f45262 = null;
                        return;
                    }
                }
            }
        }
    }
}
