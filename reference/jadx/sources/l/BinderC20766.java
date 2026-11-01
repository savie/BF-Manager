package l;

import com.rosan.dhizuku.api.DhizukuRequestPermissionListener;

/* JADX INFO: renamed from: l.᩷ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC20766 extends DhizukuRequestPermissionListener {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f67569 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f67570;

    public BinderC20766(C13752 c13752) {
        this.f67570 = c13752;
    }

    @Override // com.rosan.dhizuku.aidl.IDhizukuRequestPermissionListener
    public final void onRequestPermission(int i) {
        if (this.f67569) {
            return;
        }
        this.f67569 = true;
        C13752 c13752 = this.f67570;
        if (i == 0) {
            c13752.m33510(EnumC23589.DHIZUKU);
        } else {
            c13752.m33511(EnumC23589.DHIZUKU);
        }
    }
}
