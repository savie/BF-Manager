package l;

import android.content.pm.ShortcutManager;
import android.widget.TextView;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6421 implements InterfaceC19795, InterfaceC10523, InterfaceC10344 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18182(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ ShortcutManager m18183(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18184(InterfaceC9801 interfaceC9801, String str, boolean z) {
        interfaceC9801.edit().putBoolean(str, z).apply();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18185(int i, String str, String str2) {
        int upperCase;
        int upperCase2;
        int iCharCount = 0;
        while (iCharCount < str2.length()) {
            if (i >= str.length()) {
                return false;
            }
            int iCodePointAt = str.codePointAt(i);
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt != iCodePointAt2 && (upperCase = Character.toUpperCase(iCodePointAt)) != (upperCase2 = Character.toUpperCase(iCodePointAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
            i += Character.charCount(iCodePointAt);
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText("0");
    }

    @Override // l.InterfaceC10344
    public void accept(Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        if (closeable != null) {
            closeable.close();
        }
    }
}
