package l;

/* JADX INFO: renamed from: l.۬᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C13362 extends AbstractC17449 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f44286;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC165710 = (AbstractC16579) obj;
        if (abstractC165710.m39001(EnumC6617.ERROR) || abstractC16579.m39001(EnumC6617.NONE)) {
            return Boolean.TRUE;
        }
        switch (C14068.f46214[abstractC16579.mo1933().ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC165710.mo9484());
            case 10:
                return Boolean.valueOf(abstractC165710.m39001(EnumC6617.BOOLEAN));
            case 11:
                return Boolean.FALSE;
            case 12:
            default:
                throw new AssertionError();
            case 13:
                return Boolean.valueOf(this.f44286.m52413(abstractC16579, abstractC165710, true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        boolean zM32861;
        boolean zM52351;
        boolean zM52352;
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        C23800 c23800 = this.f44286;
        C10391 c10391 = c23800.f76946;
        if (abstractC16579.m39001(EnumC6617.ERROR) || abstractC16579.m39001(EnumC6617.BOT)) {
            return Boolean.TRUE;
        }
        if (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            if (c23800.m52412(c0309, abstractC16579.mo18112(), c10391)) {
                ((C10391) c23800.f76959.f70876).mo21748(EnumC0597.UNCHECKED);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c0309.mo12731() || abstractC16579.mo12731()) {
            if (!c0309.mo12731()) {
                zM32861 = m32861((C0309) abstractC16579, c0309, true);
            } else {
                zM32861 = m32861(c0309, abstractC16579, false);
            }
            return Boolean.valueOf(zM32861);
        }
        EnumC6617 enumC6617 = EnumC6617.CLASS;
        if (abstractC16579.m39001(enumC6617) || abstractC16579.m39001(EnumC6617.ARRAY)) {
            boolean zM52413 = c23800.m52413(c23800.m52402(c0309), c23800.m52402(abstractC16579), true);
            if (zM52413 || c23800.m52413(c23800.m52402(abstractC16579), c23800.m52402(c0309), true)) {
                if (!zM52413 && abstractC16579.m39001(EnumC6617.ARRAY)) {
                    if (!c23800.m52436(abstractC16579)) {
                        ((C10391) c23800.f76959.f70876).mo21748(EnumC0597.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                if (abstractC16579.mo1936()) {
                    return Boolean.TRUE;
                }
                if (c0309.mo1936()) {
                    if (!c23800.m52405(abstractC16579)) {
                        ((C10391) c23800.f76959.f70876).mo21748(EnumC0597.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                AbstractC16579 abstractC165710 = zM52413 ? c0309 : abstractC16579;
                if (zM52413) {
                    c0309 = abstractC16579;
                }
                AbstractC16579 abstractC16579M52334 = C23800.m52334(c23800, abstractC165710, true, false);
                AbstractC16579 abstractC16579M52335 = C23800.m52334(c23800, abstractC165710, false, false);
                AbstractC16579 abstractC16579M52336 = C23800.m52334(c23800, (AbstractC16579) c0309, true, false);
                AbstractC16579 abstractC16579M52420 = c23800.m52420(C23800.m52334(c23800, (AbstractC16579) c0309, false, false), abstractC16579M52335.f53222);
                AbstractC16579 abstractC16579M52421 = abstractC16579M52420 == null ? null : c23800.m52420(abstractC16579M52336, abstractC16579M52334.f53222);
                if (abstractC16579M52421 == null) {
                    abstractC16579M52334 = C23800.m52334(c23800, abstractC165710, true, true);
                    abstractC16579M52335 = C23800.m52334(c23800, abstractC165710, false, true);
                    AbstractC16579 abstractC16579M52337 = C23800.m52334(c23800, (AbstractC16579) c0309, true, true);
                    abstractC16579M52420 = c23800.m52420(C23800.m52334(c23800, (AbstractC16579) c0309, false, true), abstractC16579M52335.f53222);
                    abstractC16579M52421 = abstractC16579M52420 == null ? null : c23800.m52420(abstractC16579M52337, abstractC16579M52334.f53222);
                }
                if (abstractC16579M52421 != null) {
                    AbstractC0618 abstractC0618 = abstractC165710.f53222;
                    if (abstractC0618 != abstractC16579M52421.f53222 || abstractC0618 != abstractC16579M52420.f53222) {
                        C6171.m17174(abstractC165710.f53222 + " != " + abstractC16579M52421.f53222 + " != " + abstractC16579M52420.f53222);
                        throw null;
                    }
                    if (!c23800.m52414(abstractC16579M52334.mo1943(), abstractC16579M52421.mo1943()) && !c23800.m52414(abstractC16579M52334.mo1943(), abstractC16579M52420.mo1943()) && !c23800.m52414(abstractC16579M52335.mo1943(), abstractC16579M52421.mo1943()) && !c23800.m52414(abstractC16579M52335.mo1943(), abstractC16579M52420.mo1943())) {
                        if (!zM52413 ? c23800.m52344(c0309, abstractC165710) : c23800.m52344(abstractC165710, c0309)) {
                            ((C10391) c23800.f76959.f70876).mo21748(EnumC0597.UNCHECKED);
                        }
                        return Boolean.TRUE;
                    }
                }
                if (c23800.m52436(abstractC16579)) {
                    return Boolean.valueOf(c23800.m52400(abstractC165710, c0309, c10391));
                }
                return Boolean.valueOf(c23800.m52400(abstractC165710, c0309, (C10391) c23800.f76959.f70876));
            }
            if (abstractC16579.m39001(enumC6617)) {
                if ((abstractC16579.f53222.mo20276() & 512) != 0) {
                    if ((c0309.f53222.mo20276() & 16) == 0) {
                        zM52352 = C23800.m52341(c23800, c0309, abstractC16579, (C10391) c23800.f76959.f70876);
                    } else {
                        zM52352 = C23800.m52351(c23800, c0309, abstractC16579, (C10391) c23800.f76959.f70876);
                    }
                    return Boolean.valueOf(zM52352);
                }
                if ((c0309.f53222.mo20276() & 512) != 0) {
                    if ((abstractC16579.f53222.mo20276() & 16) == 0) {
                        zM52351 = C23800.m52341(c23800, c0309, abstractC16579, (C10391) c23800.f76959.f70876);
                    } else {
                        zM52351 = C23800.m52351(c23800, c0309, abstractC16579, (C10391) c23800.f76959.f70876);
                    }
                    return Boolean.valueOf(zM52351);
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        C23800 c23800 = this.f44286;
        return Boolean.valueOf(c23800.m52412(c23800.m52415(c0350), (AbstractC16579) obj, (C10391) c23800.f76959.f70876));
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4812(C5954 c5954, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        C23800 c23800 = this.f44286;
        if (i == 1) {
            if (c23800.m52416(c8777).mo9481() || c23800.m52416(abstractC16579).mo9481()) {
                return Boolean.valueOf(c23800.m52416(c8777).m39001(c23800.m52416(abstractC16579).mo1933()));
            }
            return (Boolean) c23800.m52416(c8777).mo1928(this, c23800.m52416(abstractC16579));
        }
        if (i == 2) {
            return Boolean.valueOf(c23800.m52413((AbstractC16579) c8777, abstractC16579, true));
        }
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c23800.m52412(abstractC16579, c8777, c23800.f76946)) {
            ((C10391) c23800.f76959.f70876).mo21748(EnumC0597.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        C23800 c23800 = this.f44286;
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(c23800.m52412(c22929.mo18112(), abstractC16579, (C10391) c23800.f76959.f70876));
        }
        if (c23800.m52413((AbstractC16579) c22929, abstractC16579, true)) {
            return Boolean.TRUE;
        }
        if (c23800.m52412(c22929.mo18112(), abstractC16579, c23800.f76946)) {
            ((C10391) c23800.f76959.f70876).mo21748(EnumC0597.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32861(C0309 c0309, AbstractC16579 abstractC16579, boolean z) {
        C23800 c23800 = this.f44286;
        C10391 c10391 = c23800.f76946;
        for (AbstractC16579 abstractC165710 : c23800.m52356(c0309)) {
            c10391.m26289();
            if (z) {
                if (!c23800.m52412(abstractC16579, abstractC165710, c10391)) {
                    return false;
                }
            } else if (!c23800.m52412(abstractC165710, abstractC16579, c10391)) {
                return false;
            }
        }
        EnumC0597 enumC0597 = EnumC0597.UNCHECKED;
        if (!c10391.m26290(enumC0597)) {
            return true;
        }
        ((C10391) c23800.f76959.f70876).mo21748(enumC0597);
        return true;
    }

    public C13362(C23800 c23800) {
        this.f44286 = c23800;
    }
}
