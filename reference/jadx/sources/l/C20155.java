package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20155 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16627 f65470;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10008 f65471;

    public C20155(C16627 c16627, InterfaceC10008 interfaceC10008) {
        this.f65470 = c16627;
        this.f65471 = interfaceC10008;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        C16627 c16627 = this.f65470;
        c16627.m39092();
        try {
            try {
                long jMo2293 = ((C2245) this.f65471).mo2293(c6043, 8192L);
                c16627.m39093(true);
                return jMo2293;
            } catch (IOException e) {
                if (!c16627.m39094()) {
                    throw e;
                }
                throw c16627.mo16598(e);
            }
        } catch (Throwable th) {
            c16627.m39093(false);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C16627 c16627 = this.f65470;
        try {
            try {
                ((C2245) this.f65471).close();
                c16627.m39093(true);
            } catch (IOException e) {
                if (!c16627.m39094()) {
                    throw e;
                }
                throw c16627.mo16598(e);
            }
        } catch (Throwable th) {
            c16627.m39093(false);
            throw th;
        }
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f65470;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f65471 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
