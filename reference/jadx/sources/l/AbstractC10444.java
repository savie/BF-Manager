package l;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۤܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10444 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f35652;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f35653;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f35654;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35655;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f35656;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f35657;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f35658;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f35659;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f35660;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2399 f35661;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35662;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f35663;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f35664;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f35665;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f35666;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f35667 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CountDownLatch f35668;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f35669;

    /* JADX INFO: renamed from: ۙ */
    public abstract C19616 mo23365();

    /* JADX INFO: renamed from: ܰ */
    public abstract C9033 mo23366();

    public AbstractC10444(boolean z) {
        this.f35655 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26367(C7318 c7318, boolean z) {
        if (this.f35655) {
            if (z) {
                c7318.m19524(m26380());
            }
            c7318.m19524(m26394());
            Iterator it = mo23365().m44704().iterator();
            while (it.hasNext()) {
                ((AbstractC10444) it.next()).m26367(c7318, z);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26387() {
        return this.f35655;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m26392() {
        return this.f35666;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26381(long j) {
        this.f35666 = j;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long m26359() {
        return this.f35657;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26363(long j) {
        this.f35657 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26369(boolean z) {
        this.f35662 = z;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m26374() {
        return this.f35662;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26364(String str) {
        this.f35653 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m26360() {
        return this.f35653;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m26362() {
        String str = this.f35663;
        if (str != null) {
            return str;
        }
        AbstractC20745 abstractC20745 = this.f35669;
        C13638.requireNonNull(abstractC20745);
        return abstractC20745.mo33986();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m26380() {
        AbstractC20745 abstractC20745 = this.f35669;
        if (abstractC20745 != null) {
            return abstractC20745;
        }
        String str = this.f35663;
        C13638.requireNonNull(str);
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        this.f35669 = abstractC20745M15313;
        return abstractC20745M15313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26368(AbstractC20745 abstractC20745) {
        this.f35669 = abstractC20745;
        this.f35663 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26378(String str) {
        this.f35663 = str;
        this.f35669 = null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m26385() {
        String str = this.f35658;
        if (str != null) {
            return str;
        }
        AbstractC20745 abstractC20745 = this.f35665;
        C13638.requireNonNull(abstractC20745);
        return abstractC20745.mo33986();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m26394() {
        AbstractC20745 abstractC20745 = this.f35665;
        if (abstractC20745 != null) {
            return abstractC20745;
        }
        String str = this.f35658;
        C13638.requireNonNull(str);
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        this.f35665 = abstractC20745M15313;
        return abstractC20745M15313;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26383(AbstractC20745 abstractC20745) {
        this.f35665 = abstractC20745;
        this.f35658 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m26371(String str) {
        this.f35658 = str;
        this.f35665 = null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m26393() {
        return this.f35654;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26382(String str) {
        this.f35654 = str;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m26389() {
        return this.f35664;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26379(boolean z) {
        this.f35664 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m26388() {
        return this.f35660;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m26386() {
        this.f35660 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m26376() {
        return this.f35652;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26384(boolean z) {
        this.f35652 = z;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m26375() {
        return this.f35659;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m26390() {
        this.f35659 = true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object m26372() {
        return this.f35667;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26361(String str) {
        this.f35667 = str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2399 m26370() {
        return this.f35661;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5222 m26377() {
        C2399 c2399 = this.f35661;
        if (c2399 == null) {
            return null;
        }
        return new C5222(c2399);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26366(C2399 c2399) {
        this.f35661 = c2399;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo26365(CountDownLatch countDownLatch) {
        this.f35668 = countDownLatch;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26391() {
        CountDownLatch countDownLatch = this.f35668;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m26373() {
        CountDownLatch countDownLatch = this.f35656;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
