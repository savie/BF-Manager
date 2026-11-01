package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes3.dex */
public final class C9574 extends AbstractC13538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f32285;

    public C9574(int[] iArr) {
        this.f32285 = iArr;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۨ */
    public final int mo19949() {
        return this.f32285.length;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۨ */
    public final int mo19950(int i) {
        return this.f32285[i];
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ܰ */
    public final int mo19951(int i) {
        int i2 = i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE;
        int[] iArr = this.f32285;
        int iM14116 = C5070.m14116(i2, iArr);
        if (iM14116 >= iArr.length) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return iArr[iM14116];
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19947(int i) {
        int i2 = 1;
        while (true) {
            int[] iArr = this.f32285;
            if (i2 >= iArr.length) {
                return true;
            }
            if (((long) iArr[i2 - 1]) + ((long) i) > iArr[i2]) {
                return false;
            }
            i2++;
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19948(AbstractC13538 abstractC13538) {
        return (abstractC13538 instanceof C9574) && Arrays.equals(this.f32285, ((C9574) abstractC13538).f32285);
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final void mo19946(byte[] bArr, int i, int i2, byte b, int i3) {
        int[] iArr = this.f32285;
        int iM14116 = C5070.m14116(i2, iArr);
        for (int iM14117 = C5070.m14116(i, iArr); iM14117 < iM14116; iM14117++) {
            bArr[(iArr[iM14117] + i3) - i] = b;
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final void mo19944(int i, int i2, InterfaceC15924 interfaceC15924) {
        int[] iArr = this.f32285;
        int iM14116 = C5070.m14116(i2, iArr);
        for (int iM14117 = C5070.m14116(i, iArr); iM14117 < iM14116; iM14117++) {
            interfaceC15924.mo2135(iM14117, iArr[iM14117]);
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final int mo19942(int i, int i2) {
        int[] iArr = this.f32285;
        return Math.max(0, C5070.m14116(i2, iArr) - C5070.m14116(i, iArr));
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ܰ */
    public final long mo19952() {
        return ((long) this.f32285.length) * 4;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final long mo19943() {
        return (((long) this.f32285.length) * 4) + 48;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ */
    public final void mo19945(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(1);
        int[] iArr = this.f32285;
        dataOutputStream.writeInt(iArr.length);
        for (int i2 : iArr) {
            long j = ((long) i2) - ((long) i);
            int i3 = (int) j;
            if (j != i3) {
                throw new ArithmeticException();
            }
            dataOutputStream.writeInt(i3);
        }
    }
}
