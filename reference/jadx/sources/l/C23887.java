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

/* JADX INFO: renamed from: l.᩹᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23887 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f77360;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f77358 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f77359 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f77361 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f77362 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53390(C22941 c22941, List list) throws IOException {
        ArrayList arrayList;
        C8002 entry = c22941.getEntry("manifest.json");
        if (entry != null) {
            try {
                this.f77360 = AbstractC12454.m30925(new String(c22941.m51731(entry, (C3374) null), StandardCharsets.UTF_8)).m35343(am.o);
            } catch (Exception unused) {
            }
        }
        ArrayList arrayListM30296 = list != null ? C12127.m30296(c22941, list) : null;
        Iterator it = c22941.m51742().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f77358;
            if (!zHasNext) {
                break;
            }
            C8002 c8002 = (C8002) it.next();
            String name = c8002.getName();
            if (C12127.m30297(name) && (arrayListM30296 == null || arrayListM30296.contains(name))) {
                C14584.m35187(name, false);
                System.out.println("add ".concat(name));
                arrayList.add(c8002);
                this.f77361 = c8002.getSize() + this.f77361;
            }
        }
        for (C8002 c8003 : c22941.m51742()) {
            if (!c8003.isDirectory() && c8003.getName().startsWith("Android/")) {
                C14584.m35187(c8003.getName(), false);
                this.f77359.add(c8003);
                this.f77362 = c8003.getSize() + this.f77362;
            }
        }
        Collections.sort(arrayList, new C0187(2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53388(C21649 c21649, PackageInstaller.Session session, ExecutorService executorService) throws Exception {
        ArrayList arrayList = this.f77358;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            executorService.submit(new RunnableC0766(c21649, (C8002) it.next(), session));
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (((Runnable) c21649.f69114.poll(500L, TimeUnit.MILLISECONDS)) != null) {
                i++;
            } else if (c21649.f69113) {
                return;
            } else {
                c21649.m49175();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53389(C21649 c21649, C10745 c10745, ExecutorService executorService) throws Exception {
        ArrayList<C8002> arrayList = this.f77359;
        if (arrayList.isEmpty()) {
            return;
        }
        c10745.m27396();
        c10745.m27394(false);
        C3374 c3374 = new C3374(this.f77362);
        c3374.m11078(new C21151(c10745));
        c21649.f69111 = c3374;
        for (C8002 c8002 : arrayList) {
            executorService.submit(new RunnableC18665(c21649, c8002, C6382.f21566.m49876(C14584.m35187(c8002.getName(), false)), false));
        }
        C5261.m15837(executorService);
        c21649.m49175();
    }
}
