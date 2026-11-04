package l;

/* JADX INFO: renamed from: l.᩷ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22152 extends AbstractC11709 implements InterfaceC18422 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71354 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f71355;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15867 f71356;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 f71357;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f71358;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC10963 f71359;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f71360;

    public C22152(EnumC10963 enumC10963, String str, AbstractC3506 abstractC3506, C15867 c15867) {
        this.f71359 = enumC10963;
        this.f71355 = str;
        this.f71357 = abstractC3506;
        this.f71356 = c15867;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22152 m50112(EnumC10963 enumC10963, AbstractC3506 abstractC3506) {
        return new C22152(enumC10963, "", abstractC3506, C15867.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22152 m50111(EnumC10963 enumC10963, String str, AbstractC3506 abstractC3506, C15867 c15867) {
        return new C22152(enumC10963, str, abstractC3506, c15867);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50113() {
        return this.f71357.mo11499();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m50115() {
        return this.f71359 == EnumC10963.FORCED;
    }

    @Override // l.InterfaceC18422
    /* JADX INFO: renamed from: ۙ */
    public final void mo2485(C25136 c25136) {
        c25136.m56045(this);
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۤ */
    public final int mo6935() {
        if (m50115()) {
            return 1000;
        }
        return this.f71355.length();
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final String mo6932() {
        return this.f71355;
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ᩷ */
    public final C2346 mo6938() {
        return AbstractC11709.f37885;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15438 m50114(C15438 c15438, int i, boolean z) {
        C15867 c15867 = this.f71356;
        if (c15867.isPresent()) {
            C9471 c9471 = (C9471) c15867.get();
            c9471.getClass();
            c9471.f30689 = C15867.of(Boolean.valueOf(z));
        }
        if (z) {
            this.f71360 = true;
            int iMax = Math.max(i + this.f71357.mo11499(), 0);
            this.f71358 = iMax;
            return c15438.m36959(iMax);
        }
        this.f71360 = false;
        this.f71358 = -1;
        return c15438.m36959(this.f71355.length() + c15438.f50284);
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final C15438 mo6933(InterfaceC8770 interfaceC8770, C15438 c15438) {
        throw new UnsupportedOperationException("Did you mean computeBreaks(State, int, boolean)?");
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ */
    public final void mo6934(C11338 c11338) {
        if (this.f71360) {
            c11338.m28631(AbstractC11709.f37885, "\n");
            c11338.m28634(this.f71358);
        } else {
            c11338.m28631(m29384(), this.f71355);
        }
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f71359, "fillMode");
        c3179M46714.m10379((Object) this.f71355, "flat");
        c3179M46714.m10379(this.f71357, "plusIndent");
        c3179M46714.m10379(this.f71356, "optTag");
        return c3179M46714.toString();
    }
}
