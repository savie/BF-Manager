package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֨ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O6N2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1016 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21830 m3844(Uri uri, C13364 c13364) {
        return m3843(uri, (InterfaceC5614) c13364, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21830 m3843(Uri uri, InterfaceC5614 interfaceC5614, boolean z) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        if (uri == null || (!"file".equals(uri.getScheme()) && !"content".equals(uri.getScheme()))) {
            throw new IOException("Unsupported gallery URI");
        }
        m3845(interfaceC5614);
        final AbstractC20745 c22383 = "content".equals(uri.getScheme()) ? new C22383(uri) : C5553.m15309(new Intent().setData(uri));
        C6794 c6794 = new C6794(c22383);
        m3845(interfaceC5614);
        final C21611 c21611 = C21611.f70098;
        List<InterfaceC2557> list = Collections.EMPTY_LIST;
        if ("file".equals(uri.getScheme())) {
            Future futureSubmit = C4716.f16636.submit(new Callable() { // from class: l.᩹ۡ۬
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c21611.mo10263(c22383.m46737(), true);
                }
            });
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
                futureSubmit.cancel(false);
            }
        }
        m3845(interfaceC5614);
        ArrayList arrayList = new ArrayList();
        InterfaceC2557 interfaceC2557 = c6794;
        for (InterfaceC2557 interfaceC2558 : list) {
            m3845(interfaceC5614);
            if (interfaceC2558.getPath().equals(c6794.getPath())) {
                arrayList.add(interfaceC2558);
                interfaceC2557 = interfaceC2558;
            } else if (interfaceC2558.mo7985() && (interfaceC2558.mo7967().startsWith("image/") || (z && C13012.m32190(interfaceC2558)))) {
                arrayList.add(interfaceC2558);
            }
        }
        if (interfaceC2557 == c6794) {
            arrayList.add(c6794);
        }
        C3386.m10046(arrayList, 0, false);
        return new C21830(c21611, arrayList, arrayList.indexOf(interfaceC2557));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21830 m3842(Uri uri, ArrayList arrayList, C13364 c13364) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        m3845(c13364);
        if (uri == null || !"file".equals(uri.getScheme()) || !C5553.m15309(new Intent().setData(uri)).mo36912()) {
            throw new IOException("Gallery source cannot be reopened independently");
        }
        C21830 c21830M3843 = m3843(uri, (InterfaceC5614) c13364, true);
        ArrayList arrayList2 = new ArrayList(c21830M3843.m48602());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC2557) it.next()).getPath());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            m3845(c13364);
            if (str == null || !str.startsWith("/")) {
                throw new IOException("Invalid restored gallery path");
            }
            if (hashSet.add(str)) {
                AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
                if (!abstractC20745M15313.mo36912()) {
                    throw new IOException("Selected gallery source cannot be reopened independently");
                }
                arrayList2.add(new C6794(abstractC20745M15313));
            }
        }
        return new C21830(c21830M3843.m48600(), arrayList2, c21830M3843.m48601());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3845(InterfaceC5614 interfaceC5614) throws InterruptedIOException {
        if (interfaceC5614.mo2357()) {
            throw new InterruptedIOException("Gallery argument request canceled");
        }
    }
}
