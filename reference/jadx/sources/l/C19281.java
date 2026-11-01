package l;

/* JADX INFO: renamed from: l.᩵ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19281 extends AbstractC8698 {
    @Override // l.AbstractC8698, l.AbstractC7286
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC7286 mo19432() {
        mo19432();
        return this;
    }

    public C19281() {
        super(EnumC10109.StartTag);
        this.f29926 = new C22103();
    }

    @Override // l.AbstractC8698, l.AbstractC7286
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8698 mo19432() {
        super.mo19432();
        this.f29926 = new C22103();
        return this;
    }

    public final String toString() {
        C22103 c22103 = this.f29926;
        if (c22103 == null || c22103.size() <= 0) {
            return C22697.m50267(new StringBuilder("<"), m22522(), ">");
        }
        return "<" + m22522() + " " + this.f29926.toString() + ">";
    }
}
