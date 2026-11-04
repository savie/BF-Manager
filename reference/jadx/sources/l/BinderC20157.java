package l;

import com.rosan.dhizuku.api.DhizukuRequestPermissionListener;

/* JADX INFO: renamed from: l.ᩴ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC20157 extends DhizukuRequestPermissionListener {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f64756;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f64757 = false;

    public BinderC20157(C6733 c6733) {
        this.f64756 = c6733;
    }

    @Override // com.rosan.dhizuku.aidl.IDhizukuRequestPermissionListener
    public final void onRequestPermission(int i) {
        if (this.f64757) {
            return;
        }
        this.f64757 = true;
        C6733 c6733 = this.f64756;
        if (i == 0) {
            c6733.m18825(EnumC16427.DHIZUKU);
        } else {
            c6733.m18826(EnumC16427.DHIZUKU);
        }
    }
}
