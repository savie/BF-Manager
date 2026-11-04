package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ᩴۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19514 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f62963;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f62964;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C19514(C1255 c1255, C1255 c1256) {
        this.f62964 = c1255;
        this.f62963 = c1256;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean z = EnumC6670.values()[i].f22243;
        C1255 c1255 = this.f62963;
        C1255 c1256 = this.f62964;
        if (z) {
            c1256.setVisibility(0);
            if (c1255 != null) {
                c1255.setVisibility(8);
                return;
            }
            return;
        }
        c1256.setVisibility(8);
        if (c1255 != null) {
            c1255.setVisibility(0);
        }
    }
}
