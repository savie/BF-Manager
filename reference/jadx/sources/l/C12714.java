package l;

/* JADX INFO: renamed from: l.ۨ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12714 extends C4511 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f40706;

    public C12714(String str, int i, int i2, InterfaceC17189 interfaceC17189) {
        super(interfaceC17189);
        this.f40706 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f16096 instanceof InterfaceC15697;
        String str = this.f40706;
        if (z) {
            return "NoViableAltException('" + ((char) m14235()) + "'@[" + str + "])";
        }
        return "NoViableAltException(" + m14235() + "@[" + str + "])";
    }
}
