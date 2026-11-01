package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4J0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16503 extends AbstractC15798 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19805 f53018 = new C19805(200);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53019;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16503 m38776(int i, InterfaceC15707 interfaceC15707) {
        C16503 c16503 = (C16503) f53018.m45009();
        if (c16503 != null) {
            c16503.f25545 = i;
            c16503.f53019 = interfaceC15707.getLineNumber();
        } else {
            c16503 = new C16503(i, -2);
            c16503.f53019 = interfaceC15707.getLineNumber();
        }
        if (interfaceC15707 instanceof C8617) {
            ((C8617) interfaceC15707).m22393();
        }
        return c16503;
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۚ */
    public final void mo9290() {
        f53018.m45011(this);
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        c12283.getClass();
        c12283.write(".line ", 0, 6);
        c12283.m30528(this.f53019);
        return true;
    }
}
