package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10827 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15302 f34306;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7099 f34307;

    public C10827(C15302 c15302, InterfaceC7099 interfaceC7099) {
        this.f34306 = c15302;
        this.f34307 = interfaceC7099;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) throws IOException {
        C11222.m28280(c1879.f6314, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C9335 c9335 = c1879.f6313;
            while (j2 < 65536) {
                j2 += (long) (c9335.f30348 - c9335.f30347);
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c9335 = c9335.f30344;
            }
            C15302 c15302 = this.f34306;
            c15302.m36749();
            try {
                try {
                    ((C12319) this.f34307).mo6066(c1879, j2);
                    j -= j2;
                    c15302.m36747(true);
                } catch (IOException e) {
                    if (!c15302.m36748()) {
                        throw e;
                    }
                    throw c15302.mo5607(e);
                }
            } catch (Throwable th) {
                c15302.m36747(false);
                throw th;
            }
        }
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public final void flush() throws IOException {
        C15302 c15302 = this.f34306;
        c15302.m36749();
        try {
            try {
                ((C12319) this.f34307).flush();
                c15302.m36747(true);
            } catch (IOException e) {
                if (!c15302.m36748()) {
                    throw e;
                }
                throw c15302.mo5607(e);
            }
        } catch (Throwable th) {
            c15302.m36747(false);
            throw th;
        }
    }

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C15302 c15302 = this.f34306;
        c15302.m36749();
        try {
            try {
                ((C12319) this.f34307).close();
                c15302.m36747(true);
            } catch (IOException e) {
                if (!c15302.m36748()) {
                    throw e;
                }
                throw c15302.mo5607(e);
            }
        } catch (Throwable th) {
            c15302.m36747(false);
            throw th;
        }
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return this.f34306;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f34307 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
