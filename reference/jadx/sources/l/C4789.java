package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6C8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4789 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C9812 f16787;

    public C4789(C9812 c9812, C6041 c6041, AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        this();
        m44031(c6041);
        if (abstractC16481.m39119() && abstractC16482.m39121()) {
            this.f16787 = C9812.m25574(c9812);
            mo44014(abstractC16482);
            mo44014(abstractC16481);
        } else {
            this.f16787 = c9812;
            mo44014(abstractC16481);
            mo44014(abstractC16482);
        }
        C13498 c13498 = new C13498(0, this);
        super.mo14761(c13498);
        this.f16787.m25581(c13498);
    }

    public C4789() {
        super(EnumC24203.TERNARY, 2);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C9812 m14764() {
        return this.f16787;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final void m14763() {
        C9812 c9812M25578 = C9812.m25578(this.f16787);
        this.f16787 = c9812M25578;
        if (c9812M25578.m25590() == EnumC18763.NOT) {
            this.f16787 = C9812.m25574(this.f16787);
            AbstractC16481 abstractC16481Mo44035 = mo44035(0);
            mo44012(0, mo44035(1));
            mo44012(1, abstractC16481Mo44035);
        }
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14760(Collection collection) {
        super.mo14760(collection);
        collection.addAll(this.f16787.m25587());
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14762(AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        if (super.mo14762(abstractC16481, abstractC16482)) {
            return true;
        }
        return this.f16787.m25582(abstractC16481, abstractC16482);
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14761(Consumer consumer) {
        super.mo14761(consumer);
        this.f16787.m25581(consumer);
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C4789) && super.mo4075(c18959)) {
            return this.f16787.equals(((C4789) c18959).f16787);
        }
        return false;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C4789 c4789 = new C4789();
        c4789.f16787 = this.f16787;
        m44033(c4789);
        return c4789;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final void mo14759() {
        super.mo14759();
        Iterator it = this.f16787.m25587().iterator();
        while (it.hasNext()) {
            C18959 c18959M39118 = ((C6041) it.next()).m39118();
            if (c18959M39118 != null) {
                c18959M39118.mo14759();
            }
        }
    }

    @Override // l.C18959
    public final String toString() {
        return C8314.m22396(this.f61471) + ": TERNARY " + m44027() + " = (" + this.f16787 + ") ? " + mo44035(0) + " : " + mo44035(1);
    }
}
