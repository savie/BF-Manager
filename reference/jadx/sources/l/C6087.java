package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6087 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14555 f20602;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20603;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6087(ActivityC14555 activityC14555, AbstractActivityC12483 abstractActivityC12483, int i) {
        super(abstractActivityC12483, -1);
        this.f20602 = activityC14555;
        this.f20603 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        int i;
        try {
            i = Integer.parseInt(m40352());
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            m40364();
        } else if (i > this.f20603) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            new C17376(this, i).m10243();
        }
    }
}
