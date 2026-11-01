package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܶ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15436 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50306 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String[] f50305 = new String[3];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object[] f50304 = new Object[3];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m36927(C15436 c15436, String str) {
        c15436.getClass();
        return m36923(str);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m36928(String str) {
        return C0252.m1693("/", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36924(int i) {
        C5557.m15344(i >= this.f50306);
        String[] strArr = this.f50305;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f50306 * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f50305 = (String[]) Arrays.copyOf(strArr, i);
        this.f50304 = Arrays.copyOf(this.f50304, i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m36939(String str) {
        C5557.m15341((Object) str);
        for (int i = 0; i < this.f50306; i++) {
            if (str.equals(this.f50305[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m36922(String str) {
        C5557.m15341((Object) str);
        for (int i = 0; i < this.f50306; i++) {
            if (str.equalsIgnoreCase(this.f50305[i])) {
                return i;
            }
        }
        return -1;
    }

    public final String get(String str) {
        Object obj;
        int iM36939 = m36939(str);
        return (iM36939 == -1 || (obj = this.f50304[iM36939]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m36933(String str) {
        Object obj;
        int iM36922 = m36922(str);
        return (iM36922 == -1 || (obj = this.f50304[iM36922]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m36942(String str) {
        C5557.m15341((Object) str);
        if (!m36923(str)) {
            str = m36928(str);
        }
        int iM36922 = m36922(str);
        if (iM36922 == -1) {
            return null;
        }
        return this.f50304[iM36922];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36935(String str, String str2) {
        m36925((Object) str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36925(Object obj, String str) {
        m36924(this.f50306 + 1);
        String[] strArr = this.f50305;
        int i = this.f50306;
        strArr[i] = str;
        this.f50304[i] = obj;
        this.f50306 = i + 1;
    }

    public final void put(String str, String str2) {
        C5557.m15341((Object) str);
        int iM36939 = m36939(str);
        if (iM36939 == -1) {
            m36925((Object) str2, str);
        } else {
            this.f50304[iM36939] = str2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36936(String str, C4541 c4541) {
        C5557.m15341((Object) str);
        if (!m36923(str)) {
            str = m36928(str);
        }
        int iM36939 = m36939(str);
        if (iM36939 != -1) {
            this.f50304[iM36939] = c4541;
        } else {
            m36925(c4541, str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36943(String str, String str2) {
        int iM36922 = m36922(str);
        if (iM36922 == -1) {
            m36925((Object) str2, str);
            return;
        }
        this.f50304[iM36922] = str2;
        if (this.f50305[iM36922].equals(str)) {
            return;
        }
        this.f50305[iM36922] = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36937(C6968 c6968) {
        put(c6968.getKey(), c6968.getValue());
        c6968.f23443 = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i) {
        int i2 = this.f50306;
        if (i >= i2) {
            throw new C22491("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.f50305;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.f50304;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.f50306 - 1;
        this.f50306 = i5;
        this.f50305[i5] = null;
        this.f50304[i5] = null;
    }

    public final void remove() {
        int iM36939 = m36939(Name.LABEL);
        if (iM36939 != -1) {
            remove(iM36939);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m36944(String str) {
        int iM36922 = m36922(str);
        if (iM36922 != -1) {
            remove(iM36922);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m36941(String str) {
        return m36939(str) != -1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m36931(String str) {
        return m36922(str) != -1;
    }

    public final int size() {
        return this.f50306;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36938(C15436 c15436) {
        int i = c15436.f50306;
        if (i == 0) {
            return;
        }
        m36924(this.f50306 + i);
        int i2 = 0;
        boolean z = this.f50306 != 0;
        while (true) {
            if (i2 < c15436.f50306 && m36923(c15436.f50305[i2])) {
                i2++;
            } else {
                if (i2 >= c15436.f50306) {
                    return;
                }
                C6968 c6968 = new C6968(c15436.f50305[i2], (String) c15436.f50304[i2], c15436);
                i2++;
                if (!z) {
                    m36925((Object) c6968.getValue(), c6968.getKey());
                } else {
                    m36937(c6968);
                }
            }
        }
    }

    public final boolean isEmpty() {
        return this.f50306 == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C23197(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m36940() {
        ArrayList arrayList = new ArrayList(this.f50306);
        for (int i = 0; i < this.f50306; i++) {
            if (!m36923(this.f50305[i])) {
                arrayList.add(new C6968(this.f50305[i], (String) this.f50304[i], this));
            }
        }
        return C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m36930() {
        StringBuilder sbM11782 = C4145.m11782();
        try {
            m36934(sbM11782, new C10497("").m26641());
            return C4145.m11780(sbM11782);
        } catch (IOException e) {
            throw new C4851(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36934(Appendable appendable, C19669 c19669) {
        String strM18739;
        int i = this.f50306;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m36923(this.f50305[i2]) && (strM18739 = C6968.m18739(this.f50305[i2], c19669.m44793())) != null) {
                C6968.m18740(strM18739, (String) this.f50304[i2], appendable.append(' '), c19669);
            }
        }
    }

    public final String toString() {
        return m36930();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15436.class != obj.getClass()) {
            return false;
        }
        C15436 c15436 = (C15436) obj;
        if (this.f50306 != c15436.f50306) {
            return false;
        }
        for (int i = 0; i < this.f50306; i++) {
            int iM36939 = c15436.m36939(this.f50305[i]);
            if (iM36939 == -1) {
                return false;
            }
            Object obj2 = this.f50304[i];
            Object obj3 = c15436.f50304[iM36939];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50304) + (((this.f50306 * 31) + Arrays.hashCode(this.f50305)) * 31);
    }

    public final C15436 clone() {
        try {
            C15436 c15436 = (C15436) super.clone();
            c15436.f50306 = this.f50306;
            c15436.f50305 = (String[]) Arrays.copyOf(this.f50305, this.f50306);
            c15436.f50304 = Arrays.copyOf(this.f50304, this.f50306);
            return c15436;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void normalize() {
        for (int i = 0; i < this.f50306; i++) {
            String[] strArr = this.f50305;
            strArr[i] = C1323.m4722(strArr[i]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36932(C4582 c4582) {
        String str;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean zM12728 = c4582.m12728();
        int i2 = 0;
        while (i < this.f50305.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f50305;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    break;
                }
                if (zM12728 && strArr[i].equals(str)) {
                    i2++;
                    remove(i4);
                    i4--;
                } else if (!zM12728) {
                    String[] strArr2 = this.f50305;
                    if (strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                        i2++;
                        remove(i4);
                        i4--;
                    }
                }
                i4++;
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m36923(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }
}
