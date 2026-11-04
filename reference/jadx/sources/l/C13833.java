package l;

import android.net.wifi.WifiManager;
import android.widget.TextView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬ۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C13833 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f43910;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public WifiManager.MulticastLock f43911;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17930 f43909 = new C17930();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f43913 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f43912 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f43908 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m33770(String str) {
        if (this.f43913.remove(str) != null) {
            m33782();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m33771(String str, C10676 c10676) {
        this.f43913.put(str, c10676);
        m33782();
    }

    public C13833(DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f43910 = new WeakReference(dialogInterfaceC8327);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33777(C13833 c13833, AbstractActivityC17204 abstractActivityC17204) {
        try {
            WifiManager wifiManager = (WifiManager) abstractActivityC17204.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                return;
            }
            WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager.createMulticastLock(abstractActivityC17204.getPackageName() + ":NetworkServiceScanner");
            multicastLockCreateMulticastLock.setReferenceCounted(false);
            multicastLockCreateMulticastLock.acquire();
            c13833.f43911 = multicastLockCreateMulticastLock;
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m33780(C13833 c13833) {
        WifiManager.MulticastLock multicastLock = c13833.f43911;
        c13833.f43911 = null;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        try {
            multicastLock.release();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33776(C13833 c13833, C11422 c11422, String str, C10676 c10676) {
        synchronized (c13833) {
            if (!c11422.m28777() && !c13833.m33778()) {
                c13833.m33771(str, c10676);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33775(C13833 c13833, C11422 c11422, String str) {
        synchronized (c13833) {
            if (!c11422.m28777() && !c13833.m33778()) {
                c13833.m33770(str);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33774(C13833 c13833, C10676 c10676) {
        synchronized (c13833) {
            if (!c13833.f43912.containsKey(c10676.f33896)) {
                c13833.f43912.put(c10676.f33896, c10676);
                c13833.m33782();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33782() {
        Collection<C10676> collectionValues = this.f43913.values();
        Collection<C10676> collectionValues2 = this.f43912.values();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10676 c10676 : collectionValues) {
            if (linkedHashSet.add(c10676.f33896)) {
                arrayList.add(c10676);
            }
        }
        for (C10676 c10677 : collectionValues2) {
            if (linkedHashSet.add(c10677.f33896)) {
                arrayList.add(c10677);
            }
        }
        this.f43909.mo40348(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m33778() {
        DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) this.f43910.get();
        return dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m33779(C13833 c13833) {
        if (c13833.f43908.decrementAndGet() == 0) {
            C21576.m49068(new RunnableC7122(c13833));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33773(C13833 c13833, int i) {
        if (i != 0) {
            c13833.f43908.set(i);
        } else {
            C21576.m49068(new RunnableC7122(c13833));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33772(C13833 c13833) {
        TextView textView;
        DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) c13833.f43910.get();
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434() || (textView = (TextView) dialogInterfaceC8327.m22423(R.id.title)) == null) {
            return;
        }
        textView.setText(R.string.MT_Protector);
    }
}
