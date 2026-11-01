package l;

/* JADX INFO: renamed from: l.ܺ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6MK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16183 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6304 f52262;

    public C16183(C6304 c6304) {
        this.f52262 = c6304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10497 m38270(C10497 c10497) {
        C10497 c10497M26634 = C10497.m26634(c10497.mo2853());
        C0617 c0617M26640 = c10497.m26640();
        C20149.m45564(new C7716(this, c0617M26640, c10497M26634.m26640()), c0617M26640);
        c10497M26634.m26638(c10497.m26641().clone());
        return c10497M26634;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21121 m38269(C16183 c16183, C0617 c0617) {
        C6304 c6304 = c16183.f52262;
        String strM2837 = c0617.m2837();
        C15436 c15436 = new C15436();
        C0617 c0618 = new C0617(C11639.m29046(strM2837, C4582.f16235), c0617.mo2853(), c15436);
        int i = 0;
        for (C6968 c6968 : c0617.mo2839()) {
            if (c6304.m17398(strM2837, c0617, c6968)) {
                c15436.m36937(c6968);
            } else {
                i++;
            }
        }
        c15436.m36938(c6304.m17392(strM2837));
        if (c0617.m35271().m12681()) {
            c0617.m35271().m12679(c0618, true);
        }
        if (c0617.m2862().m12681()) {
            c0617.m2862().m12679(c0618, false);
        }
        C21121 c21121 = new C21121();
        c21121.f68786 = c0618;
        c21121.f68787 = i;
        return c21121;
    }
}
