package l;

import android.view.View;
import android.widget.AdapterView;
import bin.mt.plugin.api.ui.PluginSpinner;

/* JADX INFO: renamed from: l.۫۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12421 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17359 f41455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PluginSpinner.OnItemSelectedListener f41456;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C12421(C17359 c17359, PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f41455 = c17359;
        this.f41456 = onItemSelectedListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f41456.onItemSelected(this.f41455, i);
    }
}
