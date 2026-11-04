package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18182 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9998 f59418;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f59419;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16471 f59420;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14473 f59421;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f59422;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f59423;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59424;

    public C18182(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f59423 = 0;
        this.f59419 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m42347();
            m42348();
        }
    }

    public /* synthetic */ C18182(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m42351();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m42351();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m42351();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m42351();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m42351();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m42349(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m42349(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m42349(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m42349(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40286;
        c7544.m20621(C18928.class, C18182.class);
        return c7544;
    }

    public C18182() {
        this.f59423 = 0;
        this.f59419 = Collections.EMPTY_LIST;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m42347();
            m42348();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42351() {
        super.mo2313clear();
        this.f59424 = 0;
        this.f59422 = false;
        this.f59423 = 0;
        this.f59420 = null;
        C9998 c9998 = this.f59418;
        if (c9998 != null) {
            c9998.m25851();
            this.f59418 = null;
        }
        C14473 c14473 = this.f59421;
        if (c14473 == null) {
            this.f59419 = Collections.EMPTY_LIST;
        } else {
            this.f59419 = null;
            c14473.m34945();
        }
        this.f59424 &= -9;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40308;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C18928.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C18928.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C18928 c18928BuildPartial = buildPartial();
        if (c18928BuildPartial.isInitialized()) {
            return c18928BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c18928BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C18928 c18928BuildPartial = buildPartial();
        if (c18928BuildPartial.isInitialized()) {
            return c18928BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c18928BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C18928 buildPartial() {
        int i;
        C16471 c16471;
        C18928 c18928 = new C18928(this);
        C14473 c14473 = this.f59421;
        if (c14473 != null) {
            c18928.f61405 = c14473.m34950();
        } else {
            if ((this.f59424 & 8) != 0) {
                this.f59419 = C4681.unmodifiableList(this.f59419);
                this.f59424 &= -9;
            }
            c18928.f61405 = this.f59419;
        }
        int i2 = this.f59424;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c18928.f61406 = this.f59422;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c18928.f61404 = this.f59423;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C9998 c9998 = this.f59418;
                if (c9998 == null) {
                    c16471 = this.f59420;
                } else {
                    c16471 = (C16471) c9998.m25854();
                }
                c18928.f61403 = c16471;
                i |= 4;
            }
            c18928.f61408 = i | c18928.f61408;
        }
        onBuilt();
        return c18928;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C18928) {
            m42350((C18928) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C18928) {
            m42350((C18928) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42350(C18928 c18928) {
        C16471 c16471;
        if (c18928 == C18928.getDefaultInstance()) {
            return;
        }
        if (c18928.m43952()) {
            this.f59422 = c18928.m43956();
            this.f59424 |= 1;
            onChanged();
        }
        if (c18928.m43951()) {
            EnumC7741 enumC7741M43954 = c18928.m43954();
            enumC7741M43954.getClass();
            this.f59424 |= 2;
            this.f59423 = enumC7741M43954.getNumber();
            onChanged();
        }
        if (c18928.m43955()) {
            C16471 c16471M43953 = c18928.m43953();
            C9998 c9998 = this.f59418;
            if (c9998 == null) {
                if ((this.f59424 & 4) == 0 || (c16471 = this.f59420) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f59420 = c16471M43953;
                } else {
                    this.f59424 |= 4;
                    onChanged();
                    ((C7301) m42347().m25856()).m19969(c16471M43953);
                }
            } else {
                c9998.m25850(c16471M43953);
            }
            if (this.f59420 != null) {
                this.f59424 |= 4;
                onChanged();
            }
        }
        if (this.f59421 == null) {
            if (!c18928.f61405.isEmpty()) {
                if (this.f59419.isEmpty()) {
                    this.f59419 = c18928.f61405;
                    this.f59424 &= -9;
                } else {
                    if ((this.f59424 & 8) == 0) {
                        this.f59419 = new ArrayList(this.f59419);
                        this.f59424 |= 8;
                    }
                    this.f59419.addAll(c18928.f61405);
                }
                onChanged();
            }
        } else if (!c18928.f61405.isEmpty()) {
            if (!this.f59421.m34938()) {
                this.f59421.m34942(c18928.f61405);
            } else {
                this.f59421.m34954();
                this.f59421 = null;
                this.f59419 = c18928.f61405;
                this.f59424 &= -9;
                this.f59421 = AbstractC9035.alwaysUseFieldBuilders ? m42348() : null;
            }
        }
        m15943((AbstractC11272) c18928);
        mo2317mergeUnknownFields(c18928.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42349(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 264) {
                            this.f59422 = abstractC3660.mo11894();
                            this.f59424 |= 1;
                        } else if (iMo11876 == 272) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC7741.m21069(iMo11882) == null) {
                                mergeUnknownVarintField(34, iMo11882);
                            } else {
                                this.f59423 = iMo11882;
                                this.f59424 |= 2;
                            }
                        } else if (iMo11876 == 282) {
                            abstractC3660.mo11881(m42347().m25856(), c24215);
                            this.f59424 |= 4;
                        } else if (iMo11876 == 7994) {
                            C20748 c20748 = (C20748) abstractC3660.mo11877(C20748.parser(), c24215);
                            C14473 c14473 = this.f59421;
                            if (c14473 != null) {
                                c14473.m34953(c20748);
                            } else {
                                if ((this.f59424 & 8) == 0) {
                                    this.f59419 = new ArrayList(this.f59419);
                                    this.f59424 |= 8;
                                }
                                this.f59419.add(c20748);
                            }
                        } else if (!parseUnknownField(abstractC3660, c24215, iMo11876)) {
                        }
                    }
                    z = true;
                } catch (C20463 e) {
                    throw e.m46971();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[LOOP:0: B:14:0x0022->B:26:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056 A[EDGE_INSN: B:33:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // l.AbstractC5307, l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int i;
        C14473 c14473;
        int iM34948;
        C14473 c14474;
        C20748 c20748;
        C16471 defaultInstance;
        if ((this.f59424 & 4) == 0) {
            i = 0;
            while (true) {
                c14473 = this.f59421;
                if (c14473 == null) {
                    iM34948 = this.f59419.size();
                } else {
                    iM34948 = c14473.m34948();
                }
                if (i < iM34948) {
                    if (!m15945()) {
                        break;
                    }
                    return true;
                }
                c14474 = this.f59421;
                if (c14474 == null) {
                    c20748 = (C20748) this.f59419.get(i);
                } else {
                    c20748 = (C20748) c14474.m34951(i);
                }
                if (!c20748.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C9998 c9998 = this.f59418;
            if (c9998 == null) {
                defaultInstance = this.f59420;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14473 = this.f59421;
                    if (c14473 == null) {
                        iM34948 = this.f59419.size();
                    } else {
                        iM34948 = c14473.m34948();
                    }
                    if (i < iM34948) {
                        if (!m15945()) {
                            break;
                        }
                        return true;
                    }
                    c14474 = this.f59421;
                    if (c14474 == null) {
                        c20748 = (C20748) this.f59419.get(i);
                    } else {
                        c20748 = (C20748) c14474.m34951(i);
                    }
                    if (!c20748.isInitialized()) {
                        break;
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C9998 m42347() {
        C16471 defaultInstance;
        C9998 c9998 = this.f59418;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f59420;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f59418 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f59420 = null;
        }
        return this.f59418;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C14473 m42348() {
        if (this.f59421 == null) {
            this.f59421 = new C14473(this.f59419, (this.f59424 & 8) != 0, getParentForChildren(), isClean());
            this.f59419 = null;
        }
        return this.f59421;
    }
}
