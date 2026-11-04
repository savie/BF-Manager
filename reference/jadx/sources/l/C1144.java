package l;

/* JADX INFO: renamed from: l.֨ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1144 extends C7110 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f4232;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC19840 f4233;

    @Override // l.C7110
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo4218() {
        return true;
    }

    public C1144(int i, String str, int i2, EnumC19840 enumC19840) {
        super(i, str);
        this.f4232 = i2;
        this.f4233 = enumC19840;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m4217() {
        return this.f4232;
    }

    @Override // l.C7110, l.C18941
    public int hashCode() {
        return super.hashCode() + this.f4232;
    }

    @Override // l.C7110, l.C18941
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C1144) obj).f4232 == this.f4232;
    }

    @Override // l.C7110, l.C18941
    public final String toString() {
        return EnumC16856.m39774(this.f4232, this.f4233) + super.toString();
    }
}
