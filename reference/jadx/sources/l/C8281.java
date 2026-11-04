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

/* JADX INFO: renamed from: l.۠֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6N2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8281 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12184 m22369(Uri uri, C11438 c11438) {
        return m22368(uri, (InterfaceC7509) c11438, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12184 m22368(Uri uri, InterfaceC7509 interfaceC7509, boolean z) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        if (uri == null || (!"file".equals(uri.getScheme()) && !"content".equals(uri.getScheme()))) {
            throw new IOException("Unsupported gallery URI");
        }
        m22370(interfaceC7509);
        final AbstractC22044 c22965 = "content".equals(uri.getScheme()) ? new C22965(uri) : C14584.m35190(new Intent().setData(uri));
        C6004 c6004 = new C6004(c22965);
        m22370(interfaceC7509);
        final C11969 c11969 = C11969.f38536;
        List<InterfaceC2386> list = Collections.EMPTY_LIST;
        if ("file".equals(uri.getScheme())) {
            Future futureSubmit = C5261.f18540.submit(new Callable() { // from class: l.ۖ֨ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c11969.mo20830(c22965.m49881(), true);
                }
            });
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
                futureSubmit.cancel(false);
            }
        }
        m22370(interfaceC7509);
        ArrayList arrayList = new ArrayList();
        InterfaceC2386 interfaceC2386 = c6004;
        for (InterfaceC2386 interfaceC2387 : list) {
            m22370(interfaceC7509);
            if (interfaceC2387.getPath().equals(c6004.getPath())) {
                arrayList.add(interfaceC2387);
                interfaceC2386 = interfaceC2387;
            } else if (interfaceC2387.mo8090() && (interfaceC2387.mo8114().startsWith("image/") || (z && C6790.m18961(interfaceC2387)))) {
                arrayList.add(interfaceC2387);
            }
        }
        if (interfaceC2386 == c6004) {
            arrayList.add(c6004);
        }
        C14118.m34287(arrayList, 0, false);
        return new C12184(c11969, arrayList, arrayList.indexOf(interfaceC2386));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12184 m22367(Uri uri, ArrayList arrayList, C11438 c11438) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        m22370(c11438);
        if (uri == null || !"file".equals(uri.getScheme()) || !C14584.m35190(new Intent().setData(uri)).mo4295()) {
            throw new IOException("Gallery source cannot be reopened independently");
        }
        C12184 c12184M22368 = m22368(uri, (InterfaceC7509) c11438, true);
        ArrayList arrayList2 = new ArrayList(c12184M22368.m30460());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC2386) it.next()).getPath());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            m22370(c11438);
            if (str == null || !str.startsWith("/")) {
                throw new IOException("Invalid restored gallery path");
            }
            if (hashSet.add(str)) {
                AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
                if (!abstractC22044M35193.mo4295()) {
                    throw new IOException("Selected gallery source cannot be reopened independently");
                }
                arrayList2.add(new C6004(abstractC22044M35193));
            }
        }
        return new C12184(c12184M22368.m30459(), arrayList2, c12184M22368.m30458());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22370(InterfaceC7509 interfaceC7509) throws InterruptedIOException {
        if (interfaceC7509.mo924()) {
            throw new InterruptedIOException("Gallery argument request canceled");
        }
    }
}
