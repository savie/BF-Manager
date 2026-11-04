package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۛ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8LZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6078 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f20800 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20801 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f20802 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17594(C19378 c19378) {
        for (int i = 0; i < c19378.m44819(); i++) {
            InterfaceC8191 interfaceC8191M44820 = c19378.m44820(i);
            if (interfaceC8191M44820 instanceof C14959) {
                C14959 c14959 = (C14959) interfaceC8191M44820;
                if ("iTunSMPB".equals(c14959.f48864) && m17593(c14959.f48865)) {
                    return;
                }
            } else if (interfaceC8191M44820 instanceof C1536) {
                C1536 c1536 = (C1536) interfaceC8191M44820;
                if ("com.apple.iTunes".equals(c1536.f5336) && "iTunSMPB".equals(c1536.f5337) && m17593(c1536.f5338)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m17593(String str) {
        Matcher matcher = f20800.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = C7116.f23455;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f20801 = i;
            this.f20802 = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
