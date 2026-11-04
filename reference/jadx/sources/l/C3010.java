package l;

import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3010 extends AbstractC7727 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10971 f9773;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9774;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9775;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f9776;

    @Override // l.AbstractC7727
    /* JADX INFO: renamed from: onFontRetrievalFailed */
    public final void m21011(int i) {
    }

    public C3010(C10971 c10971, int i, int i2, WeakReference weakReference) {
        this.f9773 = c10971;
        this.f9775 = i;
        this.f9774 = i2;
        this.f9776 = weakReference;
    }

    @Override // l.AbstractC7727
    /* JADX INFO: renamed from: onFontRetrieved */
    public final void m21012(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f9775) != -1) {
            typeface = C22160.m50123(typeface, i, (this.f9774 & 2) != 0);
        }
        this.f9773.m27811(this.f9776, typeface);
    }
}
