package l;

import android.widget.TextView;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC25311 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81763;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Throwable f81764;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81765;

    public /* synthetic */ RunnableC25311(Object obj, Throwable th, int i) {
        this.f81763 = i;
        this.f81765 = obj;
        this.f81764 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f81763) {
            case 0:
                InterfaceC17105 interfaceC17105 = (InterfaceC17105) this.f81765;
                Throwable th = this.f81764;
                interfaceC17105.mo40270(new IOException(th.getMessage(), th));
                break;
            default:
                TextView textView = (TextView) this.f81765;
                textView.setText(this.f81764.toString());
                textView.setTextColor(C3296.f10774);
                break;
        }
    }
}
