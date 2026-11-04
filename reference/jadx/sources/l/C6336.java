package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۛۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6336 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Paint f21449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f21450;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f21451;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f21452;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ColorStateList f21453;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f21454;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorStateList f21455;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12301 f21456;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f21457;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f21458;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f21459;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f21460;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C24236(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C24236(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f21451;
    }
}
