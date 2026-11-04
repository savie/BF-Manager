package l;

/* JADX INFO: renamed from: l.ۢۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5JI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10100 extends C3454 {

    /* JADX INFO: renamed from: ֨᩵, reason: not valid java name and contains not printable characters */
    public C18305 f32355;

    public C10100(C6003 c6003) {
        super(c6003);
        this.f32355 = null;
    }

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public final C4511 m26059() {
        return this.f32355;
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ */
    public final void mo4254(C4511 c4511, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22474.m17442());
        sb.append("[");
        sb.append(c4511.f16093);
        sb.append(",");
        String strM46451 = C20196.m46451(C12669.m31437(c4511.f16098, "]", sb), " ", mo9001(c4511, strArr));
        System.err.println(strM46451);
        if (this.f32355 == null) {
            this.f32355 = new C18305(strM46451, c4511);
        }
    }
}
