package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C3492 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: ᩴ֫۫, reason: not valid java name and contains not printable characters */
    public static int f12043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7967 f12044;

    /* JADX INFO: renamed from: ֫ۧܽ, reason: not valid java name and contains not printable characters */
    public static void m11477(Object obj, long j) {
        C21576.m49069((Runnable) obj, j);
    }

    /* JADX INFO: renamed from: ֫᩷ۖ, reason: not valid java name and contains not printable characters */
    public static void m11478(Object obj) throws IOException {
        ((AbstractC22044) obj).m49853();
    }

    /* JADX INFO: renamed from: ۖ۠ܳ, reason: not valid java name and contains not printable characters */
    public static int m11479(Object obj) {
        return ((C16618) obj).m39316();
    }

    /* JADX INFO: renamed from: ۘ֨۟, reason: not valid java name and contains not printable characters */
    public static void m11480(Object obj) {
        C20244.m46520((AutoCloseable) obj);
    }

    /* JADX INFO: renamed from: ۚۢۨ, reason: not valid java name and contains not printable characters */
    public static int m11481(float f) {
        return C6907.m19160(f);
    }

    /* JADX INFO: renamed from: ۠۬ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m11482(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۢ᩹ۖ, reason: not valid java name and contains not printable characters */
    public static int m11483(Object obj, int i) {
        return ((AbstractC2599) obj).mo8719(i);
    }

    /* JADX INFO: renamed from: ۢ᩻᩶, reason: not valid java name and contains not printable characters */
    public static void m11484(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۧۛܺ, reason: not valid java name and contains not printable characters */
    public static void m11485(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ۧۢ᩶, reason: not valid java name and contains not printable characters */
    public static String m11486(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۫֫᩹, reason: not valid java name and contains not printable characters */
    public static void m11487(Object obj, int i, Object obj2) {
        ((C2361) obj).m8026(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ܿ۬֨, reason: not valid java name and contains not printable characters */
    public static boolean m11488() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ᩺ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18752 m11489(Object obj) {
        return ((InterfaceC9801) obj).edit();
    }

    /* JADX INFO: renamed from: ᩵֡ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11490(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᩸ۗۗ, reason: not valid java name and contains not printable characters */
    public static Intent m11491(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩻ۘᩴ, reason: not valid java name and contains not printable characters */
    public static String m11492(Object obj) {
        return ((C4347) obj).m13850();
    }

    public C3492(C7967 c7967) {
        this.f12044 = c7967;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f12044.m21687();
        return true;
    }
}
