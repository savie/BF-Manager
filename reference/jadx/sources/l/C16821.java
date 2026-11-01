package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܽᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16821 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0733 f53848;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12588 f53849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f53850;

    public C16821(C12588 c12588, C0733 c0733, View view) {
        this.f53849 = c12588;
        this.f53848 = c0733;
        this.f53850 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC17526 interfaceC17526M31326;
        C12588 c12588 = this.f53849;
        if (c12588.f42072 != null && !c12588.f42072.mo13410().isEmpty()) {
            C12588.m31310(c12588.f42072 instanceof C9745).m33845((String) this.f53848.getItem(i));
            c12588.f42071 = true;
        } else {
            c12588.f42071 = false;
        }
        if (System.currentTimeMillis() - c12588.f42065 > 300 && (interfaceC17526M31326 = c12588.m31326()) != null) {
            c12588.mo21878(interfaceC17526M31326);
        }
        C12588.m31315(c12588, this.f53850);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C12588 c12588 = this.f53849;
        c12588.f42071 = false;
        C12588.m31315(c12588, this.f53850);
    }
}
