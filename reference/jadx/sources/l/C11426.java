package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11426 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f38473;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38474;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f38475;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f38476;

    public C11426(C7898 c7898, ActivityC5677 activityC5677, int i) {
        this.f38473 = c7898;
        this.f38475 = activityC5677;
        this.f38474 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f38475, this.f38474);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C7898 c7898;
        while (true) {
            c7898 = this.f38473;
            if (c7898.f25970 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        Collection collectionM21569 = c7898.f25970.m21569();
        this.f38476 = new ArrayList(collectionM21569.size());
        Iterator it = collectionM21569.iterator();
        while (it.hasNext()) {
            this.f38476.add(new C0841((String) it.next()));
        }
        c7898.f25964 = false;
        c7898.f25961 = false;
        c7898.m20881(this.f38476);
        C7898.m20898(c7898);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ArrayList arrayList = this.f38476;
        C7898 c7898 = this.f38473;
        c7898.f25968 = arrayList;
        c7898.f25967.notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C7898 c7898 = this.f38473;
        c7898.f25962.m42627((Throwable) exc);
        boolean z = exc instanceof C8563;
        if (z) {
            C8563 c8563 = (C8563) exc;
            C8500 c8500M22223 = C8500.m22223(c8563.f29593, c8563.f29592);
            c8500M22223.f29474 = false;
            this.f38475.m15674(c8563.m22321(), c8500M22223);
            c7898.f25970.m21575(c8563.m22321());
        }
        if (z || (exc instanceof C4811)) {
            C15829.m37611(R.string.MT_Protector);
        }
        if (c7898.f25968 == null) {
            c7898.f25968 = Collections.EMPTY_LIST;
            c7898.f25964 = false;
            c7898.f25961 = false;
            c7898.f25967.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
