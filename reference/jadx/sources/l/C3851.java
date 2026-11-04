package l;

/* JADX INFO: renamed from: l.ۘۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9BK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3851 extends AbstractC15037 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC0122 f13157;

    public C3851(int i, AbstractC15037 abstractC15037, AbstractC0122 abstractC0122) {
        super(i, abstractC15037);
        this.f13157 = abstractC0122;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10782() {
        AbstractC3301 abstractC3301Mo10782 = super.mo10782();
        return abstractC3301Mo10782 == null ? abstractC3301Mo10782 : m12481((String) null, abstractC3301Mo10782);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10786(String str, boolean z) {
        this.f13157.getClass();
        AbstractC3301 abstractC3301Mo10786 = super.mo10786(AbstractC0122.m1262(str), z);
        return abstractC3301Mo10786 == null ? abstractC3301Mo10786 : m12481(str, abstractC3301Mo10786);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC3301 mo10805(int i, C20259 c20259, String str, boolean z) {
        this.f13157.getClass();
        AbstractC3301 abstractC3301Mo10805 = super.mo10805(i, c20259, AbstractC0122.m1262(str), z);
        return abstractC3301Mo10805 == null ? abstractC3301Mo10805 : m12481(str, abstractC3301Mo10805);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10783(int i, String str, boolean z) {
        this.f13157.getClass();
        AbstractC3301 abstractC3301Mo10783 = super.mo10783(i, AbstractC0122.m1262(str), z);
        return abstractC3301Mo10783 == null ? abstractC3301Mo10783 : m12481(str, abstractC3301Mo10783);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10789(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super.mo10789(i, i2, i3, m12480(i2, objArr), m12480(i3, objArr2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object[] m12480(int i, Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        Object[] objArr2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] instanceof String) {
                if (objArr2 == null) {
                    objArr2 = new Object[i];
                    System.arraycopy(objArr, 0, objArr2, 0, i);
                }
                String str = (String) objArr[i2];
                this.f13157.getClass();
                objArr2[i2] = AbstractC0122.m1265(str);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10796(String str, int i, String str2, String str3) {
        this.f13157.getClass();
        super.mo10796(AbstractC0122.m1265(str), i, str2, AbstractC0122.m1262(str3));
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10792(int i, String str, String str2, String str3, boolean z) {
        if (this.f49089 < 327680 && (i & 256) == 0) {
            super.mo10792(i, str, str2, str3, z);
        } else {
            this.f13157.getClass();
            super.mo10792(i, AbstractC0122.m1265(str), str2, AbstractC0122.m1266(str3), z);
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10798(String str, String str2, C4597 c4597, Object... objArr) {
        this.f13157.getClass();
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = AbstractC0122.m1261(objArr[i]);
        }
        super.mo10798(str, AbstractC0122.m1266(str2), (C4597) AbstractC0122.m1261(c4597), objArr2);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ */
    public final void mo10808(int i, String str) {
        this.f13157.getClass();
        super.mo10808(i, AbstractC0122.m1265(str));
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10795(Object obj) {
        this.f13157.getClass();
        super.mo10795(AbstractC0122.m1261(obj));
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10791(int i, String str) {
        this.f13157.getClass();
        super.mo10791(i, AbstractC0122.m1262(str));
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10784(int i, C20259 c20259, String str, boolean z) {
        this.f13157.getClass();
        AbstractC3301 abstractC3301Mo10784 = super.mo10784(i, c20259, AbstractC0122.m1262(str), z);
        return abstractC3301Mo10784 == null ? abstractC3301Mo10784 : m12481(str, abstractC3301Mo10784);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10801(C10562 c10562, C10562 c10563, C10562 c10564, String str) {
        String strM1265;
        if (str == null) {
            strM1265 = null;
        } else {
            this.f13157.getClass();
            strM1265 = AbstractC0122.m1265(str);
        }
        super.mo10801(c10562, c10563, c10564, strM1265);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC3301 mo10809(int i, C20259 c20259, String str, boolean z) {
        this.f13157.getClass();
        AbstractC3301 abstractC3301Mo10809 = super.mo10809(i, c20259, AbstractC0122.m1262(str), z);
        return abstractC3301Mo10809 == null ? abstractC3301Mo10809 : m12481(str, abstractC3301Mo10809);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10797(String str, String str2, String str3, C10562 c10562, C10562 c10563, int i) {
        AbstractC0122 abstractC0122 = this.f13157;
        abstractC0122.getClass();
        super.mo10797(str, AbstractC0122.m1262(str2), abstractC0122.m1267(str3, true), c10562, c10563, i);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo10785(int i, C20259 c20259, C10562[] c10562Arr, C10562[] c10562Arr2, int[] iArr, String str, boolean z) {
        this.f13157.getClass();
        AbstractC3301 abstractC3301Mo10785 = super.mo10785(i, c20259, c10562Arr, c10562Arr2, iArr, AbstractC0122.m1262(str), z);
        return abstractC3301Mo10785 == null ? abstractC3301Mo10785 : m12481(str, abstractC3301Mo10785);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 m12481(String str, AbstractC3301 abstractC3301) {
        int i = this.f49089;
        AbstractC0122 abstractC0122 = this.f13157;
        return new C12054(i, str, abstractC3301, abstractC0122).m30233(new C12054(i, null, abstractC3301, abstractC0122));
    }
}
