package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7Q5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17305 extends C13652 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f56345;

    public C17305(C21637 c21637, char[] cArr, int i) {
        super(c21637, cArr, i);
        this.f56345 = new HashMap();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap m40630() {
        return this.f56345;
    }

    @Override // l.C13652
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19399 mo31479(int i, int i2, EnumC8212 enumC8212) {
        char[] cArrM27059 = m27059(i, i2);
        InterfaceC19399 interfaceC19399Mo31479 = super.mo31479(i, i2, enumC8212);
        this.f56345.put(interfaceC19399Mo31479, new C15813(i, i2, new String(cArrM27059)));
        return interfaceC19399Mo31479;
    }
}
