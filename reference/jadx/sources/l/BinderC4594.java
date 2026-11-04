package l;

import android.os.Bundle;
import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ۙۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC4594 extends IShizukuApplication.Stub {
    @Override // moe.shizuku.server.IShizukuApplication
    public final void showPermissionConfirmation(int i, int i2, String str, int i3) {
    }

    @Override // moe.shizuku.server.IShizukuApplication
    public final void bindApplication(Bundle bundle) {
        C12797.f40939 = bundle.getInt("shizuku:attach-reply-uid", -1);
        C12797.f40932 = bundle.getInt("shizuku:attach-reply-version", -1);
        bundle.getInt("shizuku:attach-reply-patch-version", -1);
        bundle.getString("shizuku:attach-reply-secontext");
        C12797.f40930 = bundle.getBoolean("shizuku:attach-reply-permission-granted", false);
        bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
        C12797.m31684();
    }

    @Override // moe.shizuku.server.IShizukuApplication
    public final void dispatchRequestPermissionResult(int i, Bundle bundle) {
        C12797.m31688(i, bundle.getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1);
    }
}
