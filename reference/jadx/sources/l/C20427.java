package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩵۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 96B4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20427 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12222 f65435;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C20427(AbstractC12222 abstractC12222) {
        this.f65435 = abstractC12222;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.f65435;
    }
}
