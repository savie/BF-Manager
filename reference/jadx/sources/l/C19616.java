package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.᩵ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19616 extends AbstractC10444 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f62969;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62970;

    @Override // l.AbstractC10444
    /* JADX INFO: renamed from: ۙ */
    public final C19616 mo23365() {
        return this;
    }

    public C19616() {
        super(true);
        this.f62970 = new ArrayList();
        this.f62969 = false;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList m44704() {
        return this.f62970;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m44705() {
        C18910 c18910 = C21026.f68464;
        ArrayList<AbstractC10444> arrayList = this.f62970;
        Collections.sort(arrayList, c18910);
        for (AbstractC10444 abstractC10444 : arrayList) {
            if (abstractC10444.m26387()) {
                abstractC10444.mo23365().m44705();
            }
        }
    }

    @Override // l.AbstractC10444
    /* JADX INFO: renamed from: ܰ */
    public final C9033 mo23366() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m44706() {
        if (this.f62969) {
            return true;
        }
        for (AbstractC10444 abstractC10444 : this.f62970) {
            if (abstractC10444.m26387() && abstractC10444.mo23365().m44706()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC10444
    /* JADX INFO: renamed from: ۙ */
    public final void mo26365(CountDownLatch countDownLatch) {
        this.f35668 = countDownLatch;
        Iterator it = this.f62970.iterator();
        while (it.hasNext()) {
            ((AbstractC10444) it.next()).mo26365(countDownLatch);
        }
    }
}
