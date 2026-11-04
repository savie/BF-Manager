package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩵᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E94U */
/* JADX INFO: loaded from: classes5.dex */
public final class C20814 implements InterfaceC12236 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66651 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC3660 f66652;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f66653;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20814 m47607(AbstractC3660 abstractC3660) {
        C20814 c20814 = abstractC3660.f12529;
        return c20814 != null ? c20814 : new C20814(abstractC3660);
    }

    public C20814(AbstractC3660 abstractC3660) {
        C23447.m52662(abstractC3660, "input");
        this.f66652 = abstractC3660;
        abstractC3660.f12529 = this;
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩹ */
    public final void mo30566() {
        this.f66652.getClass();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܶ */
    public final int mo30549() {
        int i = this.f66651;
        if (i != 0) {
            this.f66653 = i;
            this.f66651 = 0;
        } else {
            this.f66653 = this.f66652.mo11876();
        }
        int i2 = this.f66653;
        if (i2 == 0 || i2 == this.f66650) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // l.InterfaceC12236
    public final int getTag() {
        return this.f66653;
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo30531() {
        int i;
        AbstractC3660 abstractC3660 = this.f66652;
        if (abstractC3660.mo11899() || (i = this.f66653) == this.f66650) {
            return false;
        }
        return abstractC3660.mo11900(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m47611(int i) throws C3309 {
        if ((this.f66653 & 7) != i) {
            throw C20463.m46968();
        }
    }

    @Override // l.InterfaceC12236
    public final double readDouble() throws C3309 {
        m47611(1);
        return this.f66652.mo11888();
    }

    @Override // l.InterfaceC12236
    public final float readFloat() throws C3309 {
        m47611(5);
        return this.f66652.mo11903();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۧ */
    public final long mo30542() throws C3309 {
        m47611(0);
        return this.f66652.mo11896();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۨ */
    public final long mo30544() throws C3309 {
        m47611(0);
        return this.f66652.mo11893();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ֫ */
    public final int mo30528() throws C3309 {
        m47611(0);
        return this.f66652.mo11892();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۙ */
    public final long mo30532() throws C3309 {
        m47611(1);
        return this.f66652.mo11886();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩻ */
    public final int mo30568() throws C3309 {
        m47611(5);
        return this.f66652.mo11874();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo30563() throws C3309 {
        m47611(0);
        return this.f66652.mo11894();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܽ */
    public final String mo30553() throws C3309 {
        m47611(2);
        return this.f66652.mo11883();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۛ */
    public final String mo30539() throws C3309 {
        m47611(2);
        return this.f66652.mo11902();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo30559(Class cls, C24215 c24215) throws C20463 {
        m47611(2);
        InterfaceC7762 interfaceC7762M40959 = C17457.m40958().m40959(cls);
        Object objMo21139 = interfaceC7762M40959.mo21139();
        m47613(objMo21139, interfaceC7762M40959, c24215);
        interfaceC7762M40959.mo21140(objMo21139);
        return objMo21139;
    }

    @Override // l.InterfaceC12236
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final Object mo30533(Class cls, C24215 c24215) throws C3309 {
        m47611(3);
        InterfaceC7762 interfaceC7762M40959 = C17457.m40958().m40959(cls);
        Object objMo21139 = interfaceC7762M40959.mo21139();
        m47610(objMo21139, interfaceC7762M40959, c24215);
        interfaceC7762M40959.mo21140(objMo21139);
        return objMo21139;
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩷ */
    public final void mo30560(Object obj, InterfaceC7762 interfaceC7762, C24215 c24215) throws C20463 {
        m47611(2);
        m47613(obj, interfaceC7762, c24215);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m47613(Object obj, InterfaceC7762 interfaceC7762, C24215 c24215) throws C20463 {
        AbstractC3660 abstractC3660 = this.f66652;
        int iMo11889 = abstractC3660.mo11889();
        if (abstractC3660.f12526 >= abstractC3660.f12528) {
            throw new C20463("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo11885 = abstractC3660.mo11885(iMo11889);
        abstractC3660.f12526++;
        interfaceC7762.mo21142(obj, this, c24215);
        abstractC3660.mo11879(0);
        abstractC3660.f12526--;
        abstractC3660.mo11898(iMo11885);
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۙ */
    public final void mo30534(Object obj, InterfaceC7762 interfaceC7762, C24215 c24215) throws C3309 {
        m47611(3);
        m47610(obj, interfaceC7762, c24215);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m47610(Object obj, InterfaceC7762 interfaceC7762, C24215 c24215) {
        int i = this.f66650;
        this.f66650 = ((this.f66653 >>> 3) << 3) | 4;
        try {
            interfaceC7762.mo21142(obj, this, c24215);
            if (this.f66653 != this.f66650) {
                throw C20463.m46964();
            }
            this.f66650 = i;
        } catch (Throwable th) {
            this.f66650 = i;
            throw th;
        }
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC17084 mo30537() throws C3309 {
        m47611(2);
        return this.f66652.mo11890();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩸ */
    public final int mo30564() throws C3309 {
        m47611(0);
        return this.f66652.mo11889();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܳ */
    public final int mo30547() throws C3309 {
        m47611(0);
        return this.f66652.mo11882();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩵ */
    public final int mo30557() throws C3309 {
        m47611(5);
        return this.f66652.mo11901();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۤ */
    public final long mo30540() throws C3309 {
        m47611(1);
        return this.f66652.mo11875();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۫ */
    public final int mo30545() throws C3309 {
        m47611(0);
        return this.f66652.mo11895();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܺ */
    public final long mo30551() throws C3309 {
        m47611(0);
        return this.f66652.mo11887();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩵ */
    public final void mo30558(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C15263;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C15263 c15263 = (C15263) list;
            int i = this.f66653 & 7;
            if (i == 1) {
                do {
                    c15263.m36616(abstractC3660.mo11888());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11889 = abstractC3660.mo11889();
                m47612(iMo11889);
                int iMo11884 = abstractC3660.mo11884() + iMo11889;
                do {
                    c15263.m36616(abstractC3660.mo11888());
                } while (abstractC3660.mo11884() < iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(abstractC3660.mo11888()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo118810 = abstractC3660.mo11889();
            m47612(iMo118810);
            int iMo11885 = abstractC3660.mo11884() + iMo118810;
            do {
                list.add(Double.valueOf(abstractC3660.mo11888()));
            } while (abstractC3660.mo11884() < iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩹ */
    public final void mo30567(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C21715;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C21715 c21715 = (C21715) list;
            int i = this.f66653 & 7;
            if (i == 2) {
                int iMo11889 = abstractC3660.mo11889();
                m47609(iMo11889);
                int iMo11884 = abstractC3660.mo11884() + iMo11889;
                do {
                    c21715.m49285(abstractC3660.mo11903());
                } while (abstractC3660.mo11884() < iMo11884);
                return;
            }
            if (i == 5) {
                do {
                    c21715.m49285(abstractC3660.mo11903());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 2) {
            int iMo118810 = abstractC3660.mo11889();
            m47609(iMo118810);
            int iMo11885 = abstractC3660.mo11884() + iMo118810;
            do {
                list.add(Float.valueOf(abstractC3660.mo11903()));
            } while (abstractC3660.mo11884() < iMo11885);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Float.valueOf(abstractC3660.mo11903()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۤ */
    public final void mo30541(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C13749;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C13749 c13749 = (C13749) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c13749.m33596(abstractC3660.mo11896());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c13749.m33596(abstractC3660.mo11896());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC3660.mo11896()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Long.valueOf(abstractC3660.mo11896()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩸ */
    public final void mo30565(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C13749;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C13749 c13749 = (C13749) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c13749.m33596(abstractC3660.mo11893());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c13749.m33596(abstractC3660.mo11893());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC3660.mo11893()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Long.valueOf(abstractC3660.mo11893()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܺ */
    public final void mo30552(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C19717;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C19717 c19717 = (C19717) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c19717.mo39511(abstractC3660.mo11892());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c19717.mo39511(abstractC3660.mo11892());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3660.mo11892()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Integer.valueOf(abstractC3660.mo11892()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۚ */
    public final void mo30538(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C13749;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C13749 c13749 = (C13749) list;
            int i = this.f66653 & 7;
            if (i == 1) {
                do {
                    c13749.m33596(abstractC3660.mo11886());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11889 = abstractC3660.mo11889();
                m47612(iMo11889);
                int iMo11884 = abstractC3660.mo11884() + iMo11889;
                do {
                    c13749.m33596(abstractC3660.mo11886());
                } while (abstractC3660.mo11884() < iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC3660.mo11886()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo118810 = abstractC3660.mo11889();
            m47612(iMo118810);
            int iMo11885 = abstractC3660.mo11884() + iMo118810;
            do {
                list.add(Long.valueOf(abstractC3660.mo11886()));
            } while (abstractC3660.mo11884() < iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܽ */
    public final void mo30554(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C19717;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C19717 c19717 = (C19717) list;
            int i = this.f66653 & 7;
            if (i == 2) {
                int iMo11889 = abstractC3660.mo11889();
                m47609(iMo11889);
                int iMo11884 = abstractC3660.mo11884() + iMo11889;
                do {
                    c19717.mo39511(abstractC3660.mo11874());
                } while (abstractC3660.mo11884() < iMo11884);
                return;
            }
            if (i == 5) {
                do {
                    c19717.mo39511(abstractC3660.mo11874());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 2) {
            int iMo118810 = abstractC3660.mo11889();
            m47609(iMo118810);
            int iMo11885 = abstractC3660.mo11884() + iMo118810;
            do {
                list.add(Integer.valueOf(abstractC3660.mo11874()));
            } while (abstractC3660.mo11884() < iMo11885);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC3660.mo11874()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܳ */
    public final void mo30548(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C13902;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C13902 c13902 = (C13902) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c13902.m33851(abstractC3660.mo11894());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c13902.m33851(abstractC3660.mo11894());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC3660.mo11894()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Boolean.valueOf(abstractC3660.mo11894()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ܶ */
    public final void mo30550(List list) throws C3309 {
        m47614(list, false);
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۫ */
    public final void mo30546(List list) throws C3309 {
        m47614(list, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47614(List list, boolean z) throws C3309 {
        int iMo11876;
        int iMo11877;
        if ((this.f66653 & 7) != 2) {
            throw C20463.m46968();
        }
        boolean z2 = list instanceof InterfaceC9274;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z2 && !z) {
            InterfaceC9274 interfaceC9274 = (InterfaceC9274) list;
            do {
                interfaceC9274.mo4028(mo30537());
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11877 = abstractC3660.mo11876();
                }
            } while (iMo11877 == this.f66653);
            this.f66651 = iMo11877;
            return;
        }
        do {
            list.add(z ? mo30539() : mo30553());
            if (abstractC3660.mo11899()) {
                return;
            } else {
                iMo11876 = abstractC3660.mo11876();
            }
        } while (iMo11876 == this.f66653);
        this.f66651 = iMo11876;
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩷ */
    public final void mo30562(List list, InterfaceC7762 interfaceC7762, C24215 c24215) throws C20463 {
        int iMo11876;
        int i = this.f66653;
        if ((i & 7) != 2) {
            throw C20463.m46968();
        }
        do {
            Object objMo21139 = interfaceC7762.mo21139();
            m47613(objMo21139, interfaceC7762, c24215);
            interfaceC7762.mo21140(objMo21139);
            list.add(objMo21139);
            AbstractC3660 abstractC3660 = this.f66652;
            if (abstractC3660.mo11899() || this.f66651 != 0) {
                return;
            } else {
                iMo11876 = abstractC3660.mo11876();
            }
        } while (iMo11876 == i);
        this.f66651 = iMo11876;
    }

    @Override // l.InterfaceC12236
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo30536(List list, InterfaceC7762 interfaceC7762, C24215 c24215) throws C3309 {
        int iMo11876;
        int i = this.f66653;
        if ((i & 7) != 3) {
            throw C20463.m46968();
        }
        do {
            Object objMo21139 = interfaceC7762.mo21139();
            m47610(objMo21139, interfaceC7762, c24215);
            interfaceC7762.mo21140(objMo21139);
            list.add(objMo21139);
            AbstractC3660 abstractC3660 = this.f66652;
            if (abstractC3660.mo11899() || this.f66651 != 0) {
                return;
            } else {
                iMo11876 = abstractC3660.mo11876();
            }
        } while (iMo11876 == i);
        this.f66651 = iMo11876;
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۗ */
    public final void mo30530(List list) throws C3309 {
        int iMo11876;
        if ((this.f66653 & 7) != 2) {
            throw C20463.m46968();
        }
        do {
            list.add(mo30537());
            AbstractC3660 abstractC3660 = this.f66652;
            if (abstractC3660.mo11899()) {
                return;
            } else {
                iMo11876 = abstractC3660.mo11876();
            }
        } while (iMo11876 == this.f66653);
        this.f66651 = iMo11876;
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۧ */
    public final void mo30543(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C19717;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C19717 c19717 = (C19717) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c19717.mo39511(abstractC3660.mo11889());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c19717.mo39511(abstractC3660.mo11889());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3660.mo11889()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Integer.valueOf(abstractC3660.mo11889()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩴ */
    public final void mo30556(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C19717;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C19717 c19717 = (C19717) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c19717.mo39511(abstractC3660.mo11882());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c19717.mo39511(abstractC3660.mo11882());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3660.mo11882()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Integer.valueOf(abstractC3660.mo11882()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ۙ */
    public final void mo30535(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C19717;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C19717 c19717 = (C19717) list;
            int i = this.f66653 & 7;
            if (i == 2) {
                int iMo11889 = abstractC3660.mo11889();
                m47609(iMo11889);
                int iMo11884 = abstractC3660.mo11884() + iMo11889;
                do {
                    c19717.mo39511(abstractC3660.mo11901());
                } while (abstractC3660.mo11884() < iMo11884);
                return;
            }
            if (i == 5) {
                do {
                    c19717.mo39511(abstractC3660.mo11901());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 2) {
            int iMo118810 = abstractC3660.mo11889();
            m47609(iMo118810);
            int iMo11885 = abstractC3660.mo11884() + iMo118810;
            do {
                list.add(Integer.valueOf(abstractC3660.mo11901()));
            } while (abstractC3660.mo11884() < iMo11885);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC3660.mo11901()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩻ */
    public final void mo30569(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C13749;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C13749 c13749 = (C13749) list;
            int i = this.f66653 & 7;
            if (i == 1) {
                do {
                    c13749.m33596(abstractC3660.mo11875());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11889 = abstractC3660.mo11889();
                m47612(iMo11889);
                int iMo11884 = abstractC3660.mo11884() + iMo11889;
                do {
                    c13749.m33596(abstractC3660.mo11875());
                } while (abstractC3660.mo11884() < iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC3660.mo11875()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo118810 = abstractC3660.mo11889();
            m47612(iMo118810);
            int iMo11885 = abstractC3660.mo11884() + iMo118810;
            do {
                list.add(Long.valueOf(abstractC3660.mo11875()));
            } while (abstractC3660.mo11884() < iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ֫ */
    public final void mo30529(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C19717;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C19717 c19717 = (C19717) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c19717.mo39511(abstractC3660.mo11895());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c19717.mo39511(abstractC3660.mo11895());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3660.mo11895()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Integer.valueOf(abstractC3660.mo11895()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩷ */
    public final void mo30561(List list) throws C20463 {
        int iMo11876;
        int iMo11877;
        boolean z = list instanceof C13749;
        AbstractC3660 abstractC3660 = this.f66652;
        if (z) {
            C13749 c13749 = (C13749) list;
            int i = this.f66653 & 7;
            if (i == 0) {
                do {
                    c13749.m33596(abstractC3660.mo11887());
                    if (abstractC3660.mo11899()) {
                        return;
                    } else {
                        iMo11877 = abstractC3660.mo11876();
                    }
                } while (iMo11877 == this.f66653);
                this.f66651 = iMo11877;
                return;
            }
            if (i == 2) {
                int iMo11884 = abstractC3660.mo11884() + abstractC3660.mo11889();
                do {
                    c13749.m33596(abstractC3660.mo11887());
                } while (abstractC3660.mo11884() < iMo11884);
                m47608(iMo11884);
                return;
            }
            throw C20463.m46968();
        }
        int i2 = this.f66653 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC3660.mo11887()));
                if (abstractC3660.mo11899()) {
                    return;
                } else {
                    iMo11876 = abstractC3660.mo11876();
                }
            } while (iMo11876 == this.f66653);
            this.f66651 = iMo11876;
            return;
        }
        if (i2 == 2) {
            int iMo11885 = abstractC3660.mo11884() + abstractC3660.mo11889();
            do {
                list.add(Long.valueOf(abstractC3660.mo11887()));
            } while (abstractC3660.mo11884() < iMo11885);
            m47608(iMo11885);
            return;
        }
        throw C20463.m46968();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m47612(int i) throws C20463 {
        if ((i & 7) != 0) {
            throw C20463.m46964();
        }
    }

    @Override // l.InterfaceC12236
    /* JADX INFO: renamed from: ᩴ */
    public final void mo30555() throws C3309 {
        m47611(2);
        AbstractC3660 abstractC3660 = this.f66652;
        abstractC3660.mo11885(abstractC3660.mo11889());
        throw null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m47609(int i) throws C20463 {
        if ((i & 3) != 0) {
            throw C20463.m46964();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47608(int i) throws C20463 {
        if (this.f66652.mo11884() != i) {
            throw C20463.m46963();
        }
    }
}
