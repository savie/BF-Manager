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

/* JADX INFO: renamed from: l.᩺ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes.dex */
public final class C23186 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C9186 f75232;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f75233;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HandlerC6957 f75234;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final SharedPreferences f75235;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C23186 f75236;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f75237;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private final synchronized void m51175() {
        try {
            Iterator it = f75233.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ArrayList arrayListM32798 = ((C13308) it.next()).m32798();
                ArrayList<C11897> arrayList = new ArrayList();
                for (Object obj : arrayListM32798) {
                    if (((C11897) obj).m29659() != null) {
                        arrayList.add(obj);
                    }
                }
                for (C11897 c11897 : arrayList) {
                    C5546 c5546M29659 = c11897.m29659();
                    C13465.m32962(c5546M29659);
                    AbstractC12068 abstractC12068M15770 = C5717.m15770(c5546M29659.m15296());
                    if (abstractC12068M15770 == null) {
                        abstractC12068M15770 = C5717.m15759(c5546M29659.m15293());
                    }
                    if (abstractC12068M15770 != null && (abstractC12068M15770.f40385 != c5546M29659.m15296() || !C13465.m32965((Object) abstractC12068M15770.mo4700(), (Object) c5546M29659.m15293()))) {
                        c11897.m29667(c5546M29659.m15294(abstractC12068M15770));
                        System.out.println((Object) ("fix " + c11897.m29678() + " > " + abstractC12068M15770.getName() + " " + abstractC12068M15770.mo4705()));
                        z = true;
                    }
                }
            }
            if (z) {
                m51205();
            }
        } catch (ConcurrentModificationException unused) {
            C16737.m39267(200L, new RunnableC17519());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized void m51205() {
        f75234.removeMessages(0);
        try {
            try {
                C11018 c11018 = new C11018();
                c11018.writeInt(1647457332);
                ArrayList<C13308> arrayList = f75233;
                c11018.mo24508(arrayList.size());
                for (C13308 c13308 : arrayList) {
                    c11018.m27783(c13308.m32814());
                    if (c13308.m32809()) {
                        c11018.mo24508(0);
                    } else {
                        c11018.mo24508(c13308.m32798().size());
                        Iterator it = c13308.m32798().iterator();
                        while (it.hasNext()) {
                            ((C11897) it.next()).m29668(c11018);
                        }
                    }
                }
                byte[] bArrM27773 = c11018.m27773();
                ApplicationC0716.f2992.edit().mo4067("bookmarks_data_new", bArrM27773).apply();
                C4716.m13050(C23186.class, 1000L, new RunnableC22547(1, bArrM27773));
            } catch (IOException e) {
                Main mainM47527 = C21094.m47527();
                if (mainM47527 != null) {
                    mainM47527.m31002(e, (DialogInterface.OnDismissListener) null);
                }
            }
        } catch (ConcurrentModificationException unused) {
            f75234.sendEmptyMessage(0);
        }
    }

    static {
        Object next;
        Object next2;
        C23186 c23186 = new C23186();
        f75236 = c23186;
        ArrayList arrayList = new ArrayList();
        f75233 = arrayList;
        SharedPreferences sharedPreferences = C16737.m39277().getSharedPreferences("bookmarks", 0);
        f75235 = sharedPreferences;
        f75232 = new C9186();
        f75237 = new ConcurrentMapC13783();
        f75234 = new HandlerC6957();
        C5717.m15764(new C16814());
        if (ApplicationC0716.f2992.contains("bookmarks_data_new") || sharedPreferences.contains("backup")) {
            if (!m51201(ApplicationC0716.f2992.mo16347("bookmarks_data_new", (byte[]) null))) {
                try {
                    byte[] bArrDecode = Base64.decode(sharedPreferences.getString("backup", ""), 0);
                    int i = C18019.f57618;
                    byte[] bArrM41969 = C18019.m41969(bArrDecode, bArrDecode.length);
                    if (m51201(bArrM41969)) {
                        ApplicationC0716.f2992.edit().mo4067("bookmarks_data_new", bArrM41969).apply();
                    }
                } catch (Exception e) {
                    Main mainM47527 = C21094.m47527();
                    if (mainM47527 != null) {
                        mainM47527.m31002(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            }
        } else if (ApplicationC0716.f2992.contains("bookmarks_data")) {
            C13308 c13308 = new C13308(null);
            arrayList.add(c13308);
            byte[] bArrMo16347 = ApplicationC0716.f2992.mo16347("bookmarks_data", (byte[]) null);
            if (bArrMo16347 != null && bArrMo16347.length >= 6) {
                C17367 c17367 = new C17367(bArrMo16347);
                if (c17367.readInt() == 1647457332) {
                    int iM40462 = c17367.m40462();
                    for (int i2 = 0; i2 < iM40462; i2++) {
                        c13308.m32798().add(new C11897(c17367.m40458(), c17367.m40458()));
                    }
                    ApplicationC0716.f2992.edit().remove("bookmarks_data");
                    c23186.m51205();
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C13308("\rH\rI\rS\r"));
            arrayList.add(new C13308(null));
        } else {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C13308) next).m32809());
            if (((C13308) next) == null) {
                arrayList.add(0, new C13308("\rH\rI\rS\r"));
                C7321 c7321 = C7321.f24318;
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((C13308) next2).m32797());
            if (((C13308) next2) == null) {
                arrayList.add(new C13308(null));
            }
        }
        String string = sharedPreferences.getString("history", null);
        if (string != null) {
            try {
                C13308 c13308M51206 = m51206();
                C17367 c17367M40441 = C17367.m40441(Base64.decode(string, 0));
                C20190.m45649((InterfaceC0433) c17367M40441, 1647457332);
                int iM40463 = c17367M40441.m40462();
                c13308M51206.m32798().clear();
                for (int i3 = 0; i3 < iM40463; i3++) {
                    c13308M51206.m32798().add(C4840.m13432(c17367M40441));
                }
            } catch (Exception unused) {
            }
        }
        f75232.mo23641(C7321.f24318);
        m51173();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final void m51207() {
        synchronized (f75236) {
            f75234.removeMessages(1);
            try {
                C13308 c13308M51206 = m51206();
                C11018 c11018 = new C11018();
                c11018.writeInt(1647457332);
                c11018.mo24508(c13308M51206.m32798().size());
                Iterator it = c13308M51206.m32798().iterator();
                while (it.hasNext()) {
                    ((C11897) it.next()).m29668(c11018);
                }
                f75235.edit().putString("history", Base64.encodeToString(c11018.m27798(), 0)).apply();
            } catch (IOException e) {
                Main mainM47527 = C21094.m47527();
                if (mainM47527 != null) {
                    mainM47527.m31002(e, (DialogInterface.OnDismissListener) null);
                }
            } catch (ConcurrentModificationException unused) {
                f75234.sendEmptyMessage(1);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51183(String str, C5546 c5546) {
        C13465.m32966(str, MotionUtils.EASING_TYPE_PATH);
        if (ApplicationC0716.f2992.getBoolean("eph", true)) {
            if (str.length() > 1 && C12529.m31139(str, "/", false)) {
                str = str.substring(0, str.length() - 1);
                C13465.m32967(str, "substring(...)");
            }
            String strM18161 = C6730.m18161(str);
            C13465.m32967(strM18161, "getFriendlyName(...)");
            C11897 c11897 = new C11897(strM18161, str);
            c11897.m29667(c5546);
            C13308 c13308M51206 = m51206();
            synchronized (c13308M51206.m32798()) {
                ArrayList arrayListM32798 = c13308M51206.m32798();
                C13465.m32966(arrayListM32798, "<this>");
                if (c11897.equals(arrayListM32798.isEmpty() ? null : arrayListM32798.get(0))) {
                    return;
                }
                c13308M51206.m32798().remove(c11897);
                c13308M51206.m32798().add(0, c11897);
                while (c13308M51206.m32798().size() > 80) {
                    c13308M51206.m32798().remove(c13308M51206.m32798().size() - 1);
                }
                C7321 c7321 = C7321.f24318;
                f75232.mo23641(C7321.f24318);
                f75236.m51193();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51184(String str, C5546 c5546, int i) {
        C13465.m32966(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C12529.m31139(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C13465.m32967(str, "substring(...)");
        }
        String strM18161 = C6730.m18161(str);
        C13465.m32967(strM18161, "getFriendlyName(...)");
        C11897 c11897 = new C11897(strM18161, str);
        c11897.m29667(c5546);
        m51181(i, C4892.m13617(c11897));
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C11897 m51196(String str, C5546 c5546) {
        C13465.m32966(str, MotionUtils.EASING_TYPE_PATH);
        if (str.length() > 1 && C12529.m31139(str, "/", false)) {
            str = str.substring(0, str.length() - 1);
            C13465.m32967(str, "substring(...)");
        }
        String strM18161 = C6730.m18161(str);
        C13465.m32967(strM18161, "getFriendlyName(...)");
        C11897 c11897 = new C11897(strM18161, str);
        c11897.m29667(c5546);
        return c11897;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51176() {
        f75236.m51175();
        m51173();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C13308 m51202() {
        for (C13308 c13308 : f75233) {
            if (c13308.m32797()) {
                return c13308;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13308 m51206() {
        for (C13308 c13308 : f75233) {
            if (c13308.m32809()) {
                return c13308;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final List m51208() {
        List listUnmodifiableList = C0561.unmodifiableList(f75233);
        C13465.m32967(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C4134[] m51191() {
        ArrayList<C13308> arrayList = f75233;
        ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
        int i = 0;
        for (C13308 c13308 : arrayList) {
            int i2 = i + 1;
            if (!c13308.m32809()) {
                arrayList2.add(new C4134(c13308, i));
            }
            i = i2;
        }
        return (C4134[]) arrayList2.toArray(new C4134[0]);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int m51203() {
        return f75233.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C13308 m51197(int i) {
        Object obj = f75233.get(i);
        C13465.m32967(obj, "get(...)");
        return (C13308) obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final boolean m51200(String str) {
        Iterator it = f75233.iterator();
        C13465.m32967(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            C13465.m32967(next, "next(...)");
            if (str.equals(((C13308) next).m32807())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51180(int i, String str) {
        ((C13308) f75233.get(i)).m32804(str);
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51182(String str) {
        f75233.add(new C13308(str));
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51178(int i, int i2) {
        Collections.swap(f75233, i, i2);
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51177(int i) {
        ArrayList arrayList = f75233;
        Object obj = arrayList.get(i);
        C13465.m32967(obj, "get(...)");
        C13308 c13308 = (C13308) obj;
        if (!c13308.m32797()) {
            c13308.m32809();
        }
        m51202().m32798().addAll(c13308.m32798());
        arrayList.remove(i);
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final void m51173() {
        C4716.f16636.execute(new RunnableC12581());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51188(C13308 c13308, ArrayList arrayList) {
        synchronized (c13308.m32798()) {
            c13308.m32798().removeAll(arrayList);
        }
        f75232.mo23641(C7321.f24318);
        f75236.m51193();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final void m51195() {
        C13308 c13308M51206 = m51206();
        synchronized (c13308M51206.m32798()) {
            c13308M51206.m32798().clear();
            C7321 c7321 = C7321.f24318;
        }
        f75232.mo23641(C7321.f24318);
        f75236.m51193();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51181(int i, List list) {
        C13308 c13308M51202;
        if (i >= 0) {
            ArrayList arrayList = f75233;
            if (i < arrayList.size() && !((C13308) arrayList.get(i)).m32809()) {
                Object obj = arrayList.get(i);
                C13465.m32962(obj);
                c13308M51202 = (C13308) obj;
            } else {
                c13308M51202 = m51202();
            }
        } else {
            c13308M51202 = m51202();
        }
        if (ApplicationC0716.f2988.getBoolean("bookmark_add_to_top", true)) {
            c13308M51202.m32812(list);
        } else {
            c13308M51202.m32805(list);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51179(int i, int i2, int i3) {
        ArrayList arrayList = f75233;
        ((C13308) arrayList.get(i)).m32809();
        ((C13308) arrayList.get(i2)).m32809();
        Object objRemove = ((C13308) arrayList.get(i)).m32798().remove(i3);
        C13465.m32967(objRemove, "removeAt(...)");
        ((C13308) arrayList.get(i2)).m32798().add((C11897) objRemove);
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51186(ArrayList arrayList, int i) {
        m51181(i, arrayList);
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51198() {
        f75236.m51175();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51187(AbstractActivityC12483 abstractActivityC12483, InterfaceC10597 interfaceC10597) {
        f75232.m44959(abstractActivityC12483, interfaceC10597);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final void m51192() {
        try {
            Iterator it = f75233.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C13308) it.next()).m32798().iterator();
                while (it2.hasNext()) {
                    ((C11897) it2.next()).m29675();
                }
            }
        } catch (ConcurrentModificationException unused) {
            C16737.m39267(200L, new RunnableC6230());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m51201(byte[] bArr) {
        ArrayList arrayList = f75233;
        if (bArr != null && bArr.length >= 6) {
            C17367 c17367 = new C17367(bArr);
            try {
                C20190.m45649((InterfaceC0433) c17367, 1647457332);
                int iM40462 = c17367.m40462();
                for (int i = 0; i < iM40462; i++) {
                    String strM40448 = c17367.m40448();
                    int iM40463 = c17367.m40462();
                    C13308 c13308 = new C13308(strM40448);
                    arrayList.add(c13308);
                    for (int i2 = 0; i2 < iM40463; i2++) {
                        c13308.m32798().add(C4840.m13432(c17367));
                    }
                }
                return true;
            } catch (Throwable th) {
                arrayList.clear();
                Main mainM47527 = C21094.m47527();
                if (mainM47527 != null) {
                    mainM47527.m31002(th, (DialogInterface.OnDismissListener) null);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final void m51204() {
        HandlerC6957 handlerC6957 = f75234;
        handlerC6957.removeMessages(0);
        handlerC6957.sendEmptyMessageDelayed(0, 2000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51189(byte[] bArr) {
        SharedPreferences.Editor editorEdit = f75235.edit();
        int i = C18019.f57618;
        editorEdit.putString("backup", Base64.encodeToString(C18019.m41965(0, bArr.length, bArr), 0)).apply();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private final void m51193() {
        HandlerC6957 handlerC6957 = f75234;
        handlerC6957.removeMessages(1);
        handlerC6957.sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m51199(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(C4892.m13614((Iterable) arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m51196((String) it.next(), (C5546) null));
        }
        m51181(i, arrayList2);
        f75232.mo23641(C7321.f24318);
        f75236.m51205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51185(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && !((C13308) it.next()).m32797()) {
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && !((C13308) it2.next()).m32809()) {
            }
        }
        ArrayList arrayList2 = f75233;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        f75236.m51205();
        f75232.mo23641(C7321.f24318);
    }
}
