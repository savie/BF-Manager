package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8LZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2988 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f11216 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11217 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11218 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8941(C0987 c0987) {
        for (int i = 0; i < c0987.m3789(); i++) {
            InterfaceC22155 interfaceC22155M3793 = c0987.m3793(i);
            if (interfaceC22155M3793 instanceof C4730) {
                C4730 c4730 = (C4730) interfaceC22155M3793;
                if ("iTunSMPB".equals(c4730.f16673) && m8940(c4730.f16671)) {
                    return;
                }
            } else if (interfaceC22155M3793 instanceof C13198) {
                C13198 c13198 = (C13198) interfaceC22155M3793;
                if ("com.apple.iTunes".equals(c13198.f43916) && "iTunSMPB".equals(c13198.f43917) && m8940(c13198.f43915)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8940(String str) {
        Matcher matcher = f11216.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = C17983.f57504;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f11217 = i;
            this.f11218 = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
