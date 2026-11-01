package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFT */
/* JADX INFO: loaded from: classes4.dex */
public final class C9859 extends AbstractC22454 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f33699;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0727 f33700;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33701;

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo17424() {
        return true;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo17425() {
        return false;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۬ */
    public final C12723 mo17426() {
        return null;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC15546 mo17428() {
        return null;
    }

    public C9859(C16251 c16251, C11871 c11871) {
        super(c16251, c11871);
        this.f33699 = new ArrayList();
        this.f33701 = c16251.m38400();
    }

    public C9859(int i, C11871 c11871) {
        super(C16251.m38381(i, C3320.f12280), c11871);
        this.f33699 = new ArrayList();
        this.f33701 = i;
    }

    @Override // l.AbstractC22454
    public final Object clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    @Override // l.AbstractC22454
    public final AbstractC22454 clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24962(C4108 c4108) {
        for (C14798 c14798 : this.f33699) {
            c14798.f48389 = c14798.f48389.m38390(c4108.m11684(c14798.f48389.m38400()).m49955().getType());
        }
        this.f33700 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24965() {
        return this.f33701;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24963(C16251 c16251, C11871 c11871) {
        this.f33699.add(new C14798(c16251, c11871.m29617(), c11871.m29627()));
        this.f33700 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24964(C16251 c16251) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C14798> arrayList2 = this.f33699;
        for (C14798 c14798 : arrayList2) {
            if (c14798.f48389.m38400() == c16251.m38400()) {
                arrayList.add(c14798);
            }
        }
        arrayList2.removeAll(arrayList);
        this.f33700 = null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m24960(int i) {
        return ((C14798) this.f33699.get(i)).f48387;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ᩳ */
    public final C0727 mo17429() {
        C0727 c0727 = this.f33700;
        if (c0727 != null) {
            return c0727;
        }
        ArrayList arrayList = this.f33699;
        if (arrayList.size() == 0) {
            return C0727.f3015;
        }
        int size = arrayList.size();
        this.f33700 = new C0727(size);
        for (int i = 0; i < size; i++) {
            this.f33700.m15261(i, ((C14798) arrayList.get(i)).f48389);
        }
        this.f33700.mo9637();
        return this.f33700;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ܰ */
    public final void mo17427(AbstractC12568 abstractC12568) {
        for (C14798 c14798 : this.f33699) {
            C16251 c16251 = c14798.f48389;
            C16251 c16251Mo15518 = abstractC12568.mo15518(c16251);
            c14798.f48389 = c16251Mo15518;
            if (c16251 != c16251Mo15518) {
                m49949().m29609().m11678(this, c16251, c14798.f48389);
            }
        }
        this.f33700 = null;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC15546 mo17421() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m24961(int i, C4108 c4108) {
        ArrayList arrayList = new ArrayList();
        for (C14798 c14798 : this.f33699) {
            if (c14798.f48389.m38400() == i) {
                arrayList.add((C11871) c4108.m11687().get(c14798.f48387));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo17422() {
        return C23970.m52817() && mo17432() != null;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۙ */
    public final void mo17420(InterfaceC5520 interfaceC5520) {
        interfaceC5520.mo4613(this);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        StringBuilder sb = new StringBuilder(80);
        sb.append(C11312.f38175);
        sb.append(": phi");
        C16251 c16251M49955 = m49955();
        if (c16251M49955 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c16251M49955.mo2376());
        }
        sb.append(" <-");
        int size = mo17429().size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(this.f33700.m15275get(i).mo2376() + "[b=" + C22475.m49982(((C14798) this.f33699.get(i)).f48388) + "]");
            }
        }
        return sb.toString();
    }
}
