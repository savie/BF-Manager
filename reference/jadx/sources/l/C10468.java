package l;

/* JADX INFO: renamed from: l.ۤᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7HK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10468 implements InterfaceC19074, InterfaceC4256 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f35776;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f35777;

    public C10468(String str, String str2) {
        this.f35777 = str;
        this.f35776 = str2;
    }

    @Override // l.InterfaceC19074
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo26446() {
        return this.f35776;
    }

    @Override // l.InterfaceC19074
    public final String getPassword() {
        return this.f35777;
    }

    @Override // l.InterfaceC19074
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo26448() {
        return this.f35777 != null;
    }

    @Override // l.InterfaceC19074
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo26447() {
        return this.f35776 != null;
    }

    @Override // l.InterfaceC4256
    /* JADX INFO: renamed from: ۙ */
    public final String[] mo12020(String[] strArr) {
        String str = this.f35777;
        if (str == null || strArr.length <= 0) {
            return null;
        }
        return new String[]{str};
    }
}
