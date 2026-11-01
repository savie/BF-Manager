package l;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public class C18461 implements InterfaceC3900 {
    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10668(Context context) {
        C6466 c6466 = new C6466(new C21283(context));
        c6466.f11995 = 1;
        C12817.m31809(c6466);
        AbstractC3062 lifecycle = ((InterfaceC1423) C1078.m4057(context).m4058()).getLifecycle();
        lifecycle.mo9171(new C3643(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ۙ */
    public final List mo10669() {
        return Collections.singletonList(C21179.class);
    }
}
