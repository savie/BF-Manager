package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIVL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18807 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24927 f61080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18807 f61081;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f61082;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f61083;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f61084;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f61085;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0162 f61086;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f61087;

    public C18807(C24927 c24927, C0162 c0162) {
        List list = Collections.EMPTY_LIST;
        this.f61085 = list;
        this.f61087 = list;
        this.f61082 = list;
        this.f61083 = list;
        this.f61086 = c0162;
        this.f61080 = c24927;
        this.f61081 = null;
    }

    public C18807(C24927 c24927, C18807 c18807) {
        List list = Collections.EMPTY_LIST;
        this.f61085 = list;
        this.f61087 = list;
        this.f61082 = list;
        this.f61083 = list;
        this.f61086 = null;
        this.f61080 = c24927;
        this.f61081 = c18807;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43606() {
        InterfaceC23283 interfaceC23283M55551;
        synchronized (this) {
            interfaceC23283M55551 = null;
            if (!this.f61084) {
                if (!this.f61080.getState().m19341()) {
                    interfaceC23283M55551 = this.f61080.m55551();
                }
                m43605();
            }
        }
        if (interfaceC23283M55551 == null) {
            interfaceC23283M55551 = this.f61080.m55551();
        }
        return interfaceC23283M55551.mo45712();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m43605() {
        C9856 c9856M40966;
        this.f61084 = true;
        C0162 c0162M43608 = m43608();
        int size = this.f61080.m55534().size();
        if (size != 0) {
            ArrayList arrayList = new ArrayList(size);
            for (C24927 c24927 : this.f61080.m55534()) {
                if (!c24927.mo17865(EnumC1763.DONT_GENERATE)) {
                    C18807 c18807M1367 = c0162M43608.m1367(c24927);
                    c18807M1367.m43605();
                    arrayList.add(c18807M1367);
                }
            }
            this.f61085 = C4681.unmodifiableList(arrayList);
        }
        int size2 = this.f61080.m55582().size();
        if (size2 != 0) {
            ArrayList arrayList2 = new ArrayList(size2);
            Iterator it = this.f61080.m55582().iterator();
            while (it.hasNext()) {
                C18807 c18807M1368 = c0162M43608.m1367((C24927) it.next());
                c18807M1368.m43605();
                arrayList2.add(c18807M1368);
            }
            this.f61087 = C4681.unmodifiableList(arrayList2);
        }
        int size3 = this.f61080.getFields().size();
        if (size3 != 0) {
            ArrayList arrayList3 = new ArrayList(size3);
            for (C17467 c17467 : this.f61080.getFields()) {
                if (!c17467.mo17865(EnumC1763.DONT_GENERATE)) {
                    synchronized (c0162M43608) {
                        c9856M40966 = c17467.m40966();
                        if (c9856M40966 == null) {
                            c0162M43608.m1367(c17467.m40972());
                            c9856M40966 = new C9856(c17467);
                            c17467.m40965(c9856M40966);
                        }
                    }
                    arrayList3.add(c9856M40966);
                }
            }
            this.f61082 = C4681.unmodifiableList(arrayList3);
        }
        int size4 = this.f61080.getMethods().size();
        if (size4 != 0) {
            ArrayList arrayList4 = new ArrayList(size4);
            for (C2551 c2551 : this.f61080.getMethods()) {
                if (!c2551.mo17865(EnumC1763.DONT_GENERATE)) {
                    arrayList4.add(c0162M43608.m1364(c2551));
                }
            }
            C12884.sort(arrayList4, C2661.comparing(new C7620(0)));
            this.f61083 = C4681.unmodifiableList(arrayList4);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0162 m43608() {
        C18807 c18807 = this.f61081;
        if (c18807 != null) {
            return c18807.m43608();
        }
        C0162 c0162 = this.f61086;
        C17359.requireNonNull(c0162);
        return c0162;
    }

    public final String toString() {
        return this.f61080.m55568();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0908 m43607(String str) {
        C2551 c2551M55570 = this.f61080.m55570(str);
        if (c2551M55570 == null) {
            return null;
        }
        return m43608().m1364(c2551M55570);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18807) {
            return this.f61080.equals(((C18807) obj).f61080);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61080.hashCode();
    }
}
