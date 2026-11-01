package l;

/* JADX INFO: renamed from: l.᩹ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22019 extends AbstractC17785 implements InterfaceC5791 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71380 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7202 f71381;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final EnumC0851 f71382;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f71383;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11521 f71384;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f71385;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f71386;

    public C22019(EnumC0851 enumC0851, String str, AbstractC7202 abstractC7202, C11521 c11521) {
        this.f71382 = enumC0851;
        this.f71383 = str;
        this.f71381 = abstractC7202;
        this.f71384 = c11521;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22019 m48911(EnumC0851 enumC0851, AbstractC7202 abstractC7202) {
        return new C22019(enumC0851, "", abstractC7202, C11521.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22019 m48910(EnumC0851 enumC0851, String str, AbstractC7202 abstractC7202, C11521 c11521) {
        return new C22019(enumC0851, str, abstractC7202, c11521);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m48912() {
        return this.f71381.mo19145();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m48914() {
        return this.f71382 == EnumC0851.FORCED;
    }

    @Override // l.InterfaceC5791
    /* JADX INFO: renamed from: ۙ */
    public final void mo9550(C18491 c18491) {
        c18491.m42887(this);
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۨ */
    public final int mo10845() {
        if (m48914()) {
            return 1000;
        }
        return this.f71383.length();
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final String mo10842() {
        return this.f71383;
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ܰ */
    public final C9548 mo10846() {
        return AbstractC17785.f56394;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6496 m48913(C6496 c6496, int i, boolean z) {
        C11521 c11521 = this.f71384;
        if (c11521.isPresent()) {
            C2968 c2968 = (C2968) c11521.get();
            c2968.getClass();
            c2968.f11103 = C11521.of(Boolean.valueOf(z));
        }
        if (z) {
            this.f71385 = true;
            int iMax = Math.max(i + this.f71381.mo19145(), 0);
            this.f71386 = iMax;
            return c6496.m17699(iMax);
        }
        this.f71385 = false;
        this.f71386 = -1;
        return c6496.m17699(this.f71383.length() + c6496.f21907);
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final C6496 mo10843(InterfaceC13553 interfaceC13553, C6496 c6496) {
        throw new UnsupportedOperationException("Did you mean computeBreaks(State, int, boolean)?");
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final void mo10844(C18806 c18806) {
        if (this.f71385) {
            c18806.m43377(AbstractC17785.f56394, "\n");
            c18806.m43380(this.f71386);
        } else {
            c18806.m43377(m41374(), this.f71383);
        }
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f71382, "fillMode");
        c23244M37072.m51284((Object) this.f71383, "flat");
        c23244M37072.m51284(this.f71381, "plusIndent");
        c23244M37072.m51284(this.f71384, "optTag");
        return c23244M37072.toString();
    }
}
