package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܽ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16873 implements InterfaceC1738 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f53969;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f53970;

    public C16873(String str, String str2) {
        this.f53970 = str;
        this.f53969 = str2;
    }

    @Override // l.InterfaceC1738
    /* JADX INFO: renamed from: ۙ */
    public final C18485 mo5785(C7247 c7247) {
        C6490 c6490M50362 = c7247.m19366().m50362();
        int i = C21938.f71167;
        Charset charset = StandardCharsets.UTF_8;
        c6490M50362.m17687("Authorization", C19378.m44399(this.f53970, this.f53969));
        return c7247.m19370(c6490M50362.m17678());
    }
}
