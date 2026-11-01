package l;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14472 implements InterfaceC19307, InterfaceC4509, InterfaceC11566 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47445;

    public /* synthetic */ C14472(Object obj, Object obj2) {
        this.f47444 = obj;
        this.f47445 = obj2;
    }

    @Override // l.InterfaceC19307
    /* JADX INFO: renamed from: ۙ */
    public void mo22938(PointF pointF, int i, int i2, float f, float f2) {
        ServiceC12465 serviceC12465 = (ServiceC12465) this.f47444;
        int[] iArr = (int[]) this.f47445;
        serviceC12465.m30947((serviceC12465.f41571.getWidth() / 2) + ((int) (iArr[0] + f)), (serviceC12465.f41571.getHeight() / 2) + ((int) (iArr[1] + f2)));
    }

    @Override // l.InterfaceC11566
    /* JADX INFO: renamed from: ۙ */
    public void mo5406(TextView textView, TextView textView2, Button button) {
        String str = (String) this.f47444;
        String str2 = (String) this.f47445;
        ViewOnClickListenerC22523.m50035(textView, str);
        ViewOnClickListenerC22523.m50035(textView2, str2);
        button.setVisibility(4);
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        String str = (String) this.f47444;
        View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) this.f47445;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(10);
        ViewOnClickListenerC22523.m50035(textView, str);
        if (onLongClickListener != null) {
            textView.setOnLongClickListener(onLongClickListener);
        }
    }
}
