package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩸۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21453 extends AbstractC17529 implements InterfaceC16824 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int f69740;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f69741;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f69742;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f69743;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20478 f69744;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f69745;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C21453(InterfaceC10601 interfaceC10601, int i) {
        this(i, interfaceC10601, C11180.f37872);
    }

    public C21453(int i, InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601, 11);
        this.f69740 = i;
        this.f69745 = bArr;
        this.f69742 = ((C9895) interfaceC10601).m25063() & (-8);
        this.f69743 = null;
    }

    @Override // l.InterfaceC16824
    /* JADX INFO: renamed from: ۙ */
    public final void mo3798(byte[] bArr) {
        this.f69745 = bArr;
    }

    public C21453(InterfaceC10601 interfaceC10601, byte[] bArr, byte[] bArr2) {
        super(interfaceC10601, 11);
        this.f69740 = 1163287;
        this.f69745 = bArr;
        this.f69743 = bArr2;
        this.f69742 = bArr2.length;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C17925(this.f69740, interfaceC19067.mo29449(), this.f69743);
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final void m48077() {
        this.f69741 = 1;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m48076(int i) {
        this.f69742 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48075(InterfaceC20478 interfaceC20478) {
        this.f69744 = interfaceC20478;
    }

    @Override // l.InterfaceC3314
    public final int size() {
        InterfaceC20478 interfaceC20478 = this.f69744;
        return AbstractC12591.m31337((interfaceC20478 != null ? interfaceC20478.size() : 0) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(57L, i, bArr);
        C4850.m13550(this.f69740, i + 4, bArr);
        System.arraycopy(this.f69745, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 28;
        C4850.m13550(0, i + 32, bArr);
        int i4 = i + 36;
        int i5 = i + 40;
        C4850.m13550(this.f69742, i + 44, bArr);
        C4850.m13550(this.f69741, i + 48, bArr);
        int i6 = i + 56;
        if (this.f69744 != null) {
            C4850.m13550(i6 - m31366(), i2, bArr);
            int iMo1806 = this.f69744.mo1806(i6, bArr);
            C4850.m13550(iMo1806, i3, bArr);
            i6 += iMo1806;
        } else {
            C4850.m13550(0L, i2, bArr);
            C4850.m13550(0L, i3, bArr);
        }
        C4850.m13550(0L, i4, bArr);
        C4850.m13550(0L, i5, bArr);
        return i6 - i;
    }
}
