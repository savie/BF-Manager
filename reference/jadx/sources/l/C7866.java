package l;

import android.graphics.Paint;

/* JADX INFO: renamed from: l.۠֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7866 extends AbstractC9983 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1107 f25886;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1107 f25889;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f25896 = 0.0f;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f25895 = 1.0f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f25887 = 1.0f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f25893 = 0.0f;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f25892 = 1.0f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f25894 = 0.0f;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Paint.Cap f25891 = Paint.Cap.BUTT;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Paint.Join f25888 = Paint.Join.MITER;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f25890 = 4.0f;

    @Override // l.AbstractC8572
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo20764() {
        return this.f25889.m4118() || this.f25886.m4118();
    }

    @Override // l.AbstractC8572
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo20765(int[] iArr) {
        return this.f25886.m4121(iArr) | this.f25889.m4121(iArr);
    }

    public int getStrokeColor() {
        return this.f25886.m4119();
    }

    public void setStrokeColor(int i) {
        this.f25886.m4120(i);
    }

    public float getStrokeWidth() {
        return this.f25896;
    }

    public void setStrokeWidth(float f) {
        this.f25896 = f;
    }

    public float getStrokeAlpha() {
        return this.f25895;
    }

    public void setStrokeAlpha(float f) {
        this.f25895 = f;
    }

    public int getFillColor() {
        return this.f25889.m4119();
    }

    public void setFillColor(int i) {
        this.f25889.m4120(i);
    }

    public float getFillAlpha() {
        return this.f25887;
    }

    public void setFillAlpha(float f) {
        this.f25887 = f;
    }

    public float getTrimPathStart() {
        return this.f25893;
    }

    public void setTrimPathStart(float f) {
        this.f25893 = f;
    }

    public float getTrimPathEnd() {
        return this.f25892;
    }

    public void setTrimPathEnd(float f) {
        this.f25892 = f;
    }

    public float getTrimPathOffset() {
        return this.f25894;
    }

    public void setTrimPathOffset(float f) {
        this.f25894 = f;
    }
}
