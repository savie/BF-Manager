package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۢ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10363 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32985 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String[] f32983 = new String[3];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object[] f32984 = new Object[3];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m26644(C10363 c10363, String str) {
        c10363.getClass();
        return m26640(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m26645(String str) {
        return C25272.m56409("/", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26641(int i) {
        C14838.m35757(i >= this.f32985);
        String[] strArr = this.f32983;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f32985 * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f32983 = (String[]) Arrays.copyOf(strArr, i);
        this.f32984 = Arrays.copyOf(this.f32984, i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m26658(String str) {
        C14838.m35754((Object) str);
        for (int i = 0; i < this.f32985; i++) {
            if (str.equals(this.f32983[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m26646(String str) {
        C14838.m35754((Object) str);
        for (int i = 0; i < this.f32985; i++) {
            if (str.equalsIgnoreCase(this.f32983[i])) {
                return i;
            }
        }
        return -1;
    }

    public final String get(String str) {
        Object obj;
        int iM26658 = m26658(str);
        return (iM26658 == -1 || (obj = this.f32984[iM26658]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26649(String str) {
        Object obj;
        int iM26646 = m26646(str);
        return (iM26646 == -1 || (obj = this.f32984[iM26646]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m26659(String str) {
        C14838.m35754((Object) str);
        if (!m26640(str)) {
            str = m26645(str);
        }
        int iM26646 = m26646(str);
        if (iM26646 == -1) {
            return null;
        }
        return this.f32984[iM26646];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26651(String str, String str2) {
        m26642((Object) str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26642(Object obj, String str) {
        m26641(this.f32985 + 1);
        String[] strArr = this.f32983;
        int i = this.f32985;
        strArr[i] = str;
        this.f32984[i] = obj;
        this.f32985 = i + 1;
    }

    public final void put(String str, String str2) {
        C14838.m35754((Object) str);
        int iM26658 = m26658(str);
        if (iM26658 == -1) {
            m26642((Object) str2, str);
        } else {
            this.f32984[iM26658] = str2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26652(String str, C20718 c20718) {
        C14838.m35754((Object) str);
        if (!m26640(str)) {
            str = m26645(str);
        }
        int iM26658 = m26658(str);
        if (iM26658 != -1) {
            this.f32984[iM26658] = c20718;
        } else {
            m26642(c20718, str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26661(String str, String str2) {
        int iM26646 = m26646(str);
        if (iM26646 == -1) {
            m26642((Object) str2, str);
            return;
        }
        this.f32984[iM26646] = str2;
        if (this.f32983[iM26646].equals(str)) {
            return;
        }
        this.f32983[iM26646] = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26653(C8127 c8127) {
        put(c8127.getKey(), c8127.getValue());
        c8127.f26820 = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i) {
        int i2 = this.f32985;
        if (i >= i2) {
            throw new C21552("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.f32983;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.f32984;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.f32985 - 1;
        this.f32985 = i5;
        this.f32983[i5] = null;
        this.f32984[i5] = null;
    }

    public final void remove() {
        int iM26658 = m26658(Name.LABEL);
        if (iM26658 != -1) {
            remove(iM26658);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m26657(String str) {
        int iM26646 = m26646(str);
        if (iM26646 != -1) {
            remove(iM26646);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m26656(String str) {
        return m26658(str) != -1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m26662(String str) {
        return m26646(str) != -1;
    }

    public final int size() {
        return this.f32985;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26654(C10363 c10363) {
        int i = c10363.f32985;
        if (i == 0) {
            return;
        }
        m26641(this.f32985 + i);
        int i2 = 0;
        boolean z = this.f32985 != 0;
        while (true) {
            if (i2 < c10363.f32985 && m26640(c10363.f32983[i2])) {
                i2++;
            } else {
                if (i2 >= c10363.f32985) {
                    return;
                }
                C8127 c8127 = new C8127(c10363.f32983[i2], (String) c10363.f32984[i2], c10363);
                i2++;
                if (!z) {
                    m26642((Object) c8127.getValue(), c8127.getKey());
                } else {
                    m26653(c8127);
                }
            }
        }
    }

    public final boolean isEmpty() {
        return this.f32985 == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C19314(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m26660() {
        ArrayList arrayList = new ArrayList(this.f32985);
        for (int i = 0; i < this.f32985; i++) {
            if (!m26640(this.f32983[i])) {
                arrayList.add(new C8127(this.f32983[i], (String) this.f32984[i], this));
            }
        }
        return C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m26655() {
        StringBuilder sbM2898 = C0669.m2898();
        try {
            m26650(sbM2898, new C5056("").m15300());
            return C0669.m2896(sbM2898);
        } catch (IOException e) {
            throw new C12601(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26650(Appendable appendable, C7381 c7381) {
        String strM22010;
        int i = this.f32985;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m26640(this.f32983[i2]) && (strM22010 = C8127.m22010(this.f32983[i2], c7381.m20275())) != null) {
                C8127.m22011(strM22010, (String) this.f32984[i2], appendable.append(' '), c7381);
            }
        }
    }

    public final String toString() {
        return m26655();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10363.class != obj.getClass()) {
            return false;
        }
        C10363 c10363 = (C10363) obj;
        if (this.f32985 != c10363.f32985) {
            return false;
        }
        for (int i = 0; i < this.f32985; i++) {
            int iM26658 = c10363.m26658(this.f32983[i]);
            if (iM26658 == -1) {
                return false;
            }
            Object obj2 = this.f32984[i];
            Object obj3 = c10363.f32984[iM26658];
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
        return Arrays.hashCode(this.f32984) + (((this.f32985 * 31) + Arrays.hashCode(this.f32983)) * 31);
    }

    public final C10363 clone() {
        try {
            C10363 c10363 = (C10363) super.clone();
            c10363.f32985 = this.f32985;
            c10363.f32983 = (String[]) Arrays.copyOf(this.f32983, this.f32985);
            c10363.f32984 = Arrays.copyOf(this.f32984, this.f32985);
            return c10363;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void normalize() {
        for (int i = 0; i < this.f32985; i++) {
            String[] strArr = this.f32983;
            strArr[i] = C15300.m36731(strArr[i]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26648(C20193 c20193) {
        String str;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean zM46441 = c20193.m46441();
        int i2 = 0;
        while (i < this.f32983.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f32983;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    break;
                }
                if (zM46441 && strArr[i].equals(str)) {
                    i2++;
                    remove(i4);
                    i4--;
                } else if (!zM46441) {
                    String[] strArr2 = this.f32983;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26640(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }
}
