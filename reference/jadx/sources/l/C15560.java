package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: l.ܳ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NO */
/* JADX INFO: loaded from: classes5.dex */
public final class C15560 implements InterfaceC22274 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13565 f50606;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f50608;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13565 f50609;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13565 f50610;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f50611;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13565 f50612;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ShortBuffer f50613;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50614;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f50616;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ByteBuffer f50617;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f50618;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20036 f50619;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f50620;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f50607 = 1.0f;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f50615 = 1.0f;

    public C15560() {
        C13565 c13565 = C13565.f43062;
        this.f50606 = c13565;
        this.f50610 = c13565;
        this.f50609 = c13565;
        this.f50612 = c13565;
        ByteBuffer byteBuffer = InterfaceC22274.f72135;
        this.f50617 = byteBuffer;
        this.f50613 = byteBuffer.asShortBuffer();
        this.f50611 = byteBuffer;
        this.f50620 = -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37282(float f) {
        C20782.m47565(f > 0.0f);
        if (this.f50607 != f) {
            this.f50607 = f;
            this.f50614 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37279(float f) {
        C20782.m47565(f > 0.0f);
        if (this.f50615 != f) {
            this.f50615 = f;
            this.f50614 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m37277(long j) {
        if (this.f50608 >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            long j2 = this.f50618;
            C20036 c20036 = this.f50619;
            c20036.getClass();
            long jM46086 = j2 - ((long) c20036.m46086());
            int i = this.f50612.f43066;
            int i2 = this.f50609.f43066;
            return i == i2 ? C7116.m19477(j, jM46086, this.f50608, RoundingMode.DOWN) : C7116.m19477(j, jM46086 * ((long) i), this.f50608 * ((long) i2), RoundingMode.DOWN);
        }
        return (long) (((double) this.f50607) * j);
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13565 mo37278(C13565 c13565) throws C5120 {
        if (c13565.f43064 != 2) {
            throw new C5120(c13565);
        }
        int i = this.f50620;
        if (i == -1) {
            i = c13565.f43066;
        }
        this.f50606 = c13565;
        C13565 c13566 = new C13565(i, c13565.f43065, 2);
        this.f50610 = c13566;
        this.f50614 = true;
        return c13566;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo37280() {
        if (this.f50610.f43066 != -1) {
            return Math.abs(this.f50607 - 1.0f) >= 1.0E-4f || Math.abs(this.f50615 - 1.0f) >= 1.0E-4f || this.f50610.f43066 != this.f50606.f43066;
        }
        return false;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ */
    public final void mo32890(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C20036 c20036 = this.f50619;
            c20036.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f50618 += (long) iRemaining;
            c20036.m46088(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo37281() {
        C20036 c20036 = this.f50619;
        if (c20036 != null) {
            c20036.m46089();
        }
        this.f50616 = true;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer mo37284() {
        int iM46087;
        C20036 c20036 = this.f50619;
        if (c20036 != null && (iM46087 = c20036.m46087()) > 0) {
            if (this.f50617.capacity() < iM46087) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM46087).order(ByteOrder.nativeOrder());
                this.f50617 = byteBufferOrder;
                this.f50613 = byteBufferOrder.asShortBuffer();
            } else {
                this.f50617.clear();
                this.f50613.clear();
            }
            c20036.m46085(this.f50613);
            this.f50608 += (long) iM46087;
            this.f50617.limit(iM46087);
            this.f50611 = this.f50617;
        }
        ByteBuffer byteBuffer = this.f50611;
        this.f50611 = InterfaceC22274.f72135;
        return byteBuffer;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo37283() {
        if (!this.f50616) {
            return false;
        }
        C20036 c20036 = this.f50619;
        return c20036 == null || c20036.m46087() == 0;
    }

    @Override // l.InterfaceC22274
    public final void flush() {
        if (mo37280()) {
            C13565 c13565 = this.f50606;
            this.f50609 = c13565;
            C13565 c13566 = this.f50610;
            this.f50612 = c13566;
            if (this.f50614) {
                this.f50619 = new C20036(this.f50607, c13565.f43066, this.f50615, c13565.f43065, c13566.f43066);
            } else {
                C20036 c20036 = this.f50619;
                if (c20036 != null) {
                    c20036.m46084();
                }
            }
        }
        this.f50611 = InterfaceC22274.f72135;
        this.f50618 = 0L;
        this.f50608 = 0L;
        this.f50616 = false;
    }

    @Override // l.InterfaceC22274
    public final void reset() {
        this.f50607 = 1.0f;
        this.f50615 = 1.0f;
        C13565 c13565 = C13565.f43062;
        this.f50606 = c13565;
        this.f50610 = c13565;
        this.f50609 = c13565;
        this.f50612 = c13565;
        ByteBuffer byteBuffer = InterfaceC22274.f72135;
        this.f50617 = byteBuffer;
        this.f50613 = byteBuffer.asShortBuffer();
        this.f50611 = byteBuffer;
        this.f50620 = -1;
        this.f50614 = false;
        this.f50619 = null;
        this.f50618 = 0L;
        this.f50608 = 0L;
        this.f50616 = false;
    }
}
