package l;

/* JADX INFO: renamed from: l.ۨۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12054 extends AbstractC3301 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f38828;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0122 f38829;

    public C12054(int i, String str, AbstractC3301 abstractC3301, AbstractC0122 abstractC0122) {
        super(i, abstractC3301);
        this.f38828 = str;
        this.f38829 = abstractC0122;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 m30233(C12054 c12054) {
        return (c12054.f10786 == this.f10786 && c12054.f10787 == this.f10787 && c12054.f38829 == this.f38829) ? this : c12054;
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo7993(String str) {
        String str2 = this.f38828;
        AbstractC0122 abstractC0122 = this.f38829;
        if (str2 != null) {
            abstractC0122.getClass();
        }
        AbstractC3301 abstractC3301Mo7993 = super.mo7993(str);
        if (abstractC3301Mo7993 == null) {
            return null;
        }
        if (abstractC3301Mo7993 == this.f10787) {
            return this;
        }
        int i = this.f10786;
        return new C12054(i, null, abstractC3301Mo7993, abstractC0122).m30233(new C12054(i, null, abstractC3301Mo7993, abstractC0122));
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo7994(String str, String str2) {
        String str3 = this.f38828;
        AbstractC0122 abstractC0122 = this.f38829;
        if (str3 != null) {
            abstractC0122.getClass();
        }
        abstractC0122.getClass();
        AbstractC3301 abstractC3301Mo7994 = super.mo7994(str, AbstractC0122.m1262(str2));
        if (abstractC3301Mo7994 == null) {
            return null;
        }
        if (abstractC3301Mo7994 == this.f10787) {
            return this;
        }
        int i = this.f10786;
        return new C12054(i, str2, abstractC3301Mo7994, abstractC0122).m30233(new C12054(i, null, abstractC3301Mo7994, abstractC0122));
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final void mo7996(Object obj, String str) {
        String str2 = this.f38828;
        AbstractC0122 abstractC0122 = this.f38829;
        if (str2 != null) {
            abstractC0122.getClass();
        }
        abstractC0122.getClass();
        super.mo7996(AbstractC0122.m1261(obj), str);
    }

    @Override // l.AbstractC3301
    /* JADX INFO: renamed from: ۙ */
    public final void mo7997(String str, String str2, String str3) {
        String str4 = this.f38828;
        AbstractC0122 abstractC0122 = this.f38829;
        if (str4 != null) {
            abstractC0122.getClass();
        }
        abstractC0122.getClass();
        super.mo7997(str, AbstractC0122.m1262(str2), str3);
    }
}
