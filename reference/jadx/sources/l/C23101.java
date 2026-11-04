package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩸᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes.dex */
public final class C23101 implements InterfaceC17649 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f74895;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f74896;

    public C23101(String str, String str2) {
        this.f74896 = str;
        this.f74895 = str2;
    }

    @Override // l.InterfaceC17649
    /* JADX INFO: renamed from: ۙ */
    public final C9444 mo19233(C4688 c4688) {
        C0496 c0496M21650 = c4688.m14558().m21650();
        int i = C6693.f22285;
        Charset charset = StandardCharsets.UTF_8;
        c0496M21650.m2398("Authorization", C14301.m34741(this.f74896, this.f74895));
        return c4688.m14554(c0496M21650.m2389());
    }
}
