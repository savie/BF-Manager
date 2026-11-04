package l;

/* JADX INFO: renamed from: l.֡ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBE8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0173 extends AbstractC10172 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f1244;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12960 f1245;

    public C0173(C12960 c12960) {
        super(1, -1);
        this.f1245 = c12960;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1458(C19123 c19123, int i) {
        C15000 c15000 = new C15000();
        new C2168(c19123.m23369(), c15000).m7462((C10722) this.f1245, true);
        byte[] bArrM36121 = c15000.m36121();
        this.f1244 = bArrM36121;
        m26283(bArrM36121.length);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo1456() {
        return this.f1245.mo1843();
    }

    public final String toString() {
        return this.f1245.toString();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        if (c15000.m36116()) {
            c15000.m36111(0, m26281() + " call site");
            new C2168(c10918, c15000).m7462((C10722) this.f1245, true);
            return;
        }
        c15000.m36115(this.f1244);
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1455(C10918 c10918) {
        C2168.m7458(c10918, this.f1245);
    }
}
