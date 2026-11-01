package l;

/* JADX INFO: renamed from: l.᩻ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C23634 extends EnumC8422 {
    public /* synthetic */ C23634() {
        this("ScriptDataEscaped", 21);
    }

    public C23634(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7394()) {
            c8111.m21368(this);
            c8111.m21353(EnumC8422.f29249);
            return;
        }
        char cM7392 = c2424.m7392();
        if (cM7392 == 0) {
            c8111.m21365(this);
            c2424.m7374();
            c8111.m21356((char) 65533);
        } else if (cM7392 == '-') {
            c8111.m21356('-');
            c8111.m21360(EnumC8422.f29257);
        } else if (cM7392 == '<') {
            c8111.m21360(EnumC8422.f29250);
        } else {
            c8111.m21357(c2424.m7373('-', '<', 0));
        }
    }
}
