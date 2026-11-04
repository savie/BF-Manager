package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OIUU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7830 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0372 f26099;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set f26100;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f26101;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicReference f26102;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9649 f26103;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0372 f26104;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9649 f26105;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16907 f26106;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7830 m21345(C7830 c7830, AbstractC14124 abstractC14124, AbstractC14124 abstractC14125) {
        C7830 c7831 = new C7830(c7830.f26100, c7830.f26104, c7830.f26099, c7830.f26106, c7830.f26103, c7830.f26105);
        AbstractC1118 abstractC1118M34294 = abstractC14124.m34294(c7831);
        c7831.f26101.set(abstractC14125.m34294(c7831));
        c7831.f26102.set(abstractC1118M34294);
        return c7831;
    }

    public C7830(C2551 c2551, C24018 c24018, C21943 c21943, C21943 c21944, List list, List list2) {
        boolean z = !((ArrayList) c21943.mo1986()).isEmpty();
        boolean z2 = !((ArrayList) c21944.mo1986()).isEmpty();
        C0701 c0701 = new C0701(c24018, z);
        C0701 c0702 = new C0701(c24018, z2);
        C19017 c19017 = new C19017(c21943, 0, 0);
        C19017 c19018 = new C19017(c21944, 0, 0);
        C3355 c3355 = new C3355(this, c0701, c19017);
        C3355 c3356 = new C3355(this, c0702, c19018);
        this.f26103 = new C9649(new HashSet(list));
        this.f26105 = new C9649(new HashSet(list2));
        this.f26106 = new C16907(c2551);
        this.f26102 = new AtomicReference(c3355);
        this.f26101 = new AtomicReference(c3356);
        this.f26100 = new HashSet();
        this.f26104 = new C0372();
        this.f26099 = new C0372();
    }

    public C7830(Set set, C0372 c0372, C0372 c0373, C16907 c16907, C9649 c9649, C9649 c96410) {
        this.f26102 = new AtomicReference();
        this.f26101 = new AtomicReference();
        this.f26100 = set;
        this.f26103 = c9649;
        this.f26105 = c96410;
        this.f26106 = c16907;
        this.f26104 = c0372;
        this.f26099 = c0373;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7830 m21346() {
        C7830 c7830 = new C7830(new HashSet(this.f26100), C0372.m2161(this.f26104), C0372.m2161(this.f26099), this.f26106, this.f26103, this.f26105);
        AbstractC1118 abstractC1118Mo4154 = m21353().mo4154(c7830);
        c7830.f26101.set(m21356().mo4154(c7830));
        c7830.f26102.set(abstractC1118Mo4154);
        return c7830;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC1118 m21353() {
        return (AbstractC1118) this.f26102.get();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC1118 m21356() {
        return (AbstractC1118) this.f26101.get();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Set m21351() {
        return this.f26100;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicReference m21355(AbstractC1118 abstractC1118) {
        AtomicReference atomicReference = this.f26102;
        if (atomicReference.get() == abstractC1118) {
            return atomicReference;
        }
        AtomicReference atomicReference2 = this.f26101;
        if (atomicReference2.get() == abstractC1118) {
            return atomicReference2;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9649 m21347(AbstractC1118 abstractC1118) {
        if (this.f26102.get() == abstractC1118) {
            return this.f26103;
        }
        if (this.f26101.get() == abstractC1118) {
            return this.f26105;
        }
        throw new C8597("Orphaned TraverserState node");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16907 m21352() {
        return this.f26106;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21348(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7830 c7830 = (C7830) it.next();
            this.f26100.addAll(c7830.f26100);
            C0372.m2162(this.f26104, c7830.f26104);
            C0372.m2162(this.f26099, c7830.f26099);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21349(C19017 c19017, int i) {
        C0372 c0372;
        if (this.f26103.m25166(c19017.m44106())) {
            c0372 = this.f26104;
        } else {
            c0372 = this.f26099;
        }
        c0372.getClass();
        C21943 c21943M44106 = c19017.m44106();
        if (c0372.containsKey(c21943M44106)) {
            C18271.m42422(c0372.get((Object) c21943M44106), c19017, i);
            return;
        }
        C18271 c18271 = new C18271(c21943M44106, 0);
        C18271.m42422(c18271, c19017, i);
        c0372.put(c21943M44106, c18271);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashSet m21350() {
        return m21344(this.f26104);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet m21354() {
        return m21344(this.f26099);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashSet m21344(C0372 c0372) {
        HashSet hashSet = new HashSet();
        for (C18271 c18271 : c0372.values()) {
            if (C18271.m42423(c18271)) {
                hashSet.add(c18271.f59611);
            }
        }
        return hashSet;
    }
}
