package l;

import com.alipay.sdk.m.y.l;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45V6 */
/* JADX INFO: loaded from: classes3.dex */
public class C5541 extends C18947 implements InterfaceC19653 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object[] f19003;

    public C5541(int i) {
        super(i != 0);
        try {
            this.f19003 = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC10711 m15270get(int i) {
        return (InterfaceC10711) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC14239 m15273get(int i) {
        return (InterfaceC14239) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C6745 m15265get(int i) {
        return (C6745) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC15546 m15274get(int i) {
        return (AbstractC15546) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C18740 m15277get(int i) {
        return (C18740) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC9901 m15267get(int i) {
        return (AbstractC9901) m15249(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15254(int i, C2948 c2948) {
        m15252(i, (Object) c2948);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15259(int i, C11499 c11499) {
        m15252(i, (Object) c11499);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C10088 m15268get(int i) {
        return (C10088) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C19260 m15278get(int i) {
        return (C19260) m15249(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15260(int i, AbstractC15546 abstractC15546) {
        m15252(i, (Object) abstractC15546);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19003, ((C5541) obj).f19003);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15258(int i, C10088 c10088) {
        m15252(i, (Object) c10088);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C10274 m15269get(int i) {
        return (C10274) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C9383 m15266get(int i) {
        return (C9383) m15249(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C12018 m15271get(int i) {
        return (C12018) m15249(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19003);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15256(int i, C9383 c9383) {
        m15252(i, (Object) c9383);
    }

    public C1661 get(int i) {
        return (C1661) m15249(i);
    }

    public final String toString() {
        String name = getClass().getName();
        return m15248(name.substring(name.lastIndexOf(46) + 1) + '{', l.d, false);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC16438 m15276get(int i) {
        return (AbstractC16438) m15249(i);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public String mo2376() {
        String name = getClass().getName();
        return m15248(name.substring(name.lastIndexOf(46) + 1) + '{', l.d, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15250(String str) {
        return m15248(str, l.d, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15253(int i, AbstractC1100 abstractC1100) {
        m15252(i, (Object) abstractC1100);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15251(String str, String str2) {
        return m15248(str, str2, true);
    }

    public final int size() {
        return this.f19003.length;
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C13408 m15272get(int i) {
        return (C13408) m15249(i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void mo15262() {
        int length = this.f19003.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f19003[i2] != null) {
                i++;
            }
        }
        if (length == i) {
            return;
        }
        m43641();
        Object[] objArr = new Object[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = this.f19003[i4];
            if (obj != null) {
                objArr[i3] = obj;
                i3++;
            }
        }
        this.f19003 = objArr;
        if (i == 0) {
            mo9637();
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C16251 m15275get(int i) {
        return (C16251) m15249(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo15257(int i, AbstractC9901 abstractC9901) {
        m15252(i, (Object) abstractC9901);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m15249(int i) {
        try {
            Object obj = this.f19003[i];
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
    public void m15261(int i, C16251 c16251) {
        m15252(i, (Object) c16251);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m15263(int i) {
        return this.f19003[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15252(int i, Object obj) {
        m43641();
        try {
            this.f19003[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m15248(String str, String str2, boolean z) {
        int length = this.f19003.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((InterfaceC19653) this.f19003[i]).mo2376());
            } else {
                sb.append(this.f19003[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C3320 m15264get(int i) {
        return (C3320) m15249(i);
    }

    public C3320 getType(int i) {
        return (C3320) m15249(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15255(int i, C3320 c3320) {
        m15252(i, (Object) c3320);
    }
}
