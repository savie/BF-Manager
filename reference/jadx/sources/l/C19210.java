package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9E2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19210 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f62129 = C16980.m40037(C19210.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f62130 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44528(C11707 c11707) throws C2013 {
        while (true) {
            AbstractC11751 abstractC11751M38525 = C16226.m38525(c11707);
            if (abstractC11751M38525.m29501() == EnumC2057.MsvAvEOL) {
                return;
            }
            f62129.mo13723("Read TargetInfo {} --> {}", abstractC11751M38525.m29501(), abstractC11751M38525.m29502());
            this.f62130.add(abstractC11751M38525);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44530(C11707 c11707) {
        for (AbstractC11751 abstractC11751 : this.f62130) {
            f62129.mo13723("Writing TargetInfo {} --> {}", abstractC11751.m29501(), abstractC11751.m29502());
            abstractC11751.mo11567(c11707);
        }
        new C16972().mo11567(c11707);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19210 m44527() {
        C19210 c19210 = new C19210();
        c19210.f62130 = new ArrayList(this.f62130);
        return c19210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11751 m44526(EnumC2057 enumC2057) {
        for (AbstractC11751 abstractC11751 : this.f62130) {
            if (abstractC11751.m29501() == enumC2057) {
                return abstractC11751;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44529(AbstractC11751 abstractC11751) {
        for (AbstractC11751 abstractC11752 : this.f62130) {
            if (abstractC11752.m29501() == abstractC11751.m29501()) {
                this.f62130.remove(abstractC11752);
                break;
            }
        }
        this.f62130.add(abstractC11751);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m44531(EnumC2057 enumC2057) {
        Iterator it = this.f62130.iterator();
        while (it.hasNext()) {
            if (((AbstractC11751) it.next()).m29501() == enumC2057) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "TargetInfo{targetInfo=" + this.f62130 + '}';
    }
}
