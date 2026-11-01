package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes.dex */
public final class C23521 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C23521 f76121;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f76122 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76123 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4800 f76124;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m51804(Context context, int i) {
        return this.f76124.m13329(context, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51805(Context context) {
        this.f76124.m13331(context);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized ColorStateList m51806(Context context, int i) {
        return this.f76124.m13333(context, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m51807(Context context, int i) {
        return this.f76124.m13330(context, i, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized PorterDuffColorFilter m51801(int i, PorterDuff.Mode mode) {
        return C4800.m13321(i, mode);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized void m51802() {
        if (f76121 == null) {
            C23521 c23521 = new C23521();
            f76121 = c23521;
            c23521.f76124 = C4800.m13323();
            f76121.f76124.m13332(new C10821());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized C23521 m51803() {
        if (f76121 == null) {
            m51802();
        }
        return f76121;
    }
}
