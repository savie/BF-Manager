package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes.dex */
public final class C22540 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m50779() throws IOException {
        C0496 c0496 = new C0496();
        c0496.m2397(C13047.m32498());
        C9444 c9444Execute = C21576.m49093().m54450(c0496.m2389()).execute();
        if (!c9444Execute.m24819()) {
            int iM24820 = c9444Execute.m24820();
            c9444Execute.close();
            throw new IOException(C13645.m33382(iM24820, "Boot hierarchy download failed with HTTP "));
        }
        AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
        if (abstractC8699M24818 != null) {
            return new C10605(abstractC8699M24818.m23391(), c9444Execute);
        }
        c9444Execute.close();
        throw new IOException("Boot hierarchy download body is null");
    }
}
