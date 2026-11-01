package l;

/* JADX INFO: renamed from: l.ܰ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14156 extends EnumC21210 {
    public /* synthetic */ C14156() {
        this("AfterDoctypeName", 53);
    }

    public C14156(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        if (c12931.m32043()) {
            c20692.m46544(this);
            c20692.f67294.getClass();
            c20692.m46531();
            c20692.m46532(EnumC21210.f69077);
            return;
        }
        if (c12931.m32031('\t', '\n', '\r', '\f', ' ')) {
            c12931.m32024();
            return;
        }
        if (c12931.m32035('>')) {
            c20692.m46531();
            c20692.m46538(EnumC21210.f69077);
            return;
        }
        if (c12931.m32036("PUBLIC")) {
            c20692.f67294.getClass();
            c20692.m46532(EnumC21210.f69070);
        } else if (c12931.m32036("SYSTEM")) {
            c20692.f67294.getClass();
            c20692.m46532(EnumC21210.f69048);
        } else {
            c20692.m46542(this);
            c20692.f67294.getClass();
            c20692.m46538(EnumC21210.f69019);
        }
    }
}
