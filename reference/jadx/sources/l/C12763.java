package l;

import com.alipay.sdk.m.y.l;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45V6 */
/* JADX INFO: loaded from: classes4.dex */
public class C12763 extends C20222 implements InterfaceC6052 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object[] f40834;

    public C12763(int i) {
        super(i != 0);
        try {
            this.f40834 = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC8616 m31612get(int i) {
        return (InterfaceC8616) m31593(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC9361 m31613get(int i) {
        return (InterfaceC9361) m31593(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC17216 m31617get(int i) {
        return (AbstractC17216) m31593(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C25267 m31622get(int i) {
        return (C25267) m31593(i);
    }

    public C3637 get(int i) {
        return (C3637) m31593(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC13487 m31615get(int i) {
        return (AbstractC13487) m31593(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31598(int i, C4714 c4714) {
        m31596(i, (Object) c4714);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31605(int i, C22614 c22614) {
        m31596(i, (Object) c22614);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C3968 m31608get(int i) {
        return (C3968) m31593(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C6206 m31611get(int i) {
        return (C6206) m31593(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31603(int i, AbstractC17216 abstractC17216) {
        m31596(i, (Object) abstractC17216);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f40834, ((C12763) obj).f40834);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31597(int i, C3968 c3968) {
        m31596(i, (Object) c3968);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C24521 m31621get(int i) {
        return (C24521) m31593(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C5239 m31610get(int i) {
        return (C5239) m31593(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C22438 m31620get(int i) {
        return (C22438) m31593(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40834);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31600(int i, C5239 c5239) {
        m31596(i, (Object) c5239);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C14011 m31616get(int i) {
        return (C14011) m31593(i);
    }

    public final String toString() {
        String name = getClass().getName();
        return m31592(name.substring(name.lastIndexOf(46) + 1) + '{', l.d, false);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC18884 m31618get(int i) {
        return (AbstractC18884) m31593(i);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public String mo1843() {
        String name = getClass().getName();
        return m31592(name.substring(name.lastIndexOf(46) + 1) + '{', l.d, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31594(String str) {
        return m31592(str, l.d, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31601(int i, AbstractC5875 abstractC5875) {
        m31596(i, (Object) abstractC5875);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31595(String str, String str2) {
        return m31592(str, str2, true);
    }

    public final int size() {
        return this.f40834.length;
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C11950 m31614get(int i) {
        return (C11950) m31593(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo31606() {
        int length = this.f40834.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f40834[i2] != null) {
                i++;
            }
        }
        if (length == i) {
            return;
        }
        m46490();
        Object[] objArr = new Object[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = this.f40834[i4];
            if (obj != null) {
                objArr[i3] = obj;
                i3++;
            }
        }
        this.f40834 = objArr;
        if (i == 0) {
            mo15005();
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C20946 m31619get(int i) {
        return (C20946) m31593(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo31602(int i, AbstractC13487 abstractC13487) {
        m31596(i, (Object) abstractC13487);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m31593(int i) {
        try {
            Object obj = this.f40834[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31604(int i, C20946 c20946) {
        m31596(i, (Object) c20946);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m31607(int i) {
        return this.f40834[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31596(int i, Object obj) {
        m46490();
        try {
            this.f40834[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m31592(String str, String str2, boolean z) {
        int length = this.f40834.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((InterfaceC6052) this.f40834[i]).mo1843());
            } else {
                sb.append(this.f40834[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C5085 m31609get(int i) {
        return (C5085) m31593(i);
    }

    public C5085 getType(int i) {
        return (C5085) m31593(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31599(int i, C5085 c5085) {
        m31596(i, (Object) c5085);
    }
}
