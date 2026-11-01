package l;

/* JADX INFO: renamed from: l.ۘ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K4WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3595 extends AbstractC18413 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f13228;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f13229;

    public C3595(EnumC9947 enumC9947, String str, int i) {
        super(enumC9947);
        this.f13229 = str;
        this.f13228 = i;
    }

    @Override // l.AbstractC18413, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C3595(this.f23823, this.f13229, this.f13228);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C3595(this.f23823, this.f13229, this.f13228);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        int i = C12769.f42582[this.f23823.ordinal()];
        if (i == 1) {
            return "@this";
        }
        if (i != 2) {
            return i != 3 ? mo3326() : "@Exception";
        }
        return "@parameter_" + this.f13228;
    }
}
