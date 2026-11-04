package l;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T22W */
/* JADX INFO: loaded from: classes.dex */
public final class C1519 {

    /* JADX INFO: renamed from: ۛ֫ܶ, reason: not valid java name and contains not printable characters */
    public static int f5300;

    /* JADX INFO: renamed from: ֫ۙ᩸, reason: not valid java name and contains not printable characters */
    public static Object m5396(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ֫ۚۗ, reason: not valid java name and contains not printable characters */
    public static void m5397(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ۧ᩹ܿ, reason: not valid java name and contains not printable characters */
    public static String m5399(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬ۛܽ, reason: not valid java name and contains not printable characters */
    public static int m5400(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* JADX INFO: renamed from: ܳۜ۬, reason: not valid java name and contains not printable characters */
    public static String m5401(Object obj) {
        return ((InterfaceC15344) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ܶ۟᩸, reason: not valid java name and contains not printable characters */
    public static void m5402(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX INFO: renamed from: ܺۘۜ, reason: not valid java name and contains not printable characters */
    public static boolean m5403() {
        return true;
    }

    /* JADX INFO: renamed from: ܺܺۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5404(Object obj) {
        return ((C10745) obj).m27399();
    }

    /* JADX INFO: renamed from: ܽ۟ܳ, reason: not valid java name and contains not printable characters */
    public static void m5405(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ܿ֨᩹, reason: not valid java name and contains not printable characters */
    public static boolean m5406(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ܿ۫۠, reason: not valid java name and contains not printable characters */
    public static C5408 m5407(Object obj, Object obj2) {
        return ((C5408) obj).m16113((C5408) obj2);
    }

    /* JADX INFO: renamed from: ᩳۡܶ, reason: not valid java name and contains not printable characters */
    public static View m5408(Object obj, int i, Object obj2, boolean z) {
        return ((LayoutInflater) obj).inflate(i, (ViewGroup) obj2, z);
    }

    /* JADX INFO: renamed from: ᩴᩴ᩸, reason: not valid java name and contains not printable characters */
    public static C12187 m5409() {
        return C12187.m30469();
    }

    /* JADX INFO: renamed from: ᩵ۡܿ, reason: not valid java name and contains not printable characters */
    public static void m5410(Object obj, Object obj2) {
        ((C2361) obj).m8008((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۤۡ, reason: not valid java name and contains not printable characters */
    public static MenuItem m5411(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ᩺ۘۙ, reason: not valid java name and contains not printable characters */
    public static void m5412() {
        C6331.m18055();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static TextClassifier m5398(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
