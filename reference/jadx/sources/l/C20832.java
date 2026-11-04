package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.᩵᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20832 extends AbstractC6662 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66705;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f66706;

    @Override // l.AbstractC6662
    /* JADX INFO: renamed from: ۙ */
    public final C20832 mo18607() {
        return this;
    }

    public C20832() {
        super(true);
        this.f66705 = new ArrayList();
        this.f66706 = false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList m47638() {
        return this.f66705;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m47637() {
        C8172 c8172 = C4424.f15867;
        ArrayList<AbstractC6662> arrayList = this.f66705;
        Collections.sort(arrayList, c8172);
        for (AbstractC6662 abstractC6662 : arrayList) {
            if (abstractC6662.m18625()) {
                abstractC6662.mo18607().m47637();
            }
        }
    }

    @Override // l.AbstractC6662
    /* JADX INFO: renamed from: ᩷ */
    public final C12627 mo18632() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m47636() {
        if (this.f66706) {
            return true;
        }
        for (AbstractC6662 abstractC6662 : this.f66705) {
            if (abstractC6662.m18625() && abstractC6662.mo18607().m47636()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC6662
    /* JADX INFO: renamed from: ۙ */
    public final void mo18610(CountDownLatch countDownLatch) {
        this.f22209 = countDownLatch;
        Iterator it = this.f66705.iterator();
        while (it.hasNext()) {
            ((AbstractC6662) it.next()).mo18610(countDownLatch);
        }
    }
}
