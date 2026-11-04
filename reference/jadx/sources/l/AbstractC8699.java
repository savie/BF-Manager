package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۠ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4CH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8699 implements Closeable {
    /* JADX INFO: renamed from: ۤ */
    public abstract long mo9079();

    /* JADX INFO: renamed from: ۫ */
    public abstract InterfaceC25000 mo9080();

    /* JADX INFO: renamed from: ܳ */
    public abstract C16157 mo9081();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m23391() {
        return mo9080().mo4183();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m23393() throws IOException {
        long jMo9079 = mo9079();
        if (jMo9079 > 2147483647L) {
            throw new IOException(C24770.m55292(jMo9079, "Cannot buffer entire body for content length: "));
        }
        InterfaceC25000 interfaceC25000Mo9080 = mo9080();
        try {
            byte[] bArrMo4179 = interfaceC25000Mo9080.mo4179();
            C19822.m45601(interfaceC25000Mo9080);
            if (jMo9079 == -1 || jMo9079 == bArrMo4179.length) {
                return bArrMo4179;
            }
            throw new IOException(C12669.m31437(bArrMo4179.length, ") disagree", C2458.m8289("Content-Length (", ") and stream length (", jMo9079)));
        } catch (Throwable th) {
            C19822.m45601(interfaceC25000Mo9080);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m23392() {
        InterfaceC25000 interfaceC25000Mo9080 = mo9080();
        try {
            C16157 c16157Mo9081 = mo9081();
            return interfaceC25000Mo9080.mo4177(C19822.m45596(interfaceC25000Mo9080, c16157Mo9081 != null ? c16157Mo9081.m38333(C19822.f63729) : C19822.f63729));
        } finally {
            C19822.m45601(interfaceC25000Mo9080);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C19822.m45601(mo9080());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC8699 m23390() {
        Charset charset = C19822.f63729;
        C1879 c1879 = new C1879();
        c1879.m6438("", 0, 0, charset);
        return new C2733(null, c1879.size(), c1879);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8699 m23389(C16157 c16157, long j, C1879 c1879) {
        return new C2733(c16157, j, c1879);
    }
}
