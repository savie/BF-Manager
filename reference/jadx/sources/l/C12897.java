package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.۫ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12897 extends AbstractC6274 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5440 f41247;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2999(View view, Object obj) {
        return view == obj;
    }

    public C12897(ActivityC5440 activityC5440) {
        this.f41247 = activityC5440;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(final int i) {
        ActivityC5440 activityC5440 = this.f41247;
        if (i == activityC5440.f19003.size()) {
            C21576.m49068(new Runnable() { // from class: l.ܳۚᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    TabLayout.Tab tabAt = this.f49373.f41247.f19005.getTabAt(i);
                    C17359.requireNonNull(tabAt);
                    tabAt.setIcon(R.drawable.MT_Protector);
                }
            });
            return null;
        }
        try {
            return ((C8640) activityC5440.f19003.get(i)).m23287().m6082();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2997(C15179 c15179, int i) {
        View view;
        ActivityC5440 activityC5440 = this.f41247;
        if (i == activityC5440.f19003.size()) {
            view = activityC5440.f19002.f63205;
        } else {
            view = ((C8640) activityC5440.f19003.get(i)).f28226;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        c15179.addView(view);
        return view;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo2998(C15179 c15179, int i, Object obj) {
        c15179.removeView((View) obj);
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return this.f41247.f19003.size() + 1;
    }
}
