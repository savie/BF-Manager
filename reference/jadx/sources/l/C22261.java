package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22261 extends C0225 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f72766;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1093 f72767;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f72768;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f72769 = true;

    public C22261(C1093 c1093, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        this.f72767 = c1093;
        this.f72766 = abstractC16579;
        this.f72768 = abstractC165710;
    }

    @Override // l.AbstractC20687
    /* JADX INFO: renamed from: ۖ */
    public final void mo46520() {
        this.f72769 = false;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(C7341 c7341) {
        mo7248(m49430(c7341.f24393));
        mo7248(m49430(c7341.f24392));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        EnumC6617 enumC6617 = EnumC6617.VOID;
        AbstractC16579 abstractC16579 = this.f72768;
        if (abstractC16579.m39001(enumC6617)) {
            this.f72769 = this.f72769;
            return;
        }
        AbstractC16579 abstractC165710 = this.f72766;
        boolean z = false;
        if (abstractC165710.m39001(enumC6617)) {
            this.f72769 = false;
            return;
        }
        if (abstractC165710.mo9481() != abstractC16579.mo9481()) {
            boolean z2 = c6966.f23406 == EnumC0615.STANDALONE && c6966.f23412.f77449.mo16235().mo9481();
            boolean z3 = this.f72769;
            if (z2 == abstractC165710.mo9481() && z2 != abstractC16579.mo9481()) {
                z = true;
            }
            this.f72769 = z3 & z;
            return;
        }
        this.f72769 &= this.f72767.m4094(abstractC165710, abstractC16579);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1266(C21077 c21077) {
        mo7248(m49430(c21077.f68656));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        C21825<AbstractC5930> c21825M43726;
        EnumC6617 enumC6617 = EnumC6617.VOID;
        AbstractC16579 abstractC16579 = this.f72768;
        if (abstractC16579.m39001(enumC6617)) {
            this.f72769 = this.f72769;
            return;
        }
        AbstractC16579 abstractC165710 = this.f72766;
        if (abstractC165710.m39001(enumC6617)) {
            this.f72769 = false;
            return;
        }
        if (c22489.m49993() == EnumC9897.EXPRESSION) {
            c21825M43726 = C21825.of((Object) m49430((AbstractC5930) c22489.f73408));
        } else {
            C19003 c19003 = new C19003();
            new C5327(this, c19003).mo7248(c22489.f73408);
            c21825M43726 = c19003.m43726();
        }
        boolean zIsEmpty = c21825M43726.isEmpty();
        C1093 c1093 = this.f72767;
        if (!zIsEmpty && c1093.m4098(abstractC165710, abstractC16579)) {
            Iterator it = c21825M43726.iterator();
            while (it.hasNext()) {
                this.f72769 = c1093.m4095(abstractC165710, abstractC16579, (AbstractC5930) it.next()) & this.f72769;
            }
            return;
        }
        if (!c21825M43726.isEmpty() && abstractC165710.mo9481() != abstractC16579.mo9481()) {
            for (AbstractC5930 abstractC5930 : c21825M43726) {
                boolean z = true;
                boolean z2 = abstractC5930.mo16201() && abstractC5930.f30190.mo9481();
                boolean z3 = this.f72769;
                if (z2 != abstractC165710.mo9481() || z2 == abstractC16579.mo9481()) {
                    z = false;
                }
                this.f72769 = z3 & z;
            }
            return;
        }
        this.f72769 &= c1093.m4094(abstractC165710, abstractC16579);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 m49430(AbstractC5930 abstractC5930) {
        if (abstractC5930.f30190.m39001(EnumC6617.DEFERRED)) {
            C10104 c10104 = (C10104) abstractC5930.f30190;
            C1093 c1093 = this.f72767;
            AbstractC8774 abstractC8774Mo25712 = c10104.mo25712(c1093.f67949);
            if (abstractC8774Mo25712 != c1093.f4992.f43597.f65438.f20039) {
                return (AbstractC5930) abstractC8774Mo25712;
            }
        }
        return abstractC5930;
    }
}
