package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۙۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E94U */
/* JADX INFO: loaded from: classes3.dex */
public final class C4404 implements InterfaceC13724 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f15680;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15681;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15682 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC3262 f15683;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4404 m12275(AbstractC3262 abstractC3262) {
        C4404 c4404 = abstractC3262.f12120;
        return c4404 != null ? c4404 : new C4404(abstractC3262);
    }

    public C4404(AbstractC3262 abstractC3262) {
        C9779.m24889(abstractC3262, "input");
        this.f15683 = abstractC3262;
        abstractC3262.f12120 = this;
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo12313() {
        this.f15683.getClass();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo12311() {
        int i = this.f15682;
        if (i != 0) {
            this.f15680 = i;
            this.f15682 = 0;
        } else {
            this.f15680 = this.f15683.mo6048();
        }
        int i2 = this.f15680;
        if (i2 == 0 || i2 == this.f15681) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // l.InterfaceC13724
    public final int getTag() {
        return this.f15680;
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean mo12297() {
        int i;
        AbstractC3262 abstractC3262 = this.f15683;
        if (abstractC3262.mo6021() || (i = this.f15680) == this.f15681) {
            return false;
        }
        return abstractC3262.mo6022(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m12279(int i) throws C3427 {
        if ((this.f15680 & 7) != i) {
            throw C4529.m12645();
        }
    }

    @Override // l.InterfaceC13724
    public final double readDouble() throws C3427 {
        m12279(1);
        return this.f15683.mo6020();
    }

    @Override // l.InterfaceC13724
    public final float readFloat() throws C3427 {
        m12279(5);
        return this.f15683.mo6052();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long mo12294() throws C3427 {
        m12279(0);
        return this.f15683.mo6047();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long mo12298() throws C3427 {
        m12279(0);
        return this.f15683.mo6049();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo12284() throws C3427 {
        m12279(0);
        return this.f15683.mo6040();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo12286() throws C3427 {
        m12279(1);
        return this.f15683.mo6029();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int mo12321() throws C3427 {
        m12279(5);
        return this.f15683.mo6023();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo12308() throws C3427 {
        m12279(0);
        return this.f15683.mo6028();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo12317() throws C3427 {
        m12279(2);
        return this.f15683.mo6033();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo12299() throws C3427 {
        m12279(2);
        return this.f15683.mo6030();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo12304(Class cls, C2701 c2701) throws C4529 {
        m12279(2);
        InterfaceC6667 interfaceC6667M35322 = C14739.m35321().m35322(cls);
        Object objMo18054 = interfaceC6667M35322.mo18054();
        m12274(objMo18054, interfaceC6667M35322, c2701);
        interfaceC6667M35322.mo18055(objMo18054);
        return objMo18054;
    }

    @Override // l.InterfaceC13724
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo12287(Class cls, C2701 c2701) throws C3427 {
        m12279(3);
        InterfaceC6667 interfaceC6667M35322 = C14739.m35321().m35322(cls);
        Object objMo18054 = interfaceC6667M35322.mo18054();
        m12278(objMo18054, interfaceC6667M35322, c2701);
        interfaceC6667M35322.mo18055(objMo18054);
        return objMo18054;
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo12305(Object obj, InterfaceC6667 interfaceC6667, C2701 c2701) throws C4529 {
        m12279(2);
        m12274(obj, interfaceC6667, c2701);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m12274(Object obj, InterfaceC6667 interfaceC6667, C2701 c2701) throws C4529 {
        AbstractC3262 abstractC3262 = this.f15683;
        int iMo6041 = abstractC3262.mo6041();
        if (abstractC3262.f12121 >= abstractC3262.f12123) {
            throw new C4529("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo6035 = abstractC3262.mo6035(iMo6041);
        abstractC3262.f12121++;
        interfaceC6667.mo18058(obj, this, c2701);
        abstractC3262.mo6025(0);
        abstractC3262.f12121--;
        abstractC3262.mo6039(iMo6035);
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12288(Object obj, InterfaceC6667 interfaceC6667, C2701 c2701) throws C3427 {
        m12279(3);
        m12278(obj, interfaceC6667, c2701);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m12278(Object obj, InterfaceC6667 interfaceC6667, C2701 c2701) {
        int i = this.f15681;
        this.f15681 = ((this.f15680 >>> 3) << 3) | 4;
        try {
            interfaceC6667.mo18058(obj, this, c2701);
            if (this.f15680 != this.f15681) {
                throw C4529.m12647();
            }
            this.f15681 = i;
        } catch (Throwable th) {
            this.f15681 = i;
            throw th;
        }
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC23725 mo12302() throws C3427 {
        m12279(2);
        return this.f15683.mo6050();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo12282() throws C3427 {
        m12279(0);
        return this.f15683.mo6041();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo12319() throws C3427 {
        m12279(0);
        return this.f15683.mo6037();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo12315() throws C3427 {
        m12279(5);
        return this.f15683.mo6045();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo12300() throws C3427 {
        m12279(1);
        return this.f15683.mo6031();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo12280() throws C3427 {
        m12279(0);
        return this.f15683.mo6046();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long mo12309() throws C3427 {
        m12279(0);
        return this.f15683.mo6032();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void mo12316(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C0689;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C0689 c0689 = (C0689) list;
            int i = this.f15680 & 7;
            if (i == 1) {
                do {
                    c0689.m3073(abstractC3262.mo6020());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6041 = abstractC3262.mo6041();
                m12273(iMo6041);
                int iMo6034 = abstractC3262.mo6034() + iMo6041;
                do {
                    c0689.m3073(abstractC3262.mo6020());
                } while (abstractC3262.mo6034() < iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(abstractC3262.mo6020()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6042 = abstractC3262.mo6041();
            m12273(iMo6042);
            int iMo6035 = abstractC3262.mo6034() + iMo6042;
            do {
                list.add(Double.valueOf(abstractC3262.mo6020()));
            } while (abstractC3262.mo6034() < iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo12314(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C7641;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C7641 c7641 = (C7641) list;
            int i = this.f15680 & 7;
            if (i == 2) {
                int iMo6041 = abstractC3262.mo6041();
                m12277(iMo6041);
                int iMo6034 = abstractC3262.mo6034() + iMo6041;
                do {
                    c7641.m20196(abstractC3262.mo6052());
                } while (abstractC3262.mo6034() < iMo6034);
                return;
            }
            if (i == 5) {
                do {
                    c7641.m20196(abstractC3262.mo6052());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 2) {
            int iMo6042 = abstractC3262.mo6041();
            m12277(iMo6042);
            int iMo6035 = abstractC3262.mo6034() + iMo6042;
            do {
                list.add(Float.valueOf(abstractC3262.mo6052()));
            } while (abstractC3262.mo6034() < iMo6035);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Float.valueOf(abstractC3262.mo6052()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo12301(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C8764;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C8764 c8764 = (C8764) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c8764.m22769(abstractC3262.mo6047());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c8764.m22769(abstractC3262.mo6047());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC3262.mo6047()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Long.valueOf(abstractC3262.mo6047()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo12283(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C8764;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C8764 c8764 = (C8764) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c8764.m22769(abstractC3262.mo6049());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c8764.m22769(abstractC3262.mo6049());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC3262.mo6049()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Long.valueOf(abstractC3262.mo6049()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo12310(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C20362;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C20362 c20362 = (C20362) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c20362.mo45940(abstractC3262.mo6040());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c20362.mo45940(abstractC3262.mo6040());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3262.mo6040()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Integer.valueOf(abstractC3262.mo6040()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo12303(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C8764;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C8764 c8764 = (C8764) list;
            int i = this.f15680 & 7;
            if (i == 1) {
                do {
                    c8764.m22769(abstractC3262.mo6029());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6041 = abstractC3262.mo6041();
                m12273(iMo6041);
                int iMo6034 = abstractC3262.mo6034() + iMo6041;
                do {
                    c8764.m22769(abstractC3262.mo6029());
                } while (abstractC3262.mo6034() < iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC3262.mo6029()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6042 = abstractC3262.mo6041();
            m12273(iMo6042);
            int iMo6035 = abstractC3262.mo6034() + iMo6042;
            do {
                list.add(Long.valueOf(abstractC3262.mo6029()));
            } while (abstractC3262.mo6034() < iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo12318(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C20362;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C20362 c20362 = (C20362) list;
            int i = this.f15680 & 7;
            if (i == 2) {
                int iMo6041 = abstractC3262.mo6041();
                m12277(iMo6041);
                int iMo6034 = abstractC3262.mo6034() + iMo6041;
                do {
                    c20362.mo45940(abstractC3262.mo6023());
                } while (abstractC3262.mo6034() < iMo6034);
                return;
            }
            if (i == 5) {
                do {
                    c20362.mo45940(abstractC3262.mo6023());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 2) {
            int iMo6042 = abstractC3262.mo6041();
            m12277(iMo6042);
            int iMo6035 = abstractC3262.mo6034() + iMo6042;
            do {
                list.add(Integer.valueOf(abstractC3262.mo6023()));
            } while (abstractC3262.mo6034() < iMo6035);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC3262.mo6023()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo12320(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C8908;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C8908 c8908 = (C8908) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c8908.m23171(abstractC3262.mo6028());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c8908.m23171(abstractC3262.mo6028());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC3262.mo6028()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Boolean.valueOf(abstractC3262.mo6028()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo12312(List list) throws C3427 {
        m12291(list, false);
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo12281(List list) throws C3427 {
        m12291(list, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12291(List list, boolean z) throws C3427 {
        int iMo6048;
        int iMo6049;
        if ((this.f15680 & 7) != 2) {
            throw C4529.m12645();
        }
        boolean z2 = list instanceof InterfaceC17935;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z2 && !z) {
            InterfaceC17935 interfaceC17935 = (InterfaceC17935) list;
            do {
                interfaceC17935.mo21383(mo12302());
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6049 = abstractC3262.mo6048();
                }
            } while (iMo6049 == this.f15680);
            this.f15682 = iMo6049;
            return;
        }
        do {
            list.add(z ? mo12299() : mo12317());
            if (abstractC3262.mo6021()) {
                return;
            } else {
                iMo6048 = abstractC3262.mo6048();
            }
        } while (iMo6048 == this.f15680);
        this.f15682 = iMo6048;
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo12307(List list, InterfaceC6667 interfaceC6667, C2701 c2701) throws C4529 {
        int iMo6048;
        int i = this.f15680;
        if ((i & 7) != 2) {
            throw C4529.m12645();
        }
        do {
            Object objMo18054 = interfaceC6667.mo18054();
            m12274(objMo18054, interfaceC6667, c2701);
            interfaceC6667.mo18055(objMo18054);
            list.add(objMo18054);
            AbstractC3262 abstractC3262 = this.f15683;
            if (abstractC3262.mo6021() || this.f15682 != 0) {
                return;
            } else {
                iMo6048 = abstractC3262.mo6048();
            }
        } while (iMo6048 == i);
        this.f15682 = iMo6048;
    }

    @Override // l.InterfaceC13724
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12290(List list, InterfaceC6667 interfaceC6667, C2701 c2701) throws C3427 {
        int iMo6048;
        int i = this.f15680;
        if ((i & 7) != 3) {
            throw C4529.m12645();
        }
        do {
            Object objMo18054 = interfaceC6667.mo18054();
            m12278(objMo18054, interfaceC6667, c2701);
            interfaceC6667.mo18055(objMo18054);
            list.add(objMo18054);
            AbstractC3262 abstractC3262 = this.f15683;
            if (abstractC3262.mo6021() || this.f15682 != 0) {
                return;
            } else {
                iMo6048 = abstractC3262.mo6048();
            }
        } while (iMo6048 == i);
        this.f15682 = iMo6048;
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void mo12296(List list) throws C3427 {
        int iMo6048;
        if ((this.f15680 & 7) != 2) {
            throw C4529.m12645();
        }
        do {
            list.add(mo12302());
            AbstractC3262 abstractC3262 = this.f15683;
            if (abstractC3262.mo6021()) {
                return;
            } else {
                iMo6048 = abstractC3262.mo6048();
            }
        } while (iMo6048 == this.f15680);
        this.f15682 = iMo6048;
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo12295(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C20362;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C20362 c20362 = (C20362) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c20362.mo45940(abstractC3262.mo6041());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c20362.mo45940(abstractC3262.mo6041());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3262.mo6041()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Integer.valueOf(abstractC3262.mo6041()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo12293(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C20362;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C20362 c20362 = (C20362) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c20362.mo45940(abstractC3262.mo6037());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c20362.mo45940(abstractC3262.mo6037());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3262.mo6037()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Integer.valueOf(abstractC3262.mo6037()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12289(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C20362;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C20362 c20362 = (C20362) list;
            int i = this.f15680 & 7;
            if (i == 2) {
                int iMo6041 = abstractC3262.mo6041();
                m12277(iMo6041);
                int iMo6034 = abstractC3262.mo6034() + iMo6041;
                do {
                    c20362.mo45940(abstractC3262.mo6045());
                } while (abstractC3262.mo6034() < iMo6034);
                return;
            }
            if (i == 5) {
                do {
                    c20362.mo45940(abstractC3262.mo6045());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 2) {
            int iMo6042 = abstractC3262.mo6041();
            m12277(iMo6042);
            int iMo6035 = abstractC3262.mo6034() + iMo6042;
            do {
                list.add(Integer.valueOf(abstractC3262.mo6045()));
            } while (abstractC3262.mo6034() < iMo6035);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(abstractC3262.mo6045()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo12322(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C8764;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C8764 c8764 = (C8764) list;
            int i = this.f15680 & 7;
            if (i == 1) {
                do {
                    c8764.m22769(abstractC3262.mo6031());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6041 = abstractC3262.mo6041();
                m12273(iMo6041);
                int iMo6034 = abstractC3262.mo6034() + iMo6041;
                do {
                    c8764.m22769(abstractC3262.mo6031());
                } while (abstractC3262.mo6034() < iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC3262.mo6031()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6042 = abstractC3262.mo6041();
            m12273(iMo6042);
            int iMo6035 = abstractC3262.mo6034() + iMo6042;
            do {
                list.add(Long.valueOf(abstractC3262.mo6031()));
            } while (abstractC3262.mo6034() < iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo12285(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C20362;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C20362 c20362 = (C20362) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c20362.mo45940(abstractC3262.mo6046());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c20362.mo45940(abstractC3262.mo6046());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC3262.mo6046()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Integer.valueOf(abstractC3262.mo6046()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo12306(List list) throws C4529 {
        int iMo6048;
        int iMo6049;
        boolean z = list instanceof C8764;
        AbstractC3262 abstractC3262 = this.f15683;
        if (z) {
            C8764 c8764 = (C8764) list;
            int i = this.f15680 & 7;
            if (i == 0) {
                do {
                    c8764.m22769(abstractC3262.mo6032());
                    if (abstractC3262.mo6021()) {
                        return;
                    } else {
                        iMo6049 = abstractC3262.mo6048();
                    }
                } while (iMo6049 == this.f15680);
                this.f15682 = iMo6049;
                return;
            }
            if (i == 2) {
                int iMo6034 = abstractC3262.mo6034() + abstractC3262.mo6041();
                do {
                    c8764.m22769(abstractC3262.mo6032());
                } while (abstractC3262.mo6034() < iMo6034);
                m12276(iMo6034);
                return;
            }
            throw C4529.m12645();
        }
        int i2 = this.f15680 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC3262.mo6032()));
                if (abstractC3262.mo6021()) {
                    return;
                } else {
                    iMo6048 = abstractC3262.mo6048();
                }
            } while (iMo6048 == this.f15680);
            this.f15682 = iMo6048;
            return;
        }
        if (i2 == 2) {
            int iMo6035 = abstractC3262.mo6034() + abstractC3262.mo6041();
            do {
                list.add(Long.valueOf(abstractC3262.mo6032()));
            } while (abstractC3262.mo6034() < iMo6035);
            m12276(iMo6035);
            return;
        }
        throw C4529.m12645();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m12273(int i) throws C4529 {
        if ((i & 7) != 0) {
            throw C4529.m12647();
        }
    }

    @Override // l.InterfaceC13724
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo12292() throws C3427 {
        m12279(2);
        AbstractC3262 abstractC3262 = this.f15683;
        abstractC3262.mo6035(abstractC3262.mo6041());
        throw null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m12277(int i) throws C4529 {
        if ((i & 3) != 0) {
            throw C4529.m12647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12276(int i) throws C4529 {
        if (this.f15683.mo6034() != i) {
            throw C4529.m12644();
        }
    }
}
