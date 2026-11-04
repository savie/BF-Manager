package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12319 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f39589;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22411 f39590;

    public C12319(C22411 c22411, OutputStream outputStream) {
        this.f39590 = c22411;
        this.f39589 = outputStream;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) throws IOException {
        C11222.m28280(c1879.f6314, 0L, j);
        while (j > 0) {
            this.f39590.mo15813();
            C9335 c9335 = c1879.f6313;
            int iMin = (int) Math.min(j, c9335.f30348 - c9335.f30347);
            this.f39589.write(c9335.f30343, c9335.f30347, iMin);
            int i = c9335.f30347 + iMin;
            c9335.f30347 = i;
            long j2 = iMin;
            j -= j2;
            c1879.f6314 -= j2;
            if (i == c9335.f30348) {
                c1879.f6313 = c9335.m24585();
                C2624.m8766(c9335);
            }
        }
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public final void flush() throws IOException {
        this.f39589.flush();
    }

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39589.close();
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return this.f39590;
    }

    public final String toString() {
        return "sink(" + this.f39589 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
