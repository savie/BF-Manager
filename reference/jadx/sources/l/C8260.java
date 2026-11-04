package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJ2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8260 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final char[] f27164;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f27165 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, o.a.B, o.a.C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int[] f27167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3785 f27168;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20939 f27169;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0056 f27172;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7514 f27173;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14225 f27175;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f27176;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f27178;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f27179;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C24448 f27180;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f27183;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC18701 f27184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3039 f27185;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public EnumC8806 f27170 = EnumC8806.f28749;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC0802 f27166 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f27177 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f27182 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f27171 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public StringBuilder f27174 = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f27164 = cArr;
        Arrays.sort(cArr);
    }

    public C8260(C24448 c24448, C3039 c3039) {
        C7514 c7514 = new C7514();
        this.f27173 = c7514;
        this.f27172 = new C0056();
        this.f27184 = c7514;
        this.f27168 = new C3785();
        this.f27169 = new C20939();
        this.f27175 = new C14225();
        this.f27181 = -1;
        this.f27179 = new int[1];
        this.f27167 = new int[2];
        this.f27180 = c24448;
        this.f27185 = c3039;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC0802 m22260() {
        while (!this.f27177) {
            this.f27170.mo1813(this, this.f27180);
        }
        StringBuilder sb = this.f27171;
        int length = sb.length();
        C3785 c3785 = this.f27168;
        if (length != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            c3785.m12294(string);
            this.f27182 = null;
            return c3785;
        }
        String str = this.f27182;
        if (str != null) {
            c3785.m12294(str);
            this.f27182 = null;
            return c3785;
        }
        this.f27177 = false;
        return this.f27166;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22257(AbstractC0802 abstractC0802) {
        if (!this.f27177) {
            this.f27166 = abstractC0802;
            this.f27177 = true;
            abstractC0802.m3219(this.f27183);
            abstractC0802.m3213(this.f27180.m54668());
            this.f27181 = -1;
            EnumC9750 enumC9750 = abstractC0802.f2843;
            if (enumC9750 == EnumC9750.StartTag) {
                this.f27176 = ((C7514) abstractC0802).f60786;
                this.f27178 = null;
                return;
            } else {
                if (enumC9750 == EnumC9750.EndTag) {
                    C0056 c0056 = (C0056) abstractC0802;
                    if (c0056.m43492()) {
                        m22255("Attributes incorrectly present on end tag [/%s]", c0056.f60787);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new C21552("Must be false");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22254(String str) {
        if (this.f27182 == null) {
            this.f27182 = str;
        } else {
            StringBuilder sb = this.f27171;
            if (sb.length() == 0) {
                sb.append(this.f27182);
            }
            sb.append(str);
        }
        int i = this.f27181;
        C3785 c3785 = this.f27168;
        c3785.m3219(i);
        c3785.m3213(this.f27180.m54668());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22256(StringBuilder sb) {
        if (this.f27182 == null) {
            this.f27182 = sb.toString();
        } else {
            StringBuilder sb2 = this.f27171;
            if (sb2.length() == 0) {
                sb2.append(this.f27182);
            }
            sb2.append((CharSequence) sb);
        }
        int i = this.f27181;
        C3785 c3785 = this.f27168;
        c3785.m3219(i);
        c3785.m3213(this.f27180.m54668());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22253(char c) {
        if (this.f27182 == null) {
            this.f27182 = String.valueOf(c);
        } else {
            StringBuilder sb = this.f27171;
            if (sb.length() == 0) {
                sb.append(this.f27182);
            }
            sb.append(c);
        }
        int i = this.f27181;
        C3785 c3785 = this.f27168;
        c3785.m3219(i);
        c3785.m3213(this.f27180.m54668());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22269(EnumC8806 enumC8806) {
        int i = C2294.f7446[enumC8806.ordinal()];
        C24448 c24448 = this.f27180;
        if (i == 1) {
            this.f27183 = c24448.m54668();
        } else if (i == 2 && this.f27181 == -1) {
            this.f27181 = c24448.m54668();
        }
        this.f27170 = enumC8806;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22258(EnumC8806 enumC8806) {
        m22269(enumC8806);
        this.f27180.m54665();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m22259(Character ch, boolean z) {
        int iIntValue;
        C24448 c24448 = this.f27180;
        if (!c24448.m54677() && ((ch == null || ch.charValue() != c24448.m54678()) && !c24448.m54690(f27164))) {
            c24448.m54691();
            boolean zM54687 = c24448.m54687("#");
            int[] iArr = this.f27179;
            if (zM54687) {
                boolean zM54670 = c24448.m54670("X");
                String strM54676 = zM54670 ? c24448.m54676() : c24448.m54680();
                if (strM54676.length() == 0) {
                    m22250("numeric reference with no numerals", new Object[0]);
                    c24448.m54692();
                    return null;
                }
                c24448.m54675();
                if (!c24448.m54687(l.b)) {
                    m22250("missing semicolon on [&#%s]", strM54676);
                }
                try {
                    iIntValue = Integer.valueOf(strM54676, zM54670 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m22250("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128 && iIntValue < 160) {
                        m22250("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                        iIntValue = f27165[iIntValue + a.g];
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            String strM54667 = c24448.m54667();
            boolean zM54686 = c24448.m54686(';');
            if (!C2073.m7150(strM54667) && (!C2073.m7151(strM54667) || !zM54686)) {
                c24448.m54692();
                if (zM54686) {
                    m22250("invalid named reference [%s]", strM54667);
                }
            } else {
                if (z && (c24448.m54673() || c24448.m54681() || c24448.m54671(a.h, '-', '_'))) {
                    c24448.m54692();
                    return null;
                }
                c24448.m54675();
                if (!c24448.m54687(l.b)) {
                    m22250("missing semicolon on [&%s]", strM54667);
                }
                int[] iArr2 = this.f27167;
                int iM7146 = C2073.m7146(strM54667, iArr2);
                if (iM7146 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (iM7146 == 2) {
                    return iArr2;
                }
                throw new C21552("Unexpected characters returned for ".concat(strM54667));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18701 m22252(boolean z) {
        AbstractC18701 abstractC18701;
        if (z) {
            abstractC18701 = this.f27173;
            abstractC18701.mo3216();
        } else {
            abstractC18701 = this.f27172;
            abstractC18701.mo3216();
        }
        this.f27184 = abstractC18701;
        return abstractC18701;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m22264() {
        this.f27184.m43487();
        m22257(this.f27184);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22268() {
        m22257(this.f27175);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m22265() {
        m22257(this.f27169);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22261() {
        AbstractC0802.m3211(this.f27174);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m22263() {
        return this.f27176 != null && this.f27184.m43498().equalsIgnoreCase(this.f27176);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22251() {
        return this.f27176;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m22266() {
        if (this.f27178 == null) {
            this.f27178 = C25272.m56409("</", this.f27176);
        }
        return this.f27178;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22262(EnumC8806 enumC8806) {
        C3039 c3039 = this.f27185;
        if (c3039.m9877()) {
            C24448 c24448 = this.f27180;
            c3039.add(new C23177(c24448, "Unexpected character '%s' in input state [%s]", Character.valueOf(c24448.m54678()), enumC8806));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22267(EnumC8806 enumC8806) {
        C3039 c3039 = this.f27185;
        if (c3039.m9877()) {
            c3039.add(new C23177(this.f27180, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC8806));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m22250(String str, Object... objArr) {
        C3039 c3039 = this.f27185;
        if (c3039.m9877()) {
            c3039.add(new C23177(this.f27180, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22255(String str, Object... objArr) {
        C3039 c3039 = this.f27185;
        if (c3039.m9877()) {
            c3039.add(new C23177(this.f27180, str, objArr));
        }
    }
}
