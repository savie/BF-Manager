package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12897 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f42874;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f42875;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f42876;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f42877 = new ArrayList(2);

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
    }

    public C12897(C3723 c3723, C21422 c21422, AbstractC12233 abstractC12233, ArrayList arrayList) {
        this.f42876 = c21422;
        this.f42875 = abstractC12233;
        this.f42874 = arrayList;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f42876.m47980(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        ArrayList arrayList = this.f42874;
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) arrayList.get(0);
        InterfaceC2557 interfaceC2558 = (InterfaceC2557) arrayList.get(1);
        String path = interfaceC2557.getPath();
        String path2 = interfaceC2558.getPath();
        String strM18162 = C6730.m18162(interfaceC2557.getParent(), System.currentTimeMillis() + ".tmp");
        AbstractC12233 abstractC12233 = this.f42875;
        String strMo10260 = abstractC12233.mo10260(strM18162);
        abstractC12233.mo10265(path, strMo10260);
        String strM18175 = C6730.m18175(strMo10260);
        ArrayList arrayList2 = this.f42877;
        arrayList2.add(strM18175);
        try {
            abstractC12233.mo10265(path2, path);
            arrayList2.add(C6730.m18175(path));
            try {
                abstractC12233.mo10265(strMo10260, path2);
                arrayList2.add(C6730.m18175(path2));
                arrayList2.remove(C6730.m18175(strMo10260));
            } catch (Exception e) {
                if (abstractC12233.mo30347(path, path2)) {
                    arrayList2.remove(C6730.m18175(path));
                    if (abstractC12233.mo30347(strMo10260, path)) {
                        arrayList2.remove(C6730.m18175(strMo10260));
                    }
                }
                throw e;
            }
        } catch (Exception e2) {
            if (abstractC12233.mo30347(strMo10260, path)) {
                arrayList2.remove(C6730.m18175(strMo10260));
            }
            throw e2;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f42876.m47980().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        ArrayList arrayList = this.f42877;
        if (!arrayList.isEmpty()) {
            C21422 c21422 = this.f42876;
            c21422.m47962();
            c21422.m47964(arrayList);
            c21422.m47969();
        }
        C21094.m47529(this.f42875.mo10276());
    }
}
