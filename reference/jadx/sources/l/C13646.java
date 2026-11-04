package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13646 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f43316 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, o.a.B, o.a.C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final char[] f43317;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC6935 f43321;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21106 f43323;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C3952 f43326;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f43327;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC2460 f43330;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC13820 f43319 = EnumC13820.f43874;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f43334 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f43322 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public StringBuilder f43331 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f43325 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9171 f43333 = new C9171();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0969 f43318 = new C0969();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0223 f43320 = new C0223();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18868 f43324 = new C18868();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7681 f43329 = new C7681();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f43332 = new int[1];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f43328 = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f43317 = cArr;
        Arrays.sort(cArr);
    }

    public C13646(C3952 c3952, C21106 c21106) {
        this.f43326 = c3952;
        this.f43323 = c21106;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC6935 m33395() {
        while (!this.f43334) {
            this.f43319.mo1228(this, this.f43326);
        }
        StringBuilder sb = this.f43331;
        int length = sb.length();
        C0223 c0223 = this.f43320;
        if (length > 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f43322 = null;
            c0223.m1679(string);
            return c0223;
        }
        String str = this.f43322;
        if (str != null) {
            c0223.m1679(str);
            this.f43322 = null;
            return c0223;
        }
        this.f43334 = false;
        return this.f43321;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33390(AbstractC6935 abstractC6935) {
        if (this.f43334) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f43321 = abstractC6935;
        this.f43334 = true;
        EnumC8426 enumC8426 = abstractC6935.f22942;
        if (enumC8426 == EnumC8426.StartTag) {
            this.f43327 = ((C9171) abstractC6935).f7901;
            return;
        }
        if (enumC8426 != EnumC8426.EndTag || ((C0969) abstractC6935).f7905 == null) {
            return;
        }
        C21106 c21106 = this.f43323;
        if (c21106.m48180()) {
            c21106.add(new C14392(this.f43326.m12695()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33389(String str) {
        if (this.f43322 == null) {
            this.f43322 = str;
            return;
        }
        StringBuilder sb = this.f43331;
        if (sb.length() == 0) {
            sb.append(this.f43322);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33388(char c) {
        m33389(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33401(EnumC13820 enumC13820) {
        this.f43319 = enumC13820;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33391(EnumC13820 enumC13820) {
        this.f43326.m12675();
        this.f43319 = enumC13820;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m33392(Character ch, boolean z) {
        int iIntValue;
        C3952 c3952 = this.f43326;
        if (!c3952.m12696() && ((ch == null || ch.charValue() != c3952.m12681()) && !c3952.m12694(f43317))) {
            c3952.m12685();
            boolean zM12676 = c3952.m12676("#");
            int[] iArr = this.f43332;
            if (zM12676) {
                boolean zM12692 = c3952.m12692("X");
                String strM12687 = zM12692 ? c3952.m12687() : c3952.m12693();
                if (strM12687.length() == 0) {
                    m33385("numeric reference with no numerals");
                    c3952.m12672();
                    return null;
                }
                if (!c3952.m12676(l.b)) {
                    m33385("missing semicolon");
                }
                try {
                    iIntValue = Integer.valueOf(strM12687, zM12692 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m33385("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                if (iIntValue >= 128 && iIntValue < 160) {
                    m33385("character is not a valid unicode code point");
                    iIntValue = f43316[iIntValue + a.g];
                }
                iArr[0] = iIntValue;
                return iArr;
            }
            String strM12682 = c3952.m12682();
            boolean zM12691 = c3952.m12691(';');
            if (AbstractC24090.m53652(strM12682) && zM12691) {
                if (z && (c3952.m12684() || c3952.m12686() || c3952.m12680(a.h, '-', '_'))) {
                    c3952.m12672();
                    return null;
                }
                if (!c3952.m12676(l.b)) {
                    m33385("missing semicolon");
                }
                int[] iArr2 = this.f43328;
                int iM53651 = AbstractC24090.m53651(strM12682, iArr2);
                if (iM53651 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (iM53651 == 2) {
                    return iArr2;
                }
                throw new IllegalArgumentException("Unexpected characters returned for ".concat(strM12682));
            }
            c3952.m12672();
            if (zM12691) {
                m33385(C14442.m34865("invalid named referenece '", strM12682, "'"));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2460 m33387(boolean z) {
        AbstractC2460 abstractC2460;
        if (z) {
            abstractC2460 = this.f43333;
            abstractC2460.mo1678();
        } else {
            abstractC2460 = this.f43318;
            abstractC2460.mo1678();
        }
        this.f43330 = abstractC2460;
        return abstractC2460;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m33397() {
        this.f43330.m8313();
        m33390(this.f43330);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33393() {
        m33390(this.f43329);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33400() {
        m33390(this.f43324);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33398() {
        AbstractC6935.m19218(this.f43325);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m33396() {
        return this.f43327 != null && this.f43330.m8310().equalsIgnoreCase(this.f43327);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33386() {
        return this.f43327;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33394(EnumC13820 enumC13820) {
        C21106 c21106 = this.f43323;
        if (c21106.m48180()) {
            C3952 c3952 = this.f43326;
            c21106.add(new C14392(c3952.m12695(), "Unexpected character '%s' in input state [%s]", Character.valueOf(c3952.m12681()), enumC13820));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33399(EnumC13820 enumC13820) {
        C21106 c21106 = this.f43323;
        if (c21106.m48180()) {
            c21106.add(new C14392(this.f43326.m12695(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC13820));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33385(String str) {
        C21106 c21106 = this.f43323;
        if (c21106.m48180()) {
            c21106.add(new C14392(this.f43326.m12695(), "Invalid character reference: %s", str));
        }
    }
}
