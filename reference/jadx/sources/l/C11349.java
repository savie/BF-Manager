package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۨ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public class C11349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2175 f38288;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f38289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11349 f38290;

    public C11349(String str) {
        this.f38289 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11349 m28429(C4998 c4998, int i, int i2, char[] cArr) {
        C11349 c11349 = new C11349(this.f38289);
        byte[] bArr = new byte[i2];
        System.arraycopy(c4998.f17402, i, bArr, 0, i2);
        C2175 c2175 = new C2175();
        c2175.f7887 = bArr;
        c2175.f7888 = i2;
        c11349.f38288 = c2175;
        return c11349;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2175 m28428(C12760 c12760) {
        return this.f38288;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28427(C23344 c23344) {
        C12760 c12760 = c23344.f75628;
        int i = 0;
        for (C11349 c11349 = this; c11349 != null; c11349 = c11349.f38290) {
            c23344.m51441(c11349.f38289);
            if (c11349.f38288 == null) {
                c11349.f38288 = c11349.m28428(c12760);
            }
            i += c11349.f38288.f7888 + 6;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28425(C23344 c23344, int i, int i2) {
        int i3;
        if ((i & 4096) == 0 || c23344.m51459() >= 49) {
            i3 = 0;
        } else {
            c23344.m51441("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            c23344.m51441("Signature");
            i3 += 8;
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 0) {
            return i3;
        }
        c23344.m51441("Deprecated");
        return i3 + 6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28430(C23344 c23344, C2175 c2175) {
        C12760 c12760 = c23344.f75628;
        for (C11349 c11349 = this; c11349 != null; c11349 = c11349.f38290) {
            if (c11349.f38288 == null) {
                c11349.f38288 = c11349.m28428(c12760);
            }
            C2175 c2176 = c11349.f38288;
            c2175.m6771(c23344.m51441(c11349.f38289));
            c2175.m6773(c2176.f7888);
            c2175.m6768(0, c2176.f7888, c2176.f7887);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28426(C23344 c23344, int i, int i2, C2175 c2175) {
        if ((i & 4096) != 0 && c23344.m51459() < 49) {
            c2175.m6771(c23344.m51441("Synthetic"));
            c2175.m6773(0);
        }
        if (i2 != 0) {
            c2175.m6771(c23344.m51441("Signature"));
            c2175.m6773(2);
            c2175.m6771(i2);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c2175.m6771(c23344.m51441("Deprecated"));
            c2175.m6773(0);
        }
    }
}
