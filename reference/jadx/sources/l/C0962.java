package l;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0962 {

    /* JADX INFO: renamed from: ܿ᩻۫, reason: not valid java name and contains not printable characters */
    public static boolean f3784;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f3785 = new Object[256];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3786;

    /* JADX INFO: renamed from: ֡۠ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m3738(Object obj) {
        return ((C1313) obj).m4686();
    }

    /* JADX INFO: renamed from: ۟᩺ܶ, reason: not valid java name and contains not printable characters */
    public static int m3739(int i, Object obj) {
        return C15157.m36336(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ۡ᩷ۗ, reason: not valid java name and contains not printable characters */
    public static EditText m3740(Object obj) {
        return ((TextInputLayout) obj).getEditText();
    }

    /* JADX INFO: renamed from: ۢ᩶۟, reason: not valid java name and contains not printable characters */
    public static String m3741(Object obj) {
        return ((C11986) obj).m29843();
    }

    /* JADX INFO: renamed from: ۤۚۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m3742(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ۧ۠᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC3062 m3743(Object obj) {
        return ((InterfaceC1423) obj).getLifecycle();
    }

    /* JADX INFO: renamed from: ۬ۢ᩻, reason: not valid java name and contains not printable characters */
    public static void m3744(Object obj, Object obj2) {
        ((AbstractC20745) obj).m46703((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۬᩸᩷, reason: not valid java name and contains not printable characters */
    public static C20945 m3745(Object obj) {
        return C20945.m47094((InputStream) obj);
    }

    /* JADX INFO: renamed from: ܶܽܶ, reason: not valid java name and contains not printable characters */
    public static int m3746() {
        return -578271724;
    }

    /* JADX INFO: renamed from: ᩴۚۤ, reason: not valid java name and contains not printable characters */
    public static String m3747(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵ۨۚ, reason: not valid java name and contains not printable characters */
    public static boolean m3748(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ᩸֫ۗ, reason: not valid java name and contains not printable characters */
    public static void m3749(Object obj, Object obj2) {
        ((C2724) obj).m8326((String) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۗܺ, reason: not valid java name and contains not printable characters */
    public static C1254 m3750(Object obj) {
        return ((InterfaceC2916) obj).mo8735();
    }

    /* JADX INFO: renamed from: ᩹ۘܳ, reason: not valid java name and contains not printable characters */
    public static C8067 m3751(Object obj) {
        return ((InterfaceC17421) obj).buildDialog();
    }

    /* JADX INFO: renamed from: ᩺᩷ܺ, reason: not valid java name and contains not printable characters */
    public static String m3752(Object obj) {
        return ((InterfaceC8858) obj).getName();
    }

    /* JADX INFO: renamed from: ᩻ۛ֨, reason: not valid java name and contains not printable characters */
    public static boolean m3753(Object obj) {
        return ((C1777) obj).m5824();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m3754() {
        int i = this.f3786;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f3785;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f3786 = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3756(C13664 c13664) {
        int i = this.f3786;
        Object[] objArr = this.f3785;
        if (i < objArr.length) {
            objArr[i] = c13664;
            this.f3786 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3755(int i, Object[] objArr) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f3786;
            Object[] objArr2 = this.f3785;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f3786 = i3 + 1;
            }
        }
    }
}
