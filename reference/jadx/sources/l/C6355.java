package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6355 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21481;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3547 f21483;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4117 f21484;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f21485 = false;

    public C6355(C4117 c4117, boolean z, boolean z2, RunnableC3547 runnableC3547) {
        this.f21484 = c4117;
        this.f21481 = z;
        this.f21482 = z2;
        this.f21483 = runnableC3547;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f21484.f13983.m23233(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C7302 c7302M42889;
        ArrayList<C6004> arrayList = new ArrayList();
        ArrayList<C6004> arrayList2 = new ArrayList();
        C4117 c4117 = this.f21484;
        Iterator it = c4117.f13981.iterator();
        while (it.hasNext()) {
            C6004 c6004 = (C6004) ((InterfaceC2386) it.next());
            if (c6004.m17449()) {
                arrayList.add(c6004);
            } else {
                arrayList2.add(c6004);
            }
        }
        int iM10968 = c4117.f13982.m10968();
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z = this.f21482;
        boolean z2 = this.f21481;
        if (!zIsEmpty) {
            for (C6004 c6005 : arrayList2) {
                this.f7780.m33189(c6005.getName());
                String path = c6005.getPath();
                AbstractC22044 abstractC22044M35193 = C14584.m35193(path, new String[0]);
                if ((abstractC22044M35193 instanceof C18379) && (c7302M42889 = ((C18379) abstractC22044M35193).m42889()) != null) {
                    path = c7302M42889.mo4294();
                }
                C14453.m34908(path, iM10968, z2, z);
                c6005.m17447(c6005.mo5155().m24238(iM10968));
                this.f21485 = true;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList<C24255> arrayList3 = new ArrayList();
        for (C6004 c6006 : arrayList) {
            AbstractC22044 abstractC22044Mo8093 = c6006.mo8093();
            String name = c6006.getName();
            abstractC22044Mo8093.getClass();
            if (abstractC22044Mo8093 instanceof C0678) {
                arrayList3.add(new C24255(abstractC22044Mo8093.mo2948(), name, c6006));
            }
            if (z || z2) {
                if (c6006.isDirectory() && !c6006.mo8107()) {
                    for (AbstractC22044 abstractC22044 : abstractC22044Mo8093.mo4299(true)) {
                        StringBuilder sbM10405 = C3188.m10405(name, "/");
                        sbM10405.append(abstractC22044.getName());
                        m18071(arrayList3, abstractC22044, sbM10405.toString());
                    }
                }
            }
        }
        C24720 c24720M55195 = C24720.m55195();
        for (C24255 c24255 : arrayList3) {
            if (c24720M55195.m55199()) {
                this.f7780.m33189(c24255.f78545);
            }
            if (c24255.f78544.m2941(iM10968)) {
                C6004 c6007 = c24255.f78546;
                if (c6007 != null) {
                    c6007.m17447(c6007.mo5155().m24238(iM10968));
                }
                this.f21485 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18071(ArrayList arrayList, AbstractC22044 abstractC22044, String str) {
        if (abstractC22044.m49860()) {
            return;
        }
        if (!abstractC22044.mo4281()) {
            if (this.f21482 && (abstractC22044 instanceof C0678)) {
                arrayList.add(new C24255((C0678) abstractC22044, str, null));
                return;
            }
            return;
        }
        if (this.f21481 && (abstractC22044 instanceof C0678)) {
            arrayList.add(new C24255((C0678) abstractC22044, str, null));
        }
        for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
            StringBuilder sbM10405 = C3188.m10405(str, "/");
            sbM10405.append(abstractC22045.getName());
            m18071(arrayList, abstractC22045, sbM10405.toString());
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f21483.run();
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f21485) {
            this.f21483.run();
        }
        this.f21484.f13983.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
