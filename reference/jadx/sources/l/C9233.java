package l;

/* JADX INFO: renamed from: l.ۢ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9233 extends AbstractC9812 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC22408 f31377;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f31378;

    public C9233(int i, String str, AbstractC9812 abstractC9812, AbstractC22408 abstractC22408) {
        super(i, abstractC9812);
        this.f31378 = str;
        this.f31377 = abstractC22408;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 m23752(C9233 c9233) {
        return (c9233.f33558 == this.f33558 && c9233.f33559 == this.f33559 && c9233.f31377 == this.f31377) ? this : c9233;
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo10175(String str) {
        String str2 = this.f31378;
        AbstractC22408 abstractC22408 = this.f31377;
        if (str2 != null) {
            abstractC22408.getClass();
        }
        AbstractC9812 abstractC9812Mo10175 = super.mo10175(str);
        if (abstractC9812Mo10175 == null) {
            return null;
        }
        if (abstractC9812Mo10175 == this.f33559) {
            return this;
        }
        int i = this.f33558;
        return new C9233(i, null, abstractC9812Mo10175, abstractC22408).m23752(new C9233(i, null, abstractC9812Mo10175, abstractC22408));
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo10176(String str, String str2) {
        String str3 = this.f31378;
        AbstractC22408 abstractC22408 = this.f31377;
        if (str3 != null) {
            abstractC22408.getClass();
        }
        abstractC22408.getClass();
        AbstractC9812 abstractC9812Mo10176 = super.mo10176(str, AbstractC22408.m49687(str2));
        if (abstractC9812Mo10176 == null) {
            return null;
        }
        if (abstractC9812Mo10176 == this.f33559) {
            return this;
        }
        int i = this.f33558;
        return new C9233(i, str2, abstractC9812Mo10176, abstractC22408).m23752(new C9233(i, null, abstractC9812Mo10176, abstractC22408));
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final void mo10179(Object obj, String str) {
        String str2 = this.f31378;
        AbstractC22408 abstractC22408 = this.f31377;
        if (str2 != null) {
            abstractC22408.getClass();
        }
        abstractC22408.getClass();
        super.mo10179(AbstractC22408.m49686(obj), str);
    }

    @Override // l.AbstractC9812
    /* JADX INFO: renamed from: ۙ */
    public final void mo10180(String str, String str2, String str3) {
        String str4 = this.f31378;
        AbstractC22408 abstractC22408 = this.f31377;
        if (str4 != null) {
            abstractC22408.getClass();
        }
        abstractC22408.getClass();
        super.mo10180(str, AbstractC22408.m49687(str2), str3);
    }
}
