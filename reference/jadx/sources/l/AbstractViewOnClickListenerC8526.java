package l;

import android.animation.ObjectAnimator;
import android.view.View;
import bin.mt.plus.Main;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4LW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC8526 extends AbstractC6796 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f27855;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f27856;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f27857;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27858;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2560 f27859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9271 f27860;

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3565(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544, int i);

    /* JADX INFO: renamed from: ᩸ */
    public void mo3566() {
    }

    public AbstractViewOnClickListenerC8526(Main main, String str, String str2, C9271 c9271) {
        super(main);
        this.f27858 = new ArrayList();
        this.f27857 = str;
        this.f27856 = str2;
        this.f27860 = c9271;
        this.f27855 = ApplicationC17729.f58258.getBoolean(str2, true);
    }

    /* JADX INFO: renamed from: ۤ */
    public int mo13033() {
        ArrayList arrayList = this.f27858;
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (this.f27855) {
            return arrayList.size() + 1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo22839(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544) {
        C2560 c2560 = (C2560) abstractViewOnLongClickListenerC5544;
        this.f27859 = c2560;
        c2560.f8229 = this;
        c2560.f19266.setText(this.f27857);
        this.f27859.itemView.setOnClickListener(this);
        this.f27859.itemView.setOnLongClickListener(this);
        this.f27859.f8228.setRotationX(this.f27855 ? 0.0f : 180.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        boolean z = !this.f27855;
        this.f27855 = z;
        interfaceC18752Edit.putBoolean(this.f27856, z).apply();
        boolean z2 = this.f27855;
        ArrayList arrayList = this.f27858;
        C9271 c9271 = this.f27860;
        if (z2) {
            mo3566();
            ObjectAnimator.ofFloat(this.f27859.f8228, "rotationX", 180.0f, 0.0f).setDuration(200L).start();
            c9271.notifyItemRangeInserted(c9271.m24474(this) + 1, arrayList.size());
        } else {
            ObjectAnimator.ofFloat(this.f27859.f8228, "rotationX", 0.0f, 180.0f).setDuration(200L).start();
            c9271.notifyItemRangeRemoved(c9271.m24474(this) + 1, arrayList.size());
        }
    }
}
