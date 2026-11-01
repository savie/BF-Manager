package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C2991 extends AbstractC20673 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10194 f11219;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient boolean f11220;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4733 f11222;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f11223;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C7225 f11225;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C7225 f11226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f11227 = new boolean[64];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient C7225[] f11221 = new C7225[64];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient C7225 f11228 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f11224 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void mo8947() {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7225 m8948(int i) {
        C7225 c7225M19226 = this.f11228;
        while (c7225M19226 != null) {
            int iCompare = Integer.compare(i, c7225M19226.f29881);
            if (iCompare == 0) {
                break;
            }
            c7225M19226 = iCompare < 0 ? c7225M19226.m19226() : c7225M19226.m19236();
        }
        return c7225M19226;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7225 m8946(int i) {
        C7225 c7225M19226 = this.f11228;
        C7225 c7225 = c7225M19226;
        int iCompare = 0;
        while (c7225M19226 != null) {
            iCompare = Integer.compare(i, c7225M19226.f29881);
            if (iCompare == 0) {
                break;
            }
            c7225 = c7225M19226;
            c7225M19226 = iCompare < 0 ? c7225M19226.m19226() : c7225M19226.m19236();
        }
        return iCompare == 0 ? c7225M19226 : c7225;
    }

    @Override // l.AbstractC19262, l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo8944(int i, Object obj) {
        int i2;
        C7225 c7225;
        C7225 c7226;
        C7225 c7227;
        int i3 = 0;
        this.f11220 = false;
        C7225 c7228 = this.f11228;
        if (c7228 == null) {
            this.f11224++;
            c7228 = new C7225(i, null);
            this.f11225 = c7228;
            this.f11226 = c7228;
            this.f11228 = c7228;
        } else {
            int i4 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c7228.f29881);
                if (iCompare == 0) {
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            break;
                        }
                        this.f11221[i5] = null;
                        i4 = i5;
                    }
                } else {
                    this.f11221[i4] = c7228;
                    boolean[] zArr = this.f11227;
                    i2 = i4 + 1;
                    boolean z = iCompare > 0;
                    zArr[i4] = z;
                    if (z) {
                        if (c7228.m19230()) {
                            this.f11224++;
                            c7225 = new C7225(i, null);
                            C7225 c7229 = c7228.f24056;
                            if (c7229 == null) {
                                this.f11226 = c7225;
                            }
                            c7225.f24057 = c7228;
                            c7225.f24056 = c7229;
                            c7228.m19235(c7225);
                            break;
                        }
                        c7228 = c7228.f24056;
                        i4 = i2;
                    } else {
                        if (c7228.m19234()) {
                            this.f11224++;
                            c7225 = new C7225(i, null);
                            C7225 c72210 = c7228.f24057;
                            if (c72210 == null) {
                                this.f11225 = c7225;
                            }
                            c7225.f24056 = c7228;
                            c7225.f24057 = c72210;
                            c7228.f24055 &= -1073741825;
                            c7228.f24057 = c7225;
                            break;
                        }
                        c7228 = c7228.f24057;
                        i4 = i2;
                    }
                }
                Object obj2 = c7228.f29882;
                c7228.f29882 = obj;
                return obj2;
            }
            c7228 = c7225;
            this.f11220 = true;
            while (i4 > 0 && !this.f11221[i4].m19233()) {
                int i6 = i4 - 1;
                if (!this.f11227[i6]) {
                    C7225 c72211 = this.f11221[i6];
                    C7225 c72212 = c72211.f24056;
                    if (!c72211.m19230() && !c72212.m19233()) {
                        this.f11221[i4].m19229(true);
                        c72212.m19229(true);
                        this.f11221[i6].m19229(false);
                        i4 -= 2;
                    } else {
                        if (this.f11227[i4]) {
                            C7225[] c7225Arr = this.f11221;
                            C7225 c72213 = c7225Arr[i4];
                            C7225 c72214 = c72213.f24056;
                            c72213.f24056 = c72214.f24057;
                            c72214.f24057 = c72213;
                            c7225Arr[i6].f24057 = c72214;
                            if (c72214.m19234()) {
                                c72214.m19232(false);
                                c72213.m19231(c72214);
                            }
                            c7227 = c72214;
                        } else {
                            c7227 = this.f11221[i4];
                        }
                        C7225 c72215 = this.f11221[i6];
                        c72215.m19229(false);
                        c7227.m19229(true);
                        c72215.f24057 = c7227.f24056;
                        c7227.f24056 = c72215;
                        if (i4 < 2) {
                            this.f11228 = c7227;
                        } else {
                            int i7 = i4 - 2;
                            if (this.f11227[i7]) {
                                this.f11221[i7].f24056 = c7227;
                            } else {
                                this.f11221[i7].f24057 = c7227;
                            }
                        }
                        if (!c7227.m19230()) {
                            break;
                        }
                        c7227.m19227(false);
                        c72215.m19228(c7227);
                        break;
                    }
                } else {
                    C7225 c72216 = this.f11221[i6];
                    C7225 c72217 = c72216.f24057;
                    if (!c72216.m19234() && !c72217.m19233()) {
                        this.f11221[i4].m19229(true);
                        c72217.m19229(true);
                        this.f11221[i6].m19229(false);
                        i4 -= 2;
                    } else {
                        if (this.f11227[i4]) {
                            c7226 = this.f11221[i4];
                        } else {
                            C7225[] c7225Arr2 = this.f11221;
                            C7225 c72218 = c7225Arr2[i4];
                            C7225 c72219 = c72218.f24057;
                            c72218.f24057 = c72219.f24056;
                            c72219.f24056 = c72218;
                            c7225Arr2[i6].f24056 = c72219;
                            if (c72219.m19230()) {
                                c72219.m19227(false);
                                c72218.m19228(c72219);
                            }
                            c7226 = c72219;
                        }
                        C7225 c72220 = this.f11221[i6];
                        c72220.m19229(false);
                        c7226.m19229(true);
                        c72220.f24056 = c7226.f24057;
                        c7226.f24057 = c72220;
                        if (i4 < 2) {
                            this.f11228 = c7226;
                        } else {
                            int i8 = i4 - 2;
                            if (this.f11227[i8]) {
                                this.f11221[i8].f24056 = c7226;
                            } else {
                                this.f11221[i8].f24057 = c7226;
                            }
                        }
                        if (!c7226.m19234()) {
                            break;
                        }
                        c7226.m19232(false);
                        c72220.m19231(c7226);
                        break;
                    }
                }
            }
            i3 = i2;
        }
        this.f11228.m19229(true);
        while (true) {
            int i9 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            this.f11221[i9] = null;
            i3 = i9;
        }
        Object obj3 = c7228.f29882;
        c7228.f29882 = obj;
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x0254  */
    /* JADX WARN: Code duplicated, block: B:115:0x0257  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0263  */
    /* JADX WARN: Code duplicated, block: B:121:0x026d  */
    /* JADX WARN: Code duplicated, block: B:123:0x027e  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x033f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0342  */
    /* JADX WARN: Code duplicated, block: B:158:0x0349  */
    /* JADX WARN: Code duplicated, block: B:159:0x034e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0358  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    @Override // l.AbstractC19262, l.InterfaceC17372
    public final Object remove(int i) {
        int i2;
        C7225 c7225;
        C7225 c7226;
        C7225 c7227;
        int i3;
        C7225[] c7225Arr;
        int i4;
        C7225[] c7225Arr2;
        int i5;
        C7225 c7228;
        C7225 c7229;
        int i6;
        C7225[] c7225Arr3;
        int i7;
        C7225[] c7225Arr4;
        int i8;
        this.f11220 = false;
        C7225 c7225M19236 = this.f11228;
        if (c7225M19236 == null) {
            return null;
        }
        int i9 = 0;
        while (true) {
            int iCompare = Integer.compare(i, c7225M19236.f29881);
            if (iCompare != 0) {
                boolean[] zArr = this.f11227;
                boolean z = iCompare > 0;
                zArr[i9] = z;
                this.f11221[i9] = c7225M19236;
                i9++;
                if (z) {
                    c7225M19236 = c7225M19236.m19236();
                    if (c7225M19236 == null) {
                        while (true) {
                            int i10 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f11221[i10] = null;
                            i9 = i10;
                        }
                    }
                } else {
                    c7225M19236 = c7225M19236.m19226();
                    if (c7225M19236 == null) {
                        while (true) {
                            int i11 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f11221[i11] = null;
                            i9 = i11;
                        }
                    }
                }
            } else {
                if (c7225M19236.f24057 == null) {
                    this.f11225 = c7225M19236.m19238();
                }
                if (c7225M19236.f24056 == null) {
                    this.f11226 = c7225M19236.m19237();
                }
                if (c7225M19236.m19230()) {
                    if (!c7225M19236.m19234()) {
                        c7225M19236.m19237().f24056 = c7225M19236.f24056;
                        if (i9 == 0) {
                            this.f11228 = c7225M19236.f24057;
                        } else {
                            int i12 = i9 - 1;
                            if (this.f11227[i12]) {
                                this.f11221[i12].f24056 = c7225M19236.f24057;
                            } else {
                                this.f11221[i12].f24057 = c7225M19236.f24057;
                            }
                        }
                    } else if (i9 == 0) {
                        this.f11228 = c7225M19236.f24057;
                    } else {
                        int i13 = i9 - 1;
                        if (this.f11227[i13]) {
                            this.f11221[i13].m19231(c7225M19236.f24056);
                        } else {
                            this.f11221[i13].m19228(c7225M19236.f24057);
                        }
                    }
                } else {
                    C7225 c72210 = c7225M19236.f24056;
                    if (c72210.m19234()) {
                        c72210.f24057 = c7225M19236.f24057;
                        c72210.m19232(c7225M19236.m19234());
                        if (!c72210.m19234()) {
                            c72210.m19237().f24056 = c72210;
                        }
                        if (i9 == 0) {
                            this.f11228 = c72210;
                        } else {
                            int i14 = i9 - 1;
                            if (this.f11227[i14]) {
                                this.f11221[i14].f24056 = c72210;
                            } else {
                                this.f11221[i14].f24057 = c72210;
                            }
                        }
                        boolean zM19233 = c72210.m19233();
                        c72210.m19229(c7225M19236.m19233());
                        c7225M19236.m19229(zM19233);
                        this.f11227[i9] = true;
                        this.f11221[i9] = c72210;
                        i9++;
                    } else {
                        int i15 = i9 + 1;
                        while (true) {
                            this.f11227[i15] = false;
                            i2 = i15 + 1;
                            this.f11221[i15] = c72210;
                            c7225 = c72210.f24057;
                            if (c7225.m19234()) {
                                break;
                            }
                            c72210 = c7225;
                            i15 = i2;
                        }
                        this.f11227[i9] = true;
                        this.f11221[i9] = c7225;
                        if (c7225.m19230()) {
                            c72210.m19228(c7225);
                        } else {
                            c72210.f24057 = c7225.f24056;
                        }
                        c7225.f24057 = c7225M19236.f24057;
                        if (!c7225M19236.m19234()) {
                            c7225M19236.m19237().f24056 = c7225;
                            c7225.m19232(false);
                        }
                        c7225.m19235(c7225M19236.f24056);
                        boolean zM19234 = c7225.m19233();
                        c7225.m19229(c7225M19236.m19233());
                        c7225M19236.m19229(zM19234);
                        if (i9 == 0) {
                            this.f11228 = c7225;
                        } else {
                            int i16 = i9 - 1;
                            if (this.f11227[i16]) {
                                this.f11221[i16].f24056 = c7225;
                            } else {
                                this.f11221[i16].f24057 = c7225;
                            }
                        }
                        i9 = i2;
                    }
                }
                if (c7225M19236.m19233()) {
                    int i17 = i9;
                    while (true) {
                        if (i9 > 0) {
                            int i18 = i9 - 1;
                            if ((this.f11227[i18] && !this.f11221[i18].m19230()) || (!this.f11227[i18] && !this.f11221[i18].m19234())) {
                                C7225 c72211 = this.f11227[i18] ? this.f11221[i18].f24056 : this.f11221[i18].f24057;
                                if (!c72211.m19233()) {
                                    c72211.m19229(true);
                                } else if (!this.f11227[i18]) {
                                    c7228 = this.f11221[i18].f24056;
                                    if (!c7228.m19233()) {
                                        c7228.m19229(true);
                                        this.f11221[i18].m19229(false);
                                        c7225Arr4 = this.f11221;
                                        C7225 c72212 = c7225Arr4[i18];
                                        c72212.f24056 = c7228.f24057;
                                        c7228.f24057 = c72212;
                                        if (i9 < 2) {
                                            this.f11228 = c7228;
                                        } else {
                                            i8 = i9 - 2;
                                            if (this.f11227[i8]) {
                                                c7225Arr4[i8].f24056 = c7228;
                                            } else {
                                                c7225Arr4[i8].f24057 = c7228;
                                            }
                                        }
                                        c7225Arr4[i9] = c72212;
                                        this.f11227[i9] = false;
                                        c7225Arr4[i18] = c7228;
                                        int i19 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c7228 = c7225Arr4[i9].f24056;
                                        i9 = i19;
                                    }
                                    if (!c7228.m19234()) {
                                        c7228.m19229(false);
                                        i9--;
                                    } else {
                                        c7228.m19229(false);
                                        i9--;
                                    }
                                    if (!c7228.m19230()) {
                                        c7229 = c7228.f24057;
                                        c7229.m19229(true);
                                        c7228.m19229(false);
                                        c7228.f24057 = c7229.f24056;
                                        c7229.f24056 = c7228;
                                        this.f11221[i9 - 1].f24056 = c7229;
                                        if (c7229.m19230()) {
                                            c7229.m19227(false);
                                            c7229.f24056.m19228(c7229);
                                        }
                                        c7228 = c7229;
                                    } else {
                                        c7229 = c7228.f24057;
                                        c7229.m19229(true);
                                        c7228.m19229(false);
                                        c7228.f24057 = c7229.f24056;
                                        c7229.f24056 = c7228;
                                        this.f11221[i9 - 1].f24056 = c7229;
                                        if (c7229.m19230()) {
                                            c7229.m19227(false);
                                            c7229.f24056.m19228(c7229);
                                        }
                                        c7228 = c7229;
                                    }
                                    i6 = i9 - 1;
                                    c7228.m19229(this.f11221[i6].m19233());
                                    this.f11221[i6].m19229(true);
                                    c7228.f24056.m19229(true);
                                    c7225Arr3 = this.f11221;
                                    C7225 c72213 = c7225Arr3[i6];
                                    c72213.f24056 = c7228.f24057;
                                    c7228.f24057 = c72213;
                                    if (i9 < 2) {
                                        this.f11228 = c7228;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f11227[i7]) {
                                            c7225Arr3[i7].f24056 = c7228;
                                        } else {
                                            c7225Arr3[i7].f24057 = c7228;
                                        }
                                    }
                                    if (c7228.m19234()) {
                                        c7228.m19232(false);
                                        this.f11221[i6].m19231(c7228);
                                    }
                                } else {
                                    c7226 = this.f11221[i18].f24057;
                                    if (!c7226.m19233()) {
                                        c7226.m19229(true);
                                        this.f11221[i18].m19229(false);
                                        c7225Arr2 = this.f11221;
                                        C7225 c72214 = c7225Arr2[i18];
                                        c72214.f24057 = c7226.f24056;
                                        c7226.f24056 = c72214;
                                        if (i9 < 2) {
                                            this.f11228 = c7226;
                                        } else {
                                            i5 = i9 - 2;
                                            if (this.f11227[i5]) {
                                                c7225Arr2[i5].f24056 = c7226;
                                            } else {
                                                c7225Arr2[i5].f24057 = c7226;
                                            }
                                        }
                                        c7225Arr2[i9] = c72214;
                                        this.f11227[i9] = true;
                                        c7225Arr2[i18] = c7226;
                                        int i20 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c7226 = c7225Arr2[i9].f24057;
                                        i9 = i20;
                                    }
                                    if (!c7226.m19234()) {
                                        c7226.m19229(false);
                                        i9--;
                                    } else {
                                        c7226.m19229(false);
                                        i9--;
                                    }
                                    if (!c7226.m19234()) {
                                        c7227 = c7226.f24056;
                                        c7227.m19229(true);
                                        c7226.m19229(false);
                                        c7226.f24056 = c7227.f24057;
                                        c7227.f24057 = c7226;
                                        this.f11221[i9 - 1].f24057 = c7227;
                                        if (c7227.m19234()) {
                                            c7227.m19232(false);
                                            c7227.f24057.m19231(c7227);
                                        }
                                        c7226 = c7227;
                                    } else {
                                        c7227 = c7226.f24056;
                                        c7227.m19229(true);
                                        c7226.m19229(false);
                                        c7226.f24056 = c7227.f24057;
                                        c7227.f24057 = c7226;
                                        this.f11221[i9 - 1].f24057 = c7227;
                                        if (c7227.m19234()) {
                                            c7227.m19232(false);
                                            c7227.f24057.m19231(c7227);
                                        }
                                        c7226 = c7227;
                                    }
                                    i3 = i9 - 1;
                                    c7226.m19229(this.f11221[i3].m19233());
                                    this.f11221[i3].m19229(true);
                                    c7226.f24057.m19229(true);
                                    c7225Arr = this.f11221;
                                    C7225 c72215 = c7225Arr[i3];
                                    c72215.f24057 = c7226.f24056;
                                    c7226.f24056 = c72215;
                                    if (i9 < 2) {
                                        this.f11228 = c7226;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f11227[i4]) {
                                            c7225Arr[i4].f24056 = c7226;
                                        } else {
                                            c7225Arr[i4].f24057 = c7226;
                                        }
                                    }
                                    if (c7226.m19230()) {
                                        c7226.m19227(false);
                                        this.f11221[i3].m19228(c7226);
                                    }
                                }
                            } else if (!this.f11227[i18]) {
                                c7228 = this.f11221[i18].f24056;
                                if (!c7228.m19233()) {
                                    c7228.m19229(true);
                                    this.f11221[i18].m19229(false);
                                    c7225Arr4 = this.f11221;
                                    C7225 c72216 = c7225Arr4[i18];
                                    c72216.f24056 = c7228.f24057;
                                    c7228.f24057 = c72216;
                                    if (i9 < 2) {
                                        this.f11228 = c7228;
                                    } else {
                                        i8 = i9 - 2;
                                        if (this.f11227[i8]) {
                                            c7225Arr4[i8].f24056 = c7228;
                                        } else {
                                            c7225Arr4[i8].f24057 = c7228;
                                        }
                                    }
                                    c7225Arr4[i9] = c72216;
                                    this.f11227[i9] = false;
                                    c7225Arr4[i18] = c7228;
                                    int i110 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c7228 = c7225Arr4[i9].f24056;
                                    i9 = i110;
                                }
                                if ((!c7228.m19234() || c7228.f24057.m19233()) && (c7228.m19230() || c7228.f24056.m19233())) {
                                    c7228.m19229(false);
                                    i9--;
                                } else {
                                    if (!c7228.m19230() || c7228.f24056.m19233()) {
                                        c7229 = c7228.f24057;
                                        c7229.m19229(true);
                                        c7228.m19229(false);
                                        c7228.f24057 = c7229.f24056;
                                        c7229.f24056 = c7228;
                                        this.f11221[i9 - 1].f24056 = c7229;
                                        if (c7229.m19230()) {
                                            c7229.m19227(false);
                                            c7229.f24056.m19228(c7229);
                                        }
                                        c7228 = c7229;
                                    }
                                    i6 = i9 - 1;
                                    c7228.m19229(this.f11221[i6].m19233());
                                    this.f11221[i6].m19229(true);
                                    c7228.f24056.m19229(true);
                                    c7225Arr3 = this.f11221;
                                    C7225 c72217 = c7225Arr3[i6];
                                    c72217.f24056 = c7228.f24057;
                                    c7228.f24057 = c72217;
                                    if (i9 < 2) {
                                        this.f11228 = c7228;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f11227[i7]) {
                                            c7225Arr3[i7].f24056 = c7228;
                                        } else {
                                            c7225Arr3[i7].f24057 = c7228;
                                        }
                                    }
                                    if (c7228.m19234()) {
                                        c7228.m19232(false);
                                        this.f11221[i6].m19231(c7228);
                                    }
                                }
                            } else {
                                c7226 = this.f11221[i18].f24057;
                                if (!c7226.m19233()) {
                                    c7226.m19229(true);
                                    this.f11221[i18].m19229(false);
                                    c7225Arr2 = this.f11221;
                                    C7225 c72218 = c7225Arr2[i18];
                                    c72218.f24057 = c7226.f24056;
                                    c7226.f24056 = c72218;
                                    if (i9 < 2) {
                                        this.f11228 = c7226;
                                    } else {
                                        i5 = i9 - 2;
                                        if (this.f11227[i5]) {
                                            c7225Arr2[i5].f24056 = c7226;
                                        } else {
                                            c7225Arr2[i5].f24057 = c7226;
                                        }
                                    }
                                    c7225Arr2[i9] = c72218;
                                    this.f11227[i9] = true;
                                    c7225Arr2[i18] = c7226;
                                    int i21 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c7226 = c7225Arr2[i9].f24057;
                                    i9 = i21;
                                }
                                if ((!c7226.m19234() || c7226.f24057.m19233()) && (c7226.m19230() || c7226.f24056.m19233())) {
                                    c7226.m19229(false);
                                    i9--;
                                } else {
                                    if (!c7226.m19234() || c7226.f24057.m19233()) {
                                        c7227 = c7226.f24056;
                                        c7227.m19229(true);
                                        c7226.m19229(false);
                                        c7226.f24056 = c7227.f24057;
                                        c7227.f24057 = c7226;
                                        this.f11221[i9 - 1].f24057 = c7227;
                                        if (c7227.m19234()) {
                                            c7227.m19232(false);
                                            c7227.f24057.m19231(c7227);
                                        }
                                        c7226 = c7227;
                                    }
                                    i3 = i9 - 1;
                                    c7226.m19229(this.f11221[i3].m19233());
                                    this.f11221[i3].m19229(true);
                                    c7226.f24057.m19229(true);
                                    c7225Arr = this.f11221;
                                    C7225 c72219 = c7225Arr[i3];
                                    c72219.f24057 = c7226.f24056;
                                    c7226.f24056 = c72219;
                                    if (i9 < 2) {
                                        this.f11228 = c7226;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f11227[i4]) {
                                            c7225Arr[i4].f24056 = c7226;
                                        } else {
                                            c7225Arr[i4].f24057 = c7226;
                                        }
                                    }
                                    if (c7226.m19230()) {
                                        c7226.m19227(false);
                                        this.f11221[i3].m19228(c7226);
                                    }
                                }
                            }
                        }
                        i9 = i17;
                        C7225 c72220 = this.f11228;
                        if (c72220 != null) {
                            c72220.m19229(true);
                        }
                    }
                }
                this.f11220 = true;
                this.f11224--;
                while (true) {
                    int i22 = i9 - 1;
                    if (i9 != 0) {
                        this.f11221[i22] = null;
                        i9 = i22;
                    } else {
                        return c7225M19236.f29882;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C9343 c9343 = new C9343(this);
        int i = this.f11224;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C13638.equals(c9343.m5385().f29882, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f11224 = 0;
        this.f11228 = null;
        this.f11219 = null;
        this.f11223 = null;
        this.f11222 = null;
        this.f11226 = null;
        this.f11225 = null;
    }

    @Override // l.AbstractC10090, l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8945(int i) {
        return m8948(i) != null;
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final int size() {
        return this.f11224;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11224 == 0;
    }

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        C7225 c7225M8948 = m8948(i);
        if (c7225M8948 == null) {
            return null;
        }
        return c7225M8948.f29882;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int mo8951() {
        if (this.f11228 == null) {
            throw new NoSuchElementException();
        }
        return this.f11225.f29881;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo8953() {
        if (this.f11228 == null) {
            throw new NoSuchElementException();
        }
        return this.f11226.f29881;
    }

    @Override // l.AbstractC20673, l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC10194 mo8949() {
        if (this.f11219 == null) {
            this.f11219 = new C8637(this);
        }
        return this.f11219;
    }

    @Override // l.AbstractC20673, java.util.Map, l.InterfaceC4485, java.util.SortedMap
    public final InterfaceC4733 keySet() {
        if (this.f11222 == null) {
            this.f11222 = new C19926(this);
        }
        return this.f11222;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f11223 == null) {
            this.f11223 = new C10048(this);
        }
        return this.f11223;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC4485 mo8943(int i) {
        return new C14282(this, 0, true, i, false);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC4485 mo8952(int i) {
        return new C14282(this, i, false, 0, true);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4485 mo8950(int i, int i2) {
        return new C14282(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C2991 c2991 = (C2991) super.clone();
            c2991.f11222 = null;
            c2991.f11223 = null;
            c2991.f11219 = null;
            c2991.f11227 = new boolean[64];
            c2991.f11221 = new C7225[64];
            if (this.f11224 != 0) {
                C7225 c7225 = new C7225();
                C7225 c7226 = new C7225();
                C7225 c7227 = this.f11228;
                c7225.f24055 &= -1073741825;
                c7225.f24057 = c7227;
                c7226.m19228((C7225) null);
                C7225 c7228 = c7226;
                loop0: while (true) {
                    if (!c7225.m19234()) {
                        C7225 c7225Clone = c7225.f24057.clone();
                        c7225Clone.m19228(c7228.f24057);
                        c7225Clone.m19231(c7228);
                        c7228.f24055 &= -1073741825;
                        c7228.f24057 = c7225Clone;
                        c7225 = c7225.f24057;
                        c7228 = c7225Clone;
                    } else {
                        while (c7225.m19230()) {
                            c7225 = c7225.f24056;
                            if (c7225 == null) {
                                break loop0;
                            }
                            c7228 = c7228.f24056;
                        }
                        c7225 = c7225.f24056;
                        c7228 = c7228.f24056;
                    }
                    if (!c7225.m19230()) {
                        C7225 c7225Clone2 = c7225.f24056.clone();
                        c7225Clone2.m19231(c7228.f24056);
                        c7225Clone2.m19228(c7228);
                        c7228.m19235(c7225Clone2);
                    }
                }
                c7228.f24056 = null;
                C7225 c7229 = c7226.f24057;
                c2991.f11228 = c7229;
                c2991.f11225 = c7229;
                while (true) {
                    C7225 c72210 = c2991.f11225.f24057;
                    if (c72210 == null) {
                        break;
                    }
                    c2991.f11225 = c72210;
                }
                c2991.f11226 = c2991.f11228;
                while (true) {
                    C7225 c72211 = c2991.f11226.f24056;
                    if (c72211 == null) {
                        break;
                    }
                    c2991.f11226 = c72211;
                }
            }
            return c2991;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f11224;
        C20631 c20631 = new C20631(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C7225 c7225M5385 = c20631.m5385();
            objectOutputStream.writeInt(c7225M5385.f29881);
            objectOutputStream.writeObject(c7225M5385.f29882);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7225 m8942(ObjectInputStream objectInputStream, int i, C7225 c7225, C7225 c7226) {
        if (i == 1) {
            C7225 c7227 = new C7225(objectInputStream.readInt(), objectInputStream.readObject());
            c7227.m19228(c7225);
            c7227.m19231(c7226);
            c7227.m19229(true);
            return c7227;
        }
        if (i == 2) {
            C7225 c7228 = new C7225(objectInputStream.readInt(), objectInputStream.readObject());
            c7228.m19229(true);
            c7228.m19235(new C7225(objectInputStream.readInt(), objectInputStream.readObject()));
            c7228.f24056.m19228(c7228);
            c7228.m19228(c7225);
            c7228.f24056.m19231(c7226);
            return c7228;
        }
        int i2 = i / 2;
        C7225 c7229 = new C7225();
        C7225 c7225M8942 = m8942(objectInputStream, (i - i2) - 1, c7225, c7229);
        c7229.f24055 &= -1073741825;
        c7229.f24057 = c7225M8942;
        c7229.f29881 = objectInputStream.readInt();
        c7229.f29882 = objectInputStream.readObject();
        c7229.m19229(true);
        c7229.m19235(m8942(objectInputStream, i2, c7229, c7226));
        int i3 = i + 2;
        if (i3 == ((-i3) & i3)) {
            c7229.f24056.m19229(false);
        }
        return c7229;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f11227 = new boolean[64];
        this.f11221 = new C7225[64];
        int i = this.f11224;
        if (i != 0) {
            C7225 c7225M8942 = m8942(objectInputStream, i, null, null);
            this.f11228 = c7225M8942;
            while (c7225M8942.m19226() != null) {
                c7225M8942 = c7225M8942.m19226();
            }
            this.f11225 = c7225M8942;
            C7225 c7225M19236 = this.f11228;
            while (c7225M19236.m19236() != null) {
                c7225M19236 = c7225M19236.m19236();
            }
            this.f11226 = c7225M19236;
        }
    }
}
