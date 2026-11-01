package l;

import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ܺܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28PU */
/* JADX INFO: loaded from: classes4.dex */
public class C16033 extends AbstractC18148 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8977 f51908 = new C8977();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f51909;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f51910;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7648 f51911;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f51912;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f51913;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51914;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51915;

    public C16033(int i, int i2) {
        this.f51914 = i;
        this.f51913 = i2;
    }

    static {
        C11572.m28868("media3.decoder");
    }

    @EnsuresNonNull({e.m})
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m38027(int i) {
        int i2 = i + this.f51913;
        ByteBuffer byteBuffer = this.f51912;
        if (byteBuffer == null) {
            this.f51912 = m38024(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f51912 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM38024 = m38024(i3);
        byteBufferM38024.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM38024.put(byteBuffer);
        }
        this.f51912 = byteBufferM38024;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m38026() {
        return m42265(1073741824);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m38025() {
        ByteBuffer byteBuffer = this.f51912;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f51909;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // l.AbstractC18148
    /* JADX INFO: renamed from: ܰ */
    public void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f51912;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f51909;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f51915 = false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private ByteBuffer m38024(int i) {
        int i2 = this.f51914;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f51912;
        throw new C20971(C8015.m21119("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", MotionUtils.EASING_TYPE_FORMAT_END, i));
    }
}
