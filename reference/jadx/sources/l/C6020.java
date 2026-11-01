package l;

/* JADX INFO: renamed from: l.ۛۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6020 extends EnumC21210 {
    public /* synthetic */ C6020() {
        this("Comment", 46);
    }

    public C6020(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32027 = c12931.m32027();
        if (cM32027 == 0) {
            c20692.m46542(this);
            c12931.m32024();
            c20692.f67298.f69573.append((char) 65533);
        } else if (cM32027 == '-') {
            c20692.m46538(EnumC21210.f69073);
        } else {
            if (cM32027 == 65535) {
                c20692.m46544(this);
                c20692.m46541();
                c20692.m46532(EnumC21210.f69077);
                return;
            }
            c20692.f67298.f69573.append(c12931.m32023('-', 0));
        }
    }
}
