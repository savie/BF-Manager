package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2245 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f8045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20591 f8046;

    public C2245(C20591 c20591, InputStream inputStream) {
        this.f8046 = c20591;
        this.f8045 = inputStream;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "byteCount < 0: "));
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.f8046.mo9650();
            C18474 c18474M16406 = c6043.m16406(1);
            int i = this.f8045.read(c18474M16406.f58874, c18474M16406.f58877, (int) Math.min(j, 8192 - c18474M16406.f58877));
            if (i == -1) {
                return -1L;
            }
            c18474M16406.f58877 += i;
            long j2 = i;
            c6043.f20522 += j2;
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
        this.f8045.close();
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f8046;
    }

    public final String toString() {
        return "source(" + this.f8045 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
