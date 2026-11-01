package l;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܰۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C13807 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C3284 f45561;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f45562;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C16691 f45563;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2516 f45564;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f45565;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C22710 f45566;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f45567;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f45568;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f45569;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f45570;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5838 f45571;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Thread f45572;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f45573 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C4633 f45574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f45575;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f45576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20924 f45577;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45578;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f45579;

    public C13807(C2516 c2516, C3284 c3284, long j, C20924 c20924) {
        this.f45564 = c2516;
        this.f45561 = c3284;
        this.f45567 = j;
        this.f45577 = c20924;
        this.f45566 = c3284.f12185;
        this.f45571 = c3284.f12181;
        this.f45575 = c3284.f12183;
        this.f45579 = c3284.f12184;
        this.f45565 = c3284.f12182;
        this.f45570 = c3284.f12177;
        this.f45576 = c3284.f12176;
    }

    public final int length() {
        int i;
        synchronized (this.f45564) {
            m33601();
            C22710 c22710 = this.f45566;
            i = c22710 == null ? 0 : c22710.f73964;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m33608(int i, int i2, byte[] bArr) {
        synchronized (this.f45564) {
            m33601();
            this.f45564.m7802();
            if (C2516.m7754((Iterable) this.f45573.keySet())) {
                m33601();
                C7893.m20871(i, 0, i2, this.f45566, bArr);
                this.f45564.m7802();
                if (!C2516.m7754((Iterable) this.f45573.keySet())) {
                    m33564();
                    throw new C8599();
                }
            } else {
                m33564();
                throw new C8599();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x018b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33605(int i, int i2, byte[] bArr, int i3, InterfaceC5614 interfaceC5614) {
        ArrayList arrayList;
        long j;
        C22710 c22710M37965;
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        C22710 c22710M35712;
        C22710 c22710;
        boolean zM35713;
        boolean z3;
        C17770 c17770M20843;
        long jM6676;
        long jM6677;
        long jM41336;
        long j2;
        long jM20828;
        boolean z4;
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
        synchronized (this.f45564) {
            m33601();
            m33557();
            C13638.requireNonNull(bArr);
            C22979.m50824(bArr.length, 0, i3);
            m33565(i, i2, i3);
            if (interfaceC5614M29777.mo2357()) {
                throw new C1105();
            }
            if (i == i2 && i3 == 0) {
                return;
            }
            C20924 c20924M37964 = this.f45564.f9992.m37964();
            int i4 = i2 - i;
            boolean z5 = i4 == i3 && i3 <= 4096;
            try {
                if (z5) {
                    C14949 c14949M20841 = C7893.m20841(this.f45566, i, bArr, i3);
                    c22710M35712 = c14949M20841.m35712();
                    arrayList = null;
                    z3 = false;
                    c22710 = null;
                    z2 = false;
                    j = 0;
                    zM35713 = c14949M20841.m35713();
                } else {
                    if (m33573(i3)) {
                        arrayList2 = new ArrayList();
                        int i5 = 0;
                        C22710 c22710M20831 = null;
                        while (i5 < i3) {
                            try {
                                int iMin = Math.min(33554432, i3 - i5);
                                File file = this.f45564.f9989;
                                if (file != null && file.isDirectory()) {
                                    C18101 c18101M42158 = C18101.m42158(file, bArr, i5, iMin, interfaceC5614M29777);
                                    arrayList2.add(c18101M42158);
                                    c22710M20831 = C7893.m20831(c22710M20831, C7893.m20845(c18101M42158));
                                    i5 += iMin;
                                } else {
                                    throw new IOException("Hex literal spill directory is unavailable");
                                }
                            } catch (IOException e) {
                                e = e;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C2516.m7780((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]), e);
                                }
                                this.f45564.f9992.m37966(c20924M37964);
                                throw e;
                            } catch (Error e2) {
                                e = e2;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C2516.m7780((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]), e);
                                }
                                this.f45564.f9992.m37966(c20924M37964);
                                throw e;
                            } catch (RuntimeException e3) {
                                e = e3;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C2516.m7780((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]), e);
                                }
                                this.f45564.f9992.m37966(c20924M37964);
                                throw e;
                            }
                        }
                        z = true;
                        arrayList = arrayList2;
                        j = 0;
                        c22710M37965 = c22710M20831;
                    } else {
                        j = 0;
                        arrayList = null;
                        c22710M37965 = this.f45564.f9992.m37965(i3, bArr);
                        z = false;
                    }
                    try {
                        C22710 c22710M20848 = C7893.m20848(this.f45566, i, i2, c22710M37965);
                        C22710 c22710M33563 = m33563(c22710M20848, i, this.f45564.f9992);
                        C22710 c22711 = c22710M37965;
                        boolean z6 = (i4 == 0 && c22710M33563 == c22710M20848) ? false : true;
                        boolean z7 = z | (((this.f45576 == j || i4 == 0) && c22710M33563 == c22710M20848) ? false : true);
                        z2 = z6;
                        c22710M35712 = c22710M33563;
                        c22710 = c22711;
                        zM35713 = false;
                        z3 = z7;
                    } catch (IOException | Error | RuntimeException e4) {
                        e = e4;
                        arrayList2 = arrayList;
                        arrayList = arrayList2;
                        if (arrayList != null) {
                            C2516.m7780((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]), e);
                        }
                        this.f45564.f9992.m37966(c20924M37964);
                        throw e;
                    }
                }
                try {
                    C5838 c5838M24023 = C9367.m24023(this.f45571, i, i2, i3);
                    m33571(c22710M35712, c5838M24023);
                    if (z5) {
                        jM41336 = this.f45575;
                        jM6677 = this.f45579;
                    } else {
                        if (z2) {
                            c17770M20843 = C7893.m20874(c22710M35712);
                        } else {
                            c17770M20843 = C7893.m20843(this.f45566, c22710, i);
                        }
                        if (z2) {
                            jM41336 = c17770M20843.m41336();
                            jM6677 = c17770M20843.m41337();
                        } else {
                            jM6676 = C2124.m6676(this.f45575, c17770M20843.m41336());
                            jM6677 = C2124.m6676(this.f45579, c17770M20843.m41337());
                        }
                    }
                    if (z3) {
                        jM41336 = jM6676;
                        long j3 = j;
                        jM20828 = C7893.m20828(c22710M35712);
                        j2 = j3;
                    } else {
                        jM41336 = jM6676;
                        j2 = j;
                        jM20828 = this.f45576;
                    }
                    if (jM41336 > X931RNG.BLOCK128_RESEED_MAX) {
                        throw new IllegalStateException("Literal heap storage exceeds memory limit");
                    }
                    if (interfaceC5614M29777.mo2357()) {
                        throw new C1105();
                    }
                    if (arrayList != null) {
                        m33572((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]));
                    }
                    this.f45566 = c22710M35712;
                    this.f45571 = c5838M24023;
                    this.f45575 = jM41336;
                    this.f45579 = jM6677;
                    this.f45576 = jM20828;
                    boolean z8 = this.f45562;
                    if (z5) {
                        z4 = zM35713;
                    } else if (i4 == 0) {
                        z4 = false;
                    } else {
                        if ((this.f45565 == j2 && this.f45570 == j2 && jM20828 == j2) ? false : true) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    this.f45562 = z8 | z4;
                    this.f45568 = true;
                } catch (IOException e5) {
                    e = e5;
                    if (arrayList != null) {
                        C2516.m7780((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]), e);
                    }
                    this.f45564.f9992.m37966(c20924M37964);
                    throw e;
                } catch (Error e6) {
                    e = e6;
                    if (arrayList != null) {
                        C2516.m7780((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]), e);
                    }
                    this.f45564.f9992.m37966(c20924M37964);
                    throw e;
                } catch (RuntimeException e7) {
                    e = e7;
                    if (arrayList != null) {
                        C2516.m7780((InterfaceC18745[]) arrayList.toArray(new InterfaceC18745[0]), e);
                    }
                    this.f45564.f9992.m37966(c20924M37964);
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e8) {
                e = e8;
                arrayList = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33604(int i, int i2) {
        synchronized (this.f45564) {
            m33601();
            m33557();
            int i3 = i2 - i;
            m33565(i, i2, i3);
            if (i3 == 0) {
                return;
            }
            C20924 c20924M37964 = this.f45564.f9992.m37964();
            try {
                C22710 c22710M33563 = m33563(C7893.m20848(this.f45566, i, i2, C7893.m20845(new C0462((byte) 0, i3))), i, this.f45564.f9992);
                C5838 c5838M24023 = C9367.m24023(this.f45571, i, i2, i3);
                m33571(c22710M33563, c5838M24023);
                C17770 c17770M20874 = C7893.m20874(c22710M33563);
                this.f45566 = c22710M33563;
                this.f45571 = c5838M24023;
                this.f45575 = c17770M20874.m41336();
                this.f45579 = c17770M20874.m41337();
                this.f45562 |= (this.f45565 == 0 && this.f45570 == 0 && this.f45576 == 0) ? false : true;
                this.f45568 = true;
            } catch (Error e) {
                e = e;
                this.f45564.f9992.m37966(c20924M37964);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                this.f45564.f9992.m37966(c20924M37964);
                throw e;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02a4 */
    /* JADX WARN: Code duplicated, block: B:157:0x02a6 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TRY_ENTER, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ac A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02b4 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02ba A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x02db A[Catch: all -> 0x013d, TRY_ENTER, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x02e0 A[Catch: all -> 0x013d, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x02f3 A[Catch: all -> 0x02f8, TryCatch #11 {, blocks: (B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:235:0x02ef, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0163 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0169 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0177 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0180 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0189 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0190 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0199 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x019e A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33606(int r30, l.C6750 r31, l.C0843 r32) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13807.m33606(int, l.ۜۨ᩹, l.֨ۗۚ):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33609(int i, int i2) {
        synchronized (this.f45564) {
            m33601();
            m33557();
            int i3 = 0;
            C16691 c16691 = new C16691(i, i2, true, false);
            C22710 c22710 = this.f45566;
            if (c22710 != null) {
                i3 = c22710.f73964;
            }
            C16691.m39163(c16691, i3);
            this.f45563 = c16691;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33607(InterfaceC5614 interfaceC5614) {
        InterfaceC5614 interfaceC5614M29777 = interfaceC5614 == null ? null : C11965.m29777(interfaceC5614);
        synchronized (this.f45564) {
            m33601();
            m33557();
            if (interfaceC5614M29777 != null && interfaceC5614M29777.mo2357()) {
                m33564();
                return false;
            }
            InterfaceC18745[] interfaceC18745ArrM7762 = C2516.m7762(this.f45564, this, interfaceC5614M29777);
            if (interfaceC18745ArrM7762 == null) {
                return false;
            }
            C2516.m7752(interfaceC18745ArrM7762);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4633 m33603(int i, byte[] bArr) {
        C4633 c4633;
        synchronized (this.f45564) {
            m33601();
            m33557();
            if (!this.f45568) {
                C22710 c22710 = this.f45566;
                C3284 c3284 = this.f45561;
                if (c22710 == c3284.f12185 && this.f45571 == c3284.f12181) {
                    if (i <= 0) {
                        throw new IllegalArgumentException("Pattern must not be empty");
                    }
                    if (bArr.length > 67108864) {
                        throw new IllegalStateException("Replacement metadata exceeds memory limit");
                    }
                    if (!C2516.m7781(C2124.m6676(C2124.m6676(C7893.m20875(c22710), C2124.m6676(C7893.m20876(this.f45566), C2124.m6676(this.f45565, C2124.m6676(this.f45570, C9367.m24045(this.f45571))))), C2124.m6676(bArr.length, 16384L)))) {
                        throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                    }
                    this.f45570 = C2516.m7772(this.f45566);
                    this.f45565 = C7893.m20827(this.f45566);
                    c4633 = new C4633(this, i, (byte[]) bArr.clone());
                    this.f45574 = c4633;
                }
            }
            throw new IllegalStateException("Batch replacement requires a pristine transaction");
        }
        return c4633;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f45564) {
            if (!this.f45569) {
                C2516.m7742(this.f45564, this);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m33593(C13807 c13807) throws C8599 {
        if (C2516.m7754((Iterable) c13807.f45573.keySet())) {
            return;
        }
        c13807.m33564();
        throw new C8599();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m33592(C13807 c13807) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C7893.m20866(c13807.f45566, identityHashMap);
        IdentityHashMap identityHashMap2 = c13807.f45573;
        for (InterfaceC18745 interfaceC18745 : identityHashMap2.keySet()) {
            if (!identityHashMap.containsKey(interfaceC18745) || c13807.f45564.f9984.put(interfaceC18745, Boolean.TRUE) != null) {
                C2516.m7752(new InterfaceC18745[]{interfaceC18745});
            }
        }
        identityHashMap2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m33589(InterfaceC18745[] interfaceC18745Arr) {
        Set setKeySet = this.f45564.f9984.keySet();
        IdentityHashMap identityHashMap = this.f45573;
        Set setKeySet2 = identityHashMap.keySet();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayDeque.push((InterfaceC18745) it.next());
        }
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            arrayDeque.push((InterfaceC18745) it2.next());
        }
        for (InterfaceC18745 interfaceC18745 : interfaceC18745Arr) {
            arrayDeque.push(interfaceC18745);
        }
        while (!arrayDeque.isEmpty()) {
            InterfaceC18745 interfaceC18746 = (InterfaceC18745) arrayDeque.pop();
            Boolean bool = Boolean.TRUE;
            if (identityHashMap2.put(interfaceC18746, bool) == null) {
                if (interfaceC18746 instanceof C8868) {
                    identityHashMap3.put((C8868) interfaceC18746, bool);
                } else if (interfaceC18746 instanceof C23747) {
                    for (InterfaceC18745 interfaceC18747 : ((C23747) interfaceC18746).f76833) {
                        arrayDeque.push(interfaceC18747);
                    }
                }
            }
        }
        if (identityHashMap3.size() > 64) {
            throw new IllegalStateException("Too many external file sources");
        }
        for (InterfaceC18745 interfaceC18748 : interfaceC18745Arr) {
            if (identityHashMap.put(interfaceC18748, Boolean.TRUE) != null) {
                C2516.m7752(new InterfaceC18745[]{interfaceC18748});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33572(InterfaceC18745[] interfaceC18745Arr) {
        int length = interfaceC18745Arr.length;
        int i = 0;
        while (true) {
            IdentityHashMap identityHashMap = this.f45573;
            if (i >= length) {
                for (InterfaceC18745 interfaceC18745 : interfaceC18745Arr) {
                    identityHashMap.put(interfaceC18745, Boolean.TRUE);
                }
                return;
            } else {
                InterfaceC18745 interfaceC18746 = interfaceC18745Arr[i];
                if (identityHashMap.containsKey(interfaceC18746) || this.f45564.f9984.containsKey(interfaceC18746)) {
                    throw new IllegalStateException("Created source is already owned");
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m33584(C13807 c13807) {
        IdentityHashMap identityHashMap = c13807.f45573;
        InterfaceC18745[] interfaceC18745Arr = (InterfaceC18745[]) identityHashMap.keySet().toArray(new InterfaceC18745[0]);
        identityHashMap.clear();
        C2516.m7752(interfaceC18745Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33567(C13807 c13807, InterfaceC5614 interfaceC5614) throws C1105 {
        if (interfaceC5614.mo2357()) {
            c13807.m33564();
            throw new C1105();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22710 m33563(C22710 c22710, int i, C15986 c15986) {
        if (this.f45575 > 8323072) {
            return c22710;
        }
        if ((c22710 == null ? 0 : c22710.f73968) <= 256) {
            return c22710;
        }
        C6481 c6481M20862 = C7893.m20862(i, c22710);
        if (c6481M20862.m17677() == null) {
            return c22710;
        }
        C22710 c22710M17677 = c6481M20862.m17677();
        if ((c22710M17677 != null ? c22710M17677.f73968 : 0) <= 256) {
            return c22710;
        }
        int length = c6481M20862.length();
        byte[] bArr = new byte[length];
        C7893.m20855(c6481M20862.m17677(), bArr);
        return C7893.m20848(c22710, c6481M20862.m17676(), c6481M20862.m17676() + c6481M20862.length(), c15986.m37965(length, bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33565(int i, int i2, int i3) {
        int length = length();
        if (i < 0 || i2 < i || i2 > length) {
            StringBuilder sbM2791 = C0589.m2791("start=", i, ", end=", ", length=", i2);
            sbM2791.append(length);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if ((((long) length) - ((long) (i2 - i))) + ((long) i3) > 2147483647L) {
            throw new C3015();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m33601() {
        m33582();
        if (this.f45569 || this.f45564.f9993 != this || this.f45567 != this.f45564.f9986 || this.f45564.f9987 != this.f45561) {
            throw new IllegalStateException("Transaction is not active");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m33559() {
        if (this.f45572 != null) {
            throw new IllegalStateException("Range transfer is already active");
        }
        this.f45572 = Thread.currentThread();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m33582() {
        Thread thread;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z = false;
        while (!this.f45569 && (thread = this.f45572) != null && thread != threadCurrentThread) {
            try {
                this.f45564.wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            threadCurrentThread.interrupt();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m33557() {
        if (this.f45574 != null) {
            throw new IllegalStateException("A batch replacement is active");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33564() {
        m33582();
        if (this.f45569 || this.f45564.f9993 != this) {
            return;
        }
        C4633 c4633 = this.f45574;
        if (c4633 != null) {
            c4633.f16373 = true;
            this.f45574 = null;
        }
        this.f45564.f9992.m37966(this.f45577);
        IdentityHashMap identityHashMap = this.f45573;
        InterfaceC18745[] interfaceC18745Arr = (InterfaceC18745[]) identityHashMap.keySet().toArray(new InterfaceC18745[0]);
        identityHashMap.clear();
        C2516.m7752(interfaceC18745Arr);
        this.f45564.f9993 = null;
        this.f45569 = true;
        this.f45564.notifyAll();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static void m33555(C13807 c13807) {
        c13807.m33571(c13807.f45566, c13807.f45571);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33571(C22710 c22710, C5838 c5838) {
        if (!C2516.m7781(C2124.m6676(C2124.m6676(C2124.m6676(C2124.m6676(C7893.m20876(c22710), this.f45565), C7893.m20875(c22710)), this.f45570), C9367.m24045(c5838)))) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m33573(int i) {
        if (i == 0) {
            return false;
        }
        if (i >= 0) {
            return C2124.m6676(this.f45575, C2124.m6676(((((long) i) + 65535) / 65536) * 65536, 65536L)) > X931RNG.BLOCK128_RESEED_MAX;
        }
        throw new IllegalArgumentException("Negative literal length");
    }
}
