package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15454 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11967 f50311;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Map f50312;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f50313;

    public C15454(C11967 c11967, boolean z) {
        this.f50311 = c11967;
        this.f50313 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m37007(String str) {
        return (List) this.f50312.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37008(ActivityC0848 activityC0848, Exception exc) {
        activityC0848.m40401(exc, (DialogInterface.OnDismissListener) null);
        boolean z = exc instanceof C17692;
        if (z) {
            C17692 c17692 = (C17692) exc;
            C15301 c15301M36736 = C15301.m36736(c17692.f58154, c17692.f58152);
            c15301M36736.f50017 = false;
            activityC0848.m3452(c17692.m41404(), c15301M36736);
            this.f50311.m29972(c17692.m41404());
        }
        if (z || (exc instanceof C10254)) {
            C22673.m51152(R.string.MT_Protector);
        }
    }
}
