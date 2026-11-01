package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class C13308 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44177 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f44178;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32800(C11897 c11897) {
        C13465.m32966(c11897, "item");
        ArrayList arrayList = this.f44177;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == c11897) {
                return i;
            }
        }
        return -1;
    }

    public C13308(String str) {
        this.f44178 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m32798() {
        return this.f44177;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m32814() {
        return this.f44178;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m32797() {
        return this.f44178 == null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m32809() {
        return C13465.m32965((Object) this.f44178, (Object) "\rH\rI\rS\r");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m32799() {
        Iterator it = this.f44177.iterator();
        while (it.hasNext()) {
            ((C11897) it.next()).m29672(false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11897 m32811(int i) {
        Object obj = this.f44177.get(i);
        C13465.m32967(obj, "get(...)");
        return (C11897) obj;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m32808() {
        return this.f44177.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32812(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f44177.addAll(0, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32805(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f44177.addAll(list);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m32807() {
        String str = this.f44178;
        if (str == null) {
            return C16737.m39288(R.string.MT_Protector);
        }
        return str.equals("\rH\rI\rS\r") ? C16737.m39288(R.string.MT_Protector) : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32804(String str) {
        if (!m32797()) {
            m32809();
        }
        this.f44178 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32803(int i, int i2) {
        m32809();
        C23520.m51798(i, i2, this.f44177);
        C23186.m51204();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32802(int i) {
        this.f44177.remove(i);
        C23186.m51204();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11897 m32810() {
        Object next;
        Iterator it = this.f44177.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C11897) next).m29673()) {
                return (C11897) next;
            }
        }
        next = null;
        return (C11897) next;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32801() {
        C4892.m13620(this.f44177, new C22480());
        C23186.f75232.mo23641(C7321.f24318);
        C23186.f75236.m51205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32806(C13308 c13308) {
        if (!m32809()) {
            c13308.m32809();
        }
        ArrayList<C11897> arrayList = this.f44177;
        for (C11897 c11897 : arrayList) {
            if (c11897.m29673()) {
                new C11897(c11897.m29681(), c11897.m29678()).m29671(c11897.m29679());
            }
        }
        ArrayList arrayList2 = c13308.f44177;
        ArrayList<C11897> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C11897) obj).m29673()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C4892.m13614((Iterable) arrayList3));
        for (C11897 c11898 : arrayList3) {
            C11897 c11899 = new C11897(c11898.m29681(), c11898.m29678());
            c11899.m29671(c11898.m29679());
            arrayList4.add(c11899);
        }
        arrayList2.addAll(arrayList4);
        C23186.f75232.mo23641(C7321.f24318);
        C23186.f75236.m51205();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32813(C13308 c13308) {
        if (!m32809()) {
            c13308.m32809();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f44177;
        for (Object obj : arrayList2) {
            if (((C11897) obj).m29673()) {
                arrayList.add(obj);
            }
        }
        C4892.m13620(arrayList2, new C1312());
        c13308.f44177.addAll(arrayList);
        C23186.f75232.mo23641(C7321.f24318);
        C23186.f75236.m51205();
    }
}
