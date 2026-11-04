package l;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24230 implements InterfaceC19795, InterfaceC11615, InterfaceC5392, InterfaceC22491 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f78478;

    public /* synthetic */ C24230(Object obj) {
        this.f78478 = obj;
    }

    public /* synthetic */ C24230(C11041 c11041, List list) {
        this.f78478 = list;
    }

    @Override // l.InterfaceC22491
    public C3977 onApplyWindowInsets(View view, C3977 c3977) {
        ActivityC20779.m47541((ActivityC20779) this.f78478, view, c3977);
        return c3977;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        C3288.m10829((C8614) this.f78478, abstractC22044);
    }

    @Override // l.InterfaceC11615
    /* JADX INFO: renamed from: ۙ */
    public boolean mo13186(String str) {
        return ((String) this.f78478).equals(str);
    }
}
