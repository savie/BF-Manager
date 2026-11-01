package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes.dex */
public final class C22590 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f73618;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73619;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f73620;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13418 f73621;

    public C22590(View view, ActivityC13418 activityC13418, DialogInterfaceC19356 dialogInterfaceC19356, String str) {
        this.f73621 = activityC13418;
        this.f73619 = str;
        this.f73618 = dialogInterfaceC19356;
        this.f73620 = view;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f73621, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C22356 {
        ActivityC13418 activityC13418 = this.f73621;
        C1313 c1313M48029 = C21444.m48029(this.f73619, activityC13418.f44381.f5872);
        if (c1313M48029.m4686()) {
            return;
        }
        if (activityC13418.f44381.f5872) {
            throw new C22356(C4820.m13401(c1313M48029, R.string.MT_Protector));
        }
        throw new C22356(C4820.m13401(c1313M48029, R.string.MT_Protector));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C16737.m39274(new Runnable() { // from class: l.ۚ᩺ۘ
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC13418 activityC13418 = this.f19324.f73621;
                Main mainM47527 = C21094.m47527();
                if (mainM47527 != null) {
                    mainM47527.m30997(R.string.MT_Protector, activityC13418.f44381.f5869, false);
                } else {
                    C15829.m37619(activityC13418.f44381.f5869);
                }
            }
        }, 1000L);
        this.f73618.dismiss();
        C21444.m48062();
        this.f73621.finish();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f73620.setEnabled(true);
        this.f73621.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
