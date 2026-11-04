package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܰ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14606 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC2739 f46012;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f46013;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f46014;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f46015;

    public C14606(C23255 c23255, TextView textView, Button button, RunnableC2739 runnableC2739) {
        this.f46015 = c23255;
        this.f46014 = textView;
        this.f46013 = button;
        this.f46012 = runnableC2739;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            onNothingSelected(adapterView);
            return;
        }
        C19147.m44384(C19147.f61963.getInt(i - 1)).mo2465(this.f46015, this.f46014, this.f46013);
        this.f46012.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C19147.f61961.mo2465(this.f46015, this.f46014, this.f46013);
        this.f46012.run();
    }
}
