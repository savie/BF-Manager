package l;

/* JADX INFO: renamed from: l.ܳ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15625 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50748;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18609 f50749;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10377 f50750;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC8036 f50751;

    public C15625(C18609 c18609, C10377 c10377, C4197 c4197) {
        this.f50749 = c18609;
        this.f50750 = c10377;
        this.f50751 = c4197;
    }

    public final int hashCode() {
        int i = this.f50748;
        if (i != 0) {
            return i;
        }
        int iM47045 = C20518.m47045(this.f50751, this.f50750.m26691());
        this.f50748 = iM47045;
        return iM47045;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15625)) {
            return false;
        }
        C15625 c15625 = (C15625) obj;
        C10377 c10377 = c15625.f50750;
        C24705 c24705 = this.f50749.f60504;
        C10377 c10378 = this.f50750;
        return c24705.m55149(c10378.f38067, c10377.f38067) && new C23502(c10378.m26691(), c10377.m26691()).m52692(this.f50751, c15625.f50751);
    }
}
