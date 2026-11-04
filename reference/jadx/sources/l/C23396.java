package l;

/* JADX INFO: renamed from: l.᩹۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C23396 extends EnumC8806 {
    public /* synthetic */ C23396() {
        this("ScriptDataEscapedLessthanSign", 24);
    }

    public C23396(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54659()) {
            c8260.m22261();
            c8260.f27174.append(c24448.m54678());
            c8260.m22254("<");
            c8260.m22253(c24448.m54678());
            c8260.m22258(EnumC8806.f28721);
            return;
        }
        if (c24448.m54686('/')) {
            c8260.m22261();
            c8260.m22258(EnumC8806.f28700);
        } else {
            c8260.m22253('<');
            c8260.m22269(EnumC8806.f28738);
        }
    }
}
