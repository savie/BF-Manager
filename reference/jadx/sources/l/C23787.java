package l;

/* JADX INFO: renamed from: l.᩹᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class C23787 extends AbstractC22295 implements InterfaceC17573 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC21172 f77042;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f77043;

    @Override // l.AbstractC22295
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22295 mo38749(AbstractC22664 abstractC22664) {
        this.f26659 = abstractC22664;
        return this;
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo1970(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        return this.f77042.m48306();
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final Object m53058() {
        Object obj = this.f77043;
        int i = C25081.f81108[this.f77042.ordinal()];
        if (i == 1) {
            return Boolean.valueOf(((Integer) obj).intValue() != 0);
        }
        if (i != 2) {
            return obj;
        }
        int iIntValue = ((Integer) obj).intValue();
        char c = (char) iIntValue;
        if (c != iIntValue) {
            throw new AssertionError("bad value for char literal");
        }
        return Character.valueOf(c);
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5894(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68484;
    }
}
