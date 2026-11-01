package l;

/* JADX INFO: renamed from: l.۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1C7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7707 implements InterfaceC14058 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25503;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C20719 f25504;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21818 f25506;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC7313 f25507;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22524 f25502 = new C22524(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25508 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f25499 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C5590 f25501 = new C5590(this);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C5590 f25505 = new C5590(this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC10530 f25500 = EnumC10530.NONE;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11821();

    @Override // l.InterfaceC14058
    /* JADX INFO: renamed from: ۙ */
    public void mo11822(InterfaceC14058 interfaceC14058) {
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo11823();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo11824();

    /* JADX INFO: renamed from: ᩹ */
    public abstract boolean mo11825();

    public AbstractC7707(C20719 c20719) {
        this.f25504 = c20719;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5590 m20336(C8725 c8725) {
        C8725 c8726 = c8725.f29981;
        if (c8726 == null) {
            return null;
        }
        C20719 c20719 = c8726.f29983;
        int i = C9119.f31056[c8726.f29977.ordinal()];
        if (i == 1) {
            return c20719.f67376.f25501;
        }
        if (i == 2) {
            return c20719.f67376.f25505;
        }
        if (i == 3) {
            return c20719.f67409.f25501;
        }
        if (i == 4) {
            return c20719.f67409.f61488;
        }
        if (i != 5) {
            return null;
        }
        return c20719.f67409.f25505;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20341(C8725 c8725, C8725 c8726, int i) {
        C22524 c22524;
        float f;
        int i2;
        C5590 c5590M20336 = m20336(c8725);
        C5590 c5590M20337 = m20336(c8726);
        if (c5590M20336.f19187 && c5590M20337.f19187) {
            int iM22577 = c8725.m22577() + c5590M20336.f19196;
            int iM22578 = c5590M20337.f19196 - c8726.m22577();
            int i3 = iM22578 - iM22577;
            C22524 c22525 = this.f25502;
            if (!c22525.f19187) {
                EnumC7313 enumC7313 = this.f25507;
                EnumC7313 enumC7314 = EnumC7313.MATCH_CONSTRAINT;
                if (enumC7313 == enumC7314) {
                    int i4 = this.f25503;
                    if (i4 == 0) {
                        c22525.mo15463(m20339(i3, i));
                    } else if (i4 == 1) {
                        c22525.mo15463(Math.min(m20339(c22525.f73492, i), i3));
                    } else if (i4 == 2) {
                        C20719 c20719 = this.f25504;
                        C20719 c207110 = c20719.f67433;
                        if (c207110 != null) {
                            C22524 c22526 = (i == 0 ? c207110.f67376 : c207110.f67409).f25502;
                            if (c22526.f19187) {
                                c22525.mo15463(m20339((int) ((c22526.f19196 * (i == 0 ? c20719.f67384 : c20719.f67377)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        C20719 c207111 = this.f25504;
                        AbstractC7707 abstractC7707 = c207111.f67376;
                        if (abstractC7707.f25507 == enumC7314 && abstractC7707.f25503 == 3) {
                            C18996 c18996 = c207111.f67409;
                            if (c18996.f25507 != enumC7314 || c18996.f25503 != 3) {
                                if (i == 0) {
                                    abstractC7707 = c207111.f67409;
                                }
                                c22524 = abstractC7707.f25502;
                                if (c22524.f19187) {
                                    f = c207111.f67422;
                                    if (i == 1) {
                                        i2 = (int) ((c22524.f19196 / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * c22524.f19196) + 0.5f);
                                    }
                                    c22525.mo15463(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                abstractC7707 = c207111.f67409;
                            }
                            c22524 = abstractC7707.f25502;
                            if (c22524.f19187) {
                                f = c207111.f67422;
                                if (i == 1) {
                                    i2 = (int) ((c22524.f19196 / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c22524.f19196) + 0.5f);
                                }
                                c22525.mo15463(i2);
                            }
                        }
                    }
                }
            }
            if (c22525.f19187) {
                int i5 = c22525.f19196;
                C5590 c5590 = this.f25505;
                C5590 c5591 = this.f25501;
                if (i5 == i3) {
                    c5591.mo15463(iM22577);
                    c5590.mo15463(iM22578);
                    return;
                }
                C20719 c207112 = this.f25504;
                float fM46582 = i == 0 ? c207112.m46582() : c207112.m46609();
                if (c5590M20336 == c5590M20337) {
                    iM22577 = c5590M20336.f19196;
                    iM22578 = c5590M20337.f19196;
                    fM46582 = 0.5f;
                }
                c5591.mo15463((int) ((((iM22578 - iM22577) - c22525.f19196) * fM46582) + iM22577 + 0.5f));
                c5590.mo15463(c5591.f19196 + c22525.f19196);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20339(int i, int i2) {
        if (i2 == 0) {
            C20719 c20719 = this.f25504;
            int i3 = c20719.f67382;
            int iMax = Math.max(c20719.f67401, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C20719 c207110 = this.f25504;
            int i4 = c207110.f67378;
            int iMax2 = Math.max(c207110.f67407, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5590 m20337(C8725 c8725, int i) {
        C8725 c8726 = c8725.f29981;
        if (c8726 == null) {
            return null;
        }
        C20719 c20719 = c8726.f29983;
        AbstractC7707 abstractC7707 = i == 0 ? c20719.f67376 : c20719.f67409;
        int i2 = C9119.f31056[c8726.f29977.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC7707.f25505;
        }
        return abstractC7707.f25501;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20338(C5590 c5590, C5590 c5591, int i) {
        c5590.f19189.add(c5591);
        c5590.f19193 = i;
        c5591.f19195.add(c5590);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20340(C5590 c5590, C5590 c5591, int i, C22524 c22524) {
        c5590.f19189.add(c5591);
        c5590.f19189.add(this.f25502);
        c5590.f19191 = i;
        c5590.f19188 = c22524;
        c5591.f19195.add(c5590);
        c22524.f19195.add(c5590);
    }

    /* JADX INFO: renamed from: ۖ */
    public long mo13593() {
        C22524 c22524 = this.f25502;
        if (c22524.f19187) {
            return c22524.f19196;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20342() {
        return this.f25499;
    }
}
