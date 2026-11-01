package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.֡ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 96B4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0504 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16733 f2193;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C0504(AbstractC16733 abstractC16733) {
        this.f2193 = abstractC16733;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.f2193;
    }
}
