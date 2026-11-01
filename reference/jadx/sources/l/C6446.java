package l;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۜ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37NB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6446 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f21807 = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f21808 = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC13302 f21809;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f21811;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f21813;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6694 f21814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f21815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21816;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2460 f21812 = new C2460();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f21810 = new byte[1024];

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    public C6446(String str, C6694 c6694, InterfaceC13302 interfaceC13302, boolean z) {
        this.f21811 = str;
        this.f21814 = c6694;
        this.f21809 = interfaceC13302;
        this.f21813 = z;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        C14984 c14984 = (C14984) interfaceC7222;
        c14984.mo19219(false, 0, 6, this.f21810);
        byte[] bArr = this.f21810;
        C2460 c2460 = this.f21812;
        c2460.m7508(6, bArr);
        if (C3113.m9342(c2460)) {
            return true;
        }
        c14984.mo19219(false, 6, 3, this.f21810);
        c2460.m7508(9, this.f21810);
        return C3113.m9342(c2460);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        if (this.f21813) {
            interfaceC15690 = new C23180(interfaceC15690, this.f21809);
        }
        this.f21815 = interfaceC15690;
        interfaceC15690.mo7690(new C3776(-9223372036854775807L));
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        this.f21815.getClass();
        int length = (int) interfaceC7222.getLength();
        int i = this.f21816;
        byte[] bArr = this.f21810;
        if (i == bArr.length) {
            this.f21810 = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f21810;
        int i2 = this.f21816;
        int i3 = interfaceC7222.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f21816 + i3;
            this.f21816 = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        C2460 c2460 = new C2460(this.f21810);
        C3113.m9340(c2460);
        long jM41830 = 0;
        long jM9341 = 0;
        for (String strM7523 = c2460.m7523(StandardCharsets.UTF_8); !TextUtils.isEmpty(strM7523); strM7523 = c2460.m7523(StandardCharsets.UTF_8)) {
            if (strM7523.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f21807.matcher(strM7523);
                if (!matcher.find()) {
                    throw C22861.m50610("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM7523), (Throwable) null);
                }
                Matcher matcher2 = f21808.matcher(strM7523);
                if (!matcher2.find()) {
                    throw C22861.m50610("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM7523), (Throwable) null);
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                jM9341 = C3113.m9341(strGroup);
                String strGroup2 = matcher2.group(1);
                strGroup2.getClass();
                long j = Long.parseLong(strGroup2);
                String str = C17983.f57504;
                jM41830 = C17983.m41830(j, 1000000L, 90000L, RoundingMode.DOWN);
            }
        }
        Matcher matcherM9339 = C3113.m9339(c2460);
        if (matcherM9339 == null) {
            m17631(0L);
            return -1;
        }
        String strGroup3 = matcherM9339.group(1);
        strGroup3.getClass();
        long jM9342 = C3113.m9341(strGroup3);
        String str2 = C17983.f57504;
        long jM18077 = this.f21814.m18077(C17983.m41830((jM41830 + jM9342) - jM9341, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
        InterfaceC8011 interfaceC8011M17631 = m17631(jM18077 - jM9342);
        byte[] bArr3 = this.f21810;
        int i5 = this.f21816;
        C2460 c2461 = this.f21812;
        c2461.m7508(i5, bArr3);
        interfaceC8011M17631.mo8112(this.f21816, c2461);
        interfaceC8011M17631.mo8114(jM18077, 1, this.f21816, 0, null);
        return -1;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC8011 m17631(long j) {
        InterfaceC8011 interfaceC8011Mo7684 = this.f21815.mo7684(0, 3);
        C10471 c10471 = new C10471();
        c10471.m26533("text/vtt");
        c10471.m26509(this.f21811);
        c10471.m26500(j);
        interfaceC8011Mo7684.mo8116(c10471.m26497());
        this.f21815.mo7696();
        return interfaceC8011Mo7684;
    }
}
