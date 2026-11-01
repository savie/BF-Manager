package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T4KR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20031 extends AbstractC15798 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20645 f64140;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21129 f64141;

    public C20031(int i, C21129 c21129, InterfaceC20645 interfaceC20645) {
        super(i, -1);
        this.f64140 = interfaceC20645;
        this.f64141 = c21129;
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        c12283.getClass();
        c12283.write(".end local ", 0, 11);
        InterfaceC20645 interfaceC20645 = this.f64140;
        this.f64141.m47551(c12283, interfaceC20645.mo5491());
        String name = interfaceC20645.getName();
        String type = interfaceC20645.getType();
        String signature = interfaceC20645.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c12283.write("  # ", 0, 4);
        C12270.m30493(c12283, name, type, signature);
        return true;
    }
}
