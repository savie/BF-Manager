package l;

import android.content.pm.PackageInstaller;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1715 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f6776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f6775 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f6777 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f6778 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f6774 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5709(C2455 c2455, List list) throws IOException {
        ArrayList arrayList;
        C12107 entry = c2455.getEntry("manifest.json");
        if (entry != null) {
            try {
                this.f6776 = AbstractC8620.m22396(new String(c2455.m7475(entry, (C8516) null), StandardCharsets.UTF_8)).m37351(am.o);
            } catch (Exception unused) {
            }
        }
        ArrayList arrayListM47555 = list != null ? C21132.m47555(c2455, list) : null;
        Iterator it = c2455.m7466().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f6775;
            if (!zHasNext) {
                break;
            }
            C12107 c12107 = (C12107) it.next();
            String name = c12107.getName();
            if (C21132.m47556(name) && (arrayListM47555 == null || arrayListM47555.contains(name))) {
                C5553.m15307(name, false);
                System.out.println("add ".concat(name));
                arrayList.add(c12107);
                this.f6778 = c12107.getSize() + this.f6778;
            }
        }
        for (C12107 c12108 : c2455.m7466()) {
            if (!c12108.isDirectory() && c12108.getName().startsWith("Android/")) {
                C5553.m15307(c12108.getName(), false);
                this.f6777.add(c12108);
                this.f6774 = c12108.getSize() + this.f6774;
            }
        }
        Collections.sort(arrayList, new C14417());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5710(C22218 c22218, PackageInstaller.Session session, ExecutorService executorService) throws Exception {
        ArrayList arrayList = this.f6775;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            executorService.submit(new RunnableC13046(c22218, (C12107) it.next(), session));
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (((Runnable) c22218.f72656.poll(500L, TimeUnit.MILLISECONDS)) != null) {
                i++;
            } else if (c22218.f72660) {
                return;
            } else {
                c22218.m49333();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5711(C22218 c22218, C1777 c1777, ExecutorService executorService) throws Exception {
        ArrayList<C12107> arrayList = this.f6777;
        if (arrayList.isEmpty()) {
            return;
        }
        c1777.m5836();
        c1777.m5833(false);
        C8516 c8516 = new C8516(this.f6774);
        c8516.m22241(new C1438(c1777));
        c22218.f72659 = c8516;
        for (C12107 c12107 : arrayList) {
            executorService.submit(new RunnableC1050(c22218, c12107, C11904.f39934.m46690(C5553.m15307(c12107.getName(), false)), false));
        }
        C4716.m13052(executorService);
        c22218.m49333();
    }
}
