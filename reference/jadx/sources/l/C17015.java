package l;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.FileUriExposedException;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17015 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f55587;

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        List listM31982 = c12915.m31982();
        this.f55587 = listM31982;
        Iterator it = listM31982.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2386) it.next()).isDirectory()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        if (this.f55587.size() == 1) {
            c12915.m31987().mo18797((InterfaceC2386) this.f55587.get(0));
        }
        ArrayList arrayList = new ArrayList(this.f55587.size());
        Iterator it = this.f55587.iterator();
        while (it.hasNext()) {
            arrayList.add(new C14406((InterfaceC2386) it.next()));
        }
        c12915.m31987().mo10162(c12915.m31983(), arrayList, new RunnableC1903(this, c12915, arrayList, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40118(C17015 c17015, C12915 c12915, ArrayList arrayList) {
        String strMo8114;
        c12915.m31987().m20198((List) null);
        if (arrayList.size() != 1) {
            strMo8114 = (String) C1170.stream(c17015.f55587).map(new C11794(0)).reduce(new C25221(0)).get();
        } else {
            strMo8114 = ((InterfaceC2386) c17015.f55587.get(0)).mo8114();
            if (strMo8114.equals("application/vnd.android.package-archive") && C9034.m24094()) {
                strMo8114 = "application/octet-stream";
            }
        }
        m40117(c12915.m31979(), arrayList, strMo8114);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40117(Main main, ArrayList arrayList, String str) {
        C16457 c16457 = new C16457(main);
        c16457.m39005();
        c16457.m39009(str);
        if (arrayList.size() == 1) {
            c16457.m39007(((C14406) arrayList.get(0)).m34846());
        }
        boolean z = Build.VERSION.SDK_INT < 30 && C20312.f65186 && !C9034.m24094();
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C14406) it.next()).m34845().mo4291()) {
                    z = false;
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC22044 abstractC22044M34845 = ((C14406) it2.next()).m34845();
            Uri uriM49836 = z ? abstractC22044M34845.m49836() : abstractC22044M34845.m49878();
            c16457.m39006(uriM49836);
            arrayList2.add(uriM49836);
        }
        if (arrayList2.size() > 1) {
            C17568.m41233(arrayList2);
        }
        try {
            c16457.m39008();
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 24 && (e instanceof FileUriExposedException)) {
                C20312.f65186 = false;
                m40117(main, arrayList, str);
            } else {
                main.m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
