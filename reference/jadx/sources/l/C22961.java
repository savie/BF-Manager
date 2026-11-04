package l;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Base64;
import bin.mt.plus.Main;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes.dex */
public final class C22961 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f74586;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final SharedPreferences f74587;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f74588;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final HandlerC11026 f74589;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C22961 f74590;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C17930 f74591;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final synchronized void m51785() {
        try {
            Iterator it = f74586.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ArrayList arrayListM15323 = ((C5061) it.next()).m15323();
                ArrayList<C9622> arrayList = new ArrayList();
                for (Object obj : arrayListM15323) {
                    if (((C9622) obj).m25121() != null) {
                        arrayList.add(obj);
                    }
                }
                for (C9622 c9622 : arrayList) {
                    C8877 c8877M25121 = c9622.m25121();
                    C15243.m36586(c8877M25121);
                    AbstractC0148 abstractC0148M20792 = C7606.m20792(c8877M25121.m23755());
                    if (abstractC0148M20792 == null) {
                        abstractC0148M20792 = C7606.m20782(c8877M25121.m23752());
                    }
                    if (abstractC0148M20792 != null && (abstractC0148M20792.f1127 != c8877M25121.m23755() || !C15243.m36589((Object) abstractC0148M20792.mo1325(), (Object) c8877M25121.m23752()))) {
                        c9622.m25109(c8877M25121.m23753(abstractC0148M20792));
                        System.out.println((Object) ("fix " + c9622.m25117() + " > " + abstractC0148M20792.getName() + " " + abstractC0148M20792.mo1333()));
                        z = true;
                    }
                }
            }
            if (z) {
                m51811();
            }
        } catch (ConcurrentModificationException unused) {
            C21576.m49062(200L, new RunnableC14843());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized void m51811() {
        try {
            f74589.removeMessages(0);
            try {
                try {
                    C6178 c6178 = new C6178();
                    c6178.writeInt(1647457332);
                    ArrayList<C5061> arrayList = f74586;
                    c6178.mo17812(arrayList.size());
                    for (C5061 c5061 : arrayList) {
                        c6178.m17787(c5061.m15317());
                        if (c5061.m15314()) {
                            c6178.mo17812(0);
                        } else {
                            c6178.mo17812(c5061.m15323().size());
                            Iterator it = c5061.m15323().iterator();
                            while (it.hasNext()) {
                                ((C9622) it.next()).m25108(c6178);
                            }
                        }
                    }
                    byte[] bArrM17796 = c6178.m17796();
                    ApplicationC17729.f58258.edit().mo3488("bookmarks_data_new", bArrM17796).apply();
                    C5261.m15835(C22961.class, 1000L, new RunnableC4839(2, bArrM17796));
                } catch (IOException e) {
                    Main mainM18052 = C6331.m18052();
                    if (mainM18052 != null) {
                        mainM18052.m40401(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            } catch (ConcurrentModificationException unused) {
                f74589.sendEmptyMessage(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    static {
        Object next;
        Object next2;
        C22961 c22961 = new C22961();
        f74590 = c22961;
        ArrayList arrayList = new ArrayList();
        f74586 = arrayList;
        SharedPreferences sharedPreferences = C21576.m49084().getSharedPreferences("bookmarks", 0);
        f74587 = sharedPreferences;
        f74591 = new C17930();
        f74588 = new ConcurrentMapC17249();
        f74589 = new HandlerC11026();
        C7606.m20789(new C24541());
        if (ApplicationC17729.f58258.contains("bookmarks_data_new") || sharedPreferences.contains("backup")) {
            if (!m51817(ApplicationC17729.f58258.mo7903("bookmarks_data_new", (byte[]) null))) {
                try {
                    byte[] bArrDecode = Base64.decode(sharedPreferences.getString("backup", ""), 0);
                    int i = C15768.f51344;
                    byte[] bArrM37707 = C15768.m37707(bArrDecode, bArrDecode.length);
                    if (m51817(bArrM37707)) {
                        ApplicationC17729.f58258.edit().mo3488("bookmarks_data_new", bArrM37707).apply();
                    }
                } catch (Exception e) {
                    Main mainM18052 = C6331.m18052();
                    if (mainM18052 != null) {
                        mainM18052.m40401(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            }
        } else if (ApplicationC17729.f58258.contains("bookmarks_data")) {
            C5061 c5061 = new C5061(null);
            arrayList.add(c5061);
            byte[] bArrMo7903 = ApplicationC17729.f58258.mo7903("bookmarks_data", (byte[]) null);
            if (bArrMo7903 != null && bArrMo7903.length >= 6) {
                C20348 c20348 = new C20348(bArrMo7903);
                if (c20348.readInt() == 1647457332) {
                    int iM46749 = c20348.m46749();
                    for (int i2 = 0; i2 < iM46749; i2++) {
                        c5061.m15323().add(new C9622(c20348.m46758(), c20348.m46758()));
                    }
                    ApplicationC17729.f58258.edit().remove("bookmarks_data");
                    c22961.m51811();
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C5061("\rH\rI\rS\r"));
            arrayList.add(new C5061(null));
        } else {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C5061) next).m15314());
            if (((C5061) next) == null) {
                arrayList.add(0, new C5061("\rH\rI\rS\r"));
                C11471 c11471 = C11471.f36082;
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((C5061) next2).m15316());
            if (((C5061) next2) == null) {
                arrayList.add(new C5061(null));
            }
        }
        String string = sharedPreferences.getString("history", null);
        if (string != null) {
            try {
                C5061 c5061M51809 = m51809();
                C20348 c20348M46740 = C20348.m46740(Base64.decode(string, 0));
                C17364.m40795((InterfaceC15872) c20348M46740, 1647457332);
                int iM467410 = c20348M46740.m46749();
                c5061M51809.m15323().clear();
                for (int i3 = 0; i3 < iM467410; i3++) {
                    c5061M51809.m15323().add(C10368.m26672(c20348M46740));
                }
            } catch (Exception unused) {
            }
        }
        f74591.mo40348(C11471.f36082);
        m51805();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final void m51806() {
        synchronized (f74590) {
            f74589.removeMessages(1);
            try {
                C5061 c5061M51809 = m51809();
                C6178 c6178 = new C6178();
                c6178.writeInt(1647457332);
                c6178.mo17812(c5061M51809.m15323().size());
                Iterator it = c5061M51809.m15323().iterator();
                while (it.hasNext()) {
                    ((C9622) it.next()).m25108(c6178);
                }
                f74587.edit().putString("history", Base64.encodeToString(c6178.m17799(), 0)).apply();
            } catch (IOException e) {
                Main mainM18052 = C6331.m18052();
                if (mainM18052 != null) {
                    mainM18052.m40401(e, (DialogInterface.OnDismissListener) null);
                }
            } catch (ConcurrentModificationException unused) {
                f74589.sendEmptyMessage(1);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51794(String str, C8877 c8877) {
        C15243.m36590(str, MotionUtils.EASING_TYPE_PATH);
        if (ApplicationC17729.f58258.getBoolean("eph", true)) {
            if (str.length() > 1 && C0878.m3579(str, "/", false)) {
                str = str.substring(0, str.length() - 1);
                C15243.m36591(str, "substring(...)");
            }
            String strM28548 = C11293.m28548(str);
            C15243.m36591(strM28548, "getFriendlyName(...)");
            C9622 c9622 = new C9622(strM28548, str);
            c9622.m25109(c8877);
            C5061 c5061M51809 = m51809();
            synchronized (c5061M51809.m15323()) {
                ArrayList arrayListM15323 = c5061M51809.m15323();
                C15243.m36590(arrayListM15323, "<this>");
                if (c9622.equals(arrayListM15323.isEmpty() ? null : arrayListM15323.get(0))) {
                    return;
                }
                c5061M51809.m15323().remove(c9622);
                c5061M51809.m15323().add(0, c9622);
                while (c5061M51809.m15323().size() > 80) {
                    c5061M51809.m15323().remove(c5061M51809.m15323().size() - 1);
                }
                C11471 c11471 = C11471.f36082;
                f74591.mo40348(C11471.f36082);
                f74590.m51804();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51795(String str, C8877 c8877, int i) {
        C15243.m36590(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C0878.m3579(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C15243.m36591(str, "substring(...)");
        }
        String strM28548 = C11293.m28548(str);
        C15243.m36591(strM28548, "getFriendlyName(...)");
        C9622 c9622 = new C9622(strM28548, str);
        c9622.m25109(c8877);
        m51792(i, C7743.m21087(c9622));
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C9622 m51813(String str, C8877 c8877) {
        C15243.m36590(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C0878.m3579(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C15243.m36591(str, "substring(...)");
        }
        String strM28548 = C11293.m28548(str);
        C15243.m36591(strM28548, "getFriendlyName(...)");
        C9622 c9622 = new C9622(strM28548, str);
        c9622.m25109(c8877);
        return c9622;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51787() {
        f74590.m51785();
        m51805();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C5061 m51808() {
        for (C5061 c5061 : f74586) {
            if (c5061.m15316()) {
                return c5061;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C5061 m51809() {
        for (C5061 c5061 : f74586) {
            if (c5061.m15314()) {
                return c5061;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final List m51820() {
        List listUnmodifiableList = C4681.unmodifiableList(f74586);
        C15243.m36591(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C22215[] m51803() {
        ArrayList<C5061> arrayList = f74586;
        ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
        int i = 0;
        for (C5061 c5061 : arrayList) {
            int i2 = i + 1;
            if (!c5061.m15314()) {
                arrayList2.add(new C22215(c5061, i));
            }
            i = i2;
        }
        return (C22215[]) arrayList2.toArray(new C22215[0]);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int m51807() {
        return f74586.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C5061 m51812(int i) {
        Object obj = f74586.get(i);
        C15243.m36591(obj, "get(...)");
        return (C5061) obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final boolean m51816(String str) {
        Iterator it = f74586.iterator();
        C15243.m36591(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            C15243.m36591(next, "next(...)");
            if (str.equals(((C5061) next).m15318())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51791(int i, String str) {
        ((C5061) f74586.get(i)).m15311(str);
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51793(String str) {
        f74586.add(new C5061(str));
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51789(int i, int i2) {
        Collections.swap(f74586, i, i2);
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51788(int i) {
        ArrayList arrayList = f74586;
        Object obj = arrayList.get(i);
        C15243.m36591(obj, "get(...)");
        C5061 c5061 = (C5061) obj;
        if (!c5061.m15316()) {
            c5061.m15314();
        }
        m51808().m15323().addAll(c5061.m15323());
        arrayList.remove(i);
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final void m51805() {
        C5261.f18540.execute(new RunnableC4403());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51798(C5061 c5061, ArrayList arrayList) {
        synchronized (c5061.m15323()) {
            c5061.m15323().removeAll(arrayList);
        }
        f74591.mo40348(C11471.f36082);
        f74590.m51804();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final void m51801() {
        C5061 c5061M51809 = m51809();
        synchronized (c5061M51809.m15323()) {
            c5061M51809.m15323().clear();
            C11471 c11471 = C11471.f36082;
        }
        f74591.mo40348(C11471.f36082);
        f74590.m51804();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51792(int i, List list) {
        C5061 c5061M51808;
        if (i >= 0) {
            ArrayList arrayList = f74586;
            if (i < arrayList.size() && !((C5061) arrayList.get(i)).m15314()) {
                Object obj = arrayList.get(i);
                C15243.m36586(obj);
                c5061M51808 = (C5061) obj;
            } else {
                c5061M51808 = m51808();
            }
        } else {
            c5061M51808 = m51808();
        }
        if (ApplicationC17729.f58262.getBoolean("bookmark_add_to_top", true)) {
            c5061M51808.m15321(list);
        } else {
            c5061M51808.m15312(list);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51790(int i, int i2, int i3) {
        ArrayList arrayList = f74586;
        ((C5061) arrayList.get(i)).m15314();
        ((C5061) arrayList.get(i2)).m15314();
        Object objRemove = ((C5061) arrayList.get(i)).m15323().remove(i3);
        C15243.m36591(objRemove, "removeAt(...)");
        ((C5061) arrayList.get(i2)).m15323().add((C9622) objRemove);
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51797(ArrayList arrayList, int i) {
        m51792(i, arrayList);
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51814() {
        f74590.m51785();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51799(AbstractActivityC17204 abstractActivityC17204, InterfaceC16438 interfaceC16438) {
        f74591.m40350(abstractActivityC17204, interfaceC16438);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final void m51786() {
        try {
            Iterator it = f74586.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C5061) it.next()).m15323().iterator();
                while (it2.hasNext()) {
                    ((C9622) it2.next()).m25120();
                }
            }
        } catch (ConcurrentModificationException unused) {
            C21576.m49062(200L, new RunnableC20849(1));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m51817(byte[] bArr) {
        ArrayList arrayList = f74586;
        if (bArr != null && bArr.length >= 6) {
            C20348 c20348 = new C20348(bArr);
            try {
                C17364.m40795((InterfaceC15872) c20348, 1647457332);
                int iM46749 = c20348.m46749();
                for (int i = 0; i < iM46749; i++) {
                    String strM46742 = c20348.m46742();
                    int iM467410 = c20348.m46749();
                    C5061 c5061 = new C5061(strM46742);
                    arrayList.add(c5061);
                    for (int i2 = 0; i2 < iM467410; i2++) {
                        c5061.m15323().add(C10368.m26672(c20348));
                    }
                }
                return true;
            } catch (Throwable th) {
                arrayList.clear();
                Main mainM18052 = C6331.m18052();
                if (mainM18052 != null) {
                    mainM18052.m40401(th, (DialogInterface.OnDismissListener) null);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final void m51819() {
        HandlerC11026 handlerC11026 = f74589;
        handlerC11026.removeMessages(0);
        handlerC11026.sendEmptyMessageDelayed(0, 2000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51800(byte[] bArr) {
        SharedPreferences.Editor editorEdit = f74587.edit();
        int i = C15768.f51344;
        editorEdit.putString("backup", Base64.encodeToString(C15768.m37703(0, bArr.length, bArr), 0)).apply();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final void m51804() {
        HandlerC11026 handlerC11026 = f74589;
        handlerC11026.removeMessages(1);
        handlerC11026.sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m51815(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(C7743.m21084((Iterable) arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m51813((String) it.next(), (C8877) null));
        }
        m51792(i, arrayList2);
        f74591.mo40348(C11471.f36082);
        f74590.m51811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51796(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && !((C5061) it.next()).m15316()) {
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && !((C5061) it2.next()).m15314()) {
            }
        }
        ArrayList arrayList2 = f74586;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        f74590.m51811();
        f74591.mo40348(C11471.f36082);
    }
}
