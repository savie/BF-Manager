package l;

/* JADX INFO: renamed from: l.ۡ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9217 extends EnumC21210 {
    public /* synthetic */ C9217() {
        this("PLAINTEXT", 6);
    }

    public C9217(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC21210
    /* JADX INFO: renamed from: ۙ */
    public void mo1598(C20692 c20692, C12931 c12931) {
        char cM32027 = c12931.m32027();
        if (cM32027 == 0) {
            c20692.m46542(this);
            c12931.m32024();
            c20692.m46535((char) 65533);
        } else if (cM32027 == 65535) {
            c20692.m46537(new C18575());
        } else {
            c20692.m46536(c12931.m32022((char) 0));
        }
    }
}
