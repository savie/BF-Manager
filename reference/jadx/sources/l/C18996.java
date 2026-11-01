package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 819P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18996 extends AbstractC7707 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C14370 f61487;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C5590 f61488;

    public C18996(C20719 c20719) {
        super(c20719);
        C5590 c5590 = new C5590(this);
        this.f61488 = c5590;
        this.f61487 = null;
        this.f25501.f19192 = EnumC2767.TOP;
        this.f25505.f19192 = EnumC2767.BOTTOM;
        c5590.f19192 = EnumC2767.BASELINE;
        this.f25508 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f25504.m46643();
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۨ */
    public final void mo11823() {
        this.f25506 = null;
        this.f25501.m15462();
        this.f25505.m15462();
        this.f61488.m15462();
        this.f25502.m15462();
        this.f25499 = false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m43699() {
        this.f25499 = false;
        C5590 c5590 = this.f25501;
        c5590.m15462();
        c5590.f19187 = false;
        C5590 c5591 = this.f25505;
        c5591.m15462();
        c5591.f19187 = false;
        C5590 c5592 = this.f61488;
        c5592.m15462();
        c5592.f19187 = false;
        this.f25502.f19187 = false;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11825() {
        return this.f25507 != EnumC7313.MATCH_CONSTRAINT || this.f25504.f67375 == 0;
    }

    @Override // l.AbstractC7707, l.InterfaceC14058
    /* JADX INFO: renamed from: ۙ */
    public final void mo11822(InterfaceC14058 interfaceC14058) {
        C20719 c20719;
        int i;
        float f;
        int i2;
        if (C18290.f58348[this.f25500.ordinal()] == 3) {
            C20719 c207110 = this.f25504;
            m20341(c207110.f67392, c207110.f67387, 1);
            return;
        }
        C22524 c22524 = this.f25502;
        if (c22524.f19197 && !c22524.f19187 && this.f25507 == EnumC7313.MATCH_CONSTRAINT) {
            C20719 c207111 = this.f25504;
            int i3 = c207111.f67375;
            if (i3 != 2) {
                if (i3 == 3 && c207111.f67376.f25502.f19187) {
                    int iM46575 = c207111.m46575();
                    if (iM46575 == -1) {
                        c20719 = this.f25504;
                        i = c20719.f67376.f25502.f19196;
                    } else {
                        if (iM46575 == 0) {
                            C20719 c207112 = this.f25504;
                            f = c207112.f67376.f25502.f19196 * c207112.f67422;
                            i2 = (int) (f + 0.5f);
                        } else if (iM46575 != 1) {
                            i2 = 0;
                        } else {
                            c20719 = this.f25504;
                            i = c20719.f67376.f25502.f19196;
                        }
                        c22524.mo15463(i2);
                    }
                    f = i / c20719.f67422;
                    i2 = (int) (f + 0.5f);
                    c22524.mo15463(i2);
                }
            } else {
                C20719 c207113 = c207111.f67433;
                if (c207113 != null) {
                    C22524 c22525 = c207113.f67409.f25502;
                    if (c22525.f19187) {
                        c22524.mo15463((int) ((c22525.f19196 * c207111.f67377) + 0.5f));
                    }
                }
            }
        }
        C5590 c5590 = this.f25501;
        boolean z = c5590.f19197;
        ArrayList arrayList = c5590.f19189;
        if (z) {
            C5590 c5591 = this.f25505;
            boolean z2 = c5591.f19197;
            ArrayList arrayList2 = c5591.f19189;
            if (z2) {
                if (c5590.f19187 && c5591.f19187 && c22524.f19187) {
                    return;
                }
                if (!c22524.f19187 && this.f25507 == EnumC7313.MATCH_CONSTRAINT) {
                    C20719 c207114 = this.f25504;
                    if (c207114.f67395 == 0 && !c207114.m46632()) {
                        C5590 c5592 = (C5590) arrayList.get(0);
                        C5590 c5593 = (C5590) arrayList2.get(0);
                        int i4 = c5592.f19196 + c5590.f19193;
                        int i5 = c5593.f19196 + c5591.f19193;
                        c5590.mo15463(i4);
                        c5591.mo15463(i5);
                        c22524.mo15463(i5 - i4);
                        return;
                    }
                }
                if (!c22524.f19187 && this.f25507 == EnumC7313.MATCH_CONSTRAINT && this.f25503 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C5590 c5594 = (C5590) arrayList.get(0);
                    int i6 = (((C5590) arrayList2.get(0)).f19196 + c5591.f19193) - (c5594.f19196 + c5590.f19193);
                    int i7 = c22524.f73492;
                    if (i6 < i7) {
                        c22524.mo15463(i6);
                    } else {
                        c22524.mo15463(i7);
                    }
                }
                if (c22524.f19187 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C5590 c5595 = (C5590) arrayList.get(0);
                    C5590 c5596 = (C5590) arrayList2.get(0);
                    int i8 = c5595.f19196 + c5590.f19193;
                    int i9 = c5596.f19196 + c5591.f19193;
                    float fM46609 = this.f25504.m46609();
                    if (c5595 == c5596) {
                        i8 = c5595.f19196;
                        i9 = c5596.f19196;
                        fM46609 = 0.5f;
                    }
                    c5590.mo15463((int) ((((i9 - i8) - c22524.f19196) * fM46609) + i8 + 0.5f));
                    c5591.mo15463(c5590.f19196 + c22524.f19196);
                }
            }
        }
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
            c22524.mo15463(c207113.m46619());
        }
        boolean z2 = c22524.f19187;
        ArrayList arrayList = c22524.f19195;
        ArrayList arrayList2 = c22524.f19189;
        C5590 c5590 = this.f25505;
        C5590 c5591 = this.f25501;
        if (!z2) {
            C20719 c207114 = this.f25504;
            this.f25507 = c207114.f67434[1];
            if (c207114.m46574()) {
                this.f61487 = new C14370(this);
            }
            EnumC7313 enumC7313 = this.f25507;
            if (enumC7313 != EnumC7313.MATCH_CONSTRAINT) {
                if (enumC7313 == EnumC7313.MATCH_PARENT && (c207112 = this.f25504.f67433) != null && c207112.f67434[1] == EnumC7313.FIXED) {
                    int iM46619 = (c207112.m46619() - this.f25504.f67392.m22577()) - this.f25504.f67387.m22577();
                    AbstractC7707.m20338(c5591, c207112.f67409.f25501, this.f25504.f67392.m22577());
                    AbstractC7707.m20338(c5590, c207112.f67409.f25505, -this.f25504.f67387.m22577());
                    c22524.mo15463(iM46619);
                    return;
                }
                if (enumC7313 == EnumC7313.FIXED) {
                    c22524.mo15463(this.f25504.m46619());
                }
            }
        } else if (this.f25507 == EnumC7313.MATCH_PARENT && (c207110 = (c20719 = this.f25504).f67433) != null && c207110.f67434[1] == EnumC7313.FIXED) {
            AbstractC7707.m20338(c5591, c207110.f67409.f25501, c20719.f67392.m22577());
            AbstractC7707.m20338(c5590, c207110.f67409.f25505, -this.f25504.f67387.m22577());
            return;
        }
        boolean z3 = c22524.f19187;
        C5590 c5592 = this.f61488;
        if (z3) {
            C20719 c207115 = this.f25504;
            if (c207115.f67403) {
                C8725[] c8725Arr = c207115.f67398;
                C8725 c8725 = c8725Arr[2];
                C8725 c8726 = c8725.f29981;
                if (c8726 != null && c8725Arr[3].f29981 != null) {
                    if (c207115.m46632()) {
                        c5591.f19193 = this.f25504.f67398[2].m22577();
                        c5590.f19193 = -this.f25504.f67398[3].m22577();
                    } else {
                        C5590 c5590M20336 = AbstractC7707.m20336(this.f25504.f67398[2]);
                        if (c5590M20336 != null) {
                            AbstractC7707.m20338(c5591, c5590M20336, this.f25504.f67398[2].m22577());
                        }
                        C5590 c5590M20337 = AbstractC7707.m20336(this.f25504.f67398[3]);
                        if (c5590M20337 != null) {
                            AbstractC7707.m20338(c5590, c5590M20337, -this.f25504.f67398[3].m22577());
                        }
                        c5591.f19190 = true;
                        c5590.f19190 = true;
                    }
                    if (this.f25504.m46574()) {
                        AbstractC7707.m20338(c5592, c5591, this.f25504.m46614());
                        return;
                    }
                    return;
                }
                if (c8726 != null) {
                    C5590 c5590M20338 = AbstractC7707.m20336(c8725);
                    if (c5590M20338 != null) {
                        AbstractC7707.m20338(c5591, c5590M20338, this.f25504.f67398[2].m22577());
                        AbstractC7707.m20338(c5590, c5591, c22524.f19196);
                        if (this.f25504.m46574()) {
                            AbstractC7707.m20338(c5592, c5591, this.f25504.m46614());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C8725 c8727 = c8725Arr[3];
                if (c8727.f29981 != null) {
                    C5590 c5590M20339 = AbstractC7707.m20336(c8727);
                    if (c5590M20339 != null) {
                        AbstractC7707.m20338(c5590, c5590M20339, -this.f25504.f67398[3].m22577());
                        AbstractC7707.m20338(c5591, c5590, -c22524.f19196);
                    }
                    if (this.f25504.m46574()) {
                        AbstractC7707.m20338(c5592, c5591, this.f25504.m46614());
                        return;
                    }
                    return;
                }
                C8725 c8728 = c8725Arr[4];
                if (c8728.f29981 != null) {
                    C5590 c5590M203310 = AbstractC7707.m20336(c8728);
                    if (c5590M203310 != null) {
                        AbstractC7707.m20338(c5592, c5590M203310, 0);
                        AbstractC7707.m20338(c5591, c5592, -this.f25504.m46614());
                        AbstractC7707.m20338(c5590, c5591, c22524.f19196);
                        return;
                    }
                    return;
                }
                if ((c207115 instanceof C17191) || c207115.f67433 == null || c207115.mo30461(EnumC19308.CENTER).f29981 != null) {
                    return;
                }
                C20719 c207116 = this.f25504;
                AbstractC7707.m20338(c5591, c207116.f67433.f67409.f25501, c207116.m46639());
                AbstractC7707.m20338(c5590, c5591, c22524.f19196);
                if (this.f25504.m46574()) {
                    AbstractC7707.m20338(c5592, c5591, this.f25504.m46614());
                    return;
                }
                return;
            }
        }
        if (z3 || this.f25507 != EnumC7313.MATCH_CONSTRAINT) {
            c22524.m15464((AbstractC7707) this);
        } else {
            C20719 c207117 = this.f25504;
            int i = c207117.f67375;
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
            } else if (i == 3 && !c207117.m46632()) {
                C20719 c207119 = this.f25504;
                if (c207119.f67395 != 3) {
                    C22524 c22526 = c207119.f67376.f25502;
                    arrayList2.add(c22526);
                    c22526.f19195.add(c22524);
                    c22524.f19190 = true;
                    arrayList.add(c5591);
                    arrayList.add(c5590);
                }
            }
        }
        C20719 c207120 = this.f25504;
        C8725[] c8725Arr2 = c207120.f67398;
        C8725 c8729 = c8725Arr2[2];
        C8725 c87210 = c8729.f29981;
        if (c87210 != null && c8725Arr2[3].f29981 != null) {
            if (c207120.m46632()) {
                c5591.f19193 = this.f25504.f67398[2].m22577();
                c5590.f19193 = -this.f25504.f67398[3].m22577();
            } else {
                C5590 c5590M203311 = AbstractC7707.m20336(this.f25504.f67398[2]);
                C5590 c5590M203312 = AbstractC7707.m20336(this.f25504.f67398[3]);
                c5590M203311.m15464((AbstractC7707) this);
                c5590M203312.m15464((AbstractC7707) this);
                this.f25500 = EnumC10530.CENTER;
            }
            if (this.f25504.m46574()) {
                m20340(c5592, c5591, 1, this.f61487);
            }
        } else if (c87210 != null) {
            C5590 c5590M203313 = AbstractC7707.m20336(c8729);
            if (c5590M203313 != null) {
                AbstractC7707.m20338(c5591, c5590M203313, this.f25504.f67398[2].m22577());
                m20340(c5590, c5591, 1, c22524);
                if (this.f25504.m46574()) {
                    m20340(c5592, c5591, 1, this.f61487);
                }
                EnumC7313 enumC7314 = this.f25507;
                EnumC7313 enumC7315 = EnumC7313.MATCH_CONSTRAINT;
                if (enumC7314 == enumC7315) {
                    C20719 c207121 = this.f25504;
                    if (c207121.f67422 > 0.0f) {
                        C15469 c15469 = c207121.f67376;
                        if (c15469.f25507 == enumC7315) {
                            c15469.f25502.f19195.add(c22524);
                            arrayList2.add(this.f25504.f67376.f25502);
                            c22524.f19198 = this;
                        }
                    }
                }
            }
        } else {
            C8725 c87211 = c8725Arr2[3];
            if (c87211.f29981 != null) {
                C5590 c5590M203314 = AbstractC7707.m20336(c87211);
                if (c5590M203314 != null) {
                    AbstractC7707.m20338(c5590, c5590M203314, -this.f25504.f67398[3].m22577());
                    m20340(c5591, c5590, -1, c22524);
                    if (this.f25504.m46574()) {
                        m20340(c5592, c5591, 1, this.f61487);
                    }
                }
            } else {
                C8725 c87212 = c8725Arr2[4];
                if (c87212.f29981 != null) {
                    C5590 c5590M203315 = AbstractC7707.m20336(c87212);
                    if (c5590M203315 != null) {
                        AbstractC7707.m20338(c5592, c5590M203315, 0);
                        m20340(c5591, c5592, -1, this.f61487);
                        m20340(c5590, c5591, 1, c22524);
                    }
                } else if (!(c207120 instanceof C17191) && (c207111 = c207120.f67433) != null) {
                    AbstractC7707.m20338(c5591, c207111.f67409.f25501, c207120.m46639());
                    m20340(c5590, c5591, 1, c22524);
                    if (this.f25504.m46574()) {
                        m20340(c5592, c5591, 1, this.f61487);
                    }
                    EnumC7313 enumC7316 = this.f25507;
                    EnumC7313 enumC7317 = EnumC7313.MATCH_CONSTRAINT;
                    if (enumC7316 == enumC7317) {
                        C20719 c207122 = this.f25504;
                        if (c207122.f67422 > 0.0f) {
                            C15469 c154610 = c207122.f67376;
                            if (c154610.f25507 == enumC7317) {
                                c154610.f25502.f19195.add(c22524);
                                arrayList2.add(this.f25504.f67376.f25502);
                                c22524.f19198 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c22524.f19197 = true;
        }
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ܰ */
    public final void mo11824() {
        C5590 c5590 = this.f25501;
        if (c5590.f19187) {
            this.f25504.m46610(c5590.f19196);
        }
    }
}
