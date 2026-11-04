package l;

/* JADX INFO: renamed from: l.ܺۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16614 extends AbstractC9901 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f53733;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C10620 f53734;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16614(C22010 c22010, C10620 c10620) {
        this.f53733 = c22010;
        EnumC13603 enumC13603 = EnumC13603.f43206;
        AbstractC11781 abstractC11781 = c10620.f68881;
        super(c22010, enumC13603, abstractC11781, "BadClassFileError");
        this.f38072 = abstractC11781.f38072;
        this.f53734 = c10620;
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        C22010 c22010 = this.f53733;
        C19991 c19991 = c22010.f71000;
        C23393 c23393M34514 = c22010.f71001.m34514();
        C10620 c10620 = this.f53734;
        C17007 c17007M45978 = c19991.m45978(enumC22229, c23393M34514, interfaceC5075, "cant.access", c10620.f68881, c10620.m49041());
        c17007M45978.m40092(EnumC6984.NON_DEFERRABLE);
        return c17007M45978;
    }
}
