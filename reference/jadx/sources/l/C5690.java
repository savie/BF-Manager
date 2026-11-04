package l;

import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ۚܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28PU */
/* JADX INFO: loaded from: classes3.dex */
public class C5690 extends AbstractC13587 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ByteBuffer f19651;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f19652;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15648 f19653;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f19654;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f19655;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22844 f19656 = new C22844();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f19657;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f19658;

    public C5690(int i, int i2) {
        this.f19658 = i;
        this.f19657 = i2;
    }

    static {
        C21616.m49139("media3.decoder");
    }

    @EnsuresNonNull({e.m})
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m16711(int i) {
        int i2 = i + this.f19657;
        ByteBuffer byteBuffer = this.f19651;
        if (byteBuffer == null) {
            this.f19651 = m16710(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f19651 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM16710 = m16710(i3);
        byteBufferM16710.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM16710.put(byteBuffer);
        }
        this.f19651 = byteBufferM16710;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m16712() {
        return m33310(1073741824);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m16713() {
        ByteBuffer byteBuffer = this.f19651;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f19655;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // l.AbstractC13587
    /* JADX INFO: renamed from: ᩸ */
    public void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f19651;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f19655;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f19654 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private ByteBuffer m16710(int i) {
        int i2 = this.f19658;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f19651;
        throw new C13147(C0703.m3016("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", MotionUtils.EASING_TYPE_FORMAT_END, i));
    }
}
