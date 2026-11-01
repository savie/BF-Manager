package l;

/* JADX INFO: renamed from: l.ۚ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5007 extends AbstractC18413 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f17419;

    public C5007(String str) {
        super(EnumC9947.NEW);
        this.f17419 = str;
    }

    @Override // l.AbstractC18413, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C5007(this.f17419);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C5007(this.f17419);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return "NEW " + C19378.m44398(this.f17419);
    }
}
