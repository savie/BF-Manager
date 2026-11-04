package l;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes3.dex */
public class C3694 implements InterfaceC2588 {
    @Override // l.InterfaceC2588
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8653(Context context) {
        C25324 c25324 = new C25324(new C16372(context));
        c25324.f23295 = 1;
        C2203.m7515(c25324);
        AbstractC8585 lifecycle = ((InterfaceC11217) C1097.m4096(context).m4097()).getLifecycle();
        lifecycle.mo23077(new C11897(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // l.InterfaceC2588
    /* JADX INFO: renamed from: ۙ */
    public final List mo8654() {
        return Collections.singletonList(C3760.class);
    }
}
