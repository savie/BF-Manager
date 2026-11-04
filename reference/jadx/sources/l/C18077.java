package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18077 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9431 f59175;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f59176;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f59177;

    public C18077(C7941 c7941, ActivityC18143 activityC18143, C9431 c9431) {
        this.f59177 = c7941;
        this.f59176 = activityC18143;
        this.f59175 = c9431;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f59176, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C23056 c23056 = new C23056(0, C2448.f7850, false, 0, null, null, null);
        synchronized (this.f59177.f26409) {
            C5704 c5704M21522 = C7941.m21522(this.f59177, c23056);
            try {
                c5704M21522.f19703.m40249(this.f59175);
                c5704M21522.close();
            } catch (Throwable th) {
                if (c5704M21522 != null) {
                    try {
                        c5704M21522.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C7941.m21539(this.f59177, exc, this.f59176);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
