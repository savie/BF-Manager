package l;

import android.content.res.Resources;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩸۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22810 implements InterfaceC5656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f73941;

    public C22810(C1927 c1927) {
        this.f73941 = c1927;
    }

    @Override // l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public void mo9647(C21383 c21383) {
        c21383.m13521((C1927) this.f73941);
    }

    public C22810(Resources resources) {
        resources.getClass();
        this.f73941 = resources;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m51440(C15648 c15648) {
        String strM51439;
        String string;
        Resources resources = (Resources) this.f73941;
        String str = c15648.f50848;
        int i = c15648.f50849;
        int i2 = c15648.f50843;
        int i3 = c15648.f50852;
        int i4 = c15648.f50814;
        String str2 = c15648.f50836;
        int iM25260 = C9681.m25260(str);
        if (iM25260 == -1) {
            if (C9681.m25259(str2) != null) {
                iM25260 = 2;
            } else if (C9681.m25252(str2) != null) {
                iM25260 = 1;
            } else if (i4 != -1 || i3 != -1) {
                iM25260 = 2;
            } else if (i2 == -1 && c15648.f50829 == -1) {
                iM25260 = -1;
            } else {
                iM25260 = 1;
            }
        }
        if (iM25260 == 2) {
            strM51439 = m51437(m51438(c15648), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.MT_Protector, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.MT_Protector, Float.valueOf(i / 1000000.0f)) : "");
        } else if (iM25260 == 1) {
            String strM514310 = m51439(c15648);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.MT_Protector);
            } else if (i2 == 2) {
                string = resources.getString(R.string.MT_Protector);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.MT_Protector);
            } else if (i2 == 8) {
                string = resources.getString(R.string.MT_Protector);
            } else {
                string = resources.getString(R.string.MT_Protector);
            }
            strM51439 = m51437(strM514310, string, i != -1 ? resources.getString(R.string.MT_Protector, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            strM51439 = m51439(c15648);
        }
        if (!strM51439.isEmpty()) {
            return strM51439;
        }
        String str3 = c15648.f50811;
        if (str3 == null || str3.trim().isEmpty()) {
            return resources.getString(R.string.MT_Protector);
        }
        return resources.getString(R.string.MT_Protector, str3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m51439(C15648 c15648) {
        String displayName;
        String str = c15648.f50811;
        String str2 = c15648.f50846;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale localeM19482 = C7116.m19482();
            displayName = localeForLanguageTag.getDisplayName(localeM19482);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeM19482) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM51437 = m51437(displayName, m51438(c15648));
        if (!TextUtils.isEmpty(strM51437)) {
            return strM51437;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private String m51438(C15648 c15648) {
        Resources resources = (Resources) this.f73941;
        int i = c15648.f50834;
        int i2 = c15648.f50834;
        String string = (i & 2) != 0 ? resources.getString(R.string.MT_Protector) : "";
        if ((i2 & 4) != 0) {
            string = m51437(string, resources.getString(R.string.MT_Protector));
        }
        if ((i2 & 8) != 0) {
            string = m51437(string, resources.getString(R.string.MT_Protector));
        }
        return (i2 & 1088) != 0 ? m51437(string, resources.getString(R.string.MT_Protector)) : string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m51437(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f73941).getString(R.string.MT_Protector, string, str);
            }
        }
        return string;
    }
}
