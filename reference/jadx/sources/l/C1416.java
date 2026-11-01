package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H87Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C1416 extends AbstractC7186 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f5854 = new C5650(new C1416(EnumC19181.f61953));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8598 f5855;

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        c1145.m4203((Number) obj);
    }

    public C1416(InterfaceC8598 interfaceC8598) {
        this.f5855 = interfaceC8598;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20592 m4955(InterfaceC8598 interfaceC8598) {
        if (interfaceC8598 != EnumC19181.f61953) {
            return new C5650(new C1416(interfaceC8598));
        }
        return f5854;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        EnumC22313 enumC22313M14916 = c5379.m14916();
        int i = C22584.f73608[enumC22313M14916.ordinal()];
        if (i == 1) {
            c5379.m14918();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f5855.mo20826(c5379);
        }
        throw new C22003("Expecting number, got: " + enumC22313M14916 + "; at path " + c5379.m14919());
    }
}
