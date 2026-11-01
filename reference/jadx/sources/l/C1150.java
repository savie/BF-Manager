package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.֨ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1150 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13146 f5166;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C1150(C13146 c13146) {
        this.f5166 = c13146;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C13146 c13146 = this.f5166;
        if (adapterView == c13146.f43769) {
            if (c13146.f43767) {
                return;
            }
            c13146.f43759 = (String) c13146.f43762.get(i);
            C13146.f43755 = (String) c13146.f43775.get(i);
            if (c13146.f43768.targetLanguageMutable) {
                c13146.m32513();
                return;
            }
            return;
        }
        if (adapterView != c13146.f43772 || c13146.f43767 || c13146.f43773) {
            return;
        }
        c13146.f43770 = (String) c13146.f43771.get(i);
        C13146.f43756 = (String) c13146.f43763.get(i);
    }
}
