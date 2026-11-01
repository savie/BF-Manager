package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֫ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C1604 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23478 f6482;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5838 f6483;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f6484;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f6485;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6486;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f6487;

    public C1604(C5838 c5838) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f6485 = arrayDeque;
        this.f6482 = new C23478();
        this.f6484 = c5838 == null ? 0 : c5838.f19808;
        if (c5838 != null) {
            arrayDeque.push(c5838);
            this.f6483 = m5456();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m5462() {
        return this.f6487;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5465(int i) {
        try {
            m5457(i, true, null);
        } catch (C1105 e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5460(int i, InterfaceC5614 interfaceC5614) throws C1105 {
        m5457(i, true, interfaceC5614);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m5463(int i) {
        if (i >= 0) {
            int i2 = this.f6487;
            if (((long) i2) + ((long) i) <= this.f6484) {
                try {
                    m5457(i2 + i, false, null);
                    return;
                } catch (C1105 e) {
                    throw new AssertionError(e);
                }
            }
        }
        throw new IndexOutOfBoundsException("Invalid dirty stream skip length");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5459(int i) {
        this.f6482.m51736(i, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5838 m5458() {
        return this.f6482.m51734();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m5464() {
        return this.f6482.m51738();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5461(long j) {
        this.f6482.m51737(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5457(int i, boolean z, InterfaceC5614 interfaceC5614) throws C1105 {
        if (i < this.f6487 || i > this.f6484) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Invalid dirty stream target "));
        }
        int i2 = 0;
        while (this.f6487 < i) {
            int i3 = i2 + 1;
            if ((i2 & 255) == 0 && interfaceC5614 != null && interfaceC5614.mo2357()) {
                throw new C1105();
            }
            C5838 c5838 = this.f6483;
            if (c5838 == null) {
                throw new IllegalStateException("Dirty stream ended early");
            }
            int iMin = Math.min(i - this.f6487, c5838.f19808 - this.f6486);
            if (z) {
                boolean zM16052 = this.f6483.m16052();
                C23478 c23478 = this.f6482;
                if (zM16052) {
                    c23478.m51735(this.f6486, iMin, this.f6483.f19807);
                } else {
                    c23478.m51736(iMin, this.f6483.f19802);
                }
            }
            this.f6487 += iMin;
            int i4 = this.f6486 + iMin;
            this.f6486 = i4;
            if (i4 == this.f6483.f19808) {
                this.f6483 = m5456();
                this.f6486 = 0;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C5838 m5456() {
        while (true) {
            ArrayDeque arrayDeque = this.f6485;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            C5838 c5838 = (C5838) arrayDeque.pop();
            if (c5838.m16054()) {
                return c5838;
            }
            arrayDeque.push(c5838.f19806);
            arrayDeque.push(c5838.f19804);
        }
    }
}
