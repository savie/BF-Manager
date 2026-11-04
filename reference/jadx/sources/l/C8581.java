package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8581 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f28058 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28059 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C8581 f28060;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22884 f28061;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m23072(Context context, int i) {
        return this.f28061.m51616(context, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23073(Context context) {
        this.f28061.m51618(context);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized ColorStateList m23074(Context context, int i) {
        return this.f28061.m51620(context, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m23075(Context context, int i) {
        return this.f28061.m51617(context, i, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized PorterDuffColorFilter m23069(int i, PorterDuff.Mode mode) {
        return C22884.m51607(i, mode);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized void m23070() {
        if (f28060 == null) {
            C8581 c8581 = new C8581();
            f28060 = c8581;
            c8581.f28061 = C22884.m51609();
            f28060.f28061.m51619(new C2615());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized C8581 m23071() {
        if (f28060 == null) {
            m23070();
        }
        return f28060;
    }
}
