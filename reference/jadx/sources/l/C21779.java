package l;

import android.content.DialogInterface;
import android.os.Build;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21779 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70554;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f70555;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f70556;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4871 f70557;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f70558;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f70559;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f70560 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f70561;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4245 f70562;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11672 f70563;

    public C21779(boolean z, ViewOnClickListenerC8374 viewOnClickListenerC8374, C11672 c11672, C4245 c4245, int i, InterfaceC4871 interfaceC4871, boolean z2) {
        this.f70555 = z;
        this.f70559 = viewOnClickListenerC8374;
        this.f70563 = c11672;
        this.f70562 = c4245;
        this.f70554 = i;
        this.f70557 = interfaceC4871;
        this.f70556 = z2;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List m48541() {
        List list = this.f70561;
        if (list != null) {
            return list;
        }
        C13465.m32968("tempItems");
        throw null;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        if (this.f70555) {
            return;
        }
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f70559;
        C6018 c6018 = viewOnClickListenerC8374.f29078;
        if (c6018 == null) {
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
        if (c6018.m16340()) {
            return;
        }
        C6018 c6019 = viewOnClickListenerC8374.f29078;
        if (c6019 != null) {
            c6019.postDelayed(new RunnableC7025(1, this, viewOnClickListenerC8374), 300L);
        } else {
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48540(C21779 c21779, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        if (c21779.f70560) {
            C6018 c6018 = viewOnClickListenerC8374.f29078;
            if (c6018 != null) {
                c6018.m16335(true);
            } else {
                C13465.m32968("swipeRefreshLayout");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b1 A[LOOP:0: B:18:0x00ab->B:20:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:30:0x0100  */
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX WARN: Code duplicated, block: B:33:0x0109  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        List list;
        HashMap map;
        Collator collator;
        boolean zM42321;
        String strM1693;
        HashMap map2;
        int iM10039;
        boolean zM10049;
        Comparator c14677;
        int i = Build.VERSION.SDK_INT;
        C11672 c11672 = this.f70563;
        if (i >= 30) {
            C0262 c0262 = C17196.f54822;
            String strM28629 = c11672.m28629();
            C13465.m32967(strM28629, "getPath(...)");
            C0262.m1762(strM28629);
        }
        List listMo13037 = c11672.mo13037();
        C13465.m32967(listMo13037, "list(...)");
        this.f70561 = listMo13037;
        if (i >= 30) {
            C0262 c0263 = C17196.f54822;
            C0262.m1762("");
        }
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f70559;
        try {
            if (viewOnClickListenerC8374.f29065 != 0) {
                if (!viewOnClickListenerC8374.f29055.isEmpty() || !viewOnClickListenerC8374.f29062.isEmpty()) {
                    InterfaceC5046 interfaceC5046Stream = C9030.stream(m48541());
                    final C23191 c23191 = new C23191(viewOnClickListenerC8374);
                    Object objCollect = interfaceC5046Stream.filter(new Predicate() { // from class: l.ܶ᩵ۘ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C8512.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo9645negate() {
                            return C8512.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C8512.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Boolean) c23191.invoke(obj)).booleanValue();
                        }
                    }).collect(C1890.toList());
                    C13465.m32967(objCollect, "collect(...)");
                    list = (List) objCollect;
                }
                map = new HashMap();
                collator = Collator.getInstance();
                zM42321 = C18204.m42321(m48541());
                for (InterfaceC2557 interfaceC2557 : m48541()) {
                    map.put(interfaceC2557.getName(), new C11149(collator, interfaceC2557.getName(), zM42321));
                }
                strM1693 = C0252.m1693("local:", c11672.m28640());
                map2 = C0674.f2833;
                if (map2.containsKey(strM1693)) {
                    Object obj = map2.get(strM1693);
                    C13465.m32962(obj);
                    int iIntValue = ((Number) obj).intValue();
                    iM10039 = C3386.m10039(iIntValue);
                    zM10049 = C3386.m10049(iIntValue);
                } else {
                    iM10039 = viewOnClickListenerC8374.f29063;
                    zM10049 = viewOnClickListenerC8374.f29068;
                }
                if (iM10039 != 0) {
                    c14677 = new C14677(map, zM10049);
                } else if (iM10039 != 1) {
                    c14677 = new C6209(map, zM10049, true);
                } else if (iM10039 != 2) {
                    c14677 = new C1975(map, zM10049);
                } else {
                    if (iM10039 == 3) {
                        throw new RuntimeException();
                    }
                    c14677 = new C9738(map, zM10049);
                }
                Collections.sort(m48541(), c14677);
                if (this.f70555 || !C11545.m28742(m48541(), viewOnClickListenerC8374.f29067)) {
                }
                this.f70558 = true;
                return;
            }
            InterfaceC5046 interfaceC5046Stream2 = C9030.stream(m48541());
            final C4139 c4139 = new C4139();
            Object objCollect2 = interfaceC5046Stream2.filter(new Predicate() { // from class: l.ۜ᩵ۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((Boolean) c4139.invoke(obj2)).booleanValue();
                }
            }).collect(C1890.toList());
            C13465.m32967(objCollect2, "collect(...)");
            list = (List) objCollect2;
            Collections.sort(m48541(), c14677);
        } catch (IllegalArgumentException e) {
            if (zM42321) {
                throw e;
            }
            map.clear();
            for (InterfaceC2557 interfaceC2558 : m48541()) {
                map.put(interfaceC2558.getName(), new C11149(collator, interfaceC2558.getName(), true));
            }
            Collections.sort(m48541(), c14677);
        }
        this.f70561 = list;
        map = new HashMap();
        collator = Collator.getInstance();
        zM42321 = C18204.m42321(m48541());
        while (r5.hasNext()) {
            map.put(interfaceC2557.getName(), new C11149(collator, interfaceC2557.getName(), zM42321));
        }
        strM1693 = C0252.m1693("local:", c11672.m28640());
        map2 = C0674.f2833;
        if (map2.containsKey(strM1693)) {
            Object obj2 = map2.get(strM1693);
            C13465.m32962(obj2);
            int iIntValue2 = ((Number) obj2).intValue();
            iM10039 = C3386.m10039(iIntValue2);
            zM10049 = C3386.m10049(iIntValue2);
        } else {
            iM10039 = viewOnClickListenerC8374.f29063;
            zM10049 = viewOnClickListenerC8374.f29068;
        }
        if (iM10039 != 0) {
            c14677 = new C14677(map, zM10049);
        } else if (iM10039 != 1) {
            c14677 = new C6209(map, zM10049, true);
        } else if (iM10039 != 2) {
            c14677 = new C1975(map, zM10049);
        } else {
            if (iM10039 == 3) {
                throw new RuntimeException();
            }
            c14677 = new C9738(map, zM10049);
        }
        if (this.f70555) {
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f70560 = false;
        if (this.f70562.mo9170().m24173(EnumC9414.CREATED)) {
            ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f70559;
            if (viewOnClickListenerC8374.f29057.get() != this.f70554) {
                return;
            }
            if (!this.f70555 || this.f70558) {
                ViewOnClickListenerC8374.m21940(viewOnClickListenerC8374, m48541());
                InterfaceC4871 interfaceC4871 = this.f70557;
                if (interfaceC4871 != null) {
                    interfaceC4871.mo3788();
                }
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f70560 = false;
        if (this.f70562.mo9170().m24173(EnumC9414.CREATED)) {
            ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f70559;
            if (viewOnClickListenerC8374.f29057.get() != this.f70554) {
                return;
            }
            viewOnClickListenerC8374.m31002(exc, (DialogInterface.OnDismissListener) null);
            if (this.f70556) {
                List list = Collections.EMPTY_LIST;
                C13465.m32967(list, "emptyList(...)");
                ViewOnClickListenerC8374.m21940(viewOnClickListenerC8374, list);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C6018 c6018 = this.f70559.f29078;
        if (c6018 != null) {
            c6018.m16335(false);
        } else {
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
    }
}
