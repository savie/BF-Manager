package l;

/* JADX INFO: renamed from: l.ۙۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4647 implements InterfaceC14186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f16448;

    public C4647(int[] iArr) {
        this.f16448 = iArr;
    }

    @Override // l.InterfaceC14186
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo14502(int i) {
        m14498(i);
        if (i == 0) {
            return 0;
        }
        return this.f16448[i - 1] + 1;
    }

    @Override // l.InterfaceC14186
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14500(int i) {
        m14498(i);
        return this.f16448[i];
    }

    @Override // l.InterfaceC14186
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo14501(int i) {
        m14498(i);
        int[] iArr = this.f16448;
        return iArr[i] + (i == iArr.length - 1 ? 0 : 1);
    }

    @Override // l.InterfaceC14186
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14499() {
        return this.f16448.length;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m14498(int i) {
        int[] iArr = this.f16448;
        if (i < 0 || i >= iArr.length) {
            StringBuilder sbM12235 = C3769.m12235(i, "Wrong line: ", ". Available lines count: ");
            sbM12235.append(iArr.length);
            throw new IndexOutOfBoundsException(sbM12235.toString());
        }
    }
}
