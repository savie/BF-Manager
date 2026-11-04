package l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܿ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18645 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f60629 = new C21287();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21287 f60630 = new C21287();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21629 f60631 = new C21629();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Inflater f60632;

    @Override // l.InterfaceC2763
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        return C19171.m44438(this, bArr, i2);
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        C21287 c21287 = this.f60629;
        c21287.m48491(i2 + i, bArr);
        c21287.m48510(i);
        if (this.f60632 == null) {
            this.f60632 = new Inflater();
        }
        Inflater inflater = this.f60632;
        String str = C7116.f23455;
        if (c21287.m48486() > 0 && c21287.m48502() == 120) {
            C21287 c21288 = this.f60630;
            if (C7116.m19492(c21287, c21288, inflater)) {
                c21287.m48491(c21288.m48509(), c21288.m48497());
            }
        }
        C21629 c21629 = this.f60631;
        c21629.m49167();
        ArrayList arrayList = new ArrayList();
        while (c21287.m48486() >= 3) {
            int iM48509 = c21287.m48509();
            int iM48493 = c21287.m48493();
            int iM48494 = c21287.m48494();
            int iM48516 = c21287.m48516() + iM48494;
            C2137 c2137 = null;
            if (iM48516 > iM48509) {
                c21287.m48510(iM48509);
            } else {
                if (iM48493 != 128) {
                    switch (iM48493) {
                        case 20:
                            C21629.m49164(c21629, c21287, iM48494);
                            break;
                        case 21:
                            C21629.m49163(c21629, c21287, iM48494);
                            break;
                        case 22:
                            C21629.m49165(c21629, c21287, iM48494);
                            break;
                    }
                } else {
                    C2137 c2137M49166 = c21629.m49166();
                    c21629.m49167();
                    c2137 = c2137M49166;
                }
                c21287.m48510(iM48516);
            }
            if (c2137 != null) {
                arrayList.add(c2137);
            }
        }
        interfaceC8103.accept(new C16187(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
