package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W7Q5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8929 extends C16907 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f30618;

    public C8929(C18213 c18213, char[] cArr, int i) {
        super(c18213, cArr, i);
        this.f30618 = new HashMap();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap m23218() {
        return this.f30618;
    }

    @Override // l.C16907
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9042 mo11642(int i, int i2, EnumC19625 enumC19625) {
        char[] cArrM17246 = m17246(i, i2);
        InterfaceC9042 interfaceC9042Mo11642 = super.mo11642(i, i2, enumC19625);
        this.f30618.put(interfaceC9042Mo11642, new C10340(i, i2, new String(cArrM17246)));
        return interfaceC9042Mo11642;
    }
}
