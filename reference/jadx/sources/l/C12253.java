package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12253 extends AbstractC24188 implements InterfaceC18220 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f39414;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f39415;

    public C12253(int[] iArr, int[] iArr2) {
        super(EnumC7779.f25668);
        if (iArr.length != iArr2.length) {
            throw new RuntimeException("The number of keys and targets don't match");
        }
        if (iArr2.length == 0) {
            throw new RuntimeException("The sparse-switch data must contain at least 1 key/target");
        }
        if (iArr2.length > 65535) {
            throw new RuntimeException("The sparse-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f39415 = iArr;
        this.f39414 = iArr2;
    }

    public C12253(byte[] bArr, int i) {
        super(EnumC7779.f25668);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a SparseSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 2) {
            throw new RuntimeException("Invalid sub-opcode byte for a SparseSwitchData pseudo-instruction");
        }
        int iM31238 = C12556.m31238(i + 2, bArr);
        this.f39415 = new int[iM31238];
        this.f39414 = new int[iM31238];
        for (int i2 = 0; i2 < iM31238; i2++) {
            int i3 = i + 4;
            int i4 = i2 * 4;
            this.f39415[i2] = C12556.m31233(i3 + i4, bArr);
            this.f39414[i2] = C12556.m31233((iM31238 * 4) + i3 + i4, bArr);
        }
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54131(4);
        c24166.m54138(0);
        c24166.m54138(2);
        int[] iArr = this.f39414;
        c24166.m54139(iArr.length);
        if (iArr.length > 0) {
            int[] iArr2 = this.f39415;
            c24166.m54134(iArr2[0]);
            for (int i2 = 1; i2 < iArr2.length; i2++) {
                c24166.m54134(iArr2[i2]);
            }
            for (int i3 : iArr) {
                c24166.m54134(i3);
            }
        }
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.SparseSwitchData;
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۙ */
    public final int mo2082(int i) {
        return (i % 2) + (this.f39414.length * 4) + 2;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m30631() {
        return this.f39414.length;
    }

    @Override // l.InterfaceC18220
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] mo30629() {
        return this.f39414;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator m30630() {
        return new C3304(this);
    }
}
