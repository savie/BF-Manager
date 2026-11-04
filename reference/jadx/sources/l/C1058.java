package l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B2V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1058 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f3793 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f3794 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Runnable f3795;

    public C1058(Runnable runnable) {
        this.f3795 = runnable;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3993(Menu menu) {
        Iterator it = this.f3793.iterator();
        while (it.hasNext()) {
            ((InterfaceC8515) it.next()).mo22831(menu);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3988(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f3793.iterator();
        while (it.hasNext()) {
            ((InterfaceC8515) it.next()).mo22829(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3992(MenuItem menuItem) {
        Iterator it = this.f3793.iterator();
        while (it.hasNext()) {
            if (((InterfaceC8515) it.next()).mo22830(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3987(Menu menu) {
        Iterator it = this.f3793.iterator();
        while (it.hasNext()) {
            ((InterfaceC8515) it.next()).mo22828(menu);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3989(InterfaceC8515 interfaceC8515) {
        this.f3793.add(interfaceC8515);
        this.f3795.run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3990(final InterfaceC8515 interfaceC8515, InterfaceC11217 interfaceC11217) {
        m3989(interfaceC8515);
        AbstractC8585 lifecycle = interfaceC11217.getLifecycle();
        HashMap map = this.f3794;
        C10006 c10006 = (C10006) map.remove(interfaceC8515);
        if (c10006 != null) {
            c10006.m25858();
        }
        map.put(interfaceC8515, new C10006(lifecycle, new InterfaceC5252() { // from class: l.ᩳۡ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11218, EnumC9330 enumC9330) {
                C1058 c1058 = this.f61463;
                c1058.getClass();
                if (enumC9330 == EnumC9330.ON_DESTROY) {
                    c1058.m3994(interfaceC8515);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3991(final InterfaceC8515 interfaceC8515, InterfaceC11217 interfaceC11217, final EnumC2619 enumC2619) {
        AbstractC8585 lifecycle = interfaceC11217.getLifecycle();
        HashMap map = this.f3794;
        C10006 c10006 = (C10006) map.remove(interfaceC8515);
        if (c10006 != null) {
            c10006.m25858();
        }
        map.put(interfaceC8515, new C10006(lifecycle, new InterfaceC5252() { // from class: l.۟ۡ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11218, EnumC9330 enumC9330) {
                C1058.m3986(this.f25574, enumC2619, interfaceC8515, enumC9330);
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3986(C1058 c1058, EnumC2619 enumC2619, InterfaceC8515 interfaceC8515, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.m24582(enumC2619)) {
            c1058.m3989(interfaceC8515);
            return;
        }
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            c1058.m3994(interfaceC8515);
        } else if (enumC9330 == EnumC9330.m24578(enumC2619)) {
            c1058.f3793.remove(interfaceC8515);
            c1058.f3795.run();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3994(InterfaceC8515 interfaceC8515) {
        this.f3793.remove(interfaceC8515);
        C10006 c10006 = (C10006) this.f3794.remove(interfaceC8515);
        if (c10006 != null) {
            c10006.m25858();
        }
        this.f3795.run();
    }
}
