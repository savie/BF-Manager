package l;

/* JADX INFO: renamed from: l.ܰ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13689 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f45154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12587 f45155;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5221 f45156;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14704 f45157;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23876 f45158;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2002 f45159;

    static {
        new C20348().m45915();
        C17983.m41806(0);
        C17983.m41806(1);
        C17983.m41806(2);
        C17983.m41806(3);
        C17983.m41806(4);
        C17983.m41806(5);
    }

    public C13689(String str, C12587 c12587, C14704 c14704, C23876 c23876, C5221 c5221, C2002 c2002) {
        this.f45154 = str;
        this.f45157 = c14704;
        this.f45158 = c23876;
        this.f45156 = c5221;
        this.f45155 = c12587;
        this.f45159 = c2002;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20348 m33394() {
        return new C20348(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13689)) {
            return false;
        }
        C13689 c13689 = (C13689) obj;
        return C13638.equals(this.f45154, c13689.f45154) && this.f45155.equals(c13689.f45155) && C13638.equals(this.f45157, c13689.f45157) && this.f45158.equals(c13689.f45158) && C13638.equals(this.f45156, c13689.f45156) && C13638.equals(this.f45159, c13689.f45159);
    }

    public final int hashCode() {
        int iHashCode = this.f45154.hashCode() * 31;
        C14704 c14704 = this.f45157;
        int iHashCode2 = (this.f45156.hashCode() + ((this.f45155.hashCode() + ((this.f45158.hashCode() + ((iHashCode + (c14704 != null ? c14704.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f45159.getClass();
        return iHashCode2;
    }
}
