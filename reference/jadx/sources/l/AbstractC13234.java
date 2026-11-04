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

/* JADX INFO: renamed from: l.۫ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13234 implements InterfaceC15976 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42297 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24643 f42298;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f42299;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f42300;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC25075 f42296 = C16869.getDefault();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final boolean f42295 = System.getProperty("os.name", "").contains("OS X");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo32788(Collection collection);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC13234 mo32789(String str);

    public AbstractC13234(AbstractC24643 abstractC24643, InterfaceC24329 interfaceC24329) {
        C17359.requireNonNull(abstractC24643);
        this.f42298 = abstractC24643;
        if (C3445.isDirectory(interfaceC24329, new EnumC20599[0])) {
            throw new IllegalArgumentException("directories not supported");
        }
        this.f42299 = interfaceC24329;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String mo32790() {
        return this.f42299.getFileName().toString();
    }

    @Override // l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ */
    public EnumC17468 mo10885() {
        Set set = AbstractC24643.f79773;
        return AbstractC24643.m54974(this.f42299.getFileName().toString());
    }

    @Override // l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ */
    public boolean mo10886(String str, EnumC17468 enumC17468) {
        return m32786(this.f42299, str, enumC17468);
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
    public static boolean m32786(l.InterfaceC24329 r4, java.lang.String r5, l.EnumC17468 r6) {
        /*
            l.C17359.requireNonNull(r6)
            l.ܽۡۘ r0 = l.EnumC17468.OTHER
            r1 = 0
            if (r6 != r0) goto L19
            java.util.Set r0 = l.AbstractC24643.f79773
            l.᩺۬᩹ r0 = r4.getFileName()
            java.lang.String r0 = r0.toString()
            l.ܽۡۘ r0 = l.AbstractC24643.m54974(r0)
            if (r0 == r6) goto L19
            goto L7a
        L19:
            java.lang.StringBuilder r5 = l.C10732.m27333(r5)
            java.lang.String r6 = r6.f56797
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            l.᩺۬᩹ r6 = r4.getFileName()
            java.lang.String r6 = r6.toString()
            boolean r0 = r6.equals(r5)
            r2 = 1
            if (r0 == 0) goto L36
            goto L5c
        L36:
            l.᩻۬᩹ r0 = r4.getFileSystem()
            l.᩻۬᩹ r3 = l.AbstractC13234.f42296
            if (r0 != r3) goto L7a
            boolean r0 = l.AbstractC13234.f42295
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
            l.᩵۬᩹[] r6 = new l.EnumC20599[r2]     // Catch: java.io.IOException -> L7a
            l.᩵۬᩹ r0 = l.EnumC20599.NOFOLLOW_LINKS     // Catch: java.io.IOException -> L7a
            r6[r1] = r0     // Catch: java.io.IOException -> L7a
            l.᩺۬᩹ r4 = r4.toRealPath(r6)     // Catch: java.io.IOException -> L7a
            l.᩺۬᩹ r4 = r4.getFileName()     // Catch: java.io.IOException -> L7a
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L7a
            boolean r4 = r4.equals(r5)     // Catch: java.io.IOException -> L7a
            return r4
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC13234.m32786(l.᩺۬᩹, java.lang.String, l.ܽۡۘ):boolean");
    }

    @Override // l.InterfaceC11501
    public URI toUri() {
        return this.f42299.toUri();
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩷ */
    public final InputStream mo10889() {
        this.f42298.m54980();
        return C3445.newInputStream(this.f42299, new InterfaceC12394[0]);
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩴ */
    public final OutputStream mo10888() throws IOException {
        AbstractC24643 abstractC24643 = this.f42298;
        abstractC24643.m54980();
        abstractC24643.f79774.remove(this);
        m32787();
        return C3445.newOutputStream(this.f42299, new InterfaceC12394[0]);
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo7621(boolean z) throws IOException {
        AbstractC24643 abstractC24643 = this.f42298;
        HashMap map = abstractC24643.f79774;
        C6743 c6743 = (C6743) map.get(this);
        CharBuffer charBuffer = null;
        if (c6743 != null) {
            if (c6743.f22465 != mo10890()) {
                map.remove(this);
            } else {
                charBuffer = (CharBuffer) c6743.f22464.get();
            }
        }
        if (charBuffer != null) {
            return charBuffer;
        }
        InputStream inputStreamMo10889 = mo10889();
        try {
            ByteBuffer byteBufferM54976 = abstractC24643.m54976(inputStreamMo10889);
            InterfaceC15976 interfaceC15976M34530 = abstractC24643.f79776.m34530(this);
            try {
                CharBuffer charBufferM54977 = abstractC24643.m54977(byteBufferM54976, z);
                abstractC24643.f79776.m34530(interfaceC15976M34530);
                abstractC24643.m54978(byteBufferM54976);
                if (!z) {
                    abstractC24643.f79774.put(this, new C6743(this, charBufferM54977));
                }
                inputStreamMo10889.close();
                return charBufferM54977;
            } catch (Throwable th) {
                abstractC24643.f79776.m34530(interfaceC15976M34530);
                throw th;
            }
        } catch (Throwable th2) {
            if (inputStreamMo10889 != null) {
                try {
                    inputStreamMo10889.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ۤ */
    public final Writer mo10887() throws IOException {
        AbstractC24643 abstractC24643 = this.f42298;
        abstractC24643.m54980();
        abstractC24643.f79774.remove(this);
        m32787();
        return new OutputStreamWriter(C3445.newOutputStream(this.f42299, new InterfaceC12394[0]), abstractC24643.m54975());
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩸ */
    public final long mo10890() {
        try {
            return C3445.getLastModifiedTime(this.f42299, new EnumC20599[0]).toMillis();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // l.InterfaceC11501
    public final boolean delete() {
        try {
            C3445.delete(this.f42299);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC13234) && this.f42299.equals(((AbstractC13234) obj).f42299);
    }

    public final int hashCode() {
        return this.f42299.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f42299 + "]";
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m32787() throws IOException {
        if (this.f42300) {
            return;
        }
        InterfaceC24329 parent = this.f42299.getParent();
        if (parent != null && !C3445.isDirectory(parent, new EnumC20599[0])) {
            try {
                C3445.createDirectories(parent, new InterfaceC13885[0]);
            } catch (IOException e) {
                throw new IOException("could not create parent directories", e);
            }
        }
        this.f42300 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32785(InterfaceC24329 interfaceC24329) {
        String string = interfaceC24329.toString();
        String separator = interfaceC24329.getFileSystem().getSeparator();
        int iLastIndexOf = string.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            string = string.substring(0, iLastIndexOf);
        }
        return string.replace(separator, ".");
    }
}
