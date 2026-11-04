package l;

/* JADX INFO: renamed from: l.ۖۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2618 extends AbstractC11962 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f8403;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14769 f8404;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f8405;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2618(C17929 c17929, EnumC10712 enumC10712, C5997 c5997) {
        super(c17929, enumC10712, c5997);
        this.f8405 = c17929;
        this.f8404 = C14769.m35543();
    }

    @Override // l.AbstractC11962
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8759(C14769 c14769) {
        this.f8404 = this.f8404.m35549(c14769);
        boolean z = this.f8403;
        if (z) {
            return;
        }
        this.f8403 = true;
        while (this.f8404.m35550()) {
            try {
                C14769 c147610 = this.f8404;
                C3168 c3168 = (C3168) c147610.f48335;
                this.f8404 = c147610.f48336;
                super.mo8759(C14769.of((Object) c3168));
            } catch (Throwable th) {
                this.f8403 = z;
                throw th;
            }
        }
        this.f8403 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8758(C24550 c24550, C3168 c3168) {
        C10510 c10510 = (C10510) c24550.f38067;
        C17929 c17929 = this.f8405;
        C5816 c5816 = new C5816(262160L, c17929.f58729.f49836, c24550.f38067, c24550);
        c5816.f19997 = 0;
        Object obj = c3168.f10272;
        ((C7768) obj).f25562.mo7481(c5816);
        if ((c24550.f38071 & 512) == 0 && c10510.f33442.m51067(EnumC21172.CLASS)) {
            C5816 c5817 = new C5816(262160L, c17929.f58729.f49851, c10510.f33442, c24550);
            c5817.f19997 = 0;
            ((C7768) obj).f25562.mo7481(c5817);
        }
    }
}
