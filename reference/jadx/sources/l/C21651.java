package l;

import android.view.View;
import android.widget.AdapterView;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩶᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I69B */
/* JADX INFO: loaded from: classes.dex */
public final class C21651 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18667 f69120;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C21651(C18667 c18667) {
        this.f69120 = c18667;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            C18667 c18667 = this.f69120;
            String string = c18667.m49455()[i].toString();
            if (string.equals(c18667.getValue())) {
                return;
            }
            c18667.m12566((Serializable) string);
            c18667.m49460(string);
        }
    }
}
