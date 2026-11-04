package l;

import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: KATI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8020 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11002 f26630;

    public C8020(C11002 c11002) {
        this.f26630 = c11002;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21888(AbstractC17715 abstractC17715, AbstractC12450 abstractC12450, C14907 c14907, HashSet hashSet, BitSet bitSet) {
        C14907 c14907M35855;
        C7976 c7976;
        C11002 c11002 = this.f26630;
        int i = c11002.f34756;
        if (hashSet.add(new C22937(abstractC17715, 0, abstractC12450))) {
            if (abstractC17715 == null) {
                if (abstractC12450 == null) {
                    c14907.m35858(-2);
                    return;
                } else if (abstractC12450.mo30922()) {
                    c14907.m35858(-1);
                    return;
                }
            }
            if (abstractC17715 instanceof C0518) {
                if (abstractC12450 == null) {
                    c14907.m35858(-2);
                    return;
                }
                if (abstractC12450.mo30922()) {
                    c14907.m35858(-1);
                    return;
                }
                if (abstractC12450 != C18461.f60086) {
                    boolean z = bitSet.get(abstractC17715.f58211);
                    try {
                        bitSet.clear(abstractC17715.f58211);
                        for (int i2 = 0; i2 < abstractC12450.mo15679(); i2++) {
                            m21888((AbstractC17715) c11002.f34748.get(abstractC12450.mo15680(i2)), abstractC12450.mo15678(i2), c14907, hashSet, bitSet);
                        }
                        if (z) {
                            bitSet.set(abstractC17715.f58211);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z) {
                            bitSet.set(abstractC17715.f58211);
                        }
                        throw th;
                    }
                }
            }
            int size = abstractC17715.f58208.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC5959 abstractC5959M41478 = abstractC17715.m41478(i3);
                if (abstractC5959M41478.getClass() == C7976.class) {
                    C7976 c7977 = (C7976) abstractC5959M41478;
                    if (!bitSet.get(c7977.f20405.f58211)) {
                        C5213 c5213M15677 = C5213.m15677(abstractC12450, c7977.f26510.f58209);
                        try {
                            bitSet.set(((C7976) abstractC5959M41478).f20405.f58211);
                            c7976 = c7977;
                            try {
                                m21888(abstractC5959M41478.f20405, c5213M15677, c14907, hashSet, bitSet);
                                bitSet.clear(c7976.f20405.f58211);
                            } catch (Throwable th2) {
                                th = th2;
                                bitSet.clear(c7976.f20405.f58211);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c7976 = c7977;
                        }
                    }
                } else {
                    if ((abstractC5959M41478 instanceof AbstractC23683) || abstractC5959M41478.mo2570()) {
                        m21888(abstractC5959M41478.f20405, abstractC12450, c14907, hashSet, bitSet);
                    } else if (abstractC5959M41478.getClass() == C2230.class) {
                        C14907 c14908 = new C14907(new int[0]);
                        c14908.m35859(1, i);
                        c14907.m35860(c14908);
                    } else {
                        C14907 c14907Mo17341 = abstractC5959M41478.mo17341();
                        if (c14907Mo17341 != null) {
                            if (abstractC5959M41478 instanceof C2010) {
                                C14907 c14909 = new C14907(new int[0]);
                                c14909.m35859(1, i);
                                if (c14909.m35863()) {
                                    c14907M35855 = null;
                                } else if (c14907Mo17341.m35863()) {
                                    c14907Mo17341 = new C14907(c14909);
                                } else {
                                    c14907M35855 = C14907.m35855(c14909, c14907Mo17341);
                                }
                                c14907Mo17341 = c14907M35855;
                            }
                            c14907.m35860(c14907Mo17341);
                        }
                    }
                }
            }
        }
    }
}
