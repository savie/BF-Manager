package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22325 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11136 f72266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23071 f72267;

    public RunnableC22325(C11136 c11136) {
        this.f72266 = c11136;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50388(C7210 c7210) {
        C23071 c23071 = this.f72267;
        if (c23071 != null && c23071.f74845.f35103 == c7210) {
            return true;
        }
        C11136 c11136 = this.f72266;
        return c11136 != null && c11136.f35103 == c7210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50387(C11136 c11136) {
        this.f72266 = c11136;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23071 c23071;
        while (true) {
            synchronized (C5917.class) {
                if (C5917.f20245 != this) {
                    return;
                }
                C11136 c11136 = this.f72266;
                if (c11136 == null) {
                    C5917.f20245 = null;
                    return;
                }
                this.f72266 = null;
                if (C5917.f20248 == c11136.f35103) {
                    try {
                        c23071 = new C23071(c11136, c11136.f35103.m19800());
                        try {
                            this.f72267 = c23071;
                        } catch (IOException | RuntimeException unused) {
                        }
                    } catch (IOException | RuntimeException unused2) {
                        c23071 = null;
                    }
                } else {
                    c23071 = null;
                }
                if (c23071 != null) {
                    C5917.m17180(c23071);
                }
                synchronized (C5917.class) {
                    if (C5917.f20245 != this) {
                        return;
                    }
                    if (this.f72267 == c23071) {
                        this.f72267 = null;
                    }
                    if (this.f72266 == null) {
                        C5917.f20245 = null;
                        return;
                    }
                }
            }
        }
    }
}
