package l;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.֫᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2150 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19303 f7090;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f7091;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5879 f7092;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f7093;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f7099;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f7101;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f7096 = new boolean[3];

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20795 f7097 = new C20795(32);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20795 f7103 = new C20795(33);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20795 f7100 = new C20795(34);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20795 f7095 = new C20795(39);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20795 f7098 = new C20795(40);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f7102 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21287 f7094 = new C21287();

    public C2150(C19303 c19303) {
        this.f7090 = c19303;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f7099 = 0L;
        this.f7102 = -9223372036854775807L;
        C14399.m34828(this.f7096);
        this.f7097.m47578();
        this.f7103.m47578();
        this.f7100.m47578();
        this.f7095.m47578();
        this.f7098.m47578();
        this.f7090.m44671();
        C5879 c5879 = this.f7092;
        if (c5879 != null) {
            c5879.m17105();
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f7091 = c10857.m27596();
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 2);
        this.f7093 = interfaceC22024Mo16658;
        this.f7092 = new C5879(interfaceC22024Mo16658);
        this.f7090.m44674(interfaceC12789, c10857);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f7102 = j;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m7417(int i, int i2, long j, long j2) {
        this.f7092.m17106(i, i2, j, j2, this.f7101);
        if (!this.f7101) {
            this.f7097.m47579(i2);
            this.f7103.m47579(i2);
            this.f7100.m47579(i2);
        }
        this.f7095.m47579(i2);
        this.f7098.m47579(i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7416(int i, int i2, byte[] bArr) {
        this.f7092.m17107(i, i2, bArr);
        if (!this.f7101) {
            this.f7097.m47575(i, i2, bArr);
            this.f7103.m47575(i, i2, bArr);
            this.f7100.m47575(i, i2, bArr);
        }
        this.f7095.m47575(i, i2, bArr);
        this.f7098.m47575(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7415(int i, int i2, long j, long j2) {
        this.f7092.m17108(j, i, this.f7101);
        boolean z = this.f7101;
        C19303 c19303 = this.f7090;
        if (!z) {
            C20795 c20795 = this.f7097;
            c20795.m47577(i2);
            C20795 c20796 = this.f7103;
            c20796.m47577(i2);
            C20795 c20797 = this.f7100;
            c20797.m47577(i2);
            if (c20795.m47576() && c20796.m47576() && c20797.m47576()) {
                String str = this.f7091;
                int i3 = c20795.f66605;
                byte[] bArr = new byte[c20796.f66605 + i3 + c20797.f66605];
                System.arraycopy(c20795.f66602, 0, bArr, 0, i3);
                System.arraycopy(c20796.f66602, 0, bArr, c20795.f66605, c20796.f66605);
                System.arraycopy(c20797.f66602, 0, bArr, c20795.f66605 + c20796.f66605, c20797.f66605);
                String strM48971 = null;
                C3213 c3213M34824 = C14399.m34824(c20796.f66602, 3, c20796.f66605, (C6197) null);
                C24843 c24843 = c3213M34824.f10468;
                if (c24843 != null) {
                    strM48971 = C21528.m48971(c24843.f80339, c24843.f80341, c24843.f80337, c24843.f80336, c24843.f80338, c24843.f80340);
                }
                C20124 c20124 = new C20124();
                c20124.m46309(str);
                c20124.m46327("video/mp2t");
                c20124.m46315("video/hevc");
                c20124.m46300(strM48971);
                c20124.m46291(c3213M34824.f10469);
                c20124.m46333(c3213M34824.f10463);
                c20124.m46306(c3213M34824.f10466);
                c20124.m46312(c3213M34824.f10467);
                C10207 c10207 = new C10207();
                c10207.m26332(c3213M34824.f10472);
                c10207.m26334(c3213M34824.f10464);
                c10207.m26335(c3213M34824.f10470);
                c10207.m26333(c3213M34824.f10471 + 8);
                c10207.m26330(c3213M34824.f10462 + 8);
                c20124.m46302(c10207.m26329());
                c20124.m46325(c3213M34824.f10473);
                c20124.m46316(c3213M34824.f10461);
                c20124.m46331(c3213M34824.f10465 + 1);
                c20124.m46301(Collections.singletonList(bArr));
                C15648 c15648M46295 = c20124.m46295();
                int i4 = c15648M46295.f50842;
                this.f7093.mo14384(c15648M46295);
                C12128.m30315(i4 != -1);
                c19303.m44672(i4);
                this.f7101 = true;
            }
        }
        C20795 c20798 = this.f7095;
        boolean zM47577 = c20798.m47577(i2);
        C21287 c21287 = this.f7094;
        if (zM47577) {
            c21287.m48491(C14399.m34821(c20798.f66605, c20798.f66602), c20798.f66602);
            c21287.m48503(5);
            c19303.m44673(j2, c21287);
        }
        C20795 c20799 = this.f7098;
        if (c20799.m47577(i2)) {
            c21287.m48491(C14399.m34821(c20799.f66605, c20799.f66602), c20799.f66602);
            c21287.m48503(5);
            c19303.m44673(j2, c21287);
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        int i;
        int i2;
        C20782.m47566(this.f7093);
        String str = C7116.f23455;
        while (c21287.m48486() > 0) {
            int iM48516 = c21287.m48516();
            int iM48509 = c21287.m48509();
            byte[] bArrM48497 = c21287.m48497();
            this.f7099 += (long) c21287.m48486();
            this.f7093.mo14381(c21287.m48486(), c21287);
            while (iM48516 < iM48509) {
                int iM34820 = C14399.m34820(iM48516, iM48509, bArrM48497, this.f7096);
                if (iM34820 == iM48509) {
                    m7416(iM48516, iM48509, bArrM48497);
                    return;
                }
                int i3 = (bArrM48497[iM34820 + 3] & 126) >> 1;
                if (iM34820 <= 0 || bArrM48497[iM34820 - 1] != 0) {
                    i = iM34820;
                    i2 = 3;
                } else {
                    i = iM34820 - 1;
                    i2 = 4;
                }
                int i4 = i - iM48516;
                if (i4 > 0) {
                    m7416(iM48516, i, bArrM48497);
                }
                int i5 = iM48509 - i;
                long j = this.f7099 - ((long) i5);
                m7415(i5, i4 < 0 ? -i4 : 0, j, this.f7102);
                m7417(i5, i3, j, this.f7102);
                iM48516 = i + i2;
            }
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
        C20782.m47566(this.f7093);
        String str = C7116.f23455;
        if (z) {
            this.f7090.m44675();
            m7415(0, 0, this.f7099, this.f7102);
            m7417(0, 48, this.f7099, this.f7102);
        }
    }
}
