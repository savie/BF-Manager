package l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R54E */
/* JADX INFO: loaded from: classes4.dex */
public final class C18933 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43611(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18227.m42380(view, charSequence);
        } else {
            ViewOnLongClickListenerC9056.m23386(view, charSequence);
        }
    }
}
