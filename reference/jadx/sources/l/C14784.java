package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14784 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f48378;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18251 f48379;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C18997 f48380;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f48381;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f48382 = new ReentrantLock();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile C21916 f48383;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C24482 f48384;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C6254 f48385;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C24154 f48386;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23473 f48387;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f48388;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f48389;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C21170 f48390;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile Throwable f48391;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f48392;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f48393;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C17505 f48394;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C10046 f48395;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14784 m35613(C17505 c17505, InterfaceC23473 interfaceC23473, Charset charset) {
        C10046 c10046M41082 = c17505.m41082();
        try {
            long jM2119 = c10046M41082.f32208.m2119() / 32;
            int i = 32768;
            while (i > 1024 && i > jM2119) {
                i /= 2;
            }
            C17359.requireNonNull(interfaceC23473);
            C16013 c16013Identity = interfaceC23473.identity();
            C17359.requireNonNull(charset);
            return new C14784(c17505, interfaceC23473, new C21170(EnumC14456.LOADING, EnumC4016.NONE, c16013Identity, charset.name(), i, 0L, 0L, new byte[32], 0, false));
        } finally {
            c10046M41082.m25975();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14784 m35612(C17505 c17505, InterfaceC23473 interfaceC23473) {
        return new C14784(c17505, interfaceC23473, null);
    }

    public C14784(C17505 c17505, InterfaceC23473 interfaceC23473, C21170 c21170) {
        C17359.requireNonNull(c17505);
        this.f48394 = c17505;
        C17359.requireNonNull(interfaceC23473);
        this.f48387 = interfaceC23473;
        this.f48378 = Integer.MAX_VALUE;
        this.f48381 = c21170 == null;
        this.f48395 = c17505.m41082();
        try {
            c17505.m41096(this, c21170);
        } catch (Error | RuntimeException e) {
            this.f48395.m25975();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21170 m35624() {
        return this.f48390;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Throwable m35625() {
        return this.f48391;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m35627() {
        return this.f48393;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C24482 m35626() {
        return m35621(this.f48390.m48291());
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0149 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩺ۢ᩸ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۘᩳ᩸ -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #17 {RuntimeException -> 0x01a1, ۘᩳ᩸ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0173 A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #16 {all -> 0x017c, blocks: (B:105:0x0169, B:107:0x016d, B:109:0x0173), top: B:204:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #18 {all -> 0x01df, blocks: (B:147:0x01d1, B:149:0x01d5, B:151:0x01db), top: B:207:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00ff A[EDGE_INSN: B:209:0x00ff->B:81:0x00ff BREAK  A[LOOP:0: B:53:0x00b5->B:213:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[LOOP:0: B:53:0x00b5->B:213:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩺ۢ᩸ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۘᩳ᩸ -> 0x01e6, TRY_LEAVE, TryCatch #17 {RuntimeException -> 0x01a1, ۘᩳ᩸ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #6 {all -> 0x00ca, blocks: (B:56:0x00bb, B:58:0x00bf, B:60:0x00c5), top: B:194:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩺ۢ᩸ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۘᩳ᩸ -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #17 {RuntimeException -> 0x01a1, ۘᩳ᩸ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #5 {all -> 0x00e8, blocks: (B:67:0x00d9, B:69:0x00dd, B:71:0x00e3), top: B:192:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩺ۢ᩸ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۘᩳ᩸ -> 0x01e6, TRY_ENTER, TryCatch #17 {RuntimeException -> 0x01a1, ۘᩳ᩸ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #10 {all -> 0x0115, blocks: (B:83:0x0106, B:85:0x010a, B:87:0x0110), top: B:196:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x011c A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩺ۢ᩸ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۘᩳ᩸ -> 0x01e6, TRY_ENTER, TryCatch #17 {RuntimeException -> 0x01a1, ۘᩳ᩸ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x012d A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ᩺ۢ᩸ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ۘᩳ᩸ -> 0x01e6, TRY_LEAVE, TryCatch #17 {RuntimeException -> 0x01a1, ۘᩳ᩸ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x013e A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #3 {all -> 0x0142, blocks: (B:95:0x0134, B:97:0x0138, B:99:0x013e), top: B:190:0x0134 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24482 m35621(int i) {
        int iM48291;
        int iMin;
        byte[] bArrM48294;
        int i2;
        boolean z;
        byte[] bArr;
        int i3;
        boolean z2;
        int iM35611;
        if (i < 1 || i > 65536) {
            throw new IllegalArgumentException("Invalid preferred load batch size");
        }
        this.f48394.m41094(this);
        ReentrantLock reentrantLock = this.f48382;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (this.f48384 != null) {
            this.f48382.unlock();
            throw new IllegalStateException("Previous text batch is not published");
        }
        try {
            try {
                try {
                    if (this.f48388 || this.f48393 || !m35620()) {
                        try {
                            if (this.f48393 || !m35620()) {
                                m35617();
                            }
                        } finally {
                            this.f48382.unlock();
                        }
                    } else if (this.f48392) {
                        iM48291 = this.f48390.m48291();
                        m35619(Math.max(iM48291, (((int) Math.min(i, this.f48395.f32208.m2119() / 16)) / iM48291) * iM48291));
                        iMin = Math.min(this.f48389.length, Math.max(iM48291, (i / iM48291) * iM48291));
                        bArrM48294 = this.f48390.m48294();
                        i2 = 0;
                        z = false;
                        while (i2 < iMin) {
                            if (!this.f48393) {
                                iM35611 = m35611(i2, iM48291);
                                if (!this.f48393) {
                                    if (iM35611 < iM48291) {
                                        z = true;
                                    }
                                    if (iM35611 > 0) {
                                        bArrM48294 = this.f48386.m54117(bArrM48294, i2, iM35611, this.f48389);
                                        i2 += iM35611;
                                    }
                                    if (z) {
                                        break;
                                        break;
                                    }
                                } else if (this.f48393) {
                                    m35617();
                                } else {
                                    m35617();
                                }
                            } else if (this.f48393) {
                                m35617();
                            } else {
                                m35617();
                            }
                        }
                        bArr = bArrM48294;
                        i3 = i2;
                        z2 = z;
                        if (this.f48393) {
                            if (this.f48393) {
                                m35617();
                            } else {
                                m35617();
                            }
                        } else {
                            if (this.f48390.m48290() > C25227.FOREVER_NS - ((long) i3)) {
                                C24482 c24482 = new C24482(this, i3, this.f48390.m48292(i3, this.f48383.m49610(), bArr, this.f48385.m17903(), this.f48385.m17904(), z2));
                                this.f48384 = c24482;
                                if (this.f48393) {
                                    m35617();
                                } else {
                                    m35617();
                                }
                                return c24482;
                            }
                            m35615(EnumC14456.LIMIT_EXCEEDED, EnumC4016.COORDINATE_LIMIT, (Throwable) null);
                            if (this.f48393) {
                                m35617();
                            } else {
                                m35617();
                            }
                        }
                    } else {
                        m35618();
                        if (this.f48393 || !m35620()) {
                            try {
                                if (this.f48393 || !m35620()) {
                                    m35617();
                                }
                            } finally {
                                this.f48382.unlock();
                            }
                        } else {
                            m35610();
                            if (this.f48393 || !m35620()) {
                                try {
                                    if (this.f48393 || !m35620()) {
                                        m35617();
                                    }
                                } finally {
                                    this.f48382.unlock();
                                }
                            } else {
                                this.f48392 = true;
                                iM48291 = this.f48390.m48291();
                                m35619(Math.max(iM48291, (((int) Math.min(i, this.f48395.f32208.m2119() / 16)) / iM48291) * iM48291));
                                iMin = Math.min(this.f48389.length, Math.max(iM48291, (i / iM48291) * iM48291));
                                bArrM48294 = this.f48390.m48294();
                                i2 = 0;
                                z = false;
                                while (i2 < iMin) {
                                    if (!this.f48393) {
                                        try {
                                            if (this.f48393 || !m35620()) {
                                                m35617();
                                            }
                                        } finally {
                                            this.f48382.unlock();
                                        }
                                    } else {
                                        iM35611 = m35611(i2, iM48291);
                                        if (!this.f48393) {
                                            try {
                                                if (this.f48393 || !m35620()) {
                                                    m35617();
                                                }
                                            } finally {
                                                this.f48382.unlock();
                                            }
                                        } else {
                                            if (iM35611 < iM48291) {
                                                z = true;
                                            }
                                            if (iM35611 > 0) {
                                                bArrM48294 = this.f48386.m54117(bArrM48294, i2, iM35611, this.f48389);
                                                i2 += iM35611;
                                            }
                                            if (z) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                bArr = bArrM48294;
                                i3 = i2;
                                z2 = z;
                                if (this.f48393) {
                                    try {
                                        if (this.f48393 || !m35620()) {
                                            m35617();
                                        }
                                    } finally {
                                        this.f48382.unlock();
                                    }
                                } else {
                                    if (this.f48390.m48290() > C25227.FOREVER_NS - ((long) i3)) {
                                        C24482 c24483 = new C24482(this, i3, this.f48390.m48292(i3, this.f48383.m49610(), bArr, this.f48385.m17903(), this.f48385.m17904(), z2));
                                        this.f48384 = c24483;
                                        try {
                                            if (this.f48393 || !m35620()) {
                                                m35617();
                                            }
                                            return c24483;
                                        } finally {
                                            this.f48382.unlock();
                                        }
                                    }
                                    m35615(EnumC14456.LIMIT_EXCEEDED, EnumC4016.COORDINATE_LIMIT, (Throwable) null);
                                    try {
                                        if (this.f48393 || !m35620()) {
                                            m35617();
                                        }
                                    } finally {
                                        this.f48382.unlock();
                                    }
                                }
                            }
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    try {
                        if (this.f48393 || !m35620()) {
                            m35617();
                        }
                        throw th;
                    } finally {
                        this.f48382.unlock();
                    }
                }
            } catch (RuntimeException e) {
                e = e;
                m35615(EnumC14456.FAILED, EnumC4016.IO, e);
                throw e;
            } catch (C4344 e2) {
                m35615(EnumC14456.FAILED, e2.f15713, e2);
                try {
                    if (this.f48393 || !m35620()) {
                        m35617();
                    }
                    return null;
                } finally {
                    this.f48382.unlock();
                }
            }
        } catch (IOException e3) {
            e = e3;
            m35615(EnumC14456.FAILED, EnumC4016.IO, e);
            try {
                if (this.f48393 || !m35620()) {
                    m35617();
                }
                return null;
            } finally {
                this.f48382.unlock();
            }
        } catch (UncheckedIOException e4) {
            e = e4;
            m35615(EnumC14456.FAILED, EnumC4016.IO, e);
            if (this.f48393) {
                m35617();
            } else {
                m35617();
            }
            return null;
        } catch (Error e5) {
            e = e5;
            m35615(EnumC14456.FAILED, EnumC4016.IO, e);
            throw e;
        } catch (C24219 e6) {
            m35615(EnumC14456.LIMIT_EXCEEDED, EnumC4016.CACHE_LIMIT, e6);
            try {
                if (this.f48393 || !m35620()) {
                    m35617();
                }
                return null;
            } finally {
                this.f48382.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21170 m35614(C14784 c14784, C24482 c24482, InterfaceC18186 interfaceC18186) {
        if (interfaceC18186 != null) {
            interfaceC18186.mo20309(c14784.f48394);
        }
        c14784.f48394.m41094(c14784);
        ReentrantLock reentrantLock = c14784.f48382;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (c14784.f48384 != c24482 || c24482.f79455 != c14784) {
            c14784.f48382.unlock();
            throw new IllegalStateException("Text batch is not pending");
        }
        try {
            try {
                try {
                    if (!c14784.f48388 && !c14784.f48393 && c14784.m35620()) {
                        if (!(interfaceC18186 == null ? c14784.f48394.m41100(c14784, c14784.f48389, c24482.f79453, c24482.f79454, c14784.f48378) : interfaceC18186.mo20310(c14784.f48394, c14784, c14784.f48389, c24482.f79453, c24482.f79454, c14784.f48378)) && !c14784.f48393 && c14784.m35620()) {
                            c14784.m35615(EnumC14456.LIMIT_EXCEEDED, EnumC4016.COORDINATE_LIMIT, (Throwable) null);
                        }
                        c24482.f79455 = null;
                        if (c14784.f48384 == c24482) {
                            c14784.f48384 = null;
                        }
                        try {
                            if (c14784.f48393 || !c14784.m35620()) {
                                c14784.m35617();
                            }
                            return c14784.f48390;
                        } finally {
                            c14784.f48382.unlock();
                        }
                    }
                    C21170 c21170 = c14784.f48390;
                    c24482.f79455 = null;
                    if (c14784.f48384 == c24482) {
                        c14784.f48384 = null;
                    }
                    try {
                        if (c14784.f48393 || !c14784.m35620()) {
                            c14784.m35617();
                        }
                        return c21170;
                    } finally {
                        c14784.f48382.unlock();
                    }
                } catch (Throwable th) {
                    c24482.f79455 = null;
                    if (c14784.f48384 == c24482) {
                        c14784.f48384 = null;
                    }
                    try {
                        if (c14784.f48393 || !c14784.m35620()) {
                            c14784.m35617();
                        }
                        throw th;
                    } finally {
                        c14784.f48382.unlock();
                    }
                }
            } catch (C24219 e) {
                c14784.m35615(EnumC14456.LIMIT_EXCEEDED, EnumC4016.CACHE_LIMIT, e);
                c24482.f79455 = null;
                if (c14784.f48384 == c24482) {
                    c14784.f48384 = null;
                }
                try {
                    if (c14784.f48393 || !c14784.m35620()) {
                        c14784.m35617();
                    }
                } finally {
                    c14784.f48382.unlock();
                }
            } catch (RuntimeException e2) {
                e = e2;
                c14784.m35615(EnumC14456.FAILED, EnumC4016.IO, e);
                throw e;
            }
        } catch (UncheckedIOException e3) {
            c14784.m35615(EnumC14456.FAILED, EnumC4016.IO, e3);
            c24482.f79455 = null;
            if (c14784.f48384 == c24482) {
                c14784.f48384 = null;
            }
            try {
                if (c14784.f48393 || !c14784.m35620()) {
                    c14784.m35617();
                }
            } finally {
                c14784.f48382.unlock();
            }
        } catch (Error e4) {
            e = e4;
            c14784.m35615(EnumC14456.FAILED, EnumC4016.IO, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m35620() {
        return this.f48390.m48299() == EnumC14456.LOADING;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35618() throws C4344 {
        if (this.f48381 && !this.f48390.m48303().m38143()) {
            throw new C4344(EnumC4016.SOURCE_UNAVAILABLE, "Text source cannot be reopened");
        }
        this.f48379 = this.f48395.f32208.m2112(m35616(this.f48390.m48291()));
        this.f48389 = new char[this.f48390.m48291()];
        this.f48386 = new C24154(this.f48390.m48291());
        if (this.f48393) {
            return;
        }
        this.f48383 = C21916.m49604(this.f48387.mo5931(), Charset.forName(this.f48390.m48295()), this.f48395.f32208);
        if (this.f48393) {
            return;
        }
        this.f48385 = new C6254(this.f48383);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m35619(int i) {
        if (i <= this.f48389.length) {
            return;
        }
        try {
            C18251 c18251M2112 = this.f48395.f32208.m2112(m35616(i));
            try {
                this.f48379.close();
                this.f48379 = c18251M2112;
                this.f48389 = new char[i];
            } catch (Error | RuntimeException e) {
                c18251M2112.close();
                throw e;
            }
        } catch (C24219 unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m35616(int i) {
        return ((long) ((((this.f48390.m48291() * 2) + 59) & (-8)) + 256)) + 512 + (((((long) i) * 2) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m35611(int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2 && !this.f48393) {
            int iMin = Math.min(1024, i2 - i3);
            int i4 = this.f48385.read(this.f48389, i + i3, iMin);
            if (i4 > 0) {
                i3 += i4;
            }
            if (i4 < iMin) {
                break;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m35610() throws IOException {
        byte[] bArrM54117 = new byte[32];
        long jM48290 = this.f48390.m48290();
        long length = 0;
        while (length < jM48290) {
            if (this.f48393) {
                return;
            }
            int iM35611 = m35611(0, this.f48389.length);
            if (this.f48393) {
                return;
            }
            char[] cArr = this.f48389;
            if (iM35611 == cArr.length) {
                bArrM54117 = this.f48386.m54117(bArrM54117, 0, iM35611, cArr);
                length += (long) this.f48389.length;
            } else {
                throw new C4344(EnumC4016.PREFIX_MISMATCH, "Text source prefix is truncated");
            }
        }
        if (!Arrays.equals(bArrM54117, this.f48390.m48294()) || this.f48385.m17903() != this.f48390.m48298() || this.f48385.m17904() != this.f48390.m48297()) {
            throw new C4344(EnumC4016.PREFIX_MISMATCH, "Text source prefix does not match checkpoint");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35615(EnumC14456 enumC14456, EnumC4016 enumC4016, Throwable th) {
        if (th != null) {
            this.f48391 = th;
        }
        C17505 c17505 = this.f48394;
        if (this.f48393) {
            enumC14456 = EnumC14456.CANCELED;
        }
        if (this.f48393) {
            enumC4016 = EnumC4016.NONE;
        }
        c17505.m41095(this, enumC14456, enumC4016);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35622() {
        if (this.f48380 == null) {
            this.f48380 = this.f48395.m25967();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35623(boolean z) {
        C18997 c18997 = this.f48380;
        if (c18997 == null) {
            return;
        }
        if (!z) {
            c18997.flush();
            return;
        }
        this.f48380 = null;
        if (c18997 != null) {
            c18997.close();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35628() {
        this.f48394.m41095(this, EnumC14456.CANCELED, EnumC4016.NONE);
        this.f48393 = true;
        C21916 c21916 = this.f48383;
        if (c21916 != null) {
            try {
                c21916.m49611();
            } catch (IOException e) {
                this.f48391 = e;
            }
        }
        if (this.f48382.isHeldByCurrentThread() || !this.f48382.tryLock()) {
            return;
        }
        try {
            m35617();
        } finally {
            this.f48382.unlock();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m35617() {
        if (this.f48388) {
            return;
        }
        this.f48388 = true;
        C24482 c24482 = this.f48384;
        if (c24482 != null) {
            c24482.f79455 = null;
            this.f48384 = null;
        }
        try {
            try {
                C21916 c21916 = this.f48383;
                this.f48383 = null;
                if (c21916 != null) {
                    c21916.close();
                }
                this.f48385 = null;
                this.f48389 = null;
                this.f48386 = null;
                try {
                    try {
                        C18997 c18997 = this.f48380;
                        this.f48380 = null;
                        if (c18997 != null) {
                            c18997.close();
                        }
                        try {
                            C18251 c18251 = this.f48379;
                            if (c18251 != null) {
                                c18251.close();
                            }
                        } finally {
                            this.f48379 = null;
                            this.f48395.m25975();
                        }
                    } catch (IOException e) {
                        if (this.f48391 == null) {
                            this.f48391 = e;
                        } else if (this.f48391 != e) {
                            this.f48391.addSuppressed(e);
                        }
                        try {
                            C18251 c18252 = this.f48379;
                            if (c18252 != null) {
                                c18252.close();
                            }
                        } finally {
                            this.f48379 = null;
                            this.f48395.m25975();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        C18251 c18253 = this.f48379;
                        if (c18253 != null) {
                            c18253.close();
                        }
                        throw th;
                    } finally {
                        this.f48379 = null;
                        this.f48395.m25975();
                    }
                }
            } catch (Throwable th2) {
                this.f48385 = null;
                this.f48389 = null;
                this.f48386 = null;
                try {
                    try {
                        C18997 c18998 = this.f48380;
                        this.f48380 = null;
                        if (c18998 != null) {
                            c18998.close();
                        }
                        try {
                            C18251 c18254 = this.f48379;
                            if (c18254 != null) {
                                c18254.close();
                            }
                            throw th2;
                        } finally {
                            this.f48379 = null;
                            this.f48395.m25975();
                        }
                    } catch (Throwable th3) {
                        try {
                            C18251 c18255 = this.f48379;
                            if (c18255 != null) {
                                c18255.close();
                            }
                            throw th3;
                        } finally {
                            this.f48379 = null;
                            this.f48395.m25975();
                        }
                    }
                } catch (IOException e2) {
                    if (this.f48391 == null) {
                        this.f48391 = e2;
                    } else if (this.f48391 != e2) {
                        this.f48391.addSuppressed(e2);
                    }
                    try {
                        C18251 c18256 = this.f48379;
                        if (c18256 != null) {
                            c18256.close();
                        }
                    } finally {
                        this.f48379 = null;
                        this.f48395.m25975();
                    }
                }
            }
        } catch (IOException e3) {
            this.f48391 = e3;
            this.f48385 = null;
            this.f48389 = null;
            this.f48386 = null;
            try {
                try {
                    C18997 c18999 = this.f48380;
                    this.f48380 = null;
                    if (c18999 != null) {
                        c18999.close();
                    }
                    try {
                        C18251 c18257 = this.f48379;
                        if (c18257 != null) {
                            c18257.close();
                        }
                    } finally {
                        this.f48379 = null;
                        this.f48395.m25975();
                    }
                } catch (IOException e4) {
                    if (this.f48391 == null) {
                        this.f48391 = e4;
                    } else if (this.f48391 != e4) {
                        this.f48391.addSuppressed(e4);
                    }
                    try {
                        C18251 c18258 = this.f48379;
                        if (c18258 != null) {
                            c18258.close();
                        }
                    } finally {
                        this.f48379 = null;
                        this.f48395.m25975();
                    }
                }
            } catch (Throwable th4) {
                try {
                    C18251 c18259 = this.f48379;
                    if (c18259 != null) {
                        c18259.close();
                    }
                    throw th4;
                } finally {
                    this.f48379 = null;
                    this.f48395.m25975();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m35628();
    }
}
