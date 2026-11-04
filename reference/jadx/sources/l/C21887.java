package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩷ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes.dex */
public final class C21887 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC7013 f69738;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f69739;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f69740;

    public C21887(View view, RunnableC7013 runnableC7013) {
        this.f69740 = view;
        this.f69738 = runnableC7013;
        view.setVisibility(8);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۜܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C21887.m49578(this.f16663);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49580() {
        return this.f69739;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49578(C21887 c21887) {
        if (c21887.f69739) {
            c21887.f69739 = false;
            c21887.f69740.setVisibility(8);
            c21887.f69738.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49579() {
        if (this.f69739) {
            return;
        }
        this.f69739 = true;
        this.f69740.setVisibility(0);
        this.f69738.run();
    }
}
