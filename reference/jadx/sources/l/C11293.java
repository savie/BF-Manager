package l;

import bin.mt.plus.R;
import java.util.ConcurrentModificationException;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XALX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11293 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC12762 f35608;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m28556(String str) {
        int iLastIndexOf;
        if (str.length() > 1 && str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
            if (str.endsWith("/")) {
                return str;
            }
        }
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m28557(int i) {
        return new String(new char[]{'0', 'x', "0123456789abcdef".charAt((i >>> 28) & 15), "0123456789abcdef".charAt((i >>> 24) & 15), "0123456789abcdef".charAt((i >>> 20) & 15), "0123456789abcdef".charAt((i >>> 16) & 15), "0123456789abcdef".charAt((i >>> 12) & 15), "0123456789abcdef".charAt((i >>> 8) & 15), "0123456789abcdef".charAt((i >>> 4) & 15), "0123456789abcdef".charAt(i & 15)});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28549(String str, String str2) {
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        if (str.isEmpty()) {
            return str2;
        }
        return str.endsWith("/") ? C14483.m34972(str, str2) : C8008.m21875('/', str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28554(StringBuilder sb, int i) {
        if (i < 0 || i >= 1000) {
            sb.append(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i)));
            return;
        }
        sb.append((i / 100) % 10);
        sb.append((i / 10) % 10);
        sb.append(i % 10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28548(String str) {
        if (str.equals("/")) {
            return C21576.m49088(R.string.MT_Protector);
        }
        if (str.length() > 1 && str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        String strM3558 = C0873.m3558(str);
        return strM3558 == null ? m28558(str) : strM3558;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28553(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m28558(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC12762 m28550() {
        if (f35608 == null) {
            try {
                if (C18969.m44059("com.portaudio.PortAudio", false) != null) {
                    f35608 = (InterfaceC12762) C18969.m44059("com.jsyn.devices.jportaudio.JPortAudioDevice", true).newInstance();
                }
            } catch (Throwable th) {
                System.err.println("Could not load JPortAudio device. " + th);
            }
        }
        if (f35608 == null) {
            try {
                Class clsM44059 = C18969.m44059("com.jsyn.devices.javasound.JavaSoundAudioDevice", false);
                if (clsM44059 != null) {
                    f35608 = (InterfaceC12762) clsM44059.newInstance();
                }
            } catch (Throwable th2) {
                System.err.println("Could not load JavaSound device. " + th2);
            }
        }
        return f35608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28552(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28551(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m28547(C18037 c18037, Object obj, int i) {
        int iM42042 = c18037.m42042();
        if (iM42042 == 0) {
            return -1;
        }
        try {
            int iM19064 = C6850.m19064(c18037.m42042(), i, c18037.m42039());
            if (iM19064 < 0 || C15243.m36589(obj, c18037.m42041()[iM19064])) {
                return iM19064;
            }
            int i2 = iM19064 + 1;
            while (i2 < iM42042 && c18037.m42039()[i2] == i) {
                if (C15243.m36589(obj, c18037.m42041()[i2])) {
                    return i2;
                }
                i2++;
            }
            do {
                iM19064--;
                if (iM19064 < 0 || c18037.m42039()[iM19064] != i) {
                    return ~i2;
                }
            } while (!C15243.m36589(obj, c18037.m42041()[iM19064]));
            return iM19064;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m28555(C18037 c18037, int i) {
        c18037.m42037(new int[i]);
        c18037.m42038(new Object[i]);
    }
}
