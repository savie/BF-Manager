package l;

/* JADX INFO: renamed from: l.ۜۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6842 implements InterfaceC4779 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9296 f22752;

    public C6842(C9296 c9296) {
        this.f22752 = c9296;
    }

    @Override // l.InterfaceC4779
    public final boolean hasField(C7323 c7323) {
        return this.f22752.m24523(c7323);
    }

    @Override // l.InterfaceC4779
    public final InterfaceC4779 setField(C7323 c7323, Object obj) {
        this.f22752.m24526(c7323, obj);
        return this;
    }

    @Override // l.InterfaceC4779
    public final InterfaceC4779 addRepeatedField(C7323 c7323, Object obj) {
        this.f22752.m24520(c7323, obj);
        return this;
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final EnumC13553 mo14753() {
        return EnumC13553.EXTENSION_SET;
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final C3331 mo14751(C20485 c20485, C24478 c24478, int i) {
        return c20485.m46987(c24478, i);
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14756(AbstractC3660 abstractC3660, C24215 c24215, C7323 c7323, InterfaceC21013 interfaceC21013) {
        InterfaceC7588 builder;
        if (!c7323.mo8649()) {
            C9296 c9296 = this.f22752;
            if (c9296.m24523(c7323)) {
                Object objM24514 = c9296.m24514((InterfaceC2585) c7323);
                if (objM24514 instanceof InterfaceC7588) {
                    builder = (InterfaceC7588) objM24514;
                } else {
                    builder = ((InterfaceC18775) objM24514).toBuilder();
                    c9296.m24526(c7323, builder);
                }
                abstractC3660.mo11880(c7323.getNumber(), builder, c24215);
                return;
            }
            InterfaceC14299 interfaceC14299NewBuilderForType = interfaceC21013.newBuilderForType();
            abstractC3660.mo11880(c7323.getNumber(), interfaceC14299NewBuilderForType, c24215);
            setField(c7323, interfaceC14299NewBuilderForType);
            return;
        }
        InterfaceC14299 interfaceC14299NewBuilderForType2 = interfaceC21013.newBuilderForType();
        abstractC3660.mo11880(c7323.getNumber(), interfaceC14299NewBuilderForType2, c24215);
        addRepeatedField(c7323, interfaceC14299NewBuilderForType2.buildPartial());
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final void mo14755(AbstractC3660 abstractC3660, C24215 c24215, C7323 c7323, InterfaceC21013 interfaceC21013) {
        InterfaceC7588 builder;
        if (!c7323.mo8649()) {
            C9296 c9296 = this.f22752;
            if (c9296.m24523(c7323)) {
                Object objM24514 = c9296.m24514((InterfaceC2585) c7323);
                if (objM24514 instanceof InterfaceC7588) {
                    builder = (InterfaceC7588) objM24514;
                } else {
                    builder = ((InterfaceC18775) objM24514).toBuilder();
                    c9296.m24526(c7323, builder);
                }
                abstractC3660.mo11881(builder, c24215);
                return;
            }
            InterfaceC14299 interfaceC14299NewBuilderForType = interfaceC21013.newBuilderForType();
            abstractC3660.mo11881(interfaceC14299NewBuilderForType, c24215);
            setField(c7323, interfaceC14299NewBuilderForType);
            return;
        }
        InterfaceC14299 interfaceC14299NewBuilderForType2 = interfaceC21013.newBuilderForType();
        abstractC3660.mo11881(interfaceC14299NewBuilderForType2, c24215);
        addRepeatedField(c7323, interfaceC14299NewBuilderForType2.buildPartial());
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC21013 mo14754(AbstractC17084 abstractC17084, C24215 c24215, C7323 c7323, InterfaceC21013 interfaceC21013) {
        InterfaceC21013 interfaceC21014;
        InterfaceC14299 interfaceC14299NewBuilderForType = interfaceC21013.newBuilderForType();
        if (!c7323.mo8649() && (interfaceC21014 = (InterfaceC21013) this.f22752.m24524(c7323)) != null) {
            interfaceC14299NewBuilderForType.mergeFrom(interfaceC21014);
        }
        interfaceC14299NewBuilderForType.mo4453mergeFrom(abstractC17084, c24215);
        return interfaceC14299NewBuilderForType.buildPartial();
    }

    @Override // l.InterfaceC4779
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4186 mo14752(C7323 c7323) {
        if (c7323.m20089()) {
            return EnumC4186.f15309;
        }
        return EnumC4186.f15311;
    }
}
