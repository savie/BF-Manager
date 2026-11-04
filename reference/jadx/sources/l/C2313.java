package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A41J */
/* JADX INFO: loaded from: classes2.dex */
public final class C2313 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f7481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f7478 = C4681.unmodifiableSet(EnumSet.of(EnumC5296.CONSTRUCTOR));

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Set f7483 = C4681.unmodifiableSet(EnumSet.of(EnumC5296.FIELD, EnumC5296.ENUM_CONSTANT));

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Set f7479 = C4681.unmodifiableSet(EnumSet.of(EnumC5296.METHOD));

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Set f7482 = C4681.unmodifiableSet(EnumSet.of(EnumC5296.PACKAGE));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Set f7484 = C4681.unmodifiableSet(EnumSet.of(EnumC5296.MODULE));

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Set f7480 = C4681.unmodifiableSet(EnumSet.of(EnumC5296.CLASS, EnumC5296.ENUM, EnumC5296.INTERFACE, EnumC5296.RECORD, EnumC5296.ANNOTATION_TYPE));

    static {
        Object[] objArr = {EnumC5296.RECORD_COMPONENT};
        HashSet hashSet = new HashSet(1);
        Object obj = objArr[0];
        C17359.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
        }
        f7481 = C4681.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7817(List list) {
        return m7816(list, f7478);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m7818(List list) {
        return m7816(list, f7479);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7816(Iterable iterable, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC12753 interfaceC12753 = (InterfaceC12753) it.next();
            if (set.contains(interfaceC12753.mo9558())) {
                arrayList.add((InterfaceC12753) InterfaceC1567.class.cast(interfaceC12753));
            }
        }
        return arrayList;
    }
}
