package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 865M */
/* JADX INFO: loaded from: classes5.dex */
public final class C17759 extends AbstractC13284 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f58316;

    public C17759(int i, InterfaceC5431 interfaceC5431) {
        super(i, -3);
        this.f58316 = interfaceC5431.mo16161();
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        c2161.getClass();
        c2161.write(".source", 0, 7);
        String str = this.f58316;
        if (str == null) {
            return true;
        }
        c2161.write(" \"", 0, 2);
        C3652.m11836(c2161, str);
        c2161.write(34);
        return true;
    }
}
