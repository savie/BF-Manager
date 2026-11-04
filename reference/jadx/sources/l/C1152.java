package l;

/* JADX INFO: renamed from: l.֨ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956A */
/* JADX INFO: loaded from: classes3.dex */
public final class C1152 extends C2708 {

    /* JADX INFO: renamed from: ᩶ܺ, reason: not valid java name and contains not printable characters */
    public C18305 f4258;

    public C1152(C3019 c3019) {
        super(c3019);
        this.f4258 = null;
    }

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public final C4511 m4253() {
        return this.f4258;
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4254(C4511 c4511, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(m32752());
        sb.append("[");
        sb.append(c4511.f16093);
        sb.append(",");
        String strM46451 = C20196.m46451(C12669.m31437(c4511.f16098, "]", sb), " ", mo9001(c4511, strArr));
        System.err.println(strM46451);
        if (this.f4258 == null) {
            this.f4258 = new C18305(strM46451, c4511);
        }
    }
}
