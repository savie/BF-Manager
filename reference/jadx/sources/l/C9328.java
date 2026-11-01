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

/* JADX INFO: renamed from: l.ۢۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C9328 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public WifiManager.MulticastLock f31673;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final WeakReference f31676;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9186 f31674 = new C9186();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f31671 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f31675 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31672 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m23977(String str) {
        if (this.f31671.remove(str) != null) {
            m23989();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m23978(String str, C13644 c13644) {
        this.f31671.put(str, c13644);
        m23989();
    }

    public C9328(DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f31676 = new WeakReference(dialogInterfaceC19356);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23983(C9328 c9328, AbstractActivityC12483 abstractActivityC12483) {
        try {
            WifiManager wifiManager = (WifiManager) abstractActivityC12483.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                return;
            }
            WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager.createMulticastLock(abstractActivityC12483.getPackageName() + ":NetworkServiceScanner");
            multicastLockCreateMulticastLock.setReferenceCounted(false);
            multicastLockCreateMulticastLock.acquire();
            c9328.f31673 = multicastLockCreateMulticastLock;
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m23986(C9328 c9328) {
        WifiManager.MulticastLock multicastLock = c9328.f31673;
        c9328.f31673 = null;
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        try {
            multicastLock.release();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23982(C9328 c9328, C3764 c3764, String str, C13644 c13644) {
        synchronized (c9328) {
            if (!c3764.m11009() && !c9328.m23985()) {
                c9328.m23978(str, c13644);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23981(C9328 c9328, C3764 c3764, String str) {
        synchronized (c9328) {
            if (!c3764.m11009() && !c9328.m23985()) {
                c9328.m23977(str);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23984(C9328 c9328, C13644 c13644) {
        synchronized (c9328) {
            if (!c9328.f31675.containsKey(c13644.f45000)) {
                c9328.f31675.put(c13644.f45000, c13644);
                c9328.m23989();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m23989() {
        Collection<C13644> collectionValues = this.f31671.values();
        Collection<C13644> collectionValues2 = this.f31675.values();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C13644 c13644 : collectionValues) {
            if (linkedHashSet.add(c13644.f45000)) {
                arrayList.add(c13644);
            }
        }
        for (C13644 c13645 : collectionValues2) {
            if (linkedHashSet.add(c13645.f45000)) {
                arrayList.add(c13645);
            }
        }
        this.f31674.mo23641(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m23985() {
        DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) this.f31676.get();
        return dialogInterfaceC19356 == null || !dialogInterfaceC19356.m44375();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m23987(C9328 c9328) {
        if (c9328.f31672.decrementAndGet() == 0) {
            C16737.m39273(new RunnableC1565(c9328));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23980(C9328 c9328, int i) {
        if (i != 0) {
            c9328.f31672.set(i);
        } else {
            C16737.m39273(new RunnableC1565(c9328));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23979(C9328 c9328) {
        TextView textView;
        DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) c9328.f31676.get();
        if (dialogInterfaceC19356 == null || !dialogInterfaceC19356.m44375() || (textView = (TextView) dialogInterfaceC19356.m44364(R.id.MT_Protector)) == null) {
            return;
        }
        textView.setText(R.string.MT_Protector);
    }
}
