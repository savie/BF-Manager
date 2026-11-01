package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11419 implements InterfaceC8597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f38460;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20591 f38461;

    public C11419(C20591 c20591, OutputStream outputStream) {
        this.f38461 = c20591;
        this.f38460 = outputStream;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) throws IOException {
        C15653.m37329(c6043.f20522, 0L, j);
        while (j > 0) {
            this.f38461.mo9650();
            C18474 c18474 = c6043.f20521;
            int iMin = (int) Math.min(j, c18474.f58877 - c18474.f58875);
            this.f38460.write(c18474.f58874, c18474.f58875, iMin);
            int i = c18474.f58875 + iMin;
            c18474.f58875 = i;
            long j2 = iMin;
            j -= j2;
            c6043.f20522 -= j2;
            if (i == c18474.f58877) {
                c6043.f20521 = c18474.m42844();
                C7891.m20825(c18474);
            }
        }
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public final void flush() throws IOException {
        this.f38460.flush();
    }

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38460.close();
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return this.f38461;
    }

    public final String toString() {
        return "sink(" + this.f38460 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
