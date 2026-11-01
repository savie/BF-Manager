package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6344 implements InterfaceC2173 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21400 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC3178 f21401 = C4506.getDefault();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final boolean f21402 = System.getProperty("os.name", "").contains("OS X");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3729 f21403;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f21404;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21405;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo17449(Collection collection);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC6344 mo17450(String str);

    public AbstractC6344(AbstractC3729 abstractC3729, InterfaceC3800 interfaceC3800) {
        C13638.requireNonNull(abstractC3729);
        this.f21403 = abstractC3729;
        if (C5212.isDirectory(interfaceC3800, new EnumC22146[0])) {
            throw new IllegalArgumentException("directories not supported");
        }
        this.f21404 = interfaceC3800;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String mo17451() {
        return this.f21404.getFileName().toString();
    }

    @Override // l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public EnumC11347 mo6760() {
        Set set = AbstractC3729.f13542;
        return AbstractC3729.m10910(this.f21404.getFileName().toString());
    }

    @Override // l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public boolean mo6761(String str, EnumC11347 enumC11347) {
        return m17448(this.f21404, str, enumC11347);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (java.text.Normalizer.normalize(r6, r0).equals(r5) != false) goto L20;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m17448(l.InterfaceC3800 r4, java.lang.String r5, l.EnumC11347 r6) {
        /*
            l.C13638.requireNonNull(r6)
            l.ۨ֡۟ r0 = l.EnumC11347.OTHER
            r1 = 0
            if (r6 != r0) goto L19
            java.util.Set r0 = l.AbstractC3729.f13542
            l.ۘ۟ᩴ r0 = r4.getFileName()
            java.lang.String r0 = r0.toString()
            l.ۨ֡۟ r0 = l.AbstractC3729.m10910(r0)
            if (r0 == r6) goto L19
            goto L7a
        L19:
            java.lang.StringBuilder r5 = l.C9023.m23356(r5)
            java.lang.String r6 = r6.f38286
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            l.ۘ۟ᩴ r6 = r4.getFileName()
            java.lang.String r6 = r6.toString()
            boolean r0 = r6.equals(r5)
            r2 = 1
            if (r0 == 0) goto L36
            goto L5c
        L36:
            l.ۗۤᩴ r0 = r4.getFileSystem()
            l.ۗۤᩴ r3 = l.AbstractC6344.f21401
            if (r0 != r3) goto L7a
            boolean r0 = l.AbstractC6344.f21402
            if (r0 == 0) goto L5d
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFD
            boolean r0 = java.text.Normalizer.isNormalized(r6, r0)
            if (r0 == 0) goto L5d
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFC
            boolean r3 = java.text.Normalizer.isNormalized(r5, r0)
            if (r3 == 0) goto L5d
            java.lang.String r0 = java.text.Normalizer.normalize(r6, r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5d
        L5c:
            return r2
        L5d:
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L7a
            l.᩹۟ᩴ[] r6 = new l.EnumC22146[r2]     // Catch: java.io.IOException -> L7a
            l.᩹۟ᩴ r0 = l.EnumC22146.NOFOLLOW_LINKS     // Catch: java.io.IOException -> L7a
            r6[r1] = r0     // Catch: java.io.IOException -> L7a
            l.ۘ۟ᩴ r4 = r4.toRealPath(r6)     // Catch: java.io.IOException -> L7a
            l.ۘ۟ᩴ r4 = r4.getFileName()     // Catch: java.io.IOException -> L7a
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L7a
            boolean r4 = r4.equals(r5)     // Catch: java.io.IOException -> L7a
            return r4
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC6344.m17448(l.ۘ۟ᩴ, java.lang.String, l.ۨ֡۟):boolean");
    }

    @Override // l.InterfaceC3458
    public URI toUri() {
        return this.f21404.toUri();
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ܰ */
    public final InputStream mo10167() {
        this.f21403.m10921();
        return C5212.newInputStream(this.f21404, new InterfaceC0978[0]);
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۚ */
    public final OutputStream mo10165() throws IOException {
        AbstractC3729 abstractC3729 = this.f21403;
        abstractC3729.m10921();
        abstractC3729.f13551.remove(this);
        m17446();
        return C5212.newOutputStream(this.f21404, new InterfaceC0978[0]);
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo10164(boolean z) throws IOException {
        AbstractC3729 abstractC3729 = this.f21403;
        HashMap map = abstractC3729.f13551;
        C12903 c12903 = (C12903) map.get(this);
        CharBuffer charBuffer = null;
        if (c12903 != null) {
            if (c12903.f42892 != mo10163()) {
                map.remove(this);
            } else {
                charBuffer = (CharBuffer) c12903.f42891.get();
            }
        }
        if (charBuffer != null) {
            return charBuffer;
        }
        InputStream inputStreamMo10167 = mo10167();
        try {
            ByteBuffer byteBufferM10914 = abstractC3729.m10914(inputStreamMo10167);
            InterfaceC2173 interfaceC2173M48202 = abstractC3729.f13549.m48202(this);
            try {
                CharBuffer charBufferM10915 = abstractC3729.m10915(byteBufferM10914, z);
                abstractC3729.f13549.m48202(interfaceC2173M48202);
                abstractC3729.m10916(byteBufferM10914);
                if (!z) {
                    abstractC3729.f13551.put(this, new C12903(this, charBufferM10915));
                }
                inputStreamMo10167.close();
                return charBufferM10915;
            } catch (Throwable th) {
                abstractC3729.f13549.m48202(interfaceC2173M48202);
                throw th;
            }
        } catch (Throwable th2) {
            if (inputStreamMo10167 != null) {
                try {
                    inputStreamMo10167.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۨ */
    public final Writer mo10166() throws IOException {
        AbstractC3729 abstractC3729 = this.f21403;
        abstractC3729.m10921();
        abstractC3729.f13551.remove(this);
        m17446();
        return new OutputStreamWriter(C5212.newOutputStream(this.f21404, new InterfaceC0978[0]), abstractC3729.m10913());
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۖ */
    public final long mo10163() {
        try {
            return C5212.getLastModifiedTime(this.f21404, new EnumC22146[0]).toMillis();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // l.InterfaceC3458
    public final boolean delete() {
        try {
            C5212.delete(this.f21404);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC6344) && this.f21404.equals(((AbstractC6344) obj).f21404);
    }

    public final int hashCode() {
        return this.f21404.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f21404 + "]";
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m17446() throws IOException {
        if (this.f21405) {
            return;
        }
        InterfaceC3800 parent = this.f21404.getParent();
        if (parent != null && !C5212.isDirectory(parent, new EnumC22146[0])) {
            try {
                C5212.createDirectories(parent, new InterfaceC20030[0]);
            } catch (IOException e) {
                throw new IOException("could not create parent directories", e);
            }
        }
        this.f21405 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17447(InterfaceC3800 interfaceC3800) {
        String string = interfaceC3800.toString();
        String separator = interfaceC3800.getFileSystem().getSeparator();
        int iLastIndexOf = string.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            string = string.substring(0, iLastIndexOf);
        }
        return string.replace(separator, ".");
    }
}
