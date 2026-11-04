package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ᩴ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C20047 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13334 f64423;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f64424;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3054 f64425;

    public C20047(C13334 c13334, C3054 c3054, View view) {
        this.f64423 = c13334;
        this.f64425 = c3054;
        this.f64424 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC5877 interfaceC5877M32920;
        C13334 c13334 = this.f64423;
        boolean z = false;
        if (c13334.f42531 != null && !c13334.f42531.mo10253().isEmpty()) {
            boolean z2 = c13334.f42531 instanceof C3136;
            C6120 c6120M32904 = C13334.m32904(z2);
            c6120M32904.m17668((String) this.f64425.getItem(i));
            if (!z2 && !c13334.f42524.equals(c6120M32904.m17667())) {
                z = true;
            }
            c13334.f42530 = z;
            if (c13334.f42531.mo10252()) {
                c13334.m32905(i, c6120M32904);
            }
        } else {
            c13334.f42530 = false;
        }
        if (System.currentTimeMillis() - c13334.f42532 > 300 && (interfaceC5877M32920 = c13334.m32920()) != null) {
            c13334.mo22490(interfaceC5877M32920);
        }
        C13334.m32909(c13334, this.f64424);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C13334 c13334 = this.f64423;
        c13334.f42530 = false;
        C13334.m32909(c13334, this.f64424);
    }
}
