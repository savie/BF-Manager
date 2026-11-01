package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14770 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C16576 f48296 = new C16576();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f48297;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f48298;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14770 m35395(C12343 c12343) {
        C16576 c16576 = f48296;
        C14770 c14770 = (C14770) c12343.m30656(c16576);
        if (c14770 != null) {
            return c14770;
        }
        C14770 c14771 = new C14770();
        c14771.f48297 = C21825.m48588();
        c14771.f48298 = new LinkedHashMap();
        c12343.m30659(c16576, c14771);
        return c14771;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35397(String str) {
        return (String) this.f48298.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35398(EnumC19730 enumC19730) {
        return (String) this.f48298.get(enumC19730.f63414);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35407(String str) {
        return this.f48298.get(str) != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35408(EnumC19730 enumC19730) {
        return this.f48298.get(enumC19730.f63414) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35402(EnumC19730 enumC19730, String str) {
        LinkedHashMap linkedHashMap = this.f48298;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC19730.f63414);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m35404(String str) {
        return this.f48298.get(str) == null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m35405(EnumC19730 enumC19730) {
        return this.f48298.get(enumC19730.f63414) == null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35409(EnumC19730 enumC19730, String str) {
        LinkedHashMap linkedHashMap = this.f48298;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC19730.f63414);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35401(String str, String str2) {
        this.f48298.put(str, str2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35403(EnumC19730 enumC19730, String str) {
        this.f48298.put(enumC19730.f63414, str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m35396(String str) {
        this.f48298.remove(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m35399() {
        return this.f48298.keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35400(Runnable runnable) {
        C21825 c21825 = this.f48297;
        c21825.getClass();
        this.f48297 = new C21825(runnable, c21825);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35406() {
        Iterator it = this.f48297.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
