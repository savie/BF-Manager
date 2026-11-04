package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14DY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16048 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13810 f52048;

    public AbstractC16048(InterfaceC13810 interfaceC13810) {
        if (interfaceC13810 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f52048 = interfaceC13810;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13810 m38210() {
        return this.f52048;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public long mo4186(C1879 c1879, long j) {
        return this.f52048.mo4186(c1879, 8192L);
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f52048.mo4181();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52048.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f52048.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
