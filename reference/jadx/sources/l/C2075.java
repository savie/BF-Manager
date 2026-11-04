package l;

import android.view.MenuItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2075 implements InterfaceC25342, InterfaceC4787 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f6907;

    public /* synthetic */ C2075(Object obj, Serializable serializable) {
        this.f6906 = obj;
        this.f6907 = serializable;
    }

    @Override // l.InterfaceC25342
    public boolean onMenuItemClick(MenuItem menuItem) {
        return DialogC7990.m21779((DialogC7990) this.f6906, (String) this.f6907, menuItem);
    }

    @Override // l.InterfaceC4787
    public boolean test(Object obj) {
        ArrayList arrayList = (ArrayList) this.f6906;
        ArrayList arrayList2 = (ArrayList) this.f6907;
        String str = (String) obj;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C11769) it.next()).m29546(str)) {
                return false;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (((C11769) it2.next()).m29546(str)) {
                return true;
            }
        }
        return arrayList2.isEmpty();
    }
}
