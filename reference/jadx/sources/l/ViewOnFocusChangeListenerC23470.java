package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩹ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC23470 implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (view instanceof C23255) {
            C23255 c23255 = (C23255) view;
            if (z) {
                C21576.m49068(new RunnableC0361(2, c23255));
            } else {
                c23255.mo52339(c23255.m53882());
            }
        }
    }
}
