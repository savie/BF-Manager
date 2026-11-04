package l;

/* JADX INFO: renamed from: l.᩻ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C25010 extends EnumC13820 {
    public /* synthetic */ C25010() {
        this("CommentEndBang", 49);
    }

    public C25010(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        char cM12689 = c3952.m12689();
        if (cM12689 == 0) {
            c13646.m33394(this);
            StringBuilder sb = c13646.f43329.f25274;
            sb.append("--!");
            sb.append((char) 65533);
            c13646.m33401(EnumC13820.f43887);
            return;
        }
        if (cM12689 == '-') {
            c13646.f43329.f25274.append("--!");
            c13646.m33401(EnumC13820.f43860);
            return;
        }
        if (cM12689 == '>') {
            c13646.m33393();
            c13646.m33401(EnumC13820.f43874);
        } else if (cM12689 == 65535) {
            c13646.m33399(this);
            c13646.m33393();
            c13646.m33401(EnumC13820.f43874);
        } else {
            StringBuilder sb2 = c13646.f43329.f25274;
            sb2.append("--!");
            sb2.append(cM12689);
            c13646.m33401(EnumC13820.f43887);
        }
    }
}
