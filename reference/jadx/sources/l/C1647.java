package l;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.֫ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1647 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5376 f5718;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Inflater f5719;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21287 f5721 = new C21287();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f5720 = new C21287();

    @Override // l.InterfaceC2763
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        return C19171.m44438(this, bArr, i2);
    }

    public C1647(List list) {
        C5376 c5376 = new C5376();
        this.f5718 = c5376;
        c5376.m16065(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        C2137 c2137M16063;
        C21287 c21287 = this.f5721;
        c21287.m48491(i2 + i, bArr);
        c21287.m48510(i);
        if (this.f5719 == null) {
            this.f5719 = new Inflater();
        }
        Inflater inflater = this.f5719;
        String str = C7116.f23455;
        if (c21287.m48486() > 0 && c21287.m48502() == 120) {
            C21287 c21288 = this.f5720;
            if (C7116.m19492(c21287, c21288, inflater)) {
                c21287.m48491(c21288.m48509(), c21288.m48497());
            }
        }
        C5376 c5376 = this.f5718;
        c5376.m16064();
        int iM48486 = c21287.m48486();
        if (iM48486 < 2 || c21287.m48494() != iM48486) {
            c2137M16063 = null;
        } else {
            c5376.m16066(c21287);
            c2137M16063 = c5376.m16063(c21287);
        }
        interfaceC8103.accept(new C16187(-9223372036854775807L, 5000000L, c2137M16063 != null ? AbstractC1928.of((Object) c2137M16063) : AbstractC1928.of()));
    }
}
