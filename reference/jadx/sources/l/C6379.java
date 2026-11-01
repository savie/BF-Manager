package l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B2V */
/* JADX INFO: loaded from: classes2.dex */
public final class C6379 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f21680 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f21681 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Runnable f21682;

    public C6379(Runnable runnable) {
        this.f21682 = runnable;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17514(Menu menu) {
        Iterator it = this.f21680.iterator();
        while (it.hasNext()) {
            ((InterfaceC14847) it.next()).mo29256(menu);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17509(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f21680.iterator();
        while (it.hasNext()) {
            ((InterfaceC14847) it.next()).mo29254(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17513(MenuItem menuItem) {
        Iterator it = this.f21680.iterator();
        while (it.hasNext()) {
            if (((InterfaceC14847) it.next()).mo29255(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17508(Menu menu) {
        Iterator it = this.f21680.iterator();
        while (it.hasNext()) {
            ((InterfaceC14847) it.next()).mo29253(menu);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17510(InterfaceC14847 interfaceC14847) {
        this.f21680.add(interfaceC14847);
        this.f21682.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17511(final InterfaceC14847 interfaceC14847, InterfaceC1423 interfaceC1423) {
        m17510(interfaceC14847);
        AbstractC3062 lifecycle = interfaceC1423.getLifecycle();
        HashMap map = this.f21681;
        C17668 c17668 = (C17668) map.remove(interfaceC14847);
        if (c17668 != null) {
            c17668.m41147();
        }
        map.put(interfaceC14847, new C17668(lifecycle, new InterfaceC5657() { // from class: l.۫᩻
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1424, EnumC1651 enumC1651) {
                C6379 c6379 = this.f42466;
                c6379.getClass();
                if (enumC1651 == EnumC1651.ON_DESTROY) {
                    c6379.m17515(interfaceC14847);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17512(final InterfaceC14847 interfaceC14847, InterfaceC1423 interfaceC1423, final EnumC9414 enumC9414) {
        AbstractC3062 lifecycle = interfaceC1423.getLifecycle();
        HashMap map = this.f21681;
        C17668 c17668 = (C17668) map.remove(interfaceC14847);
        if (c17668 != null) {
            c17668.m41147();
        }
        map.put(interfaceC14847, new C17668(lifecycle, new InterfaceC5657() { // from class: l.ܽ᩻
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1424, EnumC1651 enumC1651) {
                C6379.m17507(this.f54293, enumC9414, interfaceC14847, enumC1651);
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17507(C6379 c6379, EnumC9414 enumC9414, InterfaceC14847 interfaceC14847, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.m5545(enumC9414)) {
            c6379.m17510(interfaceC14847);
            return;
        }
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            c6379.m17515(interfaceC14847);
        } else if (enumC1651 == EnumC1651.m5546(enumC9414)) {
            c6379.f21680.remove(interfaceC14847);
            c6379.f21682.run();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17515(InterfaceC14847 interfaceC14847) {
        this.f21680.remove(interfaceC14847);
        C17668 c17668 = (C17668) this.f21681.remove(interfaceC14847);
        if (c17668 != null) {
            c17668.m41147();
        }
        this.f21682.run();
    }
}
