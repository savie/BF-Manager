package l;

/* JADX INFO: renamed from: l.ۜ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes2.dex */
public final class C6451 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6966 f21819;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f21823;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5040 f21824;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22680 f21825;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19003 f21821 = new C19003();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19003 f21820 = new C19003();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f21822 = null;

    public C6451(C22680 c22680, C6966 c6966, C5040 c5040, AbstractC23903 abstractC23903) {
        this.f21825 = c22680;
        this.f21819 = c6966;
        this.f21824 = c5040;
        this.f21823 = abstractC23903;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22489 m17641() {
        AbstractC5930 abstractC5930M17637;
        C6966 c6966 = this.f21819;
        C22680 c22680 = this.f21825;
        int i = c22680.f73854.f18294;
        try {
            c22680.f73854.m14629((InterfaceC12260) c6966);
            C6263 c6263M17640 = m17640();
            if (c6966.f23414 == EnumC13901.INVOKE) {
                abstractC5930M17637 = m17638(c6263M17640);
            } else {
                abstractC5930M17637 = m17637();
            }
            C22489 c22489M14650 = c22680.f73854.m14650((AbstractC8774) abstractC5930M17637, this.f21820.m43726());
            c22489M14650.f6716 = c6966.f6716;
            c22489M14650.f30190 = c6966.f30190;
            c22489M14650.f30189 = c6966.f30189;
            return c22489M14650;
        } finally {
            c22680.f73854.f18294 = i;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m17642() {
        return this.f21822;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC5930 m17638(C6263 c6263) {
        AbstractC5930 abstractC5930M14586;
        C6966 c6966 = this.f21819;
        C22680 c22680 = this.f21825;
        if (c6263 != null) {
            abstractC5930M14586 = c22680.f73854.m14586((AbstractC23903) c6263);
            AbstractC16579 abstractC16579 = (!c6966.f23409 || C22680.m50225(c22680, c6966.f23412, this.f21823)) ? c6966.f23408.f30190 : c6966.f23412.m52720().f77449;
            if (abstractC16579 == c22680.f73844.f14258.f77449) {
                abstractC16579 = c6966.f23408.f30190;
            }
            if (!c6263.f77449.f53222.mo50008((AbstractC23903) abstractC16579.f53222, c22680.f73852)) {
                abstractC5930M14586 = c22680.f73854.m14583((AbstractC8774) c22680.f73854.m14634(abstractC16579), abstractC5930M14586);
                abstractC5930M14586.f30190 = abstractC16579;
            }
        } else {
            abstractC5930M14586 = c6966.f23408;
        }
        C23570 c23570M14625 = c22680.f73854.m14625(abstractC5930M14586, c6966.f23412.f77453);
        AbstractC23903 abstractC23903 = c6966.f23412;
        c23570M14625.f76355 = abstractC23903;
        c23570M14625.f30190 = abstractC23903.mo50006(c22680.f73852);
        C5286 c5286 = c22680.f73854;
        C21825 c21825M48588 = C21825.m48588();
        AbstractC23903 abstractC23904 = c6966.f23412;
        C21825 c21825M43726 = this.f21821.m43726();
        C22680.m50224(c22680, abstractC23904, c21825M43726, c6966.f23405);
        C15434 c15434M14610 = c5286.m14610(c23570M14625, c21825M48588, c21825M43726);
        c15434M14610.f30190 = c6966.f23412.mo50006(c22680.f73852).mo16235();
        AbstractC5930 abstractC5930M33045 = c22680.f73857.m33045(c22680.f73852.m52402(((C6966) this.f21824.f3413).f23407.mo16235()), c22680.f73840, c15434M14610);
        C22680.m50231(c6966.f23405, abstractC5930M33045);
        return abstractC5930M33045;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private AbstractC5930 m17637() {
        C6966 c6966 = this.f21819;
        EnumC4143 enumC4143 = c6966.f23410;
        EnumC4143 enumC4144 = EnumC4143.f15156;
        C22680 c22680 = this.f21825;
        if (enumC4143 == enumC4144) {
            C5286 c5286 = c22680.f73854;
            AbstractC5930 abstractC5930M14634 = c22680.f73854.m14634(c22680.f73852.m52416(c6966.f23408.f30190));
            C5286 c5287 = c22680.f73854;
            C6656 c6656 = (C6656) this.f21820.first();
            c5287.getClass();
            C18961 c18961M14647 = c5286.m14647(abstractC5930M14634, C21825.of((Object) c5287.m14586((AbstractC23903) c6656.f22475)), null);
            c18961M14647.f30190 = c6966.f23408.f30190;
            return c18961M14647;
        }
        C5286 c5288 = c22680.f73854;
        C21825 c21825M48588 = C21825.m48588();
        AbstractC5930 abstractC5930M14635 = c22680.f73854.m14634(c6966.f23408.f30190);
        AbstractC23903 abstractC23903 = c6966.f23412;
        C21825 c21825M43726 = this.f21821.m43726();
        C22680.m50224(c22680, abstractC23903, c21825M43726, c6966.f23405);
        C8378 c8378M14600 = c5288.m14600((AbstractC5930) null, c21825M48588, abstractC5930M14635, c21825M43726, (C8753) null, false);
        AbstractC23903 abstractC23904 = c6966.f23412;
        c8378M14600.f29097 = abstractC23904;
        c8378M14600.f29100 = abstractC23904.mo50006(c22680.f73852);
        c8378M14600.f30190 = c6966.f23408.f30190;
        C22680.m50231(c6966.f23405, c8378M14600);
        return c8378M14600;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6263 m17639(String str, AbstractC16579 abstractC16579, boolean z) {
        C22680 c22680 = this.f21825;
        C6263 c6263 = new C6263(8589938688L, c22680.f73845.f77631.m17389(str), abstractC16579, this.f21823);
        c6263.f21226 = this.f21819.f30189;
        this.f21820.m43723(c22680.f73854.m14594(c6263, (AbstractC5930) null));
        if (z) {
            this.f21821.m43723(c22680.f73854.m14586((AbstractC23903) c6263));
        }
        return c6263;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6263 m17640() {
        C6263 c6263M17639;
        C5040 c5040 = this.f21824;
        C22680 c22680 = c5040.f17606.f42638;
        C23800 c23800 = c22680.f73852;
        C23800 c23801 = c22680.f73852;
        AbstractC1696 abstractC1696 = c5040.f3413;
        AbstractC16579 abstractC16579M52402 = c23800.m52402(c23801.m52385(((C6966) abstractC1696).f6716.f53222).f77449);
        C21825 c21825Mo33523 = abstractC16579M52402.mo33523();
        C22680 c22681 = this.f21825;
        C23800 c23802 = c22681.f73852;
        C6966 c6966 = this.f21819;
        C21825 c21825Mo33524 = c6966.m5634(c23802).mo33523();
        int i = C16702.f53494[c6966.f23410.ordinal()];
        if (i == 3) {
            c6263M17639 = m17639("rec$", c6966.f23408.f30190, false);
            this.f21822 = c22681.f73848.m18295(c6966.f23408);
        } else if (i != 4) {
            c6263M17639 = null;
        } else {
            c6263M17639 = m17639("rec$", (AbstractC16579) abstractC16579M52402.mo33523().f70876, false);
            c21825Mo33523 = c21825Mo33523.f70877;
            c21825Mo33524 = c21825Mo33524.f70877;
        }
        C21825 c21825Mo33525 = c6966.f23412.f77449.mo33523();
        int iM48596 = c21825Mo33525.m48596();
        int iM48597 = c21825Mo33523.m48596();
        int i2 = ((C6966) abstractC1696).f23405 != null ? iM48596 - 1 : iM48596;
        boolean z = c6966.f23405 != null || iM48596 == c21825Mo33524.m48596();
        for (int i3 = 0; c21825Mo33525.m48595() && i3 < i2; i3++) {
            AbstractC16579 abstractC16579 = (AbstractC16579) c21825Mo33525.f70876;
            if (z) {
                EnumC19688 enumC19688Mo1931 = ((AbstractC16579) c21825Mo33524.f70876).mo1931();
                EnumC19688 enumC19688 = EnumC19688.INTERSECTION;
                if (enumC19688Mo1931 == enumC19688) {
                    abstractC16579 = (AbstractC16579) c21825Mo33523.f70876;
                }
                if (((AbstractC16579) c21825Mo33524.f70876).mo1931() == EnumC19688.TYPEVAR && ((C22929) c21825Mo33524.f70876).mo18112().mo1931() == enumC19688) {
                    abstractC16579 = (AbstractC16579) c21825Mo33523.f70876;
                }
            }
            m17639(C8479.m22141(i3, "x$"), abstractC16579, true);
            c21825Mo33525 = c21825Mo33525.f70877;
            c21825Mo33523 = c21825Mo33523.f70877;
            c21825Mo33524 = c21825Mo33524.f70877;
        }
        while (i2 < iM48597) {
            m17639(C8479.m22141(i2, "xva$"), c6966.f23405, true);
            i2++;
        }
        return c6263M17639;
    }
}
