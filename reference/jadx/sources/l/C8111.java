package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJ2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8111 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int[] f28403 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, o.a.B, o.a.C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f28404;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5288 f28408;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f28409;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3876 f28410;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC22928 f28411;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int[] f28412;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C6699 f28413;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1054 f28416;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f28417;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f28419;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f28420;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C2424 f28421;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f28422;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22222 f28423;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C3130 f28424;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC8422 f28414 = EnumC8422.f29249;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC21516 f28407 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f28418 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f28406 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f28415 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public StringBuilder f28405 = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f28404 = cArr;
        Arrays.sort(cArr);
    }

    public C8111(C2424 c2424, C3130 c3130) {
        C6699 c6699 = new C6699();
        this.f28413 = c6699;
        this.f28410 = new C3876();
        this.f28411 = c6699;
        this.f28408 = new C5288();
        this.f28416 = new C1054();
        this.f28423 = new C22222();
        this.f28417 = -1;
        this.f28409 = new int[1];
        this.f28412 = new int[2];
        this.f28421 = c2424;
        this.f28424 = c3130;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC21516 m21366() {
        while (!this.f28418) {
            this.f28414.mo1766(this, this.f28421);
        }
        StringBuilder sb = this.f28415;
        int length = sb.length();
        C5288 c5288 = this.f28408;
        if (length != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            c5288.m14654(string);
            this.f28406 = null;
            return c5288;
        }
        String str = this.f28406;
        if (str != null) {
            c5288.m14654(str);
            this.f28406 = null;
            return c5288;
        }
        this.f28418 = false;
        return this.f28407;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21361(AbstractC21516 abstractC21516) {
        if (!this.f28418) {
            this.f28407 = abstractC21516;
            this.f28418 = true;
            abstractC21516.m48234(this.f28420);
            abstractC21516.m48230(this.f28421.m7381());
            this.f28417 = -1;
            EnumC15167 enumC15167 = abstractC21516.f69910;
            if (enumC15167 == EnumC15167.StartTag) {
                this.f28419 = ((C6699) abstractC21516).f74530;
                this.f28422 = null;
                return;
            } else {
                if (enumC15167 == EnumC15167.EndTag) {
                    C3876 c3876 = (C3876) abstractC21516;
                    if (c3876.m50749()) {
                        m21358("Attributes incorrectly present on end tag [/%s]", c3876.f74529);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new C22491("Must be false");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21357(String str) {
        if (this.f28406 == null) {
            this.f28406 = str;
        } else {
            StringBuilder sb = this.f28415;
            if (sb.length() == 0) {
                sb.append(this.f28406);
            }
            sb.append(str);
        }
        int i = this.f28417;
        C5288 c5288 = this.f28408;
        c5288.m48234(i);
        c5288.m48230(this.f28421.m7381());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21359(StringBuilder sb) {
        if (this.f28406 == null) {
            this.f28406 = sb.toString();
        } else {
            StringBuilder sb2 = this.f28415;
            if (sb2.length() == 0) {
                sb2.append(this.f28406);
            }
            sb2.append((CharSequence) sb);
        }
        int i = this.f28417;
        C5288 c5288 = this.f28408;
        c5288.m48234(i);
        c5288.m48230(this.f28421.m7381());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21356(char c) {
        if (this.f28406 == null) {
            this.f28406 = String.valueOf(c);
        } else {
            StringBuilder sb = this.f28415;
            if (sb.length() == 0) {
                sb.append(this.f28406);
            }
            sb.append(c);
        }
        int i = this.f28417;
        C5288 c5288 = this.f28408;
        c5288.m48234(i);
        c5288.m48230(this.f28421.m7381());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21353(EnumC8422 enumC8422) {
        int i = C18694.f60656[enumC8422.ordinal()];
        C2424 c2424 = this.f28421;
        if (i == 1) {
            this.f28420 = c2424.m7381();
        } else if (i == 2 && this.f28417 == -1) {
            this.f28417 = c2424.m7381();
        }
        this.f28414 = enumC8422;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21360(EnumC8422 enumC8422) {
        m21353(enumC8422);
        this.f28421.m7374();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m21362(Character ch, boolean z) {
        int iIntValue;
        C2424 c2424 = this.f28421;
        if (!c2424.m7394() && ((ch == null || ch.charValue() != c2424.m7392()) && !c2424.m7368(f28404))) {
            c2424.m7395();
            boolean zM7391 = c2424.m7391("#");
            int[] iArr = this.f28409;
            if (zM7391) {
                boolean zM7383 = c2424.m7383("X");
                String strM7399 = zM7383 ? c2424.m7399() : c2424.m7376();
                if (strM7399.length() == 0) {
                    m21350("numeric reference with no numerals", new Object[0]);
                    c2424.m7378();
                    return null;
                }
                c2424.m7393();
                if (!c2424.m7391(l.b)) {
                    m21350("missing semicolon on [&#%s]", strM7399);
                }
                try {
                    iIntValue = Integer.valueOf(strM7399, zM7383 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m21350("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128 && iIntValue < 160) {
                        m21350("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                        iIntValue = f28403[iIntValue + a.g];
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            String strM7385 = c2424.m7385();
            boolean zM7390 = c2424.m7390(';');
            if (!C17551.m40825(strM7385) && (!C17551.m40826(strM7385) || !zM7390)) {
                c2424.m7378();
                if (zM7390) {
                    m21350("invalid named reference [%s]", strM7385);
                }
            } else {
                if (z && (c2424.m7380() || c2424.m7396() || c2424.m7384(a.h, '-', '_'))) {
                    c2424.m7378();
                    return null;
                }
                c2424.m7393();
                if (!c2424.m7391(l.b)) {
                    m21350("missing semicolon on [&%s]", strM7385);
                }
                int[] iArr2 = this.f28412;
                int iM40821 = C17551.m40821(strM7385, iArr2);
                if (iM40821 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (iM40821 == 2) {
                    return iArr2;
                }
                throw new C22491("Unexpected characters returned for ".concat(strM7385));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22928 m21355(boolean z) {
        AbstractC22928 abstractC22928;
        if (z) {
            abstractC22928 = this.f28413;
            abstractC22928.mo3991();
        } else {
            abstractC22928 = this.f28410;
            abstractC22928.mo3991();
        }
        this.f28411 = abstractC22928;
        return abstractC22928;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m21369() {
        this.f28411.m50745();
        m21361(this.f28411);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21352() {
        m21361(this.f28423);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m21363() {
        m21361(this.f28416);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21364() {
        AbstractC21516.m48227(this.f28405);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m21351() {
        return this.f28419 != null && this.f28411.m50755().equalsIgnoreCase(this.f28419);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m21354() {
        return this.f28419;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m21367() {
        if (this.f28422 == null) {
            this.f28422 = C0252.m1693("</", this.f28419);
        }
        return this.f28422;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21365(EnumC8422 enumC8422) {
        C3130 c3130 = this.f28424;
        if (c3130.m9477()) {
            C2424 c2424 = this.f28421;
            c3130.add(new C9482(c2424, "Unexpected character '%s' in input state [%s]", Character.valueOf(c2424.m7392()), enumC8422));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21368(EnumC8422 enumC8422) {
        C3130 c3130 = this.f28424;
        if (c3130.m9477()) {
            c3130.add(new C9482(this.f28421, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC8422));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m21350(String str, Object... objArr) {
        C3130 c3130 = this.f28424;
        if (c3130.m9477()) {
            c3130.add(new C9482(this.f28421, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21358(String str, Object... objArr) {
        C3130 c3130 = this.f28424;
        if (c3130.m9477()) {
            c3130.add(new C9482(this.f28421, str, objArr));
        }
    }
}
