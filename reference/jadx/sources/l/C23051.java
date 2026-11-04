package l;

/* JADX INFO: renamed from: l.᩸᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23051 extends AbstractC17631 {
    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        return 4;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_TYPE_ID_ITEM;
    }

    @Override // l.AbstractC17631, l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        c10918.m27714().m28068(m41281().m3934());
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        C9976 c9976M3934 = m41281().m3934();
        int iM28065 = c10918.m27714().m28065(c9976M3934);
        if (c15000.m36116()) {
            c15000.m36111(0, m38318() + ' ' + c9976M3934.mo1843());
            c15000.m36111(4, "  descriptor_idx: ".concat(C5306.m15938(iM28065)));
        }
        c15000.m36124(iM28065);
    }
}
