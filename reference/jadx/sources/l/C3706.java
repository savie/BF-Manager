package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 76DY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3706 extends AbstractC16700 {
    static {
        C16980.m40037(C3706.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524() || c2551.m8515() == null || c2551.m8508().isEmpty() || c2551.mo17867(C11457.f36007)) {
            return;
        }
        HashSet hashSet = new HashSet();
        C24590.m54904(c2551, new C16384(hashSet));
        if (c2551.m8508().size() != hashSet.size()) {
            for (C21943 c21943 : c2551.m8508()) {
                if (!hashSet.contains(c21943) && !((ArrayList) c21943.mo1986()).isEmpty() && !c21943.mo17865(EnumC1763.ADDED_TO_REGION) && !c21943.mo17865(EnumC1763.DONT_GENERATE) && !c21943.mo17865(EnumC1763.REMOVE)) {
                    C15382 c15382 = new C15382();
                    c15382.mo10278();
                    c15382.mo10285();
                    C0052 c0052 = new C0052(C8256.m22230(c2551), true);
                    Iterator it = ((ArrayList) c21943.mo1986()).iterator();
                    while (it.hasNext()) {
                        try {
                            c0052.m943(c15382, (C18959) it.next());
                        } catch (C7852 unused) {
                        }
                    }
                    c15382.mo10285();
                    c2551.m31136("Code restructure failed: missing block: " + c21943 + ", code lost:" + c15382.m36846().replace("*/", "*\\/"));
                }
            }
        }
        C24590.m54904(c2551, new C23844(1));
    }
}
