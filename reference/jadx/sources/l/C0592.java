package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.֡ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0592 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f2572;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12588 f2573;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0733 f2574;

    public C0592(C12588 c12588, C0733 c0733, View view) {
        this.f2573 = c12588;
        this.f2574 = c0733;
        this.f2572 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC17526 interfaceC17526M31326;
        C12588 c12588 = this.f2573;
        boolean z = false;
        if (c12588.f42072 != null && !c12588.f42072.mo13404().isEmpty()) {
            boolean z2 = c12588.f42072 instanceof C9745;
            C14000 c14000M31310 = C12588.m31310(z2);
            c14000M31310.m33842((String) this.f2574.getItem(i));
            if (!z2 && !c12588.f42067.equals(c14000M31310.m33841())) {
                z = true;
            }
            c12588.f42068 = z;
            if (c12588.f42072.mo13411()) {
                c12588.m31311(i, c14000M31310);
            }
        } else {
            c12588.f42068 = false;
        }
        if (System.currentTimeMillis() - c12588.f42065 > 300 && (interfaceC17526M31326 = c12588.m31326()) != null) {
            c12588.mo21878(interfaceC17526M31326);
        }
        C12588.m31315(c12588, this.f2572);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C12588 c12588 = this.f2573;
        c12588.f42068 = false;
        C12588.m31315(c12588, this.f2572);
    }
}
