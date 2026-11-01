package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14313 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f46881;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f46882;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC20430 f46883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f46884;

    public C14313(EditText editText, TextView textView, Button button, RunnableC20430 runnableC20430) {
        this.f46884 = editText;
        this.f46881 = textView;
        this.f46882 = button;
        this.f46883 = runnableC20430;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            onNothingSelected(adapterView);
            return;
        }
        C13607.m33242(C13607.f44883.getInt(i - 1)).mo1163(this.f46884, this.f46881, this.f46882);
        this.f46883.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C13607.f44885.mo1163(this.f46884, this.f46881, this.f46882);
        this.f46883.run();
    }
}
