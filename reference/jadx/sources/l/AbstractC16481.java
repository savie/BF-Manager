package l;

/* JADX INFO: renamed from: l.ܺ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6H4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16481 extends AbstractC0074 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53441 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f53442 = C16980.m40037(AbstractC16481.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C18959 f53443;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean mo39117() {
        return false;
    }

    /* JADX INFO: renamed from: ۠ */
    public abstract AbstractC16481 mo17528();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6041 m39109(InterfaceC7377 interfaceC7377, int i, AbstractC1566 abstractC1566) {
        return new C6041(interfaceC7377.mo20252(i), abstractC1566);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6041 m39111(InterfaceC7377 interfaceC7377, int i, AbstractC1566 abstractC1566) {
        if (!abstractC1566.mo5564()) {
            return new C6041(interfaceC7377.mo20252(i), abstractC1566);
        }
        return m39108(interfaceC7377.mo20252(i), abstractC1566, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6041 m39108(int i, AbstractC1566 abstractC1566, boolean z) {
        C6041 c6041 = new C6041(i, abstractC1566);
        if (z) {
            c6041.mo17866(EnumC1763.IMMUTABLE_TYPE);
        }
        return c6041;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C18959 m39118() {
        return this.f53443;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo39114(C18959 c18959) {
        this.f53443 = c18959;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004f A[PHI: r2
      0x004f: PHI (r2v7 l.ۛ֨ۗ) = (r2v6 l.ۛ֨ۗ), (r2v8 l.ۛ֨ۗ) binds: [B:34:0x0067, B:27:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16481 m39113(C2551 c2551, C18959 c18959, boolean z) {
        String name;
        C6041 c6041M44027;
        C18959 c189510 = this.f53443;
        if (c189510 != null) {
            if (c189510 == c18959) {
                f53442.mo13716(c18959, "Can't wrap instruction info itself: {}");
                return null;
            }
            int iM44039 = c189510.m44039();
            int i = 0;
            while (true) {
                if (i >= iM44039) {
                    i = -1;
                    break;
                }
                if (c189510.mo44035(i) == this) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                if (c18959.getType() == EnumC24203.MOVE && (this instanceof C6041) && (name = ((C6041) this).getName()) != null) {
                    AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                    abstractC16481Mo44035.getClass();
                    if (abstractC16481Mo44035 instanceof C6041) {
                        c6041M44027 = (C6041) abstractC16481Mo44035;
                        if (c6041M44027.getName() == null) {
                            c6041M44027.setName(name);
                        }
                    } else if ((abstractC16481Mo44035 instanceof C17227) && (c6041M44027 = ((C17227) abstractC16481Mo44035).m40461().m44027()) != null && c6041M44027.getName() == null) {
                        c6041M44027.setName(name);
                    }
                }
                C6041 c6041M44028 = c18959.m44027();
                AbstractC16481 abstractC16481M39110 = m39110(c18959);
                AbstractC16481 abstractC16481Mo44036 = c189510.mo44035(i);
                if (abstractC16481M39110.getType() == AbstractC1566.f5420) {
                    abstractC16481M39110.mo1130(abstractC16481Mo44036.getType());
                }
                c189510.mo44012(i, abstractC16481M39110);
                C9804.m25533(c2551, abstractC16481Mo44036);
                if (z) {
                    C9804.m25533(c2551, this);
                }
                if (c6041M44028 != null && !c18959.mo17865(EnumC1763.FORCE_ASSIGN_INLINE)) {
                    C9804.m25542(c2551, c18959);
                }
                return abstractC16481M39110;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC16481 m39110(C18959 c18959) {
        EnumC24203 type = c18959.getType();
        if (type == EnumC24203.CONST || type == EnumC24203.MOVE) {
            if (c18959.mo17865(EnumC1763.FORCE_ASSIGN_INLINE)) {
                C6041 c6041M44027 = c18959.m44027();
                c18959.mo17866(EnumC1763.WRAPPED);
                C17227 c17227 = new C17227(c18959);
                if (c6041M44027 != null) {
                    c17227.f976 = c6041M44027.getType();
                }
                return c17227;
            }
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
            c18959.mo17866(EnumC1763.DONT_GENERATE);
            return abstractC16481Mo44035;
        }
        return m39112(c18959);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17227 m39112(C18959 c18959) {
        C6041 c6041M44027 = c18959.m44027();
        c18959.mo17866(EnumC1763.WRAPPED);
        C17227 c17227 = new C17227(c18959);
        int i = C24687.f79872[c18959.getType().ordinal()];
        if (i == 1 || i == 2) {
            throw new C8597("Don't wrap MOVE or CONST insns: " + c18959);
        }
        if (i == 3) {
            AbstractC1566 abstractC1566 = AbstractC1566.f5417;
            c17227.f976 = abstractC1566;
            if (c6041M44027 != null) {
                c6041M44027.mo1130(abstractC1566);
            }
        } else if (i == 4) {
            AbstractC1566 abstractC1567 = AbstractC1566.f5427;
            c17227.f976 = abstractC1567;
            if (c6041M44027 != null) {
                c6041M44027.mo1130(abstractC1567);
                return c17227;
            }
        } else if (c6041M44027 != null) {
            c17227.f976 = c6041M44027.getType();
            return c17227;
        }
        return c17227;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39120() {
        if (mo39117()) {
            return true;
        }
        if (this instanceof C17227) {
            C18959 c18959M40461 = ((C17227) this).m40461();
            if (c18959M40461.getType() == EnumC24203.CONST) {
                return c18959M40461.mo44035(0).mo39117();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39119() {
        if (!(this instanceof C23195)) {
            return false;
        }
        C23195 c23195 = (C23195) this;
        return c23195.m52122() == 0 && C17359.equals(c23195.f976, AbstractC1566.f5436);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39121() {
        if (!(this instanceof C23195)) {
            return false;
        }
        C23195 c23195 = (C23195) this;
        return c23195.m52122() == 1 && C17359.equals(c23195.f976, AbstractC1566.f5436);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39116() {
        if (mo17865(EnumC1763.THIS)) {
            return true;
        }
        C18959 c18959M40461 = this instanceof C17227 ? ((C17227) this).m40461() : null;
        if (c18959M40461 == null || c18959M40461.getType() != EnumC24203.IGET) {
            return false;
        }
        return c18959M40461.mo44035(0).m39116();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39122() {
        if (this instanceof C23195) {
            return true;
        }
        return (this instanceof C17227) && ((C17227) this).m40461().m44025();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39115(C6041 c6041) {
        if (c6041 != null && (this instanceof C6041)) {
            return ((C6041) this).m17535((AbstractC16481) c6041);
        }
        return false;
    }
}
