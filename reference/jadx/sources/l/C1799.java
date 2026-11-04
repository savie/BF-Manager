package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.֫۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1799 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Paint f6136;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f6137;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f6138;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f6139;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ColorStateList f6140;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f6141;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorStateList f6142;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5528 f6143;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f6144;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f6145;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f6146;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f6147;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C24920(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C24920(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f6138;
    }
}
