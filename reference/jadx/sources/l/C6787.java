package l;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: KIY7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6787 extends AbstractC15251 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC8278 f22616;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C21965 f22617;

    @Override // l.AbstractC15251
    /* JADX INFO: renamed from: ۛۙ */
    public final int mo13126() {
        return 0;
    }

    @Override // l.AbstractC15251
    /* JADX INFO: renamed from: ᩺ۙ */
    public final /* bridge */ /* synthetic */ AbstractC16481 mo13131() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6787(C2551 c2551, C21219 c21219, C21965 c21965) {
        C17973 c17973M17530;
        super(EnumC24203.CONSTRUCTOR, c21219.m44039() - 1);
        this.f22617 = c21965;
        C1345 c1345M49700 = c21965.m49700();
        boolean z = false;
        AbstractC16481 abstractC16481Mo44035 = c21219.mo44035(0);
        abstractC16481Mo44035.getClass();
        if (!abstractC16481Mo44035.mo17865(EnumC1763.THIS)) {
            ArrayDeque arrayDeque = new ArrayDeque();
            HashSet hashSet = new HashSet();
            arrayDeque.add(abstractC16481Mo44035);
            boolean z2 = false;
            while (true) {
                if (arrayDeque.isEmpty()) {
                    z = z2;
                    break;
                }
                AbstractC16481 abstractC16481 = (AbstractC16481) arrayDeque.removeFirst();
                abstractC16481.getClass();
                if (!abstractC16481.mo17865(EnumC1763.THIS)) {
                    if (!(abstractC16481 instanceof C6041) || (c17973M17530 = ((C6041) abstractC16481).m17530()) == null) {
                        break;
                    }
                    if (hashSet.add(c17973M17530)) {
                        C18959 c18959M41951 = c17973M17530.m41951();
                        if (c18959M41951 == null || !(c18959M41951.getType() == EnumC24203.MOVE || c18959M41951.getType() == EnumC24203.PHI)) {
                            break;
                        }
                        Iterator it = c18959M41951.m44026().iterator();
                        while (it.hasNext()) {
                            arrayDeque.addLast((AbstractC16481) it.next());
                        }
                    } else {
                        continue;
                    }
                } else {
                    z2 = true;
                }
            }
        } else {
            z = true;
        }
        this.f22616 = !z ? EnumC8278.CONSTRUCTOR : !c1345M49700.equals(c2551.m8536().m55571()) ? EnumC8278.SUPER : this.f22617.m49701().equals(c2551.mo8532().m49701()) ? EnumC8278.SELF : EnumC8278.THIS;
        int iM44039 = c21219.m44039();
        for (int i = 1; i < iM44039; i++) {
            mo44014(c21219.mo44035(i));
        }
    }

    public C6787(C21965 c21965, EnumC8278 enumC8278) {
        super(EnumC24203.CONSTRUCTOR, c21965.m49705());
        this.f22617 = c21965;
        this.f22616 = enumC8278;
    }

    @Override // l.AbstractC15251
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C21965 mo18926() {
        return this.f22617;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final C1345 m18927() {
        return this.f22617.m49700();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final EnumC8278 m18924() {
        return this.f22616;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18925() {
        return this.f22616 == EnumC8278.CONSTRUCTOR;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18922() {
        return this.f22616 == EnumC8278.SUPER;
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18923() {
        return this.f22616 == EnumC8278.THIS;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18921() {
        return this.f22616 == EnumC8278.SELF;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C6787) && super.mo4075(c18959)) {
            C6787 c6787 = (C6787) c18959;
            if (this.f22617.equals(c6787.f22617) && this.f22616 == c6787.f22616) {
                return true;
            }
        }
        return false;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C6787 c6787 = new C6787(this.f22617, this.f22616);
        m44033(c6787);
        return c6787;
    }

    @Override // l.C18959
    public final String toString() {
        return super.toString() + " call: " + this.f22617 + " type: " + this.f22616;
    }
}
