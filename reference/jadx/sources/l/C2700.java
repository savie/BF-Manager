package l;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۖ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2700 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f8577 = new WeakHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9411 m8865(AbstractC11781 abstractC11781, EnumC20234 enumC20234) {
        C14769<C9411> c14769 = (C14769) this.f8577.get(abstractC11781);
        if (c14769 == null) {
            return null;
        }
        for (C9411 c9411 : c14769) {
            if (c9411.f30544.f45571.mo2277().f15333 == enumC20234) {
                return c9411;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8866(AbstractC8036 abstractC8036, C14479 c14479) {
        AbstractC11781 abstractC11781 = c14479.f45571.mo2277().f15336;
        WeakHashMap weakHashMap = this.f8577;
        C14769 c14769M35543 = (C14769) weakHashMap.get(abstractC11781);
        if (c14769M35543 == null) {
            c14769M35543 = C14769.m35543();
        }
        C9411 c9411 = new C9411();
        c9411.f30545 = abstractC8036;
        c9411.f30544 = c14479;
        weakHashMap.put(abstractC11781, c14769M35543.m35552(c9411));
    }
}
