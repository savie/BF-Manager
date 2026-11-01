package l;

import android.content.pm.ShortcutManager;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: renamed from: l.֡ۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0242 implements InterfaceC7359, InterfaceC3183, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1442;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ ShortcutManager m1614(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m1615(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "count is negative: "));
        }
        int length = str.length();
        if (i == 0 || length == 0) {
            return "";
        }
        if (i == 1) {
            return str;
        }
        if (str.length() <= Integer.MAX_VALUE / i) {
            StringBuilder sb = new StringBuilder(length * i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(str);
            }
            return sb.toString();
        }
        throw new OutOfMemoryError("Repeating " + str.length() + " bytes String " + i + " times will produce a String exceeding maximum size.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1616(int i, String str, StringBuilder sb) {
        sb.append(str.substring(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1617(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    @Override // l.InterfaceC3183
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1619(String str) {
        return true;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f1442) {
            case 5:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object mo1620() {
        return new ConcurrentSkipListMap();
    }
}
