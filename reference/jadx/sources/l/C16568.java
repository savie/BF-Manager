package l;

import android.view.View;
import android.widget.AdapterView;
import bin.mt.plugin.api.ui.PluginSpinner;

/* JADX INFO: renamed from: l.ܺۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16568 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17314 f53637;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PluginSpinner.OnItemSelectedListener f53638;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C16568(C17314 c17314, PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f53637 = c17314;
        this.f53638 = onItemSelectedListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f53638.onItemSelected(this.f53637, i);
    }
}
