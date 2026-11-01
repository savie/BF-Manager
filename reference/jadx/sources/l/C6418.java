package l;

/* JADX INFO: renamed from: l.ۜ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U582 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6418 extends AbstractC18413 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f21734;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f21735;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f21736;

    public C6418(String str, String str2, String str3) {
        super(EnumC9947.STATIC_FIELD);
        this.f21734 = str3;
        this.f21735 = str2;
        this.f21736 = str;
    }

    @Override // l.AbstractC18413, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C6418(this.f21736, this.f21735, this.f21734);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C6418(this.f21736, this.f21735, this.f21734);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return C19378.m44398(this.f21736) + "." + this.f21735;
    }
}
