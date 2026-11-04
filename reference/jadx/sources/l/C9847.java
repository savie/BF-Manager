package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۢۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes4.dex */
public final class C9847 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f31688;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31689;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final WeakReference f31690;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f31691;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5877 f31692;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f31693;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final WeakReference f31694;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f31695;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final WeakReference f31696;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f31697;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final WeakReference f31698;

    public C9847(InterfaceC5877 interfaceC5877, AtomicInteger atomicInteger, String str, AbstractActivityC17204 abstractActivityC17204, TextView textView, TextView textView2, TextView textView3, View view, Button button) {
        C15243.m36590(interfaceC5877, d.R);
        C15243.m36590(atomicInteger, "translateTaskMark");
        C15243.m36590(str, TextBundle.TEXT_ENTRY);
        C15243.m36590(abstractActivityC17204, "activity");
        C15243.m36590(textView, "srcTextView");
        C15243.m36590(textView2, "tarTextView");
        C15243.m36590(textView3, "fixTranslate");
        C15243.m36590(view, "progressBar");
        this.f31692 = interfaceC5877;
        this.f31689 = atomicInteger;
        this.f31697 = str;
        this.f31693 = new WeakReference(abstractActivityC17204);
        this.f31696 = new WeakReference(textView);
        this.f31694 = new WeakReference(textView2);
        this.f31690 = new WeakReference(textView3);
        this.f31691 = new WeakReference(view);
        this.f31698 = new WeakReference(button);
        view.setVisibility(0);
        button.setEnabled(false);
        this.f31688 = atomicInteger.incrementAndGet();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f31692.beforeStart();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        InterfaceC5877 interfaceC5877 = this.f31692;
        interfaceC5877.onStart();
        this.f31695 = interfaceC5877.mo17103(this.f31697);
        interfaceC5877.onFinish();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f31692.afterFinish();
        if (this.f31688 == this.f31689.get()) {
            TextView textView = (TextView) this.f31696.get();
            String str = this.f31697;
            if (textView != null) {
                textView.setText(str);
            }
            WeakReference weakReference = this.f31694;
            TextView textView2 = (TextView) weakReference.get();
            if (textView2 != null) {
                textView2.setText(this.f31695);
            }
            String str2 = this.f31695;
            if (str2 != null && str2.length() >= 100) {
                TextView textView3 = (TextView) weakReference.get();
                if (textView3 != null) {
                    textView3.setTextSize(16.0f);
                }
            } else {
                TextView textView4 = (TextView) weakReference.get();
                if (textView4 != null) {
                    textView4.setTextSize(18.0f);
                }
            }
            TextView textView5 = (TextView) this.f31690.get();
            if (textView5 != null) {
                String strM25599 = !new C9826("[a-zA-Z0-9_]+").m25600((CharSequence) str) ? str : new C9826("([0-9])([a-zA-Z])").m25599(new C9826("([a-zA-Z])([0-9])").m25599(new C9826("([a-z])([A-Z])").m25599(C0878.m3573(str, "_", " "))));
                if (!strM25599.equals(str)) {
                    textView5.setText(textView5.getContext().getString(R.string.MT_Protector, strM25599));
                    textView5.setTag(strM25599);
                    textView5.setVisibility(0);
                    return;
                }
                textView5.setVisibility(8);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        AbstractActivityC17204 abstractActivityC17204;
        if (this.f31688 != this.f31689.get() || this.f31692.onError(exc) || (abstractActivityC17204 = (AbstractActivityC17204) this.f31693.get()) == null) {
            return;
        }
        abstractActivityC17204.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f31688 == this.f31689.get()) {
            View view = (View) this.f31698.get();
            if (view != null) {
                view.setEnabled(true);
            }
            View view2 = (View) this.f31691.get();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }
}
