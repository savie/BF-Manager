package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10054 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20637 f34348;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34349;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC10138 f34350;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34351;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f34352 = false;

    public C10054(C20637 c20637, boolean z, boolean z2, RunnableC10138 runnableC10138) {
        this.f34348 = c20637;
        this.f34349 = z;
        this.f34351 = z2;
        this.f34350 = runnableC10138;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f34348.f67197.m28824(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C14042 c14042M40125;
        ArrayList<C6794> arrayList = new ArrayList();
        ArrayList<C6794> arrayList2 = new ArrayList();
        C20637 c20637 = this.f34348;
        Iterator it = c20637.f67199.iterator();
        while (it.hasNext()) {
            C6794 c6794 = (C6794) ((InterfaceC2557) it.next());
            if (c6794.m18393()) {
                arrayList.add(c6794);
            } else {
                arrayList2.add(c6794);
            }
        }
        int iM41908 = c20637.f67200.m41908();
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z = this.f34351;
        boolean z2 = this.f34349;
        if (!zIsEmpty) {
            for (C6794 c6795 : arrayList2) {
                this.f12806.m40698(c6795.getName());
                String path = c6795.getPath();
                AbstractC20745 abstractC20745M15313 = C5553.m15313(path, new String[0]);
                if ((abstractC20745M15313 instanceof C17196) && (c14042M40125 = ((C17196) abstractC20745M15313).m40125()) != null) {
                    path = c14042M40125.mo33986();
                }
                C0055.m953(path, iM41908, z2, z);
                c6795.m18394(c6795.mo7971().m29321(iM41908));
                this.f34352 = true;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList<C7231> arrayList3 = new ArrayList();
        for (C6794 c6796 : arrayList) {
            AbstractC20745 abstractC20745Mo7989 = c6796.mo7989();
            String name = c6796.getName();
            abstractC20745Mo7989.getClass();
            if (abstractC20745Mo7989 instanceof C17589) {
                arrayList3.add(new C7231(abstractC20745Mo7989.mo40898(), name, c6796));
            }
            if (z || z2) {
                if (c6796.isDirectory() && !c6796.mo7986()) {
                    for (AbstractC20745 abstractC20745 : abstractC20745Mo7989.mo33983(true)) {
                        StringBuilder sbM8976 = C3012.m8976(name, "/");
                        sbM8976.append(abstractC20745.getName());
                        m25449(arrayList3, abstractC20745, sbM8976.toString());
                    }
                }
            }
        }
        C22959 c22959M50797 = C22959.m50797();
        for (C7231 c7231 : arrayList3) {
            if (c22959M50797.m50802()) {
                this.f12806.m40698(c7231.f24084);
            }
            if (c7231.f24083.m40905(iM41908)) {
                C6794 c6797 = c7231.f24085;
                if (c6797 != null) {
                    c6797.m18394(c6797.mo7971().m29321(iM41908));
                }
                this.f34352 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25449(ArrayList arrayList, AbstractC20745 abstractC20745, String str) {
        if (abstractC20745.m46723()) {
            return;
        }
        if (!abstractC20745.mo33974()) {
            if (this.f34351 && (abstractC20745 instanceof C17589)) {
                arrayList.add(new C7231((C17589) abstractC20745, str, null));
                return;
            }
            return;
        }
        if (this.f34349 && (abstractC20745 instanceof C17589)) {
            arrayList.add(new C7231((C17589) abstractC20745, str, null));
        }
        for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
            StringBuilder sbM8976 = C3012.m8976(str, "/");
            sbM8976.append(abstractC20746.getName());
            m25449(arrayList, abstractC20746, sbM8976.toString());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f34350.run();
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f34352) {
            this.f34350.run();
        }
        this.f34348.f67197.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
