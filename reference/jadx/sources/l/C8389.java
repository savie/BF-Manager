package l;

/* JADX INFO: renamed from: l.۠᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8389 implements InterfaceC10506 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3967 f29130;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f29131 = true;

    public C8389(AbstractC3967 abstractC3967) {
        this.f29130 = abstractC3967;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private InterfaceC22500 m22023(C19741 c19741) {
        if (!this.f29131) {
            return null;
        }
        try {
            return this.f29130.getFieldBuilder(c19741);
        } catch (UnsupportedOperationException unused) {
            this.f29131 = false;
            return null;
        }
    }

    @Override // l.InterfaceC10506
    public final boolean hasField(C19741 c19741) {
        return this.f29130.hasField(c19741);
    }

    @Override // l.InterfaceC10506
    public final InterfaceC10506 setField(C19741 c19741, Object obj) {
        boolean zMo23408 = c19741.mo23408();
        AbstractC3967 abstractC3967 = this.f29130;
        if (!zMo23408 && (obj instanceof InterfaceC6977)) {
            if (obj != m22023(c19741)) {
                abstractC3967.setField(c19741, ((InterfaceC6977) obj).buildPartial());
            }
            return this;
        }
        abstractC3967.setField(c19741, obj);
        return this;
    }

    @Override // l.InterfaceC10506
    public final InterfaceC10506 addRepeatedField(C19741 c19741, Object obj) {
        if (obj instanceof InterfaceC6977) {
            obj = ((InterfaceC6977) obj).buildPartial();
        }
        this.f29130.addRepeatedField(c19741, obj);
        return this;
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC9095 mo22027() {
        return EnumC9095.MESSAGE;
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3511 mo22025(C4818 c4818, C2806 c2806, int i) {
        return c4818.m13399(c2806, i);
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1332 mo22024(AbstractC23725 abstractC23725, C2701 c2701, C19741 c19741, InterfaceC1332 interfaceC1332) {
        InterfaceC22500 interfaceC22500NewBuilderForField;
        InterfaceC1332 interfaceC1333;
        AbstractC3967 abstractC3967 = this.f29130;
        if (interfaceC1332 != null) {
            interfaceC22500NewBuilderForField = interfaceC1332.newBuilderForType();
        } else {
            interfaceC22500NewBuilderForField = abstractC3967.newBuilderForField(c19741);
        }
        if (!c19741.mo23408() && (interfaceC1333 = (InterfaceC1332) abstractC3967.getField(c19741)) != null) {
            interfaceC22500NewBuilderForField.mergeFrom(interfaceC1333);
        }
        interfaceC22500NewBuilderForField.mo11457mergeFrom(abstractC23725, c2701);
        return interfaceC22500NewBuilderForField.buildPartial();
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo22029(AbstractC3262 abstractC3262, C2701 c2701, C19741 c19741, InterfaceC1332 interfaceC1332) {
        InterfaceC22500 interfaceC22500M22022;
        if (!c19741.mo23408()) {
            AbstractC3967 abstractC3967 = this.f29130;
            if (abstractC3967.hasField(c19741)) {
                InterfaceC22500 interfaceC22500M22023 = m22023(c19741);
                if (interfaceC22500M22023 != null) {
                    abstractC3262.mo6026(c19741.getNumber(), interfaceC22500M22023, c2701);
                    return;
                } else {
                    interfaceC22500M22022 = m22022(c19741, interfaceC1332);
                    interfaceC22500M22022.mergeFrom((InterfaceC1332) abstractC3967.getField(c19741));
                }
            } else {
                interfaceC22500M22022 = m22022(c19741, interfaceC1332);
            }
            abstractC3262.mo6026(c19741.getNumber(), interfaceC22500M22022, c2701);
            setField(c19741, interfaceC22500M22022.buildPartial());
            return;
        }
        InterfaceC22500 interfaceC22500M22024 = m22022(c19741, interfaceC1332);
        abstractC3262.mo6026(c19741.getNumber(), interfaceC22500M22024, c2701);
        addRepeatedField(c19741, interfaceC22500M22024.buildPartial());
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22028(AbstractC3262 abstractC3262, C2701 c2701, C19741 c19741, InterfaceC1332 interfaceC1332) {
        InterfaceC22500 interfaceC22500M22022;
        if (!c19741.mo23408()) {
            AbstractC3967 abstractC3967 = this.f29130;
            if (abstractC3967.hasField(c19741)) {
                InterfaceC22500 interfaceC22500M22023 = m22023(c19741);
                if (interfaceC22500M22023 != null) {
                    abstractC3262.mo6027(interfaceC22500M22023, c2701);
                    return;
                } else {
                    interfaceC22500M22022 = m22022(c19741, interfaceC1332);
                    interfaceC22500M22022.mergeFrom((InterfaceC1332) abstractC3967.getField(c19741));
                }
            } else {
                interfaceC22500M22022 = m22022(c19741, interfaceC1332);
            }
            abstractC3262.mo6027(interfaceC22500M22022, c2701);
            setField(c19741, interfaceC22500M22022.buildPartial());
            return;
        }
        InterfaceC22500 interfaceC22500M22024 = m22022(c19741, interfaceC1332);
        abstractC3262.mo6027(interfaceC22500M22024, c2701);
        addRepeatedField(c19741, interfaceC22500M22024.buildPartial());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC22500 m22022(C19741 c19741, InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 != null) {
            return interfaceC1332.newBuilderForType();
        }
        return this.f29130.newBuilderForField(c19741);
    }

    @Override // l.InterfaceC10506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5214 mo22026(C19741 c19741) {
        if (c19741.m44898()) {
            return EnumC5214.f18062;
        }
        if (!c19741.mo23408() && (this.f29130 instanceof AbstractC0584)) {
            return EnumC5214.f18063;
        }
        return EnumC5214.f18060;
    }
}
