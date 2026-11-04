package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes5.dex */
public final class C14602 extends AbstractC0433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f46005;

    public C14602(int[] iArr) {
        this.f46005 = iArr;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۤ */
    public final int mo2248() {
        return this.f46005.length;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۤ */
    public final int mo2249(int i) {
        return this.f46005[i];
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2250(int i) {
        int i2 = i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE;
        int[] iArr = this.f46005;
        int iM26093 = C10127.m26093(i2, iArr);
        if (iM26093 >= iArr.length) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return iArr[iM26093];
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2246(int i) {
        int i2 = 1;
        while (true) {
            int[] iArr = this.f46005;
            if (i2 >= iArr.length) {
                return true;
            }
            if (((long) iArr[i2 - 1]) + ((long) i) > iArr[i2]) {
                return false;
            }
            i2++;
        }
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2247(AbstractC0433 abstractC0433) {
        return (abstractC0433 instanceof C14602) && Arrays.equals(this.f46005, ((C14602) abstractC0433).f46005);
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final void mo2245(byte[] bArr, int i, int i2, byte b, int i3) {
        int[] iArr = this.f46005;
        int iM26093 = C10127.m26093(i2, iArr);
        for (int iM26094 = C10127.m26093(i, iArr); iM26094 < iM26093; iM26094++) {
            bArr[(iArr[iM26094] + i3) - i] = b;
        }
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final void mo2243(int i, int i2, InterfaceC25046 interfaceC25046) {
        int[] iArr = this.f46005;
        int iM26093 = C10127.m26093(i2, iArr);
        for (int iM26094 = C10127.m26093(i, iArr); iM26094 < iM26093; iM26094++) {
            interfaceC25046.mo16641(iM26094, iArr[iM26094]);
        }
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final int mo2240(int i, int i2) {
        int[] iArr = this.f46005;
        return Math.max(0, C10127.m26093(i2, iArr) - C10127.m26093(i, iArr));
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2251() {
        return ((long) this.f46005.length) * 4;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final long mo2241() {
        return (((long) this.f46005.length) * 4) + 48;
    }

    @Override // l.AbstractC0433
    /* JADX INFO: renamed from: ۙ */
    public final void mo2244(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(1);
        int[] iArr = this.f46005;
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
