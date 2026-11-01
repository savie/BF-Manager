package l;

import com.umeng.analytics.pro.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.۟᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7678 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f25411;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f25412;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f25413;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f25414;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10501 f25415;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f25416;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f25418;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C22185 f25419;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f25421;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean[] f25417 = new boolean[3];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23906 f25420 = new C23906(7);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23906 f25410 = new C23906(8);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23906 f25424 = new C23906(6);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f25423 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2460 f25422 = new C2460();

    public C7678(C22185 c22185, boolean z, boolean z2) {
        this.f25419 = c22185;
        this.f25413 = z;
        this.f25418 = z2;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f25421 = 0L;
        this.f25412 = false;
        this.f25423 = -9223372036854775807L;
        C11551.m28855(this.f25417);
        this.f25420.m52733();
        this.f25410.m52733();
        this.f25424.m52733();
        this.f25419.m49210();
        C10501 c10501 = this.f25415;
        if (c10501 != null) {
            c10501.m26651();
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f25416 = c8074.m21288();
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 2);
        this.f25414 = interfaceC8011Mo7684;
        this.f25415 = new C10501(interfaceC8011Mo7684, this.f25413, this.f25418);
        this.f25419.m49213(interfaceC15690, c8074);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f25423 = j;
        this.f25412 = ((i & 2) != 0) | this.f25412;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20307(long j, int i, long j2) {
        if (!this.f25411 || this.f25415.m26649()) {
            this.f25420.m52734(i);
            this.f25410.m52734(i);
        }
        this.f25424.m52734(i);
        this.f25415.m26646(i, j, j2, this.f25412);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20306(int i, int i2, byte[] bArr) {
        if (!this.f25411 || this.f25415.m26649()) {
            this.f25420.m52730(i, i2, bArr);
            this.f25410.m52730(i, i2, bArr);
        }
        this.f25424.m52730(i, i2, bArr);
        this.f25415.m26645(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20305(int i, int i2, long j, long j2) {
        boolean z = this.f25411;
        C22185 c22185 = this.f25419;
        if (!z || this.f25415.m26649()) {
            C23906 c23906 = this.f25420;
            c23906.m52732(i2);
            C23906 c23907 = this.f25410;
            c23907.m52732(i2);
            if (!this.f25411) {
                if (c23906.m52731() && c23907.m52731()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c23906.f77460, c23906.f77457));
                    arrayList.add(Arrays.copyOf(c23907.f77460, c23907.f77457));
                    C13668 c13668M28857 = C11551.m28857(3, c23906.f77457, c23906.f77460);
                    int i3 = c13668M28857.f45081;
                    C2377 c2377 = new C2377(c23907.f77460, 4, c23907.f77457);
                    int iM7231 = c2377.m7231();
                    int iM7232 = c2377.m7231();
                    c2377.m7236();
                    C4494 c4494 = new C4494(iM7231, iM7232, c2377.m7233());
                    int i4 = c13668M28857.f45075;
                    int i5 = c13668M28857.f45086;
                    int i6 = c13668M28857.f45087;
                    int i7 = C2419.f9699;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                    InterfaceC8011 interfaceC8011 = this.f25414;
                    C10471 c10471 = new C10471();
                    c10471.m26516(this.f25416);
                    c10471.m26521("video/mp2t");
                    c10471.m26533("video/avc");
                    c10471.m26502(str);
                    c10471.m26525(c13668M28857.f45077);
                    c10471.m26534(c13668M28857.f45074);
                    C13293 c13293 = new C13293();
                    c13293.m32777(c13668M28857.f45070);
                    c13293.m32778(c13668M28857.f45078);
                    c13293.m32772(c13668M28857.f45073);
                    c13293.m32776(c13668M28857.f45080 + 8);
                    c13293.m32774(c13668M28857.f45072 + 8);
                    c10471.m26505(c13293.m32773());
                    c10471.m26519(c13668M28857.f45083);
                    c10471.m26503((List) arrayList);
                    c10471.m26526(i3);
                    interfaceC8011.mo8116(c10471.m26497());
                    this.f25411 = true;
                    c22185.m49211(i3);
                    this.f25415.m26648(c13668M28857);
                    this.f25415.m26647(c4494);
                    c23906.m52733();
                    c23907.m52733();
                }
            } else if (c23906.m52731()) {
                C13668 c13668M28858 = C11551.m28857(3, c23906.f77457, c23906.f77460);
                c22185.m49211(c13668M28858.f45081);
                this.f25415.m26648(c13668M28858);
                c23906.m52733();
            } else if (c23907.m52731()) {
                C2377 c2378 = new C2377(c23907.f77460, 4, c23907.f77457);
                int iM7233 = c2378.m7231();
                int iM7234 = c2378.m7231();
                c2378.m7236();
                this.f25415.m26647(new C4494(iM7233, iM7234, c2378.m7233()));
                c23907.m52733();
            }
        }
        C23906 c23908 = this.f25424;
        if (c23908.m52732(i2)) {
            int iM28848 = C11551.m28848(c23908.f77457, c23908.f77460);
            byte[] bArr = c23908.f77460;
            C2460 c2460 = this.f25422;
            c2460.m7508(iM28848, bArr);
            c2460.m7510(4);
            c22185.m49212(j2, c2460);
        }
        if (this.f25415.m26650(j, i, this.f25411)) {
            this.f25412 = false;
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        int i;
        int i2;
        C2023.m6508(this.f25414);
        String str = C17983.f57504;
        int iM7500 = c2460.m7500();
        int iM7509 = c2460.m7509();
        byte[] bArrM7518 = c2460.m7518();
        this.f25421 += (long) c2460.m7503();
        this.f25414.mo8112(c2460.m7503(), c2460);
        while (true) {
            int iM28847 = C11551.m28847(iM7500, iM7509, bArrM7518, this.f25417);
            if (iM28847 == iM7509) {
                m20306(iM7500, iM7509, bArrM7518);
                return;
            }
            int i3 = bArrM7518[iM28847 + 3] & bo.j;
            if (iM28847 <= 0 || bArrM7518[iM28847 - 1] != 0) {
                i = iM28847;
                i2 = 3;
            } else {
                i = iM28847 - 1;
                i2 = 4;
            }
            int i4 = i - iM7500;
            if (i4 > 0) {
                m20306(iM7500, i, bArrM7518);
            }
            int i5 = iM7509 - i;
            long j = this.f25421 - ((long) i5);
            m20305(i5, i4 < 0 ? -i4 : 0, j, this.f25423);
            m20307(j, i3, this.f25423);
            iM7500 = i + i2;
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
        C2023.m6508(this.f25414);
        String str = C17983.f57504;
        if (z) {
            this.f25419.m49214();
            m20305(0, 0, this.f25421, this.f25423);
            m20307(this.f25421, 9, this.f25423);
            m20305(0, 0, this.f25421, this.f25423);
        }
    }
}
