package l;

/* JADX INFO: renamed from: l.ۢۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BBC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10030 extends C18959 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f32156;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int[] f32157;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f32158;

    public C10030(InterfaceC22952 interfaceC22952) {
        super(EnumC24203.SWITCH_DATA, 0);
        this.f32156 = interfaceC22952.getSize();
        this.f32158 = interfaceC22952.mo45886();
        this.f32157 = interfaceC22952.mo45887();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25879(int i) {
        for (int i2 = 0; i2 < this.f32156; i2++) {
            int[] iArr = this.f32157;
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int m25878() {
        return this.f32156;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m25880() {
        return this.f32158;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m25881() {
        return this.f32157;
    }

    @Override // l.C18959
    public final String toString() {
        StringBuilder sbM27333 = C10732.m27333("switch-data {");
        for (int i = 0; i < this.f32156; i++) {
            sbM27333.append(this.f32158[i]);
            sbM27333.append("->");
            sbM27333.append(C8314.m22396(this.f32157[i]));
            sbM27333.append(", ");
        }
        sbM27333.append('}');
        m44030(sbM27333);
        return sbM27333.toString();
    }
}
