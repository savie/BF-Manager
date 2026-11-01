package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8A1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18700 extends IOException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC3055 f60674;

    public C18700(C1186 c1186, String str) {
        super(String.format("%s returned %s (%d/%d): %s", c1186.m4325(), Long.valueOf(c1186.m4349()), Long.valueOf(c1186.m4349()), Long.valueOf(c1186.m4349()), str));
        this.f60674 = EnumC3055.m9149(c1186.m4349());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3055 m43239() {
        return this.f60674;
    }
}
