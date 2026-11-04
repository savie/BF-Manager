package l;

/* JADX INFO: renamed from: l.᩹ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AF */
/* JADX INFO: loaded from: classes.dex */
public final class C23442 extends AbstractC24188 implements InterfaceC18220 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f75879;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f75880;

    public C23442(int i, int[] iArr) {
        super(EnumC7779.f25668);
        if (iArr.length > 65535) {
            throw new RuntimeException("The packed-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f75880 = i;
        this.f75879 = iArr;
    }

    public C23442(byte[] bArr, int i) {
        super(EnumC7779.f25668);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a PackedSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 1) {
            throw new RuntimeException("Invalid sub-opcode byte for a PackedSwitchData pseudo-instruction");
        }
        int iM31238 = C12556.m31238(i + 2, bArr);
        this.f75880 = C12556.m31233(i + 4, bArr);
        this.f75879 = new int[iM31238];
        for (int i2 = 0; i2 < iM31238; i2++) {
            this.f75879[i2] = C12556.m31233((i2 * 4) + i + 8, bArr);
        }
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54131(4);
        c24166.m54138(0);
        c24166.m54138(1);
        int[] iArr = this.f75879;
        c24166.m54139(iArr.length);
        c24166.m54134(this.f75880);
        for (int i2 : iArr) {
            c24166.m54134(i2);
        }
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.PackedSwitchData;
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۙ */
    public final int mo2082(int i) {
        return (i % 2) + (this.f75879.length * 2) + 4;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m52659() {
        return this.f75880;
    }

    @Override // l.InterfaceC18220
    /* JADX INFO: renamed from: ۚ */
    public final int[] mo30629() {
        return this.f75879;
    }
}
