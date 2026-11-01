package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۛ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5747 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10687 f19540;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C5747(C10687 c10687) {
        this.f19540 = c10687;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f19540.m26896(i);
    }
}
