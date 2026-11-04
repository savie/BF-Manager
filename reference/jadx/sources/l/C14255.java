package l;

/* JADX INFO: renamed from: l.ܰ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public class C14255 implements InterfaceC16493 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7323 f45061;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3815 f45062;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Class f45063;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f45064;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f45065;

    public C14255(C7323 c7323, String str, Class cls, Class cls2, String str2) {
        boolean z = c7323.m20098() != null;
        this.f45065 = z;
        boolean zM20095 = c7323.m20095();
        this.f45064 = zM20095;
        C3815 c3815 = new C3815(str, cls, cls2, str2, z, zM20095);
        this.f45061 = c7323;
        this.f45063 = c3815.f13014.getReturnType();
        this.f45062 = c3815;
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public Object mo10006(AbstractC9035 abstractC9035) {
        return this.f45062.m12347(abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public Object mo10008(AbstractC15001 abstractC15001) {
        return this.f45062.m12353(abstractC15001);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۤ */
    public Object mo30209(AbstractC9035 abstractC9035) {
        return mo10006(abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public void mo30208(AbstractC15001 abstractC15001, Object obj) {
        this.f45062.m12349(abstractC15001, obj);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10005(int i, AbstractC9035 abstractC9035) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10009(AbstractC15001 abstractC15001, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo10007(AbstractC15001 abstractC15001, int i, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10010(AbstractC15001 abstractC15001, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo30212(AbstractC9035 abstractC9035) {
        boolean z = this.f45064;
        C3815 c3815 = this.f45062;
        if (!z) {
            boolean z2 = this.f45065;
            C7323 c7323 = this.f45061;
            if (z2) {
                return c3815.m12352(abstractC9035) == c7323.getNumber();
            }
            return !mo10006(abstractC9035).equals(c7323.m20097());
        }
        return c3815.m12351(abstractC9035);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo30210(AbstractC15001 abstractC15001) {
        boolean z = this.f45064;
        C3815 c3815 = this.f45062;
        if (!z) {
            boolean z2 = this.f45065;
            C7323 c7323 = this.f45061;
            if (z2) {
                return c3815.m12350(abstractC15001) == c7323.getNumber();
            }
            return !mo10008(abstractC15001).equals(c7323.m20097());
        }
        return c3815.m12354(abstractC15001);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩸ */
    public final int mo30213(AbstractC9035 abstractC9035) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩴ */
    public final int mo30211(AbstractC15001 abstractC15001) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final void mo30207(AbstractC15001 abstractC15001) {
        this.f45062.m12348(abstractC15001);
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC14299 mo17567() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC14299 mo30214(AbstractC15001 abstractC15001) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // l.InterfaceC16493
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14299 mo17568(AbstractC15001 abstractC15001, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
