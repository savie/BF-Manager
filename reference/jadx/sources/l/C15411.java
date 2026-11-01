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

/* JADX INFO: renamed from: l.ܶᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes4.dex */
public final class C15411 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC17526 f50236;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f50237;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final WeakReference f50238;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f50239;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final WeakReference f50240;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f50241;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f50242;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f50243;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f50244;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final WeakReference f50245;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final WeakReference f50246;

    public C15411(InterfaceC17526 interfaceC17526, AtomicInteger atomicInteger, String str, AbstractActivityC12483 abstractActivityC12483, TextView textView, TextView textView2, TextView textView3, View view, Button button) {
        C13465.m32966(interfaceC17526, d.R);
        C13465.m32966(atomicInteger, "translateTaskMark");
        C13465.m32966(str, TextBundle.TEXT_ENTRY);
        C13465.m32966(abstractActivityC12483, "activity");
        C13465.m32966(textView, "srcTextView");
        C13465.m32966(textView2, "tarTextView");
        C13465.m32966(textView3, "fixTranslate");
        C13465.m32966(view, "progressBar");
        this.f50236 = interfaceC17526;
        this.f50239 = atomicInteger;
        this.f50243 = str;
        this.f50245 = new WeakReference(abstractActivityC12483);
        this.f50244 = new WeakReference(textView);
        this.f50242 = new WeakReference(textView2);
        this.f50240 = new WeakReference(textView3);
        this.f50238 = new WeakReference(view);
        this.f50246 = new WeakReference(button);
        view.setVisibility(0);
        button.setEnabled(false);
        this.f50237 = atomicInteger.incrementAndGet();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f50236.beforeStart();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        InterfaceC17526 interfaceC17526 = this.f50236;
        interfaceC17526.onStart();
        this.f50241 = interfaceC17526.mo6394(this.f50243);
        interfaceC17526.onFinish();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f50236.afterFinish();
        if (this.f50237 == this.f50239.get()) {
            TextView textView = (TextView) this.f50244.get();
            String str = this.f50243;
            if (textView != null) {
                textView.setText(str);
            }
            WeakReference weakReference = this.f50242;
            TextView textView2 = (TextView) weakReference.get();
            if (textView2 != null) {
                textView2.setText(this.f50241);
            }
            String str2 = this.f50241;
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
            TextView textView5 = (TextView) this.f50240.get();
            if (textView5 != null) {
                String strM39324 = !new C16762("[a-zA-Z0-9_]+").m39325((CharSequence) str) ? str : new C16762("([0-9])([a-zA-Z])").m39324(new C16762("([a-zA-Z])([0-9])").m39324(new C16762("([a-z])([A-Z])").m39324(C12529.m31134(str, "_", " "))));
                if (!strM39324.equals(str)) {
                    textView5.setText(textView5.getContext().getString(R.string.MT_Protector, strM39324));
                    textView5.setTag(strM39324);
                    textView5.setVisibility(0);
                    return;
                }
                textView5.setVisibility(8);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractActivityC12483 abstractActivityC12483;
        if (this.f50237 != this.f50239.get() || this.f50236.onError(exc) || (abstractActivityC12483 = (AbstractActivityC12483) this.f50245.get()) == null) {
            return;
        }
        abstractActivityC12483.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f50237 == this.f50239.get()) {
            View view = (View) this.f50246.get();
            if (view != null) {
                view.setEnabled(true);
            }
            View view2 = (View) this.f50238.get();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }
}
