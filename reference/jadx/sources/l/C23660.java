package l;

/* JADX INFO: renamed from: l.᩻ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C23660 extends EnumC21210 {
    public /* synthetic */ C23660() {
        this("CommentEnd", 48);
    }

    public C23660(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32033 = c12931.m32033();
        if (cM32033 == 0) {
            c20692.m46542(this);
            StringBuilder sb = c20692.f67298.f69573;
            sb.append("--");
            sb.append((char) 65533);
            c20692.m46532(EnumC21210.f69088);
            return;
        }
        if (cM32033 == '!') {
            c20692.m46542(this);
            c20692.m46532(EnumC21210.f69084);
            return;
        }
        if (cM32033 == '-') {
            c20692.m46542(this);
            c20692.f67298.f69573.append('-');
            return;
        }
        if (cM32033 == '>') {
            c20692.m46541();
            c20692.m46532(EnumC21210.f69077);
        } else if (cM32033 == 65535) {
            c20692.m46544(this);
            c20692.m46541();
            c20692.m46532(EnumC21210.f69077);
        } else {
            c20692.m46542(this);
            StringBuilder sb2 = c20692.f67298.f69573;
            sb2.append("--");
            sb2.append(cM32033);
            c20692.m46532(EnumC21210.f69088);
        }
    }
}
