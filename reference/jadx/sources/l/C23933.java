package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩻᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23933 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC17582 f77511;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f77512;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f77513;

    public C23933(View view, RunnableC17582 runnableC17582) {
        this.f77513 = view;
        this.f77511 = runnableC17582;
        view.setVisibility(8);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩶᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C23933.m52752(this.f38007);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m52754() {
        return this.f77512;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52752(C23933 c23933) {
        if (c23933.f77512) {
            c23933.f77512 = false;
            c23933.f77513.setVisibility(8);
            c23933.f77511.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52753() {
        if (this.f77512) {
            return;
        }
        this.f77512 = true;
        this.f77513.setVisibility(0);
        this.f77511.run();
    }
}
