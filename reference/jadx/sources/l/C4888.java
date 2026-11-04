package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBEF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4888 extends AbstractC14077 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17080;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22042 f17081;

    public C4888(int i) {
        super(i != 0);
        this.f17081 = new C22042(i);
        this.f17080 = new ArrayList();
    }

    public C4888(C22042 c22042, ArrayList arrayList) {
        super(c22042.m49830() > 0);
        this.f17081 = c22042;
        this.f17080 = arrayList;
    }

    @Override // l.C20222
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo15005() {
        this.f17081.mo15005();
        for (AbstractC14077 abstractC14077 : this.f17080) {
            if (abstractC14077 != null) {
                abstractC14077.mo15005();
            }
        }
        super.mo15005();
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC14077 mo15004() {
        return new C4888(this);
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15001(C16074 c16074) {
        c16074.m12508("(locals array set; primary)");
        this.f17081.mo15001(c16074);
        ArrayList arrayList = this.f17080;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC14077 abstractC14077 = (AbstractC14077) arrayList.get(i);
            if (abstractC14077 != null) {
                c16074.m12508("(locals array set: primary for caller " + C5306.m15934(i) + ')');
                abstractC14077.mo15003().mo15001(c16074);
            }
        }
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        StringBuilder sb = new StringBuilder("(locals array set; primary)\n");
        sb.append(this.f17081.mo1843());
        sb.append('\n');
        ArrayList arrayList = this.f17080;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC14077 abstractC14077 = (AbstractC14077) arrayList.get(i);
            if (abstractC14077 != null) {
                sb.append("(locals array set: primary for caller " + C5306.m15934(i) + ")\n");
                sb.append(abstractC14077.mo15003().mo1843());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo15006(C5085 c5085) {
        C22042 c22042 = this.f17081;
        if (c22042.m49830() == 0) {
            return;
        }
        m46490();
        c22042.mo15006(c5085);
        for (AbstractC14077 abstractC14077 : this.f17080) {
            if (abstractC14077 != null) {
                abstractC14077.mo15006(c5085);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4888(C4888 c4888) {
        super(c4888.f17081.m49830() > 0);
        this.f17081 = c4888.f17081.mo15004();
        this.f17080 = new ArrayList(c4888.f17080.size());
        int size = c4888.f17080.size();
        for (int i = 0; i < size; i++) {
            AbstractC14077 abstractC14077 = (AbstractC14077) c4888.f17080.get(i);
            if (abstractC14077 == null) {
                this.f17080.add(null);
            } else {
                this.f17080.add(abstractC14077.mo15004());
            }
        }
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15000(int i, InterfaceC22239 interfaceC22239) {
        m46490();
        this.f17081.mo15000(i, interfaceC22239);
        for (AbstractC14077 abstractC14077 : this.f17080) {
            if (abstractC14077 != null) {
                abstractC14077.mo15000(i, interfaceC22239);
            }
        }
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15002(C20946 c20946) {
        mo15000(c20946.m47903(), c20946);
    }

    @Override // l.AbstractC14077
    public final InterfaceC22239 get(int i) {
        return this.f17081.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4888 m14996(C22042 c22042) {
        AbstractC14077 abstractC14077Mo14999;
        c22042.getClass();
        C22042 c22043 = this.f17081;
        C22042 c22042M49829 = c22043.m49829(c22042);
        ArrayList arrayList = this.f17080;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC14077 abstractC14077 = (AbstractC14077) arrayList.get(i);
            if (abstractC14077 != null) {
                try {
                    abstractC14077Mo14999 = abstractC14077.mo14999(c22042);
                } catch (C16074 e) {
                    e.m12508("Merging one locals against caller block ".concat(C5306.m15934(i)));
                    abstractC14077Mo14999 = null;
                }
            } else {
                abstractC14077Mo14999 = null;
            }
            z = z || abstractC14077 != abstractC14077Mo14999;
            arrayList2.add(abstractC14077Mo14999);
        }
        return (c22043 != c22042M49829 || z) ? new C4888(c22042M49829, arrayList2) : this;
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14077 mo14999(AbstractC14077 abstractC14077) {
        C4888 c4888M14996;
        try {
            if (abstractC14077 instanceof C4888) {
                c4888M14996 = m14995((C4888) abstractC14077);
            } else {
                c4888M14996 = m14996((C22042) abstractC14077);
            }
            c4888M14996.mo15005();
            return c4888M14996;
        } catch (C16074 e) {
            e.m12508("underlay locals:");
            mo15001(e);
            e.m12508("overlay locals:");
            abstractC14077.mo15001(e);
            throw e;
        }
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4888 mo14997(AbstractC14077 abstractC14077, int i) {
        AbstractC14077 abstractC14078;
        ArrayList arrayList = this.f17080;
        AbstractC14077 abstractC14079 = i >= arrayList.size() ? null : (AbstractC14077) arrayList.get(i);
        C22042 c22042Mo15003 = abstractC14077.mo15003();
        C22042 c22042 = this.f17081;
        C22042 c22042M49829 = c22042.m49829(c22042Mo15003);
        if (abstractC14079 == abstractC14077) {
            abstractC14077 = abstractC14079;
        } else if (abstractC14079 != null) {
            abstractC14077 = abstractC14079.mo14999(abstractC14077);
        }
        if (abstractC14077 == abstractC14079 && c22042M49829 == c22042) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i2 = 0;
        C22042 c22042M498210 = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC14078 = abstractC14077;
            } else {
                abstractC14078 = i2 < size ? (AbstractC14077) arrayList.get(i2) : null;
            }
            if (abstractC14078 != null) {
                if (c22042M498210 == null) {
                    c22042M498210 = abstractC14078.mo15003();
                } else {
                    c22042M498210 = c22042M498210.m49829(abstractC14078.mo15003());
                }
            }
            arrayList2.add(abstractC14078);
            i2++;
        }
        C4888 c4888 = new C4888(c22042M498210, arrayList2);
        c4888.mo15005();
        return c4888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14077 m14998(int i) {
        ArrayList arrayList = this.f17080;
        if (i >= arrayList.size()) {
            return null;
        }
        return (AbstractC14077) arrayList.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4888 m14995(C4888 c4888) {
        C22042 c22042 = c4888.f17081;
        C22042 c22043 = this.f17081;
        C22042 c22042M49829 = c22043.m49829(c22042);
        ArrayList arrayList = this.f17080;
        int size = arrayList.size();
        ArrayList arrayList2 = c4888.f17080;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC14077 abstractC14077Mo14999 = null;
            AbstractC14077 abstractC14077 = i < size ? (AbstractC14077) arrayList.get(i) : null;
            AbstractC14077 abstractC14078 = i < size2 ? (AbstractC14077) arrayList2.get(i) : null;
            if (abstractC14077 == abstractC14078) {
                abstractC14077Mo14999 = abstractC14077;
            } else if (abstractC14077 == null) {
                abstractC14077Mo14999 = abstractC14078;
            } else if (abstractC14078 == null) {
                abstractC14077Mo14999 = abstractC14077;
            } else {
                try {
                    abstractC14077Mo14999 = abstractC14077.mo14999(abstractC14078);
                } catch (C16074 e) {
                    e.m12508("Merging locals set for caller block ".concat(C5306.m15934(i)));
                }
            }
            z = z || abstractC14077 != abstractC14077Mo14999;
            arrayList3.add(abstractC14077Mo14999);
            i++;
        }
        return (c22043 != c22042M49829 || z) ? new C4888(c22042M49829, arrayList3) : this;
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22042 mo15003() {
        return this.f17081;
    }
}
