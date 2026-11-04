package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1154 extends AbstractC21091 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13831 f4260;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154(C13831 c13831, AbstractC3191 abstractC3191) {
        super(abstractC3191);
        this.f4260 = c13831;
    }

    @Override // l.AbstractC21091
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 mo4255(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC19404();
        }
        if (i == 1) {
            return new C15829();
        }
        if (i == 2) {
            return new C18372();
        }
        if (i == 3) {
            return new C1965();
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(int i) {
        C13831 c13831 = this.f4260;
        if (i == 0) {
            return c13831.getString(R.string.MT_Protector);
        }
        if (i == 1) {
            return c13831.getString(R.string.MT_Protector);
        }
        if (i == 2) {
            return c13831.getString(R.string.MT_Protector);
        }
        if (i == 3) {
            return c13831.getString(R.string.MT_Protector);
        }
        throw new RuntimeException();
    }
}
