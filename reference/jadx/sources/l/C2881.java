package l;

/* JADX INFO: renamed from: l.ۗ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9CC */
/* JADX INFO: loaded from: classes2.dex */
public class C2881 extends AbstractC0764 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC22408 f10864;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f10865;

    public C2881(C12760 c12760, AbstractC22408 abstractC22408) {
        super(c12760);
        this.f10864 = abstractC22408;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3285(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f10865 = str;
        AbstractC22408 abstractC22408 = this.f10864;
        abstractC22408.getClass();
        super.mo3285(i, i2, AbstractC22408.m49690(str), abstractC22408.m49692(str2, false), AbstractC22408.m49690(str3), strArr == null ? null : AbstractC22408.m49689(strArr));
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC19816 mo3282(int i, String str, String str2) {
        AbstractC22408 abstractC22408 = this.f10864;
        abstractC22408.getClass();
        AbstractC19816 abstractC19816Mo3282 = super.mo3282(i, str, str2);
        if (abstractC19816Mo3282 == null) {
            return null;
        }
        return new C2651(this.f3079, abstractC19816Mo3282, abstractC22408);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo3280(String str, boolean z) {
        AbstractC22408 abstractC22408 = this.f10864;
        abstractC22408.getClass();
        AbstractC9812 abstractC9812Mo3280 = super.mo3280(AbstractC22408.m49687(str), z);
        if (abstractC9812Mo3280 == null) {
            return null;
        }
        int i = this.f3079;
        return new C9233(i, str, abstractC9812Mo3280, abstractC22408).m23752(new C9233(i, null, abstractC9812Mo3280, abstractC22408));
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo3279(int i, C1470 c1470, String str, boolean z) {
        AbstractC22408 abstractC22408 = this.f10864;
        abstractC22408.getClass();
        AbstractC9812 abstractC9812Mo3279 = super.mo3279(i, c1470, AbstractC22408.m49687(str), z);
        if (abstractC9812Mo3279 == null) {
            return null;
        }
        int i2 = this.f3079;
        return new C9233(i2, str, abstractC9812Mo3279, abstractC22408).m23752(new C9233(i2, null, abstractC9812Mo3279, abstractC22408));
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3290(C11349 c11349) {
        if (c11349 instanceof C11825) {
            throw null;
        }
        super.mo3290(c11349);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16288 mo3292(String str, String str2, String str3) {
        AbstractC22408 abstractC22408 = this.f10864;
        abstractC22408.getClass();
        AbstractC16288 abstractC16288Mo3292 = super.mo3292(str, AbstractC22408.m49687(str2), abstractC22408.m49692(str3, true));
        if (abstractC16288Mo3292 == null) {
            return null;
        }
        return new C5474(this.f3079, abstractC16288Mo3292, abstractC22408);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17698 mo3281(int i, String str, String str2, String str3, Object obj) {
        AbstractC22408 abstractC22408 = this.f10864;
        abstractC22408.getClass();
        AbstractC17698 abstractC17698Mo3281 = super.mo3281(i, str, AbstractC22408.m49687(str2), abstractC22408.m49692(str3, true), obj == null ? null : AbstractC22408.m49686(obj));
        if (abstractC17698Mo3281 == null) {
            return null;
        }
        return new C4768(this.f3079, abstractC17698Mo3281, abstractC22408);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20521 mo3283(int i, String str, String str2, String str3, String[] strArr) {
        AbstractC22408 abstractC22408 = this.f10864;
        abstractC22408.getClass();
        AbstractC20521 abstractC20521Mo3283 = super.mo3283(i, str, AbstractC22408.m49691(str2), abstractC22408.m49692(str3, false), strArr == null ? null : AbstractC22408.m49689(strArr));
        if (abstractC20521Mo3283 == null) {
            return null;
        }
        return new C13942(this.f3079, abstractC20521Mo3283, abstractC22408);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3287(String str, int i, String str2, String str3) {
        this.f10864.getClass();
        String strM49690 = AbstractC22408.m49690(str);
        String str4 = null;
        String strM49691 = str2 == null ? null : AbstractC22408.m49690(str2);
        if (str3 != null) {
            String strM49692 = AbstractC22408.m49690(str);
            if (!strM49692.equals(str)) {
                int iLastIndexOf = str.lastIndexOf(47);
                int iLastIndexOf2 = strM49692.lastIndexOf(47);
                if ((iLastIndexOf == -1 || iLastIndexOf2 == -1 || !str.substring(iLastIndexOf).equals(strM49692.substring(iLastIndexOf2))) && strM49692.contains("$")) {
                    int iLastIndexOf3 = strM49692.lastIndexOf(36);
                    do {
                        iLastIndexOf3++;
                        if (iLastIndexOf3 >= strM49692.length()) {
                            break;
                        }
                    } while (Character.isDigit(strM49692.charAt(iLastIndexOf3)));
                    str3 = strM49692.substring(iLastIndexOf3);
                }
            }
            str4 = str3;
        }
        super.mo3287(strM49690, i, strM49691, str4);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3289(String str, String str2, String str3) {
        this.f10864.getClass();
        String strM49690 = AbstractC22408.m49690(str);
        if (str2 == null) {
            str2 = null;
        }
        super.mo3289(strM49690, str2, str3 != null ? AbstractC22408.m49691(str3) : null);
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3286(String str) {
        this.f10864.getClass();
        super.mo3286(AbstractC22408.m49690(str));
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ܰ */
    public final void mo3293(String str) {
        this.f10864.getClass();
        super.mo3293(AbstractC22408.m49690(str));
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۨ */
    public final void mo3291(String str) {
        this.f10864.getClass();
        super.mo3291(AbstractC22408.m49690(str));
    }
}
