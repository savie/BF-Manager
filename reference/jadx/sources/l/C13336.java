package l;

import com.umeng.analytics.pro.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.۫᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13336 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f42533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f42534;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f42536;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15573 f42537;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19303 f42541;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f42543;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f42544;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f42545;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f42546;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f42535 = new boolean[3];

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20795 f42540 = new C20795(7);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20795 f42538 = new C20795(8);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20795 f42547 = new C20795(6);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f42539 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21287 f42542 = new C21287();

    public C13336(C19303 c19303, boolean z, boolean z2) {
        this.f42541 = c19303;
        this.f42534 = z;
        this.f42544 = z2;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f42546 = 0L;
        this.f42533 = false;
        this.f42539 = -9223372036854775807L;
        C14399.m34828(this.f42535);
        this.f42540.m47578();
        this.f42538.m47578();
        this.f42547.m47578();
        this.f42541.m44671();
        C15573 c15573 = this.f42537;
        if (c15573 != null) {
            c15573.m37296();
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f42536 = c10857.m27596();
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 2);
        this.f42543 = interfaceC22024Mo16658;
        this.f42537 = new C15573(interfaceC22024Mo16658, this.f42534, this.f42544);
        this.f42541.m44674(interfaceC12789, c10857);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f42539 = j;
        this.f42533 = ((i & 2) != 0) | this.f42533;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32925(long j, int i, long j2) {
        if (!this.f42545 || this.f42537.m37294()) {
            this.f42540.m47579(i);
            this.f42538.m47579(i);
        }
        this.f42547.m47579(i);
        this.f42537.m37291(i, j, j2, this.f42533);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32924(int i, int i2, byte[] bArr) {
        if (!this.f42545 || this.f42537.m37294()) {
            this.f42540.m47575(i, i2, bArr);
            this.f42538.m47575(i, i2, bArr);
        }
        this.f42547.m47575(i, i2, bArr);
        this.f42537.m37290(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32923(int i, int i2, long j, long j2) {
        boolean z = this.f42545;
        C19303 c19303 = this.f42541;
        if (!z || this.f42537.m37294()) {
            C20795 c20795 = this.f42540;
            c20795.m47577(i2);
            C20795 c20796 = this.f42538;
            c20796.m47577(i2);
            if (!this.f42545) {
                if (c20795.m47576() && c20796.m47576()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c20795.f66602, c20795.f66605));
                    arrayList.add(Arrays.copyOf(c20796.f66602, c20796.f66605));
                    C3959 c3959M34830 = C14399.m34830(3, c20795.f66605, c20795.f66602);
                    int i3 = c3959M34830.f13517;
                    C21113 c21113 = new C21113(c20796.f66602, 4, c20796.f66605);
                    int iM48205 = c21113.m48205();
                    int iM48206 = c21113.m48205();
                    c21113.m48204();
                    C24097 c24097 = new C24097(iM48205, iM48206, c21113.m48203());
                    int i4 = c3959M34830.f13507;
                    int i5 = c3959M34830.f13515;
                    int i6 = c3959M34830.f13524;
                    int i7 = C21528.f68786;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                    InterfaceC22024 interfaceC22024 = this.f42543;
                    C20124 c20124 = new C20124();
                    c20124.m46309(this.f42536);
                    c20124.m46327("video/mp2t");
                    c20124.m46315("video/avc");
                    c20124.m46300(str);
                    c20124.m46291(c3959M34830.f13510);
                    c20124.m46333(c3959M34830.f13512);
                    C10207 c10207 = new C10207();
                    c10207.m26332(c3959M34830.f13522);
                    c10207.m26334(c3959M34830.f13511);
                    c10207.m26335(c3959M34830.f13519);
                    c10207.m26333(c3959M34830.f13521 + 8);
                    c10207.m26330(c3959M34830.f13508 + 8);
                    c20124.m46302(c10207.m26329());
                    c20124.m46325(c3959M34830.f13523);
                    c20124.m46301((List) arrayList);
                    c20124.m46316(i3);
                    interfaceC22024.mo14384(c20124.m46295());
                    this.f42545 = true;
                    c19303.m44672(i3);
                    this.f42537.m37292(c3959M34830);
                    this.f42537.m37293(c24097);
                    c20795.m47578();
                    c20796.m47578();
                }
            } else if (c20795.m47576()) {
                C3959 c3959M34831 = C14399.m34830(3, c20795.f66605, c20795.f66602);
                c19303.m44672(c3959M34831.f13517);
                this.f42537.m37292(c3959M34831);
                c20795.m47578();
            } else if (c20796.m47576()) {
                C21113 c21114 = new C21113(c20796.f66602, 4, c20796.f66605);
                int iM48207 = c21114.m48205();
                int iM48208 = c21114.m48205();
                c21114.m48204();
                this.f42537.m37293(new C24097(iM48207, iM48208, c21114.m48203()));
                c20796.m47578();
            }
        }
        C20795 c20797 = this.f42547;
        if (c20797.m47577(i2)) {
            int iM34821 = C14399.m34821(c20797.f66605, c20797.f66602);
            byte[] bArr = c20797.f66602;
            C21287 c21287 = this.f42542;
            c21287.m48491(iM34821, bArr);
            c21287.m48510(4);
            c19303.m44673(j2, c21287);
        }
        if (this.f42537.m37295(j, i, this.f42545)) {
            this.f42533 = false;
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        int i;
        int i2;
        C20782.m47566(this.f42543);
        String str = C7116.f23455;
        int iM48516 = c21287.m48516();
        int iM48509 = c21287.m48509();
        byte[] bArrM48497 = c21287.m48497();
        this.f42546 += (long) c21287.m48486();
        this.f42543.mo14381(c21287.m48486(), c21287);
        while (true) {
            int iM34820 = C14399.m34820(iM48516, iM48509, bArrM48497, this.f42535);
            if (iM34820 == iM48509) {
                m32924(iM48516, iM48509, bArrM48497);
                return;
            }
            int i3 = bArrM48497[iM34820 + 3] & bo.j;
            if (iM34820 <= 0 || bArrM48497[iM34820 - 1] != 0) {
                i = iM34820;
                i2 = 3;
            } else {
                i = iM34820 - 1;
                i2 = 4;
            }
            int i4 = i - iM48516;
            if (i4 > 0) {
                m32924(iM48516, i, bArrM48497);
            }
            int i5 = iM48509 - i;
            long j = this.f42546 - ((long) i5);
            m32923(i5, i4 < 0 ? -i4 : 0, j, this.f42539);
            m32925(j, i3, this.f42539);
            iM48516 = i + i2;
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
        C20782.m47566(this.f42543);
        String str = C7116.f23455;
        if (z) {
            this.f42541.m44675();
            m32923(0, 0, this.f42546, this.f42539);
            m32925(this.f42546, 9, this.f42539);
            m32923(0, 0, this.f42546, this.f42539);
        }
    }
}
