package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64E4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17540 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 f57016;

    public AbstractC17540(InterfaceC7099 interfaceC7099) {
        if (interfaceC7099 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f57016 = interfaceC7099;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public void mo6066(C1879 c1879, long j) {
        this.f57016.mo6066(c1879, j);
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public void flush() {
        this.f57016.flush();
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return this.f57016.mo6067();
    }

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57016.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f57016.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
