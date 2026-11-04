package l;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16236 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PendingIntent f52773;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f52774;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f52775;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f52776;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24663[] f52777;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C9545 f52778;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    @Deprecated
    public int f52779;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle f52780;

    public C16236(C9545 c9545, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C24663[] c24663Arr, C24663[] c24663Arr2, boolean z, boolean z2) {
        this.f52776 = true;
        this.f52778 = c9545;
        if (c9545 != null && c9545.m24970() == 2) {
            this.f52779 = c9545.m24968();
        }
        this.f52774 = C3558.m11588(charSequence);
        this.f52773 = pendingIntent;
        this.f52780 = bundle == null ? new Bundle() : bundle;
        this.f52777 = c24663Arr;
        this.f52775 = z;
        this.f52776 = z2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9545 m38536() {
        int i;
        if (this.f52778 == null && (i = this.f52779) != 0) {
            this.f52778 = C9545.m24960((Resources) null, "", i);
        }
        return this.f52778;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38534() {
        return this.f52775;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24663[] m38535() {
        return this.f52777;
    }
}
