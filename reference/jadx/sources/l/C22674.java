package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes.dex */
public final class C22674 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8229 f73833;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Map f73834;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f73835;

    public C22674(C8229 c8229, boolean z) {
        this.f73833 = c8229;
        this.f73835 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m50206(String str) {
        return (List) this.f73834.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50207(ActivityC5677 activityC5677, Exception exc) {
        activityC5677.m31002(exc, (DialogInterface.OnDismissListener) null);
        boolean z = exc instanceof C8563;
        if (z) {
            C8563 c8563 = (C8563) exc;
            C8500 c8500M22223 = C8500.m22223(c8563.f29593, c8563.f29592);
            c8500M22223.f29474 = false;
            activityC5677.m15674(c8563.m22321(), c8500M22223);
            this.f73833.m21575(c8563.m22321());
        }
        if (z || (exc instanceof C4811)) {
            C15829.m37611(R.string.MT_Protector);
        }
    }
}
