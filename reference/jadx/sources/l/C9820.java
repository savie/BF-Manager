package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9820 extends AbstractC4300 implements InterfaceC5006 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f33566;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f33567;

    public C9820(int[] iArr, int[] iArr2) {
        super(EnumC0772.f3223);
        if (iArr.length != iArr2.length) {
            throw new RuntimeException("The number of keys and targets don't match");
        }
        if (iArr2.length == 0) {
            throw new RuntimeException("The sparse-switch data must contain at least 1 key/target");
        }
        if (iArr2.length > 65535) {
            throw new RuntimeException("The sparse-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f33567 = iArr;
        this.f33566 = iArr2;
    }

    public C9820(byte[] bArr, int i) {
        super(EnumC0772.f3223);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a SparseSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 2) {
            throw new RuntimeException("Invalid sub-opcode byte for a SparseSwitchData pseudo-instruction");
        }
        int iM35087 = C14611.m35087(i + 2, bArr);
        this.f33567 = new int[iM35087];
        this.f33566 = new int[iM35087];
        for (int i2 = 0; i2 < iM35087; i2++) {
            int i3 = i + 4;
            int i4 = i2 * 4;
            this.f33567[i2] = C14611.m35077(i3 + i4, bArr);
            this.f33566[i2] = C14611.m35077((iM35087 * 4) + i3 + i4, bArr);
        }
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12835(4);
        c4651.m12841(0);
        c4651.m12841(2);
        int[] iArr = this.f33566;
        c4651.m12833(iArr.length);
        if (iArr.length > 0) {
            int[] iArr2 = this.f33567;
            c4651.m12839(iArr2[0]);
            for (int i2 = 1; i2 < iArr2.length; i2++) {
                c4651.m12839(iArr2[i2]);
            }
            for (int i3 : iArr) {
                c4651.m12839(i3);
            }
        }
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.SparseSwitchData;
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۙ */
    public final int mo12097(int i) {
        return (i % 2) + (this.f33566.length * 4) + 2;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m24921() {
        return this.f33566.length;
    }

    @Override // l.InterfaceC5006
    /* JADX INFO: renamed from: ۘ */
    public final int[] mo13878() {
        return this.f33566;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Iterator m24920() {
        return new C14759(this);
    }
}
