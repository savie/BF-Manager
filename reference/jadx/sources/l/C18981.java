package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18981 extends C18959 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61527;

    public C18981(int i, int i2) {
        this(i2);
        AbstractC1566 abstractC1566 = AbstractC1566.f5420;
        int i3 = AbstractC16481.f53441;
        m44031(new C6041(i, abstractC1566));
        mo17866(EnumC1763.DONT_INLINE);
        mo17866(EnumC1763.DONT_GENERATE);
    }

    public C18981(int i) {
        super(EnumC24203.PHI, i);
        this.f61527 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44088(C6041 c6041, C21943 c21943) {
        ArrayList arrayList = this.f61527;
        if (arrayList.contains(c21943)) {
            throw new C8597("Duplicate predecessors in PHI insn: " + c21943 + ", " + this);
        }
        if (c21943 == null) {
            throw new C8597("Null bind block in PHI insn: " + this);
        }
        super.mo44014((AbstractC16481) c6041);
        arrayList.add(c21943);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21943 m44090(int i) {
        return (C21943) this.f61527.get(i);
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩸ */
    public final C6041 mo44035(int i) {
        return (C6041) super.mo44035(i);
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC16481 mo44035(int i) {
        return (C6041) super.mo44035(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44089(C6041 c6041) {
        int iM44020 = m44020((AbstractC16481) c6041);
        if (iM44020 == -1) {
            return;
        }
        C6041 c6042 = (C6041) super.mo44028(iM44020);
        this.f61527.remove(iM44020);
        c6042.m17530().m41937();
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC16481 mo44028(int i) {
        C6041 c6041 = (C6041) super.mo44028(0);
        this.f61527.remove(0);
        c6041.m17530().m41937();
        return c6041;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14762(AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        int iM44020;
        if (!(abstractC16481 instanceof C6041) || !(abstractC16482 instanceof C6041) || (iM44020 = m44020(abstractC16481)) == -1) {
            return false;
        }
        ((C6041) abstractC16482).m17530().m41935(this);
        super.mo44012(iM44020, abstractC16482);
        C9804.m25533((C2551) null, abstractC16481);
        ((C6041) abstractC16481).m17530().m41937();
        return true;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۙ */
    public final void mo44014(AbstractC16481 abstractC16481) {
        throw new C8597("Direct addArg is forbidden for PHI insn, bindArg must be used");
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۙ */
    public final void mo44012(int i, AbstractC16481 abstractC16481) {
        throw new C8597("Direct setArg is forbidden for PHI insn, bindArg must be used");
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C18981 c18981 = new C18981(m44039());
        m44033(c18981);
        return c18981;
    }

    @Override // l.C18959
    public final String toString() {
        return m44038() + " binds: " + this.f61527 + m44019();
    }
}
