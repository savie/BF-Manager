package l;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.᩺֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7HX */
/* JADX INFO: loaded from: classes.dex */
public final class C22651 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f73788;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f73789;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f73790;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f73791;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f73792;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f73793;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f73794;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16842 f73795;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile long f73796;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f73797;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C22651 m50183(C21239 c21239, int i, C19994 c19994) {
        long j = this.f73796 - this.f73791.get();
        if (j < 2097152) {
            return null;
        }
        if (System.currentTimeMillis() - this.f73793 >= c19994.m45283()) {
            long jM39496 = this.f73795.m39496();
            if (jM39496 <= 0) {
                return null;
            }
            if (j / jM39496 < c19994.m45282()) {
                return null;
            }
        } else if (j <= 52428800) {
            return null;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 < 1048576) {
            j2 = 1048576;
        }
        long j3 = this.f73796 - j2;
        long j4 = this.f73796;
        this.f73796 = j3;
        return new C22651(this.f73794, this.f73789, c21239.f69188.incrementAndGet(), this.f73788, this.f73792, j3, j4, this.f73797);
    }

    public C22651(int i, String str, int i2, String str2, long j, long j2, long j3, InterfaceC7739 interfaceC7739) {
        this.f73794 = i;
        this.f73789 = str;
        this.f73788 = str2;
        this.f73792 = j;
        this.f73790 = j2;
        this.f73791 = new AtomicLong(j2);
        this.f73796 = j3;
        this.f73797 = interfaceC7739;
        C16842 c16842 = new C16842();
        c16842.m39499();
        this.f73795 = c16842;
        this.f73793 = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۜ֨֨] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50184(AbstractC12233 abstractC12233, C21239 c21239, C4516 c4516) {
        InputStream inputStreamMo30341;
        EnumC14806 enumC14806;
        EnumC14806 enumC14807;
        EnumC14806 enumC14808;
        long j = this.f73791.get();
        long j2 = this.f73796;
        long jMax = Math.max(0L, j2 - j);
        if (abstractC12233 instanceof InterfaceC11362) {
            inputStreamMo30341 = ((InterfaceC11362) abstractC12233).mo28468(this.f73788, j, jMax, new LongSupplier() { // from class: l.ۜ֨֨
                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return this.f21759.f73796;
                }
            });
        } else {
            inputStreamMo30341 = abstractC12233.mo30341(this.f73788, j, jMax);
        }
        int i = 65536;
        try {
            try {
                byte[] bArr = new byte[65536];
                long j3 = j;
                while (true) {
                    if (j3 < this.f73796 && !c4516.mo2357()) {
                        long j4 = this.f73796;
                        if (j3 >= j4) {
                            if (j4 < j2) {
                                enumC14807 = EnumC14806.EARLY_COMPLETE;
                            } else {
                                enumC14807 = EnumC14806.NORMAL_COMPLETE;
                            }
                            m50182(inputStreamMo30341, enumC14807);
                        } else {
                            int i2 = inputStreamMo30341.read(bArr, 0, (int) Math.min(i, j4 - j3));
                            if (i2 != -1) {
                                int iMin = (int) Math.min(i2, Math.max(0L, this.f73796 - j3));
                                if (iMin <= 0) {
                                    m50182(inputStreamMo30341, EnumC14806.EARLY_COMPLETE);
                                } else {
                                    synchronized (this.f73797) {
                                        if (this.f73797.isClosed()) {
                                            m50182(inputStreamMo30341, EnumC14806.EARLY_COMPLETE);
                                        } else {
                                            this.f73797.seek(j3);
                                            this.f73797.write(bArr, 0, iMin);
                                            long j5 = iMin;
                                            j3 += j5;
                                            this.f73791.set(j3);
                                            this.f73795.m39497(j5);
                                            c21239.m47720(c4516);
                                            c4516.mo10127(j5, c21239.f69190.addAndGet(j5), c21239.f69183);
                                            if (iMin < i2) {
                                                m50182(inputStreamMo30341, EnumC14806.EARLY_COMPLETE);
                                            } else {
                                                i = 65536;
                                            }
                                        }
                                    }
                                    inputStreamMo30341.close();
                                    this.f73795.m39498();
                                    return;
                                }
                            } else if (j3 >= this.f73796) {
                                if (this.f73796 < j2) {
                                    enumC14808 = EnumC14806.EARLY_COMPLETE;
                                } else {
                                    enumC14808 = EnumC14806.NORMAL_COMPLETE;
                                }
                                m50182(inputStreamMo30341, enumC14808);
                            }
                        }
                    }
                    if (j3 >= this.f73796) {
                        if (this.f73796 < j2) {
                            enumC14806 = EnumC14806.EARLY_COMPLETE;
                        } else {
                            enumC14806 = EnumC14806.NORMAL_COMPLETE;
                        }
                        m50182(inputStreamMo30341, enumC14806);
                    } else if (c4516.mo2357()) {
                        m50182(inputStreamMo30341, EnumC14806.EARLY_COMPLETE);
                    }
                    if (inputStreamMo30341 != null) {
                        inputStreamMo30341.close();
                    }
                    this.f73795.m39498();
                    return;
                }
            } catch (Throwable th) {
                if (inputStreamMo30341 == null) {
                    throw th;
                }
                try {
                    inputStreamMo30341.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f73795.m39498();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50182(InputStream inputStream, EnumC14806 enumC14806) {
        if (inputStream instanceof InterfaceC2104) {
            ((InterfaceC2104) inputStream).mo6655(enumC14806);
        }
    }
}
