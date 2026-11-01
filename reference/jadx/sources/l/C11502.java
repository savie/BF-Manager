package l;

/* JADX INFO: renamed from: l.ۨۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 25TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11502 extends C22085 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f38678;

    public C11502(String str, int i, int i2, InterfaceC14242 interfaceC14242) {
        super(interfaceC14242);
        this.f38678 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f71535 instanceof InterfaceC16358;
        String str = this.f38678;
        if (z) {
            return "NoViableAltException('" + ((char) m49026()) + "'@[" + str + "])";
        }
        return "NoViableAltException(" + m49026() + "@[" + str + "])";
    }
}
