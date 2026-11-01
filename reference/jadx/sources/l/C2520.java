package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5571 f10002;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22277 f10003;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f10001 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f10004 = new HashMap();

    public C2520(C22277 c22277, C5571 c5571) {
        this.f10003 = c22277;
        this.f10002 = c5571;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13811 m7876(long j, long j2) {
        C3370 c3370M38101;
        int i;
        this.f10003.f72805.run();
        if (j < 64 || j >= j2) {
            throw new IOException("Invalid history reference");
        }
        synchronized (this.f10003.f72807.f51982.f35622) {
            c3370M38101 = this.f10003.f72807.m38101(j);
        }
        if (c3370M38101.f12486 != 5 || (i = c3370M38101.f12488) < 4 || i > 72 || 32 + j + ((long) i) + 16 > j2 || c3370M38101.f12487 >= this.f10002.f19097) {
            throw new IOException("Invalid history frame boundary");
        }
        C9017 c9017M26333 = this.f10003.f72807.f51982.m26333(((long) c3370M38101.f12488) + 16);
        try {
            return new C13811(new C17367(this.f10003.f72807.m38097(j, c3370M38101)), c3370M38101.f12488, c9017M26333);
        } catch (IOException | Error | RuntimeException e) {
            c9017M26333.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6878 m7872(int i, long j, long j2, boolean z) throws IOException {
        C6878 c6878;
        if (j == 0) {
            return null;
        }
        if (i > 46) {
            throw new IOException("Invalid history sequence depth");
        }
        C13811 c13811M7876 = m7876(j, j2);
        try {
            int i2 = c13811M7876.f45591.readInt();
            if (i2 != (z ? 2 : 4)) {
                if (i2 != (z ? 3 : 5)) {
                    throw new IOException("Invalid history sequence type");
                }
            }
            Object objM7870 = m7870(i2, j);
            if (objM7870 != null) {
                C6878 c6879 = (C6878) objM7870;
                c13811M7876.close();
                return c6879;
            }
            this.f10002.m15387();
            if (i2 == 2 || i2 == 4) {
                if (c13811M7876.f45590 != 12) {
                    throw new IOException("Invalid history sequence leaf");
                }
                long j3 = c13811M7876.f45591.readLong();
                c6878 = new C6878(z ? m7875(j3, j) : m7871(j3, j));
            } else {
                if (c13811M7876.f45590 != 28) {
                    throw new IOException("Invalid history sequence branch");
                }
                int i3 = c13811M7876.f45591.readInt();
                int i4 = c13811M7876.f45591.readInt();
                long j4 = c13811M7876.f45591.readLong();
                long j5 = c13811M7876.f45591.readLong();
                if (i3 < 2 || i3 > 46 || i4 < 2 || j4 == 0 || j5 == 0) {
                    throw new IOException("Invalid history sequence metadata");
                }
                if (i4 > this.f10002.f19094) {
                    throw new C9722("History logical size limit exceeded");
                }
                int i5 = i + 1;
                C6878 c6878M7872 = m7872(i5, j4, j, z);
                C6878 c6878M7873 = m7872(i5, j5, j, z);
                if (Math.abs(c6878M7872.f23171 - c6878M7873.f23171) > 1 || i3 != Math.max(c6878M7872.f23171, c6878M7873.f23171) + 1 || ((long) c6878M7872.f23169) + ((long) c6878M7873.f23169) != i4) {
                    throw new IOException("Invalid history sequence balance");
                }
                c6878 = new C6878(c6878M7872, c6878M7873);
            }
            c6878.f23172 = this.f10003.f72807;
            c6878.f23170 = j;
            this.f10001.put(Long.valueOf(j), new C5343(i2, c6878));
            c13811M7876.close();
            return c6878;
        } catch (Throwable th) {
            try {
                c13811M7876.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23128 m7875(long j, long j2) {
        C13811 c13811M7876 = m7876(j, j2);
        try {
            C17367 c17367 = c13811M7876.f45591;
            if (c17367.readInt() != 6 || c13811M7876.f45590 != 36) {
                throw new IOException("Invalid history record shape");
            }
            Object objM7870 = m7870(6, j);
            if (objM7870 != null) {
                C23128 c23128 = (C23128) objM7870;
                c13811M7876.close();
                return c23128;
            }
            this.f10002.m15387();
            long j3 = c17367.readLong();
            long j4 = c17367.readLong();
            int i = c17367.readInt();
            long j5 = c17367.readLong();
            int i2 = c17367.readInt();
            if (j3 <= 0 || i < 0 || i > 1 || i2 <= 0) {
                throw new IOException("Invalid history record metadata");
            }
            if (i2 <= this.f10002.f19094) {
                C15346 c15346 = new C15346(m7872(0, j5, j, false));
                if (c15346.m36740() != i2) {
                    throw new IOException("History change count mismatch");
                }
                C23128 c23129 = new C23128(j3, j4, i == 0 ? EnumC9226.USER : EnumC9226.BATCH, c15346);
                c23129.f75114 = this.f10003.f72807;
                c23129.f75112 = j;
                this.f10001.put(Long.valueOf(j), new C5343(6, c23129));
                c13811M7876.close();
                return c23129;
            }
            throw new C9722("History change count limit exceeded");
        } catch (Throwable th) {
            try {
                c13811M7876.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1463 m7871(long j, long j2) {
        C13811 c13811M7876 = m7876(j, j2);
        try {
            C17367 c17367 = c13811M7876.f45591;
            if (c17367.readInt() != 7 || c13811M7876.f45590 != 72) {
                throw new IOException("Invalid history change shape");
            }
            Object objM7870 = m7870(7, j);
            if (objM7870 != null) {
                C1463 c1463 = (C1463) objM7870;
                c13811M7876.close();
                return c1463;
            }
            this.f10002.m15387();
            int i = c17367.readInt();
            long j3 = c17367.readLong();
            long j4 = c17367.readLong();
            C8872 c8872M7873 = m7873(c17367);
            C14744 c14744M50030 = this.f10003.f72806.m50030(c17367.readLong(), j, c17367.readInt(), c17367.readInt(), c17367.readInt(), this.f10002);
            C14744 c14744M50031 = this.f10003.f72806.m50030(c17367.readLong(), j, c17367.readInt(), c17367.readInt(), c17367.readInt(), this.f10002);
            if (i >= 0) {
                long j5 = i;
                if (((long) c14744M50030.m35339()) + j5 <= 2147483647L && j5 + ((long) c14744M50031.m35339()) <= 2147483647L && j3 >= 0 && j4 >= 0) {
                    C1463 c1464 = new C1463(i, j3, j4, c8872M7873, c14744M50030, c14744M50031);
                    c1464.f5962 = this.f10003.f72807;
                    c1464.f5960 = j;
                    this.f10001.put(Long.valueOf(j), new C5343(7, c1464));
                    c13811M7876.close();
                    return c1464;
                }
            }
            throw new IOException("Invalid history change metadata");
        } catch (Throwable th) {
            try {
                c13811M7876.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8872 m7873(C17367 c17367) throws IOException {
        final int i = c17367.readInt();
        final int i2 = c17367.readInt();
        if (i < -1 || i2 < -1) {
            throw new IOException("Invalid history selection");
        }
        return (C8872) C9735.computeIfAbsent(this.f10004, Long.valueOf((((long) i) << 32) | (((long) i2) & 4294967295L)), new Function() { // from class: l.ۨ۫ۖ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new C8872(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m7870(int i, long j) throws IOException {
        C5343 c5343 = (C5343) this.f10001.get(Long.valueOf(j));
        if (c5343 == null) {
            return null;
        }
        if (c5343.f18453 != i) {
            throw new IOException("Conflicting history reference types");
        }
        return c5343.f18454;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7874(C15346 c15346, C15346 c15347, long j, long j2) throws IOException {
        long jM36740 = ((long) c15346.m36740()) + ((long) c15347.m36740());
        C5571 c5571 = this.f10002;
        if (jM36740 > c5571.f19094) {
            throw new C9722("History record count limit exceeded");
        }
        HashSet hashSet = new HashSet();
        int iM51269 = 0;
        Object[] objArr = {c15346, c15347};
        ArrayList arrayList = new ArrayList(2);
        while (iM51269 < 2) {
            Object obj = objArr[iM51269];
            iM51269 = C23234.m51269(obj, arrayList, obj, iM51269, 1);
        }
        Iterator it = C0561.unmodifiableList(arrayList).iterator();
        long jM36741 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((C15346) it.next()).iterator();
            while (true) {
                C4055 c4055 = (C4055) it2;
                if (c4055.hasNext()) {
                    C23128 c23128 = (C23128) c4055.next();
                    long j3 = c23128.f75116;
                    C15346 c15348 = c23128.f75113;
                    if (j3 >= j || !hashSet.add(Long.valueOf(j3))) {
                        throw new IOException("Invalid history record identity");
                    }
                    jM36741 += (long) c15348.m36740();
                    if (jM36741 > c5571.f19094) {
                        throw new C9722("History replay size limit exceeded");
                    }
                    Iterator it3 = c15348.iterator();
                    while (true) {
                        C4055 c4056 = (C4055) it3;
                        if (c4056.hasNext()) {
                            C1463 c1463 = (C1463) c4056.next();
                            this.f10003.f72805.run();
                            if (c1463.f5963 > j2 || c1463.f5965 > j2) {
                                throw new IOException("Invalid historical edit mark");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7869(C15346 c15346, int i, boolean z, Runnable runnable) throws IOException {
        Iterator c4055;
        c15346.getClass();
        C4055 c4056 = new C4055(c15346, true);
        while (c4056.hasNext()) {
            C15346 c15347 = ((C23128) c4056.next()).f75113;
            if (!z) {
                c15347.getClass();
                c4055 = new C4055(c15347, true);
            } else {
                c4055 = c15347.iterator();
            }
            while (true) {
                C4055 c4057 = (C4055) c4055;
                if (c4057.hasNext()) {
                    runnable.run();
                    C1463 c1463 = (C1463) c4057.next();
                    C14744 c14744 = c1463.f5961;
                    C14744 c14745 = c1463.f5966;
                    C8872 c8872 = c1463.f5959;
                    if (z && (c8872.m23016() > i || c8872.m23014() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                    int iM35339 = z ? c14745.m35339() : c14744.m35339();
                    int iM353310 = z ? c14744.m35339() : c14745.m35339();
                    int i2 = c1463.f5964;
                    if (i2 > i || iM35339 > i - i2) {
                        throw new IOException("History range exceeds replayed text");
                    }
                    long j = (((long) i) - ((long) iM35339)) + ((long) iM353310);
                    if (j > 2147483647L) {
                        throw new IOException("History replay exceeds coordinate limit");
                    }
                    i = (int) j;
                    if (!z && (c8872.m23016() > i || c8872.m23014() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                }
            }
        }
    }
}
