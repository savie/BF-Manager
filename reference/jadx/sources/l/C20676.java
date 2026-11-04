package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20676 extends AbstractC21091 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24406 f66292;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20676(C24406 c24406, AbstractC3191 abstractC3191) {
        super(abstractC3191);
        this.f66292 = c24406;
    }

    @Override // l.AbstractC21091
    /* JADX INFO: renamed from: ᩷ */
    public final ComponentCallbacksC11612 mo4255(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC20698();
        }
        if (i == 1) {
            return new C19206();
        }
        if (i == 2) {
            return new C21400();
        }
        if (i == 3) {
            return new C2009();
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(int i) {
        C24406 c24406 = this.f66292;
        if (i == 0) {
            return c24406.getString(R.string.MT_Protector);
        }
        if (i == 1) {
            return c24406.getString(R.string.MT_Protector);
        }
        if (i == 2) {
            return c24406.getString(R.string.MT_Protector);
        }
        if (i == 3) {
            return c24406.getString(R.string.MT_Protector);
        }
        throw new RuntimeException();
    }
}
