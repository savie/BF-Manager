package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷᩶۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A41J */
/* JADX INFO: loaded from: classes4.dex */
public final class C21098 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Set f68738;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f68734 = C0561.unmodifiableSet(EnumSet.of(EnumC1923.CONSTRUCTOR));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Set f68737 = C0561.unmodifiableSet(EnumSet.of(EnumC1923.FIELD, EnumC1923.ENUM_CONSTANT));

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Set f68736 = C0561.unmodifiableSet(EnumSet.of(EnumC1923.METHOD));

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Set f68735 = C0561.unmodifiableSet(EnumSet.of(EnumC1923.PACKAGE));

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Set f68733 = C0561.unmodifiableSet(EnumSet.of(EnumC1923.MODULE));

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Set f68732 = C0561.unmodifiableSet(EnumSet.of(EnumC1923.CLASS, EnumC1923.ENUM, EnumC1923.INTERFACE, EnumC1923.RECORD, EnumC1923.ANNOTATION_TYPE));

    static {
        Object[] objArr = {EnumC1923.RECORD_COMPONENT};
        HashSet hashSet = new HashSet(1);
        Object obj = objArr[0];
        C13638.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
        }
        f68738 = C0561.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m47533(List list) {
        return m47532(list, f68734);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m47534(List list) {
        return m47532(list, f68736);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m47532(Iterable iterable, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC14625 interfaceC14625 = (InterfaceC14625) it.next();
            if (set.contains(interfaceC14625.mo17325())) {
                arrayList.add((InterfaceC14625) InterfaceC9686.class.cast(interfaceC14625));
            }
        }
        return arrayList;
    }
}
