package l;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.FileUriExposedException;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19369 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f62429;

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        List listM47979 = c21422.m47979();
        this.f62429 = listM47979;
        Iterator it = listM47979.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2557) it.next()).isDirectory()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        if (this.f62429.size() == 1) {
            c21422.m47960().mo23627((InterfaceC2557) this.f62429.get(0));
        }
        ArrayList arrayList = new ArrayList(this.f62429.size());
        Iterator it = this.f62429.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10840((InterfaceC2557) it.next()));
        }
        c21422.m47960().mo13033(c21422.m47965(), arrayList, new RunnableC17957(this, c21422, arrayList, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44396(C19369 c19369, C21422 c21422, ArrayList arrayList) {
        String strMo7967;
        c21422.m47960().m28622((List) null);
        if (arrayList.size() != 1) {
            strMo7967 = (String) C9030.stream(c19369.f62429).map(new C18663(0)).reduce(new C8080()).get();
        } else {
            strMo7967 = ((InterfaceC2557) c19369.f62429.get(0)).mo7967();
            if (strMo7967.equals("application/vnd.android.package-archive") && C12597.m31375()) {
                strMo7967 = "application/octet-stream";
            }
        }
        m44395(c21422.m47980(), arrayList, strMo7967);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44395(Main main, ArrayList arrayList, String str) {
        C5465 c5465 = new C5465(main);
        c5465.m15129();
        c5465.m15133(str);
        if (arrayList.size() == 1) {
            c5465.m15131(((C10840) arrayList.get(0)).m27170());
        }
        boolean z = Build.VERSION.SDK_INT < 30 && C23630.f76551 && !C12597.m31375();
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C10840) it.next()).m27177().mo33972()) {
                    z = false;
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC20745 abstractC20745M27177 = ((C10840) it2.next()).m27177();
            Uri uriM46732 = z ? abstractC20745M27177.m46732() : abstractC20745M27177.m46712();
            c5465.m15130(uriM46732);
            arrayList2.add(uriM46732);
        }
        if (arrayList2.size() > 1) {
            C14396.m34659(arrayList2);
        }
        try {
            c5465.m15132();
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 24 && (e instanceof FileUriExposedException)) {
                C23630.f76551 = false;
                m44395(main, arrayList, str);
            } else {
                main.m31002(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
