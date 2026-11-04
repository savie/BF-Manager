package l;

/* JADX INFO: renamed from: l.۟᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8177 extends AbstractC8922 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f26965;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f26966;

    public C8177(EnumC22260 enumC22260, String str, int i) {
        super(enumC22260);
        this.f26966 = str;
        this.f26965 = i;
    }

    @Override // l.AbstractC8922, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C8177(this.f34921, this.f26966, this.f26965);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C8177(this.f34921, this.f26966, this.f26965);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        int i = C0719.f2648[this.f34921.ordinal()];
        if (i == 1) {
            return "@this";
        }
        if (i != 2) {
            return i != 3 ? mo5238() : "@Exception";
        }
        return "@parameter_" + this.f26965;
    }
}
