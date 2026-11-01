package l;

/* JADX INFO: renamed from: l.ۙۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BCT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4359 extends AbstractC9569 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919[] f15593;

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۤ */
    public final C4359 mo9635() {
        return this;
    }

    public C4359(int i) {
        super(i != 0);
        this.f15593 = new InterfaceC4919[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4359 m12202(C4359 c4359) {
        InterfaceC4919[] interfaceC4919Arr = this.f15593;
        if (this != c4359) {
            try {
                int length = interfaceC4919Arr.length;
                if (c4359.f15593.length != length) {
                    throw new C21293("mismatched maxLocals values", null);
                }
                C4359 c4359Mo9634 = null;
                for (int i = 0; i < length; i++) {
                    InterfaceC4919 interfaceC4919 = interfaceC4919Arr[i];
                    InterfaceC4919 interfaceC4919M5875 = C1791.m5875(interfaceC4919, c4359.f15593[i]);
                    if (interfaceC4919M5875 != interfaceC4919) {
                        if (c4359Mo9634 == null) {
                            c4359Mo9634 = mo9634();
                        }
                        if (interfaceC4919M5875 != null) {
                            c4359Mo9634.mo9631(i, interfaceC4919M5875);
                        } else {
                            c4359Mo9634.m43641();
                            c4359Mo9634.f15593[i] = null;
                        }
                    }
                }
                if (c4359Mo9634 != null) {
                    c4359Mo9634.mo9637();
                    return c4359Mo9634;
                }
            } catch (C21293 e) {
                e.m20021("underlay locals:");
                mo9633(e);
                e.m20021("overlay locals:");
                c4359.mo9633(e);
                throw e;
            }
        }
        return this;
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۡ */
    public final C4359 mo9634() {
        InterfaceC4919[] interfaceC4919Arr = this.f15593;
        C4359 c4359 = new C4359(interfaceC4919Arr.length);
        System.arraycopy(interfaceC4919Arr, 0, c4359.f15593, 0, interfaceC4919Arr.length);
        return c4359;
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ */
    public final void mo9633(C21293 c21293) {
        int i = 0;
        while (true) {
            InterfaceC4919[] interfaceC4919Arr = this.f15593;
            if (i >= interfaceC4919Arr.length) {
                return;
            }
            InterfaceC4919 interfaceC4919 = interfaceC4919Arr[i];
            c21293.m20021("locals[" + C22475.m49982(i) + "]: " + (interfaceC4919 == null ? "<invalid>" : interfaceC4919.toString()));
            i++;
        }
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            InterfaceC4919[] interfaceC4919Arr = this.f15593;
            if (i < interfaceC4919Arr.length) {
                InterfaceC4919 interfaceC4919 = interfaceC4919Arr[i];
                sb.append("locals[" + C22475.m49982(i) + "]: " + (interfaceC4919 == null ? "<invalid>" : interfaceC4919.toString()) + "\n");
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ܰ */
    public final void mo9636(C3320 c3320) {
        InterfaceC4919[] interfaceC4919Arr = this.f15593;
        int length = interfaceC4919Arr.length;
        if (length == 0) {
            return;
        }
        m43641();
        C3320 c3320M9837 = c3320.m9837();
        for (int i = 0; i < length; i++) {
            if (interfaceC4919Arr[i] == c3320) {
                interfaceC4919Arr[i] = c3320M9837;
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m12203() {
        return this.f15593.length;
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ */
    public final void mo9631(int i, InterfaceC4919 interfaceC4919) {
        int i2;
        InterfaceC4919 interfaceC49110;
        m43641();
        try {
            InterfaceC4919 interfaceC4919Mo9835 = interfaceC4919.mo9835();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            boolean zM9846 = interfaceC4919Mo9835.getType().m9846();
            InterfaceC4919[] interfaceC4919Arr = this.f15593;
            if (zM9846) {
                interfaceC4919Arr[i + 1] = null;
            }
            interfaceC4919Arr[i] = interfaceC4919Mo9835;
            if (i == 0 || (interfaceC49110 = interfaceC4919Arr[(i2 = i - 1)]) == null || !interfaceC49110.getType().m9846()) {
                return;
            }
            interfaceC4919Arr[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ */
    public final void mo9632(C16251 c16251) {
        mo9631(c16251.m38400(), c16251);
    }

    @Override // l.AbstractC9569
    public final InterfaceC4919 get(int i) {
        InterfaceC4919 interfaceC4919 = this.f15593[i];
        if (interfaceC4919 != null) {
            return interfaceC4919;
        }
        throw new C21293("local " + C22475.m49982(i) + ": invalid", null);
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9569 mo9630(AbstractC9569 abstractC9569) {
        if (abstractC9569 instanceof C4359) {
            return m12202((C4359) abstractC9569);
        }
        return abstractC9569.mo9630(this);
    }

    @Override // l.AbstractC9569
    /* JADX INFO: renamed from: ۙ */
    public final C3217 mo9628(AbstractC9569 abstractC9569, int i) {
        return new C3217(this.f15593.length).mo9628(abstractC9569, i);
    }
}
