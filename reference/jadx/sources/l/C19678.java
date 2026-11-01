package l;

/* JADX INFO: renamed from: l.᩵᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19678 implements InterfaceC10506 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18224 f63174;

    public C19678(C18224 c18224) {
        this.f63174 = c18224;
    }

    @Override // l.InterfaceC10506
    public final boolean hasField(C19741 c19741) {
        return this.f63174.m42368(c19741);
    }

    @Override // l.InterfaceC10506
    public final InterfaceC10506 setField(C19741 c19741, Object obj) {
        this.f63174.m42371(c19741, obj);
        return this;
    }

    @Override // l.InterfaceC10506
    public final InterfaceC10506 addRepeatedField(C19741 c19741, Object obj) {
        this.f63174.m42366(c19741, obj);
        return this;
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ */
    public final EnumC9095 mo22027() {
        return EnumC9095.EXTENSION_SET;
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ */
    public final C3511 mo22025(C4818 c4818, C2806 c2806, int i) {
        return c4818.m13399(c2806, i);
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ܰ */
    public final void mo22029(AbstractC3262 abstractC3262, C2701 c2701, C19741 c19741, InterfaceC1332 interfaceC1332) {
        InterfaceC6977 builder;
        if (!c19741.mo23408()) {
            C18224 c18224 = this.f63174;
            if (c18224.m42368(c19741)) {
                Object objM42359 = c18224.m42359((InterfaceC18930) c19741);
                if (objM42359 instanceof InterfaceC6977) {
                    builder = (InterfaceC6977) objM42359;
                } else {
                    builder = ((InterfaceC23206) objM42359).toBuilder();
                    c18224.m42371(c19741, builder);
                }
                abstractC3262.mo6026(c19741.getNumber(), builder, c2701);
                return;
            }
            InterfaceC22500 interfaceC22500NewBuilderForType = interfaceC1332.newBuilderForType();
            abstractC3262.mo6026(c19741.getNumber(), interfaceC22500NewBuilderForType, c2701);
            setField(c19741, interfaceC22500NewBuilderForType);
            return;
        }
        InterfaceC22500 interfaceC22500NewBuilderForType2 = interfaceC1332.newBuilderForType();
        abstractC3262.mo6026(c19741.getNumber(), interfaceC22500NewBuilderForType2, c2701);
        addRepeatedField(c19741, interfaceC22500NewBuilderForType2.buildPartial());
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ */
    public final void mo22028(AbstractC3262 abstractC3262, C2701 c2701, C19741 c19741, InterfaceC1332 interfaceC1332) {
        InterfaceC6977 builder;
        if (!c19741.mo23408()) {
            C18224 c18224 = this.f63174;
            if (c18224.m42368(c19741)) {
                Object objM42359 = c18224.m42359((InterfaceC18930) c19741);
                if (objM42359 instanceof InterfaceC6977) {
                    builder = (InterfaceC6977) objM42359;
                } else {
                    builder = ((InterfaceC23206) objM42359).toBuilder();
                    c18224.m42371(c19741, builder);
                }
                abstractC3262.mo6027(builder, c2701);
                return;
            }
            InterfaceC22500 interfaceC22500NewBuilderForType = interfaceC1332.newBuilderForType();
            abstractC3262.mo6027(interfaceC22500NewBuilderForType, c2701);
            setField(c19741, interfaceC22500NewBuilderForType);
            return;
        }
        InterfaceC22500 interfaceC22500NewBuilderForType2 = interfaceC1332.newBuilderForType();
        abstractC3262.mo6027(interfaceC22500NewBuilderForType2, c2701);
        addRepeatedField(c19741, interfaceC22500NewBuilderForType2.buildPartial());
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC1332 mo22024(AbstractC23725 abstractC23725, C2701 c2701, C19741 c19741, InterfaceC1332 interfaceC1332) {
        InterfaceC1332 interfaceC1333;
        InterfaceC22500 interfaceC22500NewBuilderForType = interfaceC1332.newBuilderForType();
        if (!c19741.mo23408() && (interfaceC1333 = (InterfaceC1332) this.f63174.m42369(c19741)) != null) {
            interfaceC22500NewBuilderForType.mergeFrom(interfaceC1333);
        }
        interfaceC22500NewBuilderForType.mo11457mergeFrom(abstractC23725, c2701);
        return interfaceC22500NewBuilderForType.buildPartial();
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ */
    public final EnumC5214 mo22026(C19741 c19741) {
        if (c19741.m44898()) {
            return EnumC5214.f18062;
        }
        return EnumC5214.f18060;
    }
}
