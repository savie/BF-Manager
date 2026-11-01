package l;

/* JADX INFO: renamed from: l.ۖۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2463 implements InterfaceC6927 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f9812 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5286 f9813;

    public C2463(C5286 c5286) {
        this.f9813 = c5286;
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7547(C2693 c2693) {
        this.f9812 = this.f9813.m14581(c2693.f75167.mo1933(), c2693.f10382);
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7551(C13984 c13984) {
        AbstractC16579 abstractC16579 = c13984.f45980;
        C5286 c5286 = this.f9813;
        C23570 c23570M14626 = c5286.m14626(c5286.m14634(abstractC16579), new C6263(25L, c5286.f18295.f77615, abstractC16579, abstractC16579.f53222));
        c23570M14626.f30190 = c5286.f18291.f14283;
        this.f9812 = c23570M14626;
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7549(C5516 c5516) {
        this.f9812 = this.f9813.m14641(c5516.f18928);
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7552(C22450 c22450) {
        boolean z = c22450 instanceof C4104;
        C5286 c5286 = this.f9813;
        if (z) {
            C5954 c5954 = ((C4104) c22450).f15041;
            C23570 c23570M14626 = c5286.m14626(c5286.m14634(c5954), new C6263(25L, c5286.f18295.f77615, c5954, c5954.f53222));
            c23570M14626.f30190 = c5286.f18291.f14283;
            this.f9812 = c23570M14626;
            return;
        }
        this.f9812 = c5286.m14644();
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7550(C11867 c11867) {
        if (c11867 instanceof C13278) {
            this.f9812 = m7546((C13278) c11867);
        } else {
            this.f9812 = m7553(c11867);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5224 m7553(C11867 c11867) {
        C19003 c19003 = new C19003();
        C21825 c21825 = c11867.f39809;
        while (true) {
            boolean zM48595 = c21825.m48595();
            C5286 c5286 = this.f9813;
            if (zM48595) {
                C2068 c2068 = (C2068) c21825.f70876;
                ((AbstractC23156) c2068.f7665).mo4166(this);
                AbstractC5930 abstractC5930 = this.f9812;
                C3812 c3812M14587 = c5286.m14587((AbstractC5930) c5286.m14586((AbstractC23903) c2068.f7664), abstractC5930);
                c3812M14587.f30190 = abstractC5930.f30190;
                c19003.m43723(c3812M14587);
                c21825 = c21825.f70877;
            } else {
                return c5286.m14589((AbstractC8774) c5286.m14634(c11867.f75167), c19003.m43726());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5224 m7546(C13278 c13278) {
        C19003 c19003 = new C19003();
        C21825 c21825 = c13278.f39809;
        while (true) {
            boolean zM48595 = c21825.m48595();
            C5286 c5286 = this.f9813;
            if (zM48595) {
                C2068 c2068 = (C2068) c21825.f70876;
                ((AbstractC23156) c2068.f7665).mo4166(this);
                AbstractC5930 abstractC5930 = this.f9812;
                C3812 c3812M14587 = c5286.m14587((AbstractC5930) c5286.m14586((AbstractC23903) c2068.f7664), abstractC5930);
                c3812M14587.f30190 = abstractC5930.f30190;
                c19003.m43723(c3812M14587);
                c21825 = c21825.f70877;
            } else {
                return c5286.m14633((AbstractC8774) c5286.m14634(c13278.f75167), c19003.m43726());
            }
        }
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7548(C4810 c4810) {
        C19003 c19003 = new C19003();
        int i = 0;
        while (true) {
            AbstractC23156[] abstractC23156Arr = c4810.f16902;
            if (i >= abstractC23156Arr.length) {
                C18961 c18961M14647 = this.f9813.m14647(null, C21825.m48588(), c19003.m43726());
                c18961M14647.f30190 = c4810.f75167;
                this.f9812 = c18961M14647;
                return;
            }
            abstractC23156Arr[i].mo4166(this);
            c19003.m43723(this.f9812);
            i++;
        }
    }
}
