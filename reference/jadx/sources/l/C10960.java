package l;

/* JADX INFO: renamed from: l.ۧۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10960 extends EnumC21210 {
    public /* synthetic */ C10960() {
        this("CommentEndDash", 47);
    }

    public C10960(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32033 = c12931.m32033();
        if (cM32033 == 0) {
            c20692.m46542(this);
            StringBuilder sb = c20692.f67298.f69573;
            sb.append('-');
            sb.append((char) 65533);
            c20692.m46532(EnumC21210.f69088);
            return;
        }
        if (cM32033 == '-') {
            c20692.m46532(EnumC21210.f69062);
            return;
        }
        if (cM32033 == 65535) {
            c20692.m46544(this);
            c20692.m46541();
            c20692.m46532(EnumC21210.f69077);
        } else {
            StringBuilder sb2 = c20692.f67298.f69573;
            sb2.append('-');
            sb2.append(cM32033);
            c20692.m46532(EnumC21210.f69088);
        }
    }
}
