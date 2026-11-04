package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C7891 extends AbstractC0433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f26236;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f26237;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f26238;

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final long mo2241() {
        return 48L;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2251() {
        return 12L;
    }

    public C7891(int i, int i2, int i3) {
        this.f26236 = i;
        this.f26237 = i2;
        this.f26238 = i3;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۤ */
    public final int mo2248() {
        return this.f26238;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۤ */
    public final int mo2249(int i) {
        if (i < 0 || i >= this.f26238) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "Start ordinal "));
        }
        return (i * this.f26237) + this.f26236;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2250(int i) {
        int iM21430 = m21430(i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE);
        if (iM21430 >= this.f26238) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return (iM21430 * this.f26237) + this.f26236;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2246(int i) {
        return this.f26238 <= 1 || this.f26237 >= i;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2247(AbstractC0433 abstractC0433) {
        if (!(abstractC0433 instanceof C7891)) {
            return false;
        }
        C7891 c7891 = (C7891) abstractC0433;
        return this.f26236 == c7891.f26236 && this.f26237 == c7891.f26237 && this.f26238 == c7891.f26238;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final void mo2245(byte[] bArr, int i, int i2, byte b, int i3) {
        int iM21430 = m21430(i);
        int iM21431 = m21430(i2);
        if (iM21430 >= iM21431) {
            return;
        }
        int i4 = this.f26236;
        int i5 = this.f26237;
        if (i5 == 1) {
            int i6 = ((i4 + iM21430) + i3) - i;
            Arrays.fill(bArr, i6, (iM21431 + i6) - iM21430, b);
        } else {
            while (iM21430 < iM21431) {
                bArr[((iM21430 * i5) + (i3 + i4)) - i] = b;
                iM21430++;
            }
        }
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final void mo2243(int i, int i2, InterfaceC25046 interfaceC25046) {
        int iM21430 = m21430(i2);
        for (int iM21431 = m21430(i); iM21431 < iM21430; iM21431++) {
            interfaceC25046.mo16641(iM21431, (this.f26237 * iM21431) + this.f26236);
        }
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final int mo2240(int i, int i2) {
        return Math.max(0, m21430(i2) - m21430(i));
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final void mo2244(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(3);
        long j = ((long) this.f26236) - ((long) i);
        int i2 = (int) j;
        if (j != i2) {
            throw new ArithmeticException();
        }
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeInt(this.f26237);
        dataOutputStream.writeInt(this.f26238);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m21430(int i) {
        long j = ((long) i) - ((long) this.f26236);
        if (j <= 0) {
            return 0;
        }
        int i2 = this.f26237;
        return (int) Math.min(this.f26238, ((j + ((long) i2)) - 1) / ((long) i2));
    }
}
