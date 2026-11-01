package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C11421 extends AbstractC13538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38462;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f38463;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38464;

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final long mo19943() {
        return 48L;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ܰ */
    public final long mo19952() {
        return 12L;
    }

    public C11421(int i, int i2, int i3) {
        this.f38462 = i;
        this.f38463 = i2;
        this.f38464 = i3;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۨ */
    public final int mo19949() {
        return this.f38464;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۨ */
    public final int mo19950(int i) {
        if (i < 0 || i >= this.f38464) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Start ordinal "));
        }
        return (i * this.f38463) + this.f38462;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ܰ */
    public final int mo19951(int i) {
        int iM28528 = m28528(i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE);
        if (iM28528 >= this.f38464) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return (iM28528 * this.f38463) + this.f38462;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19947(int i) {
        return this.f38464 <= 1 || this.f38463 >= i;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19948(AbstractC13538 abstractC13538) {
        if (!(abstractC13538 instanceof C11421)) {
            return false;
        }
        C11421 c11421 = (C11421) abstractC13538;
        return this.f38462 == c11421.f38462 && this.f38463 == c11421.f38463 && this.f38464 == c11421.f38464;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final void mo19946(byte[] bArr, int i, int i2, byte b, int i3) {
        int iM28528 = m28528(i);
        int iM28529 = m28528(i2);
        if (iM28528 >= iM28529) {
            return;
        }
        int i4 = this.f38462;
        int i5 = this.f38463;
        if (i5 == 1) {
            int i6 = ((i4 + iM28528) + i3) - i;
            Arrays.fill(bArr, i6, (iM28529 + i6) - iM28528, b);
        } else {
            while (iM28528 < iM28529) {
                bArr[((iM28528 * i5) + (i3 + i4)) - i] = b;
                iM28528++;
            }
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final void mo19944(int i, int i2, InterfaceC15924 interfaceC15924) {
        int iM28528 = m28528(i2);
        for (int iM28529 = m28528(i); iM28529 < iM28528; iM28529++) {
            interfaceC15924.mo2135(iM28529, (this.f38463 * iM28529) + this.f38462);
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final int mo19942(int i, int i2) {
        return Math.max(0, m28528(i2) - m28528(i));
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final void mo19945(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(3);
        long j = ((long) this.f38462) - ((long) i);
        int i2 = (int) j;
        if (j != i2) {
            throw new ArithmeticException();
        }
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeInt(this.f38463);
        dataOutputStream.writeInt(this.f38464);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int m28528(int i) {
        long j = ((long) i) - ((long) this.f38462);
        if (j <= 0) {
            return 0;
        }
        int i2 = this.f38463;
        return (int) Math.min(this.f38464, ((j + ((long) i2)) - 1) / ((long) i2));
    }
}
