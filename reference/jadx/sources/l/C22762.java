package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes.dex */
public final class C22762 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15302 f73857;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13810 f73858;

    public C22762(C15302 c15302, InterfaceC13810 interfaceC13810) {
        this.f73857 = c15302;
        this.f73858 = interfaceC13810;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        C15302 c15302 = this.f73857;
        c15302.m36749();
        try {
            try {
                long jMo4186 = ((C6354) this.f73858).mo4186(c1879, 8192L);
                c15302.m36747(true);
                return jMo4186;
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C15302 c15302 = this.f73857;
        try {
            try {
                ((C6354) this.f73858).close();
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

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f73857;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f73858 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
