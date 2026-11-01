package l;

/* JADX INFO: renamed from: l.ۤۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes4.dex */
public class C10001 extends C19879 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC0554 f34170;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f34171;

    @Override // l.C19879
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo25268() {
        return true;
    }

    public C10001(int i, String str, int i2, EnumC0554 enumC0554) {
        super(i, str);
        this.f34171 = i2;
        this.f34170 = enumC0554;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m25267() {
        return this.f34171;
    }

    @Override // l.C19879, l.C13111
    public int hashCode() {
        return super.hashCode() + this.f34171;
    }

    @Override // l.C19879, l.C13111
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C10001) obj).f34171 == this.f34171;
    }

    @Override // l.C19879, l.C13111
    public final String toString() {
        return EnumC23839.m52517(this.f34171, this.f34170) + super.toString();
    }
}
