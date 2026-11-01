package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: l.᩷᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21074 implements InterfaceC19664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ByteBuffer f68637;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f68638;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C18958 f68639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f68640;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18958 f68641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18958 f68643;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f68644;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f68645;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f68646;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ShortBuffer f68647;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7669 f68648;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18958 f68650;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f68651;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f68642 = 1.0f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f68649 = 1.0f;

    public C21074() {
        C18958 c18958 = C18958.f61388;
        this.f68639 = c18958;
        this.f68641 = c18958;
        this.f68643 = c18958;
        this.f68650 = c18958;
        ByteBuffer byteBuffer = InterfaceC19664.f63118;
        this.f68645 = byteBuffer;
        this.f68647 = byteBuffer.asShortBuffer();
        this.f68637 = byteBuffer;
        this.f68651 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47485(float f) {
        C2023.m6507(f > 0.0f);
        if (this.f68642 != f) {
            this.f68642 = f;
            this.f68646 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47484(float f) {
        C2023.m6507(f > 0.0f);
        if (this.f68649 != f) {
            this.f68649 = f;
            this.f68646 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m47483(long j) {
        if (this.f68644 >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            long j2 = this.f68638;
            C7669 c7669 = this.f68648;
            c7669.getClass();
            long jM20260 = j2 - ((long) c7669.m20260());
            int i = this.f68650.f61389;
            int i2 = this.f68643.f61389;
            return i == i2 ? C17983.m41830(j, jM20260, this.f68644, RoundingMode.DOWN) : C17983.m41830(j, jM20260 * ((long) i), this.f68644 * ((long) i2), RoundingMode.DOWN);
        }
        return (long) (((double) this.f68642) * j);
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ */
    public final C18958 mo26626(C18958 c18958) throws C8375 {
        if (c18958.f61391 != 2) {
            throw new C8375(c18958);
        }
        int i = this.f68651;
        if (i == -1) {
            i = c18958.f61389;
        }
        this.f68639 = c18958;
        C18958 c18959 = new C18958(i, c18958.f61392, 2);
        this.f68641 = c18959;
        this.f68646 = true;
        return c18959;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo26629() {
        if (this.f68641.f61389 != -1) {
            return Math.abs(this.f68642 - 1.0f) >= 1.0E-4f || Math.abs(this.f68649 - 1.0f) >= 1.0E-4f || this.f68641.f61389 != this.f68639.f61389;
        }
        return false;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ */
    public final void mo16317(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C7669 c7669 = this.f68648;
            c7669.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f68638 += (long) iRemaining;
            c7669.m20262(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۚ */
    public final void mo26628() {
        C7669 c7669 = this.f68648;
        if (c7669 != null) {
            c7669.m20257();
        }
        this.f68640 = true;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۖ */
    public final ByteBuffer mo26624() {
        int iM20261;
        C7669 c7669 = this.f68648;
        if (c7669 != null && (iM20261 = c7669.m20261()) > 0) {
            if (this.f68645.capacity() < iM20261) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM20261).order(ByteOrder.nativeOrder());
                this.f68645 = byteBufferOrder;
                this.f68647 = byteBufferOrder.asShortBuffer();
            } else {
                this.f68645.clear();
                this.f68647.clear();
            }
            c7669.m20259(this.f68647);
            this.f68644 += (long) iM20261;
            this.f68645.limit(iM20261);
            this.f68637 = this.f68645;
        }
        ByteBuffer byteBuffer = this.f68637;
        this.f68637 = InterfaceC19664.f63118;
        return byteBuffer;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo26631() {
        if (!this.f68640) {
            return false;
        }
        C7669 c7669 = this.f68648;
        return c7669 == null || c7669.m20261() == 0;
    }

    @Override // l.InterfaceC19664
    public final void flush() {
        if (mo26629()) {
            C18958 c18958 = this.f68639;
            this.f68643 = c18958;
            C18958 c18959 = this.f68641;
            this.f68650 = c18959;
            if (this.f68646) {
                this.f68648 = new C7669(this.f68642, c18958.f61389, this.f68649, c18958.f61392, c18959.f61389);
            } else {
                C7669 c7669 = this.f68648;
                if (c7669 != null) {
                    c7669.m20258();
                }
            }
        }
        this.f68637 = InterfaceC19664.f63118;
        this.f68638 = 0L;
        this.f68644 = 0L;
        this.f68640 = false;
    }

    @Override // l.InterfaceC19664
    public final void reset() {
        this.f68642 = 1.0f;
        this.f68649 = 1.0f;
        C18958 c18958 = C18958.f61388;
        this.f68639 = c18958;
        this.f68641 = c18958;
        this.f68643 = c18958;
        this.f68650 = c18958;
        ByteBuffer byteBuffer = InterfaceC19664.f63118;
        this.f68645 = byteBuffer;
        this.f68647 = byteBuffer.asShortBuffer();
        this.f68637 = byteBuffer;
        this.f68651 = -1;
        this.f68646 = false;
        this.f68648 = null;
        this.f68638 = 0L;
        this.f68644 = 0L;
        this.f68640 = false;
    }
}
