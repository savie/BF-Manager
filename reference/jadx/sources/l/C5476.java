package l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5476 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5478 f18848;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f18849;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20293 f18850;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f18851;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f18852;

    public C5476(ActivityC20293 activityC20293) {
        this.f18850 = activityC20293;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f18850.f65761.m16335(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f18849 = C23053.m51002();
        this.f18851 = (List) C9030.stream(C11904.m29695().m46690("keystore").mo33983(true)).filter(new C11827()).sorted(new C8984(1)).collect(C1890.toUnmodifiableList());
        ActivityC20293 activityC20293 = this.f18850;
        List list = activityC20293.f65757;
        ArrayList arrayList = new ArrayList();
        arrayList.add("h1");
        if (this.f18849.isEmpty()) {
            arrayList.add("e1");
        } else {
            for (AbstractC17131 abstractC17131 : this.f18849) {
                if (abstractC17131.mo1453().equals(activityC20293.f65754)) {
                    arrayList.add("k" + abstractC17131.mo1456() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("k" + abstractC17131.mo1456());
                }
            }
        }
        arrayList.add("h2");
        if (this.f18851.isEmpty()) {
            arrayList.add("e2");
        } else {
            for (AbstractC20745 abstractC20745 : this.f18851) {
                if (abstractC20745.getName().equals(activityC20293.f65759)) {
                    arrayList.add("f" + abstractC20745.getName() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("f" + abstractC20745.getName());
                }
            }
        }
        this.f18852 = arrayList;
        if (activityC20293.f65755 == null || list.isEmpty()) {
            return;
        }
        this.f18848 = C4066.m11593(new C2653(list, arrayList));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        List list = this.f18849;
        ActivityC20293 activityC20293 = this.f18850;
        activityC20293.f65762 = list;
        activityC20293.f65760 = this.f18851;
        activityC20293.f65757 = this.f18852;
        if (activityC20293.f65755 != null) {
            activityC20293.f65755.m4459();
            C5478 c5478 = this.f18848;
            if (c5478 != null) {
                c5478.m15146(activityC20293.f65755);
            } else {
                activityC20293.f65755.notifyDataSetChanged();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f18850.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f18850.f65761.m16335(false);
    }
}
