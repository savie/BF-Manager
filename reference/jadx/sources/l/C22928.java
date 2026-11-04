package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes.dex */
public final class C22928 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16960 f74501;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C22928(C16960 c16960) {
        this.f74501 = c16960;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C9479 c9479;
        if (i == -1 || (c9479 = this.f74501.f55410) == null) {
            return;
        }
        c9479.m24863(false);
    }
}
