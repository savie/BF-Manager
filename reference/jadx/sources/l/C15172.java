package l;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: l.ܶۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C15172 extends AbstractC21521 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f49551;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RectF f49552 = new RectF();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f49553;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18699 f49554;

    public C15172(C18699 c18699, float f, float f2) {
        this.f49554 = c18699;
        this.f49553 = f;
        this.f49551 = f2;
    }

    @Override // l.AbstractC21521
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18118(AbstractC10898 abstractC10898) {
        if (!(abstractC10898 instanceof C23598)) {
            return true;
        }
        AbstractC8075 abstractC8075M29087 = abstractC10898.f30200.m29087(((C23598) abstractC10898).f76450);
        if (abstractC8075M29087 == null) {
            return false;
        }
        C16851 c16851 = (C16851) abstractC8075M29087;
        Path path = new C1059(c16851.f53918).f4909;
        Matrix matrix = c16851.f61420;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f49552.union(rectF);
        return false;
    }

    @Override // l.AbstractC21521
    /* JADX INFO: renamed from: ۙ */
    public final void mo11256(String str) {
        C18699 c18699 = this.f49554;
        if (c18699.m43231()) {
            Rect rect = new Rect();
            c18699.f60673.f74547.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f49553, this.f49551);
            this.f49552.union(rectF);
        }
        this.f49553 = c18699.f60673.f74547.measureText(str) + this.f49553;
    }
}
