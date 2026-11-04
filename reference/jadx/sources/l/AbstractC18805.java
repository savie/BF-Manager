package l;

/* JADX INFO: renamed from: l.ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1C7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18805 implements InterfaceC1652 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C24027 f61070;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10445 f61072;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f61075;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC19396 f61076;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17313 f61069 = new C17313(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f61074 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f61073 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16567 f61068 = new C16567(this);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16567 f61071 = new C16567(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC7618 f61077 = EnumC7618.NONE;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10265();

    @Override // l.InterfaceC1652
    /* JADX INFO: renamed from: ۙ */
    public void mo5938(InterfaceC1652 interfaceC1652) {
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo10266();

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo10267();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo10268();

    public AbstractC18805(C10445 c10445) {
        this.f61072 = c10445;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16567 m43598(C0751 c0751) {
        C0751 c0752 = c0751.f2744;
        if (c0752 == null) {
            return null;
        }
        C10445 c10445 = c0752.f2747;
        int i = C0160.f1175[c0752.f2742.ordinal()];
        if (i == 1) {
            return c10445.f33245.f61068;
        }
        if (i == 2) {
            return c10445.f33245.f61071;
        }
        if (i == 3) {
            return c10445.f33195.f61068;
        }
        if (i == 4) {
            return c10445.f33195.f45205;
        }
        if (i != 5) {
            return null;
        }
        return c10445.f33195.f61071;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43602(C0751 c0751, C0751 c0752, int i) {
        C17313 c17313;
        float f;
        int i2;
        C16567 c16567M43598 = m43598(c0751);
        C16567 c16567M43599 = m43598(c0752);
        if (c16567M43598.f53630 && c16567M43599.f53630) {
            int iM3108 = c0751.m3108() + c16567M43598.f53632;
            int iM3109 = c16567M43599.f53632 - c0752.m3108();
            int i3 = iM3109 - iM3108;
            C17313 c17314 = this.f61069;
            if (!c17314.f53630) {
                EnumC19396 enumC19396 = this.f61076;
                EnumC19396 enumC19397 = EnumC19396.MATCH_CONSTRAINT;
                if (enumC19396 == enumC19397) {
                    int i4 = this.f61075;
                    if (i4 == 0) {
                        c17314.mo39242(m43601(i3, i));
                    } else if (i4 == 1) {
                        c17314.mo39242(Math.min(m43601(c17314.f56393, i), i3));
                    } else if (i4 == 2) {
                        C10445 c10445 = this.f61072;
                        C10445 c10446 = c10445.f33252;
                        if (c10446 != null) {
                            C17313 c17315 = (i == 0 ? c10446.f33245 : c10446.f33195).f61069;
                            if (c17315.f53630) {
                                c17314.mo39242(m43601((int) ((c17315.f53632 * (i == 0 ? c10445.f33238 : c10445.f33246)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        C10445 c10447 = this.f61072;
                        AbstractC18805 abstractC18805 = c10447.f33245;
                        if (abstractC18805.f61076 == enumC19397 && abstractC18805.f61075 == 3) {
                            C14329 c14329 = c10447.f33195;
                            if (c14329.f61076 != enumC19397 || c14329.f61075 != 3) {
                                if (i == 0) {
                                    abstractC18805 = c10447.f33195;
                                }
                                c17313 = abstractC18805.f61069;
                                if (c17313.f53630) {
                                    f = c10447.f33239;
                                    if (i == 1) {
                                        i2 = (int) ((c17313.f53632 / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * c17313.f53632) + 0.5f);
                                    }
                                    c17314.mo39242(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                abstractC18805 = c10447.f33195;
                            }
                            c17313 = abstractC18805.f61069;
                            if (c17313.f53630) {
                                f = c10447.f33239;
                                if (i == 1) {
                                    i2 = (int) ((c17313.f53632 / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c17313.f53632) + 0.5f);
                                }
                                c17314.mo39242(i2);
                            }
                        }
                    }
                }
            }
            if (c17314.f53630) {
                int i5 = c17314.f53632;
                C16567 c16567 = this.f61071;
                C16567 c16568 = this.f61068;
                if (i5 == i3) {
                    c16568.mo39242(iM3108);
                    c16567.mo39242(iM3109);
                    return;
                }
                C10445 c10448 = this.f61072;
                float fM26802 = i == 0 ? c10448.m26802() : c10448.m26835();
                if (c16567M43598 == c16567M43599) {
                    iM3108 = c16567M43598.f53632;
                    iM3109 = c16567M43599.f53632;
                    fM26802 = 0.5f;
                }
                c16568.mo39242((int) ((((iM3109 - iM3108) - c17314.f53632) * fM26802) + iM3108 + 0.5f));
                c16567.mo39242(c16568.f53632 + c17314.f53632);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43601(int i, int i2) {
        if (i2 == 0) {
            C10445 c10445 = this.f61072;
            int i3 = c10445.f33201;
            int iMax = Math.max(c10445.f33215, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C10445 c10446 = this.f61072;
            int i4 = c10446.f33222;
            int iMax2 = Math.max(c10446.f33244, i);
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
    public static C16567 m43599(C0751 c0751, int i) {
        C0751 c0752 = c0751.f2744;
        if (c0752 == null) {
            return null;
        }
        C10445 c10445 = c0752.f2747;
        AbstractC18805 abstractC18805 = i == 0 ? c10445.f33245 : c10445.f33195;
        int i2 = C0160.f1175[c0752.f2742.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC18805.f61071;
        }
        return abstractC18805.f61068;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43600(C16567 c16567, C16567 c16568, int i) {
        c16567.f53625.add(c16568);
        c16567.f53628 = i;
        c16568.f53634.add(c16567);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43603(C16567 c16567, C16567 c16568, int i, C17313 c17313) {
        c16567.f53625.add(c16568);
        c16567.f53625.add(this.f61069);
        c16567.f53633 = i;
        c16567.f53635 = c17313;
        c16568.f53634.add(c16567);
        c17313.f53634.add(c16567);
    }

    /* JADX INFO: renamed from: ᩸ */
    public long mo16069() {
        C17313 c17313 = this.f61069;
        if (c17313.f53630) {
            return c17313.f53632;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m43604() {
        return this.f61073;
    }
}
