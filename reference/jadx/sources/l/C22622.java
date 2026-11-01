package l;

/* JADX INFO: renamed from: l.᩹᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C22622 extends EnumC21210 {
    public /* synthetic */ C22622() {
        this("DoctypePublicIdentifier_singleQuoted", 57);
    }

    public C22622(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32033 = c12931.m32033();
        if (cM32033 == 0) {
            c20692.m46542(this);
            c20692.f67294.f56576.append((char) 65533);
            return;
        }
        if (cM32033 == '\'') {
            c20692.m46532(EnumC21210.f69053);
            return;
        }
        if (cM32033 == '>') {
            c20692.m46542(this);
            c20692.f67294.getClass();
            c20692.m46531();
            c20692.m46532(EnumC21210.f69077);
            return;
        }
        if (cM32033 == 65535) {
            c20692.m46544(this);
            c20692.f67294.getClass();
            c20692.m46531();
            c20692.m46532(EnumC21210.f69077);
            return;
        }
        c20692.f67294.f56576.append(cM32033);
    }
}
