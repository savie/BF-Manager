package l;

/* JADX INFO: renamed from: l.ܰܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13942 extends AbstractC20521 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22408 f45890;

    public C13942(int i, AbstractC20521 abstractC20521, AbstractC22408 abstractC22408) {
        super(i, abstractC20521);
        this.f45890 = abstractC22408;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo33776() {
        AbstractC9812 abstractC9812Mo33776 = super.mo33776();
        return abstractC9812Mo33776 == null ? abstractC9812Mo33776 : m33780((String) null, abstractC9812Mo33776);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo33781(String str, boolean z) {
        this.f45890.getClass();
        AbstractC9812 abstractC9812Mo33781 = super.mo33781(AbstractC22408.m49687(str), z);
        return abstractC9812Mo33781 == null ? abstractC9812Mo33781 : m33780(str, abstractC9812Mo33781);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo33789(int i, C1470 c1470, String str, boolean z) {
        this.f45890.getClass();
        AbstractC9812 abstractC9812Mo33789 = super.mo33789(i, c1470, AbstractC22408.m49687(str), z);
        return abstractC9812Mo33789 == null ? abstractC9812Mo33789 : m33780(str, abstractC9812Mo33789);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo33777(int i, String str, boolean z) {
        this.f45890.getClass();
        AbstractC9812 abstractC9812Mo33777 = super.mo33777(i, AbstractC22408.m49687(str), z);
        return abstractC9812Mo33777 == null ? abstractC9812Mo33777 : m33780(str, abstractC9812Mo33777);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33782(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super.mo33782(i, i2, i3, m33775(i2, objArr), m33775(i3, objArr2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object[] m33775(int i, Object[] objArr) {
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
                this.f45890.getClass();
                objArr2[i2] = AbstractC22408.m49690(str);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33785(String str, int i, String str2, String str3) {
        this.f45890.getClass();
        super.mo33785(AbstractC22408.m49690(str), i, str2, AbstractC22408.m49687(str3));
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33784(int i, String str, String str2, String str3, boolean z) {
        if (this.f66497 < 327680 && (i & 256) == 0) {
            super.mo33784(i, str, str2, str3, z);
        } else {
            this.f45890.getClass();
            super.mo33784(i, AbstractC22408.m49690(str), str2, AbstractC22408.m49691(str3), z);
        }
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33787(String str, String str2, C19110 c19110, Object... objArr) {
        this.f45890.getClass();
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = AbstractC22408.m49686(objArr[i]);
        }
        super.mo33787(str, AbstractC22408.m49691(str2), (C19110) AbstractC22408.m49686(c19110), objArr2);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo33790(int i, String str) {
        this.f45890.getClass();
        super.mo33790(i, AbstractC22408.m49690(str));
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo8457(Object obj) {
        this.f45890.getClass();
        super.mo8457(AbstractC22408.m49686(obj));
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33783(int i, String str) {
        this.f45890.getClass();
        super.mo33783(i, AbstractC22408.m49687(str));
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo33778(int i, C1470 c1470, String str, boolean z) {
        this.f45890.getClass();
        AbstractC9812 abstractC9812Mo33778 = super.mo33778(i, c1470, AbstractC22408.m49687(str), z);
        return abstractC9812Mo33778 == null ? abstractC9812Mo33778 : m33780(str, abstractC9812Mo33778);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33788(C9938 c9938, C9938 c9939, C9938 c99310, String str) {
        String strM49690;
        if (str == null) {
            strM49690 = null;
        } else {
            this.f45890.getClass();
            strM49690 = AbstractC22408.m49690(str);
        }
        super.mo33788(c9938, c9939, c99310, strM49690);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo33791(int i, C1470 c1470, String str, boolean z) {
        this.f45890.getClass();
        AbstractC9812 abstractC9812Mo33791 = super.mo33791(i, c1470, AbstractC22408.m49687(str), z);
        return abstractC9812Mo33791 == null ? abstractC9812Mo33791 : m33780(str, abstractC9812Mo33791);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33786(String str, String str2, String str3, C9938 c9938, C9938 c9939, int i) {
        AbstractC22408 abstractC22408 = this.f45890;
        abstractC22408.getClass();
        super.mo33786(str, AbstractC22408.m49687(str2), abstractC22408.m49692(str3, true), c9938, c9939, i);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 mo33779(int i, C1470 c1470, C9938[] c9938Arr, C9938[] c9938Arr2, int[] iArr, String str, boolean z) {
        this.f45890.getClass();
        AbstractC9812 abstractC9812Mo33779 = super.mo33779(i, c1470, c9938Arr, c9938Arr2, iArr, AbstractC22408.m49687(str), z);
        return abstractC9812Mo33779 == null ? abstractC9812Mo33779 : m33780(str, abstractC9812Mo33779);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9812 m33780(String str, AbstractC9812 abstractC9812) {
        int i = this.f66497;
        AbstractC22408 abstractC22408 = this.f45890;
        return new C9233(i, str, abstractC9812, abstractC22408).m23752(new C9233(i, null, abstractC9812, abstractC22408));
    }
}
