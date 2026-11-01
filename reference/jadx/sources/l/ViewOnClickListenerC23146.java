package l;

import android.os.Build;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: l.᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23146 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20323 f75143;

    public ViewOnClickListenerC23146(C20323 c20323) {
        this.f75143 = c20323;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C21028 c21028;
        C20323 c20323 = this.f75143;
        if (view == c20323.f65811) {
            c20323.m45869();
            return;
        }
        if (view == c20323.f65827) {
            c20323.m45867();
            return;
        }
        if (view == c20323.f65816) {
            c20323.m45872();
            return;
        }
        if (view != c20323.f65826 && view == (c21028 = c20323.f65812)) {
            if (Build.VERSION.SDK_INT >= 29) {
                C8329.m21749(c21028);
                return;
            }
            C19618 c19618 = C20323.f65804;
            c19618.m44714(c21028);
            c19618.m44712((AutoCompleteTextView) c21028);
        }
    }
}
