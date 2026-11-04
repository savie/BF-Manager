package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۬ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A8E */
/* JADX INFO: loaded from: classes4.dex */
public final class C13798 implements InterfaceC2120 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f43769;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f43770;

    public C13798(String str, String str2) {
        this.f43769 = str;
        this.f43770 = str2;
    }

    @Override // l.InterfaceC2120
    /* JADX INFO: renamed from: ۙ */
    public final C7954 mo7307(C9444 c9444) {
        if (c9444.m24826().m21646("Authorization") != null) {
            return null;
        }
        int i = C6693.f22285;
        Charset charset = StandardCharsets.UTF_8;
        String strM34741 = C14301.m34741(this.f43769, this.f43770);
        C0496 c0496M21650 = c9444.m24826().m21650();
        c0496M21650.m2398("Authorization", strM34741);
        return c0496M21650.m2389();
    }
}
