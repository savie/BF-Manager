package l;

import android.content.DialogInterface;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12991 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41632;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19479 f41633;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41634;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41635;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20168 f41636;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f41637;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f41638;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f41639;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f41640 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7495 f41641;

    public C12991(boolean z, ViewOnClickListenerC11499 viewOnClickListenerC11499, C7495 c7495, C20168 c20168, int i, InterfaceC19479 interfaceC19479, boolean z2) {
        this.f41632 = z;
        this.f41637 = viewOnClickListenerC11499;
        this.f41641 = c7495;
        this.f41636 = c20168;
        this.f41635 = i;
        this.f41633 = interfaceC19479;
        this.f41634 = z2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m32402() {
        List list = this.f41639;
        if (list != null) {
            return list;
        }
        C15243.m36592("tempItems");
        throw null;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        if (this.f41632) {
            return;
        }
        final ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f41637;
        C3072 c3072 = viewOnClickListenerC11499.f36173;
        if (c3072 == null) {
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
        if (c3072.m10026()) {
            return;
        }
        C3072 c3073 = viewOnClickListenerC11499.f36173;
        if (c3073 != null) {
            c3073.postDelayed(new Runnable() { // from class: l.ۤۡ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C12991.m32401(this.f34152, viewOnClickListenerC11499);
                }
            }, 300L);
        } else {
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32401(C12991 c12991, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        if (c12991.f41640) {
            C3072 c3072 = viewOnClickListenerC11499.f36173;
            if (c3072 != null) {
                c3072.m10021(true);
            } else {
                C15243.m36592("swipeRefreshLayout");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x017a A[LOOP:2: B:57:0x0174->B:59:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e3  */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        List list;
        HashMap map;
        Collator collator;
        boolean zM38855;
        String strM56409;
        HashMap map2;
        int iM34280;
        boolean zM34290;
        Comparator c2932;
        ArrayList arrayList;
        InterfaceC2386 interfaceC2386;
        String strSubstring;
        int i = Build.VERSION.SDK_INT;
        C7495 c7495 = this.f41641;
        if (i >= 30) {
            C4209 c4209 = C18379.f59876;
            String strM20218 = c7495.m20218();
            C15243.m36591(strM20218, "getPath(...)");
            C4209.m13459(strM20218);
        }
        List listMo10160 = c7495.mo10160();
        C15243.m36591(listMo10160, "list(...)");
        this.f41639 = listMo10160;
        if (i >= 30) {
            C4209 c42010 = C18379.f59876;
            C4209.m13459("");
        }
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f41637;
        try {
            if (viewOnClickListenerC11499.f36180 != 0) {
                if (!viewOnClickListenerC11499.f36171.isEmpty() || !viewOnClickListenerC11499.f36181.isEmpty()) {
                    InterfaceC20670 interfaceC20670Stream = C1170.stream(m32402());
                    final C19704 c19704 = new C19704(viewOnClickListenerC11499);
                    Object objCollect = interfaceC20670Stream.filter(new Predicate() { // from class: l.ܳۡ֫
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19025.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo7134negate() {
                            return C19025.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19025.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Boolean) c19704.invoke(obj)).booleanValue();
                        }
                    }).collect(C2025.toList());
                    C15243.m36591(objCollect, "collect(...)");
                    list = (List) objCollect;
                }
                if (!viewOnClickListenerC11499.f36197.isEmpty()) {
                    List listM32402 = m32402();
                    arrayList = new ArrayList();
                    for (Object obj : listM32402) {
                        interfaceC2386 = (InterfaceC2386) obj;
                        if (interfaceC2386.mo8092() && !interfaceC2386.isDirectory()) {
                            int i2 = ViewOnClickListenerC11499.f36169;
                            String name = interfaceC2386.getName();
                            C15243.m36591(name, "getName(...)");
                            List<String> list2 = viewOnClickListenerC11499.f36197;
                            if (!list2.isEmpty() && !list2.contains("*/*")) {
                                Locale locale = Locale.ROOT;
                                C15243.m36591(locale, "ROOT");
                                String lowerCase = name.toLowerCase(locale);
                                C15243.m36591(lowerCase, "toLowerCase(...)");
                                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                int iM3583 = C0878.m3583(lowerCase);
                                if (iM3583 == -1) {
                                    strSubstring = "";
                                } else {
                                    strSubstring = lowerCase.substring(iM3583 + 1, lowerCase.length());
                                    C15243.m36591(strSubstring, "substring(...)");
                                }
                                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(strSubstring);
                                if (mimeTypeFromExtension == null) {
                                    mimeTypeFromExtension = "application/octet-stream";
                                }
                                if (!list2.isEmpty()) {
                                    for (String str : list2) {
                                        if ((!C0878.m3575((CharSequence) str, '.') || !C0878.m3579(lowerCase, str, false)) && !str.equals(mimeTypeFromExtension) && (!C0878.m3579(str, "/*", false) || !mimeTypeFromExtension.startsWith(C0878.m3572(1, str)))) {
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.add(obj);
                    }
                    this.f41639 = arrayList;
                }
                map = new HashMap();
                collator = Collator.getInstance();
                zM38855 = C16356.m38855(m32402());
                for (InterfaceC2386 interfaceC2387 : m32402()) {
                    map.put(interfaceC2387.getName(), new C1441(collator, interfaceC2387.getName(), zM38855));
                }
                strM56409 = C25272.m56409("local:", c7495.m20193());
                map2 = C17423.f56652;
                if (map2.containsKey(strM56409)) {
                    Object obj2 = map2.get(strM56409);
                    C15243.m36586(obj2);
                    int iIntValue = ((Number) obj2).intValue();
                    iM34280 = C14118.m34280(iIntValue);
                    zM34290 = C14118.m34290(iIntValue);
                } else {
                    iM34280 = viewOnClickListenerC11499.f36193;
                    zM34290 = viewOnClickListenerC11499.f36179;
                }
                if (iM34280 != 0) {
                    c2932 = new C2932(map, zM34290);
                } else if (iM34280 != 1) {
                    c2932 = new C10389(map, zM34290, true);
                } else if (iM34280 != 2) {
                    c2932 = new C8898(map, zM34290);
                } else {
                    if (iM34280 == 3) {
                        throw new RuntimeException();
                    }
                    c2932 = new C7407(map, zM34290);
                }
                Collections.sort(m32402(), c2932);
                if (this.f41632 || !C8614.m23140(m32402(), viewOnClickListenerC11499.f36196)) {
                }
                this.f41638 = true;
                return;
            }
            Object objCollect2 = C1170.stream(m32402()).filter(new C0980(1, new C22688())).collect(C2025.toList());
            C15243.m36591(objCollect2, "collect(...)");
            list = (List) objCollect2;
            Collections.sort(m32402(), c2932);
        } catch (IllegalArgumentException e) {
            if (zM38855) {
                throw e;
            }
            map.clear();
            for (InterfaceC2386 interfaceC2388 : m32402()) {
                map.put(interfaceC2388.getName(), new C1441(collator, interfaceC2388.getName(), true));
            }
            Collections.sort(m32402(), c2932);
        }
        this.f41639 = list;
        if (!viewOnClickListenerC11499.f36197.isEmpty()) {
            List listM32403 = m32402();
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                interfaceC2386 = (InterfaceC2386) obj;
                if (interfaceC2386.mo8092()) {
                }
                arrayList.add(obj);
            }
            this.f41639 = arrayList;
        }
        map = new HashMap();
        collator = Collator.getInstance();
        zM38855 = C16356.m38855(m32402());
        while (r6.hasNext()) {
            map.put(interfaceC2387.getName(), new C1441(collator, interfaceC2387.getName(), zM38855));
        }
        strM56409 = C25272.m56409("local:", c7495.m20193());
        map2 = C17423.f56652;
        if (map2.containsKey(strM56409)) {
            Object obj3 = map2.get(strM56409);
            C15243.m36586(obj3);
            int iIntValue2 = ((Number) obj3).intValue();
            iM34280 = C14118.m34280(iIntValue2);
            zM34290 = C14118.m34290(iIntValue2);
        } else {
            iM34280 = viewOnClickListenerC11499.f36193;
            zM34290 = viewOnClickListenerC11499.f36179;
        }
        if (iM34280 != 0) {
            c2932 = new C2932(map, zM34290);
        } else if (iM34280 != 1) {
            c2932 = new C10389(map, zM34290, true);
        } else if (iM34280 != 2) {
            c2932 = new C8898(map, zM34290);
        } else {
            if (iM34280 == 3) {
                throw new RuntimeException();
            }
            c2932 = new C7407(map, zM34290);
        }
        if (this.f41632) {
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f41640 = false;
        if (this.f41636.mo23076().m8762(EnumC2619.CREATED)) {
            ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f41637;
            if (viewOnClickListenerC11499.f36175.get() != this.f41635) {
                return;
            }
            if (!this.f41632 || this.f41638) {
                ViewOnClickListenerC11499.m28911(viewOnClickListenerC11499, m32402());
                InterfaceC19479 interfaceC19479 = this.f41633;
                if (interfaceC19479 != null) {
                    interfaceC19479.mo4064();
                }
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f41640 = false;
        if (this.f41636.mo23076().m8762(EnumC2619.CREATED)) {
            ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f41637;
            if (viewOnClickListenerC11499.f36175.get() != this.f41635) {
                return;
            }
            viewOnClickListenerC11499.m40401(exc, (DialogInterface.OnDismissListener) null);
            if (this.f41634) {
                List list = Collections.EMPTY_LIST;
                C15243.m36591(list, "emptyList(...)");
                ViewOnClickListenerC11499.m28911(viewOnClickListenerC11499, list);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C3072 c3072 = this.f41637.f36173;
        if (c3072 != null) {
            c3072.m10021(false);
        } else {
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
    }
}
