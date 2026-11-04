package l;

/* JADX INFO: renamed from: l.ܽ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17428 extends EnumC8806 {
    public /* synthetic */ C17428() {
        this("ScriptDataEscapedDash", 22);
    }

    public C17428(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54677()) {
            c8260.m22267(this);
            c8260.m22269(EnumC8806.f28749);
            return;
        }
        char cM54669 = c24448.m54669();
        if (cM54669 == 0) {
            c8260.m22262(this);
            c8260.m22253((char) 65533);
            c8260.m22269(EnumC8806.f28738);
        } else if (cM54669 == '-') {
            c8260.m22253(cM54669);
            c8260.m22269(EnumC8806.f28736);
        } else if (cM54669 == '<') {
            c8260.m22269(EnumC8806.f28750);
        } else {
            c8260.m22253(cM54669);
            c8260.m22269(EnumC8806.f28738);
        }
    }
}
