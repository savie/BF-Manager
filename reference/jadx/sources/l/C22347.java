package l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩹ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes.dex */
public final class C22347 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f72954 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f72955;

    public C22347(View view) {
        this.f72955 = view;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m49556(DialogInterfaceC19356 dialogInterfaceC19356) {
        if (!this.f72954.compareAndSet(false, true)) {
            return false;
        }
        C23053.m51000(dialogInterfaceC19356, this.f72955, true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49555(DialogInterfaceC19356 dialogInterfaceC19356) {
        if (!this.f72954.compareAndSet(true, false)) {
            return false;
        }
        if (dialogInterfaceC19356.m44375()) {
            C23053.m51000(dialogInterfaceC19356, this.f72955, false);
        }
        return true;
    }
}
