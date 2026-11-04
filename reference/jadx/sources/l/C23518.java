package l;

/* JADX INFO: renamed from: l.᩹ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C23518 extends EnumC13820 {
    public /* synthetic */ C23518() {
        this("AfterDoctypeName", 53);
    }

    public C23518(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        if (c3952.m12696()) {
            c13646.m33399(this);
            c13646.f43324.getClass();
            c13646.m33400();
            c13646.m33401(EnumC13820.f43874);
            return;
        }
        if (c3952.m12680('\t', '\n', '\r', '\f', ' ')) {
            c3952.m12675();
            return;
        }
        if (c3952.m12691('>')) {
            c13646.m33400();
            c13646.m33391(EnumC13820.f43874);
            return;
        }
        if (c3952.m12692("PUBLIC")) {
            c13646.f43324.getClass();
            c13646.m33401(EnumC13820.f43869);
        } else if (c3952.m12692("SYSTEM")) {
            c13646.f43324.getClass();
            c13646.m33401(EnumC13820.f43816);
        } else {
            c13646.m33394(this);
            c13646.f43324.getClass();
            c13646.m33391(EnumC13820.f43851);
        }
    }
}
