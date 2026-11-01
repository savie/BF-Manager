package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ۜۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6704 extends AbstractC21521 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f22596;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Path f22597;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f22598;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18699 f22599;

    public C6704(C18699 c18699, float f, float f2, Path path) {
        this.f22599 = c18699;
        this.f22598 = f;
        this.f22596 = f2;
        this.f22597 = path;
    }

    @Override // l.AbstractC21521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo18118(AbstractC10898 abstractC10898) {
        return !(abstractC10898 instanceof C23598);
    }

    @Override // l.AbstractC21521
    /* JADX INFO: renamed from: ۙ */
    public final void mo11256(String str) {
        C18699 c18699 = this.f22599;
        if (c18699.m43231()) {
            Path path = new Path();
            c18699.f60673.f74547.getTextPath(str, 0, str.length(), this.f22598, this.f22596, path);
            this.f22597.addPath(path);
        }
        this.f22598 = c18699.f60673.f74547.measureText(str) + this.f22598;
    }
}
