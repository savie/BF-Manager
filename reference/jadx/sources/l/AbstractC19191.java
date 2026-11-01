package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩵ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F4CH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19191 implements Closeable {
    /* JADX INFO: renamed from: ֨ */
    public abstract InterfaceC23683 mo5211();

    /* JADX INFO: renamed from: ۖ */
    public abstract long mo5212();

    /* JADX INFO: renamed from: ᩹ */
    public abstract C9501 mo5213();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m44051() {
        return mo5211().mo16433();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m44052() throws IOException {
        long jMo5212 = mo5212();
        if (jMo5212 > 2147483647L) {
            throw new IOException(C15489.m37074(jMo5212, "Cannot buffer entire body for content length: "));
        }
        InterfaceC23683 interfaceC23683Mo5211 = mo5211();
        try {
            byte[] bArrMo16422 = interfaceC23683Mo5211.mo16422();
            C0140.m1231(interfaceC23683Mo5211);
            if (jMo5212 == -1 || jMo5212 == bArrMo16422.length) {
                return bArrMo16422;
            }
            throw new IOException(C12441.m30911(bArrMo16422.length, ") disagree", C17114.m39970("Content-Length (", ") and stream length (", jMo5212)));
        } catch (Throwable th) {
            C0140.m1231(interfaceC23683Mo5211);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m44053() {
        InterfaceC23683 interfaceC23683Mo5211 = mo5211();
        try {
            C9501 c9501Mo5213 = mo5213();
            return interfaceC23683Mo5211.mo16404(C0140.m1226(interfaceC23683Mo5211, c9501Mo5213 != null ? c9501Mo5213.m24338(C0140.f1178) : C0140.f1178));
        } finally {
            C0140.m1231(interfaceC23683Mo5211);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0140.m1231(mo5211());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC19191 m44050() {
        Charset charset = C0140.f1178;
        C6043 c6043 = new C6043();
        c6043.m16409("", 0, 0, charset);
        return new C7902(null, c6043.size(), c6043);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19191 m44049(C9501 c9501, long j, C6043 c6043) {
        return new C7902(c9501, j, c6043);
    }
}
