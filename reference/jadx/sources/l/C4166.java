package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۘ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4166 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC2739 f14144;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f14145;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f14146;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f14147;

    public C4166(C23255 c23255, TextView textView, Button button, RunnableC2739 runnableC2739) {
        this.f14147 = c23255;
        this.f14146 = textView;
        this.f14145 = button;
        this.f14144 = runnableC2739;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C19147.m44384(C19147.f61962.getInt(i)).mo2465(this.f14147, this.f14146, this.f14145);
        this.f14144.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C19147.f61961.mo2465(this.f14147, this.f14146, this.f14145);
        this.f14144.run();
    }
}
