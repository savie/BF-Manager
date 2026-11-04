package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1JH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17158 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int f55931 = 1000;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean f55932;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C2243[] f55941;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2243 f55942;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20888 f55943;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11937 f55945;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f55944 = false;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f55940 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f55934 = 32;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f55939 = 32;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f55946 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean[] f55936 = new boolean[32];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f55935 = 1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f55933 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f55938 = 32;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6718[] f55937 = new C6718[f55931];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f55947 = 0;

    public C17158() {
        this.f55941 = null;
        this.f55941 = new C2243[32];
        m40312();
        C11937 c11937 = new C11937();
        c11937.f38443 = new C16412();
        c11937.f38444 = new C16412();
        c11937.f38445 = new C6718[32];
        this.f55945 = c11937;
        this.f55943 = new C20888(c11937);
        this.f55942 = new C2243(c11937);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m40313() {
        int i = this.f55934 * 2;
        this.f55934 = i;
        this.f55941 = (C2243[]) Arrays.copyOf(this.f55941, i);
        C11937 c11937 = this.f55945;
        c11937.f38445 = (C6718[]) Arrays.copyOf(c11937.f38445, this.f55934);
        int i2 = this.f55934;
        this.f55936 = new boolean[i2];
        this.f55939 = i2;
        this.f55938 = i2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m40312() {
        for (int i = 0; i < this.f55933; i++) {
            C2243 c2243 = this.f55941[i];
            if (c2243 != null) {
                this.f55945.f38443.m38979(c2243);
            }
            this.f55941[i] = null;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m40327() {
        C11937 c11937;
        int i = 0;
        while (true) {
            c11937 = this.f55945;
            C6718[] c6718Arr = c11937.f38445;
            if (i >= c6718Arr.length) {
                break;
            }
            C6718 c6718 = c6718Arr[i];
            if (c6718 != null) {
                c6718.m18754();
            }
            i++;
        }
        c11937.f38444.m38978(this.f55947, this.f55937);
        this.f55947 = 0;
        Arrays.fill(c11937.f38445, (Object) null);
        this.f55940 = 0;
        this.f55943.m47730();
        this.f55935 = 1;
        for (int i2 = 0; i2 < this.f55933; i2++) {
            C2243 c2243 = this.f55941[i2];
        }
        m40312();
        this.f55933 = 0;
        this.f55942 = new C2243(c11937);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6718 m40319(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f55935 + 1 >= this.f55939) {
            m40313();
        }
        if (!(obj instanceof C0751)) {
            return null;
        }
        C0751 c0751 = (C0751) obj;
        C6718 c6718M3113 = c0751.m3113();
        if (c6718M3113 == null) {
            c0751.m3112();
            c6718M3113 = c0751.m3113();
        }
        int i = c6718M3113.f22354;
        C11937 c11937 = this.f55945;
        if (i != -1 && i <= this.f55940 && c11937.f38445[i] != null) {
            return c6718M3113;
        }
        if (i != -1) {
            c6718M3113.m18754();
        }
        int i2 = this.f55940 + 1;
        this.f55940 = i2;
        this.f55935++;
        c6718M3113.f22354 = i2;
        c6718M3113.f22344 = EnumC12683.UNRESTRICTED;
        c11937.f38445[i2] = c6718M3113;
        return c6718M3113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2243 m40317() {
        C11937 c11937 = this.f55945;
        C2243 c2243 = (C2243) c11937.f38443.m38977();
        if (c2243 != null) {
            c2243.f7340 = null;
            c2243.f7343.clear();
            c2243.f7339 = 0.0f;
            c2243.f7342 = false;
            return c2243;
        }
        return new C2243(c11937);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6718 m40328() {
        if (this.f55935 + 1 >= this.f55939) {
            m40313();
        }
        C6718 c6718M40310 = m40310(EnumC12683.SLACK);
        int i = this.f55940 + 1;
        this.f55940 = i;
        this.f55935++;
        c6718M40310.f22354 = i;
        this.f55945.f38445[i] = c6718M40310;
        return c6718M40310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6718 m40318(int i) {
        if (this.f55935 + 1 >= this.f55939) {
            m40313();
        }
        C6718 c6718M40310 = m40310(EnumC12683.ERROR);
        int i2 = this.f55940 + 1;
        this.f55940 = i2;
        this.f55935++;
        c6718M40310.f22354 = i2;
        c6718M40310.f22348 = i;
        this.f55945.f38445[i2] = c6718M40310;
        this.f55943.m47729(c6718M40310);
        return c6718M40310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6718 m40310(EnumC12683 enumC12683) {
        C6718 c6718 = (C6718) this.f55945.f38444.m38977();
        if (c6718 == null) {
            c6718 = new C6718(enumC12683);
        } else {
            c6718.m18754();
        }
        c6718.f22344 = enumC12683;
        int i = this.f55947;
        int i2 = f55931;
        if (i >= i2) {
            int i3 = i2 * 2;
            f55931 = i3;
            this.f55937 = (C6718[]) Arrays.copyOf(this.f55937, i3);
        }
        C6718[] c6718Arr = this.f55937;
        int i4 = this.f55947;
        this.f55947 = i4 + 1;
        c6718Arr[i4] = c6718;
        return c6718;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m40315(Object obj) {
        C6718 c6718M3113 = ((C0751) obj).m3113();
        if (c6718M3113 != null) {
            return (int) (c6718M3113.f22345 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40330() {
        C20888 c20888 = this.f55943;
        if (c20888.mo7658()) {
            m40314();
            return;
        }
        if (this.f55946) {
            for (int i = 0; i < this.f55933; i++) {
                if (!this.f55941[i].f7342) {
                    m40324(c20888);
                    return;
                }
            }
            m40314();
            return;
        }
        m40324(c20888);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x019c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40320(C2243 c2243) {
        boolean z;
        C6718 c6718M7650;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f55933 + 1 >= this.f55938 || this.f55935 + 1 >= this.f55939) {
            m40313();
        }
        if (c2243.f7342) {
            z4 = false;
        } else {
            ArrayList arrayList = c2243.f7341;
            if (this.f55941.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iMo17403 = c2243.f7343.mo17403();
                    for (int i = 0; i < iMo17403; i++) {
                        C6718 c6718Mo17397 = c2243.f7343.mo17397(i);
                        if (c6718Mo17397.f22353 != -1 || c6718Mo17397.f22350) {
                            arrayList.add(c6718Mo17397);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C6718 c6718 = (C6718) arrayList.get(i2);
                            if (c6718.f22350) {
                                c2243.m7657(this, c6718, true);
                            } else {
                                c2243.mo7656(this, this.f55941[c6718.f22353], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (c2243.f7340 != null && c2243.f7343.mo17403() == 0) {
                    c2243.f7342 = true;
                    this.f55944 = true;
                }
            }
            if (c2243.mo7658()) {
                return;
            }
            float f = c2243.f7339;
            if (f < 0.0f) {
                c2243.f7339 = f * (-1.0f);
                c2243.f7343.mo17398();
            }
            int iMo17404 = c2243.f7343.mo17403();
            float f2 = 0.0f;
            boolean z6 = false;
            float f3 = 0.0f;
            boolean z7 = false;
            C6718 c6719 = null;
            C6718 c67110 = null;
            for (int i3 = 0; i3 < iMo17404; i3++) {
                float fMo17402 = c2243.f7343.mo17402(i3);
                C6718 c6718Mo17398 = c2243.f7343.mo17397(i3);
                if (c6718Mo17398.f22344 == EnumC12683.UNRESTRICTED) {
                    if (c6719 == null) {
                        if (c6718Mo17398.f22351 <= 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z6 = z3;
                        f2 = fMo17402;
                        c6719 = c6718Mo17398;
                    } else if (f2 > fMo17402) {
                        if (c6718Mo17398.f22351 <= 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z6 = z3;
                        f2 = fMo17402;
                        c6719 = c6718Mo17398;
                    } else if (!z6 && c6718Mo17398.f22351 <= 1) {
                        f2 = fMo17402;
                        c6719 = c6718Mo17398;
                        z6 = true;
                    }
                } else if (c6719 == null && fMo17402 < 0.0f) {
                    if (c67110 == null) {
                        if (c6718Mo17398.f22351 <= 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z7 = z2;
                        f3 = fMo17402;
                        c67110 = c6718Mo17398;
                    } else if (f3 > fMo17402) {
                        if (c6718Mo17398.f22351 <= 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z7 = z2;
                        f3 = fMo17402;
                        c67110 = c6718Mo17398;
                    } else if (!z7 && c6718Mo17398.f22351 <= 1) {
                        f3 = fMo17402;
                        c67110 = c6718Mo17398;
                        z7 = true;
                    }
                }
            }
            if (c6719 == null) {
                c6719 = c67110;
            }
            if (c6719 == null) {
                z = true;
            } else {
                c2243.m7659(c6719);
                z = false;
            }
            if (c2243.f7343.mo17403() == 0) {
                c2243.f7342 = true;
            }
            if (z) {
                if (this.f55935 + 1 >= this.f55939) {
                    m40313();
                }
                C6718 c6718M40310 = m40310(EnumC12683.SLACK);
                int i4 = this.f55940 + 1;
                this.f55940 = i4;
                this.f55935++;
                c6718M40310.f22354 = i4;
                C11937 c11937 = this.f55945;
                c11937.f38445[i4] = c6718M40310;
                c2243.f7340 = c6718M40310;
                int i5 = this.f55933;
                m40316(c2243);
                if (this.f55933 == i5 + 1) {
                    C2243 c2244 = this.f55942;
                    c2244.f7340 = null;
                    c2244.f7343.clear();
                    for (int i6 = 0; i6 < c2243.f7343.mo17403(); i6++) {
                        c2244.f7343.mo17401(c2243.f7343.mo17397(i6), c2243.f7343.mo17402(i6), true);
                    }
                    m40311((InterfaceC25364) this.f55942);
                    if (c6718M40310.f22353 == -1) {
                        if (c2243.f7340 == c6718M40310 && (c6718M7650 = c2243.m7650(c6718M40310)) != null) {
                            c2243.m7659(c6718M7650);
                        }
                        if (!c2243.f7342) {
                            c2243.f7340.m18757(this, c2243);
                        }
                        c11937.f38443.m38979(c2243);
                        this.f55933--;
                    }
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            C6718 c67111 = c2243.f7340;
            if (c67111 == null) {
                return;
            }
            if (c67111.f22344 != EnumC12683.UNRESTRICTED && c2243.f7339 < 0.0f) {
                return;
            }
        }
        if (z4) {
            return;
        }
        m40316(c2243);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m40316(C2243 c2243) {
        int i;
        if (c2243.f7342) {
            c2243.f7340.m18756(this, c2243.f7339);
        } else {
            C2243[] c2243Arr = this.f55941;
            int i2 = this.f55933;
            c2243Arr[i2] = c2243;
            C6718 c6718 = c2243.f7340;
            c6718.f22353 = i2;
            this.f55933 = i2 + 1;
            c6718.m18757(this, c2243);
        }
        if (this.f55944) {
            int i3 = 0;
            while (i3 < this.f55933) {
                if (this.f55941[i3] == null) {
                    System.out.println("WTF");
                }
                C2243 c2244 = this.f55941[i3];
                if (c2244 != null && c2244.f7342) {
                    c2244.f7340.m18756(this, c2244.f7339);
                    this.f55945.f38443.m38979(c2244);
                    this.f55941[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f55933;
                        if (i4 >= i) {
                            break;
                        }
                        C2243[] c2243Arr2 = this.f55941;
                        int i6 = i4 - 1;
                        C2243 c2245 = c2243Arr2[i4];
                        c2243Arr2[i6] = c2245;
                        C6718 c6719 = c2245.f7340;
                        if (c6719.f22353 == i4) {
                            c6719.f22353 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f55941[i5] = null;
                    }
                    this.f55933 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f55944 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m40311(InterfaceC25364 interfaceC25364) {
        for (int i = 0; i < this.f55935; i++) {
            this.f55936[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f55935 * 2) {
                return;
            }
            C6718 c6718 = ((C2243) interfaceC25364).f7340;
            if (c6718 != null) {
                this.f55936[c6718.f22354] = true;
            }
            C6718 c6718Mo7651 = interfaceC25364.mo7651(this.f55936);
            if (c6718Mo7651 != null) {
                boolean[] zArr = this.f55936;
                int i3 = c6718Mo7651.f22354;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (c6718Mo7651 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f55933; i5++) {
                    C2243 c2243 = this.f55941[i5];
                    if (c2243.f7340.f22344 != EnumC12683.UNRESTRICTED && !c2243.f7342 && c2243.f7343.mo17404(c6718Mo7651)) {
                        float fMo17395 = c2243.f7343.mo17395(c6718Mo7651);
                        if (fMo17395 < 0.0f) {
                            float f2 = (-c2243.f7339) / fMo17395;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C2243 c2244 = this.f55941[i4];
                    c2244.f7340.f22353 = -1;
                    c2244.m7659(c6718Mo7651);
                    C6718 c6719 = c2244.f7340;
                    c6719.f22353 = i4;
                    c6719.m18757(this, c2244);
                }
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40324(C20888 c20888) {
        for (int i = 0; i < this.f55933; i++) {
            C2243 c2243 = this.f55941[i];
            if (c2243.f7340.f22344 != EnumC12683.UNRESTRICTED) {
                float f = 0.0f;
                if (c2243.f7339 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.f55933) {
                            C2243 c2244 = this.f55941[i3];
                            if (c2244.f7340.f22344 != EnumC12683.UNRESTRICTED && !c2244.f7342 && c2244.f7339 < f) {
                                int iMo17403 = c2244.f7343.mo17403();
                                int i7 = 0;
                                while (i7 < iMo17403) {
                                    C6718 c6718Mo17397 = c2244.f7343.mo17397(i7);
                                    float fMo17395 = c2244.f7343.mo17395(c6718Mo17397);
                                    if (fMo17395 > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = c6718Mo17397.f22355[i8] / fMo17395;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = c6718Mo17397.f22354;
                                                i4 = i3;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            C2243 c2245 = this.f55941[i4];
                            c2245.f7340.f22353 = -1;
                            c2245.m7659(this.f55945.f38445[i5]);
                            C6718 c6718 = c2245.f7340;
                            c6718.f22353 = i4;
                            c6718.m18757(this, c2245);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f55935 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        m40311((InterfaceC25364) c20888);
        m40314();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m40314() {
        for (int i = 0; i < this.f55933; i++) {
            C2243 c2243 = this.f55941[i];
            c2243.f7340.f22345 = c2243.f7339;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11937 m40325() {
        return this.f55945;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40329(C6718 c6718, C6718 c6719, int i, int i2) {
        C2243 c2243M40317 = m40317();
        C6718 c6718M40328 = m40328();
        c6718M40328.f22348 = 0;
        c2243M40317.m7653(c6718, c6719, c6718M40328, i);
        if (i2 != 8) {
            c2243M40317.f7343.mo17400(m40318(i2), (int) (c2243M40317.f7343.mo17395(c6718M40328) * (-1.0f)));
        }
        m40320(c2243M40317);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40326(C6718 c6718, C6718 c6719, int i, int i2) {
        C2243 c2243M40317 = m40317();
        C6718 c6718M40328 = m40328();
        c6718M40328.f22348 = 0;
        c2243M40317.m7660(c6718, c6719, c6718M40328, i);
        if (i2 != 8) {
            c2243M40317.f7343.mo17400(m40318(i2), (int) (c2243M40317.f7343.mo17395(c6718M40328) * (-1.0f)));
        }
        m40320(c2243M40317);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40322(C6718 c6718, C6718 c6719, int i, float f, C6718 c67110, C6718 c67111, int i2, int i3) {
        C2243 c2243M40317 = m40317();
        if (c6719 == c67110) {
            c2243M40317.f7343.mo17400(c6718, 1.0f);
            c2243M40317.f7343.mo17400(c67111, 1.0f);
            c2243M40317.f7343.mo17400(c6719, -2.0f);
        } else if (f == 0.5f) {
            c2243M40317.f7343.mo17400(c6718, 1.0f);
            c2243M40317.f7343.mo17400(c6719, -1.0f);
            c2243M40317.f7343.mo17400(c67110, -1.0f);
            c2243M40317.f7343.mo17400(c67111, 1.0f);
            if (i > 0 || i2 > 0) {
                c2243M40317.f7339 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c2243M40317.f7343.mo17400(c6718, -1.0f);
            c2243M40317.f7343.mo17400(c6719, 1.0f);
            c2243M40317.f7339 = i;
        } else if (f >= 1.0f) {
            c2243M40317.f7343.mo17400(c67111, -1.0f);
            c2243M40317.f7343.mo17400(c67110, 1.0f);
            c2243M40317.f7339 = -i2;
        } else {
            float f2 = 1.0f - f;
            c2243M40317.f7343.mo17400(c6718, f2 * 1.0f);
            c2243M40317.f7343.mo17400(c6719, f2 * (-1.0f));
            c2243M40317.f7343.mo17400(c67110, (-1.0f) * f);
            c2243M40317.f7343.mo17400(c67111, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c2243M40317.f7339 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c2243M40317.m7655(this, i3);
        }
        m40320(c2243M40317);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40323(C6718 c6718, C6718 c6719, int i, int i2) {
        if (i2 == 8 && c6719.f22350 && c6718.f22353 == -1) {
            c6718.m18756(this, c6719.f22345 + i);
            return;
        }
        C2243 c2243M40317 = m40317();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c2243M40317.f7339 = i;
        }
        if (!z) {
            c2243M40317.f7343.mo17400(c6718, -1.0f);
            c2243M40317.f7343.mo17400(c6719, 1.0f);
        } else {
            c2243M40317.f7343.mo17400(c6718, 1.0f);
            c2243M40317.f7343.mo17400(c6719, -1.0f);
        }
        if (i2 != 8) {
            c2243M40317.m7655(this, i2);
        }
        m40320(c2243M40317);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40321(C6718 c6718, int i) {
        int i2 = c6718.f22353;
        if (i2 == -1) {
            c6718.m18756(this, i);
            for (int i3 = 0; i3 < this.f55940 + 1; i3++) {
                C6718 c6719 = this.f55945.f38445[i3];
            }
            return;
        }
        if (i2 != -1) {
            C2243 c2243 = this.f55941[i2];
            if (c2243.f7342) {
                c2243.f7339 = i;
                return;
            }
            if (c2243.f7343.mo17403() == 0) {
                c2243.f7342 = true;
                c2243.f7339 = i;
                return;
            }
            C2243 c2243M40317 = m40317();
            if (i < 0) {
                c2243M40317.f7339 = i * (-1);
                c2243M40317.f7343.mo17400(c6718, 1.0f);
            } else {
                c2243M40317.f7339 = i;
                c2243M40317.f7343.mo17400(c6718, -1.0f);
            }
            m40320(c2243M40317);
            return;
        }
        C2243 c2243M40318 = m40317();
        c2243M40318.f7340 = c6718;
        float f = i;
        c6718.f22345 = f;
        c2243M40318.f7339 = f;
        c2243M40318.f7342 = true;
        m40320(c2243M40318);
    }
}
