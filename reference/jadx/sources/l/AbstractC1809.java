package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64E4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1809 implements InterfaceC8597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8597 f6966;

    public AbstractC1809(InterfaceC8597 interfaceC8597) {
        if (interfaceC8597 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f6966 = interfaceC8597;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5901(C6043 c6043, long j) {
        this.f6966.mo5901(c6043, j);
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public void flush() {
        this.f6966.flush();
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20591 mo5902() {
        return this.f6966.mo5902();
    }

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6966.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f6966.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
