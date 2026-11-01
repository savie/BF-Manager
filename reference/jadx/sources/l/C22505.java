package l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes.dex */
public final class C22505 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f73468;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16072 f73469;

    public C22505(C16072 c16072, Runnable runnable) {
        this.f73469 = c16072;
        this.f73468 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50029(C14744 c14744) {
        return m50024(c14744.f48222);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m50024(AbstractC0631 abstractC0631) throws IOException {
        long jM38099;
        this.f73468.run();
        if (abstractC0631 == null) {
            return 0L;
        }
        if (abstractC0631.f2725 >= 0) {
            return abstractC0631.f2725;
        }
        if (abstractC0631 instanceof C16155) {
            C7605 c7605 = ((C16155) abstractC0631).f52216;
            if (c7605 == null || c7605.f25159 != this.f73469) {
                throw new IOException("Text page belongs to another store");
            }
            if (c7605.m20140() < 0) {
                C8311 c8311M26332 = this.f73469.f51982.m26332(c7605);
                try {
                    this.f73469.m38096(c7605, c8311M26332.m21738());
                    c8311M26332.close();
                } catch (Throwable th) {
                    try {
                        c8311M26332.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            abstractC0631.f2725 = c7605.m20140();
            return c7605.m20140();
        }
        C1337 c1337 = (C1337) abstractC0631;
        for (AbstractC0631 abstractC0632 : c1337.f5650) {
            m50024(abstractC0632);
        }
        synchronized (this.f73469.f51982.f35622) {
            C11018 c11018 = new C11018((c1337.f5650.length * 16) + 16);
            c11018.writeInt(c1337.f2724);
            c11018.writeInt(c1337.f5650.length);
            c11018.writeInt(c1337.f2727);
            c11018.writeInt(c1337.f2726);
            for (AbstractC0631 abstractC0633 : c1337.f5650) {
                c11018.m27791(abstractC0633.f2725);
                c11018.writeInt(abstractC0633.f2727);
                c11018.writeInt(abstractC0633.f2726);
            }
            C16072 c16072 = this.f73469;
            long jM38090 = c16072.m38090();
            c16072.getClass();
            jM38099 = c16072.m38099(jM38090, c11018.m27788(), 2, c11018.size());
            c1337.f2725 = jM38099;
        }
        return jM38099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C14744 m50026(C22505 c22505) {
        C16072 c16072 = c22505.f73469;
        return new C14744(null, c16072.f51978, c16072.f51976, c16072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m50030(long j, long j2, int i, int i2, int i3, C5571 c5571) throws IOException {
        if (j == 0) {
            if (i != -1 || i2 != 0 || i3 != 0) {
                throw new IOException("Invalid empty recovery root");
            }
            return (C14744) C9735.computeIfAbsent(c5571.f19095, 0L, new Function() { // from class: l.ۨ᩶ۖ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C22505.m50026(this.f40015);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }
            });
        }
        final AbstractC0631 abstractC0631M50025 = m50025(j, j2, i, true, c5571);
        if (abstractC0631M50025.f2727 != i2 || abstractC0631M50025.f2726 != i3) {
            throw new IOException("Recovery root statistics do not match");
        }
        return (C14744) C9735.computeIfAbsent(c5571.f19095, Long.valueOf(j), new Function() { // from class: l.ۖ᩶ۖ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C22505.m50027(this.f10548, abstractC0631M50025);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C14744 m50027(C22505 c22505, AbstractC0631 abstractC0631) {
        C16072 c16072 = c22505.f73469;
        return new C14744(abstractC0631, c16072.f51978, c16072.f51976, c16072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC0631 m50025(long j, long j2, int i, boolean z, C5571 c5571) throws IOException {
        C3370 c3370M38101;
        int i2;
        boolean z2;
        AbstractC0631 c1337;
        C5571 c5572;
        int i3;
        int i4;
        int i5 = i;
        boolean z3 = z;
        this.f73468.run();
        if (i5 < 0 || i5 > 32 || j < 64 || j >= j2) {
            throw new IOException("Invalid recovery tree reference");
        }
        synchronized (this.f73469.f51982.f35622) {
            c3370M38101 = this.f73469.m38101(j);
        }
        long j3 = j + 32;
        if (((long) c3370M38101.f12488) + j3 + 16 > j2 || c3370M38101.f12487 >= c5571.f19097) {
            throw new IOException("Invalid recovery record boundary or identity");
        }
        AbstractC0631 abstractC0631 = (AbstractC0631) c5571.f19096.get(Long.valueOf(j));
        if (abstractC0631 != null) {
            m50028(abstractC0631, i5, z3);
            return abstractC0631;
        }
        c5571.m15387();
        int i6 = 2;
        if (i5 == 0) {
            if (c3370M38101.f12486 != 1 || c3370M38101.f12488 < 16) {
                throw new IOException("Missing recovery text page");
            }
            byte[] bArr = new byte[16];
            synchronized (this.f73469.f51982.f35622) {
                this.f73469.f51985.mo17202(j3, bArr, 0, 16);
            }
            C17367 c17367 = new C17367(bArr);
            int i7 = c17367.readInt();
            int i8 = c17367.readInt();
            int i9 = c17367.readInt();
            int i10 = c17367.readInt();
            C16072 c16072 = this.f73469;
            if (i7 != c16072.f51978 || i8 < 1 || i8 > i7 || i9 < 0 || i9 > i8 || ((i10 != 1 && i10 != 2) || c3370M38101.f12488 != (i8 * i10) + 16)) {
                throw new IOException("Invalid recovery text page shape");
            }
            C7605 c7605 = new C7605(c16072, c3370M38101.f12487, j, i7, i8, i9, i10 == 1);
            C8311 c8311M26332 = this.f73469.f51982.m26332(c7605);
            try {
                c1337 = new C16155(c5571.f19093, c7605);
                c8311M26332.close();
                i3 = i5;
                c5572 = c5571;
                z2 = z3;
            } catch (Throwable th) {
                try {
                    c8311M26332.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            if (c3370M38101.f12486 != 2 || (i2 = c3370M38101.f12488) < 16 || i2 > 8192) {
                throw new IOException("Missing recovery index node");
            }
            C9017 c9017M26333 = this.f73469.f51982.m26333(((long) i2) + 16);
            try {
                C17367 c17368 = new C17367(this.f73469.m38097(j, c3370M38101));
                int i11 = c17368.readInt();
                int i12 = c17368.readInt();
                int i13 = c17368.readInt();
                int i14 = c17368.readInt();
                if (i11 == i5) {
                    if (!z3) {
                        i6 = this.f73469.f51976 / 2;
                    }
                    if (i12 >= i6 && i12 <= this.f73469.f51976 && c3370M38101.f12488 == (i12 * 16) + 16 && i13 >= 1 && i14 >= 0 && i14 <= i13) {
                        AbstractC0631[] abstractC0631Arr = new AbstractC0631[i12];
                        long j4 = 0;
                        long j5 = 0;
                        int i15 = 0;
                        while (i15 < i12) {
                            long j6 = c17368.readLong();
                            int i16 = c17368.readInt();
                            int i17 = c17368.readInt();
                            int i18 = i15;
                            int i19 = i12;
                            boolean z4 = z3;
                            AbstractC0631 abstractC0631M50025 = m50025(j6, j, i5 - 1, false, c5571);
                            int i20 = abstractC0631M50025.f2727;
                            if (i20 != i16 || (i4 = abstractC0631M50025.f2726) != i17) {
                                throw new IOException("Recovery child statistics do not match");
                            }
                            abstractC0631Arr[i18] = abstractC0631M50025;
                            j4 += (long) i20;
                            j5 += (long) i4;
                            i15 = i18 + 1;
                            i5 = i;
                            z3 = z4;
                            i12 = i19;
                        }
                        z2 = z3;
                        if (j4 != i13 || j5 != i14 || c17368.available() != 0) {
                            throw new IOException("Invalid recovery index totals");
                        }
                        c5572 = c5571;
                        c1337 = new C1337(c5572.f19093, abstractC0631Arr);
                        c9017M26333.close();
                        i3 = i;
                    }
                }
                throw new IOException("Invalid recovery index shape");
            } catch (Throwable th3) {
                try {
                    c9017M26333.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        m50028(c1337, i3, z2);
        c1337.f2725 = j;
        c5572.f19096.put(Long.valueOf(j), c1337);
        return c1337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50028(AbstractC0631 abstractC0631, int i, boolean z) throws IOException {
        int i2;
        boolean z2 = abstractC0631 instanceof C16155;
        int length = z2 ? abstractC0631.f2727 : ((C1337) abstractC0631).f5650.length;
        C16072 c16072 = this.f73469;
        int i3 = 2;
        if (z2) {
            if (z) {
                i3 = 1;
            } else {
                i2 = c16072.f51978;
                i3 = i2 / 2;
            }
        } else if (!z) {
            i2 = c16072.f51976;
            i3 = i2 / 2;
        }
        if (abstractC0631.f2724 != i || length < i3) {
            throw new IOException("Invalid recovery node occupancy");
        }
    }
}
