package l;

import android.media.Spatializer;

/* JADX INFO: renamed from: l.ۗۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2947 implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12909 f11053;

    public C2947(C12909 c12909) {
        this.f11053 = c12909;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f11053.m31986();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f11053.m31986();
    }
}
