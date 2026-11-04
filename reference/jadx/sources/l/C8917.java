package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C8917 implements InterfaceC7426 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13961 f29107;

    public C8917(C13961 c13961) {
        this.f29107 = c13961;
    }

    @Override // l.InterfaceC7426
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5234(int i) throws IOException {
        long j = i;
        C13961 c13961 = this.f29107;
        c13961.seek(j);
        int i2 = c13961.read();
        if (i2 >= 0) {
            return i2 & 255;
        }
        throw new IOException("Unexpected end of string data");
    }

    @Override // l.InterfaceC7426
    /* JADX INFO: renamed from: ۙ */
    public final int mo5233(int i) {
        long j = i;
        C13961 c13961 = this.f29107;
        c13961.seek(j);
        return c13961.mo34029();
    }
}
