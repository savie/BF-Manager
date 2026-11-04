package l;

/* JADX INFO: renamed from: l.۠ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8333 implements InterfaceC4779 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0479 f27319;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27320 = true;

    public C8333(AbstractC0479 abstractC0479) {
        this.f27319 = abstractC0479;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private InterfaceC14299 m22443(C7323 c7323) {
        if (!this.f27320) {
            return null;
        }
        try {
            return this.f27319.getFieldBuilder(c7323);
        } catch (UnsupportedOperationException unused) {
            this.f27320 = false;
            return null;
        }
    }

    @Override // l.InterfaceC4779
    public final boolean hasField(C7323 c7323) {
        return this.f27319.hasField(c7323);
    }

    @Override // l.InterfaceC4779
    public final InterfaceC4779 setField(C7323 c7323, Object obj) {
        boolean zMo8649 = c7323.mo8649();
        AbstractC0479 abstractC0479 = this.f27319;
        if (!zMo8649 && (obj instanceof InterfaceC7588)) {
            if (obj != m22443(c7323)) {
                abstractC0479.setField(c7323, ((InterfaceC7588) obj).buildPartial());
            }
            return this;
        }
        abstractC0479.setField(c7323, obj);
        return this;
    }

    @Override // l.InterfaceC4779
    public final InterfaceC4779 addRepeatedField(C7323 c7323, Object obj) {
        if (obj instanceof InterfaceC7588) {
            obj = ((InterfaceC7588) obj).buildPartial();
        }
        this.f27319.addRepeatedField(c7323, obj);
        return this;
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final EnumC13553 mo14753() {
        return EnumC13553.MESSAGE;
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final C3331 mo14751(C20485 c20485, C24478 c24478, int i) {
        return c20485.m46987(c24478, i);
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC21013 mo14754(AbstractC17084 abstractC17084, C24215 c24215, C7323 c7323, InterfaceC21013 interfaceC21013) {
        InterfaceC14299 interfaceC14299NewBuilderForField;
        InterfaceC21013 interfaceC21014;
        AbstractC0479 abstractC0479 = this.f27319;
        if (interfaceC21013 != null) {
            interfaceC14299NewBuilderForField = interfaceC21013.newBuilderForType();
        } else {
            interfaceC14299NewBuilderForField = abstractC0479.newBuilderForField(c7323);
        }
        if (!c7323.mo8649() && (interfaceC21014 = (InterfaceC21013) abstractC0479.getField(c7323)) != null) {
            interfaceC14299NewBuilderForField.mergeFrom(interfaceC21014);
        }
        interfaceC14299NewBuilderForField.mo4453mergeFrom(abstractC17084, c24215);
        return interfaceC14299NewBuilderForField.buildPartial();
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14756(AbstractC3660 abstractC3660, C24215 c24215, C7323 c7323, InterfaceC21013 interfaceC21013) {
        InterfaceC14299 interfaceC14299M22442;
        if (!c7323.mo8649()) {
            AbstractC0479 abstractC0479 = this.f27319;
            if (abstractC0479.hasField(c7323)) {
                InterfaceC14299 interfaceC14299M22443 = m22443(c7323);
                if (interfaceC14299M22443 != null) {
                    abstractC3660.mo11880(c7323.getNumber(), interfaceC14299M22443, c24215);
                    return;
                } else {
                    interfaceC14299M22442 = m22442(c7323, interfaceC21013);
                    interfaceC14299M22442.mergeFrom((InterfaceC21013) abstractC0479.getField(c7323));
                }
            } else {
                interfaceC14299M22442 = m22442(c7323, interfaceC21013);
            }
            abstractC3660.mo11880(c7323.getNumber(), interfaceC14299M22442, c24215);
            setField(c7323, interfaceC14299M22442.buildPartial());
            return;
        }
        InterfaceC14299 interfaceC14299M22444 = m22442(c7323, interfaceC21013);
        abstractC3660.mo11880(c7323.getNumber(), interfaceC14299M22444, c24215);
        addRepeatedField(c7323, interfaceC14299M22444.buildPartial());
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final void mo14755(AbstractC3660 abstractC3660, C24215 c24215, C7323 c7323, InterfaceC21013 interfaceC21013) {
        InterfaceC14299 interfaceC14299M22442;
        if (!c7323.mo8649()) {
            AbstractC0479 abstractC0479 = this.f27319;
            if (abstractC0479.hasField(c7323)) {
                InterfaceC14299 interfaceC14299M22443 = m22443(c7323);
                if (interfaceC14299M22443 != null) {
                    abstractC3660.mo11881(interfaceC14299M22443, c24215);
                    return;
                } else {
                    interfaceC14299M22442 = m22442(c7323, interfaceC21013);
                    interfaceC14299M22442.mergeFrom((InterfaceC21013) abstractC0479.getField(c7323));
                }
            } else {
                interfaceC14299M22442 = m22442(c7323, interfaceC21013);
            }
            abstractC3660.mo11881(interfaceC14299M22442, c24215);
            setField(c7323, interfaceC14299M22442.buildPartial());
            return;
        }
        InterfaceC14299 interfaceC14299M22444 = m22442(c7323, interfaceC21013);
        abstractC3660.mo11881(interfaceC14299M22444, c24215);
        addRepeatedField(c7323, interfaceC14299M22444.buildPartial());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC14299 m22442(C7323 c7323, InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 != null) {
            return interfaceC21013.newBuilderForType();
        }
        return this.f27319.newBuilderForField(c7323);
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4186 mo14752(C7323 c7323) {
        if (c7323.m20089()) {
            return EnumC4186.f15309;
        }
        if (!c7323.mo8649() && (this.f27319 instanceof AbstractC15001)) {
            return EnumC4186.f15312;
        }
        return EnumC4186.f15311;
    }
}
