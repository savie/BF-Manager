package l;

/* JADX INFO: renamed from: l.᩻᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AF */
/* JADX INFO: loaded from: classes.dex */
public final class C23931 extends AbstractC4300 implements InterfaceC5006 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f77507;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f77508;

    public C23931(int i, int[] iArr) {
        super(EnumC0772.f3223);
        if (iArr.length > 65535) {
            throw new RuntimeException("The packed-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f77508 = i;
        this.f77507 = iArr;
    }

    public C23931(byte[] bArr, int i) {
        super(EnumC0772.f3223);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a PackedSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 1) {
            throw new RuntimeException("Invalid sub-opcode byte for a PackedSwitchData pseudo-instruction");
        }
        int iM35087 = C14611.m35087(i + 2, bArr);
        this.f77508 = C14611.m35077(i + 4, bArr);
        this.f77507 = new int[iM35087];
        for (int i2 = 0; i2 < iM35087; i2++) {
            this.f77507[i2] = C14611.m35077((i2 * 4) + i + 8, bArr);
        }
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12835(4);
        c4651.m12841(0);
        c4651.m12841(1);
        int[] iArr = this.f77507;
        c4651.m12833(iArr.length);
        c4651.m12839(this.f77508);
        for (int i2 : iArr) {
            c4651.m12839(i2);
        }
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.PackedSwitchData;
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۙ */
    public final int mo12097(int i) {
        return (i % 2) + (this.f77507.length * 2) + 4;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m52751() {
        return this.f77508;
    }

    @Override // l.InterfaceC5006
    /* JADX INFO: renamed from: ۘ */
    public final int[] mo13878() {
        return this.f77507;
    }
}
