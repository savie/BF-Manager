package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22148 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f71340;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f71341;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f71342;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71343 = new ArrayList(2);

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    public C22148(C10959 c10959, C12915 c12915, AbstractC18881 abstractC18881, ArrayList arrayList) {
        this.f71341 = c12915;
        this.f71340 = abstractC18881;
        this.f71342 = arrayList;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f71341.m31979(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        ArrayList arrayList = this.f71342;
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) arrayList.get(0);
        InterfaceC2386 interfaceC2387 = (InterfaceC2386) arrayList.get(1);
        String path = interfaceC2386.getPath();
        String path2 = interfaceC2387.getPath();
        String strM28549 = C11293.m28549(interfaceC2386.getParent(), System.currentTimeMillis() + ".tmp");
        AbstractC18881 abstractC18881 = this.f71340;
        String strMo35577 = abstractC18881.mo35577(strM28549);
        abstractC18881.mo35571(path, strMo35577);
        String strM28558 = C11293.m28558(strMo35577);
        ArrayList arrayList2 = this.f71343;
        arrayList2.add(strM28558);
        try {
            abstractC18881.mo35571(path2, path);
            arrayList2.add(C11293.m28558(path));
            try {
                abstractC18881.mo35571(strMo35577, path2);
                arrayList2.add(C11293.m28558(path2));
                arrayList2.remove(C11293.m28558(strMo35577));
            } catch (Exception e) {
                if (abstractC18881.mo43670(path, path2)) {
                    arrayList2.remove(C11293.m28558(path));
                    if (abstractC18881.mo43670(strMo35577, path)) {
                        arrayList2.remove(C11293.m28558(strMo35577));
                    }
                }
                throw e;
            }
        } catch (Exception e2) {
            if (abstractC18881.mo43670(strMo35577, path)) {
                arrayList2.remove(C11293.m28558(strMo35577));
            }
            throw e2;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f71341.m31979().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        ArrayList arrayList = this.f71343;
        if (!arrayList.isEmpty()) {
            C12915 c12915 = this.f71341;
            c12915.m31969();
            c12915.m31971(arrayList);
            c12915.m31973();
        }
        C6331.m18054(this.f71340.mo35579());
    }
}
