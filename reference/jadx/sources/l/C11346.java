package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B19P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11346 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1497 f35738;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f35740;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC15075 f35743;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1497 f35744;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19551 f35745;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f35742 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f35741 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f35739 = new ArrayList();

    public C11346(C1497 c1497) {
        new ArrayList();
        this.f35743 = null;
        this.f35745 = new C19551();
        this.f35740 = new ArrayList();
        this.f35738 = c1497;
        this.f35744 = c1497;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28650(InterfaceC15075 interfaceC15075) {
        this.f35743 = interfaceC15075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m28644(C1497 c1497, int i) {
        ArrayList arrayList = this.f35740;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((C24027) arrayList.get(i2)).m53585(c1497, i));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28652(boolean z) {
        boolean z2;
        boolean z3 = this.f35742;
        boolean z4 = false;
        C1497 c1497 = this.f35738;
        if (z3 || this.f35741) {
            for (C10445 c10445 : c1497.f33652) {
                c10445.m26858();
                c10445.f33208 = false;
                c10445.f33245.m17688();
                c10445.f33195.m34755();
            }
            c1497.m26858();
            c1497.f33208 = false;
            c1497.f33245.m17688();
            c1497.f33195.m34755();
            this.f35741 = false;
        }
        m28645(this.f35744);
        c1497.m26855(0);
        c1497.m26836(0);
        EnumC19396 enumC19396M26857 = c1497.m26857(0);
        EnumC19396 enumC19396M26858 = c1497.m26857(1);
        if (this.f35742) {
            m28649();
        }
        int iM26840 = c1497.m26840();
        int iM26856 = c1497.m26856();
        c1497.f33245.f61068.mo39242(iM26840);
        c1497.f33195.f61068.mo39242(iM26856);
        m28654();
        EnumC19396 enumC19396 = EnumC19396.WRAP_CONTENT;
        ArrayList<AbstractC18805> arrayList = this.f35739;
        if (enumC19396M26857 == enumC19396 || enumC19396M26858 == enumC19396) {
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((AbstractC18805) it.next()).mo10267()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && enumC19396M26857 == EnumC19396.WRAP_CONTENT) {
                c1497.m26820(EnumC19396.FIXED);
                c1497.m26805(m28644(c1497, 0));
                c1497.f33245.f61069.mo39242(c1497.m26806());
            }
            if (z && enumC19396M26858 == EnumC19396.WRAP_CONTENT) {
                c1497.m26862(EnumC19396.FIXED);
                c1497.m26824(m28644(c1497, 1));
                c1497.f33195.f61069.mo39242(c1497.m26823());
            }
        }
        EnumC19396 enumC19397 = c1497.f33210[0];
        EnumC19396 enumC19398 = EnumC19396.FIXED;
        if (enumC19397 == enumC19398 || enumC19397 == EnumC19396.MATCH_PARENT) {
            int iM26806 = c1497.m26806() + iM26840;
            c1497.f33245.f61071.mo39242(iM26806);
            c1497.f33245.f61069.mo39242(iM26806 - iM26840);
            m28654();
            EnumC19396 enumC19399 = c1497.f33210[1];
            if (enumC19399 == enumC19398 || enumC19399 == EnumC19396.MATCH_PARENT) {
                int iM26823 = c1497.m26823() + iM26856;
                c1497.f33195.f61071.mo39242(iM26823);
                c1497.f33195.f61069.mo39242(iM26823 - iM26856);
            }
            m28654();
            z2 = true;
        } else {
            z2 = false;
        }
        for (AbstractC18805 abstractC18805 : arrayList) {
            if (abstractC18805.f61072 != c1497 || abstractC18805.f61073) {
                abstractC18805.mo10268();
            }
        }
        for (AbstractC18805 abstractC18806 : arrayList) {
            if (z2 || abstractC18806.f61072 != c1497) {
                if (!abstractC18806.f61068.f53630 || ((!abstractC18806.f61071.f53630 && !(abstractC18806 instanceof C3143)) || (!abstractC18806.f61069.f53630 && !(abstractC18806 instanceof C5381) && !(abstractC18806 instanceof C3143)))) {
                    c1497.m26820(enumC19396M26857);
                    c1497.m26862(enumC19396M26858);
                    return z4;
                }
            }
        }
        z4 = true;
        c1497.m26820(enumC19396M26857);
        c1497.m26862(enumC19396M26858);
        return z4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28655() {
        boolean z = this.f35742;
        C1497 c1497 = this.f35738;
        if (z) {
            for (C10445 c10445 : c1497.f33652) {
                c10445.m26858();
                c10445.f33208 = false;
                C6127 c6127 = c10445.f33245;
                c6127.f61069.f53630 = false;
                c6127.f61073 = false;
                c6127.m17688();
                C14329 c14329 = c10445.f33195;
                c14329.f61069.f53630 = false;
                c14329.f61073 = false;
                c14329.m34755();
            }
            c1497.m26858();
            c1497.f33208 = false;
            C6127 c6128 = c1497.f33245;
            c6128.f61069.f53630 = false;
            c6128.f61073 = false;
            c6128.m17688();
            C14329 c143210 = c1497.f33195;
            c143210.f61069.f53630 = false;
            c143210.f61073 = false;
            c143210.m34755();
            m28649();
        }
        m28645(this.f35744);
        c1497.m26855(0);
        c1497.m26836(0);
        c1497.f33245.f61068.mo39242(0);
        c1497.f33195.f61068.mo39242(0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28651(int i, boolean z) {
        boolean z2;
        EnumC19396 enumC19396;
        C1497 c1497 = this.f35738;
        boolean z3 = false;
        EnumC19396 enumC19396M26857 = c1497.m26857(0);
        EnumC19396 enumC19396M26858 = c1497.m26857(1);
        int iM26840 = c1497.m26840();
        int iM26856 = c1497.m26856();
        ArrayList<AbstractC18805> arrayList = this.f35739;
        if (z && (enumC19396M26857 == (enumC19396 = EnumC19396.WRAP_CONTENT) || enumC19396M26858 == enumC19396)) {
            for (AbstractC18805 abstractC18805 : arrayList) {
                if (abstractC18805.f61074 == i && !abstractC18805.mo10267()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && enumC19396M26857 == EnumC19396.WRAP_CONTENT) {
                    c1497.m26820(EnumC19396.FIXED);
                    c1497.m26805(m28644(c1497, 0));
                    c1497.f33245.f61069.mo39242(c1497.m26806());
                }
            } else if (z && enumC19396M26858 == EnumC19396.WRAP_CONTENT) {
                c1497.m26862(EnumC19396.FIXED);
                c1497.m26824(m28644(c1497, 1));
                c1497.f33195.f61069.mo39242(c1497.m26823());
            }
        }
        if (i == 0) {
            EnumC19396 enumC19397 = c1497.f33210[0];
            if (enumC19397 == EnumC19396.FIXED || enumC19397 == EnumC19396.MATCH_PARENT) {
                int iM26806 = c1497.m26806() + iM26840;
                c1497.f33245.f61071.mo39242(iM26806);
                c1497.f33245.f61069.mo39242(iM26806 - iM26840);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            EnumC19396 enumC19398 = c1497.f33210[1];
            if (enumC19398 == EnumC19396.FIXED || enumC19398 == EnumC19396.MATCH_PARENT) {
                int iM26823 = c1497.m26823() + iM26856;
                c1497.f33195.f61071.mo39242(iM26823);
                c1497.f33195.f61069.mo39242(iM26823 - iM26856);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m28654();
        for (AbstractC18805 abstractC18806 : arrayList) {
            if (abstractC18806.f61074 == i && (abstractC18806.f61072 != c1497 || abstractC18806.f61073)) {
                abstractC18806.mo10268();
            }
        }
        for (AbstractC18805 abstractC18807 : arrayList) {
            if (abstractC18807.f61074 == i && (z2 || abstractC18807.f61072 != c1497)) {
                if (!abstractC18807.f61068.f53630 || !abstractC18807.f61071.f53630 || (!(abstractC18807 instanceof C5381) && !abstractC18807.f61069.f53630)) {
                    c1497.m26820(enumC19396M26857);
                    c1497.m26862(enumC19396M26858);
                    return z3;
                }
            }
        }
        z3 = true;
        c1497.m26820(enumC19396M26857);
        c1497.m26862(enumC19396M26858);
        return z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28646(C10445 c10445, EnumC19396 enumC19396, int i, EnumC19396 enumC19397, int i2) {
        C19551 c19551 = this.f35745;
        c19551.f63050 = enumC19396;
        c19551.f63049 = enumC19397;
        c19551.f63057 = i;
        c19551.f63053 = i2;
        this.f35743.mo36336(c10445, c19551);
        c10445.m26805(c19551.f63051);
        c10445.m26824(c19551.f63055);
        c10445.m26821(c19551.f63056);
        c10445.m26842(c19551.f63058);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0283  */
    /* JADX WARN: Code duplicated, block: B:125:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28645(C1497 c1497) {
        char c;
        EnumC19396 enumC19396;
        int iM26823;
        EnumC19396 enumC19397;
        EnumC19396[] enumC19396Arr;
        EnumC19396 enumC19398;
        EnumC19396 enumC19399;
        EnumC19396 enumC193910;
        EnumC19396 enumC193911;
        EnumC19396 enumC193912;
        Iterator it = c1497.f33652.iterator();
        while (it.hasNext()) {
            C10445 c10445 = (C10445) it.next();
            EnumC19396[] enumC19396Arr2 = c10445.f33210;
            C0751[] c0751Arr = c10445.f33190;
            C0751 c0751 = c10445.f33216;
            C0751 c0752 = c10445.f33197;
            C0751 c0753 = c10445.f33248;
            C0751 c0754 = c10445.f33212;
            EnumC19396 enumC193913 = enumC19396Arr2[0];
            EnumC19396 enumC193914 = enumC19396Arr2[1];
            if (c10445.m26870() == 8) {
                c10445.f33208 = true;
            } else {
                float f = c10445.f33238;
                if (f < 1.0f && enumC193913 == EnumC19396.MATCH_CONSTRAINT) {
                    c10445.f33206 = 2;
                }
                float f2 = c10445.f33246;
                if (f2 < 1.0f) {
                    c = 0;
                    if (enumC193914 == EnumC19396.MATCH_CONSTRAINT) {
                        c10445.f33209 = 2;
                    }
                } else {
                    c = 0;
                }
                if (c10445.f33239 > 0.0f) {
                    EnumC19396 enumC193915 = EnumC19396.MATCH_CONSTRAINT;
                    if (enumC193913 == enumC193915 && (enumC193914 == EnumC19396.WRAP_CONTENT || enumC193914 == EnumC19396.FIXED)) {
                        c10445.f33206 = 3;
                    } else if (enumC193914 == enumC193915 && (enumC193913 == EnumC19396.WRAP_CONTENT || enumC193913 == EnumC19396.FIXED)) {
                        c10445.f33209 = 3;
                    } else if (enumC193913 == enumC193915 && enumC193914 == enumC193915) {
                        if (c10445.f33206 == 0) {
                            c10445.f33206 = 3;
                        }
                        if (c10445.f33209 == 0) {
                            c10445.f33209 = 3;
                        }
                    }
                }
                EnumC19396 enumC193916 = EnumC19396.MATCH_CONSTRAINT;
                if (enumC193913 == enumC193916 && c10445.f33206 == 1 && (c0754.f2744 == null || c0753.f2744 == null)) {
                    enumC193913 = EnumC19396.WRAP_CONTENT;
                }
                if (enumC193914 == enumC193916 && c10445.f33209 == 1 && (c0752.f2744 == null || c0751.f2744 == null)) {
                    enumC193914 = EnumC19396.WRAP_CONTENT;
                }
                EnumC19396 enumC193917 = enumC193914;
                C6127 c6127 = c10445.f33245;
                c6127.f61076 = enumC193913;
                int i = c10445.f33206;
                c6127.f61075 = i;
                C14329 c14329 = c10445.f33195;
                c14329.f61076 = enumC193917;
                Iterator it2 = it;
                int i2 = c10445.f33209;
                c14329.f61075 = i2;
                EnumC19396 enumC193918 = EnumC19396.MATCH_PARENT;
                if ((enumC193913 == enumC193918 || enumC193913 == EnumC19396.FIXED || enumC193913 == EnumC19396.WRAP_CONTENT) && (enumC193917 == enumC193918 || enumC193917 == EnumC19396.FIXED || enumC193917 == EnumC19396.WRAP_CONTENT)) {
                    int iM26806 = c10445.m26806();
                    if (enumC193913 == enumC193918) {
                        iM26806 = (c1497.m26806() - c0754.f2748) - c0753.f2748;
                        enumC19396 = EnumC19396.FIXED;
                    } else {
                        enumC19396 = enumC193913;
                    }
                    int iM26824 = c10445.m26823();
                    if (enumC193917 == enumC193918) {
                        iM26823 = (c1497.m26823() - c0752.f2748) - c0751.f2748;
                        enumC19397 = EnumC19396.FIXED;
                    } else {
                        iM26823 = iM26824;
                        enumC19397 = enumC193917;
                    }
                    m28646(c10445, enumC19396, iM26806, enumC19397, iM26823);
                    c10445.f33245.f61069.mo39242(c10445.m26806());
                    c10445.f33195.f61069.mo39242(c10445.m26823());
                    c10445.f33208 = true;
                } else if (enumC193913 == enumC193916 && (enumC193917 == (enumC193912 = EnumC19396.WRAP_CONTENT) || enumC193917 == EnumC19396.FIXED)) {
                    if (i == 3) {
                        if (enumC193917 == enumC193912) {
                            m28646(c10445, enumC193912, 0, enumC193912, 0);
                        }
                        int iM26825 = c10445.m26823();
                        int i3 = (int) ((iM26825 * c10445.f33239) + 0.5f);
                        EnumC19396 enumC193919 = EnumC19396.FIXED;
                        m28646(c10445, enumC193919, i3, enumC193919, iM26825);
                        c10445.f33245.f61069.mo39242(c10445.m26806());
                        c10445.f33195.f61069.mo39242(c10445.m26823());
                        c10445.f33208 = true;
                    } else if (i == 1) {
                        m28646(c10445, enumC193912, 0, enumC193917, 0);
                        c10445.f33245.f61069.f56393 = c10445.m26806();
                    } else if (i == 2) {
                        EnumC19396 enumC193920 = c1497.f33210[c];
                        EnumC19396 enumC193921 = EnumC19396.FIXED;
                        if (enumC193920 == enumC193921 || enumC193920 == enumC193918) {
                            m28646(c10445, enumC193921, (int) ((f * c1497.m26806()) + 0.5f), enumC193917, c10445.m26823());
                            c10445.f33245.f61069.mo39242(c10445.m26806());
                            c10445.f33195.f61069.mo39242(c10445.m26823());
                            c10445.f33208 = true;
                        } else if (enumC193917 == enumC193916) {
                            if (enumC193913 == enumC193916) {
                                if (i != 1) {
                                    EnumC19396 enumC193922 = EnumC19396.WRAP_CONTENT;
                                    m28646(c10445, enumC193922, 0, enumC193922, 0);
                                    c10445.f33245.f61069.f56393 = c10445.m26806();
                                    c10445.f33195.f61069.f56393 = c10445.m26823();
                                } else {
                                    EnumC19396 enumC193923 = EnumC19396.WRAP_CONTENT;
                                    m28646(c10445, enumC193923, 0, enumC193923, 0);
                                    c10445.f33245.f61069.f56393 = c10445.m26806();
                                    c10445.f33195.f61069.f56393 = c10445.m26823();
                                }
                            }
                        } else if (enumC193913 == enumC193916) {
                            if (i != 1) {
                                EnumC19396 enumC193924 = EnumC19396.WRAP_CONTENT;
                                m28646(c10445, enumC193924, 0, enumC193924, 0);
                                c10445.f33245.f61069.f56393 = c10445.m26806();
                                c10445.f33195.f61069.f56393 = c10445.m26823();
                            } else {
                                EnumC19396 enumC193925 = EnumC19396.WRAP_CONTENT;
                                m28646(c10445, enumC193925, 0, enumC193925, 0);
                                c10445.f33245.f61069.f56393 = c10445.m26806();
                                c10445.f33195.f61069.f56393 = c10445.m26823();
                            }
                        }
                    } else if (c0751Arr[c].f2744 == null || c0751Arr[1].f2744 == null) {
                        m28646(c10445, enumC193912, 0, enumC193917, 0);
                        c10445.f33245.f61069.mo39242(c10445.m26806());
                        c10445.f33195.f61069.mo39242(c10445.m26823());
                        c10445.f33208 = true;
                    } else if (enumC193917 == enumC193916) {
                        if (enumC193913 == enumC193916) {
                            if (i != 1) {
                                EnumC19396 enumC193926 = EnumC19396.WRAP_CONTENT;
                                m28646(c10445, enumC193926, 0, enumC193926, 0);
                                c10445.f33245.f61069.f56393 = c10445.m26806();
                                c10445.f33195.f61069.f56393 = c10445.m26823();
                            } else {
                                EnumC19396 enumC193927 = EnumC19396.WRAP_CONTENT;
                                m28646(c10445, enumC193927, 0, enumC193927, 0);
                                c10445.f33245.f61069.f56393 = c10445.m26806();
                                c10445.f33195.f61069.f56393 = c10445.m26823();
                            }
                        }
                    } else if (enumC193913 == enumC193916) {
                        if (i != 1) {
                            EnumC19396 enumC193928 = EnumC19396.WRAP_CONTENT;
                            m28646(c10445, enumC193928, 0, enumC193928, 0);
                            c10445.f33245.f61069.f56393 = c10445.m26806();
                            c10445.f33195.f61069.f56393 = c10445.m26823();
                        } else {
                            EnumC19396 enumC193929 = EnumC19396.WRAP_CONTENT;
                            m28646(c10445, enumC193929, 0, enumC193929, 0);
                            c10445.f33245.f61069.f56393 = c10445.m26806();
                            c10445.f33195.f61069.f56393 = c10445.m26823();
                        }
                    }
                } else if (enumC193917 == enumC193916 || !(enumC193913 == (enumC193911 = EnumC19396.WRAP_CONTENT) || enumC193913 == EnumC19396.FIXED)) {
                    if (enumC193913 == enumC193916 && enumC193917 == enumC193916) {
                        if (i != 1 || i2 == 1) {
                            EnumC19396 enumC1939210 = EnumC19396.WRAP_CONTENT;
                            m28646(c10445, enumC1939210, 0, enumC1939210, 0);
                            c10445.f33245.f61069.f56393 = c10445.m26806();
                            c10445.f33195.f61069.f56393 = c10445.m26823();
                        } else if (i2 == 2 && i == 2 && (((enumC19398 = (enumC19396Arr = c1497.f33210)[c]) == (enumC19399 = EnumC19396.FIXED) || enumC19398 == enumC19399) && ((enumC193910 = enumC19396Arr[1]) == enumC19399 || enumC193910 == enumC19399))) {
                            m28646(c10445, enumC19399, (int) ((f * c1497.m26806()) + 0.5f), enumC19399, (int) ((f2 * c1497.m26823()) + 0.5f));
                            c10445.f33245.f61069.mo39242(c10445.m26806());
                            c10445.f33195.f61069.mo39242(c10445.m26823());
                            c10445.f33208 = true;
                        }
                    }
                } else if (i2 == 3) {
                    if (enumC193913 == enumC193911) {
                        m28646(c10445, enumC193911, 0, enumC193911, 0);
                    }
                    int iM26807 = c10445.m26806();
                    float f3 = c10445.f33239;
                    if (c10445.m26837() == -1) {
                        f3 = 1.0f / f3;
                    }
                    EnumC19396 enumC193930 = EnumC19396.FIXED;
                    m28646(c10445, enumC193930, iM26807, enumC193930, (int) ((iM26807 * f3) + 0.5f));
                    c10445.f33245.f61069.mo39242(c10445.m26806());
                    c10445.f33195.f61069.mo39242(c10445.m26823());
                    c10445.f33208 = true;
                } else if (i2 == 1) {
                    m28646(c10445, enumC193913, 0, enumC193911, 0);
                    c10445.f33195.f61069.f56393 = c10445.m26823();
                } else if (i2 == 2) {
                    EnumC19396 enumC193931 = c1497.f33210[1];
                    EnumC19396 enumC193932 = EnumC19396.FIXED;
                    if (enumC193931 == enumC193932 || enumC193931 == enumC193918) {
                        m28646(c10445, enumC193913, c10445.m26806(), enumC193932, (int) ((f2 * c1497.m26823()) + 0.5f));
                        c10445.f33245.f61069.mo39242(c10445.m26806());
                        c10445.f33195.f61069.mo39242(c10445.m26823());
                        c10445.f33208 = true;
                    } else if (enumC193913 == enumC193916) {
                        if (i != 1) {
                            EnumC19396 enumC1939211 = EnumC19396.WRAP_CONTENT;
                            m28646(c10445, enumC1939211, 0, enumC1939211, 0);
                            c10445.f33245.f61069.f56393 = c10445.m26806();
                            c10445.f33195.f61069.f56393 = c10445.m26823();
                        } else {
                            EnumC19396 enumC1939212 = EnumC19396.WRAP_CONTENT;
                            m28646(c10445, enumC1939212, 0, enumC1939212, 0);
                            c10445.f33245.f61069.f56393 = c10445.m26806();
                            c10445.f33195.f61069.f56393 = c10445.m26823();
                        }
                    }
                } else if (c0751Arr[2].f2744 == null || c0751Arr[3].f2744 == null) {
                    m28646(c10445, enumC193911, 0, enumC193917, 0);
                    c10445.f33245.f61069.mo39242(c10445.m26806());
                    c10445.f33195.f61069.mo39242(c10445.m26823());
                    c10445.f33208 = true;
                } else if (enumC193913 == enumC193916) {
                    if (i != 1) {
                        EnumC19396 enumC1939213 = EnumC19396.WRAP_CONTENT;
                        m28646(c10445, enumC1939213, 0, enumC1939213, 0);
                        c10445.f33245.f61069.f56393 = c10445.m26806();
                        c10445.f33195.f61069.f56393 = c10445.m26823();
                    } else {
                        EnumC19396 enumC1939214 = EnumC19396.WRAP_CONTENT;
                        m28646(c10445, enumC1939214, 0, enumC1939214, 0);
                        c10445.f33245.f61069.f56393 = c10445.m26806();
                        c10445.f33195.f61069.f56393 = c10445.m26823();
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m28654() {
        C22535 c22535;
        for (C10445 c10445 : this.f35738.f33652) {
            if (!c10445.f33208) {
                EnumC19396[] enumC19396Arr = c10445.f33210;
                boolean z = false;
                EnumC19396 enumC19396 = enumC19396Arr[0];
                EnumC19396 enumC19397 = enumC19396Arr[1];
                int i = c10445.f33206;
                int i2 = c10445.f33209;
                EnumC19396 enumC19398 = EnumC19396.WRAP_CONTENT;
                boolean z2 = enumC19396 == enumC19398 || (enumC19396 == EnumC19396.MATCH_CONSTRAINT && i == 1);
                if (enumC19397 == enumC19398 || (enumC19397 == EnumC19396.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C17313 c17313 = c10445.f33245.f61069;
                boolean z3 = c17313.f53630;
                C17313 c17314 = c10445.f33195.f61069;
                boolean z4 = c17314.f53630;
                if (z3 && z4) {
                    EnumC19396 enumC19399 = EnumC19396.FIXED;
                    m28646(c10445, enumC19399, c17313.f53632, enumC19399, c17314.f53632);
                    c10445.f33208 = true;
                } else if (z3 && z) {
                    m28646(c10445, EnumC19396.FIXED, c17313.f53632, enumC19398, c17314.f53632);
                    if (enumC19397 == EnumC19396.MATCH_CONSTRAINT) {
                        c10445.f33195.f61069.f56393 = c10445.m26823();
                    } else {
                        c10445.f33195.f61069.mo39242(c10445.m26823());
                        c10445.f33208 = true;
                    }
                } else if (z4 && z2) {
                    m28646(c10445, enumC19398, c17313.f53632, EnumC19396.FIXED, c17314.f53632);
                    if (enumC19396 == EnumC19396.MATCH_CONSTRAINT) {
                        c10445.f33245.f61069.f56393 = c10445.m26806();
                    } else {
                        c10445.f33245.f61069.mo39242(c10445.m26806());
                        c10445.f33208 = true;
                    }
                }
                if (c10445.f33208 && (c22535 = c10445.f33195.f45204) != null) {
                    c22535.mo39242(c10445.m26829());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28653() {
        this.f35742 = true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28656() {
        this.f35741 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28649() {
        ArrayList<AbstractC18805> arrayList = this.f35739;
        arrayList.clear();
        C1497 c1497 = this.f35744;
        c1497.f33245.mo10266();
        c1497.f33195.mo10266();
        arrayList.add(c1497.f33245);
        arrayList.add(c1497.f33195);
        HashSet hashSet = null;
        for (C10445 c10445 : c1497.f33652) {
            if (c10445 instanceof C7463) {
                C3143 c3143 = new C3143(c10445);
                c10445.f33245.mo10266();
                c10445.f33195.mo10266();
                c3143.f61074 = ((C7463) c10445).m20502();
                arrayList.add(c3143);
            } else {
                if (c10445.m26800()) {
                    if (c10445.f33243 == null) {
                        c10445.f33243 = new C5381(c10445, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c10445.f33243);
                } else {
                    arrayList.add(c10445.f33245);
                }
                if (c10445.m26850()) {
                    if (c10445.f33191 == null) {
                        c10445.f33191 = new C5381(c10445, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c10445.f33191);
                } else {
                    arrayList.add(c10445.f33195);
                }
                if (c10445 instanceof C14174) {
                    arrayList.add(new C20297(c10445));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC18805) it.next()).mo10266();
        }
        for (AbstractC18805 abstractC18805 : arrayList) {
            if (abstractC18805.f61072 != c1497) {
                abstractC18805.mo10265();
            }
        }
        ArrayList arrayList2 = this.f35740;
        arrayList2.clear();
        C1497 c1498 = this.f35738;
        m28648(c1498.f33245, 0, arrayList2);
        m28648(c1498.f33195, 1, arrayList2);
        this.f35742 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28647(C16567 c16567, int i, ArrayList arrayList, C24027 c24027) {
        AbstractC18805 abstractC18805 = c16567.f53627;
        C24027 c24028 = abstractC18805.f61070;
        C16567 c16568 = abstractC18805.f61071;
        C16567 c16569 = abstractC18805.f61068;
        if (c24028 == null) {
            C1497 c1497 = this.f35738;
            if (abstractC18805 == c1497.f33245 || abstractC18805 == c1497.f33195) {
                return;
            }
            if (c24027 == null) {
                c24027 = new C24027();
                c24027.f77742 = null;
                c24027.f77743 = new ArrayList();
                c24027.f77742 = abstractC18805;
                arrayList.add(c24027);
            }
            abstractC18805.f61070 = c24027;
            c24027.f77743.add(abstractC18805);
            for (InterfaceC1652 interfaceC1652 : c16569.f53634) {
                if (interfaceC1652 instanceof C16567) {
                    m28647((C16567) interfaceC1652, i, arrayList, c24027);
                }
            }
            for (InterfaceC1652 interfaceC1653 : c16568.f53634) {
                if (interfaceC1653 instanceof C16567) {
                    m28647((C16567) interfaceC1653, i, arrayList, c24027);
                }
            }
            if (i == 1 && (abstractC18805 instanceof C14329)) {
                for (InterfaceC1652 interfaceC1654 : ((C14329) abstractC18805).f45205.f53634) {
                    if (interfaceC1654 instanceof C16567) {
                        m28647((C16567) interfaceC1654, i, arrayList, c24027);
                    }
                }
            }
            Iterator it = c16569.f53625.iterator();
            while (it.hasNext()) {
                m28647((C16567) it.next(), i, arrayList, c24027);
            }
            Iterator it2 = c16568.f53625.iterator();
            while (it2.hasNext()) {
                m28647((C16567) it2.next(), i, arrayList, c24027);
            }
            if (i == 1 && (abstractC18805 instanceof C14329)) {
                Iterator it3 = ((C14329) abstractC18805).f45205.f53625.iterator();
                while (it3.hasNext()) {
                    m28647((C16567) it3.next(), i, arrayList, c24027);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28648(AbstractC18805 abstractC18805, int i, ArrayList arrayList) {
        C16567 c16567 = abstractC18805.f61068;
        C16567 c16568 = abstractC18805.f61071;
        for (InterfaceC1652 interfaceC1652 : c16567.f53634) {
            if (interfaceC1652 instanceof C16567) {
                m28647((C16567) interfaceC1652, i, arrayList, null);
            } else if (interfaceC1652 instanceof AbstractC18805) {
                m28647(((AbstractC18805) interfaceC1652).f61068, i, arrayList, null);
            }
        }
        for (InterfaceC1652 interfaceC1653 : c16568.f53634) {
            if (interfaceC1653 instanceof C16567) {
                m28647((C16567) interfaceC1653, i, arrayList, null);
            } else if (interfaceC1653 instanceof AbstractC18805) {
                m28647(((AbstractC18805) interfaceC1653).f61071, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC1652 interfaceC1654 : ((C14329) abstractC18805).f45205.f53634) {
                if (interfaceC1654 instanceof C16567) {
                    m28647((C16567) interfaceC1654, i, arrayList, null);
                }
            }
        }
    }
}
