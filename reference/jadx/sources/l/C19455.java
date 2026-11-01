package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩵۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19455 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C8996 f62635;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18749 f62636;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C16072 f62637;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f62638;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f62639;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f62640;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C18873 f62641;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f62642 = new ReentrantLock();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9017 f62643;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4076 f62644;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile C14165 f62645;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C1254 f62646;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21010 f62647;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f62648;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f62649;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Throwable f62650;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f62651;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18167 f62652;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19455 m44509(C1254 c1254, InterfaceC4076 interfaceC4076, Charset charset) {
        C16072 c16072M4547 = c1254.m4547();
        try {
            long jM26340 = c16072M4547.f51982.m26340() / 32;
            int i = 32768;
            while (i > 1024 && i > jM26340) {
                i /= 2;
            }
            C13638.requireNonNull(interfaceC4076);
            C13250 c13250Identity = interfaceC4076.identity();
            C13638.requireNonNull(charset);
            return new C19455(c1254, interfaceC4076, new C8996(EnumC19579.LOADING, EnumC8290.NONE, c13250Identity, charset.name(), i, 0L, 0L, new byte[32], 0, false));
        } finally {
            c16072M4547.m38088();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19455 m44508(C1254 c1254, InterfaceC4076 interfaceC4076) {
        return new C19455(c1254, interfaceC4076, null);
    }

    public C19455(C1254 c1254, InterfaceC4076 interfaceC4076, C8996 c8996) {
        C13638.requireNonNull(c1254);
        this.f62646 = c1254;
        C13638.requireNonNull(interfaceC4076);
        this.f62644 = interfaceC4076;
        this.f62649 = Integer.MAX_VALUE;
        this.f62639 = c8996 == null;
        this.f62637 = c1254.m4547();
        try {
            c1254.m4538(this, c8996);
        } catch (Error | RuntimeException e) {
            this.f62637.m38088();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C8996 m44523() {
        return this.f62635;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Throwable m44518() {
        return this.f62650;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m44524() {
        return this.f62651;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18749 m44517() {
        return m44519(this.f62635.m23297());
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0149 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩳܿۖ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۠۫ۖ -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #15 {UncheckedIOException -> 0x01c7, ۠۫ۖ -> 0x01e6, IOException -> 0x01c9, Error -> 0x019f, ᩳܿۖ -> 0x01aa, RuntimeException -> 0x01a1, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0173 A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #16 {all -> 0x017c, blocks: (B:105:0x0169, B:107:0x016d, B:109:0x0173), top: B:204:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #18 {all -> 0x01df, blocks: (B:147:0x01d1, B:149:0x01d5, B:151:0x01db), top: B:207:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00ff A[EDGE_INSN: B:209:0x00ff->B:81:0x00ff BREAK  A[LOOP:0: B:53:0x00b5->B:213:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[LOOP:0: B:53:0x00b5->B:213:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩳܿۖ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۠۫ۖ -> 0x01e6, TRY_LEAVE, TryCatch #15 {UncheckedIOException -> 0x01c7, ۠۫ۖ -> 0x01e6, IOException -> 0x01c9, Error -> 0x019f, ᩳܿۖ -> 0x01aa, RuntimeException -> 0x01a1, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #5 {all -> 0x00ca, blocks: (B:56:0x00bb, B:58:0x00bf, B:60:0x00c5), top: B:194:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩳܿۖ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۠۫ۖ -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #15 {UncheckedIOException -> 0x01c7, ۠۫ۖ -> 0x01e6, IOException -> 0x01c9, Error -> 0x019f, ᩳܿۖ -> 0x01aa, RuntimeException -> 0x01a1, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #4 {all -> 0x00e8, blocks: (B:67:0x00d9, B:69:0x00dd, B:71:0x00e3), top: B:192:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩳܿۖ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۠۫ۖ -> 0x01e6, TRY_ENTER, TryCatch #15 {UncheckedIOException -> 0x01c7, ۠۫ۖ -> 0x01e6, IOException -> 0x01c9, Error -> 0x019f, ᩳܿۖ -> 0x01aa, RuntimeException -> 0x01a1, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #11 {all -> 0x0115, blocks: (B:83:0x0106, B:85:0x010a, B:87:0x0110), top: B:196:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x011c A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩳܿۖ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۠۫ۖ -> 0x01e6, TRY_ENTER, TryCatch #15 {UncheckedIOException -> 0x01c7, ۠۫ۖ -> 0x01e6, IOException -> 0x01c9, Error -> 0x019f, ᩳܿۖ -> 0x01aa, RuntimeException -> 0x01a1, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x012d A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩳܿۖ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۠۫ۖ -> 0x01e6, TRY_LEAVE, TryCatch #15 {UncheckedIOException -> 0x01c7, ۠۫ۖ -> 0x01e6, IOException -> 0x01c9, Error -> 0x019f, ᩳܿۖ -> 0x01aa, RuntimeException -> 0x01a1, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x013e A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #3 {all -> 0x0142, blocks: (B:95:0x0134, B:97:0x0138, B:99:0x013e), top: B:190:0x0134 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18749 m44519(int i) {
        int iM23297;
        int iMin;
        byte[] bArrM23303;
        int i2;
        boolean z;
        byte[] bArr;
        int i3;
        boolean z2;
        int iM44506;
        if (i < 1 || i > 65536) {
            throw new IllegalArgumentException("Invalid preferred load batch size");
        }
        this.f62646.m4537(this);
        ReentrantLock reentrantLock = this.f62642;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (this.f62636 != null) {
            this.f62642.unlock();
            throw new IllegalStateException("Previous text batch is not published");
        }
        try {
            try {
                if (this.f62638 || this.f62651 || !m44515()) {
                    try {
                        if (this.f62651 || !m44515()) {
                            m44514();
                        }
                    } finally {
                        this.f62642.unlock();
                    }
                } else if (this.f62640) {
                    iM23297 = this.f62635.m23297();
                    m44513(Math.max(iM23297, (((int) Math.min(i, this.f62637.f51982.m26340() / 16)) / iM23297) * iM23297));
                    iMin = Math.min(this.f62648.length, Math.max(iM23297, (i / iM23297) * iM23297));
                    bArrM23303 = this.f62635.m23303();
                    i2 = 0;
                    z = false;
                    while (i2 < iMin) {
                        if (!this.f62651) {
                            iM44506 = m44506(i2, iM23297);
                            if (!this.f62651) {
                                if (iM44506 < iM23297) {
                                    z = true;
                                }
                                if (iM44506 > 0) {
                                    bArrM23303 = this.f62641.m43526(bArrM23303, i2, iM44506, this.f62648);
                                    i2 += iM44506;
                                }
                                if (z) {
                                    break;
                                    break;
                                }
                            } else if (this.f62651) {
                                m44514();
                            } else {
                                m44514();
                            }
                        } else if (this.f62651) {
                            m44514();
                        } else {
                            m44514();
                        }
                    }
                    bArr = bArrM23303;
                    i3 = i2;
                    z2 = z;
                    if (this.f62651) {
                        if (this.f62651) {
                            m44514();
                        } else {
                            m44514();
                        }
                    } else {
                        if (this.f62635.m23296() > C17492.FOREVER_NS - ((long) i3)) {
                            C18749 c18749 = new C18749(this, i3, this.f62635.m23298(i3, this.f62645.m34244(), bArr, this.f62652.m42290(), this.f62652.m42291(), z2));
                            this.f62636 = c18749;
                            if (this.f62651) {
                                m44514();
                            } else {
                                m44514();
                            }
                            return c18749;
                        }
                        m44510(EnumC19579.LIMIT_EXCEEDED, EnumC8290.COORDINATE_LIMIT, (Throwable) null);
                        if (this.f62651) {
                            m44514();
                        } else {
                            m44514();
                        }
                    }
                } else {
                    m44516();
                    if (this.f62651 || !m44515()) {
                        try {
                            if (this.f62651 || !m44515()) {
                                m44514();
                            }
                        } finally {
                            this.f62642.unlock();
                        }
                    } else {
                        m44511();
                        if (this.f62651 || !m44515()) {
                            try {
                                if (this.f62651 || !m44515()) {
                                    m44514();
                                }
                            } finally {
                                this.f62642.unlock();
                            }
                        } else {
                            this.f62640 = true;
                            iM23297 = this.f62635.m23297();
                            m44513(Math.max(iM23297, (((int) Math.min(i, this.f62637.f51982.m26340() / 16)) / iM23297) * iM23297));
                            iMin = Math.min(this.f62648.length, Math.max(iM23297, (i / iM23297) * iM23297));
                            bArrM23303 = this.f62635.m23303();
                            i2 = 0;
                            z = false;
                            while (i2 < iMin) {
                                if (!this.f62651) {
                                    try {
                                        if (this.f62651 || !m44515()) {
                                            m44514();
                                        }
                                    } finally {
                                        this.f62642.unlock();
                                    }
                                } else {
                                    iM44506 = m44506(i2, iM23297);
                                    if (!this.f62651) {
                                        try {
                                            if (this.f62651 || !m44515()) {
                                                m44514();
                                            }
                                        } finally {
                                            this.f62642.unlock();
                                        }
                                    } else {
                                        if (iM44506 < iM23297) {
                                            z = true;
                                        }
                                        if (iM44506 > 0) {
                                            bArrM23303 = this.f62641.m43526(bArrM23303, i2, iM44506, this.f62648);
                                            i2 += iM44506;
                                        }
                                        if (z) {
                                            break;
                                        }
                                    }
                                }
                            }
                            bArr = bArrM23303;
                            i3 = i2;
                            z2 = z;
                            if (this.f62651) {
                                try {
                                    if (this.f62651 || !m44515()) {
                                        m44514();
                                    }
                                } finally {
                                    this.f62642.unlock();
                                }
                            } else {
                                if (this.f62635.m23296() > C17492.FOREVER_NS - ((long) i3)) {
                                    C18749 c187410 = new C18749(this, i3, this.f62635.m23298(i3, this.f62645.m34244(), bArr, this.f62652.m42290(), this.f62652.m42291(), z2));
                                    this.f62636 = c187410;
                                    try {
                                        if (this.f62651 || !m44515()) {
                                            m44514();
                                        }
                                        return c187410;
                                    } finally {
                                        this.f62642.unlock();
                                    }
                                }
                                m44510(EnumC19579.LIMIT_EXCEEDED, EnumC8290.COORDINATE_LIMIT, (Throwable) null);
                                try {
                                    if (this.f62651 || !m44515()) {
                                        m44514();
                                    }
                                } finally {
                                    this.f62642.unlock();
                                }
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                try {
                    if (this.f62651 || !m44515()) {
                        m44514();
                    }
                    throw th;
                } finally {
                    this.f62642.unlock();
                }
            }
        } catch (UncheckedIOException e) {
            e = e;
            m44510(EnumC19579.FAILED, EnumC8290.IO, e);
            try {
                if (this.f62651 || !m44515()) {
                    m44514();
                }
                return null;
            } finally {
                this.f62642.unlock();
            }
        } catch (C8166 e2) {
            m44510(EnumC19579.FAILED, e2.f28514, e2);
            try {
                if (this.f62651 || !m44515()) {
                    m44514();
                }
                return null;
            } finally {
                this.f62642.unlock();
            }
        } catch (IOException e3) {
            e = e3;
            m44510(EnumC19579.FAILED, EnumC8290.IO, e);
            if (this.f62651) {
                m44514();
            } else {
                m44514();
            }
            return null;
        } catch (Error e4) {
            e = e4;
            m44510(EnumC19579.FAILED, EnumC8290.IO, e);
            throw e;
        } catch (C18188 e5) {
            m44510(EnumC19579.LIMIT_EXCEEDED, EnumC8290.CACHE_LIMIT, e5);
            try {
                if (this.f62651 || !m44515()) {
                    m44514();
                }
                return null;
            } finally {
                this.f62642.unlock();
            }
        } catch (RuntimeException e6) {
            e = e6;
            m44510(EnumC19579.FAILED, EnumC8290.IO, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8996 m44507(C19455 c19455, C18749 c18749, InterfaceC10407 interfaceC10407) {
        if (interfaceC10407 != null) {
            interfaceC10407.mo26307(c19455.f62646);
        }
        c19455.f62646.m4537(c19455);
        ReentrantLock reentrantLock = c19455.f62642;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (c19455.f62636 != c18749 || c18749.f60801 != c19455) {
            c19455.f62642.unlock();
            throw new IllegalStateException("Text batch is not pending");
        }
        try {
            try {
                try {
                    if (!c19455.f62638 && !c19455.f62651 && c19455.m44515()) {
                        if (!(interfaceC10407 == null ? c19455.f62646.m4544(c19455, c19455.f62648, c18749.f60800, c18749.f60799, c19455.f62649) : interfaceC10407.mo26309(c19455.f62646, c19455, c19455.f62648, c18749.f60800, c18749.f60799, c19455.f62649)) && !c19455.f62651 && c19455.m44515()) {
                            c19455.m44510(EnumC19579.LIMIT_EXCEEDED, EnumC8290.COORDINATE_LIMIT, (Throwable) null);
                        }
                        c18749.f60801 = null;
                        if (c19455.f62636 == c18749) {
                            c19455.f62636 = null;
                        }
                        try {
                            if (c19455.f62651 || !c19455.m44515()) {
                                c19455.m44514();
                            }
                            return c19455.f62635;
                        } finally {
                            c19455.f62642.unlock();
                        }
                    }
                    C8996 c8996 = c19455.f62635;
                    c18749.f60801 = null;
                    if (c19455.f62636 == c18749) {
                        c19455.f62636 = null;
                    }
                    try {
                        if (c19455.f62651 || !c19455.m44515()) {
                            c19455.m44514();
                        }
                        return c8996;
                    } finally {
                        c19455.f62642.unlock();
                    }
                } catch (Throwable th) {
                    c18749.f60801 = null;
                    if (c19455.f62636 == c18749) {
                        c19455.f62636 = null;
                    }
                    try {
                        if (c19455.f62651 || !c19455.m44515()) {
                            c19455.m44514();
                        }
                        throw th;
                    } finally {
                        c19455.f62642.unlock();
                    }
                }
            } catch (C18188 e) {
                c19455.m44510(EnumC19579.LIMIT_EXCEEDED, EnumC8290.CACHE_LIMIT, e);
                c18749.f60801 = null;
                if (c19455.f62636 == c18749) {
                    c19455.f62636 = null;
                }
                try {
                    if (c19455.f62651 || !c19455.m44515()) {
                        c19455.m44514();
                    }
                } finally {
                    c19455.f62642.unlock();
                }
            } catch (RuntimeException e2) {
                e = e2;
                c19455.m44510(EnumC19579.FAILED, EnumC8290.IO, e);
                throw e;
            }
        } catch (UncheckedIOException e3) {
            c19455.m44510(EnumC19579.FAILED, EnumC8290.IO, e3);
            c18749.f60801 = null;
            if (c19455.f62636 == c18749) {
                c19455.f62636 = null;
            }
            try {
                if (c19455.f62651 || !c19455.m44515()) {
                    c19455.m44514();
                }
            } finally {
                c19455.f62642.unlock();
            }
        } catch (Error e4) {
            e = e4;
            c19455.m44510(EnumC19579.FAILED, EnumC8290.IO, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m44515() {
        return this.f62635.m23305() == EnumC19579.LOADING;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m44516() throws C8166 {
        if (this.f62639 && !this.f62635.m23307().m32726()) {
            throw new C8166(EnumC8290.SOURCE_UNAVAILABLE, "Text source cannot be reopened");
        }
        this.f62643 = this.f62637.f51982.m26333(m44512(this.f62635.m23297()));
        this.f62648 = new char[this.f62635.m23297()];
        this.f62641 = new C18873(this.f62635.m23297());
        if (this.f62651) {
            return;
        }
        this.f62645 = C14165.m34239(this.f62644.mo6416(), Charset.forName(this.f62635.m23302()), this.f62637.f51982);
        if (this.f62651) {
            return;
        }
        this.f62652 = new C18167(this.f62645);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m44513(int i) {
        if (i <= this.f62648.length) {
            return;
        }
        try {
            C9017 c9017M26333 = this.f62637.f51982.m26333(m44512(i));
            try {
                this.f62643.close();
                this.f62643 = c9017M26333;
                this.f62648 = new char[i];
            } catch (Error | RuntimeException e) {
                c9017M26333.close();
                throw e;
            }
        } catch (C18188 unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private long m44512(int i) {
        return ((long) ((((this.f62635.m23297() * 2) + 59) & (-8)) + 256)) + 512 + (((((long) i) * 2) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m44506(int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2 && !this.f62651) {
            int iMin = Math.min(1024, i2 - i3);
            int i4 = this.f62652.read(this.f62648, i + i3, iMin);
            if (i4 > 0) {
                i3 += i4;
            }
            if (i4 < iMin) {
                break;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m44511() throws IOException {
        byte[] bArrM43526 = new byte[32];
        long jM23296 = this.f62635.m23296();
        long length = 0;
        while (length < jM23296) {
            if (this.f62651) {
                return;
            }
            int iM44506 = m44506(0, this.f62648.length);
            if (this.f62651) {
                return;
            }
            char[] cArr = this.f62648;
            if (iM44506 == cArr.length) {
                bArrM43526 = this.f62641.m43526(bArrM43526, 0, iM44506, cArr);
                length += (long) this.f62648.length;
            } else {
                throw new C8166(EnumC8290.PREFIX_MISMATCH, "Text source prefix is truncated");
            }
        }
        if (!Arrays.equals(bArrM43526, this.f62635.m23303()) || this.f62652.m42290() != this.f62635.m23306() || this.f62652.m42291() != this.f62635.m23294()) {
            throw new C8166(EnumC8290.PREFIX_MISMATCH, "Text source prefix does not match checkpoint");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44510(EnumC19579 enumC19579, EnumC8290 enumC8290, Throwable th) {
        if (th != null) {
            this.f62650 = th;
        }
        C1254 c1254 = this.f62646;
        if (this.f62651) {
            enumC19579 = EnumC19579.CANCELED;
        }
        if (this.f62651) {
            enumC8290 = EnumC8290.NONE;
        }
        c1254.m4539(this, enumC19579, enumC8290);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44520() {
        if (this.f62647 == null) {
            this.f62647 = this.f62637.m38094();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44521(boolean z) {
        C21010 c21010 = this.f62647;
        if (c21010 == null) {
            return;
        }
        if (!z) {
            c21010.flush();
            return;
        }
        this.f62647 = null;
        if (c21010 != null) {
            c21010.close();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44522() {
        this.f62646.m4539(this, EnumC19579.CANCELED, EnumC8290.NONE);
        this.f62651 = true;
        C14165 c14165 = this.f62645;
        if (c14165 != null) {
            try {
                c14165.m34245();
            } catch (IOException e) {
                this.f62650 = e;
            }
        }
        if (this.f62642.isHeldByCurrentThread() || !this.f62642.tryLock()) {
            return;
        }
        try {
            m44514();
        } finally {
            this.f62642.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m44514() {
        if (this.f62638) {
            return;
        }
        this.f62638 = true;
        C18749 c18749 = this.f62636;
        if (c18749 != null) {
            c18749.f60801 = null;
            this.f62636 = null;
        }
        try {
            try {
                C14165 c14165 = this.f62645;
                this.f62645 = null;
                if (c14165 != null) {
                    c14165.close();
                }
                this.f62652 = null;
                this.f62648 = null;
                this.f62641 = null;
                try {
                    try {
                        C21010 c21010 = this.f62647;
                        this.f62647 = null;
                        if (c21010 != null) {
                            c21010.close();
                        }
                        try {
                            C9017 c9017 = this.f62643;
                            if (c9017 != null) {
                                c9017.close();
                            }
                        } finally {
                            this.f62643 = null;
                            this.f62637.m38088();
                        }
                    } catch (IOException e) {
                        if (this.f62650 == null) {
                            this.f62650 = e;
                        } else if (this.f62650 != e) {
                            this.f62650.addSuppressed(e);
                        }
                        try {
                            C9017 c9018 = this.f62643;
                            if (c9018 != null) {
                                c9018.close();
                            }
                        } finally {
                            this.f62643 = null;
                            this.f62637.m38088();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        C9017 c9019 = this.f62643;
                        if (c9019 != null) {
                            c9019.close();
                        }
                        throw th;
                    } finally {
                        this.f62643 = null;
                        this.f62637.m38088();
                    }
                }
            } catch (Throwable th2) {
                this.f62652 = null;
                this.f62648 = null;
                this.f62641 = null;
                try {
                    try {
                        C21010 c21011 = this.f62647;
                        this.f62647 = null;
                        if (c21011 != null) {
                            c21011.close();
                        }
                        try {
                            C9017 c90110 = this.f62643;
                            if (c90110 != null) {
                                c90110.close();
                            }
                            throw th2;
                        } finally {
                            this.f62643 = null;
                            this.f62637.m38088();
                        }
                    } catch (Throwable th3) {
                        try {
                            C9017 c90111 = this.f62643;
                            if (c90111 != null) {
                                c90111.close();
                            }
                            throw th3;
                        } finally {
                            this.f62643 = null;
                            this.f62637.m38088();
                        }
                    }
                } catch (IOException e2) {
                    if (this.f62650 == null) {
                        this.f62650 = e2;
                    } else if (this.f62650 != e2) {
                        this.f62650.addSuppressed(e2);
                    }
                    try {
                        C9017 c90112 = this.f62643;
                        if (c90112 != null) {
                            c90112.close();
                        }
                    } finally {
                        this.f62643 = null;
                        this.f62637.m38088();
                    }
                }
            }
        } catch (IOException e3) {
            this.f62650 = e3;
            this.f62652 = null;
            this.f62648 = null;
            this.f62641 = null;
            try {
                try {
                    C21010 c21012 = this.f62647;
                    this.f62647 = null;
                    if (c21012 != null) {
                        c21012.close();
                    }
                    try {
                        C9017 c90113 = this.f62643;
                        if (c90113 != null) {
                            c90113.close();
                        }
                    } finally {
                        this.f62643 = null;
                        this.f62637.m38088();
                    }
                } catch (IOException e4) {
                    if (this.f62650 == null) {
                        this.f62650 = e4;
                    } else if (this.f62650 != e4) {
                        this.f62650.addSuppressed(e4);
                    }
                    try {
                        C9017 c90114 = this.f62643;
                        if (c90114 != null) {
                            c90114.close();
                        }
                    } finally {
                        this.f62643 = null;
                        this.f62637.m38088();
                    }
                }
            } catch (Throwable th4) {
                try {
                    C9017 c90115 = this.f62643;
                    if (c90115 != null) {
                        c90115.close();
                    }
                    throw th4;
                } finally {
                    this.f62643 = null;
                    this.f62637.m38088();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m44522();
    }
}
