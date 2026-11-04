package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z20Y */
/* JADX INFO: loaded from: classes.dex */
public final class C21963 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f70890;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ColorStateList f70891;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Drawable.ConstantState f70892;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f70893;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C4809(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C4809(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f70890;
        Drawable.ConstantState constantState = this.f70892;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
