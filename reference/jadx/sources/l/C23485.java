package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public final class C23485 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f76042;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f76043;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC20430 f76044;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f76045;

    public C23485(EditText editText, TextView textView, Button button, RunnableC20430 runnableC20430) {
        this.f76045 = editText;
        this.f76042 = textView;
        this.f76043 = button;
        this.f76044 = runnableC20430;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C13607.m33242(C13607.f44884.getInt(i)).mo1163(this.f76045, this.f76042, this.f76043);
        this.f76044.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C13607.f44885.mo1163(this.f76045, this.f76042, this.f76043);
        this.f76044.run();
    }
}
