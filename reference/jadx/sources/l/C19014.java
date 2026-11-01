package l;

/* JADX INFO: renamed from: l.ᩴ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19014 extends AbstractC0764 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f61523;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0764 f61524;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f61525;

    public C19014(AbstractC0764 abstractC0764, String str, String str2) {
        this.f61524 = abstractC0764;
        this.f61523 = str;
        this.f61525 = str2;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20521 mo3283(int i, String str, String str2, String str3, String[] strArr) {
        if (!C10548.f36115.contains(str)) {
            return super.mo3283(i, str, str2, str3, strArr);
        }
        return new C18308(this, this.f61524.mo3283(10, C1694.m5622(new StringBuilder(), this.f61523, "$", str), str2, str3, strArr));
    }
}
