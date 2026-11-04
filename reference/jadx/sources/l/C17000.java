package l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17000 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f55547;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10046 f55548;

    public C17000(C10046 c10046, Runnable runnable) {
        this.f55548 = c10046;
        this.f55547 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40060(C21697 c21697) {
        return m40055(c21697.f69245);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m40055(AbstractC1339 abstractC1339) throws IOException {
        long jM25974;
        this.f55547.run();
        if (abstractC1339 == null) {
            return 0L;
        }
        if (abstractC1339.f4793 >= 0) {
            return abstractC1339.f4793;
        }
        if (abstractC1339 instanceof C19238) {
            C7810 c7810 = ((C19238) abstractC1339).f62239;
            if (c7810 == null || c7810.f26019 != this.f55548) {
                throw new IOException("Text page belongs to another store");
            }
            if (c7810.m21282() < 0) {
                C14521 c14521M2111 = this.f55548.f32208.m2111(c7810);
                try {
                    this.f55548.m25969(c7810, c14521M2111.m35037());
                    c14521M2111.close();
                } catch (Throwable th) {
                    try {
                        c14521M2111.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            abstractC1339.f4793 = c7810.m21282();
            return c7810.m21282();
        }
        C17746 c17746 = (C17746) abstractC1339;
        for (AbstractC1339 abstractC13310 : c17746.f58291) {
            m40055(abstractC13310);
        }
        synchronized (this.f55548.f32208.f1856) {
            C6178 c6178 = new C6178((c17746.f58291.length * 16) + 16);
            c6178.writeInt(c17746.f4791);
            c6178.writeInt(c17746.f58291.length);
            c6178.writeInt(c17746.f4794);
            c6178.writeInt(c17746.f4792);
            for (AbstractC1339 abstractC13311 : c17746.f58291) {
                c6178.m17803(abstractC13311.f4793);
                c6178.writeInt(abstractC13311.f4794);
                c6178.writeInt(abstractC13311.f4792);
            }
            C10046 c10046 = this.f55548;
            long jM25973 = c10046.m25973();
            c10046.getClass();
            jM25974 = c10046.m25974(jM25973, c6178.m17808(), 2, c6178.size());
            c17746.f4793 = jM25974;
        }
        return jM25974;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C21697 m40057(C17000 c17000) {
        C10046 c10046 = c17000.f55548;
        return new C21697(null, c10046.f32213, c10046.f32209, c10046);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m40061(long j, long j2, int i, int i2, int i3, C25206 c25206) throws IOException {
        if (j == 0) {
            if (i != -1 || i2 != 0 || i3 != 0) {
                throw new IOException("Invalid empty recovery root");
            }
            return (C21697) C11392.computeIfAbsent(c25206.f81446, 0L, new C2085(0, this));
        }
        final AbstractC1339 abstractC1339M40056 = m40056(j, j2, i, true, c25206);
        if (abstractC1339M40056.f4794 != i2 || abstractC1339M40056.f4792 != i3) {
            throw new IOException("Recovery root statistics do not match");
        }
        return (C21697) C11392.computeIfAbsent(c25206.f81446, Long.valueOf(j), new Function() { // from class: l.ۧܿ᩸
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C17000.m40058(this.f38054, abstractC1339M40056);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C21697 m40058(C17000 c17000, AbstractC1339 abstractC1339) {
        C10046 c10046 = c17000.f55548;
        return new C21697(abstractC1339, c10046.f32213, c10046.f32209, c10046);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1339 m40056(long j, long j2, int i, boolean z, C25206 c25206) throws IOException {
        C15005 c15005M25980;
        int i2;
        boolean z2;
        AbstractC1339 c17746;
        C25206 c25207;
        int i3;
        int i4;
        int i5 = i;
        boolean z3 = z;
        this.f55547.run();
        if (i5 < 0 || i5 > 32 || j < 64 || j >= j2) {
            throw new IOException("Invalid recovery tree reference");
        }
        synchronized (this.f55548.f32208.f1856) {
            c15005M25980 = this.f55548.m25980(j);
        }
        long j3 = j + 32;
        if (((long) c15005M25980.f49016) + j3 + 16 > j2 || c15005M25980.f49015 >= c25206.f81447) {
            throw new IOException("Invalid recovery record boundary or identity");
        }
        AbstractC1339 abstractC1339 = (AbstractC1339) c25206.f81444.get(Long.valueOf(j));
        if (abstractC1339 != null) {
            m40059(abstractC1339, i5, z3);
            return abstractC1339;
        }
        c25206.m56187();
        int i6 = 2;
        if (i5 == 0) {
            if (c15005M25980.f49018 != 1 || c15005M25980.f49016 < 16) {
                throw new IOException("Missing recovery text page");
            }
            byte[] bArr = new byte[16];
            synchronized (this.f55548.f32208.f1856) {
                this.f55548.f32215.mo14341(j3, bArr, 0, 16);
            }
            C20348 c20348 = new C20348(bArr);
            int i7 = c20348.readInt();
            int i8 = c20348.readInt();
            int i9 = c20348.readInt();
            int i10 = c20348.readInt();
            C10046 c10046 = this.f55548;
            if (i7 != c10046.f32213 || i8 < 1 || i8 > i7 || i9 < 0 || i9 > i8 || ((i10 != 1 && i10 != 2) || c15005M25980.f49016 != (i8 * i10) + 16)) {
                throw new IOException("Invalid recovery text page shape");
            }
            C7810 c7810 = new C7810(c10046, c15005M25980.f49015, j, i7, i8, i9, i10 == 1);
            C14521 c14521M2111 = this.f55548.f32208.m2111(c7810);
            try {
                c17746 = new C19238(c25206.f81448, c7810);
                c14521M2111.close();
                i3 = i5;
                c25207 = c25206;
                z2 = z3;
            } catch (Throwable th) {
                try {
                    c14521M2111.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            if (c15005M25980.f49018 != 2 || (i2 = c15005M25980.f49016) < 16 || i2 > 8192) {
                throw new IOException("Missing recovery index node");
            }
            C18251 c18251M2112 = this.f55548.f32208.m2112(((long) i2) + 16);
            try {
                C20348 c20349 = new C20348(this.f55548.m25970(j, c15005M25980));
                int i11 = c20349.readInt();
                int i12 = c20349.readInt();
                int i13 = c20349.readInt();
                int i14 = c20349.readInt();
                if (i11 == i5) {
                    if (!z3) {
                        i6 = this.f55548.f32209 / 2;
                    }
                    if (i12 >= i6 && i12 <= this.f55548.f32209 && c15005M25980.f49016 == (i12 * 16) + 16 && i13 >= 1 && i14 >= 0 && i14 <= i13) {
                        AbstractC1339[] abstractC1339Arr = new AbstractC1339[i12];
                        long j4 = 0;
                        long j5 = 0;
                        int i15 = 0;
                        while (i15 < i12) {
                            long j6 = c20349.readLong();
                            int i16 = c20349.readInt();
                            int i17 = c20349.readInt();
                            int i18 = i15;
                            int i19 = i12;
                            boolean z4 = z3;
                            AbstractC1339 abstractC1339M40056 = m40056(j6, j, i5 - 1, false, c25206);
                            int i20 = abstractC1339M40056.f4794;
                            if (i20 != i16 || (i4 = abstractC1339M40056.f4792) != i17) {
                                throw new IOException("Recovery child statistics do not match");
                            }
                            abstractC1339Arr[i18] = abstractC1339M40056;
                            j4 += (long) i20;
                            j5 += (long) i4;
                            i15 = i18 + 1;
                            i5 = i;
                            z3 = z4;
                            i12 = i19;
                        }
                        z2 = z3;
                        if (j4 != i13 || j5 != i14 || c20349.available() != 0) {
                            throw new IOException("Invalid recovery index totals");
                        }
                        c25207 = c25206;
                        c17746 = new C17746(c25207.f81448, abstractC1339Arr);
                        c18251M2112.close();
                        i3 = i;
                    }
                }
                throw new IOException("Invalid recovery index shape");
            } catch (Throwable th3) {
                try {
                    c18251M2112.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        m40059(c17746, i3, z2);
        c17746.f4793 = j;
        c25207.f81444.put(Long.valueOf(j), c17746);
        return c17746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40059(AbstractC1339 abstractC1339, int i, boolean z) throws IOException {
        int i2;
        boolean z2 = abstractC1339 instanceof C19238;
        int length = z2 ? abstractC1339.f4794 : ((C17746) abstractC1339).f58291.length;
        C10046 c10046 = this.f55548;
        int i3 = 2;
        if (z2) {
            if (z) {
                i3 = 1;
            } else {
                i2 = c10046.f32213;
                i3 = i2 / 2;
            }
        } else if (!z) {
            i2 = c10046.f32209;
            i3 = i2 / 2;
        }
        if (abstractC1339.f4791 != i || length < i3) {
            throw new IOException("Invalid recovery node occupancy");
        }
    }
}
