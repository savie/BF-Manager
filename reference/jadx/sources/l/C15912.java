package l;

import android.content.ContextWrapper;
import android.os.Build;

/* JADX INFO: renamed from: l.ܶۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15912 implements InterfaceC6218 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f51683;

    public C15912(ContextWrapper contextWrapper) {
        this.f51683 = contextWrapper;
    }

    @Override // l.InterfaceC6218
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14420 mo17850(C12183 c12183) {
        ContextWrapper contextWrapper;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (i >= 31 || ((contextWrapper = this.f51683) != null && i >= 28 && contextWrapper.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iM25260 = C9681.m25260(c12183.f39166.f50848);
            C1896.m6513("Creating an asynchronous MediaCodec adapter for track type " + C7116.m19500(iM25260));
            return new C15166(new C22626(iM25260), new C19642(iM25260)).mo17850(c12183);
        }
        return new C25060().mo17850(c12183);
    }
}
