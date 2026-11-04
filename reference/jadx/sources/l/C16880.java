package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16880 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21532 f55226;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f55227;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f55228;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18372 f55229;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f55230;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    public C16880(C18372 c18372, ActivityC0848 activityC0848, boolean z, C21532 c21532) {
        this.f55229 = c18372;
        this.f55227 = activityC0848;
        this.f55228 = z;
        this.f55226 = c21532;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f55227);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(C21576.m49059(R.string.MT_Protector, 0));
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f55230 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C25086 c25086 = new C25086(this);
        C18372 c18372 = this.f55229;
        C24604 c24604 = new C24604(c18372.f59861);
        boolean z = this.f55228;
        C21532 c21532 = this.f55226;
        if (z) {
            int i = c21532.f68797;
            if (i == 0) {
                C14818.m35680(c18372.f59861, c21532.f68799, c25086);
                return;
            } else if (i == 1) {
                C14818.m35684(c18372.f59861, c24604, c21532.f68799, c21532.f68800, c21532.f68796, c25086);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                C14818.m35683(c18372.f59861, c24604, c21532.f68799, c21532.f68800, c21532.f68798, c21532.f68795, c25086);
                return;
            }
        }
        int i2 = c21532.f68797;
        if (i2 == 0) {
            C14818.m35691(c18372.f59861, c21532.f68799, c25086);
        } else {
            if (i2 != 1) {
                return;
            }
            C14818.m35682(c18372.f59861, c24604, c21532.f68799, c21532.f68800, c25086);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f55227.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f55230.m27405();
    }
}
