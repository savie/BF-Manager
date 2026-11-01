package l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K1JK */
/* JADX INFO: loaded from: classes4.dex */
public final class C10592 extends AbstractViewOnClickListenerC5030 implements InterfaceC11318 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ImageView f36239;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ImageView f36240;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f36241;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = this.f36240;
        if (C9886.f33734.m50803()) {
            return;
        }
        boolean zM10413 = this.f17534.m10413();
        C9886 c9886 = this.f17535;
        if (zM10413) {
            c9886.m25015(this.f17534);
            ObjectAnimator.ofFloat(imageView, "rotation", 135.0f, 90.0f).setDuration(100L).start();
        } else {
            c9886.m25002(this.f17534);
            ObjectAnimator.ofFloat(imageView, "rotation", 90.0f, 135.0f).setDuration(100L).start();
        }
    }

    @Override // l.InterfaceC11318
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26770(int i) {
        C9886 c9886 = this.f17535;
        c9886.f33735 = null;
        if (i == 0) {
            this.f17534.m10400();
            m26768(this.f17534.f13024);
        } else {
            this.f17534.m10410();
            m26769(this.f17534.f13024);
        }
        this.f17534.m10403(true);
        c9886.m25017();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26768(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            c3534.m10400();
            c3534.m10414();
            if (!c3534.m10396()) {
                m26768(c3534.f13024);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m26769(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3534 c3534 = (C3534) it.next();
            c3534.m10410();
            c3534.m10414();
            if (!c3534.m10396()) {
                m26769(c3534.f13024);
            }
        }
    }
}
