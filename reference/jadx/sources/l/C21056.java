package l;

/* JADX INFO: renamed from: l.᩶ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13OM */
/* JADX INFO: loaded from: classes5.dex */
public final class C21056 extends AbstractC16139 implements Comparable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5503 f67292;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0173 f67293 = null;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        return 4;
    }

    public C21056(C5503 c5503) {
        this.f67292 = c5503;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C12960 c12960M16331 = this.f67292.m16331();
        C18072 c18072M27711 = c10918.m27711();
        C0173 c0173M42105 = c18072M27711.m42105(c12960M16331);
        if (c0173M42105 == null) {
            C19123 c19123M27697 = c10918.m27697();
            c0173M42105 = new C0173(c12960M16331);
            c19123M27697.m44244((AbstractC10172) c0173M42105);
            c18072M27711.m42108(c12960M16331, c0173M42105);
        }
        this.f67293 = c0173M42105;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        int iM26285 = this.f67293.m26285();
        if (c15000.m36116()) {
            c15000.m36111(0, m38318() + ' ' + this.f67292.toString());
            c15000.m36111(4, "call_site_off: ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36124(iM26285);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f67292.compareTo(((C21056) obj).f67292);
    }
}
