package l;

/* JADX INFO: renamed from: l.ܰᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C14786 extends AbstractC5313 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f48396;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22665 = (AbstractC22664) obj;
        if (abstractC22665.m51067(EnumC21172.ERROR) || abstractC22664.m51067(EnumC21172.NONE)) {
            return Boolean.TRUE;
        }
        switch (C3600.f12307[abstractC22664.mo9097().ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC22665.mo40455());
            case 10:
                return Boolean.valueOf(abstractC22665.m51067(EnumC21172.BOOLEAN));
            case 11:
                return Boolean.FALSE;
            case 12:
            default:
                throw new AssertionError();
            case 13:
                return Boolean.valueOf(this.f48396.m55131(abstractC22664, abstractC22665, true));
        }
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        C24705 c24705 = this.f48396;
        if (i == 1) {
            if (c24705.m55120(c2832).mo40452() || c24705.m55120(abstractC22664).mo40452()) {
                return Boolean.valueOf(c24705.m55120(c2832).m51067(c24705.m55120(abstractC22664).mo9097()));
            }
            return (Boolean) c24705.m55120(c2832).mo9324(this, c24705.m55120(abstractC22664));
        }
        if (i == 2) {
            return Boolean.valueOf(c24705.m55131((AbstractC22664) c2832, abstractC22664, true));
        }
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c24705.m55130(abstractC22664, c2832, c24705.f79958)) {
            ((C1083) c24705.f79935.f48335).mo4085(EnumC19876.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩻֨᩺] */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ۤ֡᩺, l.᩸۟᩺] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v6, types: [l.᩸۟᩺] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.᩸۟᩺] */
    /* JADX WARN: Type inference failed for: r2v13 */
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
    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        boolean zM35630;
        boolean zM55082;
        boolean zM55083;
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        ?? r0 = this.f48396;
        C1083 c1083 = r0.f79958;
        if (abstractC22664.m51067(EnumC21172.ERROR) || abstractC22664.m51067(EnumC21172.BOT)) {
            return Boolean.TRUE;
        }
        if (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            if (r0.m55130(c10510, abstractC22664.mo19992(), c1083)) {
                ((C1083) r0.f79935.f48335).mo4085(EnumC19876.UNCHECKED);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c10510.mo18914() || abstractC22664.mo18914()) {
            if (!c10510.mo18914()) {
                zM35630 = m35630((C10510) abstractC22664, c10510, true);
            } else {
                zM35630 = m35630(c10510, abstractC22664, false);
            }
            return Boolean.valueOf(zM35630);
        }
        EnumC21172 enumC21172 = EnumC21172.CLASS;
        if (abstractC22664.m51067(enumC21172) || abstractC22664.m51067(EnumC21172.ARRAY)) {
            boolean zM55131 = r0.m55131(r0.m55132(c10510), r0.m55132(abstractC22664), true);
            if (zM55131 || r0.m55131(r0.m55132(abstractC22664), r0.m55132(c10510), true)) {
                if (!zM55131 && abstractC22664.m51067(EnumC21172.ARRAY)) {
                    if (!r0.m55151(abstractC22664)) {
                        ((C1083) r0.f79935.f48335).mo4085(EnumC19876.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                if (abstractC22664.mo9328()) {
                    return Boolean.TRUE;
                }
                if (c10510.mo9328()) {
                    if (!r0.m55133(abstractC22664)) {
                        ((C1083) r0.f79935.f48335).mo4085(EnumC19876.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                ?? r2 = zM55131 ? c10510 : abstractC22664;
                if (zM55131) {
                    c10510 = abstractC22664;
                }
                AbstractC22664 abstractC22664M55065 = C24705.m55065((C24705) r0, (AbstractC22664) r2, true, false);
                AbstractC22664 abstractC22664M55066 = C24705.m55065((C24705) r0, (AbstractC22664) r2, false, false);
                AbstractC22664 abstractC22664M55067 = C24705.m55065((C24705) r0, (AbstractC22664) c10510, true, false);
                AbstractC22664 abstractC22664M55160 = r0.m55160(C24705.m55065((C24705) r0, (AbstractC22664) c10510, false, false), abstractC22664M55066.f73596);
                AbstractC22664 abstractC22664M55161 = abstractC22664M55160 == null ? null : r0.m55160(abstractC22664M55067, abstractC22664M55065.f73596);
                if (abstractC22664M55161 == null) {
                    abstractC22664M55065 = C24705.m55065((C24705) r0, (AbstractC22664) r2, true, true);
                    abstractC22664M55066 = C24705.m55065((C24705) r0, (AbstractC22664) r2, false, true);
                    AbstractC22664 abstractC22664M55068 = C24705.m55065((C24705) r0, (AbstractC22664) c10510, true, true);
                    abstractC22664M55160 = r0.m55160(C24705.m55065((C24705) r0, (AbstractC22664) c10510, false, true), abstractC22664M55066.f73596);
                    abstractC22664M55161 = abstractC22664M55160 == null ? null : r0.m55160(abstractC22664M55068, abstractC22664M55065.f73596);
                }
                if (abstractC22664M55161 != null) {
                    AbstractC22970 abstractC22970 = r2.f73596;
                    if (abstractC22970 != abstractC22664M55161.f73596 || abstractC22970 != abstractC22664M55160.f73596) {
                        C11972.m30024(r2.f73596 + " != " + abstractC22664M55161.f73596 + " != " + abstractC22664M55160.f73596);
                        throw null;
                    }
                    if (!r0.m55129(abstractC22664M55065.mo9323(), abstractC22664M55161.mo9323()) && !r0.m55129(abstractC22664M55065.mo9323(), abstractC22664M55160.mo9323()) && !r0.m55129(abstractC22664M55066.mo9323(), abstractC22664M55161.mo9323()) && !r0.m55129(abstractC22664M55066.mo9323(), abstractC22664M55160.mo9323())) {
                        if (!zM55131 ? r0.m55076(c10510, r2) : r0.m55076(r2, c10510)) {
                            ((C1083) r0.f79935.f48335).mo4085(EnumC19876.UNCHECKED);
                        }
                        return Boolean.TRUE;
                    }
                }
                if (r0.m55151(abstractC22664)) {
                    return Boolean.valueOf(r0.m55150(r2, c10510, c1083));
                }
                return Boolean.valueOf(r0.m55150(r2, c10510, (C1083) r0.f79935.f48335));
            }
            if (abstractC22664.m51067(enumC21172)) {
                if ((abstractC22664.f73596.mo29591() & 512) != 0) {
                    if ((c10510.f73596.mo29591() & 16) == 0) {
                        zM55083 = C24705.m55071((C24705) r0, (C10510) c10510, abstractC22664, (C1083) r0.f79935.f48335);
                    } else {
                        zM55083 = C24705.m55082(r0, c10510, abstractC22664, (C1083) r0.f79935.f48335);
                    }
                    return Boolean.valueOf(zM55083);
                }
                if ((c10510.f73596.mo29591() & 512) != 0) {
                    if ((abstractC22664.f73596.mo29591() & 16) == 0) {
                        zM55082 = C24705.m55071((C24705) r0, (C10510) c10510, abstractC22664, (C1083) r0.f79935.f48335);
                    } else {
                        zM55082 = C24705.m55082(r0, c10510, abstractC22664, (C1083) r0.f79935.f48335);
                    }
                    return Boolean.valueOf(zM55082);
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        C24705 c24705 = this.f48396;
        return Boolean.valueOf(c24705.m55130(c24705.m55123(c10729), (AbstractC22664) obj, (C1083) c24705.f79935.f48335));
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo10772(C12748 c12748, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        C24705 c24705 = this.f48396;
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(c24705.m55130(c17969.mo19992(), abstractC22664, (C1083) c24705.f79935.f48335));
        }
        if (c24705.m55131((AbstractC22664) c17969, abstractC22664, true)) {
            return Boolean.TRUE;
        }
        if (c24705.m55130(c17969.mo19992(), abstractC22664, c24705.f79958)) {
            ((C1083) c24705.f79935.f48335).mo4085(EnumC19876.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35630(C10510 c10510, AbstractC22664 abstractC22664, boolean z) {
        C24705 c24705 = this.f48396;
        C1083 c1083 = c24705.f79958;
        for (AbstractC22664 abstractC22665 : c24705.m55135(c10510)) {
            c1083.m4080();
            if (z) {
                if (!c24705.m55130(abstractC22664, abstractC22665, c1083)) {
                    return false;
                }
            } else if (!c24705.m55130(abstractC22665, abstractC22664, c1083)) {
                return false;
            }
        }
        EnumC19876 enumC19876 = EnumC19876.UNCHECKED;
        if (!c1083.m4081(enumC19876)) {
            return true;
        }
        ((C1083) c24705.f79935.f48335).mo4085(enumC19876);
        return true;
    }

    public C14786(C24705 c24705) {
        this.f48396 = c24705;
    }
}
