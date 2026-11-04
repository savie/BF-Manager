package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۫ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 78HI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12833 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41109;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f41110;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21287 f41111 = new C21287();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f41112;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f41113;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f41114;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f41115;

    @Override // l.InterfaceC2763
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        return C19171.m44438(this, bArr, i2);
    }

    public C12833(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f41115 = bArr[24];
            this.f41110 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            int length = bArr.length - 43;
            String str = C7116.f23455;
            this.f41113 = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f41109 = i;
            boolean z = (bArr[0] & UTF8.S_CS3) != 0;
            this.f41114 = z;
            if (z) {
                this.f41112 = C7116.m19457(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f41112 = 0.85f;
                return;
            }
        }
        this.f41115 = 0;
        this.f41110 = -1;
        this.f41113 = "sans-serif";
        this.f41114 = false;
        this.f41112 = 0.85f;
        this.f41109 = -1;
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        String strM48488;
        C21287 c21287 = this.f41111;
        c21287.m48491(i + i2, bArr);
        c21287.m48510(i);
        int i3 = 1;
        int i4 = 2;
        C20782.m47565(c21287.m48486() >= 2);
        int iM48494 = c21287.m48494();
        if (iM48494 == 0) {
            strM48488 = "";
        } else {
            int iM48516 = c21287.m48516();
            Charset charsetM48495 = c21287.m48495();
            int iM48517 = iM48494 - (c21287.m48516() - iM48516);
            if (charsetM48495 == null) {
                charsetM48495 = StandardCharsets.UTF_8;
            }
            strM48488 = c21287.m48488(iM48517, charsetM48495);
        }
        if (strM48488.isEmpty()) {
            interfaceC8103.accept(new C16187(-9223372036854775807L, -9223372036854775807L, AbstractC1928.of()));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM48488);
        m31863(spannableStringBuilder, this.f41115, 0, 0, spannableStringBuilder.length(), 16711680);
        m31862(spannableStringBuilder, this.f41110, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f41113;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM19457 = this.f41112;
        while (c21287.m48486() >= 8) {
            int iM48518 = c21287.m48516();
            int iM48500 = c21287.m48500();
            int iM48501 = c21287.m48500();
            if (iM48501 == 1937013100) {
                C20782.m47565(c21287.m48486() >= i4);
                int iM48495 = c21287.m48494();
                int i5 = 0;
                while (i5 < iM48495) {
                    C20782.m47565(c21287.m48486() >= 12);
                    int iM48496 = c21287.m48494();
                    int iM48497 = c21287.m48494();
                    c21287.m48503(i4);
                    int iM48493 = c21287.m48493();
                    c21287.m48503(i3);
                    int iM48502 = c21287.m48500();
                    if (iM48497 > spannableStringBuilder.length()) {
                        StringBuilder sbM12235 = C3769.m12235(iM48497, "Truncating styl end (", ") to cueText.length() (");
                        sbM12235.append(spannableStringBuilder.length());
                        sbM12235.append(").");
                        C1896.m6517(sbM12235.toString());
                        iM48497 = spannableStringBuilder.length();
                    }
                    if (iM48496 >= iM48497) {
                        C1896.m6517("Ignoring styl with start (" + iM48496 + ") >= end (" + iM48497 + ").");
                    } else {
                        int i6 = iM48497;
                        m31863(spannableStringBuilder, iM48493, this.f41115, iM48496, i6, 0);
                        m31862(spannableStringBuilder, iM48502, this.f41110, iM48496, i6, 0);
                    }
                    i5++;
                    i3 = 1;
                    i4 = 2;
                }
            } else {
                if (iM48501 == 1952608120 && this.f41114) {
                    C20782.m47565(c21287.m48486() >= 2);
                    fM19457 = C7116.m19457(c21287.m48494() / this.f41109, 0.0f, 0.95f);
                }
                c21287.m48510(iM48518 + iM48500);
                i3 = 1;
                i4 = 2;
            }
            c21287.m48510(iM48518 + iM48500);
            i3 = 1;
            i4 = 2;
        }
        C5866 c5866 = new C5866();
        c5866.m17079(spannableStringBuilder);
        c5866.m17075(fM19457, 0);
        c5866.m17076(0);
        interfaceC8103.accept(new C16187(-9223372036854775807L, -9223372036854775807L, AbstractC1928.of((Object) c5866.m17073())));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m31863(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31862(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }
}
