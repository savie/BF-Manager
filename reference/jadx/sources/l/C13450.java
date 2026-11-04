package l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K1JK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13450 extends AbstractViewOnClickListenerC10466 implements InterfaceC3800 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageView f42824;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ImageView f42825;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextView f42826;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = this.f42824;
        if (C14941.f48783.m55200()) {
            return;
        }
        boolean zM49187 = this.f33309.m49187();
        C14941 c14941 = this.f33308;
        if (zM49187) {
            c14941.m35954(this.f33309);
            ObjectAnimator.ofFloat(imageView, "rotation", 135.0f, 90.0f).setDuration(100L).start();
        } else {
            c14941.m35949(this.f33309);
            ObjectAnimator.ofFloat(imageView, "rotation", 90.0f, 135.0f).setDuration(100L).start();
        }
    }

    @Override // l.InterfaceC3800
    /* JADX INFO: renamed from: ۙ */
    public final void mo12333(int i) {
        C14941 c14941 = this.f33308;
        c14941.f48800 = null;
        if (i == 0) {
            this.f33309.m49178();
            m33091(this.f33309.f69129);
        } else {
            this.f33309.m49190();
            m33092(this.f33309.f69129);
        }
        this.f33309.m49181(true);
        c14941.m35962();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33091(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            c21655.m49178();
            c21655.m49195();
            if (!c21655.m49186()) {
                m33091(c21655.f69129);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m33092(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21655 c21655 = (C21655) it.next();
            c21655.m49190();
            c21655.m49195();
            if (!c21655.m49186()) {
                m33092(c21655.f69129);
            }
        }
    }
}
