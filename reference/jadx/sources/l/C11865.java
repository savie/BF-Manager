package l;

/* JADX INFO: renamed from: l.ۨᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U9U0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11865 extends AbstractC14792 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f39807;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C11865(String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 6, str);
        this.f39807 = 6;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C4850.m13546(this.f39807, i, bArr);
        return 2;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + m35440(this.f48357, i2, bArr)) - i;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComDelete[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C18855.m43491(this.f39807, 4, ",fileName=", sb);
        return new String(C22697.m50267(sb, this.f48357, "]"));
    }
}
