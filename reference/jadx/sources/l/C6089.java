package l;

/* JADX INFO: renamed from: l.ۛۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9CC */
/* JADX INFO: loaded from: classes3.dex */
public class C6089 extends AbstractC18217 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f20811;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0122 f20812;

    public C6089(C0318 c0318, AbstractC0122 abstractC0122) {
        super(c0318);
        this.f20812 = abstractC0122;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final void mo2001(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f20811 = str;
        AbstractC0122 abstractC0122 = this.f20812;
        abstractC0122.getClass();
        super.mo2001(i, i2, AbstractC0122.m1265(str), abstractC0122.m1267(str2, false), AbstractC0122.m1265(str3), strArr == null ? null : AbstractC0122.m1264(strArr));
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5343 mo1997(int i, String str, String str2) {
        AbstractC0122 abstractC0122 = this.f20812;
        abstractC0122.getClass();
        AbstractC5343 abstractC5343Mo1997 = super.mo1997(i, str, str2);
        if (abstractC5343Mo1997 == null) {
            return null;
        }
        return new C21005(this.f59474, abstractC5343Mo1997, abstractC0122);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo1996(String str, boolean z) {
        AbstractC0122 abstractC0122 = this.f20812;
        abstractC0122.getClass();
        AbstractC3301 abstractC3301Mo1996 = super.mo1996(AbstractC0122.m1262(str), z);
        if (abstractC3301Mo1996 == null) {
            return null;
        }
        int i = this.f59474;
        return new C12054(i, str, abstractC3301Mo1996, abstractC0122).m30233(new C12054(i, null, abstractC3301Mo1996, abstractC0122));
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo1995(int i, C20259 c20259, String str, boolean z) {
        AbstractC0122 abstractC0122 = this.f20812;
        abstractC0122.getClass();
        AbstractC3301 abstractC3301Mo1995 = super.mo1995(i, c20259, AbstractC0122.m1262(str), z);
        if (abstractC3301Mo1995 == null) {
            return null;
        }
        int i2 = this.f59474;
        return new C12054(i2, str, abstractC3301Mo1995, abstractC0122).m30233(new C12054(i2, null, abstractC3301Mo1995, abstractC0122));
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final void mo2006(C24185 c24185) {
        if (c24185 instanceof C14291) {
            throw null;
        }
        super.mo2006(c24185);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC11308 mo2008(String str, String str2, String str3) {
        AbstractC0122 abstractC0122 = this.f20812;
        abstractC0122.getClass();
        AbstractC11308 abstractC11308Mo2008 = super.mo2008(str, AbstractC0122.m1262(str2), abstractC0122.m1267(str3, true));
        if (abstractC11308Mo2008 == null) {
            return null;
        }
        return new C18021(this.f59474, abstractC11308Mo2008, abstractC0122);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8521 mo1998(int i, String str, String str2, String str3, Object obj) {
        AbstractC0122 abstractC0122 = this.f20812;
        abstractC0122.getClass();
        AbstractC8521 abstractC8521Mo1998 = super.mo1998(i, str, AbstractC0122.m1262(str2), abstractC0122.m1267(str3, true), obj == null ? null : AbstractC0122.m1261(obj));
        if (abstractC8521Mo1998 == null) {
            return null;
        }
        return new C23989(this.f59474, abstractC8521Mo1998, abstractC0122);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15037 mo1999(int i, String str, String str2, String str3, String[] strArr) {
        AbstractC0122 abstractC0122 = this.f20812;
        abstractC0122.getClass();
        AbstractC15037 abstractC15037Mo1999 = super.mo1999(i, str, AbstractC0122.m1266(str2), abstractC0122.m1267(str3, false), strArr == null ? null : AbstractC0122.m1264(strArr));
        if (abstractC15037Mo1999 == null) {
            return null;
        }
        return new C3851(this.f59474, abstractC15037Mo1999, abstractC0122);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final void mo2003(String str, int i, String str2, String str3) {
        this.f20812.getClass();
        String strM1265 = AbstractC0122.m1265(str);
        String str4 = null;
        String strM1266 = str2 == null ? null : AbstractC0122.m1265(str2);
        if (str3 != null) {
            String strM1267 = AbstractC0122.m1265(str);
            if (!strM1267.equals(str)) {
                int iLastIndexOf = str.lastIndexOf(47);
                int iLastIndexOf2 = strM1267.lastIndexOf(47);
                if ((iLastIndexOf == -1 || iLastIndexOf2 == -1 || !str.substring(iLastIndexOf).equals(strM1267.substring(iLastIndexOf2))) && strM1267.contains("$")) {
                    int iLastIndexOf3 = strM1267.lastIndexOf(36);
                    do {
                        iLastIndexOf3++;
                        if (iLastIndexOf3 >= strM1267.length()) {
                            break;
                        }
                    } while (Character.isDigit(strM1267.charAt(iLastIndexOf3)));
                    str3 = strM1267.substring(iLastIndexOf3);
                }
            }
            str4 = str3;
        }
        super.mo2003(strM1265, i, strM1266, str4);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final void mo2005(String str, String str2, String str3) {
        this.f20812.getClass();
        String strM1265 = AbstractC0122.m1265(str);
        if (str2 == null) {
            str2 = null;
        }
        super.mo2005(strM1265, str2, str3 != null ? AbstractC0122.m1266(str3) : null);
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final void mo2002(String str) {
        this.f20812.getClass();
        super.mo2002(AbstractC0122.m1265(str));
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2009(String str) {
        this.f20812.getClass();
        super.mo2009(AbstractC0122.m1265(str));
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۤ */
    public final void mo2007(String str) {
        this.f20812.getClass();
        super.mo2007(AbstractC0122.m1265(str));
    }
}
