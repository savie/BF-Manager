package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S1AA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15469 extends AbstractC7707 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int[] f50404 = new int[2];

    public C15469(C20719 c20719) {
        super(c20719);
        this.f25501.f19192 = EnumC2767.LEFT;
        this.f25505.f19192 = EnumC2767.RIGHT;
        this.f25508 = 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.f25504.m46643();
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۨ */
    public final void mo11823() {
        this.f25506 = null;
        this.f25501.m15462();
        this.f25505.m15462();
        this.f25502.m15462();
        this.f25499 = false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m37001() {
        this.f25499 = false;
        C5590 c5590 = this.f25501;
        c5590.m15462();
        c5590.f19187 = false;
        C5590 c5591 = this.f25505;
        c5591.m15462();
        c5591.f19187 = false;
        this.f25502.f19187 = false;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11825() {
        return this.f25507 != EnumC7313.MATCH_CONSTRAINT || this.f25504.f67395 == 0;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۙ */
    public final void mo11821() {
        C20719 c20719;
        C20719 c207110;
        C20719 c207111;
        C20719 c207112;
        C20719 c207113 = this.f25504;
        boolean z = c207113.f67403;
        C22524 c22524 = this.f25502;
        if (z) {
            c22524.mo15463(c207113.m46640());
        }
        boolean z2 = c22524.f19187;
        ArrayList arrayList = c22524.f19195;
        ArrayList arrayList2 = c22524.f19189;
        C5590 c5590 = this.f25505;
        C5590 c5591 = this.f25501;
        if (z2) {
            EnumC7313 enumC7313 = this.f25507;
            EnumC7313 enumC7314 = EnumC7313.MATCH_PARENT;
            if (enumC7313 == enumC7314 && (((c207110 = (c20719 = this.f25504).f67433) != null && c207110.f67434[0] == EnumC7313.FIXED) || c207110.f67434[0] == enumC7314)) {
                AbstractC7707.m20338(c5591, c207110.f67376.f25501, c20719.f67385.m22577());
                AbstractC7707.m20338(c5590, c207110.f67376.f25505, -this.f25504.f67421.m22577());
                return;
            }
        } else {
            C20719 c207114 = this.f25504;
            EnumC7313 enumC7315 = c207114.f67434[0];
            this.f25507 = enumC7315;
            if (enumC7315 != EnumC7313.MATCH_CONSTRAINT) {
                EnumC7313 enumC7316 = EnumC7313.MATCH_PARENT;
                if (enumC7315 == enumC7316 && (((c207112 = c207114.f67433) != null && c207112.f67434[0] == EnumC7313.FIXED) || c207112.f67434[0] == enumC7316)) {
                    int iM46640 = (c207112.m46640() - this.f25504.f67385.m22577()) - this.f25504.f67421.m22577();
                    AbstractC7707.m20338(c5591, c207112.f67376.f25501, this.f25504.f67385.m22577());
                    AbstractC7707.m20338(c5590, c207112.f67376.f25505, -this.f25504.f67421.m22577());
                    c22524.mo15463(iM46640);
                    return;
                }
                if (enumC7315 == EnumC7313.FIXED) {
                    c22524.mo15463(c207114.m46640());
                }
            }
        }
        if (c22524.f19187) {
            C20719 c207115 = this.f25504;
            if (c207115.f67403) {
                C8725[] c8725Arr = c207115.f67398;
                C8725 c8725 = c8725Arr[0];
                C8725 c8726 = c8725.f29981;
                if (c8726 != null && c8725Arr[1].f29981 != null) {
                    if (c207115.m46631()) {
                        c5591.f19193 = this.f25504.f67398[0].m22577();
                        c5590.f19193 = -this.f25504.f67398[1].m22577();
                        return;
                    }
                    C5590 c5590M20336 = AbstractC7707.m20336(this.f25504.f67398[0]);
                    if (c5590M20336 != null) {
                        AbstractC7707.m20338(c5591, c5590M20336, this.f25504.f67398[0].m22577());
                    }
                    C5590 c5590M20337 = AbstractC7707.m20336(this.f25504.f67398[1]);
                    if (c5590M20337 != null) {
                        AbstractC7707.m20338(c5590, c5590M20337, -this.f25504.f67398[1].m22577());
                    }
                    c5591.f19190 = true;
                    c5590.f19190 = true;
                    return;
                }
                if (c8726 != null) {
                    C5590 c5590M20338 = AbstractC7707.m20336(c8725);
                    if (c5590M20338 != null) {
                        AbstractC7707.m20338(c5591, c5590M20338, this.f25504.f67398[0].m22577());
                        AbstractC7707.m20338(c5590, c5591, c22524.f19196);
                        return;
                    }
                    return;
                }
                C8725 c8727 = c8725Arr[1];
                if (c8727.f29981 != null) {
                    C5590 c5590M20339 = AbstractC7707.m20336(c8727);
                    if (c5590M20339 != null) {
                        AbstractC7707.m20338(c5590, c5590M20339, -this.f25504.f67398[1].m22577());
                        AbstractC7707.m20338(c5591, c5590, -c22524.f19196);
                        return;
                    }
                    return;
                }
                if ((c207115 instanceof C17191) || c207115.f67433 == null || c207115.mo30461(EnumC19308.CENTER).f29981 != null) {
                    return;
                }
                C20719 c207116 = this.f25504;
                AbstractC7707.m20338(c5591, c207116.f67433.f67376.f25501, c207116.m46630());
                AbstractC7707.m20338(c5590, c5591, c22524.f19196);
                return;
            }
        }
        if (this.f25507 == EnumC7313.MATCH_CONSTRAINT) {
            C20719 c207117 = this.f25504;
            int i = c207117.f67395;
            if (i == 2) {
                C20719 c207118 = c207117.f67433;
                if (c207118 != null) {
                    C22524 c22525 = c207118.f67409.f25502;
                    arrayList2.add(c22525);
                    c22525.f19195.add(c22524);
                    c22524.f19190 = true;
                    arrayList.add(c5591);
                    arrayList.add(c5590);
                }
            } else if (i == 3) {
                if (c207117.f67375 == 3) {
                    c5591.f19198 = this;
                    c5590.f19198 = this;
                    C18996 c18996 = c207117.f67409;
                    c18996.f25501.f19198 = this;
                    c18996.f25505.f19198 = this;
                    c22524.f19198 = this;
                    if (c207117.m46632()) {
                        arrayList2.add(this.f25504.f67409.f25502);
                        this.f25504.f67409.f25502.f19195.add(c22524);
                        C18996 c18997 = this.f25504.f67409;
                        c18997.f25502.f19198 = this;
                        arrayList2.add(c18997.f25501);
                        arrayList2.add(this.f25504.f67409.f25505);
                        this.f25504.f67409.f25501.f19195.add(c22524);
                        this.f25504.f67409.f25505.f19195.add(c22524);
                    } else if (this.f25504.m46631()) {
                        this.f25504.f67409.f25502.f19189.add(c22524);
                        arrayList.add(this.f25504.f67409.f25502);
                    } else {
                        this.f25504.f67409.f25502.f19189.add(c22524);
                    }
                } else {
                    C22524 c22526 = c207117.f67409.f25502;
                    arrayList2.add(c22526);
                    c22526.f19195.add(c22524);
                    this.f25504.f67409.f25501.f19195.add(c22524);
                    this.f25504.f67409.f25505.f19195.add(c22524);
                    c22524.f19190 = true;
                    arrayList.add(c5591);
                    arrayList.add(c5590);
                    c5591.f19189.add(c22524);
                    c5590.f19189.add(c22524);
                }
            }
        }
        C20719 c207119 = this.f25504;
        C8725[] c8725Arr2 = c207119.f67398;
        C8725 c8728 = c8725Arr2[0];
        C8725 c8729 = c8728.f29981;
        if (c8729 != null && c8725Arr2[1].f29981 != null) {
            if (c207119.m46631()) {
                c5591.f19193 = this.f25504.f67398[0].m22577();
                c5590.f19193 = -this.f25504.f67398[1].m22577();
                return;
            }
            C5590 c5590M203310 = AbstractC7707.m20336(this.f25504.f67398[0]);
            C5590 c5590M203311 = AbstractC7707.m20336(this.f25504.f67398[1]);
            c5590M203310.m15464((AbstractC7707) this);
            c5590M203311.m15464((AbstractC7707) this);
            this.f25500 = EnumC10530.CENTER;
            return;
        }
        if (c8729 != null) {
            C5590 c5590M203312 = AbstractC7707.m20336(c8728);
            if (c5590M203312 != null) {
                AbstractC7707.m20338(c5591, c5590M203312, this.f25504.f67398[0].m22577());
                m20340(c5590, c5591, 1, c22524);
                return;
            }
            return;
        }
        C8725 c87210 = c8725Arr2[1];
        if (c87210.f29981 != null) {
            C5590 c5590M203313 = AbstractC7707.m20336(c87210);
            if (c5590M203313 != null) {
                AbstractC7707.m20338(c5590, c5590M203313, -this.f25504.f67398[1].m22577());
                m20340(c5591, c5590, -1, c22524);
                return;
            }
            return;
        }
        if ((c207119 instanceof C17191) || (c207111 = c207119.f67433) == null) {
            return;
        }
        AbstractC7707.m20338(c5591, c207111.f67376.f25501, c207119.m46630());
        m20340(c5590, c5591, 1, c22524);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37000(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x027b  */
    /* JADX WARN: Code duplicated, block: B:117:0x028a  */
    @Override // l.AbstractC7707, l.InterfaceC14058
    /* JADX INFO: renamed from: ۙ */
    public final void mo11822(InterfaceC14058 interfaceC14058) {
        int iM20339;
        int i;
        int iM203310;
        C20719 c20719;
        int i2;
        float f;
        int i3;
        if (C23230.f75386[this.f25500.ordinal()] == 3) {
            C20719 c207110 = this.f25504;
            m20341(c207110.f67385, c207110.f67421, 0);
            return;
        }
        C22524 c22524 = this.f25502;
        boolean z = c22524.f19187;
        C5590 c5590 = this.f25501;
        C5590 c5591 = this.f25505;
        if (!z && this.f25507 == EnumC7313.MATCH_CONSTRAINT) {
            C20719 c207111 = this.f25504;
            int i4 = c207111.f67395;
            if (i4 == 2) {
                C20719 c207112 = c207111.f67433;
                if (c207112 != null) {
                    C22524 c22525 = c207112.f67376.f25502;
                    if (c22525.f19187) {
                        c22524.mo15463((int) ((c22525.f19196 * c207111.f67384) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = c207111.f67375;
                if (i5 == 0 || i5 == 3) {
                    C18996 c18996 = c207111.f67409;
                    C5590 c5592 = c18996.f25501;
                    C5590 c5593 = c18996.f25505;
                    boolean z2 = c207111.f67385.f29981 != null;
                    boolean z3 = c207111.f67392.f29981 != null;
                    boolean z4 = c207111.f67421.f29981 != null;
                    boolean z5 = c207111.f67387.f29981 != null;
                    int iM46575 = c207111.m46575();
                    if (z2 && z3 && z4 && z5) {
                        float f2 = this.f25504.f67422;
                        boolean z6 = c5592.f19187;
                        ArrayList arrayList = c5592.f19189;
                        int[] iArr = f50404;
                        if (z6 && c5593.f19187) {
                            if (c5590.f19197 && c5591.f19197) {
                                m37000(iArr, ((C5590) c5590.f19189.get(0)).f19196 + c5590.f19193, ((C5590) c5591.f19189.get(0)).f19196 - c5591.f19193, c5592.f19196 + c5592.f19193, c5593.f19196 - c5593.f19193, f2, iM46575);
                                c22524.mo15463(iArr[0]);
                                this.f25504.f67409.f25502.mo15463(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c5590.f19187 && c5591.f19187) {
                            if (!c5592.f19197 || !c5593.f19197) {
                                return;
                            }
                            m37000(iArr, c5590.f19196 + c5590.f19193, c5591.f19196 - c5591.f19193, ((C5590) arrayList.get(0)).f19196 + c5592.f19193, ((C5590) c5593.f19189.get(0)).f19196 - c5593.f19193, f2, iM46575);
                            c22524.mo15463(iArr[0]);
                            this.f25504.f67409.f25502.mo15463(iArr[1]);
                        }
                        if (!c5590.f19197 || !c5591.f19197 || !c5592.f19197 || !c5593.f19197) {
                            return;
                        }
                        m37000(iArr, ((C5590) c5590.f19189.get(0)).f19196 + c5590.f19193, ((C5590) c5591.f19189.get(0)).f19196 - c5591.f19193, ((C5590) arrayList.get(0)).f19196 + c5592.f19193, ((C5590) c5593.f19189.get(0)).f19196 - c5593.f19193, f2, iM46575);
                        c22524.mo15463(iArr[0]);
                        this.f25504.f67409.f25502.mo15463(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c5590.f19197 || !c5591.f19197) {
                            return;
                        }
                        float f3 = this.f25504.f67422;
                        int i6 = ((C5590) c5590.f19189.get(0)).f19196 + c5590.f19193;
                        int i7 = ((C5590) c5591.f19189.get(0)).f19196 - c5591.f19193;
                        if (iM46575 == -1 || iM46575 == 0) {
                            int iM203311 = m20339(i7 - i6, 0);
                            int i8 = (int) ((iM203311 * f3) + 0.5f);
                            int iM203312 = m20339(i8, 1);
                            if (i8 != iM203312) {
                                iM203311 = (int) ((iM203312 / f3) + 0.5f);
                            }
                            c22524.mo15463(iM203311);
                            this.f25504.f67409.f25502.mo15463(iM203312);
                        } else if (iM46575 == 1) {
                            int iM203313 = m20339(i7 - i6, 0);
                            int i9 = (int) ((iM203313 / f3) + 0.5f);
                            int iM203314 = m20339(i9, 1);
                            if (i9 != iM203314) {
                                iM203313 = (int) ((iM203314 * f3) + 0.5f);
                            }
                            c22524.mo15463(iM203313);
                            this.f25504.f67409.f25502.mo15463(iM203314);
                        }
                    } else if (z3 && z5) {
                        if (!c5592.f19197 || !c5593.f19197) {
                            return;
                        }
                        float f4 = this.f25504.f67422;
                        int i10 = ((C5590) c5592.f19189.get(0)).f19196 + c5592.f19193;
                        int i11 = ((C5590) c5593.f19189.get(0)).f19196 - c5593.f19193;
                        if (iM46575 == -1) {
                            iM20339 = m20339(i11 - i10, 1);
                            i = (int) ((iM20339 / f4) + 0.5f);
                            iM203310 = m20339(i, 0);
                            if (i != iM203310) {
                                iM20339 = (int) ((iM203310 * f4) + 0.5f);
                            }
                            c22524.mo15463(iM203310);
                            this.f25504.f67409.f25502.mo15463(iM20339);
                        } else if (iM46575 == 0) {
                            int iM203315 = m20339(i11 - i10, 1);
                            int i12 = (int) ((iM203315 * f4) + 0.5f);
                            int iM203316 = m20339(i12, 0);
                            if (i12 != iM203316) {
                                iM203315 = (int) ((iM203316 / f4) + 0.5f);
                            }
                            c22524.mo15463(iM203316);
                            this.f25504.f67409.f25502.mo15463(iM203315);
                        } else if (iM46575 == 1) {
                            iM20339 = m20339(i11 - i10, 1);
                            i = (int) ((iM20339 / f4) + 0.5f);
                            iM203310 = m20339(i, 0);
                            if (i != iM203310) {
                                iM20339 = (int) ((iM203310 * f4) + 0.5f);
                            }
                            c22524.mo15463(iM203310);
                            this.f25504.f67409.f25502.mo15463(iM20339);
                        }
                    }
                } else {
                    int iM46576 = c207111.m46575();
                    if (iM46576 != -1) {
                        if (iM46576 == 0) {
                            C20719 c207113 = this.f25504;
                            f = c207113.f67409.f25502.f19196 / c207113.f67422;
                            i3 = (int) (f + 0.5f);
                        } else if (iM46576 != 1) {
                            i3 = 0;
                        } else {
                            c20719 = this.f25504;
                            i2 = c20719.f67409.f25502.f19196;
                        }
                        c22524.mo15463(i3);
                    } else {
                        c20719 = this.f25504;
                        i2 = c20719.f67409.f25502.f19196;
                    }
                    f = i2 * c20719.f67422;
                    i3 = (int) (f + 0.5f);
                    c22524.mo15463(i3);
                }
            }
        }
        boolean z7 = c5590.f19197;
        ArrayList arrayList2 = c5590.f19189;
        if (z7) {
            boolean z8 = c5591.f19197;
            ArrayList arrayList3 = c5591.f19189;
            if (z8) {
                if (c5590.f19187 && c5591.f19187 && c22524.f19187) {
                    return;
                }
                if (!c22524.f19187 && this.f25507 == EnumC7313.MATCH_CONSTRAINT) {
                    C20719 c207114 = this.f25504;
                    if (c207114.f67395 == 0 && !c207114.m46631()) {
                        C5590 c5594 = (C5590) arrayList2.get(0);
                        C5590 c5595 = (C5590) arrayList3.get(0);
                        int i13 = c5594.f19196 + c5590.f19193;
                        int i14 = c5595.f19196 + c5591.f19193;
                        c5590.mo15463(i13);
                        c5591.mo15463(i14);
                        c22524.mo15463(i14 - i13);
                        return;
                    }
                }
                if (!c22524.f19187 && this.f25507 == EnumC7313.MATCH_CONSTRAINT && this.f25503 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C5590) arrayList3.get(0)).f19196 + c5591.f19193) - (((C5590) arrayList2.get(0)).f19196 + c5590.f19193), c22524.f73492);
                    C20719 c207115 = this.f25504;
                    int i15 = c207115.f67382;
                    int iMax = Math.max(c207115.f67401, iMin);
                    if (i15 > 0) {
                        iMax = Math.min(i15, iMax);
                    }
                    c22524.mo15463(iMax);
                }
                if (c22524.f19187) {
                    C5590 c5596 = (C5590) arrayList2.get(0);
                    C5590 c5597 = (C5590) arrayList3.get(0);
                    int i16 = c5596.f19196 + c5590.f19193;
                    int i17 = c5597.f19196 + c5591.f19193;
                    float fM46582 = this.f25504.m46582();
                    if (c5596 == c5597) {
                        i16 = c5596.f19196;
                        i17 = c5597.f19196;
                        fM46582 = 0.5f;
                    }
                    c5590.mo15463((int) ((((i17 - i16) - c22524.f19196) * fM46582) + i16 + 0.5f));
                    c5591.mo15463(c5590.f19196 + c22524.f19196);
                }
            }
        }
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ܰ */
    public final void mo11824() {
        C5590 c5590 = this.f25501;
        if (c5590.f19187) {
            this.f25504.m46638(c5590.f19196);
        }
    }
}
