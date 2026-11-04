package l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۫ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12801 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f41015 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f41016;

    public C12801(View view) {
        this.f41016 = view;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m31749(DialogInterfaceC8327 dialogInterfaceC8327) {
        if (!this.f41015.compareAndSet(false, true)) {
            return false;
        }
        C16530.m39162(dialogInterfaceC8327, this.f41016, true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31748(DialogInterfaceC8327 dialogInterfaceC8327) {
        if (!this.f41015.compareAndSet(true, false)) {
            return false;
        }
        if (dialogInterfaceC8327.m22434()) {
            C16530.m39162(dialogInterfaceC8327, this.f41016, false);
        }
        return true;
    }
}
