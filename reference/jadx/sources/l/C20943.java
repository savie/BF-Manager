package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I9EA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20943 extends C11771 {
    @Override // l.C11771
    /* JADX INFO: renamed from: ܰ */
    public final void mo2356(C19240 c19240) throws C17271 {
        c19240.m27389(2);
        int iM27375 = c19240.m27375();
        int iM27378 = c19240.m27378();
        if (iM27375 > 0 && iM27378 > 0) {
            ArrayList arrayList = new ArrayList();
            c19240.m27376(((C1186) this.f34399).mo4329() + iM27375);
            while (true) {
                int iM27402 = c19240.m27402();
                C2494 c2494 = new C2494();
                c2494.m7627(c19240);
                arrayList.add(c2494);
                if (c2494.m7626() == 0) {
                    break;
                } else {
                    c19240.m27376(c2494.m7626() + iM27402);
                }
            }
        }
        c19240.m27376(((C1186) this.f34399).mo4329() + iM27375 + iM27378);
    }
}
