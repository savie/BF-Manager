package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4A2K */
/* JADX INFO: loaded from: classes3.dex */
public final class C0591 extends C24458 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C21474 f2367;

    @Override // l.C24458, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.C24458
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C6558 mo2684() {
        return this.f2367.m48846();
    }

    public C0591(C21474 c21474, C19457 c19457) {
        super(c21474.m48849(), c19457);
        this.f2367 = c21474;
    }

    @Override // l.C24458, java.io.InputStream
    public final int available() throws IOException {
        int iM20532;
        C21474 c21474 = this.f2367;
        try {
            C6558 c6558M48846 = c21474.m48846();
            try {
                C19457 c19457M18468 = c6558M48846.m18468();
                try {
                    if (c19457M18468.m44978()) {
                        C10921 c10921 = new C10921(1130508, c19457M18468.m44979(), c6558M48846.m18469());
                        c10921.m27718(16);
                        c10921.m27717();
                        iM20532 = ((C15396) ((C22856) c19457M18468.m44971(c10921, null, EnumC13269.NO_RETRY)).m51578()).m36862();
                    } else {
                        C8970 c8970 = new C8970(c19457M18468.m44979(), c21474.m48847(), c6558M48846.m18467());
                        C7479 c7479 = new C7479(c19457M18468.m44979());
                        c19457M18468.m44971(c8970, c7479, EnumC13269.NO_RETRY);
                        if (c7479.m5375() != 1 && c7479.m5375() != 4) {
                            iM20532 = c7479.m20532();
                        }
                        c6558M48846.m18471();
                        c19457M18468.close();
                        c6558M48846.m18470();
                        return 0;
                    }
                    c19457M18468.close();
                    c6558M48846.m18470();
                    return iM20532;
                } catch (Throwable th) {
                    try {
                        c19457M18468.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c6558M48846.m18470();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C20728 e) {
            throw C24458.m54708(e);
        }
    }
}
