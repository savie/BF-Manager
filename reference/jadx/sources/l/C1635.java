package l;

/* JADX INFO: renamed from: l.֫ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1635 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13111 f6554;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13111 f6555;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f6556;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5530(C15187 c15187) {
        C13111 c13111 = this.f6554;
        if (c13111.f43679 != null) {
            c13111.f43679 = c15187;
        } else {
            this.f6555.f43679 = c15187;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15187 m5531() {
        Object obj = this.f6554.f43679;
        return obj != null ? (C15187) obj : (C15187) this.f6555.f43679;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15187 m5532() {
        Object obj = this.f6554.f43680;
        return obj != null ? (C15187) obj : (C15187) this.f6555.f43680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m5528() {
        if (this.f6556 == null) {
            this.f6556 = m5527();
        }
        return this.f6556;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m5527() {
        Object obj = this.f6555.f43679;
        if (obj == null) {
            return null;
        }
        Object obj2 = ((C20499) ((C15187) ((C22616) ((C15187) obj).f49578).f69953).f49578).f69953;
        this.f6556 = (String) obj2;
        return (String) obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5529(C12738 c12738) {
        Object obj;
        C13111 c13111 = this.f6555;
        C13111 c13112 = this.f6554;
        Object obj2 = c13112.f43679;
        if (obj2 != null && ((C15187) obj2).f43854 != ((C15187) c13111.f43679).f43854) {
            m5527();
            c12738.m31671((C15187) c13111.f43679);
        }
        Object obj3 = c13112.f43680;
        if (obj3 == null || (obj = c13111.f43680) == null) {
            return;
        }
        C15187 c15187 = (C15187) obj;
        if (((C15187) obj3).f43854 != c15187.f43854) {
            c12738.m31671(c15187);
        }
    }
}
