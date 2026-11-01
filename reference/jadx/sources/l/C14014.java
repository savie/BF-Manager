package l;

/* JADX INFO: renamed from: l.ܰᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14014 extends AbstractC21013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f46054;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11897 f46055;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14014(AbstractActivityC12483 abstractActivityC12483, C11897 c11897, Runnable runnable) {
        super(abstractActivityC12483);
        this.f46055 = c11897;
        this.f46054 = runnable;
    }

    @Override // l.AbstractC21013
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo13875() {
        boolean z = false;
        String string = m47193(0).getText().toString();
        String string2 = m47193(1).getText().toString();
        AbstractC12068 abstractC12068 = m47197() >= 3 ? (AbstractC12068) m47193(2).getTag() : null;
        if (string2.length() > 1 && C12529.m31139(string2, "/", false)) {
            string2 = string2.substring(0, string2.length() - 1);
            C13465.m32967(string2, "substring(...)");
        }
        int length = string.length();
        C11897 c11897 = this.f46055;
        if (length > 0 && !string.equals(c11897.m29681())) {
            c11897.m29680(string);
            z = true;
        }
        if (string2.length() > 0 && !string2.equals(c11897.m29678())) {
            c11897.m29677(string2);
            z = true;
        }
        if (abstractC12068 != null) {
            C5546 c5546M29659 = c11897.m29659();
            C13465.m32962(c5546M29659);
            c11897.m29667(c5546M29659.m15294(abstractC12068));
            z = true;
        }
        if (z) {
            C23186.m51204();
            this.f46054.run();
        }
        return true;
    }
}
