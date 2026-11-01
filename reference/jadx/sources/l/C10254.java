package l;

/* JADX INFO: renamed from: l.ۤۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10254 extends EnumC21210 {
    public /* synthetic */ C10254() {
        this("AttributeValue_singleQuoted", 38);
    }

    public C10254(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        String strM32023 = c12931.m32023(EnumC21210.f69018);
        if (strM32023.length() > 0) {
            c20692.f67307.m22526(strM32023);
        } else {
            c20692.f67307.m22521();
        }
        char cM32033 = c12931.m32033();
        if (cM32033 == 0) {
            c20692.m46542(this);
            c20692.f67307.m22525((char) 65533);
            return;
        }
        if (cM32033 == 65535) {
            c20692.m46544(this);
            c20692.m46532(EnumC21210.f69077);
            return;
        }
        if (cM32033 != '&') {
            if (cM32033 == '\'') {
                c20692.m46532(EnumC21210.f69016);
                return;
            } else {
                c20692.f67307.m22525(cM32033);
                return;
            }
        }
        int[] iArrM46539 = c20692.m46539('\'', true);
        if (iArrM46539 != null) {
            c20692.f67307.m22520(iArrM46539);
        } else {
            c20692.f67307.m22525('&');
        }
    }
}
