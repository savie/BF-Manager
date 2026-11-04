package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9509 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30798;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f30799;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2009 f30800;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f30801;

    public C9509(C2009 c2009, ActivityC0848 activityC0848, int i) {
        this.f30800 = c2009;
        this.f30799 = activityC0848;
        this.f30798 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f30799, this.f30798);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C2009 c2009;
        while (true) {
            c2009 = this.f30800;
            if (c2009.f6692 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        Collection collectionM29994 = c2009.f6692.m29994();
        this.f30801 = new ArrayList(collectionM29994.size());
        Iterator it = collectionM29994.iterator();
        while (it.hasNext()) {
            this.f30801.add(new C13984((String) it.next()));
        }
        c2009.f6683 = false;
        c2009.f6690 = false;
        c2009.m6866(this.f30801);
        C2009.m6883(c2009);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ArrayList arrayList = this.f30801;
        C2009 c2009 = this.f30800;
        c2009.f6682 = arrayList;
        c2009.f6689.notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C2009 c2009 = this.f30800;
        c2009.f6686.m51299(exc);
        boolean z = exc instanceof C17692;
        if (z) {
            C17692 c17692 = (C17692) exc;
            C15301 c15301M36736 = C15301.m36736(c17692.f58154, c17692.f58152);
            c15301M36736.f50017 = false;
            this.f30799.m3452(c17692.m41404(), c15301M36736);
            c2009.f6692.m29972(c17692.m41404());
        }
        if (z || (exc instanceof C10254)) {
            C22673.m51152(R.string.MT_Protector);
        }
        if (c2009.f6682 == null) {
            c2009.f6682 = Collections.EMPTY_LIST;
            c2009.f6683 = false;
            c2009.f6690 = false;
            c2009.f6689.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
