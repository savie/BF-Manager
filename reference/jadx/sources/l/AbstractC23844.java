package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩻ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23844 extends AbstractC1826 implements Set, InterfaceC22810 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77093 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient AbstractC22433 f77094;

    /* JADX INFO: renamed from: ۬ */
    public boolean mo12085() {
        return this instanceof C3237;
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static AbstractC23844 of() {
        return C4275.f15410;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m52570(EnumC18763 enumC18763) {
        return new C16271(enumC18763);
    }

    public static AbstractC23844 of(Object obj, Object obj2) {
        return m52572(2, obj, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m52567(String str, String str2, String str3) {
        return m52572(3, str, str2, str3);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m52565() {
        return m52572(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m52568(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        C18304.m42516("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m52572(length, objArr2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m52572(int i, Object... objArr) {
        if (i == 0) {
            return C4275.f15410;
        }
        if (i == 1) {
            Object obj = objArr[0];
            C13638.requireNonNull(obj);
            return new C16271(obj);
        }
        int iM52566 = m52566(i);
        Object[] objArr2 = new Object[iM52566];
        int i2 = iM52566 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(C8479.m22141(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM30862 = C12411.m30862(iHashCode);
            while (true) {
                int i6 = iM30862 & i2;
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
                iM30862++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            C13638.requireNonNull(obj4);
            return new C16271(obj4);
        }
        if (m52566(i4) < iM52566 / 2) {
            return m52572(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C4275(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52566(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        C18304.m42516("collection too large", iMax < 1073741824);
        return 1073741824;
    }

    public static AbstractC23844 copyOf(Collection collection) {
        if ((collection instanceof AbstractC23844) && !(collection instanceof SortedSet)) {
            AbstractC23844 abstractC23844 = (AbstractC23844) collection;
            if (!abstractC23844.mo5042()) {
                return abstractC23844;
            }
        }
        Object[] array = collection.toArray();
        return m52572(array.length, array);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m52569(Iterator it) {
        if (!it.hasNext()) {
            return C4275.f15410;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new C16271(next);
        }
        C6204 c6204 = new C6204();
        c6204.mo13308(next);
        while (it.hasNext()) {
            c6204.mo13308(it.next());
        }
        return c6204.mo14317();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m52571(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C4275.f15410;
        }
        if (length == 1) {
            return new C16271(objArr[0]);
        }
        return m52572(objArr.length, (Object[]) objArr.clone());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC23844) && mo12085() && ((AbstractC23844) obj).mo12085() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C21209.m47673(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C21209.m47668(this);
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ܰ */
    public AbstractC22433 mo5971() {
        AbstractC22433 abstractC22433 = this.f77094;
        if (abstractC22433 != null) {
            return abstractC22433;
        }
        AbstractC22433 abstractC22433Mo12084 = mo12084();
        this.f77094 = abstractC22433Mo12084;
        return abstractC22433Mo12084;
    }

    /* JADX INFO: renamed from: ֨ */
    public AbstractC22433 mo12084() {
        Object[] array = toArray();
        int i = AbstractC22433.f73217;
        return AbstractC22433.m49802(array.length, array);
    }

    @Override // l.AbstractC1826
    public Object writeReplace() {
        return new C11144(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
