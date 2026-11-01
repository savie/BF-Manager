package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23701 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76684;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4794 f76685;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76686;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9590 f76687;

    public RunnableC23701(C4794 c4794, int i, int i2, C9590 c9590) {
        this.f76685 = c4794;
        this.f76684 = i;
        this.f76686 = i2;
        this.f76687 = c9590;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4794 c4794 = this.f76685;
        InterfaceC3238 interfaceC3238 = c4794.f16856;
        if (interfaceC3238 != null) {
            ArrayList arrayList = c4794.f16853;
            int i = this.f76684;
            arrayList.remove(i);
            c4794.m13312(i, this.f76686, this.f76687);
            C2677 c2677 = (C2677) interfaceC3238;
            TextView textView = c2677.f10348;
            Runnable runnable = c2677.f10347;
            textView.removeCallbacks(runnable);
            textView.post(runnable);
        }
    }
}
