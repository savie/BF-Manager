package l;

import android.animation.ObjectAnimator;
import android.view.View;
import bin.mt.plus.Main;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R4LW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC6314 extends AbstractC14389 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f21338;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f21339;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f21340;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f21341;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17603 f21342;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12665 f21343;

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo17411() {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15483(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543, int i);

    public AbstractViewOnClickListenerC6314(Main main, String str, String str2, C12665 c12665) {
        super(main);
        this.f21338 = new ArrayList();
        this.f21339 = str;
        this.f21340 = str2;
        this.f21343 = c12665;
        this.f21341 = ApplicationC0716.f2992.getBoolean(str2, true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int mo17413() {
        ArrayList arrayList = this.f21338;
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (this.f21341) {
            return arrayList.size() + 1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17412(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543) {
        C17603 c17603 = (C17603) abstractViewOnLongClickListenerC22543;
        this.f21342 = c17603;
        c17603.f55946 = this;
        c17603.f73517.setText(this.f21339);
        this.f21342.itemView.setOnClickListener(this);
        this.f21342.itemView.setOnLongClickListener(this);
        this.f21342.f55945.setRotationX(this.f21341 ? 0.0f : 180.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        boolean z = !this.f21341;
        this.f21341 = z;
        interfaceC17314Edit.putBoolean(this.f21340, z).apply();
        boolean z2 = this.f21341;
        ArrayList arrayList = this.f21338;
        C12665 c12665 = this.f21343;
        if (z2) {
            mo17411();
            ObjectAnimator.ofFloat(this.f21342.f55945, "rotationX", 180.0f, 0.0f).setDuration(200L).start();
            c12665.notifyItemRangeInserted(c12665.m31486(this) + 1, arrayList.size());
        } else {
            ObjectAnimator.ofFloat(this.f21342.f55945, "rotationX", 0.0f, 180.0f).setDuration(200L).start();
            c12665.notifyItemRangeRemoved(c12665.m31486(this) + 1, arrayList.size());
        }
    }
}
