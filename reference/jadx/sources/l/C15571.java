package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15571 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13334 f50632;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3054 f50633;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f50634;

    public C15571(C13334 c13334, C3054 c3054, View view) {
        this.f50632 = c13334;
        this.f50633 = c3054;
        this.f50634 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC5877 interfaceC5877M32920;
        C13334 c13334 = this.f50632;
        if (c13334.f42531 != null && !c13334.f42531.mo10251().isEmpty()) {
            C13334.m32904(c13334.f42531 instanceof C3136).m17671((String) this.f50633.getItem(i));
            c13334.f42525 = true;
        } else {
            c13334.f42525 = false;
        }
        if (System.currentTimeMillis() - c13334.f42532 > 300 && (interfaceC5877M32920 = c13334.m32920()) != null) {
            c13334.mo22490(interfaceC5877M32920);
        }
        C13334.m32909(c13334, this.f50634);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C13334 c13334 = this.f50632;
        c13334.f42525 = false;
        C13334.m32909(c13334, this.f50634);
    }
}
