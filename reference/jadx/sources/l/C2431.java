package l;

/* JADX INFO: renamed from: l.ۖۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C2431 extends AbstractC18217 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7773;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18217 f7774;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7775;

    public C2431(AbstractC18217 abstractC18217, String str, String str2) {
        this.f7774 = abstractC18217;
        this.f7775 = str;
        this.f7773 = str2;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15037 mo1999(int i, String str, String str2, String str3, String[] strArr) {
        if (!C5172.f18055.contains(str)) {
            return super.mo1999(i, str, str2, str3, strArr);
        }
        return new C9142(this, this.f7774.mo1999(10, C12669.m31438(new StringBuilder(), this.f7775, "$", str), str2, str3, strArr));
    }
}
