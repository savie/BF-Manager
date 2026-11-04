package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11254 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f35530;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C18251 f35531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35532;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f35533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f35534;

    public C11254(ArrayList arrayList, int i, int i2, C18251 c18251) {
        this.f35534 = arrayList;
        this.f35531 = c18251;
        C6178 c6178 = new C6178(20);
        c6178.writeInt(1295139155);
        c6178.writeInt(i2 < 0 ? 1 : 2);
        c6178.writeInt(i);
        if (i2 >= 0) {
            c6178.writeInt(i2);
        }
        c6178.writeInt(arrayList.size());
        byte[] bArrM17796 = c6178.m17796();
        this.f35533 = bArrM17796;
        long length = bArrM17796.length;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5289 c5289 = (C5289) it.next();
            C23189 c23189 = c5289.f18617;
            length += (c23189 == null ? c5289.f18615.length : c23189.m52116()) + 12;
        }
        if (length > 2147483647L) {
            throw new IllegalArgumentException("Legacy app state exceeds size limit");
        }
        this.f35530 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11254 m28486(C3051 c3051, int i, int i2, byte[] bArr, C0352 c0352) {
        if (i2 < 0 || ((long) i) + ((long) i2) > 2147483647L) {
            throw new IllegalArgumentException("Invalid legacy page length");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy page prefix");
        }
        C18251 c18251M2112 = c0352.m2112(((long) (bArr == null ? 0 : bArr.length)) + 16384);
        try {
            return m28487(c3051, i, i2, bArr, c18251M2112);
        } catch (Error | RuntimeException e) {
            c18251M2112.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11254 m28487(C3051 c3051, int i, int i2, byte[] bArr, C18251 c18251) {
        C23189 c23189M9917;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5289(256, c3051.m9918()));
        for (int i3 = 1; i3 < 255; i3++) {
            if (i3 != 3 && (c23189M9917 = c3051.m9917(i3)) != null) {
                arrayList.add(new C5289(i3, c23189M9917));
            }
        }
        if (c3051.m9916() != null) {
            arrayList.add(new C5289(259, c3051.m9916()));
        }
        if (c3051.m9921() != null) {
            arrayList.add(new C5289(260, c3051.m9921()));
        }
        arrayList.add(new C5289(257, c3051.m9922()));
        arrayList.add(new C5289(258, c3051.m9923()));
        if (bArr != null) {
            arrayList.add(new C5289((byte[]) bArr.clone()));
        }
        return new C11254(arrayList, i, i2, c18251);
    }

    public final long length() {
        return this.f35530;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m28492() {
        if (this.f35532) {
            throw new IllegalStateException("Legacy app state source is closed");
        }
        return new C14983(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28488(InputStream inputStream, long j, C0352 c0352, InterfaceC1560 interfaceC1560) throws Throwable {
        try {
            C18251 c18251M2112 = c0352.m2112(16384L);
            try {
                if (j >= 16) {
                    try {
                        if (j <= 2147483647L) {
                            try {
                                C12746 c12746 = new C12746(j, inputStream);
                                if (c12746.m31582() != 1295139155) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int iM31582 = c12746.m31582();
                                int i = 1;
                                if (iM31582 != 1 && iM31582 != 2) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int iM31583 = c12746.m31582();
                                int iM31584 = iM31582 == 2 ? c12746.m31582() : -1;
                                int iM31585 = c12746.m31582();
                                if (iM31583 >= 0) {
                                    int i2 = 3;
                                    if (iM31585 >= 3 && iM31585 <= 259 && ((long) iM31585) * 12 <= c12746.f40810) {
                                        if (iM31582 == 2 && (iM31584 < 0 || ((long) iM31583) + ((long) iM31584) > 2147483647L)) {
                                            throw new IOException("Invalid legacy app page range");
                                        }
                                        interfaceC1560.mo5499(iM31583, iM31584);
                                        boolean[] zArr = new boolean[262];
                                        byte[] bArr = new byte[8192];
                                        int i3 = 0;
                                        while (i3 < iM31585) {
                                            int iM31586 = c12746.m31582();
                                            int i4 = i3;
                                            long j2 = c12746.m31583(8).readLong();
                                            if (iM31586 < i || iM31586 > 261 || iM31586 == i2 || iM31586 == 255 || zArr[iM31586] || j2 < 0 || j2 > c12746.f40810) {
                                                throw new IOException("Invalid legacy app state field");
                                            }
                                            zArr[iM31586] = true;
                                            C12746 c12747 = new C12746(j2, c12746);
                                            try {
                                                interfaceC1560.mo5500(iM31586, j2, c12747);
                                                c12747.f40809 = false;
                                                for (long j3 = c12747.f40810; j3 != 0; j3 -= (long) c12746.read(bArr, 0, (int) Math.min(j3, 8192))) {
                                                }
                                                i3 = i4 + 1;
                                                i = 1;
                                                i2 = 3;
                                            } catch (Throwable th) {
                                                c12747.f40809 = false;
                                                throw th;
                                            }
                                        }
                                        if (!zArr[256] || !zArr[257] || !zArr[258] || c12746.f40810 != 0 || inputStream.read() != -1) {
                                            throw new IOException("Incomplete or trailing legacy app state fields");
                                        }
                                        c18251M2112.close();
                                        inputStream.close();
                                        return;
                                    }
                                }
                                throw new IOException("Invalid legacy app state header");
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            Throwable th3 = th;
                            try {
                                c18251M2112.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            inputStream.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                }
                throw new IOException("Invalid legacy app state length");
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f35532) {
            return;
        }
        this.f35532 = true;
        this.f35531.close();
    }
}
