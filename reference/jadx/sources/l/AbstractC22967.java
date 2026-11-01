package l;

/* JADX INFO: renamed from: l.᩺ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22967 extends AbstractC10329 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6966 f74647;

    /* JADX INFO: renamed from: ۙ */
    public abstract EnumC4143 mo5433(AbstractC23903 abstractC23903);

    /* JADX INFO: renamed from: ۙ */
    public AbstractC22967 mo30921(C19524 c19524) {
        return null;
    }

    public AbstractC22967(AbstractC16579 abstractC16579, EnumC11678 enumC11678, C6966 c6966, C21825 c21825, C21825 c21826, AbstractC11242 abstractC11242) {
        super(abstractC11242, abstractC16579, c21825, c21826, enumC11678);
        this.f74647 = c6966;
    }

    @Override // l.AbstractC10329
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo8017(C4603 c4603, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        if (abstractC23904.f77452 != EnumC10477.f35883) {
            return abstractC23904;
        }
        C14294 c14294 = (C14294) abstractC23904.mo10880();
        AbstractC16579 abstractC16579 = this.f35427;
        return (AbstractC23903) c14294.f46832.f65444.m52367(c14294.f46831.m48589(), abstractC16579, true).orElse(c14294);
    }
}
