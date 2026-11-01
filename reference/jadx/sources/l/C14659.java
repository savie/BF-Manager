package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z20Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14659 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f47920;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47921;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ColorStateList f47922;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Drawable.ConstantState f47923;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C23831(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C23831(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f47921;
        Drawable.ConstantState constantState = this.f47923;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
