package l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R54E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6696 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18717(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C12661.m31431(view, charSequence);
        } else {
            ViewOnLongClickListenerC14898.m35847(view, charSequence);
        }
    }
}
