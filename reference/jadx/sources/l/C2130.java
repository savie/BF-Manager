package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2130 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC9893 f7799;

    public C2130(ViewOnClickListenerC9893 viewOnClickListenerC9893) {
        this.f7799 = viewOnClickListenerC9893;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f7799.f33775, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f7799;
        C11780 c11780 = viewOnClickListenerC9893.f33772;
        if (c11780.f39571 != -1) {
            int i = C4723.f16662;
            if (C15157.m36349()) {
                throw new C4987(C4820.m13401(new C1313(2), R.string.MT_Protector));
            }
            if (C15157.m36331()) {
                throw new C4987(C4820.m13401(new C1313(1702), R.string.MT_Protector));
            }
            C2724 c2724M8305 = C2724.m8305(4167);
            c2724M8305.m8325(c11780.f39571);
            C1313 c1313M8314 = c2724M8305.m8314();
            if (!c1313M8314.m4686()) {
                throw new C4987(C4820.m13401(c1313M8314, R.string.MT_Protector));
            }
        }
        C5429.m15005(viewOnClickListenerC9893.f33772).mo24647();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f7799;
        ActivityC3541 activityC3541 = viewOnClickListenerC9893.f33775;
        C11780 c11780 = viewOnClickListenerC9893.f33772;
        if (c11780.f39571 == -1) {
            ServiceC23069.f74949.add(c11780.f39567);
            int iIndexOf = activityC3541.f13040.indexOf(viewOnClickListenerC9893.f33772);
            if (iIndexOf == -1) {
                new C9416(activityC3541).m10243();
                return;
            }
            ArrayList arrayList = new ArrayList(activityC3541.f13040);
            arrayList.remove(iIndexOf);
            activityC3541.f13040 = C0561.unmodifiableList(arrayList);
            activityC3541.f13039.notifyItemRemoved(iIndexOf);
            return;
        }
        int iIndexOf2 = activityC3541.f13045.indexOf(viewOnClickListenerC9893.f33772);
        if (iIndexOf2 == -1) {
            new C9416(activityC3541).m10243();
            return;
        }
        ArrayList arrayList2 = new ArrayList(activityC3541.f13045);
        arrayList2.remove(iIndexOf2);
        activityC3541.f13045 = C0561.unmodifiableList(arrayList2);
        activityC3541.f13039.notifyItemRemoved(activityC3541.f13040.size() + iIndexOf2);
        new RunnableC8482(activityC3541);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (!(exc instanceof C4987) && !(exc instanceof C8142)) {
            this.f7799.f33775.m31002(exc, (DialogInterface.OnDismissListener) null);
        } else {
            C15829.m37613((CharSequence) exc.getMessage());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
