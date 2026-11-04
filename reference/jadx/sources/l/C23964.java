package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23964 extends C10625 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f77561;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3826 f77562;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f77563 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f77564;

    public C23964(C3826 c3826, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        this.f77562 = c3826;
        this.f77564 = abstractC22664;
        this.f77561 = abstractC22665;
    }

    @Override // l.AbstractC13886
    /* JADX INFO: renamed from: ᩸ */
    public final void mo33830() {
        this.f77563 = false;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(C10162 c10162) {
        mo5474(m53495(c10162.f32544));
        mo5474(m53495(c10162.f32545));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        EnumC21172 enumC21172 = EnumC21172.VOID;
        AbstractC22664 abstractC22664 = this.f77561;
        if (abstractC22664.m51067(enumC21172)) {
            this.f77563 = this.f77563;
            return;
        }
        AbstractC22664 abstractC22665 = this.f77564;
        boolean z = false;
        if (abstractC22665.m51067(enumC21172)) {
            this.f77563 = false;
            return;
        }
        if (abstractC22665.mo40452() != abstractC22664.mo40452()) {
            boolean z2 = c12598.f40438 == EnumC8869.STANDALONE && c12598.f40439.f38067.mo31585().mo40452();
            boolean z3 = this.f77563;
            if (z2 == abstractC22665.mo40452() && z2 != abstractC22664.mo40452()) {
                z = true;
            }
            this.f77563 = z3 & z;
            return;
        }
        this.f77563 &= this.f77562.m12365(abstractC22665, abstractC22664);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1945(C1412 c1412) {
        mo5474(m53495(c1412.f4986));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        C14769<AbstractC22295> c14769M43093;
        EnumC21172 enumC21172 = EnumC21172.VOID;
        AbstractC22664 abstractC22664 = this.f77561;
        if (abstractC22664.m51067(enumC21172)) {
            this.f77563 = this.f77563;
            return;
        }
        AbstractC22664 abstractC22665 = this.f77564;
        if (abstractC22665.m51067(enumC21172)) {
            this.f77563 = false;
            return;
        }
        if (c16327.m38748() == EnumC25033.EXPRESSION) {
            c14769M43093 = C14769.of((Object) m53495((AbstractC22295) c16327.f53001));
        } else {
            C18499 c18499 = new C18499();
            new C6064(this, c18499).mo5474(c16327.f53001);
            c14769M43093 = c18499.m43093();
        }
        boolean zIsEmpty = c14769M43093.isEmpty();
        C3826 c3826 = this.f77562;
        if (!zIsEmpty && c3826.m12369(abstractC22665, abstractC22664)) {
            Iterator it = c14769M43093.iterator();
            while (it.hasNext()) {
                this.f77563 = c3826.m12366(abstractC22665, abstractC22664, (AbstractC22295) it.next()) & this.f77563;
            }
            return;
        }
        if (!c14769M43093.isEmpty() && abstractC22665.mo40452() != abstractC22664.mo40452()) {
            for (AbstractC22295 abstractC22295 : c14769M43093) {
                boolean z = true;
                boolean z2 = abstractC22295.mo20264() && abstractC22295.f26659.mo40452();
                boolean z3 = this.f77563;
                if (z2 != abstractC22665.mo40452() || z2 == abstractC22664.mo40452()) {
                    z = false;
                }
                this.f77563 = z3 & z;
            }
            return;
        }
        this.f77563 &= c3826.m12365(abstractC22665, abstractC22664);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22295 m53495(AbstractC22295 abstractC22295) {
        if (abstractC22295.f26659.m51067(EnumC21172.DEFERRED)) {
            C8666 c8666 = (C8666) abstractC22295.f26659;
            C3826 c3826 = this.f77562;
            AbstractC8036 abstractC8036Mo17983 = c8666.mo17983(c3826.f43279);
            if (abstractC8036Mo17983 != c3826.f13044.f45078.f71035.f41173) {
                return (AbstractC22295) abstractC8036Mo17983;
            }
        }
        return abstractC22295;
    }
}
