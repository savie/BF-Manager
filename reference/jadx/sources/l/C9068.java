package l;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۡۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37NB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9068 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f29471 = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29472 = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f29473;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1150 f29474;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f29475;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1272 f29476;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f29477;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f29479;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21287 f29478 = new C21287();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f29480 = new byte[1024];

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    public C9068(String str, C1150 c1150, InterfaceC1272 interfaceC1272, boolean z) {
        this.f29473 = str;
        this.f29474 = c1150;
        this.f29476 = interfaceC1272;
        this.f29475 = z;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        C9169 c9169 = (C9169) interfaceC19502;
        c9169.mo10078(false, 0, 6, this.f29480);
        byte[] bArr = this.f29480;
        C21287 c21287 = this.f29478;
        c21287.m48491(6, bArr);
        if (C3884.m12525(c21287)) {
            return true;
        }
        c9169.mo10078(false, 6, 3, this.f29480);
        c21287.m48491(9, this.f29480);
        return C3884.m12525(c21287);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        if (this.f29475) {
            interfaceC12789 = new C8729(interfaceC12789, this.f29476);
        }
        this.f29479 = interfaceC12789;
        interfaceC12789.mo16659(new C0857(-9223372036854775807L));
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        this.f29479.getClass();
        int length = (int) interfaceC19502.getLength();
        int i = this.f29477;
        byte[] bArr = this.f29480;
        if (i == bArr.length) {
            this.f29480 = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f29480;
        int i2 = this.f29477;
        int i3 = interfaceC19502.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f29477 + i3;
            this.f29477 = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        C21287 c21287 = new C21287(this.f29480);
        C3884.m12523(c21287);
        long jM19477 = 0;
        long jM12524 = 0;
        for (String strM48515 = c21287.m48515(StandardCharsets.UTF_8); !TextUtils.isEmpty(strM48515); strM48515 = c21287.m48515(StandardCharsets.UTF_8)) {
            if (strM48515.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f29471.matcher(strM48515);
                if (!matcher.find()) {
                    throw C2970.m9688("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM48515), (Throwable) null);
                }
                Matcher matcher2 = f29472.matcher(strM48515);
                if (!matcher2.find()) {
                    throw C2970.m9688("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM48515), (Throwable) null);
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                jM12524 = C3884.m12524(strGroup);
                String strGroup2 = matcher2.group(1);
                strGroup2.getClass();
                long j = Long.parseLong(strGroup2);
                String str = C7116.f23455;
                jM19477 = C7116.m19477(j, 1000000L, 90000L, RoundingMode.DOWN);
            }
        }
        Matcher matcherM12522 = C3884.m12522(c21287);
        if (matcherM12522 == null) {
            m24204(0L);
            return -1;
        }
        String strGroup3 = matcherM12522.group(1);
        strGroup3.getClass();
        long jM12525 = C3884.m12524(strGroup3);
        String str2 = C7116.f23455;
        long jM4249 = this.f29474.m4249(C7116.m19477((jM19477 + jM12525) - jM12524, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
        InterfaceC22024 interfaceC22024M24204 = m24204(jM4249 - jM12525);
        byte[] bArr3 = this.f29480;
        int i5 = this.f29477;
        C21287 c21288 = this.f29478;
        c21288.m48491(i5, bArr3);
        interfaceC22024M24204.mo14381(this.f29477, c21288);
        interfaceC22024M24204.mo14383(jM4249, 1, this.f29477, 0, null);
        return -1;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC22024 m24204(long j) {
        InterfaceC22024 interfaceC22024Mo16658 = this.f29479.mo16658(0, 3);
        C20124 c20124 = new C20124();
        c20124.m46315("text/vtt");
        c20124.m46321(this.f29473);
        c20124.m46298(j);
        interfaceC22024Mo16658.mo14384(c20124.m46295());
        this.f29479.mo16661();
        return interfaceC22024Mo16658;
    }
}
