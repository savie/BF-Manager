package l;

import android.view.View;
import android.widget.AdapterView;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I69B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11954 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2780 f40079;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C11954(C2780 c2780) {
        this.f40079 = c2780;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            C2780 c2780 = this.f40079;
            String string = c2780.m22075()[i].toString();
            if (string.equals(c2780.getValue())) {
                return;
            }
            c2780.m13140((Serializable) string);
            c2780.m22069(string);
        }
    }
}
