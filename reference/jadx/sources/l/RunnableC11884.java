package l;

import android.widget.TextView;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11884 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38303;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38305;

    public /* synthetic */ RunnableC11884(int i, Object obj, Object obj2) {
        this.f38303 = i;
        this.f38305 = obj;
        this.f38304 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38303) {
            case 0:
                ((InterfaceC17105) this.f38305).mo40270((IOException) this.f38304);
                break;
            default:
                TextView textView = (TextView) this.f38305;
                C14872 c14872 = (C14872) this.f38304;
                textView.setText(c14872.m35809().m49107());
                if (c14872.m35809() != EnumC21586.SUCCESS) {
                    textView.setTextColor(c14872.m35810() ? C3296.f10760 : C3296.f10774);
                }
                break;
        }
    }
}
