package l;

/* JADX INFO: renamed from: l.᩸ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes.dex */
public final class C22853 extends AbstractC10172 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C10722 f74235;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f74236;

    public C22853(C10722 c10722) {
        super(1, -1);
        this.f74235 = c10722;
        this.f74236 = null;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_ENCODED_ARRAY_ITEM;
    }

    public final int hashCode() {
        return this.f74235.hashCode();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۙ */
    public final int mo15563(AbstractC10172 abstractC10172) {
        return this.f74235.compareTo(((C22853) abstractC10172).f74235);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return this.f74235.mo1843();
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C2168.m7458(c10918, this.f74235);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        C15000 c15000 = new C15000();
        new C2168(c19123.m23369(), c15000).m7462(this.f74235, false);
        byte[] bArrM36121 = c15000.m36121();
        this.f74236 = bArrM36121;
        m26283(bArrM36121.length);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        if (c15000.m36116()) {
            c15000.m36111(0, m26281() + " encoded array");
            new C2168(c10918, c15000).m7462(this.f74235, true);
            return;
        }
        c15000.m36115(this.f74236);
    }
}
