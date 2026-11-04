package l;

/* JADX INFO: renamed from: l.۠ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C8600 extends EnumC13820 {
    public /* synthetic */ C8600() {
        this("TagOpen", 7);
    }

    public C8600(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12681 = c3952.m12681();
        if (cM12681 == '!') {
            c13646.m33391(EnumC13820.f43814);
            return;
        }
        if (cM12681 == '/') {
            c13646.m33391(EnumC13820.f43867);
            return;
        }
        if (cM12681 == '?') {
            c13646.m33391(EnumC13820.f43858);
            return;
        }
        if (c3952.m12684()) {
            c13646.m33387(true);
            c13646.m33401(EnumC13820.f43886);
        } else {
            c13646.m33394(this);
            c13646.m33388('<');
            c13646.m33401(EnumC13820.f43874);
        }
    }
}
