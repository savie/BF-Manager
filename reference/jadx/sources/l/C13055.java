package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.۬ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C13055 extends C3881 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Path f43516;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18699 f43517;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13055(C18699 c18699, Path path, float f) {
        super(c18699, f, 0.0f);
        this.f43517 = c18699;
        this.f43516 = path;
    }

    @Override // l.C3881, l.AbstractC21521
    /* JADX INFO: renamed from: ۙ */
    public final void mo11256(String str) {
        C18699 c18699 = this.f43517;
        if (c18699.m43231()) {
            if (c18699.f60673.f74551) {
                c18699.f60666.drawTextOnPath(str, this.f43516, this.f14511, this.f14510, c18699.f60673.f74547);
            }
            if (c18699.f60673.f74549) {
                c18699.f60666.drawTextOnPath(str, this.f43516, this.f14511, this.f14510, c18699.f60673.f74548);
            }
        }
        this.f14511 = c18699.f60673.f74547.measureText(str) + this.f14511;
    }
}
