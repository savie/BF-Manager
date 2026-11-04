package l;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.᩸ۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7HX */
/* JADX INFO: loaded from: classes.dex */
public final class C22523 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f72854;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f72855;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12919 f72856;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f72857;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f72858;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f72859;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f72860;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f72861;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile long f72862;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f72863;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C22523 m50748(C15063 c15063, int i, C18135 c18135) {
        long j = this.f72862 - this.f72855.get();
        if (j < 2097152) {
            return null;
        }
        if (System.currentTimeMillis() - this.f72858 >= c18135.m42249()) {
            long jM31994 = this.f72856.m31994();
            if (jM31994 <= 0) {
                return null;
            }
            if (j / jM31994 < c18135.m42248()) {
                return null;
            }
        } else if (j <= 52428800) {
            return null;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 < 1048576) {
            j2 = 1048576;
        }
        long j3 = this.f72862 - j2;
        long j4 = this.f72862;
        this.f72862 = j3;
        return new C22523(this.f72857, this.f72863, c15063.f49186.incrementAndGet(), this.f72859, this.f72861, j3, j4, this.f72860);
    }

    public C22523(int i, String str, int i2, String str2, long j, long j2, long j3, InterfaceC17713 interfaceC17713) {
        this.f72857 = i;
        this.f72863 = str;
        this.f72859 = str2;
        this.f72861 = j;
        this.f72854 = j2;
        this.f72855 = new AtomicLong(j2);
        this.f72862 = j3;
        this.f72860 = interfaceC17713;
        C12919 c12919 = new C12919();
        c12919.m31997();
        this.f72856 = c12919;
        this.f72858 = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۤۗ۫] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50749(AbstractC18881 abstractC18881, C15063 c15063, C3639 c3639) {
        InputStream inputStreamMo43786;
        EnumC18638 enumC18638;
        EnumC18638 enumC18639;
        EnumC18638 enumC186310;
        long j = this.f72855.get();
        long j2 = this.f72862;
        long jMax = Math.max(0L, j2 - j);
        if (abstractC18881 instanceof InterfaceC9687) {
            inputStreamMo43786 = ((InterfaceC9687) abstractC18881).mo1020(this.f72859, j, jMax, new LongSupplier() { // from class: l.ۤۗ۫
                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return this.f33620.f72862;
                }
            });
        } else {
            inputStreamMo43786 = abstractC18881.mo43786(this.f72859, j, jMax);
        }
        int i = 65536;
        try {
            try {
                byte[] bArr = new byte[65536];
                long j3 = j;
                while (true) {
                    if (j3 < this.f72862 && !c3639.mo924()) {
                        long j4 = this.f72862;
                        if (j3 >= j4) {
                            if (j4 < j2) {
                                enumC18639 = EnumC18638.EARLY_COMPLETE;
                            } else {
                                enumC18639 = EnumC18638.NORMAL_COMPLETE;
                            }
                            m50747(inputStreamMo43786, enumC18639);
                        } else {
                            int i2 = inputStreamMo43786.read(bArr, 0, (int) Math.min(i, j4 - j3));
                            if (i2 != -1) {
                                int iMin = (int) Math.min(i2, Math.max(0L, this.f72862 - j3));
                                if (iMin <= 0) {
                                    m50747(inputStreamMo43786, EnumC18638.EARLY_COMPLETE);
                                } else {
                                    synchronized (this.f72860) {
                                        if (this.f72860.isClosed()) {
                                            m50747(inputStreamMo43786, EnumC18638.EARLY_COMPLETE);
                                        } else {
                                            this.f72860.seek(j3);
                                            this.f72860.write(bArr, 0, iMin);
                                            long j5 = iMin;
                                            j3 += j5;
                                            this.f72855.set(j3);
                                            this.f72856.m31995(j5);
                                            c15063.m36294(c3639);
                                            c3639.mo11790(j5, c15063.f49181.addAndGet(j5), c15063.f49175);
                                            if (iMin < i2) {
                                                m50747(inputStreamMo43786, EnumC18638.EARLY_COMPLETE);
                                            } else {
                                                i = 65536;
                                            }
                                        }
                                    }
                                    inputStreamMo43786.close();
                                    this.f72856.m31996();
                                    return;
                                }
                            } else if (j3 >= this.f72862) {
                                if (this.f72862 < j2) {
                                    enumC186310 = EnumC18638.EARLY_COMPLETE;
                                } else {
                                    enumC186310 = EnumC18638.NORMAL_COMPLETE;
                                }
                                m50747(inputStreamMo43786, enumC186310);
                            }
                        }
                    }
                    if (j3 >= this.f72862) {
                        if (this.f72862 < j2) {
                            enumC18638 = EnumC18638.EARLY_COMPLETE;
                        } else {
                            enumC18638 = EnumC18638.NORMAL_COMPLETE;
                        }
                        m50747(inputStreamMo43786, enumC18638);
                    } else if (c3639.mo924()) {
                        m50747(inputStreamMo43786, EnumC18638.EARLY_COMPLETE);
                    }
                    if (inputStreamMo43786 != null) {
                        inputStreamMo43786.close();
                    }
                    this.f72856.m31996();
                    return;
                }
            } catch (Throwable th) {
                if (inputStreamMo43786 == null) {
                    throw th;
                }
                try {
                    inputStreamMo43786.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f72856.m31996();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50747(InputStream inputStream, EnumC18638 enumC18638) {
        if (inputStream instanceof InterfaceC0739) {
            ((InterfaceC0739) inputStream).mo3062(enumC18638);
        }
    }
}
