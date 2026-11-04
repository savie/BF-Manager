package l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10497 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f33396;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f33397;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3786 f33398;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14761 f33399;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f33400;

    public C10497(ActivityC3786 activityC3786) {
        this.f33398 = activityC3786;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f33398.f12974.m10021(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f33396 = C16530.m39165();
        this.f33397 = (List) C1170.stream(C6382.m18134().m49876("keystore").mo4299(true)).filter(new C14005(0)).sorted(new C4532(0)).collect(C2025.toUnmodifiableList());
        ActivityC3786 activityC3786 = this.f33398;
        List list = activityC3786.f12977;
        ArrayList arrayList = new ArrayList();
        arrayList.add("h1");
        if (this.f33396.isEmpty()) {
            arrayList.add("e1");
        } else {
            for (AbstractC14806 abstractC14806 : this.f33396) {
                if (abstractC14806.mo18531().equals(activityC3786.f12972)) {
                    arrayList.add("k" + abstractC14806.mo11753() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("k" + abstractC14806.mo11753());
                }
            }
        }
        arrayList.add("h2");
        if (this.f33397.isEmpty()) {
            arrayList.add("e2");
        } else {
            for (AbstractC22044 abstractC22044 : this.f33397) {
                if (abstractC22044.getName().equals(activityC3786.f12970)) {
                    arrayList.add("f" + abstractC22044.getName() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("f" + abstractC22044.getName());
                }
            }
        }
        this.f33400 = arrayList;
        if (activityC3786.f12978 == null || list.isEmpty()) {
            return;
        }
        this.f33399 = C8050.m21936(new C21686(arrayList, list), true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        List list = this.f33396;
        ActivityC3786 activityC3786 = this.f33398;
        activityC3786.f12979 = list;
        activityC3786.f12975 = this.f33397;
        activityC3786.f12977 = this.f33400;
        if (activityC3786.f12978 != null) {
            activityC3786.f12978.m44931();
            C14761 c14761 = this.f33399;
            if (c14761 != null) {
                c14761.m35496(activityC3786.f12978);
            } else {
                activityC3786.f12978.notifyDataSetChanged();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f33398.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f33398.f12974.m10021(false);
    }
}
