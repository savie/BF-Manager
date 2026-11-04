package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.᩺ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes.dex */
public class C24185 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4047 f78326;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f78327;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24185 f78328;

    public C24185(String str) {
        this.f78327 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24185 m54162(C14487 c14487, int i, int i2, char[] cArr) {
        C24185 c24185 = new C24185(this.f78327);
        byte[] bArr = new byte[i2];
        System.arraycopy(c14487.f45603, i, bArr, 0, i2);
        C4047 c4047 = new C4047();
        c4047.f13787 = bArr;
        c4047.f13788 = i2;
        c24185.f78326 = c4047;
        return c24185;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4047 m54161(C0318 c0318) {
        return this.f78326;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54160(C23243 c23243) {
        C0318 c0318 = c23243.f75312;
        int i = 0;
        for (C24185 c24185 = this; c24185 != null; c24185 = c24185.f78328) {
            c23243.m52265(c24185.f78327);
            if (c24185.f78326 == null) {
                c24185.f78326 = c24185.m54161(c0318);
            }
            i += c24185.f78326.f13788 + 6;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m54158(C23243 c23243, int i, int i2) {
        int i3;
        if ((i & 4096) == 0 || c23243.m52257() >= 49) {
            i3 = 0;
        } else {
            c23243.m52265("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            c23243.m52265("Signature");
            i3 += 8;
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 0) {
            return i3;
        }
        c23243.m52265("Deprecated");
        return i3 + 6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54163(C23243 c23243, C4047 c4047) {
        C0318 c0318 = c23243.f75312;
        for (C24185 c24185 = this; c24185 != null; c24185 = c24185.f78328) {
            if (c24185.f78326 == null) {
                c24185.f78326 = c24185.m54161(c0318);
            }
            C4047 c4048 = c24185.f78326;
            c4047.m13021(c23243.m52265(c24185.f78327));
            c4047.m13023(c4048.f13788);
            c4047.m13018(0, c4048.f13788, c4048.f13787);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54159(C23243 c23243, int i, int i2, C4047 c4047) {
        if ((i & 4096) != 0 && c23243.m52257() < 49) {
            c4047.m13021(c23243.m52265("Synthetic"));
            c4047.m13023(0);
        }
        if (i2 != 0) {
            c4047.m13021(c23243.m52265("Signature"));
            c4047.m13023(2);
            c4047.m13021(i2);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c4047.m13021(c23243.m52265("Deprecated"));
            c4047.m13023(0);
        }
    }
}
