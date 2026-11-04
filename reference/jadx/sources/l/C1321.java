package l;

import android.app.Application;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import java.io.DataOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes.dex */
public final class C1321 {

    /* JADX INFO: renamed from: ᩹᩻۟, reason: not valid java name and contains not printable characters */
    public static int f4751;

    /* JADX INFO: renamed from: ֨ܽۤ, reason: not valid java name and contains not printable characters */
    public static int m4845(Object obj) {
        return Integer.parseInt((String) obj);
    }

    /* JADX INFO: renamed from: ֫ۘۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m4846(Object obj, Object obj2) {
        return C14584.m35193((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ۜۜ᩸, reason: not valid java name and contains not printable characters */
    public static Object m4848(Object obj) {
        return C17359.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: ۠ܳ᩷, reason: not valid java name and contains not printable characters */
    public static void m4849(Object obj, Object obj2) {
        ((C10628) obj).m27116((AbstractC12384) obj2);
    }

    /* JADX INFO: renamed from: ۤᩴۢ, reason: not valid java name and contains not printable characters */
    public static void m4850(Object obj, Object obj2) {
        ((C16390) obj).setNavigationOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۫᩶֨, reason: not valid java name and contains not printable characters */
    public static boolean m4851(Object obj) {
        return ((ArrayList) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ܰ֫᩵, reason: not valid java name and contains not printable characters */
    public static boolean m4852() {
        return true;
    }

    /* JADX INFO: renamed from: ܰ۫᩹, reason: not valid java name and contains not printable characters */
    public static void m4853(Object obj, int i) {
        ((DataOutputStream) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ܶܿۚ, reason: not valid java name and contains not printable characters */
    public static boolean m4854(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* JADX INFO: renamed from: ܶ᩻ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m4855(Object obj) {
        return ((C13856) obj).m33803();
    }

    /* JADX INFO: renamed from: ܺۚ۠, reason: not valid java name and contains not printable characters */
    public static Application m4856() {
        return C21576.m49084();
    }

    /* JADX INFO: renamed from: ܽ᩷ܺ, reason: not valid java name and contains not printable characters */
    public static void m4857(Object obj, int i) {
        ((C2361) obj).m8000(i);
    }

    /* JADX INFO: renamed from: ᩶۠֫, reason: not valid java name and contains not printable characters */
    public static AbstractC8585 m4858(Object obj) {
        return ((InterfaceC11217) obj).getLifecycle();
    }

    /* JADX INFO: renamed from: ᩸᩷ܽ, reason: not valid java name and contains not printable characters */
    public static void m4859(Object obj, char c) {
        ((C18459) obj).append(c);
    }

    /* JADX INFO: renamed from: ᩺ܳۘ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC8327 m4860(Object obj) {
        return ((C2361) obj).m8016();
    }

    /* JADX INFO: renamed from: ᩻ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4861(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4847(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }
}
