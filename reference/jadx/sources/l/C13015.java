package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.۫ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13015 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C13477 f41681 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f41682;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f41683;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13015 m32421(C4747 c4747) {
        C13477 c13477 = f41681;
        C13015 c13015 = (C13015) c4747.m14643(c13477);
        if (c13015 != null) {
            return c13015;
        }
        C13015 c13016 = new C13015();
        c13016.f41682 = C14769.m35543();
        c13016.f41683 = new LinkedHashMap();
        c4747.m14646(c13477, c13016);
        return c13016;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32422(String str) {
        return (String) this.f41683.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32423(EnumC7687 enumC7687) {
        return (String) this.f41683.get(enumC7687.f25368);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32432(String str) {
        return this.f41683.get(str) != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32433(EnumC7687 enumC7687) {
        return this.f41683.get(enumC7687.f25368) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32427(EnumC7687 enumC7687, String str) {
        LinkedHashMap linkedHashMap = this.f41683;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC7687.f25368);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) != null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m32429(String str) {
        return this.f41683.get(str) == null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m32430(EnumC7687 enumC7687) {
        return this.f41683.get(enumC7687.f25368) == null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32434(EnumC7687 enumC7687, String str) {
        LinkedHashMap linkedHashMap = this.f41683;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC7687.f25368);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32426(String str, String str2) {
        this.f41683.put(str, str2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32428(EnumC7687 enumC7687, String str) {
        this.f41683.put(enumC7687.f25368, str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32435(String str) {
        this.f41683.remove(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m32424() {
        return this.f41683.keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32425(Runnable runnable) {
        C14769 c14769 = this.f41682;
        c14769.getClass();
        this.f41682 = new C14769(runnable, c14769);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32431() {
        Iterator it = this.f41682.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
