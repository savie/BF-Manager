package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۨ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11562 extends AbstractC20847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2388 f38895;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11562(C2388 c2388) {
        super("DotsWidth");
        this.f38895 = c2388;
    }

    @Override // l.AbstractC20847
    public final float getValue(Object obj) {
        C13465.m32966((View) obj, "object");
        ImageView imageView = this.f38895.f9584;
        C13465.m32962((Object) imageView);
        return imageView.getLayoutParams().width;
    }

    @Override // l.AbstractC20847
    public final void setValue(Object obj, float f) {
        C13465.m32966((View) obj, "object");
        C2388 c2388 = this.f38895;
        ImageView imageView = c2388.f9584;
        C13465.m32962((Object) imageView);
        imageView.getLayoutParams().width = (int) f;
        ImageView imageView2 = c2388.f9584;
        C13465.m32962((Object) imageView2);
        imageView2.requestLayout();
    }
}
