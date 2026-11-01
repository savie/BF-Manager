package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֨ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes2.dex */
public final class C0953 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m3715() throws IOException {
        C6490 c6490 = new C6490();
        c6490.m17686(C1355.m4786());
        C18485 c18485Execute = C16737.m39297().m14157(c6490.m17678()).execute();
        if (!c18485Execute.m42863()) {
            int iM42858 = c18485Execute.m42858();
            c18485Execute.close();
            throw new IOException(C8479.m22141(iM42858, "Boot hierarchy download failed with HTTP "));
        }
        AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
        if (abstractC19191M42860 != null) {
            return new C22121(abstractC19191M42860.m44051(), c18485Execute);
        }
        c18485Execute.close();
        throw new IOException("Boot hierarchy download body is null");
    }
}
