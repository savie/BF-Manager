package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۖܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2590 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f10180;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f10181;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C2590(C12562 c12562, C12562 c12563) {
        this.f10181 = c12562;
        this.f10180 = c12563;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean z = EnumC7501.values()[i].f24976;
        C12562 c12562 = this.f10180;
        C12562 c12563 = this.f10181;
        if (z) {
            c12563.setVisibility(0);
            if (c12562 != null) {
                c12562.setVisibility(8);
                return;
            }
            return;
        }
        c12563.setVisibility(8);
        if (c12562 != null) {
            c12562.setVisibility(0);
        }
    }
}
