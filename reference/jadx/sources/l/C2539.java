package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D88X */
/* JADX INFO: loaded from: classes3.dex */
public final class C2539 extends C12234 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f8120;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final short m8465() {
        return this.f8120;
    }

    @Override // l.C12234
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8464(C0302 c0302) throws IOException {
        super.mo8464(c0302);
        int i = C9250.f30108[m30524().ordinal()];
        if (i == 1) {
            this.f8120 = c0302.m1887();
            c0302.m1887();
            c0302.m1880(m30525() - 20);
        } else if (i == 2) {
            c0302.m1880(m30525() - 16);
        } else {
            throw new IOException("Invalid PDU type: " + m30524());
        }
    }
}
