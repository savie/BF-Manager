package l;

/* JADX INFO: renamed from: l.۟᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7764 implements InterfaceC10587 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f25615;

    public C7764(int[] iArr) {
        this.f25615 = iArr;
    }

    @Override // l.InterfaceC10587
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo20436(int i) {
        m20432(i);
        if (i == 0) {
            return 0;
        }
        return this.f25615[i - 1] + 1;
    }

    @Override // l.InterfaceC10587
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo20434(int i) {
        m20432(i);
        return this.f25615[i];
    }

    @Override // l.InterfaceC10587
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo20435(int i) {
        m20432(i);
        int[] iArr = this.f25615;
        return iArr[i] + (i == iArr.length - 1 ? 0 : 1);
    }

    @Override // l.InterfaceC10587
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo20433() {
        return this.f25615.length;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m20432(int i) {
        int[] iArr = this.f25615;
        if (i < 0 || i >= iArr.length) {
            StringBuilder sbM40153 = C17214.m40153(i, "Wrong line: ", ". Available lines count: ");
            sbM40153.append(iArr.length);
            throw new IndexOutOfBoundsException(sbM40153.toString());
        }
    }
}
