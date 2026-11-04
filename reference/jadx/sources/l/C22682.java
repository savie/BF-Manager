package l;

import android.graphics.Paint;

/* JADX INFO: renamed from: l.᩸۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22682 extends AbstractC12985 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17422 f73650;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17422 f73655;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f73657 = 0.0f;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f73651 = 1.0f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f73656 = 1.0f;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f73652 = 0.0f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f73653 = 1.0f;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f73654 = 0.0f;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Paint.Cap f73648 = Paint.Cap.BUTT;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Paint.Join f73647 = Paint.Join.MITER;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f73649 = 4.0f;

    @Override // l.AbstractC15222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo36573() {
        return this.f73655.m40907() || this.f73650.m40907();
    }

    @Override // l.AbstractC15222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo36574(int[] iArr) {
        return this.f73650.m40903(iArr) | this.f73655.m40903(iArr);
    }

    public int getStrokeColor() {
        return this.f73650.m40901();
    }

    public void setStrokeColor(int i) {
        this.f73650.m40902(i);
    }

    public float getStrokeWidth() {
        return this.f73657;
    }

    public void setStrokeWidth(float f) {
        this.f73657 = f;
    }

    public float getStrokeAlpha() {
        return this.f73651;
    }

    public void setStrokeAlpha(float f) {
        this.f73651 = f;
    }

    public int getFillColor() {
        return this.f73655.m40901();
    }

    public void setFillColor(int i) {
        this.f73655.m40902(i);
    }

    public float getFillAlpha() {
        return this.f73656;
    }

    public void setFillAlpha(float f) {
        this.f73656 = f;
    }

    public float getTrimPathStart() {
        return this.f73652;
    }

    public void setTrimPathStart(float f) {
        this.f73652 = f;
    }

    public float getTrimPathEnd() {
        return this.f73653;
    }

    public void setTrimPathEnd(float f) {
        this.f73653 = f;
    }

    public float getTrimPathOffset() {
        return this.f73654;
    }

    public void setTrimPathOffset(float f) {
        this.f73654 = f;
    }
}
