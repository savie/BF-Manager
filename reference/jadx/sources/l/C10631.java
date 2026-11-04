package l;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: l.ۤۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D97F */
/* JADX INFO: loaded from: classes4.dex */
public final class C10631 extends AbstractC9642 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C9407 f33718;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f33719;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27123(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f33719;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public C10631(long j, C10631 c10631, C9407 c9407, int i) {
        super(j, c10631, i);
        this.f33718 = c9407;
        this.f33719 = new AtomicReferenceArray(C8662.f28287 * 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27122(int i, boolean z) {
        if (z) {
            C9407 c9407 = this.f33718;
            C15243.m36586(c9407);
            c9407.m24785((this.f31168 * ((long) C8662.f28287)) + ((long) i));
        }
        m25154();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9407 m27125() {
        C9407 c9407 = this.f33718;
        C15243.m36586(c9407);
        return c9407;
    }

    @Override // l.AbstractC9642
    /* JADX INFO: renamed from: ֫ */
    public final int mo25151() {
        return C8662.f28287;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m27126(int i) {
        return this.f33719.get(i * 2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object m27127(int i) {
        Object objM27126 = m27126(i);
        this.f33719.set(i * 2, null);
        return objM27126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27119(int i) {
        this.f33719.set(i * 2, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27121(int i, C14115 c14115) {
        this.f33719.set(i * 2, c14115);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m27124(int i) {
        return this.f33719.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27120(int i, Object obj) {
        this.f33719.set((i * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m27118(int i, C7406 c7406) {
        return this.f33719.getAndSet((i * 2) + 1, c7406);
    }

    @Override // l.AbstractC9642
    /* JADX INFO: renamed from: ۙ */
    public final void mo25152(int i, InterfaceC11536 interfaceC11536) {
        AtomicReferenceArray atomicReferenceArray;
        C9407 c9407;
        int i2 = C8662.f28287;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        m27126(i);
        while (true) {
            Object objM27124 = m27124(i);
            boolean z2 = objM27124 instanceof InterfaceC6426;
            atomicReferenceArray = this.f33719;
            c9407 = this.f33718;
            if (!z2 && !(objM27124 instanceof C1683)) {
                if (objM27124 == C8662.f28278 || objM27124 == C8662.f28279) {
                    break;
                }
                if (objM27124 != C8662.f28282 && objM27124 != C8662.f28280) {
                    if (objM27124 == C8662.f28276 || objM27124 == C8662.f28274 || objM27124 == C8662.m23330()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM27124).toString());
                }
            } else {
                if (m27123(i, objM27124, z ? C8662.f28278 : C8662.f28279)) {
                    atomicReferenceArray.set(i * 2, null);
                    m27122(i, !z);
                    if (z) {
                        C15243.m36586(c9407);
                        return;
                    }
                    return;
                }
            }
        }
        atomicReferenceArray.set(i * 2, null);
        if (z) {
            C15243.m36586(c9407);
        }
    }
}
