package l;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: l.ᩴ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC18626 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60393;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60394;

    public /* synthetic */ ViewOnLayoutChangeListenerC18626(int i, Object obj) {
        this.f60393 = i;
        this.f60394 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f60393) {
            case 0:
                ViewOnClickListenerC8374.m21933((ViewOnClickListenerC8374) this.f60394);
                break;
            default:
                ((CarouselLayoutManager) this.f60394).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
