package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.᩹ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I23M */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22317 implements InterfaceC16464 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f72883;

    public /* synthetic */ C22317(AbstractC20745 abstractC20745, int i) {
        this.f72882 = i;
        this.f72883 = abstractC20745;
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public final Bitmap mo947() {
        switch (this.f72882) {
            case 0:
                return C5443.m15052(this.f72883);
            default:
                return C5443.m15049(this.f72883);
        }
    }
}
