package l;

/* JADX INFO: renamed from: l.ܶ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public final class C15437 extends C18258 implements InterfaceC7299 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f50307;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f50308;

    @Override // l.C18258, l.AbstractC23903, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public final int mo1941() {
        return 15;
    }

    @Override // l.C18258
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final C15437 mo36947() {
        return this;
    }

    public C15437(AbstractC23903 abstractC23903, boolean z) {
        super(abstractC23903.f77447, abstractC23903.f77453, abstractC23903.f77449, abstractC23903.f77448);
        this.f50307 = abstractC23903;
        this.f50308 = z;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final int m36946() {
        AbstractC23903 abstractC23903 = this.f50307;
        if (abstractC23903.f77452 == EnumC10477.f35878) {
            if (this.f50308) {
                return abstractC23903.mo22992() ? 2 : 1;
            }
            return abstractC23903.mo22992() ? 4 : 3;
        }
        if (abstractC23903.m52713()) {
            return 8;
        }
        if (abstractC23903.mo22992()) {
            return 6;
        }
        if ((abstractC23903.mo20276() & 2) != 0) {
            AbstractC23903 abstractC23904 = this;
            while (abstractC23904 != null && !(abstractC23904 instanceof C20375)) {
                abstractC23904 = abstractC23904.f77448;
            }
            if (abstractC23904 == null || !((C20375) abstractC23904).f66045) {
                return 7;
            }
        }
        return abstractC23903.m52720().m52721() ? 9 : 5;
    }

    @Override // l.AbstractC23903, l.InterfaceC15767
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18742(C23800 c23800) {
        return new C2068(this.f50307, Integer.valueOf(m36946()));
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC23903 mo10880() {
        return this.f50307;
    }
}
