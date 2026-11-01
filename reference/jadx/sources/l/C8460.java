package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.۠᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8460 extends AbstractC14217 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f29359;

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4244(View view, Object obj) {
        return view == obj;
    }

    public C8460(ActivityC19749 activityC19749) {
        this.f29359 = activityC19749;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4241(final int i) {
        ActivityC19749 activityC19749 = this.f29359;
        if (i == activityC19749.f63470.size()) {
            C16737.m39273(new Runnable() { // from class: l.ᩴ᩹ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    TabLayout.Tab tabAt = this.f61599.f29359.f63469.getTabAt(i);
                    C13638.requireNonNull(tabAt);
                    tabAt.setIcon(R.drawable.MT_Protector);
                }
            });
            return null;
        }
        try {
            return ((C1403) activityC19749.f63470.get(i)).m4915().m23581();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4242(C19383 c19383, int i) {
        View view;
        ActivityC19749 activityC19749 = this.f29359;
        if (i == activityC19749.f63470.size()) {
            view = activityC19749.f63466.f58501;
        } else {
            view = ((C1403) activityC19749.f63470.get(i)).f5815;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        c19383.addView(view);
        return view;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo4243(C19383 c19383, int i, Object obj) {
        c19383.removeView((View) obj);
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ܰ */
    public final int mo4245() {
        return this.f29359.f63470.size() + 1;
    }
}
