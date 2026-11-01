package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N5TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10859 extends AbstractC15798 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21129 f36931;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12179 f36932;

    public C10859(int i, C21129 c21129, InterfaceC12179 interfaceC12179) {
        super(i, -1);
        this.f36932 = interfaceC12179;
        this.f36931 = c21129;
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        c12283.getClass();
        c12283.write(".local ", 0, 7);
        InterfaceC12179 interfaceC12179 = this.f36932;
        this.f36931.m47551(c12283, interfaceC12179.mo9024());
        String name = interfaceC12179.getName();
        String type = interfaceC12179.getType();
        String signature = interfaceC12179.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c12283.write(", ", 0, 2);
        C12270.m30493(c12283, name, type, signature);
        return true;
    }
}
