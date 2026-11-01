package l;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes2.dex */
public final class C0809 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19861 f3427;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f3428;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21445 f3429;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f3430;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
