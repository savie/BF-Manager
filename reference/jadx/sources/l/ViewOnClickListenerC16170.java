package l;

import android.os.Build;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: l.ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16170 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7967 f52500;

    public ViewOnClickListenerC16170(C7967 c7967) {
        this.f52500 = c7967;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18408 c18408;
        C7967 c7967 = this.f52500;
        if (view == c7967.f26472) {
            c7967.m21688();
            return;
        }
        if (view == c7967.f26491) {
            c7967.m21689();
            return;
        }
        if (view == c7967.f26469) {
            c7967.m21687();
            return;
        }
        if (view != c7967.f26485 && view == (c18408 = c7967.f26490)) {
            if (Build.VERSION.SDK_INT >= 29) {
                C6476.m18297(c18408);
                return;
            }
            C24376 c24376 = C7967.f26467;
            c24376.m54496(c18408);
            c24376.m54494((AutoCompleteTextView) c18408);
        }
    }
}
