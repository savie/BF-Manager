package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2107 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25206 f6979;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25228 f6980;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f6982 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f6981 = new HashMap();

    public C2107(C25228 c25228, C25206 c25206) {
        this.f6980 = c25228;
        this.f6979 = c25206;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13293 m7289(long j, long j2) {
        C15005 c15005M25980;
        int i;
        this.f6980.f81483.run();
        if (j < 64 || j >= j2) {
            throw new IOException("Invalid history reference");
        }
        synchronized (this.f6980.f81485.f32208.f1856) {
            c15005M25980 = this.f6980.f81485.m25980(j);
        }
        if (c15005M25980.f49018 != 5 || (i = c15005M25980.f49016) < 4 || i > 72 || 32 + j + ((long) i) + 16 > j2 || c15005M25980.f49015 >= this.f6979.f81447) {
            throw new IOException("Invalid history frame boundary");
        }
        C18251 c18251M2112 = this.f6980.f81485.f32208.m2112(((long) c15005M25980.f49016) + 16);
        try {
            return new C13293(new C20348(this.f6980.f81485.m25970(j, c15005M25980)), c15005M25980.f49016, c18251M2112);
        } catch (IOException | Error | RuntimeException e) {
            c18251M2112.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23408 m7286(int i, long j, long j2, boolean z) throws IOException {
        C23408 c23408;
        if (j == 0) {
            return null;
        }
        if (i > 46) {
            throw new IOException("Invalid history sequence depth");
        }
        C13293 c13293M7289 = m7289(j, j2);
        try {
            int i2 = c13293M7289.f42446.readInt();
            if (i2 != (z ? 2 : 4)) {
                if (i2 != (z ? 3 : 5)) {
                    throw new IOException("Invalid history sequence type");
                }
            }
            Object objM7283 = m7283(i2, j);
            if (objM7283 != null) {
                C23408 c23409 = (C23408) objM7283;
                c13293M7289.close();
                return c23409;
            }
            this.f6979.m56187();
            if (i2 == 2 || i2 == 4) {
                if (c13293M7289.f42447 != 12) {
                    throw new IOException("Invalid history sequence leaf");
                }
                long j3 = c13293M7289.f42446.readLong();
                c23408 = new C23408(z ? m7288(j3, j) : m7284(j3, j));
            } else {
                if (c13293M7289.f42447 != 28) {
                    throw new IOException("Invalid history sequence branch");
                }
                int i3 = c13293M7289.f42446.readInt();
                int i4 = c13293M7289.f42446.readInt();
                long j4 = c13293M7289.f42446.readLong();
                long j5 = c13293M7289.f42446.readLong();
                if (i3 < 2 || i3 > 46 || i4 < 2 || j4 == 0 || j5 == 0) {
                    throw new IOException("Invalid history sequence metadata");
                }
                if (i4 > this.f6979.f81443) {
                    throw new C19481("History logical size limit exceeded");
                }
                int i5 = i + 1;
                C23408 c23408M7286 = m7286(i5, j4, j, z);
                C23408 c23408M7287 = m7286(i5, j5, j, z);
                if (Math.abs(c23408M7286.f75770 - c23408M7287.f75770) > 1 || i3 != Math.max(c23408M7286.f75770, c23408M7287.f75770) + 1 || ((long) c23408M7286.f75772) + ((long) c23408M7287.f75772) != i4) {
                    throw new IOException("Invalid history sequence balance");
                }
                c23408 = new C23408(c23408M7286, c23408M7287);
            }
            c23408.f75774 = this.f6980.f81485;
            c23408.f75776 = j;
            this.f6982.put(Long.valueOf(j), new C11801(i2, c23408));
            c13293M7289.close();
            return c23408;
        } catch (Throwable th) {
            try {
                c13293M7289.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20489 m7288(long j, long j2) {
        C13293 c13293M7289 = m7289(j, j2);
        try {
            C20348 c20348 = c13293M7289.f42446;
            if (c20348.readInt() != 6 || c13293M7289.f42447 != 36) {
                throw new IOException("Invalid history record shape");
            }
            Object objM7283 = m7283(6, j);
            if (objM7283 != null) {
                C20489 c20489 = (C20489) objM7283;
                c13293M7289.close();
                return c20489;
            }
            this.f6979.m56187();
            long j3 = c20348.readLong();
            long j4 = c20348.readLong();
            int i = c20348.readInt();
            long j5 = c20348.readLong();
            int i2 = c20348.readInt();
            if (j3 <= 0 || i < 0 || i > 1 || i2 <= 0) {
                throw new IOException("Invalid history record metadata");
            }
            if (i2 <= this.f6979.f81443) {
                C20424 c20424 = new C20424(m7286(0, j5, j, false));
                if (c20424.m46836() != i2) {
                    throw new IOException("History change count mismatch");
                }
                C20489 c204810 = new C20489(j3, j4, i == 0 ? EnumC22662.USER : EnumC22662.BATCH, c20424);
                c204810.f65633 = this.f6980.f81485;
                c204810.f65635 = j;
                this.f6982.put(Long.valueOf(j), new C11801(6, c204810));
                c13293M7289.close();
                return c204810;
            }
            throw new C19481("History change count limit exceeded");
        } catch (Throwable th) {
            try {
                c13293M7289.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10727 m7284(long j, long j2) {
        C13293 c13293M7289 = m7289(j, j2);
        try {
            C20348 c20348 = c13293M7289.f42446;
            if (c20348.readInt() != 7 || c13293M7289.f42447 != 72) {
                throw new IOException("Invalid history change shape");
            }
            Object objM7283 = m7283(7, j);
            if (objM7283 != null) {
                C10727 c10727 = (C10727) objM7283;
                c13293M7289.close();
                return c10727;
            }
            this.f6979.m56187();
            int i = c20348.readInt();
            long j3 = c20348.readLong();
            long j4 = c20348.readLong();
            C21498 c21498M7285 = m7285(c20348);
            C21697 c21697M40061 = this.f6980.f81484.m40061(c20348.readLong(), j, c20348.readInt(), c20348.readInt(), c20348.readInt(), this.f6979);
            C21697 c21697M40062 = this.f6980.f81484.m40061(c20348.readLong(), j, c20348.readInt(), c20348.readInt(), c20348.readInt(), this.f6979);
            if (i >= 0) {
                long j5 = i;
                if (((long) c21697M40061.m49259()) + j5 <= 2147483647L && j5 + ((long) c21697M40062.m49259()) <= 2147483647L && j3 >= 0 && j4 >= 0) {
                    C10727 c10728 = new C10727(i, j3, j4, c21498M7285, c21697M40061, c21697M40062);
                    c10728.f34069 = this.f6980.f81485;
                    c10728.f34071 = j;
                    this.f6982.put(Long.valueOf(j), new C11801(7, c10728));
                    c13293M7289.close();
                    return c10728;
                }
            }
            throw new IOException("Invalid history change metadata");
        } catch (Throwable th) {
            try {
                c13293M7289.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21498 m7285(C20348 c20348) throws IOException {
        final int i = c20348.readInt();
        final int i2 = c20348.readInt();
        if (i < -1 || i2 < -1) {
            throw new IOException("Invalid history selection");
        }
        return (C21498) C11392.computeIfAbsent(this.f6981, Long.valueOf((((long) i) << 32) | (((long) i2) & 4294967295L)), new Function() { // from class: l.ۚᩳ᩸
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new C21498(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m7283(int i, long j) throws IOException {
        C11801 c11801 = (C11801) this.f6982.get(Long.valueOf(j));
        if (c11801 == null) {
            return null;
        }
        if (c11801.f38117 != i) {
            throw new IOException("Conflicting history reference types");
        }
        return c11801.f38118;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7287(C20424 c20424, C20424 c20425, long j, long j2) throws IOException {
        long jM46836 = ((long) c20424.m46836()) + ((long) c20425.m46836());
        C25206 c25206 = this.f6979;
        if (jM46836 > c25206.f81443) {
            throw new C19481("History record count limit exceeded");
        }
        HashSet hashSet = new HashSet();
        int iM9136 = 0;
        Object[] objArr = {c20424, c20425};
        ArrayList arrayList = new ArrayList(2);
        while (iM9136 < 2) {
            Object obj = objArr[iM9136];
            iM9136 = C2764.m9136(obj, arrayList, obj, iM9136, 1);
        }
        Iterator it = C4681.unmodifiableList(arrayList).iterator();
        long jM46837 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((C20424) it.next()).iterator();
            while (true) {
                C15948 c15948 = (C15948) it2;
                if (c15948.hasNext()) {
                    C20489 c20489 = (C20489) c15948.next();
                    long j3 = c20489.f65634;
                    C20424 c20426 = c20489.f65630;
                    if (j3 >= j || !hashSet.add(Long.valueOf(j3))) {
                        throw new IOException("Invalid history record identity");
                    }
                    jM46837 += (long) c20426.m46836();
                    if (jM46837 > c25206.f81443) {
                        throw new C19481("History replay size limit exceeded");
                    }
                    Iterator it3 = c20426.iterator();
                    while (true) {
                        C15948 c15949 = (C15948) it3;
                        if (c15949.hasNext()) {
                            C10727 c10727 = (C10727) c15949.next();
                            this.f6980.f81483.run();
                            if (c10727.f34066 > j2 || c10727.f34070 > j2) {
                                throw new IOException("Invalid historical edit mark");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7282(C20424 c20424, int i, boolean z, Runnable runnable) throws IOException {
        Iterator c15948;
        c20424.getClass();
        C15948 c15949 = new C15948(c20424, true);
        while (c15949.hasNext()) {
            C20424 c20425 = ((C20489) c15949.next()).f65630;
            if (!z) {
                c20425.getClass();
                c15948 = new C15948(c20425, true);
            } else {
                c15948 = c20425.iterator();
            }
            while (true) {
                C15948 c159410 = (C15948) c15948;
                if (c159410.hasNext()) {
                    runnable.run();
                    C10727 c10727 = (C10727) c159410.next();
                    C21697 c21697 = c10727.f34064;
                    C21697 c21698 = c10727.f34068;
                    C21498 c21498 = c10727.f34067;
                    if (z && (c21498.m48908() > i || c21498.m48906() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                    int iM49259 = z ? c21698.m49259() : c21697.m49259();
                    int iM492510 = z ? c21697.m49259() : c21698.m49259();
                    int i2 = c10727.f34065;
                    if (i2 > i || iM49259 > i - i2) {
                        throw new IOException("History range exceeds replayed text");
                    }
                    long j = (((long) i) - ((long) iM49259)) + ((long) iM492510);
                    if (j > 2147483647L) {
                        throw new IOException("History replay exceeds coordinate limit");
                    }
                    i = (int) j;
                    if (!z && (c21498.m48908() > i || c21498.m48906() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                }
            }
        }
    }
}
