package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22079 implements InterfaceC0911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1388 f71530;

    public C22079(C1388 c1388) {
        this.f71530 = c1388;
    }

    @Override // l.InterfaceC0911
    /* JADX INFO: renamed from: ܰ */
    public final int mo3631(int i) throws IOException {
        long j = i;
        C1388 c1388 = this.f71530;
        c1388.seek(j);
        int i2 = c1388.read();
        if (i2 >= 0) {
            return i2 & 255;
        }
        throw new IOException("Unexpected end of string data");
    }

    @Override // l.InterfaceC0911
    /* JADX INFO: renamed from: ۙ */
    public final int mo3630(int i) {
        long j = i;
        C1388 c1388 = this.f71530;
        c1388.seek(j);
        return c1388.mo4872();
    }
}
