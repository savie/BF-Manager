package l;

/* JADX INFO: renamed from: l.ۡۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public final class C9171 extends AbstractC2460 {
    @Override // l.AbstractC2460, l.AbstractC6935
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC6935 mo1678() {
        mo1678();
        return this;
    }

    public C9171() {
        super(EnumC8426.StartTag);
        this.f7905 = new C6190();
    }

    @Override // l.AbstractC2460, l.AbstractC6935
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2460 mo1678() {
        super.mo1678();
        this.f7905 = new C6190();
        return this;
    }

    public final String toString() {
        C6190 c6190 = this.f7905;
        if (c6190 == null || c6190.size() <= 0) {
            return C8947.m23910(new StringBuilder("<"), m8310(), ">");
        }
        return "<" + m8310() + " " + this.f7905.toString() + ">";
    }
}
