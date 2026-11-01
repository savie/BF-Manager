package l;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1564 implements Runnable {

    /* JADX INFO: renamed from: ᩷᩻ۜ, reason: not valid java name and contains not printable characters */
    public static boolean f6300;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C4469 f6301;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5175 f6302;

    /* JADX INFO: renamed from: ֨ۡۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3062 m5341(Object obj) {
        return ((InterfaceC1423) obj).getLifecycle();
    }

    /* JADX INFO: renamed from: ۗᩴ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m5342(Object obj) {
        return ((C1313) obj).m4686();
    }

    /* JADX INFO: renamed from: ۙۜ֡, reason: not valid java name and contains not printable characters */
    public static String m5343(Object obj) {
        return ((InterfaceC8858) obj).getName();
    }

    /* JADX INFO: renamed from: ۜۖܺ, reason: not valid java name and contains not printable characters */
    public static String m5344(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۜۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5345() {
        return false;
    }

    /* JADX INFO: renamed from: ۜۧۢ, reason: not valid java name and contains not printable characters */
    public static EditText m5346(Object obj) {
        return ((TextInputLayout) obj).getEditText();
    }

    /* JADX INFO: renamed from: ۜ۬ܰ, reason: not valid java name and contains not printable characters */
    public static String m5347(Object obj) {
        return ((C11986) obj).m29843();
    }

    /* JADX INFO: renamed from: ۡۘᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m5348(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ۫᩸ᩳ, reason: not valid java name and contains not printable characters */
    public static void m5349(Object obj, Object obj2) {
        ((C2724) obj).m8326((String) obj2);
    }

    /* JADX INFO: renamed from: ۬ۜ᩻, reason: not valid java name and contains not printable characters */
    public static byte[] m5350(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ܰ᩺ܿ, reason: not valid java name and contains not printable characters */
    public static int m5351(int i, Object obj) {
        return C15157.m36336(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ܳ᩺ۘ, reason: not valid java name and contains not printable characters */
    public static C20945 m5352(Object obj) {
        return C20945.m47094((InputStream) obj);
    }

    /* JADX INFO: renamed from: ᩳܰۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5353(Object obj) {
        return ((C1777) obj).m5824();
    }

    /* JADX INFO: renamed from: ᩴۘ᩶, reason: not valid java name and contains not printable characters */
    public static void m5354(Object obj, Object obj2) {
        ((AbstractC20745) obj).m46703((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۢۧ, reason: not valid java name and contains not printable characters */
    public static C1254 m5355(Object obj) {
        return ((InterfaceC2916) obj).mo8735();
    }

    /* JADX INFO: renamed from: ᩹᩶۠, reason: not valid java name and contains not printable characters */
    public static C8067 m5356(Object obj) {
        return ((InterfaceC17421) obj).buildDialog();
    }

    public RunnableC1564(C5175 c5175, C4469 c4469) {
        this.f6302 = c5175;
        this.f6301 = c4469;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5175 c5175 = this.f6302;
        if (c5175.f74749 != null) {
            c5175.f74749.changeMenuMode();
        }
        View view = (View) c5175.f74747;
        if (view != null && view.getWindowToken() != null) {
            C4469 c4469 = this.f6301;
            if (c4469.m6952()) {
                c5175.f17952 = c4469;
            }
        }
        c5175.f17954 = null;
    }
}
