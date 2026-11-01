package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: P1JH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5196 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int f18012 = 1000;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean f18013;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11547 f18015;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6607 f18018;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C13664[] f18023;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13664 f18026;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f18022 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f18024 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18017 = 32;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18027 = 32;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f18025 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean[] f18020 = new boolean[32];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f18021 = 1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f18016 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f18014 = 32;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15075[] f18019 = new C15075[f18012];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f18028 = 0;

    public C5196() {
        this.f18023 = null;
        this.f18023 = new C13664[32];
        m14357();
        C11547 c11547 = new C11547();
        c11547.f38834 = new C0962();
        c11547.f38835 = new C0962();
        c11547.f38836 = new C15075[32];
        this.f18015 = c11547;
        this.f18018 = new C6607(c11547);
        this.f18026 = new C13664(c11547);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m14354() {
        int i = this.f18017 * 2;
        this.f18017 = i;
        this.f18023 = (C13664[]) Arrays.copyOf(this.f18023, i);
        C11547 c11547 = this.f18015;
        c11547.f38836 = (C15075[]) Arrays.copyOf(c11547.f38836, this.f18017);
        int i2 = this.f18017;
        this.f18020 = new boolean[i2];
        this.f18027 = i2;
        this.f18014 = i2;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m14357() {
        for (int i = 0; i < this.f18016; i++) {
            C13664 c13664 = this.f18023[i];
            if (c13664 != null) {
                this.f18015.f38834.m3756(c13664);
            }
            this.f18023[i] = null;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14370() {
        C11547 c11547;
        int i = 0;
        while (true) {
            c11547 = this.f18015;
            C15075[] c15075Arr = c11547.f38836;
            if (i >= c15075Arr.length) {
                break;
            }
            C15075 c15075 = c15075Arr[i];
            if (c15075 != null) {
                c15075.m36151();
            }
            i++;
        }
        c11547.f38835.m3755(this.f18028, this.f18019);
        this.f18028 = 0;
        Arrays.fill(c11547.f38836, (Object) null);
        this.f18024 = 0;
        this.f18018.m17941();
        this.f18021 = 1;
        for (int i2 = 0; i2 < this.f18016; i2++) {
            C13664 c13664 = this.f18023[i2];
        }
        m14357();
        this.f18016 = 0;
        this.f18026 = new C13664(c11547);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15075 m14364(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f18021 + 1 >= this.f18027) {
            m14354();
        }
        if (!(obj instanceof C8725)) {
            return null;
        }
        C8725 c8725 = (C8725) obj;
        C15075 c15075M22575 = c8725.m22575();
        if (c15075M22575 == null) {
            c8725.m22580();
            c15075M22575 = c8725.m22575();
        }
        int i = c15075M22575.f49146;
        C11547 c11547 = this.f18015;
        if (i != -1 && i <= this.f18024 && c11547.f38836[i] != null) {
            return c15075M22575;
        }
        if (i != -1) {
            c15075M22575.m36151();
        }
        int i2 = this.f18024 + 1;
        this.f18024 = i2;
        this.f18021++;
        c15075M22575.f49146 = i2;
        c15075M22575.f49147 = EnumC22836.UNRESTRICTED;
        c11547.f38836[i2] = c15075M22575;
        return c15075M22575;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13664 m14362() {
        C11547 c11547 = this.f18015;
        C13664 c13664 = (C13664) c11547.f38834.m3754();
        if (c13664 != null) {
            c13664.f45058 = null;
            c13664.f45055.clear();
            c13664.f45056 = 0.0f;
            c13664.f45059 = false;
            return c13664;
        }
        return new C13664(c11547);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15075 m14373() {
        if (this.f18021 + 1 >= this.f18027) {
            m14354();
        }
        C15075 c15075M14355 = m14355(EnumC22836.SLACK);
        int i = this.f18024 + 1;
        this.f18024 = i;
        this.f18021++;
        c15075M14355.f49146 = i;
        this.f18015.f38836[i] = c15075M14355;
        return c15075M14355;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15075 m14363(int i) {
        if (this.f18021 + 1 >= this.f18027) {
            m14354();
        }
        C15075 c15075M14355 = m14355(EnumC22836.ERROR);
        int i2 = this.f18024 + 1;
        this.f18024 = i2;
        this.f18021++;
        c15075M14355.f49146 = i2;
        c15075M14355.f49150 = i;
        this.f18015.f38836[i2] = c15075M14355;
        this.f18018.m17940(c15075M14355);
        return c15075M14355;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15075 m14355(EnumC22836 enumC22836) {
        C15075 c15075 = (C15075) this.f18015.f38835.m3754();
        if (c15075 == null) {
            c15075 = new C15075(enumC22836);
        } else {
            c15075.m36151();
        }
        c15075.f49147 = enumC22836;
        int i = this.f18028;
        int i2 = f18012;
        if (i >= i2) {
            int i3 = i2 * 2;
            f18012 = i3;
            this.f18019 = (C15075[]) Arrays.copyOf(this.f18019, i3);
        }
        C15075[] c15075Arr = this.f18019;
        int i4 = this.f18028;
        this.f18028 = i4 + 1;
        c15075Arr[i4] = c15075;
        return c15075;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m14358(Object obj) {
        C15075 c15075M22575 = ((C8725) obj).m22575();
        if (c15075M22575 != null) {
            return (int) (c15075M22575.f49148 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m14361() {
        C6607 c6607 = this.f18018;
        if (c6607.mo17939()) {
            m14360();
            return;
        }
        if (this.f18025) {
            for (int i = 0; i < this.f18016; i++) {
                if (!this.f18023[i].f45059) {
                    m14365(c6607);
                    return;
                }
            }
            m14360();
            return;
        }
        m14365(c6607);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x019c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14366(C13664 c13664) {
        boolean z;
        C15075 c15075M33369;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f18016 + 1 >= this.f18014 || this.f18021 + 1 >= this.f18027) {
            m14354();
        }
        if (c13664.f45059) {
            z4 = false;
        } else {
            ArrayList arrayList = c13664.f45057;
            if (this.f18023.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iMo9562 = c13664.f45055.mo9562();
                    for (int i = 0; i < iMo9562; i++) {
                        C15075 c15075Mo9556 = c13664.f45055.mo9556(i);
                        if (c15075Mo9556.f49153 != -1 || c15075Mo9556.f49155) {
                            arrayList.add(c15075Mo9556);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C15075 c15075 = (C15075) arrayList.get(i2);
                            if (c15075.f49155) {
                                c13664.m33372(this, c15075, true);
                            } else {
                                c13664.mo17938(this, this.f18023[c15075.f49153], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (c13664.f45058 != null && c13664.f45055.mo9562() == 0) {
                    c13664.f45059 = true;
                    this.f18022 = true;
                }
            }
            if (c13664.mo17939()) {
                return;
            }
            float f = c13664.f45056;
            if (f < 0.0f) {
                c13664.f45056 = f * (-1.0f);
                c13664.f45055.mo9557();
            }
            int iMo9563 = c13664.f45055.mo9562();
            float f2 = 0.0f;
            boolean z6 = false;
            float f3 = 0.0f;
            boolean z7 = false;
            C15075 c15076 = null;
            C15075 c15077 = null;
            for (int i3 = 0; i3 < iMo9563; i3++) {
                float fMo9561 = c13664.f45055.mo9561(i3);
                C15075 c15075Mo9557 = c13664.f45055.mo9556(i3);
                if (c15075Mo9557.f49147 == EnumC22836.UNRESTRICTED) {
                    if (c15076 == null) {
                        if (c15075Mo9557.f49154 <= 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z6 = z3;
                        f2 = fMo9561;
                        c15076 = c15075Mo9557;
                    } else if (f2 > fMo9561) {
                        if (c15075Mo9557.f49154 <= 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z6 = z3;
                        f2 = fMo9561;
                        c15076 = c15075Mo9557;
                    } else if (!z6 && c15075Mo9557.f49154 <= 1) {
                        f2 = fMo9561;
                        c15076 = c15075Mo9557;
                        z6 = true;
                    }
                } else if (c15076 == null && fMo9561 < 0.0f) {
                    if (c15077 == null) {
                        if (c15075Mo9557.f49154 <= 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z7 = z2;
                        f3 = fMo9561;
                        c15077 = c15075Mo9557;
                    } else if (f3 > fMo9561) {
                        if (c15075Mo9557.f49154 <= 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z7 = z2;
                        f3 = fMo9561;
                        c15077 = c15075Mo9557;
                    } else if (!z7 && c15075Mo9557.f49154 <= 1) {
                        f3 = fMo9561;
                        c15077 = c15075Mo9557;
                        z7 = true;
                    }
                }
            }
            if (c15076 == null) {
                c15076 = c15077;
            }
            if (c15076 == null) {
                z = true;
            } else {
                c13664.m33375(c15076);
                z = false;
            }
            if (c13664.f45055.mo9562() == 0) {
                c13664.f45059 = true;
            }
            if (z) {
                if (this.f18021 + 1 >= this.f18027) {
                    m14354();
                }
                C15075 c15075M14355 = m14355(EnumC22836.SLACK);
                int i4 = this.f18024 + 1;
                this.f18024 = i4;
                this.f18021++;
                c15075M14355.f49146 = i4;
                C11547 c11547 = this.f18015;
                c11547.f38836[i4] = c15075M14355;
                c13664.f45058 = c15075M14355;
                int i5 = this.f18016;
                m14359(c13664);
                if (this.f18016 == i5 + 1) {
                    C13664 c13665 = this.f18026;
                    c13665.f45058 = null;
                    c13665.f45055.clear();
                    for (int i6 = 0; i6 < c13664.f45055.mo9562(); i6++) {
                        c13665.f45055.mo9560(c13664.f45055.mo9556(i6), c13664.f45055.mo9561(i6), true);
                    }
                    m14356((InterfaceC2373) this.f18026);
                    if (c15075M14355.f49153 == -1) {
                        if (c13664.f45058 == c15075M14355 && (c15075M33369 = c13664.m33369(c15075M14355)) != null) {
                            c13664.m33375(c15075M33369);
                        }
                        if (!c13664.f45059) {
                            c13664.f45058.m36153(this, c13664);
                        }
                        c11547.f38834.m3756(c13664);
                        this.f18016--;
                    }
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            C15075 c15078 = c13664.f45058;
            if (c15078 == null) {
                return;
            }
            if (c15078.f49147 != EnumC22836.UNRESTRICTED && c13664.f45056 < 0.0f) {
                return;
            }
        }
        if (z4) {
            return;
        }
        m14359(c13664);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m14359(C13664 c13664) {
        int i;
        if (c13664.f45059) {
            c13664.f45058.m36152(this, c13664.f45056);
        } else {
            C13664[] c13664Arr = this.f18023;
            int i2 = this.f18016;
            c13664Arr[i2] = c13664;
            C15075 c15075 = c13664.f45058;
            c15075.f49153 = i2;
            this.f18016 = i2 + 1;
            c15075.m36153(this, c13664);
        }
        if (this.f18022) {
            int i3 = 0;
            while (i3 < this.f18016) {
                if (this.f18023[i3] == null) {
                    System.out.println("WTF");
                }
                C13664 c13665 = this.f18023[i3];
                if (c13665 != null && c13665.f45059) {
                    c13665.f45058.m36152(this, c13665.f45056);
                    this.f18015.f38834.m3756(c13665);
                    this.f18023[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f18016;
                        if (i4 >= i) {
                            break;
                        }
                        C13664[] c13664Arr2 = this.f18023;
                        int i6 = i4 - 1;
                        C13664 c13666 = c13664Arr2[i4];
                        c13664Arr2[i6] = c13666;
                        C15075 c15076 = c13666.f45058;
                        if (c15076.f49153 == i4) {
                            c15076.f49153 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f18023[i5] = null;
                    }
                    this.f18016 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f18022 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m14356(InterfaceC2373 interfaceC2373) {
        for (int i = 0; i < this.f18021; i++) {
            this.f18020[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f18021 * 2) {
                return;
            }
            C15075 c15075 = ((C13664) interfaceC2373).f45058;
            if (c15075 != null) {
                this.f18020[c15075.f49146] = true;
            }
            C15075 c15075Mo7224 = interfaceC2373.mo7224(this.f18020);
            if (c15075Mo7224 != null) {
                boolean[] zArr = this.f18020;
                int i3 = c15075Mo7224.f49146;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (c15075Mo7224 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f18016; i5++) {
                    C13664 c13664 = this.f18023[i5];
                    if (c13664.f45058.f49147 != EnumC22836.UNRESTRICTED && !c13664.f45059 && c13664.f45055.mo9563(c15075Mo7224)) {
                        float fMo9554 = c13664.f45055.mo9554(c15075Mo7224);
                        if (fMo9554 < 0.0f) {
                            float f2 = (-c13664.f45056) / fMo9554;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C13664 c13665 = this.f18023[i4];
                    c13665.f45058.f49153 = -1;
                    c13665.m33375(c15075Mo7224);
                    C15075 c15076 = c13665.f45058;
                    c15076.f49153 = i4;
                    c15076.m36153(this, c13665);
                }
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14365(C6607 c6607) {
        for (int i = 0; i < this.f18016; i++) {
            C13664 c13664 = this.f18023[i];
            if (c13664.f45058.f49147 != EnumC22836.UNRESTRICTED) {
                float f = 0.0f;
                if (c13664.f45056 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.f18016) {
                            C13664 c13665 = this.f18023[i3];
                            if (c13665.f45058.f49147 != EnumC22836.UNRESTRICTED && !c13665.f45059 && c13665.f45056 < f) {
                                int iMo9562 = c13665.f45055.mo9562();
                                int i7 = 0;
                                while (i7 < iMo9562) {
                                    C15075 c15075Mo9556 = c13665.f45055.mo9556(i7);
                                    float fMo9554 = c13665.f45055.mo9554(c15075Mo9556);
                                    if (fMo9554 > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = c15075Mo9556.f49156[i8] / fMo9554;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = c15075Mo9556.f49146;
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
                            C13664 c13666 = this.f18023[i4];
                            c13666.f45058.f49153 = -1;
                            c13666.m33375(this.f18015.f38836[i5]);
                            C15075 c15075 = c13666.f45058;
                            c15075.f49153 = i4;
                            c15075.m36153(this, c13666);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f18021 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        m14356((InterfaceC2373) c6607);
        m14360();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m14360() {
        for (int i = 0; i < this.f18016; i++) {
            C13664 c13664 = this.f18023[i];
            c13664.f45058.f49148 = c13664.f45056;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11547 m14371() {
        return this.f18015;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14374(C15075 c15075, C15075 c15076, int i, int i2) {
        C13664 c13664M14362 = m14362();
        C15075 c15075M14373 = m14373();
        c15075M14373.f49150 = 0;
        c13664M14362.m33373(c15075, c15076, c15075M14373, i);
        if (i2 != 8) {
            c13664M14362.f45055.mo9559(m14363(i2), (int) (c13664M14362.f45055.mo9554(c15075M14373) * (-1.0f)));
        }
        m14366(c13664M14362);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14372(C15075 c15075, C15075 c15076, int i, int i2) {
        C13664 c13664M14362 = m14362();
        C15075 c15075M14373 = m14373();
        c15075M14373.f49150 = 0;
        c13664M14362.m33376(c15075, c15076, c15075M14373, i);
        if (i2 != 8) {
            c13664M14362.f45055.mo9559(m14363(i2), (int) (c13664M14362.f45055.mo9554(c15075M14373) * (-1.0f)));
        }
        m14366(c13664M14362);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14368(C15075 c15075, C15075 c15076, int i, float f, C15075 c15077, C15075 c15078, int i2, int i3) {
        C13664 c13664M14362 = m14362();
        if (c15076 == c15077) {
            c13664M14362.f45055.mo9559(c15075, 1.0f);
            c13664M14362.f45055.mo9559(c15078, 1.0f);
            c13664M14362.f45055.mo9559(c15076, -2.0f);
        } else if (f == 0.5f) {
            c13664M14362.f45055.mo9559(c15075, 1.0f);
            c13664M14362.f45055.mo9559(c15076, -1.0f);
            c13664M14362.f45055.mo9559(c15077, -1.0f);
            c13664M14362.f45055.mo9559(c15078, 1.0f);
            if (i > 0 || i2 > 0) {
                c13664M14362.f45056 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c13664M14362.f45055.mo9559(c15075, -1.0f);
            c13664M14362.f45055.mo9559(c15076, 1.0f);
            c13664M14362.f45056 = i;
        } else if (f >= 1.0f) {
            c13664M14362.f45055.mo9559(c15078, -1.0f);
            c13664M14362.f45055.mo9559(c15077, 1.0f);
            c13664M14362.f45056 = -i2;
        } else {
            float f2 = 1.0f - f;
            c13664M14362.f45055.mo9559(c15075, f2 * 1.0f);
            c13664M14362.f45055.mo9559(c15076, f2 * (-1.0f));
            c13664M14362.f45055.mo9559(c15077, (-1.0f) * f);
            c13664M14362.f45055.mo9559(c15078, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c13664M14362.f45056 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c13664M14362.m33371(this, i3);
        }
        m14366(c13664M14362);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14369(C15075 c15075, C15075 c15076, int i, int i2) {
        if (i2 == 8 && c15076.f49155 && c15075.f49153 == -1) {
            c15075.m36152(this, c15076.f49148 + i);
            return;
        }
        C13664 c13664M14362 = m14362();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c13664M14362.f45056 = i;
        }
        if (!z) {
            c13664M14362.f45055.mo9559(c15075, -1.0f);
            c13664M14362.f45055.mo9559(c15076, 1.0f);
        } else {
            c13664M14362.f45055.mo9559(c15075, 1.0f);
            c13664M14362.f45055.mo9559(c15076, -1.0f);
        }
        if (i2 != 8) {
            c13664M14362.m33371(this, i2);
        }
        m14366(c13664M14362);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14367(C15075 c15075, int i) {
        int i2 = c15075.f49153;
        if (i2 == -1) {
            c15075.m36152(this, i);
            for (int i3 = 0; i3 < this.f18024 + 1; i3++) {
                C15075 c15076 = this.f18015.f38836[i3];
            }
            return;
        }
        if (i2 != -1) {
            C13664 c13664 = this.f18023[i2];
            if (c13664.f45059) {
                c13664.f45056 = i;
                return;
            }
            if (c13664.f45055.mo9562() == 0) {
                c13664.f45059 = true;
                c13664.f45056 = i;
                return;
            }
            C13664 c13664M14362 = m14362();
            if (i < 0) {
                c13664M14362.f45056 = i * (-1);
                c13664M14362.f45055.mo9559(c15075, 1.0f);
            } else {
                c13664M14362.f45056 = i;
                c13664M14362.f45055.mo9559(c15075, -1.0f);
            }
            m14366(c13664M14362);
            return;
        }
        C13664 c13664M14363 = m14362();
        c13664M14363.f45058 = c15075;
        float f = i;
        c15075.f49148 = f;
        c13664M14363.f45056 = f;
        c13664M14363.f45059 = true;
        m14366(c13664M14363);
    }
}
