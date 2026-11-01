package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6427 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14895 f21768;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21769;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21770;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6427(C14895 c14895, ActivityC5677 activityC5677, int i, int i2) {
        super(activityC5677, -1);
        this.f21768 = c14895;
        this.f21769 = i;
        this.f21770 = i2;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        try {
            int i = Integer.parseInt(m40352());
            if (i < this.f21769 || i > this.f21770) {
                m40365(R.string.MT_Protector);
            } else if (this.f21768.f48660.m32417(i, true, true)) {
                m40364();
            } else {
                m40365(R.string.MT_Protector);
            }
        } catch (NumberFormatException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
