package l;

import android.content.DialogInterface;
import android.os.BaseBundle;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.sdk.m.p.a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIX8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2375 implements Cloneable {

    /* JADX INFO: renamed from: ᩻ܳܶ, reason: not valid java name and contains not printable characters */
    public static int f7641;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object[] f7642;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ boolean f7643;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ int f7644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public /* synthetic */ int[] f7645;

    /* JADX INFO: renamed from: ۖ۫ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m8058(Object obj) {
        return ((InterfaceC7509) obj).mo924();
    }

    /* JADX INFO: renamed from: ۖ᩸۫, reason: not valid java name and contains not printable characters */
    public static String m8059(Object obj) {
        return C15022.m36182((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۖ᩹ۢ, reason: not valid java name and contains not printable characters */
    public static String m8060(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ۜۜۧ, reason: not valid java name and contains not printable characters */
    public static void m8061(Object obj) {
        ((InterfaceC18752) obj).apply();
    }

    /* JADX INFO: renamed from: ۜۡۡ, reason: not valid java name and contains not printable characters */
    public static void m8062(Object obj, boolean z) {
        ((C2361) obj).m8012(z);
    }

    /* JADX INFO: renamed from: ۜ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public static void m8063(Object obj, int i, Object obj2) {
        ((C2361) obj).m8018(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۢ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static void m8064(Object obj) {
        ((DialogInterfaceC8327) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۫֡ܺ, reason: not valid java name and contains not printable characters */
    public static int m8065() {
        return 1269394304;
    }

    /* JADX INFO: renamed from: ܰᩴۖ, reason: not valid java name and contains not printable characters */
    public static void m8066(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ܰ᩵ۤ, reason: not valid java name and contains not printable characters */
    public static void m8067(Object obj, Object obj2) {
        ((AbstractActivityC17204) obj).m40407((C16390) obj2);
    }

    /* JADX INFO: renamed from: ܰ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8068(Object obj) {
        return ((C24132) obj).m53872();
    }

    /* JADX INFO: renamed from: ܳܰ᩺, reason: not valid java name and contains not printable characters */
    public static String m8069(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵ܰܶ, reason: not valid java name and contains not printable characters */
    public static void m8070(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩷ۘܽ, reason: not valid java name and contains not printable characters */
    public static void m8071(Object obj, int i) {
        C17617.m41268((TextInputLayout) obj, i);
    }

    /* JADX INFO: renamed from: ᩹֡ܳ, reason: not valid java name and contains not printable characters */
    public static void m8072(Object obj) {
        ((C15508) obj).close();
    }

    /* JADX INFO: renamed from: ᩺ۘ᩵, reason: not valid java name and contains not printable characters */
    public static int m8073(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    public C2375(int i) {
        if (i != 0) {
            int i2 = i * 4;
            for (int i3 = 4; i3 < 32; i3++) {
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
            }
            int i5 = i2 / 4;
            this.f7645 = new int[i5];
            this.f7642 = new Object[i5];
            return;
        }
        this.f7645 = C6850.f22761;
        this.f7642 = C6850.f22762;
    }

    public C2375() {
        this(10);
    }

    public final C2375 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        C15243.m36587(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C2375 c2375 = (C2375) objClone;
        c2375.f7645 = (int[]) this.f7645.clone();
        c2375.f7642 = (Object[]) this.f7642.clone();
        return c2375;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8077(int i, Object obj) {
        int iM19064 = C6850.m19064(this.f7644, i, this.f7645);
        if (iM19064 >= 0) {
            this.f7642[iM19064] = obj;
            return;
        }
        int i2 = ~iM19064;
        if (i2 < this.f7644 && this.f7642[i2] == C8341.f27335) {
            this.f7645[i2] = i;
            this.f7642[i2] = obj;
            return;
        }
        if (this.f7643 && this.f7644 >= this.f7645.length) {
            C8341.m22447(this);
            i2 = ~C6850.m19064(this.f7644, i, this.f7645);
        }
        int i3 = this.f7644;
        if (i3 >= this.f7645.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f7645, i7);
            C15243.m36591(iArrCopyOf, "copyOf(this, newSize)");
            this.f7645 = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7642, i7);
            C15243.m36591(objArrCopyOf, "copyOf(this, newSize)");
            this.f7642 = objArrCopyOf;
        }
        int i8 = this.f7644;
        if (i8 - i2 != 0) {
            int[] iArr = this.f7645;
            int i9 = i2 + 1;
            C21168.m48277(i9, i2, iArr, iArr, i8);
            Object[] objArr = this.f7642;
            C21168.m48276(i9, i2, this.f7644, objArr, objArr);
        }
        this.f7645[i2] = i;
        this.f7642[i2] = obj;
        this.f7644++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8074() {
        if (this.f7643) {
            C8341.m22447(this);
        }
        return this.f7644;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m8075(int i) {
        if (this.f7643) {
            C8341.m22447(this);
        }
        return this.f7642[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8076(int i, Object obj) {
        int i2 = this.f7644;
        if (i2 != 0 && i <= this.f7645[i2 - 1]) {
            m8077(i, obj);
            return;
        }
        if (this.f7643 && i2 >= this.f7645.length) {
            C8341.m22447(this);
        }
        int i3 = this.f7644;
        if (i3 >= this.f7645.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f7645, i7);
            C15243.m36591(iArrCopyOf, "copyOf(this, newSize)");
            this.f7645 = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7642, i7);
            C15243.m36591(objArrCopyOf, "copyOf(this, newSize)");
            this.f7642 = objArrCopyOf;
        }
        this.f7645[i3] = i;
        this.f7642[i3] = obj;
        this.f7644 = i3 + 1;
    }

    public final String toString() {
        if (m8074() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7644 * 28);
        sb.append('{');
        int i = this.f7644;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f7643) {
                C8341.m22447(this);
            }
            sb.append(this.f7645[i2]);
            sb.append(a.h);
            Object objM8075 = m8075(i2);
            if (objM8075 != this) {
                sb.append(objM8075);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        C15243.m36591(string, "buffer.toString()");
        return string;
    }
}
