package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.֡֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C0060 implements InterfaceC17432, InterfaceC9687 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Set f940 = C4681.unmodifiableSet(EnumSet.of(EnumC0785.FILE_SHARE_READ, EnumC0785.FILE_SHARE_WRITE, EnumC0785.FILE_SHARE_DELETE));

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C9973 f942;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0806 f943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14448 f944;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f941 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f945 = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m992() {
        if (!this.f941 && !this.f945) {
            this.f945 = true;
            C0806 c0806 = this.f943;
            C18178 c18178 = this.f944.f45463;
            C9973 c9973 = c18178.f59411;
            C4754.m14662(c0806);
            boolean zM3243 = c0806.m3243();
            int i = C18924.f61387;
            if (zM3243) {
                c18178.f59410 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public synchronized void m1004() {
        if (!this.f941 && !this.f945) {
            this.f941 = true;
            this.f944.m34874(this.f943);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public synchronized void m1012() {
        try {
            C14448 c14448 = this.f944;
            this.f943 = c14448.f45461.m43931(c14448.f45463, c14448.f45462);
            this.f941 = false;
            this.f945 = false;
        } catch (IOException e) {
            throw e;
        }
    }

    public C0060(C9973 c9973, C0806 c0806, C14448 c14448) {
        this.f942 = c9973;
        this.f944 = c14448;
        this.f943 = c0806;
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo1022(final String str) {
        try {
            return (List) m987(new InterfaceC20943() { // from class: l.ܿܿ۫
                @Override // l.InterfaceC20943
                public final Object call() {
                    return C0060.m988(this.f60161, str);
                }
            });
        } finally {
            m1004();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m988(C0060 c0060, String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (str.equals("/")) {
            for (C15174 c15174 : new C19650(EnumC7717.f25429.m21000(c0060.f943.f2862)).m45299(c0060.f942.f32073)) {
                int iM36487 = c15174.m36487() & Mod.M30;
                if (iM36487 == 0 || iM36487 == 33554432 || iM36487 == 67108864 || iM36487 == 134217728) {
                    if (!c15174.m36484().endsWith("$")) {
                        arrayList.add(new C7518(c15174));
                    }
                }
            }
        } else {
            C14229 c14229M1011 = c0060.m1011(str, true);
            for (C9055 c9055 : c14229M1011.f44959.m52738(c14229M1011.f44958)) {
                String strM20655 = c9055.m20655();
                if (!strM20655.equals(".") && !strM20655.equals("..")) {
                    arrayList.add(new C7518(c9055));
                }
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo1025(final long j, final String str) {
        try {
            m987(new InterfaceC20943() { // from class: l.ۡܿ۫
                @Override // l.InterfaceC20943
                public final Object call() throws IOException {
                    C0060.m1015(this.f30870, str, j);
                    return null;
                }
            });
        } finally {
            m1004();
        }
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1023(String str, String str2) {
        String[] strArrM1006 = m1006(str);
        String[] strArrM1007 = m1006(str2);
        try {
            if (!strArrM1006[0].equals(strArrM1007[0])) {
                throw new IOException("Cannot rename between different shares");
            }
            if (!strArrM1006[1].equals(strArrM1007[1])) {
                try {
                    m993(strArrM1006[0], strArrM1006[1], strArrM1007[1]);
                } catch (C22172 e) {
                    throw new IOException(e.getMessage(), e);
                } catch (C12082 e2) {
                    if (!m1000((Exception) e2)) {
                        throw m983(e2);
                    }
                    IOException iOExceptionM983 = m983(e2);
                    try {
                        m1012();
                        m998(this, strArrM1006, strArrM1007);
                    } catch (IOException e3) {
                        throw m980(iOExceptionM983, e3);
                    } catch (C22172 e4) {
                        throw m980(iOExceptionM983, new IOException(e4.getMessage(), e4));
                    } catch (C12082 e5) {
                        throw m980(iOExceptionM983, m983(e5));
                    }
                }
                m1004();
                return;
            }
            m1004();
        } catch (Throwable th) {
            m1004();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m998(C0060 c0060, String[] strArr, String[] strArr2) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr2[1];
        C23533 c23533 = (C23533) c0060.f943.f2862.m27582(str);
        if (c23533.m52734(str2) || c23533.m52737(str2) || !(c23533.m52734(str3) || c23533.m52737(str3))) {
            c0060.m993(strArr[0], strArr[1], strArr2[1]);
        }
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo1026(String str) {
        try {
            try {
                m1017(str);
            } catch (C22172 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C12082 e2) {
                if (!m1000((Exception) e2)) {
                    throw m983(e2);
                }
                IOException iOExceptionM983 = m983(e2);
                try {
                    try {
                        try {
                            m1012();
                            m1014(this, str);
                        } catch (C22172 e3) {
                            throw m980(iOExceptionM983, new IOException(e3.getMessage(), e3));
                        }
                    } catch (IOException e4) {
                        throw m980(iOExceptionM983, e4);
                    }
                } catch (C12082 e5) {
                    throw m980(iOExceptionM983, m983(e5));
                }
            }
            m1004();
        } catch (Throwable th) {
            m1004();
            throw th;
        }
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24277 mo1028(final String str) throws IOException {
        try {
            return new C20197(new C14975(this, (C3395) m987(new InterfaceC20943() { // from class: l.֨ܿ۫
                @Override // l.InterfaceC20943
                public final Object call() {
                    return this.f4768.m1007(str);
                }
            })), new C4535(this), new C8043(this, str), new C7297(this));
        } catch (IOException e) {
            try {
                m1004();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InputStream mo1027(long j, String str) {
        return m984(str, j, -1L, new C21468(), false);
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo1019(String str, long j, long j2) {
        final long j3 = C25227.FOREVER_NS;
        if (j2 >= 0 && C25227.FOREVER_NS - j >= j2) {
            j3 = j + j2;
        }
        return m984(str, j, j2, new LongSupplier() { // from class: l.ᩳܿ۫
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return j3;
            }
        }, true);
    }

    @Override // l.InterfaceC9687
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo1020(String str, long j, long j2, C10588 c10588) {
        return m984(str, j, j2, c10588, true);
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo1021(long j, final String str) throws IOException {
        try {
            C1552 c1552 = new C1552((C3395) m987(new InterfaceC20943() { // from class: l.ۖܿ۫
                @Override // l.InterfaceC20943
                public final Object call() {
                    return this.f9273.m1002(str, true);
                }
            }));
            int iM11111 = c1552.f5357.m11111();
            return new C5281(iM11111, m979(iM11111, this.f943.f2861.m48066()), new C19451(this, c1552, str, iM11111), new C8788(this, c1552), new C7297(this), new C14008(this), new C13921(1));
        } catch (IOException e) {
            try {
                m1004();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m996(C0060 c0060, C1552 c1552) throws IOException {
        IOException iOExceptionM982 = c0060.m982(c1552.f5357, (IOException) null);
        if (iOExceptionM982 != null) {
            throw iOExceptionM982;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private IOException m983(C12082 c12082) {
        m992();
        return new IOException(c12082.getMessage(), c12082);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m987(InterfaceC20943 interfaceC20943) throws IOException {
        try {
            return interfaceC20943.call();
        } catch (C22172 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C12082 e2) {
            if (!m1000((Exception) e2)) {
                throw m983(e2);
            }
            IOException iOExceptionM983 = m983(e2);
            try {
                m1012();
                return interfaceC20943.call();
            } catch (IOException e3) {
                throw m980(iOExceptionM983, e3);
            } catch (C22172 e4) {
                throw m980(iOExceptionM983, new IOException(e4.getMessage(), e4));
            } catch (C12082 e5) {
                throw m980(iOExceptionM983, m983(e5));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m986(C0060 c0060, C12082 c12082, InterfaceC16467 interfaceC16467) throws IOException {
        if (!m1000((Exception) c12082)) {
            throw c0060.m983(c12082);
        }
        IOException iOExceptionM983 = c0060.m983(c12082);
        try {
            c0060.m1012();
            return interfaceC16467.get();
        } catch (IOException e) {
            throw m980(iOExceptionM983, e);
        } catch (C22172 e2) {
            throw m980(iOExceptionM983, new IOException(e2.getMessage(), e2));
        } catch (C12082 e3) {
            throw m980(iOExceptionM983, c0060.m983(e3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m985(C0060 c0060, IOException iOException, C11992 c11992) throws IOException {
        if (!m1000((Exception) iOException)) {
            c0060.m992();
            throw iOException;
        }
        c0060.m992();
        try {
            c0060.m1012();
            return c11992.get();
        } catch (IOException e) {
            c0060.m992();
            throw m980(iOException, e);
        } catch (C22172 e2) {
            throw m980(iOException, new IOException(e2.getMessage(), e2));
        } catch (C12082 e3) {
            throw m980(iOException, c0060.m983(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException m982(C3395 c3395, IOException iOException) {
        if (c3395 == null) {
            return iOException;
        }
        try {
            c3395.close();
            return iOException;
        } catch (C22172 e) {
            return m980(iOException, new IOException(e.getMessage(), e));
        } catch (C12082 e2) {
            return m980(iOException, m983(e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m980(IOException iOException, IOException iOException2) {
        if (iOException == null) {
            return iOException2;
        }
        if (iOException == iOException2) {
            return iOException;
        }
        iOException.addSuppressed(iOException2);
        return iOException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InputStream m984(final String str, long j, long j2, LongSupplier longSupplier, boolean z) throws IOException {
        try {
            C3789 c3789M991 = m991((C3395) m987(new InterfaceC20943() { // from class: l.֡ܿ۫
                @Override // l.InterfaceC20943
                public final Object call() {
                    return this.f2350.m1007(str);
                }
            }), j, j2, z);
            if (z) {
                return new C6027(c3789M991, j, longSupplier, new C4535(this), new InterfaceC11246() { // from class: l.᩷֡۫
                    @Override // l.InterfaceC11246
                    /* JADX INFO: renamed from: ۙ */
                    public final Object mo28472(IOException iOException, C11992 c11992) {
                        return C0060.m985(this.f69221, iOException, c11992);
                    }
                }, new InterfaceC17213() { // from class: l.ۤ֡۫
                    @Override // l.InterfaceC17213
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final Object mo26956(long j3, long j4) {
                        return C0060.m990(this.f33409, str, j3, j4);
                    }
                }, new C7297(this), new C14008(this), true);
            }
            return new C6027(c3789M991, j, new C21468(), new C4535(this), new InterfaceC11246() { // from class: l.᩷֡۫
                @Override // l.InterfaceC11246
                /* JADX INFO: renamed from: ۙ */
                public final Object mo28472(IOException iOException, C11992 c11992) {
                    return C0060.m985(this.f69221, iOException, c11992);
                }
            }, new InterfaceC17213() { // from class: l.᩸֡۫
                @Override // l.InterfaceC17213
                /* JADX INFO: renamed from: ۙ */
                public final Object mo26956(long j3, long j4) {
                    return C0060.m989(this.f72633, str, j3);
                }
            }, new C7297(this), new C7297(this), false);
        } catch (IOException e) {
            try {
                m1004();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3789 m989(C0060 c0060, String str, long j) throws IOException {
        try {
            return c0060.m991(c0060.m1007(str), j, -1L, false);
        } catch (C22172 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3789 m990(C0060 c0060, String str, long j, long j2) throws IOException {
        try {
            return c0060.m991(c0060.m1007(str), j, j2, true);
        } catch (C22172 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3789 m991(C3395 c3395, long j, long j2, boolean z) {
        InputStream inputStreamM11114;
        int iM11112 = c3395.m11112();
        int iMax = (!z || iM11112 <= 0) ? 1 : Math.max(1, Math.min(4, 1048576 / iM11112));
        if (z) {
            inputStreamM11114 = c3395.m11110(j, iMax, j2);
        } else {
            inputStreamM11114 = c3395.m11114(j);
        }
        return new C3789(inputStreamM11114, new C10279(this, c3395, inputStreamM11114));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C14975 m1005(C0060 c0060, String str) throws IOException {
        try {
            return new C14975(c0060, c0060.m1007(str));
        } catch (C22172 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m997(C0060 c0060, C3395 c3395, InputStream inputStream) throws IOException {
        try {
            inputStream.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        IOException iOExceptionM982 = c0060.m982(c3395, e);
        if (iOExceptionM982 != null) {
            throw iOExceptionM982;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m979(int i, int i2) {
        int iMax = i <= 0 ? 1 : Math.max(1, Math.min(4, 4194304 / i));
        if (i <= 0 || i2 <= 0) {
            return 1;
        }
        return Math.min(iMax, Math.max(1, i2 / (((i - 1) / 65536) + 1)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1000(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof EOFException) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m995(C0060 c0060, String str, boolean z) throws IOException {
        C14229 c14229M1011 = c0060.m1011(str, false);
        C23533 c23533 = c14229M1011.f44959;
        String str2 = c14229M1011.f44958;
        if (z ? c23533.m52737(str2) : c23533.m52734(str2)) {
            C14229 c14229M1012 = c0060.m1011(str, false);
            if (z) {
                c14229M1012.f44959.m52733(c14229M1012.f44958, true);
            } else {
                c14229M1012.f44959.m52735(c14229M1012.f44958);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3395 m1002(String str, boolean z) throws IOException {
        C14229 c14229M1011 = m1011(str, false);
        return c14229M1011.f44959.m52736(c14229M1011.f44958, EnumSet.of(EnumC15767.GENERIC_WRITE), EnumSet.of(EnumC12038.FILE_ATTRIBUTE_NORMAL), EnumSet.of(EnumC0785.FILE_SHARE_WRITE), z ? EnumC11225.FILE_OVERWRITE_IF : EnumC11225.FILE_OPEN, EnumSet.noneOf(EnumC23160.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3395 m1007(String str) throws IOException {
        C14229 c14229M1011 = m1011(str, false);
        return c14229M1011.f44959.m52736(c14229M1011.f44958, EnumSet.of(EnumC15767.GENERIC_READ), EnumSet.of(EnumC12038.FILE_ATTRIBUTE_NORMAL), f940, EnumC11225.FILE_OPEN, EnumSet.noneOf(EnumC23160.class));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m1014(C0060 c0060, String str) throws IOException {
        C14229 c14229M1011 = c0060.m1011(str, false);
        if (c14229M1011.f44959.m52737(c14229M1011.f44958)) {
            return;
        }
        c0060.m1017(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m1015(C0060 c0060, String str, long j) throws IOException {
        C14229 c14229M1011 = c0060.m1011(str, false);
        C23227 c23227 = new C23227((TimeUnit.NANOSECONDS.convert(j, TimeUnit.MILLISECONDS) / 100) + 116444736000000000L);
        C23533 c23533 = c14229M1011.f44959;
        String str2 = c14229M1011.f44958;
        C23227 c23228 = C20989.f67105;
        C20989 c20989 = new C20989(c23228, c23228, c23227, c23227, 0L);
        AbstractC5633 abstractC5633M52731 = c23533.m52731(str2, (Set) EnumSet.of(EnumC15767.FILE_WRITE_ATTRIBUTES, EnumC15767.FILE_WRITE_EA), (EnumSet) null, EnumC0785.f2811, EnumC11225.FILE_OPEN, (EnumSet) null);
        try {
            abstractC5633M52731.m16614(c20989);
            abstractC5633M52731.close();
        } catch (Throwable th) {
            try {
                abstractC5633M52731.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m1017(String str) throws IOException {
        C14229 c14229M1011 = m1011(str, false);
        c14229M1011.f44959.m52732(c14229M1011.f44958, EnumSet.of(EnumC15767.FILE_LIST_DIRECTORY, EnumC15767.FILE_ADD_SUBDIRECTORY), EnumSet.of(EnumC12038.FILE_ATTRIBUTE_DIRECTORY), EnumC0785.f2811, EnumC11225.FILE_CREATE, EnumSet.of(EnumC23160.FILE_DIRECTORY_FILE)).close();
    }

    @Override // l.InterfaceC17432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1024(String str, boolean z) {
        try {
            try {
                try {
                    C14229 c14229M1011 = m1011(str, false);
                    if (z) {
                        c14229M1011.f44959.m52733(c14229M1011.f44958, true);
                    } else {
                        c14229M1011.f44959.m52735(c14229M1011.f44958);
                    }
                } catch (C22172 e) {
                    throw new IOException(e.getMessage(), e);
                }
            } catch (C12082 e2) {
                if (!m1000((Exception) e2)) {
                    throw m983(e2);
                }
                IOException iOExceptionM983 = m983(e2);
                try {
                    try {
                        try {
                            m1012();
                            m995(this, str, z);
                        } catch (IOException e3) {
                            throw m980(iOExceptionM983, e3);
                        }
                    } catch (C12082 e4) {
                        throw m980(iOExceptionM983, m983(e4));
                    }
                } catch (C22172 e5) {
                    throw m980(iOExceptionM983, new IOException(e5.getMessage(), e5));
                }
            }
            m1004();
        } catch (Throwable th) {
            m1004();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C14229 m1011(String str, boolean z) throws IOException {
        String[] strArrM1006 = m1006(str);
        if (!z && strArrM1006[1].isEmpty()) {
            throw new IOException("Operation not supported!");
        }
        return new C14229((C23533) this.f943.f2862.m27582(strArrM1006[0]), strArrM1006[1]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m993(String str, String str2, String str3) {
        AbstractC5633 abstractC5633M52731 = ((C23533) this.f943.f2862.m27582(str)).m52731(str2, (Set) EnumSet.of(EnumC15767.DELETE, EnumC15767.GENERIC_WRITE, EnumC15767.GENERIC_READ), (EnumSet) null, (Set) EnumSet.of(EnumC0785.FILE_SHARE_DELETE, EnumC0785.FILE_SHARE_READ, EnumC0785.FILE_SHARE_WRITE), EnumC11225.FILE_OPEN, (EnumSet) null);
        try {
            abstractC5633M52731.m16614(new C19035(str3));
            abstractC5633M52731.close();
        } catch (Throwable th) {
            try {
                abstractC5633M52731.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String[] m1006(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf == -1 ? new String[]{str, ""} : new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + 1).replace('/', '\\')};
    }
}
