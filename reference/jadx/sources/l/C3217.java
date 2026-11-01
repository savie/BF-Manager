package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBEF */
/* JADX INFO: loaded from: classes3.dex */
public final class C3217 extends AbstractC9569 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f12018;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4359 f12019;

    public C3217(int i) {
        super(i != 0);
        this.f12019 = new C4359(i);
        this.f12018 = new ArrayList();
    }

    public C3217(C4359 c4359, ArrayList arrayList) {
        super(c4359.m12203() > 0);
        this.f12019 = c4359;
        this.f12018 = arrayList;
    }

    @Override // l.C18947
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo9637() {
        this.f12019.mo9637();
        for (AbstractC9569 abstractC9569 : this.f12018) {
            if (abstractC9569 != null) {
                abstractC9569.mo9637();
            }
        }
        super.mo9637();
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC9569 mo9634() {
        return new C3217(this);
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9633(C21293 c21293) {
        c21293.m20021("(locals array set; primary)");
        this.f12019.mo9633(c21293);
        ArrayList arrayList = this.f12018;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC9569 abstractC9569 = (AbstractC9569) arrayList.get(i);
            if (abstractC9569 != null) {
                c21293.m20021("(locals array set: primary for caller " + C22475.m49982(i) + ')');
                abstractC9569.mo9635().mo9633(c21293);
            }
        }
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        StringBuilder sb = new StringBuilder("(locals array set; primary)\n");
        sb.append(this.f12019.mo2376());
        sb.append('\n');
        ArrayList arrayList = this.f12018;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC9569 abstractC9569 = (AbstractC9569) arrayList.get(i);
            if (abstractC9569 != null) {
                sb.append("(locals array set: primary for caller " + C22475.m49982(i) + ")\n");
                sb.append(abstractC9569.mo9635().mo2376());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo9636(C3320 c3320) {
        C4359 c4359 = this.f12019;
        if (c4359.m12203() == 0) {
            return;
        }
        m43641();
        c4359.mo9636(c3320);
        for (AbstractC9569 abstractC9569 : this.f12018) {
            if (abstractC9569 != null) {
                abstractC9569.mo9636(c3320);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3217(C3217 c3217) {
        super(c3217.f12019.m12203() > 0);
        this.f12019 = c3217.f12019.mo9634();
        this.f12018 = new ArrayList(c3217.f12018.size());
        int size = c3217.f12018.size();
        for (int i = 0; i < size; i++) {
            AbstractC9569 abstractC9569 = (AbstractC9569) c3217.f12018.get(i);
            if (abstractC9569 == null) {
                this.f12018.add(null);
            } else {
                this.f12018.add(abstractC9569.mo9634());
            }
        }
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9631(int i, InterfaceC4919 interfaceC4919) {
        m43641();
        this.f12019.mo9631(i, interfaceC4919);
        for (AbstractC9569 abstractC9569 : this.f12018) {
            if (abstractC9569 != null) {
                abstractC9569.mo9631(i, interfaceC4919);
            }
        }
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9632(C16251 c16251) {
        mo9631(c16251.m38400(), c16251);
    }

    @Override // l.AbstractC9569
    public final InterfaceC4919 get(int i) {
        return this.f12019.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3217 m9627(C4359 c4359) {
        AbstractC9569 abstractC9569Mo9630;
        c4359.getClass();
        C4359 c43510 = this.f12019;
        C4359 c4359M12202 = c43510.m12202(c4359);
        ArrayList arrayList = this.f12018;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC9569 abstractC9569 = (AbstractC9569) arrayList.get(i);
            if (abstractC9569 != null) {
                try {
                    abstractC9569Mo9630 = abstractC9569.mo9630(c4359);
                } catch (C21293 e) {
                    e.m20021("Merging one locals against caller block ".concat(C22475.m49982(i)));
                    abstractC9569Mo9630 = null;
                }
            } else {
                abstractC9569Mo9630 = null;
            }
            z = z || abstractC9569 != abstractC9569Mo9630;
            arrayList2.add(abstractC9569Mo9630);
        }
        return (c43510 != c4359M12202 || z) ? new C3217(c4359M12202, arrayList2) : this;
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9569 mo9630(AbstractC9569 abstractC9569) {
        C3217 c3217M9627;
        try {
            if (abstractC9569 instanceof C3217) {
                c3217M9627 = m9626((C3217) abstractC9569);
            } else {
                c3217M9627 = m9627((C4359) abstractC9569);
            }
            c3217M9627.mo9637();
            return c3217M9627;
        } catch (C21293 e) {
            e.m20021("underlay locals:");
            mo9633(e);
            e.m20021("overlay locals:");
            abstractC9569.mo9633(e);
            throw e;
        }
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3217 mo9628(AbstractC9569 abstractC9569, int i) {
        AbstractC9569 abstractC95610;
        ArrayList arrayList = this.f12018;
        AbstractC9569 abstractC95611 = i >= arrayList.size() ? null : (AbstractC9569) arrayList.get(i);
        C4359 c4359Mo9635 = abstractC9569.mo9635();
        C4359 c4359 = this.f12019;
        C4359 c4359M12202 = c4359.m12202(c4359Mo9635);
        if (abstractC95611 == abstractC9569) {
            abstractC9569 = abstractC95611;
        } else if (abstractC95611 != null) {
            abstractC9569 = abstractC95611.mo9630(abstractC9569);
        }
        if (abstractC9569 == abstractC95611 && c4359M12202 == c4359) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i2 = 0;
        C4359 c4359M12203 = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC95610 = abstractC9569;
            } else {
                abstractC95610 = i2 < size ? (AbstractC9569) arrayList.get(i2) : null;
            }
            if (abstractC95610 != null) {
                if (c4359M12203 == null) {
                    c4359M12203 = abstractC95610.mo9635();
                } else {
                    c4359M12203 = c4359M12203.m12202(abstractC95610.mo9635());
                }
            }
            arrayList2.add(abstractC95610);
            i2++;
        }
        C3217 c3217 = new C3217(c4359M12203, arrayList2);
        c3217.mo9637();
        return c3217;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9569 m9629(int i) {
        ArrayList arrayList = this.f12018;
        if (i >= arrayList.size()) {
            return null;
        }
        return (AbstractC9569) arrayList.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3217 m9626(C3217 c3217) {
        C4359 c4359 = c3217.f12019;
        C4359 c43510 = this.f12019;
        C4359 c4359M12202 = c43510.m12202(c4359);
        ArrayList arrayList = this.f12018;
        int size = arrayList.size();
        ArrayList arrayList2 = c3217.f12018;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC9569 abstractC9569Mo9630 = null;
            AbstractC9569 abstractC9569 = i < size ? (AbstractC9569) arrayList.get(i) : null;
            AbstractC9569 abstractC95610 = i < size2 ? (AbstractC9569) arrayList2.get(i) : null;
            if (abstractC9569 == abstractC95610) {
                abstractC9569Mo9630 = abstractC9569;
            } else if (abstractC9569 == null) {
                abstractC9569Mo9630 = abstractC95610;
            } else if (abstractC95610 == null) {
                abstractC9569Mo9630 = abstractC9569;
            } else {
                try {
                    abstractC9569Mo9630 = abstractC9569.mo9630(abstractC95610);
                } catch (C21293 e) {
                    e.m20021("Merging locals set for caller block ".concat(C22475.m49982(i)));
                }
            }
            z = z || abstractC9569 != abstractC9569Mo9630;
            arrayList3.add(abstractC9569Mo9630);
            i++;
        }
        return (c43510 != c4359M12202 || z) ? new C3217(c4359M12202, arrayList3) : this;
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4359 mo9635() {
        return this.f12019;
    }
}
