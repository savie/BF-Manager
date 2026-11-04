package l;

import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.֨ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1107 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3925;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3926;

    public /* synthetic */ RunnableC1107(int i, Object obj) {
        this.f3925 = i;
        this.f3926 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3925;
        Object obj = this.f3926;
        switch (i) {
            case 0:
                DialogInterfaceC8327 dialogInterfaceC8327 = ((DialogInterfaceC8327[]) obj)[0];
                if (dialogInterfaceC8327 != null) {
                    dialogInterfaceC8327.dismiss();
                }
                break;
            case 1:
                C22907 c22907 = (C22907) obj;
                int i2 = C22907.f74396;
                if (c22907.isAttachedToWindow() && c22907.getWindowVisibility() == 0 && c22907.isShown()) {
                    c22907.invalidate();
                    break;
                }
                break;
            case 2:
                ((CarouselLayoutManager) obj).refreshKeylineState();
                break;
            default:
                ((SearchView) obj).show();
                break;
        }
    }
}
