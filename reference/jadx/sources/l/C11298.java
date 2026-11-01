package l;

import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11298 extends AbstractC20864 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f38140;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4717 f38141;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38142;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38143;

    @Override // l.AbstractC20864
    /* JADX INFO: renamed from: onFontRetrievalFailed */
    public final void m46899(int i) {
    }

    public C11298(C4717 c4717, int i, int i2, WeakReference weakReference) {
        this.f38141 = c4717;
        this.f38143 = i;
        this.f38142 = i2;
        this.f38140 = weakReference;
    }

    @Override // l.AbstractC20864
    /* JADX INFO: renamed from: onFontRetrieved */
    public final void m46900(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f38143) != -1) {
            typeface = C3535.m10418(typeface, i, (this.f38142 & 2) != 0);
        }
        this.f38141.m13068(this.f38140, typeface);
    }
}
