package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20692 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final char[] f67292;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f67293 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, o.a.B, o.a.C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6580 f67299;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC7286 f67302;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f67304;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12931 f67305;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC8698 f67307;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC21210 f67300 = EnumC21210.f69077;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f67310 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f67301 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public StringBuilder f67303 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public StringBuilder f67309 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19281 f67306 = new C19281();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C7992 f67296 = new C7992();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15048 f67297 = new C15048();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17869 f67294 = new C17869();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21397 f67298 = new C21397();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f67295 = new int[1];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f67308 = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f67292 = cArr;
        Arrays.sort(cArr);
    }

    public C20692(C12931 c12931, C6580 c6580) {
        this.f67305 = c12931;
        this.f67299 = c6580;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC7286 m46530() {
        while (!this.f67310) {
            this.f67300.mo1598(this, this.f67305);
        }
        StringBuilder sb = this.f67303;
        int length = sb.length();
        C15048 c15048 = this.f67297;
        if (length > 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f67301 = null;
            c15048.m36031(string);
            return c15048;
        }
        String str = this.f67301;
        if (str != null) {
            c15048.m36031(str);
            this.f67301 = null;
            return c15048;
        }
        this.f67310 = false;
        return this.f67302;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46537(AbstractC7286 abstractC7286) {
        if (this.f67310) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f67302 = abstractC7286;
        this.f67310 = true;
        EnumC10109 enumC10109 = abstractC7286.f24210;
        if (enumC10109 == EnumC10109.StartTag) {
            this.f67304 = ((C19281) abstractC7286).f29923;
            return;
        }
        if (enumC10109 != EnumC10109.EndTag || ((C7992) abstractC7286).f29926 == null) {
            return;
        }
        C6580 c6580 = this.f67299;
        if (c6580.m17840()) {
            c6580.add(new C3757(this.f67305.m32039()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46536(String str) {
        if (this.f67301 == null) {
            this.f67301 = str;
            return;
        }
        StringBuilder sb = this.f67303;
        if (sb.length() == 0) {
            sb.append(this.f67301);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46535(char c) {
        m46536(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m46532(EnumC21210 enumC21210) {
        this.f67300 = enumC21210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46538(EnumC21210 enumC21210) {
        this.f67305.m32024();
        this.f67300 = enumC21210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m46539(Character ch, boolean z) {
        int iIntValue;
        C12931 c12931 = this.f67305;
        if (!c12931.m32043() && ((ch == null || ch.charValue() != c12931.m32027()) && !c12931.m32020(f67292))) {
            c12931.m32037();
            boolean zM32025 = c12931.m32025("#");
            int[] iArr = this.f67295;
            if (zM32025) {
                boolean zM32036 = c12931.m32036("X");
                String strM32026 = zM32036 ? c12931.m32026() : c12931.m32019();
                if (strM32026.length() == 0) {
                    m46529("numeric reference with no numerals");
                    c12931.m32028();
                    return null;
                }
                if (!c12931.m32025(l.b)) {
                    m46529("missing semicolon");
                }
                try {
                    iIntValue = Integer.valueOf(strM32026, zM32036 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m46529("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                if (iIntValue >= 128 && iIntValue < 160) {
                    m46529("character is not a valid unicode code point");
                    iIntValue = f67293[iIntValue + a.g];
                }
                iArr[0] = iIntValue;
                return iArr;
            }
            String strM32018 = c12931.m32018();
            boolean zM32035 = c12931.m32035(';');
            if (AbstractC0935.m3691(strM32018) && zM32035) {
                if (z && (c12931.m32038() || c12931.m32041() || c12931.m32031(a.h, '-', '_'))) {
                    c12931.m32028();
                    return null;
                }
                if (!c12931.m32025(l.b)) {
                    m46529("missing semicolon");
                }
                int[] iArr2 = this.f67308;
                int iM3690 = AbstractC0935.m3690(strM32018, iArr2);
                if (iM3690 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (iM3690 == 2) {
                    return iArr2;
                }
                throw new IllegalArgumentException("Unexpected characters returned for ".concat(strM32018));
            }
            c12931.m32028();
            if (zM32035) {
                m46529(C16523.m38890("invalid named referenece '", strM32018, "'"));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8698 m46534(boolean z) {
        AbstractC8698 abstractC8698;
        if (z) {
            abstractC8698 = this.f67306;
            abstractC8698.mo19432();
        } else {
            abstractC8698 = this.f67296;
            abstractC8698.mo19432();
        }
        this.f67307 = abstractC8698;
        return abstractC8698;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m46540() {
        this.f67307.m22524();
        m46537(this.f67307);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46541() {
        m46537(this.f67298);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m46531() {
        m46537(this.f67294);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46543() {
        AbstractC7286.m19431(this.f67309);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m46545() {
        return this.f67304 != null && this.f67307.m22522().equalsIgnoreCase(this.f67304);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46533() {
        return this.f67304;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46542(EnumC21210 enumC21210) {
        C6580 c6580 = this.f67299;
        if (c6580.m17840()) {
            C12931 c12931 = this.f67305;
            c6580.add(new C3757(c12931.m32039(), "Unexpected character '%s' in input state [%s]", Character.valueOf(c12931.m32027()), enumC21210));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46544(EnumC21210 enumC21210) {
        C6580 c6580 = this.f67299;
        if (c6580.m17840()) {
            c6580.add(new C3757(this.f67305.m32039(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC21210));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m46529(String str) {
        C6580 c6580 = this.f67299;
        if (c6580.m17840()) {
            c6580.add(new C3757(this.f67305.m32039(), "Invalid character reference: %s", str));
        }
    }
}
