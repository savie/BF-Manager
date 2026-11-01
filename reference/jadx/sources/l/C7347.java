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

/* JADX INFO: renamed from: l.۟۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78HI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7347 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2460 f24404 = new C2460();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f24405;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24406;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f24407;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f24408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f24409;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f24410;

    @Override // l.InterfaceC6951
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        return C22474.m49977(this, bArr, i2);
    }

    public C7347(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f24405 = bArr[24];
            this.f24408 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            int length = bArr.length - 43;
            String str = C17983.f57504;
            this.f24407 = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f24406 = i;
            boolean z = (bArr[0] & UTF8.S_CS3) != 0;
            this.f24409 = z;
            if (z) {
                this.f24410 = C17983.m41810(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f24410 = 0.85f;
                return;
            }
        }
        this.f24405 = 0;
        this.f24408 = -1;
        this.f24407 = "sans-serif";
        this.f24409 = false;
        this.f24410 = 0.85f;
        this.f24406 = -1;
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        String strM7505;
        C2460 c2460 = this.f24404;
        c2460.m7508(i + i2, bArr);
        c2460.m7510(i);
        int i3 = 1;
        int i4 = 2;
        C2023.m6507(c2460.m7503() >= 2);
        int iM7519 = c2460.m7519();
        if (iM7519 == 0) {
            strM7505 = "";
        } else {
            int iM7500 = c2460.m7500();
            Charset charsetM7511 = c2460.m7511();
            int iM7501 = iM7519 - (c2460.m7500() - iM7500);
            if (charsetM7511 == null) {
                charsetM7511 = StandardCharsets.UTF_8;
            }
            strM7505 = c2460.m7505(iM7501, charsetM7511);
        }
        if (strM7505.isEmpty()) {
            interfaceC1008.accept(new C17513(-9223372036854775807L, -9223372036854775807L, AbstractC22433.of()));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM7505);
        m19624(spannableStringBuilder, this.f24405, 0, 0, spannableStringBuilder.length(), 16711680);
        m19623(spannableStringBuilder, this.f24408, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f24407;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM41810 = this.f24410;
        while (c2460.m7503() >= 8) {
            int iM7502 = c2460.m7500();
            int iM7499 = c2460.m7499();
            int iM74910 = c2460.m7499();
            if (iM74910 == 1937013100) {
                C2023.m6507(c2460.m7503() >= i4);
                int iM75110 = c2460.m7519();
                int i5 = 0;
                while (i5 < iM75110) {
                    C2023.m6507(c2460.m7503() >= 12);
                    int iM75111 = c2460.m7519();
                    int iM75112 = c2460.m7519();
                    c2460.m7535(i4);
                    int iM7516 = c2460.m7516();
                    c2460.m7535(i3);
                    int iM74911 = c2460.m7499();
                    if (iM75112 > spannableStringBuilder.length()) {
                        StringBuilder sbM40153 = C17214.m40153(iM75112, "Truncating styl end (", ") to cueText.length() (");
                        sbM40153.append(spannableStringBuilder.length());
                        sbM40153.append(").");
                        C0303.m1848(sbM40153.toString());
                        iM75112 = spannableStringBuilder.length();
                    }
                    if (iM75111 >= iM75112) {
                        C0303.m1848("Ignoring styl with start (" + iM75111 + ") >= end (" + iM75112 + ").");
                    } else {
                        int i6 = iM75112;
                        m19624(spannableStringBuilder, iM7516, this.f24405, iM75111, i6, 0);
                        m19623(spannableStringBuilder, iM74911, this.f24408, iM75111, i6, 0);
                    }
                    i5++;
                    i3 = 1;
                    i4 = 2;
                }
            } else {
                if (iM74910 == 1952608120 && this.f24409) {
                    C2023.m6507(c2460.m7503() >= 2);
                    fM41810 = C17983.m41810(c2460.m7519() / this.f24406, 0.0f, 0.95f);
                }
                c2460.m7510(iM7502 + iM7499);
                i3 = 1;
                i4 = 2;
            }
            c2460.m7510(iM7502 + iM7499);
            i3 = 1;
            i4 = 2;
        }
        C20369 c20369 = new C20369();
        c20369.m46002(spannableStringBuilder);
        c20369.m45998(fM41810, 0);
        c20369.m45999(0);
        interfaceC1008.accept(new C17513(-9223372036854775807L, -9223372036854775807L, AbstractC22433.of((Object) c20369.m45996())));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m19624(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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
    public static void m19623(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }
}
