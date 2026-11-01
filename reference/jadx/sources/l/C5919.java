package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 865M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5919 extends AbstractC15798 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f20175;

    public C5919(int i, InterfaceC16412 interfaceC16412) {
        super(i, -3);
        this.f20175 = interfaceC16412.mo20789();
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        c12283.getClass();
        c12283.write(".source", 0, 7);
        String str = this.f20175;
        if (str == null) {
            return true;
        }
        c12283.write(" \"", 0, 2);
        C9461.m24219(c12283, str);
        c12283.write(34);
        return true;
    }
}
