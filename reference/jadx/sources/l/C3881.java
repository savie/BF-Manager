package l;

/* JADX INFO: renamed from: l.ۘۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes2.dex */
public class C3881 extends AbstractC21521 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18699 f14509;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f14510;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f14511;

    @Override // l.AbstractC21521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo11256(String str) {
        C18699 c18699 = this.f14509;
        if (c18699.m43231()) {
            if (c18699.f60673.f74551) {
                c18699.f60666.drawText(str, this.f14511, this.f14510, c18699.f60673.f74547);
            }
            if (c18699.f60673.f74549) {
                c18699.f60666.drawText(str, this.f14511, this.f14510, c18699.f60673.f74548);
            }
        }
        this.f14511 = c18699.f60673.f74547.measureText(str) + this.f14511;
    }

    public C3881(C18699 c18699, float f, float f2) {
        this.f14509 = c18699;
        this.f14511 = f;
        this.f14510 = f2;
    }
}
