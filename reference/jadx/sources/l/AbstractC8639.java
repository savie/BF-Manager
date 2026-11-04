package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.۠۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8639 extends AbstractC4911 implements Set, InterfaceC14375 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28224 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient AbstractC1928 f28225;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean mo23283() {
        return this instanceof C10876;
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static AbstractC8639 of() {
        return C13070.f41806;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m23279(EnumC13722 enumC13722) {
        return new C6359(enumC13722);
    }

    public static AbstractC8639 of(Object obj, Object obj2) {
        return m23281(2, obj, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m23276(String str, String str2, String str3) {
        return m23281(3, str, str2, str3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m23274() {
        return m23281(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m23277(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        C12128.m30308("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m23281(length, objArr2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m23281(int i, Object... objArr) {
        if (i == 0) {
            return C13070.f41806;
        }
        if (i == 1) {
            Object obj = objArr[0];
            C17359.requireNonNull(obj);
            return new C6359(obj);
        }
        int iM23275 = m23275(i);
        Object[] objArr2 = new Object[iM23275];
        int i2 = iM23275 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(C13645.m33382(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM4501 = C1247.m4501(iHashCode);
            while (true) {
                int i6 = iM4501 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM4501++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            C17359.requireNonNull(obj4);
            return new C6359(obj4);
        }
        if (m23275(i4) < iM23275 / 2) {
            return m23281(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C13070(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23275(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        C12128.m30308("collection too large", iMax < 1073741824);
        return 1073741824;
    }

    public static AbstractC8639 copyOf(Collection collection) {
        if ((collection instanceof AbstractC8639) && !(collection instanceof SortedSet)) {
            AbstractC8639 abstractC8639 = (AbstractC8639) collection;
            if (!abstractC8639.mo14905()) {
                return abstractC8639;
            }
        }
        Object[] array = collection.toArray();
        return m23281(array.length, array);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m23278(Iterator it) {
        if (!it.hasNext()) {
            return C13070.f41806;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new C6359(next);
        }
        C9384 c9384 = new C9384();
        c9384.mo24710(next);
        while (it.hasNext()) {
            c9384.mo24710(it.next());
        }
        return c9384.mo24709();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m23280(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C13070.f41806;
        }
        if (length == 1) {
            return new C6359(objArr[0]);
        }
        return m23281(objArr.length, (Object[]) objArr.clone());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC8639) && mo23283() && ((AbstractC8639) obj).mo23283() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C12324.m30742(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C12324.m30737(this);
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ᩷ */
    public AbstractC1928 mo6621() {
        AbstractC1928 abstractC1928 = this.f28225;
        if (abstractC1928 != null) {
            return abstractC1928;
        }
        AbstractC1928 abstractC1928Mo23284 = mo23284();
        this.f28225 = abstractC1928Mo23284;
        return abstractC1928Mo23284;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC1928 mo23284() {
        Object[] array = toArray();
        int i = AbstractC1928.f6477;
        return AbstractC1928.m6618(array.length, array);
    }

    @Override // l.AbstractC4911
    public Object writeReplace() {
        return new C2673(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
