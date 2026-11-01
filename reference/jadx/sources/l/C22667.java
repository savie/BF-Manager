package l;

import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KATI */
/* JADX INFO: loaded from: classes.dex */
public final class C22667 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16233 f73821;

    public C22667(C16233 c16233) {
        this.f73821 = c16233;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50199(AbstractC2120 abstractC2120, AbstractC11729 abstractC11729, C0875 c0875, HashSet hashSet, BitSet bitSet) {
        C0875 c0875M3498;
        C23018 c23018;
        C16233 c16233 = this.f73821;
        int i = c16233.f52364;
        if (hashSet.add(new C20466(abstractC2120, 0, abstractC11729))) {
            if (abstractC2120 == null) {
                if (abstractC11729 == null) {
                    c0875.m3502(-2);
                    return;
                } else if (abstractC11729.mo10719()) {
                    c0875.m3502(-1);
                    return;
                }
            }
            if (abstractC2120 instanceof C6789) {
                if (abstractC11729 == null) {
                    c0875.m3502(-2);
                    return;
                }
                if (abstractC11729.mo10719()) {
                    c0875.m3502(-1);
                    return;
                }
                if (abstractC11729 != C3615.f13295) {
                    boolean z = bitSet.get(abstractC2120.f7773);
                    try {
                        bitSet.clear(abstractC2120.f7773);
                        for (int i2 = 0; i2 < abstractC11729.mo10717(); i2++) {
                            m50199((AbstractC2120) c16233.f52365.get(abstractC11729.mo10718(i2)), abstractC11729.mo10716(i2), c0875, hashSet, bitSet);
                        }
                        if (z) {
                            bitSet.set(abstractC2120.f7773);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z) {
                            bitSet.set(abstractC2120.f7773);
                        }
                        throw th;
                    }
                }
            }
            int size = abstractC2120.f7778.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC17373 abstractC17373M6671 = abstractC2120.m6671(i3);
                if (abstractC17373M6671.getClass() == C23018.class) {
                    C23018 c23019 = (C23018) abstractC17373M6671;
                    if (!bitSet.get(c23019.f55272.f7773)) {
                        C7495 c7495M19996 = C7495.m19996(abstractC11729, c23019.f74809.f7775);
                        try {
                            bitSet.set(((C23018) abstractC17373M6671).f55272.f7773);
                            c23018 = c23019;
                            try {
                                m50199(abstractC17373M6671.f55272, c7495M19996, c0875, hashSet, bitSet);
                                bitSet.clear(c23018.f55272.f7773);
                            } catch (Throwable th2) {
                                th = th2;
                                bitSet.clear(c23018.f55272.f7773);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c23018 = c23019;
                        }
                    }
                } else {
                    if ((abstractC17373M6671 instanceof AbstractC3531) || abstractC17373M6671.mo12939()) {
                        m50199(abstractC17373M6671.f55272, abstractC11729, c0875, hashSet, bitSet);
                    } else if (abstractC17373M6671.getClass() == C6084.class) {
                        C0875 c0876 = new C0875(new int[0]);
                        c0876.m3503(1, i);
                        c0875.m3504(c0876);
                    } else {
                        C0875 c0875Mo26136 = abstractC17373M6671.mo26136();
                        if (c0875Mo26136 != null) {
                            if (abstractC17373M6671 instanceof C5733) {
                                C0875 c0877 = new C0875(new int[0]);
                                c0877.m3503(1, i);
                                if (c0877.m3507()) {
                                    c0875M3498 = null;
                                } else if (c0875Mo26136.m3507()) {
                                    c0875Mo26136 = new C0875(c0877);
                                } else {
                                    c0875M3498 = C0875.m3498(c0877, c0875Mo26136);
                                }
                                c0875Mo26136 = c0875M3498;
                            }
                            c0875.m3504(c0875Mo26136);
                        }
                    }
                }
            }
        }
    }
}
