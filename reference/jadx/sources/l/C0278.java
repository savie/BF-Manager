package l;

import android.app.Activity;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes.dex */
public final class C0278 implements Collection {

    /* JADX INFO: renamed from: ۛ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static int f1572;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16507 f1573;

    /* JADX INFO: renamed from: ֨ۛ֨, reason: not valid java name and contains not printable characters */
    public static String m1774(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۗۘ᩹, reason: not valid java name and contains not printable characters */
    public static void m1775(Object obj, Object obj2) {
        ((C10111) obj).m25739((AbstractC3384) obj2);
    }

    /* JADX INFO: renamed from: ۗۛۖ, reason: not valid java name and contains not printable characters */
    public static Object m1776(Object obj) {
        return ((Iterator) obj).next();
    }

    /* JADX INFO: renamed from: ۟᩸ۖ, reason: not valid java name and contains not printable characters */
    public static Object m1777(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* JADX INFO: renamed from: ۠֫֨, reason: not valid java name and contains not printable characters */
    public static String m1778(Object obj) {
        return ((AbstractC11462) obj).m28629();
    }

    /* JADX INFO: renamed from: ۡܰ۫, reason: not valid java name and contains not printable characters */
    public static char m1779(int i, Object obj) {
        return C3184.m9601(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۤ֨ۚ, reason: not valid java name and contains not printable characters */
    public static InputStream m1780(Object obj) {
        return ((AbstractC20745) obj).mo33970();
    }

    /* JADX INFO: renamed from: ۤ۠᩵, reason: not valid java name and contains not printable characters */
    public static void m1781(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX INFO: renamed from: ۧ֫ۘ, reason: not valid java name and contains not printable characters */
    public static void m1782(Object obj, Object obj2) {
        ((AbstractActivityC12483) obj).m31004((C6938) obj2);
    }

    /* JADX INFO: renamed from: ۫᩵ۙ, reason: not valid java name and contains not printable characters */
    public static void m1783(Object obj) {
        ((Activity) obj).finish();
    }

    /* JADX INFO: renamed from: ܶ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static void m1784(Object obj, Object obj2) {
        ((AbstractC17902) obj).mo41554((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺ۬ܺ, reason: not valid java name and contains not printable characters */
    public static int m1785(int i, int i2) {
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: ܿۙ۫, reason: not valid java name and contains not printable characters */
    public static String m1786(int i, Object obj) {
        return C16737.m39264(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ᩳ۫ᩳ, reason: not valid java name and contains not printable characters */
    public static byte m1787(Object obj, int i) {
        return ((C2519) obj).m7860(i);
    }

    /* JADX INFO: renamed from: ᩴۨᩴ, reason: not valid java name and contains not printable characters */
    public static long m1788(Object obj, int i) {
        return ((C21775) obj).m48537(i);
    }

    /* JADX INFO: renamed from: ᩹ۧᩴ, reason: not valid java name and contains not printable characters */
    public static int m1789() {
        return 1175661891;
    }

    public C0278(AbstractC16507 abstractC16507) {
        this.f1573 = abstractC16507;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f1573.mo36172();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1573.mo36176(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1573.mo36175() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7334(this.f1573, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC16507 abstractC16507 = this.f1573;
        int iMo36176 = abstractC16507.mo36176(obj);
        if (iMo36176 < 0) {
            return false;
        }
        abstractC16507.mo36173(iMo36176);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC16507 abstractC16507 = this.f1573;
        int iMo36175 = abstractC16507.mo36175();
        int i = 0;
        boolean z = false;
        while (i < iMo36175) {
            if (collection.contains(abstractC16507.mo36170(i, 1))) {
                abstractC16507.mo36173(i);
                i--;
                iMo36175--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC16507 abstractC16507 = this.f1573;
        int iMo36175 = abstractC16507.mo36175();
        int i = 0;
        boolean z = false;
        while (i < iMo36175) {
            if (!collection.contains(abstractC16507.mo36170(i, 1))) {
                abstractC16507.mo36173(i);
                i--;
                iMo36175--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1573.mo36175();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f1573.m38782(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        AbstractC16507 abstractC16507 = this.f1573;
        int iMo36175 = abstractC16507.mo36175();
        Object[] objArr = new Object[iMo36175];
        for (int i = 0; i < iMo36175; i++) {
            objArr[i] = abstractC16507.mo36170(i, 1);
        }
        return objArr;
    }
}
