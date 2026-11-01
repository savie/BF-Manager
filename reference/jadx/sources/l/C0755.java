package l;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;

/* JADX INFO: renamed from: l.֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes2.dex */
public final class C0755 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f3059;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Bundle f3060;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PendingIntent f3061;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16775 f3062;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f3063;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f3064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public int f3065;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2642[] f3066;

    public C0755(C16775 c16775, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C2642[] c2642Arr, C2642[] c2642Arr2, boolean z, boolean z2) {
        this.f3059 = true;
        this.f3062 = c16775;
        if (c16775 != null && c16775.m39338() == 2) {
            this.f3065 = c16775.m39344();
        }
        this.f3064 = C3577.m10573(charSequence);
        this.f3061 = pendingIntent;
        this.f3060 = bundle == null ? new Bundle() : bundle;
        this.f3066 = c2642Arr;
        this.f3063 = z;
        this.f3059 = z2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16775 m3252() {
        int i;
        if (this.f3062 == null && (i = this.f3065) != 0) {
            this.f3062 = C16775.m39334((Resources) null, "", i);
        }
        return this.f3062;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3250() {
        return this.f3063;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2642[] m3251() {
        return this.f3066;
    }
}
