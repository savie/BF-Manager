package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6354 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f21479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22411 f21480;

    public C6354(C22411 c22411, InputStream inputStream) {
        this.f21480 = c22411;
        this.f21479 = inputStream;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "byteCount < 0: "));
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.f21480.mo15813();
            C9335 c9335M6434 = c1879.m6434(1);
            int i = this.f21479.read(c9335M6434.f30343, c9335M6434.f30348, (int) Math.min(j, 8192 - c9335M6434.f30348));
            if (i == -1) {
                return -1L;
            }
            c9335M6434.f30348 += i;
            long j2 = i;
            c1879.f6314 += j2;
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21479.close();
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f21480;
    }

    public final String toString() {
        return "source(" + this.f21479 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
