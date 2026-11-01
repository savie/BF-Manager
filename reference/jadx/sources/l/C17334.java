package l;

import java.io.DataOutputStream;

/* JADX INFO: renamed from: l.ܿۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C17334 implements InterfaceC20157 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13538 f55149;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f55150;

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ܰ */
    public final long mo5918(int i, int i2) {
        return mo5910();
    }

    public C17334(AbstractC13538 abstractC13538, byte[] bArr) {
        if (abstractC13538.mo19949() != bArr.length || bArr.length == 0) {
            throw new IllegalArgumentException("Invalid literal patch layer");
        }
        this.f55149 = abstractC13538;
        this.f55150 = bArr;
    }

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ۙ */
    public final void mo5912(final int i, final byte[] bArr, int i2, final int i3) {
        this.f55149.mo19944(i, i2, new InterfaceC15924() { // from class: l.۫ۨ᩹
            @Override // l.InterfaceC15924
            /* JADX INFO: renamed from: ۙ */
            public final void mo2135(int i4, int i5) {
                C17334.m40305(this.f41419, bArr, i3, i, i4, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40305(C17334 c17334, byte[] bArr, int i, int i2, int i3, int i4) {
        bArr[(i + i4) - i2] = c17334.f55150[i3];
    }

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ۙ */
    public final void mo5914(final byte[] bArr, final int i, int i2, final long[] jArr) {
        this.f55149.mo19944(i, i2, new InterfaceC15924() { // from class: l.֡ۨ᩹
            @Override // l.InterfaceC15924
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo2135(int i3, int i4) {
                C17334.m40304(this.f1888, i, bArr, jArr, i3, i4);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40304(C17334 c17334, int i, byte[] bArr, long[] jArr, int i2, int i3) {
        int i4 = i3 - i;
        bArr[i4] = c17334.f55150[i2];
        int i5 = i4 >>> 6;
        jArr[i5] = jArr[i5] | (1 << (i4 & 63));
    }

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ۙ */
    public final void mo5911(final int i, int i2, final long[] jArr) {
        this.f55149.mo19944(i, i2, new InterfaceC15924() { // from class: l.ܽۨ᩹
            @Override // l.InterfaceC15924
            /* JADX INFO: renamed from: ۙ */
            public final void mo2135(int i3, int i4) {
                int i5 = i4 - i;
                int i6 = i5 >>> 6;
                long[] jArr2 = jArr;
                jArr2[i6] = jArr2[i6] | (1 << (i5 & 63));
            }
        });
    }

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5915(int i, int i2) {
        return this.f55149.mo19942(i, i2) != 0;
    }

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ۚ */
    public final long mo5917() {
        return this.f55149.mo19952() + ((long) this.f55150.length);
    }

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ۙ */
    public final long mo5910() {
        return (((long) this.f55149.mo19949()) * 9) + 128;
    }

    @Override // l.InterfaceC20157
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5916(InterfaceC20157 interfaceC20157) {
        return (interfaceC20157 instanceof C17334) && this.f55149.mo19948(((C17334) interfaceC20157).f55149);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40306(DataOutputStream dataOutputStream, int i, int i2) {
        AbstractC13538 abstractC13538 = this.f55149;
        dataOutputStream.writeInt(abstractC13538.mo19942(i, i2));
        for (int i3 = 0; i3 < abstractC13538.mo19949(); i3++) {
            int iMo19950 = abstractC13538.mo19950(i3);
            if (iMo19950 >= i && iMo19950 < i2) {
                dataOutputStream.writeInt(iMo19950 - i);
                dataOutputStream.writeByte(this.f55150[i3]);
            }
        }
    }
}
