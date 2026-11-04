package l;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: l.ۛܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9ISY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6434 implements InterfaceC25080 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final NavigableMap f21669;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f21670;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6434 m18209(Map map, Map map2) {
        if (map2.isEmpty() && map.isEmpty()) {
            return InterfaceC25080.f81106;
        }
        TreeMap treeMap = new TreeMap(C8627.reversed(C2661.comparingInt(new C7963())));
        treeMap.putAll(map2);
        return new C6434(map, treeMap);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6434 m18210() {
        return new C6434(Collections.EMPTY_MAP, C19609.of());
    }

    public C6434(Map map, NavigableMap navigableMap) {
        this.f21670 = map;
        this.f21669 = navigableMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11653 m18213(int i) {
        return (InterfaceC11653) this.f21669.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m18211(int i, BiFunction biFunction) {
        for (Map.Entry entry : this.f21669.headMap(Integer.valueOf(i), true).descendingMap().entrySet()) {
            Object objApply = biFunction.apply((Integer) entry.getKey(), (InterfaceC11653) entry.getValue());
            if (objApply != null) {
                return objApply;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final NavigableMap m18212() {
        return this.f21669;
    }

    public final String toString() {
        return "CodeMetadata{\nlines=" + this.f21670 + "\nannotations=\n " + C4123.m13221(this.f21669.descendingMap().entrySet(), "\n ") + "\n}";
    }
}
