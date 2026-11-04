package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۧۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8Q6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11341 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f35733 = new C21287();

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
        C2137 c2137M17073;
        C21287 c21287 = this.f35733;
        c21287.m48491(i2 + i, bArr);
        c21287.m48510(i);
        ArrayList arrayList = new ArrayList();
        while (c21287.m48486() > 0) {
            C20782.m47564("Incomplete Mp4Webvtt Top Level box header found.", c21287.m48486() >= 8);
            int iM48500 = c21287.m48500();
            if (c21287.m48500() == 1987343459) {
                int i3 = iM48500 - 8;
                CharSequence charSequenceM17678 = null;
                C5866 c5866M17680 = null;
                while (i3 > 0) {
                    C20782.m47564("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM48501 = c21287.m48500();
                    int iM48502 = c21287.m48500();
                    int i4 = iM48501 - 8;
                    byte[] bArrM48497 = c21287.m48497();
                    int iM48516 = c21287.m48516();
                    String str = C7116.f23455;
                    String str2 = new String(bArrM48497, iM48516, i4, StandardCharsets.UTF_8);
                    c21287.m48503(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM48502 == 1937011815) {
                        c5866M17680 = C6122.m17680(str2);
                    } else if (iM48502 == 1885436268) {
                        charSequenceM17678 = C6122.m17678((String) null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM17678 == null) {
                    charSequenceM17678 = "";
                }
                if (c5866M17680 != null) {
                    c5866M17680.m17079(charSequenceM17678);
                    c2137M17073 = c5866M17680.m17073();
                } else {
                    Pattern pattern = C6122.f20889;
                    C12087 c12087 = new C12087();
                    c12087.f38920 = charSequenceM17678;
                    c2137M17073 = c12087.m30269().m17073();
                }
                arrayList.add(c2137M17073);
            } else {
                c21287.m48503(iM48500 - 8);
            }
        }
        interfaceC8103.accept(new C16187(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
