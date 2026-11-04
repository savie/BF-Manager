package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2419 {

    /* JADX INFO: renamed from: ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int f7754;

    /* JADX INFO: renamed from: ֨ۗ᩸, reason: not valid java name and contains not printable characters */
    public static String m8164(Object obj) {
        return ((C4347) obj).m13850();
    }

    /* JADX INFO: renamed from: ֨ᩴᩴ, reason: not valid java name and contains not printable characters */
    public static void m8165(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ۘ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static String m8166(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ MediaSession m8167(ServiceC4415 serviceC4415) {
        return new MediaSession(serviceC4415, "MusicService", null);
    }

    /* JADX INFO: renamed from: ۚ᩷᩹, reason: not valid java name and contains not printable characters */
    public static void m8168(Object obj, int i, Object obj2) {
        ((C2361) obj).m8026(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۡۡᩴ, reason: not valid java name and contains not printable characters */
    public static Intent m8169(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۢܿ۫, reason: not valid java name and contains not printable characters */
    public static void m8170(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۢ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static void m8171(Object obj) {
        C20244.m46520((AutoCloseable) obj);
    }

    /* JADX INFO: renamed from: ܰܶۙ, reason: not valid java name and contains not printable characters */
    public static int m8172(Object obj) {
        return ((C16618) obj).m39316();
    }

    /* JADX INFO: renamed from: ᩳܿܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18752 m8173(Object obj) {
        return ((InterfaceC9801) obj).edit();
    }

    /* JADX INFO: renamed from: ᩴ֨ۧ, reason: not valid java name and contains not printable characters */
    public static int m8174() {
        return -1850780353;
    }

    /* JADX INFO: renamed from: ᩴ۫ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m8175(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᩷᩸ۜ, reason: not valid java name and contains not printable characters */
    public static void m8176(Object obj) throws IOException {
        ((AbstractC22044) obj).m49853();
    }

    /* JADX INFO: renamed from: ᩸ۨ᩶, reason: not valid java name and contains not printable characters */
    public static int m8177(float f) {
        return C6907.m19160(f);
    }

    /* JADX INFO: renamed from: ᩸᩵۬, reason: not valid java name and contains not printable characters */
    public static void m8178(Object obj, long j) {
        C21576.m49069((Runnable) obj, j);
    }

    /* JADX INFO: renamed from: ᩸᩸ۨ, reason: not valid java name and contains not printable characters */
    public static int m8179(Object obj, int i) {
        return ((AbstractC2599) obj).mo8719(i);
    }

    /* JADX INFO: renamed from: ᩺۬ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m8180(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }
}
