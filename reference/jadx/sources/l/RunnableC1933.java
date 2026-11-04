package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1933 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6486;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16102 f6487;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6488;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16848 f6489;

    public RunnableC1933(C16102 c16102, int i, int i2, C16848 c16848) {
        this.f6487 = c16102;
        this.f6488 = i;
        this.f6486 = i2;
        this.f6489 = c16848;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C16102 c16102 = this.f6487;
        InterfaceC17594 interfaceC17594 = c16102.f52158;
        if (interfaceC17594 != null) {
            ArrayList arrayList = c16102.f52161;
            int i = this.f6488;
            arrayList.remove(i);
            c16102.m38256(i, this.f6486, this.f6489);
            C20578 c20578 = (C20578) interfaceC17594;
            TextView textView = c20578.f65905;
            Runnable runnable = c20578.f65904;
            textView.removeCallbacks(runnable);
            textView.post(runnable);
        }
    }
}
