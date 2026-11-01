package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17208 extends AbstractC15798 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21129 f54846;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0183 f54847;

    public C17208(int i, C21129 c21129, InterfaceC0183 interfaceC0183) {
        super(i, -1);
        this.f54847 = interfaceC0183;
        this.f54846 = c21129;
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        c12283.getClass();
        c12283.write(".restart local ", 0, 15);
        InterfaceC0183 interfaceC0183 = this.f54847;
        this.f54846.m47551(c12283, interfaceC0183.mo1385());
        String name = interfaceC0183.getName();
        String type = interfaceC0183.getType();
        String signature = interfaceC0183.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c12283.write("  # ", 0, 4);
        C12270.m30493(c12283, name, type, signature);
        return true;
    }
}
