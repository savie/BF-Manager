package l;

/* JADX INFO: renamed from: l.ۚ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5295 extends C10514 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f18632;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC12752 f18633;

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo5550() {
        return true;
    }

    public C5295(AbstractC1566 abstractC1566, EnumC12752 enumC12752) {
        super(AbstractC1566.f5426.mo5570());
        C17359.requireNonNull(abstractC1566);
        this.f18632 = abstractC1566;
        C17359.requireNonNull(enumC12752);
        this.f18633 = enumC12752;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC1566 mo5563() {
        return this.f18632;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۗ */
    public final EnumC12752 mo5542() {
        return this.f18633;
    }

    @Override // l.C10514, l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5547(Object obj) {
        if (!super.mo5547(obj)) {
            return false;
        }
        C5295 c5295 = (C5295) obj;
        return this.f18633 == c5295.f18633 && this.f18632.equals(c5295.f18632);
    }

    @Override // l.C10514, l.AbstractC1566
    public final String toString() {
        EnumC12752 enumC12752 = EnumC12752.UNBOUND;
        EnumC12752 enumC12753 = this.f18633;
        if (enumC12753 == enumC12752) {
            return enumC12753.m31590();
        }
        return enumC12753.m31590() + this.f18632;
    }
}
