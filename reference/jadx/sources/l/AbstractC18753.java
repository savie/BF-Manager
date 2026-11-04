package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩳ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84M0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18753 implements Comparator {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC18753 m43550() {
        return C0108.f1051;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC18753 m43551(Comparator comparator) {
        if (comparator instanceof AbstractC18753) {
            return (AbstractC18753) comparator;
        }
        return new C5722(comparator);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC18753 m43549() {
        return C21670.f69175;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC18753 mo1214() {
        return new C11578(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18753 m43554(InterfaceC5417 interfaceC5417) {
        return new C20770(interfaceC5417, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18753 m43553(Comparator comparator) {
        return new C16908(this, comparator);
    }

    /* JADX INFO: renamed from: ۙ */
    public Object mo6460(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m43552(ArrayList arrayList) {
        Object[] objArrM39337 = C16625.m39337(arrayList);
        Arrays.sort(objArrM39337, this);
        return new ArrayList(Arrays.asList(objArrM39337));
    }
}
