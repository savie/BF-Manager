package l;

/* JADX INFO: renamed from: l.᩷ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BCT */
/* JADX INFO: loaded from: classes.dex */
public final class C22042 extends AbstractC14077 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239[] f71085;

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۛ */
    public final C22042 mo15003() {
        return this;
    }

    public C22042(int i) {
        super(i != 0);
        this.f71085 = new InterfaceC22239[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22042 m49829(C22042 c22042) {
        InterfaceC22239[] interfaceC22239Arr = this.f71085;
        if (this != c22042) {
            try {
                int length = interfaceC22239Arr.length;
                if (c22042.f71085.length != length) {
                    throw new C16074("mismatched maxLocals values", null);
                }
                C22042 c22042Mo15004 = null;
                for (int i = 0; i < length; i++) {
                    InterfaceC22239 interfaceC22239 = interfaceC22239Arr[i];
                    InterfaceC22239 interfaceC22239M7175 = C2083.m7175(interfaceC22239, c22042.f71085[i]);
                    if (interfaceC22239M7175 != interfaceC22239) {
                        if (c22042Mo15004 == null) {
                            c22042Mo15004 = mo15004();
                        }
                        if (interfaceC22239M7175 != null) {
                            c22042Mo15004.mo15000(i, interfaceC22239M7175);
                        } else {
                            c22042Mo15004.m46490();
                            c22042Mo15004.f71085[i] = null;
                        }
                    }
                }
                if (c22042Mo15004 != null) {
                    c22042Mo15004.mo15005();
                    return c22042Mo15004;
                }
            } catch (C16074 e) {
                e.m12508("underlay locals:");
                mo15001(e);
                e.m12508("overlay locals:");
                c22042.mo15001(e);
                throw e;
            }
        }
        return this;
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۨ */
    public final C22042 mo15004() {
        InterfaceC22239[] interfaceC22239Arr = this.f71085;
        C22042 c22042 = new C22042(interfaceC22239Arr.length);
        System.arraycopy(interfaceC22239Arr, 0, c22042.f71085, 0, interfaceC22239Arr.length);
        return c22042;
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ */
    public final void mo15001(C16074 c16074) {
        int i = 0;
        while (true) {
            InterfaceC22239[] interfaceC22239Arr = this.f71085;
            if (i >= interfaceC22239Arr.length) {
                return;
            }
            InterfaceC22239 interfaceC22239 = interfaceC22239Arr[i];
            c16074.m12508("locals[" + C5306.m15934(i) + "]: " + (interfaceC22239 == null ? "<invalid>" : interfaceC22239.toString()));
            i++;
        }
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            InterfaceC22239[] interfaceC22239Arr = this.f71085;
            if (i < interfaceC22239Arr.length) {
                InterfaceC22239 interfaceC22239 = interfaceC22239Arr[i];
                sb.append("locals[" + C5306.m15934(i) + "]: " + (interfaceC22239 == null ? "<invalid>" : interfaceC22239.toString()) + "\n");
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ᩷ */
    public final void mo15006(C5085 c5085) {
        InterfaceC22239[] interfaceC22239Arr = this.f71085;
        int length = interfaceC22239Arr.length;
        if (length == 0) {
            return;
        }
        m46490();
        C5085 c5085M15370 = c5085.m15370();
        for (int i = 0; i < length; i++) {
            if (interfaceC22239Arr[i] == c5085) {
                interfaceC22239Arr[i] = c5085M15370;
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m49830() {
        return this.f71085.length;
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ */
    public final void mo15000(int i, InterfaceC22239 interfaceC22239) {
        int i2;
        InterfaceC22239 interfaceC222310;
        m46490();
        try {
            InterfaceC22239 interfaceC22239Mo8407 = interfaceC22239.mo8407();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            boolean zM15366 = interfaceC22239Mo8407.getType().m15366();
            InterfaceC22239[] interfaceC22239Arr = this.f71085;
            if (zM15366) {
                interfaceC22239Arr[i + 1] = null;
            }
            interfaceC22239Arr[i] = interfaceC22239Mo8407;
            if (i == 0 || (interfaceC222310 = interfaceC22239Arr[(i2 = i - 1)]) == null || !interfaceC222310.getType().m15366()) {
                return;
            }
            interfaceC22239Arr[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ */
    public final void mo15002(C20946 c20946) {
        mo15000(c20946.m47903(), c20946);
    }

    @Override // l.AbstractC14077
    public final InterfaceC22239 get(int i) {
        InterfaceC22239 interfaceC22239 = this.f71085[i];
        if (interfaceC22239 != null) {
            return interfaceC22239;
        }
        throw new C16074("local " + C5306.m15934(i) + ": invalid", null);
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC14077 mo14999(AbstractC14077 abstractC14077) {
        if (abstractC14077 instanceof C22042) {
            return m49829((C22042) abstractC14077);
        }
        return abstractC14077.mo14999(this);
    }

    @Override // l.AbstractC14077
    /* JADX INFO: renamed from: ۙ */
    public final C4888 mo14997(AbstractC14077 abstractC14077, int i) {
        return new C4888(this.f71085.length).mo14997(abstractC14077, i);
    }
}
