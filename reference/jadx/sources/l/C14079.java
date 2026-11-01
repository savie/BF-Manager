package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C14079 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7022 f46240;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C14079(C7022 c7022) {
        this.f46240 = c7022;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C6129 c6129;
        if (i == -1 || (c6129 = this.f46240.f23605) == null) {
            return;
        }
        c6129.m17110(false);
    }
}
