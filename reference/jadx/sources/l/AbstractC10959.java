package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۧۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84M0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10959 implements Comparator {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC10959 m27714() {
        return C17308.f55088;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC10959 m27715(Comparator comparator) {
        if (comparator instanceof AbstractC10959) {
            return (AbstractC10959) comparator;
        }
        return new C5354(comparator);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC10959 m27713() {
        return C12473.f41588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC10959 mo27718() {
        return new C15566(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10959 m27720(InterfaceC11955 interfaceC11955) {
        return new C18885(interfaceC11955, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10959 m27719(Comparator comparator) {
        return new C3942(this, comparator);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo27716(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27717(ArrayList arrayList) {
        Object[] objArrM50471 = C22808.m50471(arrayList);
        Arrays.sort(objArrM50471, this);
        return new ArrayList(Arrays.asList(objArrM50471));
    }
}
