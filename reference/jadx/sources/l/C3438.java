package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۗ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3438 extends AbstractC24227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20592 f11133;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3438(C20592 c20592) {
        super("DotsWidth");
        this.f11133 = c20592;
    }

    @Override // l.AbstractC24227
    public final float getValue(Object obj) {
        C15243.m36590((View) obj, "object");
        ImageView imageView = this.f11133.f65923;
        C15243.m36586((Object) imageView);
        return imageView.getLayoutParams().width;
    }

    @Override // l.AbstractC24227
    public final void setValue(Object obj, float f) {
        C15243.m36590((View) obj, "object");
        C20592 c20592 = this.f11133;
        ImageView imageView = c20592.f65923;
        C15243.m36586((Object) imageView);
        imageView.getLayoutParams().width = (int) f;
        ImageView imageView2 = c20592.f65923;
        C15243.m36586((Object) imageView2);
        imageView2.requestLayout();
    }
}
