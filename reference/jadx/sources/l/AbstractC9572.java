package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 14DY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9572 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10008 f32284;

    public AbstractC9572(InterfaceC10008 interfaceC10008) {
        if (interfaceC10008 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f32284 = interfaceC10008;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10008 m24438() {
        return this.f32284;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public long mo2293(C6043 c6043, long j) {
        return this.f32284.mo2293(c6043, 8192L);
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f32284.mo2292();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32284.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f32284.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
