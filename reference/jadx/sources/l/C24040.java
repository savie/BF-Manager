package l;

/* JADX INFO: renamed from: l.᩺ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBD2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24040 extends AbstractC10172 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6140 f77764;

    public C24040(C6140 c6140) {
        super(4, 4);
        this.f77764 = c6140;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        this.f77764 = (C6140) c10918.m27703().m44247(this.f77764);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return this.f77764.mo1456();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        int iM26285 = this.f77764.m26285();
        if (c15000.m36116()) {
            c15000.m36111(4, "  annotations_off: ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36124(iM26285);
    }
}
