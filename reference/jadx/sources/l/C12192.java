package l;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: l.ۨۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C12192 extends AbstractC6227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RectF f39197 = new RectF();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f39198;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3989 f39199;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f39200;

    public C12192(C3989 c3989, float f, float f2) {
        this.f39199 = c3989;
        this.f39198 = f;
        this.f39200 = f2;
    }

    @Override // l.AbstractC6227
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10603(AbstractC4735 abstractC4735) {
        if (!(abstractC4735 instanceof C21889)) {
            return true;
        }
        AbstractC14472 abstractC14472M6183 = abstractC4735.f59446.m6183(((C21889) abstractC4735).f70722);
        if (abstractC14472M6183 == null) {
            return false;
        }
        C9077 c9077 = (C9077) abstractC14472M6183;
        Path path = new C17413(c9077.f29506).f56611;
        Matrix matrix = c9077.f20824;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f39197.union(rectF);
        return false;
    }

    @Override // l.AbstractC6227
    /* JADX INFO: renamed from: ۙ */
    public final void mo10602(String str) {
        C3989 c3989 = this.f39199;
        if (c3989.m12896()) {
            Rect rect = new Rect();
            c3989.f13654.f65381.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f39198, this.f39200);
            this.f39197.union(rectF);
        }
        this.f39198 = c3989.f13654.f65381.measureText(str) + this.f39198;
    }
}
