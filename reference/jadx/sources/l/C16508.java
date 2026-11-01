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

/* JADX INFO: renamed from: l.ܽ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16508 implements InterfaceC21777, InterfaceC11362 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Set f53027 = C0561.unmodifiableSet(EnumSet.of(EnumC13182.FILE_SHARE_READ, EnumC13182.FILE_SHARE_WRITE, EnumC13182.FILE_SHARE_DELETE));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16133 f53028;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6254 f53029;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10864 f53030;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f53031 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f53032 = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m38799() {
        if (!this.f53031 && !this.f53032) {
            this.f53032 = true;
            C10864 c10864 = this.f53030;
            C0609 c0609 = this.f53028.f52135;
            C6254 c6254 = c0609.f2623;
            C4843.m13442(c10864);
            boolean zM27218 = c10864.m27218();
            int i = C17543.f55759;
            if (zM27218) {
                c0609.f2622 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public synchronized void m38814() {
        if (!this.f53031 && !this.f53032) {
            this.f53031 = true;
            this.f53028.m38188(this.f53030);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public synchronized void m38817() {
        try {
            C16133 c16133 = this.f53028;
            this.f53030 = c16133.f52133.m40811(c16133.f52135, c16133.f52134);
            this.f53031 = false;
            this.f53032 = false;
        } catch (IOException e) {
            throw e;
        }
    }

    public C16508(C6254 c6254, C10864 c10864, C16133 c16133) {
        this.f53029 = c6254;
        this.f53028 = c16133;
        this.f53030 = c10864;
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ */
    public final List mo38147(final String str) {
        try {
            return (List) m38794(new InterfaceC20036() { // from class: l.֡ᩴ֨
                @Override // l.InterfaceC20036
                public final Object call() {
                    return C16508.m38795(this.f2558, str);
                }
            });
        } finally {
            m38814();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m38795(C16508 c16508, String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (str.equals("/")) {
            for (C17248 c17248 : new C12310(EnumC21522.f69924.m48246(c16508.f53030.f36941)).m30572(c16508.f53029.f21214)) {
                int iM40211 = c17248.m40211() & Mod.M30;
                if (iM40211 == 0 || iM40211 == 33554432 || iM40211 == 67108864 || iM40211 == 134217728) {
                    if (!c17248.m40208().endsWith("$")) {
                        arrayList.add(new C12275(c17248));
                    }
                }
            }
        } else {
            C15803 c15803M38816 = c16508.m38816(str, true);
            for (C21545 c21545 : c15803M38816.f51154.m24427(c15803M38816.f51153)) {
                String strM11356 = c21545.m11356();
                if (!strM11356.equals(".") && !strM11356.equals("..")) {
                    arrayList.add(new C12275(c21545));
                }
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۨ */
    public final void mo38151(final long j, final String str) {
        try {
            m38794(new InterfaceC20036() { // from class: l.᩻ᩴ֨
                @Override // l.InterfaceC20036
                public final Object call() throws IOException {
                    C16508.m38820(this.f77144, str, j);
                    return null;
                }
            });
        } finally {
            m38814();
        }
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ */
    public final void mo38149(String str, String str2) {
        String[] strArrM38822 = m38822(str);
        String[] strArrM38823 = m38822(str2);
        try {
            if (!strArrM38822[0].equals(strArrM38823[0])) {
                throw new IOException("Cannot rename between different shares");
            }
            if (!strArrM38822[1].equals(strArrM38823[1])) {
                try {
                    m38800(strArrM38822[0], strArrM38822[1], strArrM38823[1]);
                } catch (C10360 e) {
                    throw new IOException(e.getMessage(), e);
                } catch (C13865 e2) {
                    if (!m38807((Exception) e2)) {
                        throw m38789(e2);
                    }
                    IOException iOExceptionM38789 = m38789(e2);
                    try {
                        try {
                            m38817();
                            m38805(this, strArrM38822, strArrM38823);
                        } catch (C10360 e3) {
                            throw m38787(iOExceptionM38789, new IOException(e3.getMessage(), e3));
                        }
                    } catch (IOException e4) {
                        throw m38787(iOExceptionM38789, e4);
                    } catch (C13865 e5) {
                        throw m38787(iOExceptionM38789, m38789(e5));
                    }
                }
                m38814();
                return;
            }
            m38814();
        } catch (Throwable th) {
            m38814();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38805(C16508 c16508, String[] strArr, String[] strArr2) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr2[1];
        C9570 c9570 = (C9570) c16508.f53030.f36941.m46891(str);
        if (c9570.m24432(str2) || c9570.m24435(str2) || !(c9570.m24432(str3) || c9570.m24435(str3))) {
            c16508.m38800(strArr[0], strArr[1], strArr2[1]);
        }
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۨ */
    public final void mo38152(String str) {
        try {
            try {
                m38784(str);
            } catch (C10360 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C13865 e2) {
                if (!m38807((Exception) e2)) {
                    throw m38789(e2);
                }
                IOException iOExceptionM38789 = m38789(e2);
                try {
                    try {
                        m38817();
                        m38819(this, str);
                    } catch (IOException e3) {
                        throw m38787(iOExceptionM38789, e3);
                    }
                } catch (C10360 e4) {
                    throw m38787(iOExceptionM38789, new IOException(e4.getMessage(), e4));
                } catch (C13865 e5) {
                    throw m38787(iOExceptionM38789, m38789(e5));
                }
            }
            m38814();
        } catch (Throwable th) {
            m38814();
            throw th;
        }
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC10033 mo38154(final String str) throws IOException {
        try {
            return new C19330(new C22152(this, (C3218) m38794(new InterfaceC20036() { // from class: l.ۧᩴ֨
                @Override // l.InterfaceC20036
                public final Object call() {
                    return this.f37852.m38808(str);
                }
            })), new C4512(this), new C12584(this, str), new C9762(this));
        } catch (IOException e) {
            try {
                m38814();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ܰ */
    public final InputStream mo38153(long j, String str) {
        return m38791(str, j, -1L, new C20345(), false);
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo38145(String str, long j, long j2) {
        final long j3 = C17492.FOREVER_NS;
        if (j2 >= 0 && C17492.FOREVER_NS - j >= j2) {
            j3 = j + j2;
        }
        return m38791(str, j, j2, new LongSupplier() { // from class: l.ܿᩴ֨
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return j3;
            }
        }, true);
    }

    @Override // l.InterfaceC11362
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo28468(String str, long j, long j2, C6422 c6422) {
        return m38791(str, j, j2, c6422, true);
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo38146(long j, final String str) throws IOException {
        try {
            C3806 c3806 = new C3806((C3218) m38794(new InterfaceC20036() { // from class: l.ܳᩴ֨
                @Override // l.InterfaceC20036
                public final Object call() {
                    return this.f48019.m38811(str, true);
                }
            }));
            int iM9638 = c3806.f14138.m9638();
            return new C12980(iM9638, m38786(iM9638, this.f53030.f36944.m4282()), new C5218(this, c3806, str, iM9638), new C1999(this, c3806), new C9762(this), new C3410(this), new C0219());
        } catch (IOException e) {
            try {
                m38814();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38804(C16508 c16508, C3806 c3806) throws IOException {
        IOException iOExceptionM38788 = c16508.m38788(c3806.f14138, (IOException) null);
        if (iOExceptionM38788 != null) {
            throw iOExceptionM38788;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private IOException m38789(C13865 c13865) {
        m38799();
        return new IOException(c13865.getMessage(), c13865);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m38794(InterfaceC20036 interfaceC20036) throws IOException {
        try {
            return interfaceC20036.call();
        } catch (C10360 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C13865 e2) {
            if (!m38807((Exception) e2)) {
                throw m38789(e2);
            }
            IOException iOExceptionM38789 = m38789(e2);
            try {
                m38817();
                return interfaceC20036.call();
            } catch (IOException e3) {
                throw m38787(iOExceptionM38789, e3);
            } catch (C10360 e4) {
                throw m38787(iOExceptionM38789, new IOException(e4.getMessage(), e4));
            } catch (C13865 e5) {
                throw m38787(iOExceptionM38789, m38789(e5));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m38793(C16508 c16508, C13865 c13865, InterfaceC15097 interfaceC15097) throws IOException {
        if (!m38807((Exception) c13865)) {
            throw c16508.m38789(c13865);
        }
        IOException iOExceptionM38789 = c16508.m38789(c13865);
        try {
            c16508.m38817();
            return interfaceC15097.get();
        } catch (IOException e) {
            throw m38787(iOExceptionM38789, e);
        } catch (C10360 e2) {
            throw m38787(iOExceptionM38789, new IOException(e2.getMessage(), e2));
        } catch (C13865 e3) {
            throw m38787(iOExceptionM38789, c16508.m38789(e3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m38792(C16508 c16508, IOException iOException, C8747 c8747) throws IOException {
        if (!m38807((Exception) iOException)) {
            c16508.m38799();
            throw iOException;
        }
        c16508.m38799();
        try {
            c16508.m38817();
            return c8747.get();
        } catch (IOException e) {
            c16508.m38799();
            throw m38787(iOException, e);
        } catch (C10360 e2) {
            throw m38787(iOException, new IOException(e2.getMessage(), e2));
        } catch (C13865 e3) {
            throw m38787(iOException, c16508.m38789(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException m38788(C3218 c3218, IOException iOException) {
        if (c3218 == null) {
            return iOException;
        }
        try {
            c3218.close();
            return iOException;
        } catch (C10360 e) {
            return m38787(iOException, new IOException(e.getMessage(), e));
        } catch (C13865 e2) {
            return m38787(iOException, m38789(e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m38787(IOException iOException, IOException iOException2) {
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
    private InputStream m38791(final String str, long j, long j2, LongSupplier longSupplier, boolean z) throws IOException {
        try {
            C20741 c20741M38796 = m38796((C3218) m38794(new InterfaceC20036() { // from class: l.ܽᩴ֨
                @Override // l.InterfaceC20036
                public final Object call() {
                    return this.f53824.m38808(str);
                }
            }), j, j2, z);
            if (z) {
                return new C10158(c20741M38796, j, longSupplier, new C4512(this), new InterfaceC6629() { // from class: l.ܰ۠֨
                    @Override // l.InterfaceC6629
                    /* JADX INFO: renamed from: ۙ */
                    public final Object mo17974(IOException iOException, C8747 c8747) {
                        return C16508.m38792(this.f45150, iOException, c8747);
                    }
                }, new InterfaceC21446() { // from class: l.ۨ۠֨
                    @Override // l.InterfaceC21446
                    /* JADX INFO: renamed from: ۙ */
                    public final Object mo7268(long j3, long j4) {
                        return C16508.m38798(this.f38910, str, j3, j4);
                    }
                }, new C9762(this), new C3410(this), true);
            }
            return new C10158(c20741M38796, j, new C20345(), new C4512(this), new InterfaceC6629() { // from class: l.ܰ۠֨
                @Override // l.InterfaceC6629
                /* JADX INFO: renamed from: ۙ */
                public final Object mo17974(IOException iOException, C8747 c8747) {
                    return C16508.m38792(this.f45150, iOException, c8747);
                }
            }, new InterfaceC21446() { // from class: l.ۖ۠֨
                @Override // l.InterfaceC21446
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Object mo7268(long j3, long j4) {
                    return C16508.m38797(this.f9614, str, j3);
                }
            }, new C9762(this), new C9762(this), false);
        } catch (IOException e) {
            try {
                m38814();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20741 m38797(C16508 c16508, String str, long j) throws IOException {
        try {
            return c16508.m38796(c16508.m38808(str), j, -1L, false);
        } catch (C10360 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20741 m38798(C16508 c16508, String str, long j, long j2) throws IOException {
        try {
            return c16508.m38796(c16508.m38808(str), j, j2, true);
        } catch (C10360 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20741 m38796(C3218 c3218, long j, long j2, boolean z) {
        InputStream inputStreamM9639;
        int iM9643 = c3218.m9643();
        int iMax = (!z || iM9643 <= 0) ? 1 : Math.max(1, Math.min(4, 1048576 / iM9643));
        if (z) {
            inputStreamM9639 = c3218.m9642(j, iMax, j2);
        } else {
            inputStreamM9639 = c3218.m9639(j);
        }
        return new C20741(inputStreamM9639, new C6233(this, c3218, inputStreamM9639));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C22152 m38821(C16508 c16508, String str) throws IOException {
        try {
            return new C22152(c16508, c16508.m38808(str));
        } catch (C10360 e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38803(C16508 c16508, C3218 c3218, InputStream inputStream) throws IOException {
        try {
            inputStream.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        IOException iOExceptionM38788 = c16508.m38788(c3218, e);
        if (iOExceptionM38788 != null) {
            throw iOExceptionM38788;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38786(int i, int i2) {
        int iMax = i <= 0 ? 1 : Math.max(1, Math.min(4, 4194304 / i));
        if (i <= 0 || i2 <= 0) {
            return 1;
        }
        return Math.min(iMax, Math.max(1, i2 / (((i - 1) / 65536) + 1)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38807(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof EOFException) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m38784(String str) throws IOException {
        C15803 c15803M38816 = m38816(str, false);
        c15803M38816.f51154.m24429(c15803M38816.f51153, EnumSet.of(EnumC14346.FILE_LIST_DIRECTORY, EnumC14346.FILE_ADD_SUBDIRECTORY), EnumSet.of(EnumC4611.FILE_ATTRIBUTE_DIRECTORY), EnumC13182.f43879, EnumC7808.FILE_CREATE, EnumSet.of(EnumC21213.FILE_DIRECTORY_FILE)).close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38802(C16508 c16508, String str, boolean z) throws IOException {
        C15803 c15803M38816 = c16508.m38816(str, false);
        C9570 c9570 = c15803M38816.f51154;
        String str2 = c15803M38816.f51153;
        if (z ? c9570.m24435(str2) : c9570.m24432(str2)) {
            C15803 c15803M38817 = c16508.m38816(str, false);
            if (z) {
                c15803M38817.f51154.m24431(c15803M38817.f51153, true);
            } else {
                c15803M38817.f51154.m24433(c15803M38817.f51153);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3218 m38808(String str) throws IOException {
        C15803 c15803M38816 = m38816(str, false);
        return c15803M38816.f51154.m24434(c15803M38816.f51153, EnumSet.of(EnumC14346.GENERIC_READ), EnumSet.of(EnumC4611.FILE_ATTRIBUTE_NORMAL), f53027, EnumC7808.FILE_OPEN, EnumSet.noneOf(EnumC21213.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3218 m38811(String str, boolean z) throws IOException {
        C15803 c15803M38816 = m38816(str, false);
        return c15803M38816.f51154.m24434(c15803M38816.f51153, EnumSet.of(EnumC14346.GENERIC_WRITE), EnumSet.of(EnumC4611.FILE_ATTRIBUTE_NORMAL), EnumSet.of(EnumC13182.FILE_SHARE_WRITE), z ? EnumC7808.FILE_OVERWRITE_IF : EnumC7808.FILE_OPEN, EnumSet.noneOf(EnumC21213.class));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38819(C16508 c16508, String str) throws IOException {
        C15803 c15803M38816 = c16508.m38816(str, false);
        if (c15803M38816.f51154.m24435(c15803M38816.f51153)) {
            return;
        }
        c16508.m38784(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38820(C16508 c16508, String str, long j) throws IOException {
        C15803 c15803M38816 = c16508.m38816(str, false);
        C1644 c1644 = new C1644((TimeUnit.NANOSECONDS.convert(j, TimeUnit.MILLISECONDS) / 100) + 116444736000000000L);
        C9570 c9570 = c15803M38816.f51154;
        String str2 = c15803M38816.f51153;
        C1644 c1645 = C22251.f72736;
        C22251 c22251 = new C22251(c1645, c1645, c1644, c1644, 0L);
        AbstractC12392 abstractC12392M24428 = c9570.m24428(str2, (Set) EnumSet.of(EnumC14346.FILE_WRITE_ATTRIBUTES, EnumC14346.FILE_WRITE_EA), (EnumSet) null, EnumC13182.f43879, EnumC7808.FILE_OPEN, (EnumSet) null);
        try {
            abstractC12392M24428.m30830(c22251);
            abstractC12392M24428.close();
        } catch (Throwable th) {
            try {
                abstractC12392M24428.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC21777
    /* JADX INFO: renamed from: ۙ */
    public final void mo38150(String str, boolean z) {
        try {
            try {
                try {
                    C15803 c15803M38816 = m38816(str, false);
                    if (z) {
                        c15803M38816.f51154.m24431(c15803M38816.f51153, true);
                    } else {
                        c15803M38816.f51154.m24433(c15803M38816.f51153);
                    }
                } catch (C10360 e) {
                    throw new IOException(e.getMessage(), e);
                }
            } catch (C13865 e2) {
                if (!m38807((Exception) e2)) {
                    throw m38789(e2);
                }
                IOException iOExceptionM38789 = m38789(e2);
                try {
                    try {
                        try {
                            m38817();
                            m38802(this, str, z);
                        } catch (C10360 e3) {
                            throw m38787(iOExceptionM38789, new IOException(e3.getMessage(), e3));
                        }
                    } catch (IOException e4) {
                        throw m38787(iOExceptionM38789, e4);
                    }
                } catch (C13865 e5) {
                    throw m38787(iOExceptionM38789, m38789(e5));
                }
            }
            m38814();
        } catch (Throwable th) {
            m38814();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C15803 m38816(String str, boolean z) throws IOException {
        String[] strArrM38822 = m38822(str);
        if (!z && strArrM38822[1].isEmpty()) {
            throw new IOException("Operation not supported!");
        }
        return new C15803((C9570) this.f53030.f36941.m46891(strArrM38822[0]), strArrM38822[1]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38800(String str, String str2, String str3) {
        AbstractC12392 abstractC12392M24428 = ((C9570) this.f53030.f36941.m46891(str)).m24428(str2, (Set) EnumSet.of(EnumC14346.DELETE, EnumC14346.GENERIC_WRITE, EnumC14346.GENERIC_READ), (EnumSet) null, (Set) EnumSet.of(EnumC13182.FILE_SHARE_DELETE, EnumC13182.FILE_SHARE_READ, EnumC13182.FILE_SHARE_WRITE), EnumC7808.FILE_OPEN, (EnumSet) null);
        try {
            abstractC12392M24428.m30830(new C7102(str3));
            abstractC12392M24428.close();
        } catch (Throwable th) {
            try {
                abstractC12392M24428.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String[] m38822(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf == -1 ? new String[]{str, ""} : new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + 1).replace('/', '\\')};
    }
}
