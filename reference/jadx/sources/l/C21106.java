package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩷᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A8E */
/* JADX INFO: loaded from: classes5.dex */
public final class C21106 implements InterfaceC17033 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f68752;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f68753;

    public C21106(String str, String str2) {
        this.f68752 = str;
        this.f68753 = str2;
    }

    @Override // l.InterfaceC17033
    /* JADX INFO: renamed from: ۙ */
    public final C22719 mo30085(C18485 c18485) {
        if (c18485.m42866().m50357("Authorization") != null) {
            return null;
        }
        int i = C21938.f71167;
        Charset charset = StandardCharsets.UTF_8;
        String strM44399 = C19378.m44399(this.f68752, this.f68753);
        C6490 c6490M50362 = c18485.m42866().m50362();
        c6490M50362.m17687("Authorization", strM44399);
        return c6490M50362.m17678();
    }
}
