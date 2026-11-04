package l;

/* JADX INFO: renamed from: l.ۗܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: MITP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3450 implements InterfaceC16874 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f11248;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f11249;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11250;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f11251;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20604 f11252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2551 f11253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20604 m11263(C2551 c2551, C6041 c6041) {
        C17973 c17973M17530 = c6041.m17530();
        C3450 c3450M11262 = c17973M17530 == null ? null : m11262(c2551, c17973M17530);
        if (c3450M11262 == null) {
            return null;
        }
        return c3450M11262.f11252;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3450 m11262(C2551 c2551, C17973 c17973) {
        C11260 c11260M41945 = c17973.m41945();
        if (c11260M41945.m28512()) {
            return null;
        }
        C3450 c3450M28518 = c11260M41945.m28518();
        if (c3450M28518 != null) {
            return c3450M28518;
        }
        C3450 c3450 = new C3450(c2551, c17973);
        c11260M41945.m28509(c3450);
        return c3450;
    }

    public C3450(C2551 c2551, C17973 c17973) {
        int iM41954 = c17973.m41954();
        int iM41936 = c17973.m41936();
        c17973.m41945().getClass();
        String strM28513 = c17973.m41945().m28513();
        this.f11253 = c2551;
        this.f11248 = iM41954;
        this.f11249 = iM41936;
        this.f11251 = strM28513;
        this.f11252 = new C20604(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2551 m11266() {
        return this.f11253;
    }

    public final int hashCode() {
        return this.f11253.hashCode() + (((this.f11248 * 31) + this.f11249) * 31);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m11267() {
        return this.f11251;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11264() {
        return this.f11250;
    }

    @Override // l.InterfaceC16874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11265(int i) {
        this.f11250 = i;
    }

    @Override // l.InterfaceC11653
    /* JADX INFO: renamed from: ۘ */
    public final EnumC1959 mo8493() {
        return EnumC1959.VAR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3450)) {
            return false;
        }
        C3450 c3450 = (C3450) obj;
        return this.f11248 == c3450.f11248 && this.f11249 == c3450.f11249 && this.f11253.equals(c3450.f11253);
    }

    public final String toString() {
        return "VarNode{r" + this.f11248 + 'v' + this.f11249 + '}';
    }
}
