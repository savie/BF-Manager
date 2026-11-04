package l;

/* JADX INFO: renamed from: l.᩻ᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C25216 extends EnumC8806 {
    public /* synthetic */ C25216() {
        this("BeforeDoctypeName", 51);
    }

    public C25216(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54659()) {
            c8260.f27169.mo3216();
            c8260.m22269(EnumC8806.f28707);
            return;
        }
        char cM54669 = c24448.m54669();
        if (cM54669 == 0) {
            c8260.m22262(this);
            C20939 c20939 = c8260.f27169;
            c20939.mo3216();
            c20939.f66991.append((char) 65533);
            c8260.m22269(EnumC8806.f28707);
            return;
        }
        if (cM54669 != ' ') {
            if (cM54669 == 65535) {
                c8260.m22267(this);
                C20939 c209310 = c8260.f27169;
                c209310.mo3216();
                c209310.f66992 = true;
                c8260.m22265();
                c8260.m22269(EnumC8806.f28749);
                return;
            }
            if (cM54669 == '\t' || cM54669 == '\n' || cM54669 == '\f' || cM54669 == '\r') {
                return;
            }
            c8260.f27169.mo3216();
            c8260.f27169.f66991.append(cM54669);
            c8260.m22269(EnumC8806.f28707);
        }
    }
}
