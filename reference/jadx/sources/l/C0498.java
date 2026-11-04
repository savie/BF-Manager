package l;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֡ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C0498 implements AutoCloseable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f2155;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f2156;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C19143 f2157;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f2158;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f2159;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile boolean f2161;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f2162;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public Thread f2163;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f2164;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f2165;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18397 f2166;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C13856 f2167;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21381 f2168;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17037 f2169;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C16159 f2170;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11684 f2171;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f2172;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f2173;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f2160 = new IdentityHashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24497 f2154 = new C24497();

    public C0498(C19143 c19143, C21381 c21381, long j, C11684 c11684) {
        this.f2157 = c19143;
        this.f2168 = c21381;
        this.f2155 = j;
        this.f2171 = c11684;
        this.f2167 = c21381.f68092;
        this.f2169 = c21381.f68095;
        this.f2159 = c21381.f68088;
        this.f2156 = c21381.f68090;
        this.f2172 = c21381.f68085;
        this.f2173 = c21381.f68089;
        this.f2162 = c21381.f68093;
    }

    public final int length() {
        int i;
        synchronized (this.f2157) {
            m2432();
            C13856 c13856 = this.f2167;
            i = c13856 == null ? 0 : c13856.f43959;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2456(int i, byte[] bArr, int i2, int i3) {
        synchronized (this.f2157) {
            m2432();
            this.f2157.m44377();
            if (C19143.m44316((Iterable) this.f2160.keySet())) {
                m2432();
                C19606.m45244(i, 0, i3, this.f2167, bArr);
                this.f2157.m44377();
                if (!C19143.m44316((Iterable) this.f2160.keySet())) {
                    m2409();
                    throw new C12893();
                }
            } else {
                m2409();
                throw new C12893();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b0 A[Catch: all -> 0x0108, Error -> 0x010b, RuntimeException -> 0x010e, IOException -> 0x0111, TRY_ENTER, TryCatch #3 {all -> 0x0108, blocks: (B:4:0x0013, B:8:0x002e, B:10:0x0030, B:18:0x0047, B:56:0x00f2, B:58:0x00fd, B:75:0x014f, B:79:0x015f, B:82:0x0167, B:83:0x0175, B:84:0x017f, B:100:0x01a1, B:101:0x01ae, B:88:0x0188, B:90:0x018e, B:103:0x01b0, B:104:0x01b5, B:105:0x01b6, B:106:0x01bd, B:76:0x0156, B:68:0x0116, B:71:0x0123, B:73:0x0132, B:69:0x011b, B:122:0x01cf, B:123:0x01da, B:124:0x01e3, B:19:0x005f, B:21:0x0065, B:25:0x0074, B:27:0x0080, B:29:0x0086, B:30:0x0097, B:31:0x009e, B:42:0x00bf, B:48:0x00d7, B:40:0x00af, B:125:0x01e4, B:126:0x01e9), top: B:129:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01b6 A[Catch: all -> 0x0108, Error -> 0x010b, RuntimeException -> 0x010e, IOException -> 0x0111, TryCatch #3 {all -> 0x0108, blocks: (B:4:0x0013, B:8:0x002e, B:10:0x0030, B:18:0x0047, B:56:0x00f2, B:58:0x00fd, B:75:0x014f, B:79:0x015f, B:82:0x0167, B:83:0x0175, B:84:0x017f, B:100:0x01a1, B:101:0x01ae, B:88:0x0188, B:90:0x018e, B:103:0x01b0, B:104:0x01b5, B:105:0x01b6, B:106:0x01bd, B:76:0x0156, B:68:0x0116, B:71:0x0123, B:73:0x0132, B:69:0x011b, B:122:0x01cf, B:123:0x01da, B:124:0x01e3, B:19:0x005f, B:21:0x0065, B:25:0x0074, B:27:0x0080, B:29:0x0086, B:30:0x0097, B:31:0x009e, B:42:0x00bf, B:48:0x00d7, B:40:0x00af, B:125:0x01e4, B:126:0x01e9), top: B:129:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x014f A[Catch: all -> 0x0108, Error -> 0x010b, RuntimeException -> 0x010e, IOException -> 0x0111, TryCatch #3 {all -> 0x0108, blocks: (B:4:0x0013, B:8:0x002e, B:10:0x0030, B:18:0x0047, B:56:0x00f2, B:58:0x00fd, B:75:0x014f, B:79:0x015f, B:82:0x0167, B:83:0x0175, B:84:0x017f, B:100:0x01a1, B:101:0x01ae, B:88:0x0188, B:90:0x018e, B:103:0x01b0, B:104:0x01b5, B:105:0x01b6, B:106:0x01bd, B:76:0x0156, B:68:0x0116, B:71:0x0123, B:73:0x0132, B:69:0x011b, B:122:0x01cf, B:123:0x01da, B:124:0x01e3, B:19:0x005f, B:21:0x0065, B:25:0x0074, B:27:0x0080, B:29:0x0086, B:30:0x0097, B:31:0x009e, B:42:0x00bf, B:48:0x00d7, B:40:0x00af, B:125:0x01e4, B:126:0x01e9), top: B:129:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0156 A[Catch: all -> 0x0108, Error -> 0x010b, RuntimeException -> 0x010e, IOException -> 0x0111, TryCatch #3 {all -> 0x0108, blocks: (B:4:0x0013, B:8:0x002e, B:10:0x0030, B:18:0x0047, B:56:0x00f2, B:58:0x00fd, B:75:0x014f, B:79:0x015f, B:82:0x0167, B:83:0x0175, B:84:0x017f, B:100:0x01a1, B:101:0x01ae, B:88:0x0188, B:90:0x018e, B:103:0x01b0, B:104:0x01b5, B:105:0x01b6, B:106:0x01bd, B:76:0x0156, B:68:0x0116, B:71:0x0123, B:73:0x0132, B:69:0x011b, B:122:0x01cf, B:123:0x01da, B:124:0x01e3, B:19:0x005f, B:21:0x0065, B:25:0x0074, B:27:0x0080, B:29:0x0086, B:30:0x0097, B:31:0x009e, B:42:0x00bf, B:48:0x00d7, B:40:0x00af, B:125:0x01e4, B:126:0x01e9), top: B:129:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x015f A[Catch: all -> 0x0108, Error -> 0x010b, RuntimeException -> 0x010e, IOException -> 0x0111, TryCatch #3 {all -> 0x0108, blocks: (B:4:0x0013, B:8:0x002e, B:10:0x0030, B:18:0x0047, B:56:0x00f2, B:58:0x00fd, B:75:0x014f, B:79:0x015f, B:82:0x0167, B:83:0x0175, B:84:0x017f, B:100:0x01a1, B:101:0x01ae, B:88:0x0188, B:90:0x018e, B:103:0x01b0, B:104:0x01b5, B:105:0x01b6, B:106:0x01bd, B:76:0x0156, B:68:0x0116, B:71:0x0123, B:73:0x0132, B:69:0x011b, B:122:0x01cf, B:123:0x01da, B:124:0x01e3, B:19:0x005f, B:21:0x0065, B:25:0x0074, B:27:0x0080, B:29:0x0086, B:30:0x0097, B:31:0x009e, B:42:0x00bf, B:48:0x00d7, B:40:0x00af, B:125:0x01e4, B:126:0x01e9), top: B:129:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0167 A[Catch: all -> 0x0108, Error -> 0x010b, RuntimeException -> 0x010e, IOException -> 0x0111, TryCatch #3 {all -> 0x0108, blocks: (B:4:0x0013, B:8:0x002e, B:10:0x0030, B:18:0x0047, B:56:0x00f2, B:58:0x00fd, B:75:0x014f, B:79:0x015f, B:82:0x0167, B:83:0x0175, B:84:0x017f, B:100:0x01a1, B:101:0x01ae, B:88:0x0188, B:90:0x018e, B:103:0x01b0, B:104:0x01b5, B:105:0x01b6, B:106:0x01bd, B:76:0x0156, B:68:0x0116, B:71:0x0123, B:73:0x0132, B:69:0x011b, B:122:0x01cf, B:123:0x01da, B:124:0x01e3, B:19:0x005f, B:21:0x0065, B:25:0x0074, B:27:0x0080, B:29:0x0086, B:30:0x0097, B:31:0x009e, B:42:0x00bf, B:48:0x00d7, B:40:0x00af, B:125:0x01e4, B:126:0x01e9), top: B:129:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188 A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:4:0x0013, B:8:0x002e, B:10:0x0030, B:18:0x0047, B:56:0x00f2, B:58:0x00fd, B:75:0x014f, B:79:0x015f, B:82:0x0167, B:83:0x0175, B:84:0x017f, B:100:0x01a1, B:101:0x01ae, B:88:0x0188, B:90:0x018e, B:103:0x01b0, B:104:0x01b5, B:105:0x01b6, B:106:0x01bd, B:76:0x0156, B:68:0x0116, B:71:0x0123, B:73:0x0132, B:69:0x011b, B:122:0x01cf, B:123:0x01da, B:124:0x01e3, B:19:0x005f, B:21:0x0065, B:25:0x0074, B:27:0x0080, B:29:0x0086, B:30:0x0097, B:31:0x009e, B:42:0x00bf, B:48:0x00d7, B:40:0x00af, B:125:0x01e4, B:126:0x01e9), top: B:129:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x019b  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2454(int i, int i2, byte[] bArr, int i3, InterfaceC7509 interfaceC7509) {
        ArrayList arrayList;
        long j;
        C13856 c13856M55980;
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        C13856 c13856M14565;
        C13856 c13856;
        boolean zM14566;
        boolean z3;
        C10655 c10655M45212;
        long j2;
        long jM10044;
        long jM10045;
        long jM27161;
        long jM27162;
        long jM45247;
        boolean z4;
        boolean z5;
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
        synchronized (this.f2157) {
            try {
                m2432();
                m2429();
                C17359.requireNonNull(bArr);
                C13921.m33902(bArr.length, 0, i3);
                m2410(i, i2, i3);
                if (interfaceC7509M41888.mo924()) {
                    throw new C9446();
                }
                if (i == i2 && i3 == 0) {
                    return;
                }
                C11684 c11684M55979 = this.f2157.f61949.m55979();
                int i4 = i2 - i;
                boolean z6 = i4 == i3 && i3 <= 4096;
                try {
                    if (z6) {
                        C4690 c4690M45210 = C19606.m45210(this.f2167, i, bArr, i3);
                        c13856M14565 = c4690M45210.m14565();
                        arrayList = null;
                        z3 = false;
                        c13856 = null;
                        z2 = false;
                        j = 0;
                        zM14566 = c4690M45210.m14566();
                    } else {
                        if (m2418(i3)) {
                            arrayList2 = new ArrayList();
                            int i5 = 0;
                            C13856 c13856M45249 = null;
                            while (i5 < i3) {
                                try {
                                    int iMin = Math.min(33554432, i3 - i5);
                                    File file = this.f2157.f61947;
                                    if (file != null && file.isDirectory()) {
                                        C10938 c10938M27752 = C10938.m27752(file, bArr, i5, iMin, interfaceC7509M41888);
                                        arrayList2.add(c10938M27752);
                                        c13856M45249 = C19606.m45249(c13856M45249, C19606.m45220(c10938M27752));
                                        i5 += iMin;
                                    } else {
                                        throw new IOException("Hex literal spill directory is unavailable");
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    arrayList = arrayList2;
                                    if (arrayList != null) {
                                        C19143.m44349((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]), e);
                                    }
                                    this.f2157.f61949.m55981(c11684M55979);
                                    throw e;
                                } catch (Error e2) {
                                    e = e2;
                                    arrayList = arrayList2;
                                    if (arrayList != null) {
                                        C19143.m44349((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]), e);
                                    }
                                    this.f2157.f61949.m55981(c11684M55979);
                                    throw e;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                    arrayList = arrayList2;
                                    if (arrayList != null) {
                                        C19143.m44349((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]), e);
                                    }
                                    this.f2157.f61949.m55981(c11684M55979);
                                    throw e;
                                }
                            }
                            z = true;
                            arrayList = arrayList2;
                            j = 0;
                            c13856M55980 = c13856M45249;
                        } else {
                            j = 0;
                            arrayList = null;
                            c13856M55980 = this.f2157.f61949.m55980(i3, bArr);
                            z = false;
                        }
                        try {
                            C13856 c13856M45216 = C19606.m45216(this.f2167, i, i2, c13856M55980);
                            C13856 c13856M2407 = m2407(c13856M45216, i, this.f2157.f61949);
                            C13856 c13857 = c13856M55980;
                            boolean z7 = (i4 == 0 && c13856M2407 == c13856M45216) ? false : true;
                            boolean z8 = z | (((this.f2162 == j || i4 == 0) && c13856M2407 == c13856M45216) ? false : true);
                            z2 = z7;
                            c13856M14565 = c13856M2407;
                            c13856 = c13857;
                            zM14566 = false;
                            z3 = z8;
                        } catch (IOException | Error | RuntimeException e4) {
                            e = e4;
                            arrayList2 = arrayList;
                            arrayList = arrayList2;
                            if (arrayList != null) {
                                C19143.m44349((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]), e);
                            }
                            this.f2157.f61949.m55981(c11684M55979);
                            throw e;
                        }
                    }
                    try {
                        C17037 c17037M47487 = C20767.m47487(this.f2169, i, i2, i3);
                        m2416(c13856M14565, c17037M47487);
                        if (!z6) {
                            if (z2) {
                                c10655M45212 = C19606.m45237(c13856M14565);
                            } else {
                                c10655M45212 = C19606.m45212(this.f2167, c13856, i);
                            }
                            if (z2) {
                                jM27161 = c10655M45212.m27161();
                                jM27162 = c10655M45212.m27162();
                            } else {
                                j2 = j;
                                jM10044 = C3077.m10044(this.f2159, c10655M45212.m27161());
                                jM10045 = C3077.m10044(this.f2156, c10655M45212.m27162());
                            }
                            if (z3) {
                                jM27161 = jM10044;
                                jM45247 = C19606.m45247(c13856M14565);
                            } else {
                                jM27161 = jM10044;
                                jM45247 = this.f2162;
                            }
                            if (jM27161 <= X931RNG.BLOCK128_RESEED_MAX) {
                                throw new IllegalStateException("Literal heap storage exceeds memory limit");
                            }
                            if (!interfaceC7509M41888.mo924()) {
                                throw new C9446();
                            }
                            if (arrayList != null) {
                                m2417((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]));
                            }
                            this.f2167 = c13856M14565;
                            this.f2169 = c17037M47487;
                            this.f2159 = jM27161;
                            this.f2156 = jM10045;
                            this.f2162 = jM45247;
                            boolean z9 = this.f2158;
                            if (z6) {
                                z4 = zM14566;
                            } else if (i4 == 0) {
                                z4 = false;
                            } else {
                                if (this.f2172 != j2 && this.f2173 == j2 && jM45247 == j2) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (z5) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            this.f2158 = z9 | z4;
                            this.f2154.m54756(i, i4, i3, 1);
                            this.f2165 = true;
                        }
                        long j3 = this.f2159;
                        jM27162 = this.f2156;
                        jM27161 = j3;
                        long j4 = j;
                        jM10045 = jM27162;
                        j2 = j4;
                        if (z3) {
                            jM27161 = jM10044;
                            jM45247 = C19606.m45247(c13856M14565);
                        } else {
                            jM27161 = jM10044;
                            jM45247 = this.f2162;
                        }
                        if (jM27161 <= X931RNG.BLOCK128_RESEED_MAX) {
                            throw new IllegalStateException("Literal heap storage exceeds memory limit");
                        }
                        if (!interfaceC7509M41888.mo924()) {
                            throw new C9446();
                        }
                        if (arrayList != null) {
                            m2417((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]));
                        }
                        this.f2167 = c13856M14565;
                        this.f2169 = c17037M47487;
                        this.f2159 = jM27161;
                        this.f2156 = jM10045;
                        this.f2162 = jM45247;
                        boolean z10 = this.f2158;
                        if (z6) {
                            z4 = zM14566;
                        } else if (i4 == 0) {
                            z4 = false;
                        } else {
                            if (this.f2172 != j2) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        this.f2158 = z10 | z4;
                        this.f2154.m54756(i, i4, i3, 1);
                        this.f2165 = true;
                    } catch (IOException e5) {
                        e = e5;
                        if (arrayList != null) {
                            C19143.m44349((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]), e);
                        }
                        this.f2157.f61949.m55981(c11684M55979);
                        throw e;
                    } catch (Error e6) {
                        e = e6;
                        if (arrayList != null) {
                            C19143.m44349((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]), e);
                        }
                        this.f2157.f61949.m55981(c11684M55979);
                        throw e;
                    } catch (RuntimeException e7) {
                        e = e7;
                        if (arrayList != null) {
                            C19143.m44349((InterfaceC22808[]) arrayList.toArray(new InterfaceC22808[0]), e);
                        }
                        this.f2157.f61949.m55981(c11684M55979);
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e8) {
                    e = e8;
                    arrayList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2453(int i, int i2) {
        synchronized (this.f2157) {
            m2432();
            m2429();
            int i3 = i2 - i;
            m2410(i, i2, i3);
            if (i3 == 0) {
                return;
            }
            C11684 c11684M55979 = this.f2157.f61949.m55979();
            try {
                C13856 c13856M2407 = m2407(C19606.m45216(this.f2167, i, i2, C19606.m45220(new C17651((byte) 0, i3))), i, this.f2157.f61949);
                C17037 c17037M47487 = C20767.m47487(this.f2169, i, i2, i3);
                m2416(c13856M2407, c17037M47487);
                C10655 c10655M45237 = C19606.m45237(c13856M2407);
                this.f2167 = c13856M2407;
                this.f2169 = c17037M47487;
                this.f2159 = c10655M45237.m27161();
                this.f2156 = c10655M45237.m27162();
                this.f2158 |= (this.f2172 == 0 && this.f2173 == 0 && this.f2162 == 0) ? false : true;
                this.f2154.m54756(i, i3, i3, 1);
                this.f2165 = true;
            } catch (Error e) {
                e = e;
                this.f2157.f61949.m55981(c11684M55979);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                this.f2157.f61949.m55981(c11684M55979);
                throw e;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02aa */
    /* JADX WARN: Code duplicated, block: B:157:0x02ac A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TRY_ENTER, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02b2 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02ba A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02c0 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x02e1 A[Catch: all -> 0x013d, TRY_ENTER, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x02e6 A[Catch: all -> 0x013d, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x02f9 A[Catch: all -> 0x02fe, TryCatch #15 {, blocks: (B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:237:0x02f5, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0163 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0169 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0177 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0180 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0189 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0190 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0199 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x019e A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6 A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac A[Catch: all -> 0x013d, Error -> 0x02c8, RuntimeException -> 0x02ca, IOException -> 0x02cc, TryCatch #14 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02e1, B:188:0x02e6, B:189:0x02f2, B:190:0x02f4, B:195:0x02fd, B:198:0x0300, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x02a3, B:157:0x02ac, B:158:0x02b1, B:159:0x02b2, B:160:0x02b9, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02ba, B:162:0x02bf, B:163:0x02c0, B:164:0x02c7, B:70:0x0158, B:71:0x015c, B:191:0x02f5, B:193:0x02f9, B:194:0x02fc), top: B:236:0x00db, inners: #15 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2455(int r30, l.C7210 r31, l.C18266 r32) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0498.m2455(int, l.ۜܳܳ, l.ܿۤܳ):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2458(int i, int i2) {
        synchronized (this.f2157) {
            m2432();
            m2429();
            int i3 = 0;
            C16159 c16159 = new C16159(i, i2, true, false);
            C13856 c13856 = this.f2167;
            if (c13856 != null) {
                i3 = c13856.f43959;
            }
            C16159.m38334(c16159, i3);
            this.f2170 = c16159;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2457(InterfaceC7509 interfaceC7509) {
        InterfaceC7509 interfaceC7509M41888 = interfaceC7509 == null ? null : C17950.m41888(interfaceC7509);
        synchronized (this.f2157) {
            m2432();
            m2429();
            if (interfaceC7509M41888 != null && interfaceC7509M41888.mo924()) {
                m2409();
                return false;
            }
            InterfaceC22808[] interfaceC22808ArrM44324 = C19143.m44324(this.f2157, this, interfaceC7509M41888);
            if (interfaceC22808ArrM44324 == null) {
                return false;
            }
            C19143.m44314(interfaceC22808ArrM44324);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18397 m2452(int i, byte[] bArr) {
        C18397 c18397;
        synchronized (this.f2157) {
            m2432();
            m2429();
            if (!this.f2165) {
                C13856 c13856 = this.f2167;
                C21381 c21381 = this.f2168;
                if (c13856 == c21381.f68092 && this.f2169 == c21381.f68095) {
                    if (i <= 0) {
                        throw new IllegalArgumentException("Pattern must not be empty");
                    }
                    if (bArr.length > 67108864) {
                        throw new IllegalStateException("Replacement metadata exceeds memory limit");
                    }
                    if (!C19143.m44350(C3077.m10044(C3077.m10044(C19606.m45238(c13856), C3077.m10044(C19606.m45236(this.f2167), C3077.m10044(this.f2172, C3077.m10044(this.f2173, C20767.m47500(this.f2169))))), C3077.m10044(bArr.length, 16384L)))) {
                        throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                    }
                    this.f2173 = C19143.m44340(this.f2167);
                    this.f2172 = C19606.m45235(this.f2167);
                    c18397 = new C18397(this, i, (byte[]) bArr.clone());
                    this.f2166 = c18397;
                }
            }
            throw new IllegalStateException("Batch replacement requires a pristine transaction");
        }
        return c18397;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2157) {
            if (!this.f2161) {
                C19143.m44309(this.f2157, this);
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m2422(C0498 c0498) throws C12893 {
        if (C19143.m44316((Iterable) c0498.f2160.keySet())) {
            return;
        }
        c0498.m2409();
        throw new C12893();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static void m2421(C0498 c0498) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C19606.m45233(c0498.f2167, identityHashMap);
        IdentityHashMap identityHashMap2 = c0498.f2160;
        for (InterfaceC22808 interfaceC22808 : identityHashMap2.keySet()) {
            if (!identityHashMap.containsKey(interfaceC22808) || c0498.f2157.f61951.put(interfaceC22808, Boolean.TRUE) != null) {
                C19143.m44314(new InterfaceC22808[]{interfaceC22808});
            }
        }
        identityHashMap2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m2446(InterfaceC22808[] interfaceC22808Arr) {
        Set setKeySet = this.f2157.f61951.keySet();
        IdentityHashMap identityHashMap = this.f2160;
        Set setKeySet2 = identityHashMap.keySet();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayDeque.push((InterfaceC22808) it.next());
        }
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            arrayDeque.push((InterfaceC22808) it2.next());
        }
        for (InterfaceC22808 interfaceC22808 : interfaceC22808Arr) {
            arrayDeque.push(interfaceC22808);
        }
        while (!arrayDeque.isEmpty()) {
            InterfaceC22808 interfaceC22809 = (InterfaceC22808) arrayDeque.pop();
            Boolean bool = Boolean.TRUE;
            if (identityHashMap2.put(interfaceC22809, bool) == null) {
                if (interfaceC22809 instanceof C13111) {
                    identityHashMap3.put((C13111) interfaceC22809, bool);
                } else if (interfaceC22809 instanceof C6465) {
                    for (InterfaceC22808 interfaceC228010 : ((C6465) interfaceC22809).f21763) {
                        arrayDeque.push(interfaceC228010);
                    }
                }
            }
        }
        if (identityHashMap3.size() > 64) {
            throw new IllegalStateException("Too many external file sources");
        }
        for (InterfaceC22808 interfaceC228011 : interfaceC22808Arr) {
            if (identityHashMap.put(interfaceC228011, Boolean.TRUE) != null) {
                C19143.m44314(new InterfaceC22808[]{interfaceC228011});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m2417(InterfaceC22808[] interfaceC22808Arr) {
        int length = interfaceC22808Arr.length;
        int i = 0;
        while (true) {
            IdentityHashMap identityHashMap = this.f2160;
            if (i >= length) {
                for (InterfaceC22808 interfaceC22808 : interfaceC22808Arr) {
                    identityHashMap.put(interfaceC22808, Boolean.TRUE);
                }
                return;
            } else {
                InterfaceC22808 interfaceC22809 = interfaceC22808Arr[i];
                if (identityHashMap.containsKey(interfaceC22809) || this.f2157.f61951.containsKey(interfaceC22809)) {
                    throw new IllegalStateException("Created source is already owned");
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m2437(C0498 c0498) {
        IdentityHashMap identityHashMap = c0498.f2160;
        InterfaceC22808[] interfaceC22808Arr = (InterfaceC22808[]) identityHashMap.keySet().toArray(new InterfaceC22808[0]);
        identityHashMap.clear();
        C19143.m44314(interfaceC22808Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2412(C0498 c0498, InterfaceC7509 interfaceC7509) throws C9446 {
        if (interfaceC7509.mo924()) {
            c0498.m2409();
            throw new C9446();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13856 m2407(C13856 c13856, int i, C25111 c25111) {
        if (this.f2159 > 8323072) {
            return c13856;
        }
        if ((c13856 == null ? 0 : c13856.f43961) <= 256) {
            return c13856;
        }
        C7145 c7145M45230 = C19606.m45230(i, c13856);
        if (c7145M45230.m19711() == null) {
            return c13856;
        }
        C13856 c13856M19711 = c7145M45230.m19711();
        if ((c13856M19711 != null ? c13856M19711.f43961 : 0) <= 256) {
            return c13856;
        }
        int length = c7145M45230.length();
        byte[] bArr = new byte[length];
        C19606.m45224(c7145M45230.m19711(), bArr);
        return C19606.m45216(c13856, c7145M45230.m19710(), c7145M45230.m19710() + c7145M45230.length(), c25111.m55980(length, bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2410(int i, int i2, int i3) {
        int length = length();
        if (i < 0 || i2 < i || i2 > length) {
            StringBuilder sbM5126 = C1402.m5126("start=", i, ", end=", ", length=", i2);
            sbM5126.append(length);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if ((((long) length) - ((long) (i2 - i))) + ((long) i3) > 2147483647L) {
            throw new C12562();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m2432() {
        m2443();
        if (this.f2161 || this.f2157.f61956 != this || this.f2155 != this.f2157.f61958 || this.f2157.f61954 != this.f2168) {
            throw new IllegalStateException("Transaction is not active");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m2424() {
        if (this.f2163 != null) {
            throw new IllegalStateException("Range transfer is already active");
        }
        this.f2163 = Thread.currentThread();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m2443() {
        Thread thread;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z = false;
        while (!this.f2161 && (thread = this.f2163) != null && thread != threadCurrentThread) {
            try {
                this.f2157.wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            threadCurrentThread.interrupt();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m2429() {
        if (this.f2166 != null) {
            throw new IllegalStateException("A batch replacement is active");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m2409() {
        m2443();
        if (this.f2161 || this.f2157.f61956 != this) {
            return;
        }
        C18397 c18397 = this.f2166;
        if (c18397 != null) {
            c18397.f59923 = true;
            this.f2166 = null;
        }
        this.f2157.f61949.m55981(this.f2171);
        IdentityHashMap identityHashMap = this.f2160;
        InterfaceC22808[] interfaceC22808Arr = (InterfaceC22808[]) identityHashMap.keySet().toArray(new InterfaceC22808[0]);
        identityHashMap.clear();
        C19143.m44314(interfaceC22808Arr);
        this.f2157.f61956 = null;
        this.f2161 = true;
        this.f2157.notifyAll();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static void m2403(C0498 c0498) {
        c0498.m2416(c0498.f2167, c0498.f2169);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2416(C13856 c13856, C17037 c17037) {
        if (!C19143.m44350(C3077.m10044(C3077.m10044(C3077.m10044(C3077.m10044(C19606.m45236(c13856), this.f2172), C19606.m45238(c13856)), this.f2173), C20767.m47500(c17037)))) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m2418(int i) {
        if (i == 0) {
            return false;
        }
        if (i >= 0) {
            return C3077.m10044(this.f2159, C3077.m10044(((((long) i) + 65535) / 65536) * 65536, 65536L)) > X931RNG.BLOCK128_RESEED_MAX;
        }
        throw new IllegalArgumentException("Negative literal length");
    }
}
