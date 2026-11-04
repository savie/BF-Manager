package l;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩸᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes.dex */
public final class C23033 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final float[] f74737 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20795 f74738;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22287 f74739;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f74740;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f74741;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21287 f74742;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11098 f74743;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f74744 = new boolean[4];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f74745;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f74746;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f74747;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15332 f74748;

    public C23033(C15332 c15332) {
        this.f74748 = c15332;
        C22287 c22287 = new C22287();
        c22287.f72162 = new byte[128];
        this.f74739 = c22287;
        this.f74745 = -9223372036854775807L;
        this.f74738 = new C20795(178);
        this.f74742 = new C21287();
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        C14399.m34828(this.f74744);
        this.f74739.m50349();
        C11098 c11098 = this.f74743;
        if (c11098 != null) {
            c11098.m28046();
        }
        C20795 c20795 = this.f74738;
        if (c20795 != null) {
            c20795.m47578();
        }
        this.f74740 = 0L;
        this.f74745 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f74746 = c10857.m27596();
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 2);
        this.f74747 = interfaceC22024Mo16658;
        this.f74743 = new C11098(interfaceC22024Mo16658);
        this.f74748.m36781(interfaceC12789, c10857);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f74745 = j;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        C22287 c22287;
        C20795 c20795;
        int i;
        float f;
        C20782.m47566(this.f74743);
        C20782.m47566(this.f74747);
        int iM48516 = c21287.m48516();
        int iM48509 = c21287.m48509();
        byte[] bArrM48497 = c21287.m48497();
        this.f74740 += (long) c21287.m48486();
        this.f74747.mo14381(c21287.m48486(), c21287);
        while (true) {
            int iM34820 = C14399.m34820(iM48516, iM48509, bArrM48497, this.f74744);
            c22287 = this.f74739;
            c20795 = this.f74738;
            if (iM34820 == iM48509) {
                break;
            }
            int i2 = iM34820 + 3;
            int i3 = c21287.m48497()[i2] & 255;
            int i4 = iM34820 - iM48516;
            if (!this.f74741) {
                if (i4 > 0) {
                    c22287.m50350(iM48516, iM34820, bArrM48497);
                }
                if (c22287.m50351(i3, i4 < 0 ? -i4 : 0)) {
                    InterfaceC22024 interfaceC22024 = this.f74747;
                    int i5 = c22287.f72164;
                    String str = this.f74746;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c22287.f72162, c22287.f72163);
                    C14573 c14573 = new C14573(bArrCopyOf, bArrCopyOf.length);
                    c14573.m35160(i5);
                    c14573.m35160(4);
                    c14573.m35159();
                    c14573.m35161(8);
                    if (c14573.m35162()) {
                        c14573.m35161(4);
                        c14573.m35161(3);
                    }
                    int iM35163 = c14573.m35163(4);
                    if (iM35163 == 15) {
                        int iM35164 = c14573.m35163(8);
                        int iM35165 = c14573.m35163(8);
                        if (iM35165 == 0) {
                            C1896.m6517("Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iM35164 / iM35165;
                        }
                    } else if (iM35163 < 7) {
                        f = f74737[iM35163];
                    } else {
                        C1896.m6517("Invalid aspect ratio");
                        f = 1.0f;
                    }
                    int i6 = 2;
                    if (c14573.m35162()) {
                        c14573.m35161(2);
                        c14573.m35161(1);
                        if (c14573.m35162()) {
                            c14573.m35161(15);
                            c14573.m35159();
                            c14573.m35161(15);
                            c14573.m35159();
                            c14573.m35161(15);
                            c14573.m35159();
                            c14573.m35161(3);
                            c14573.m35161(11);
                            c14573.m35159();
                            c14573.m35161(15);
                            c14573.m35159();
                            i6 = 2;
                        }
                    }
                    if (c14573.m35163(i6) != 0) {
                        C1896.m6517("Unhandled video object layer shape");
                    }
                    c14573.m35159();
                    int iM35166 = c14573.m35163(16);
                    c14573.m35159();
                    if (c14573.m35162()) {
                        if (iM35166 == 0) {
                            C1896.m6517("Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = 0;
                            for (int i8 = iM35166 - 1; i8 > 0; i8 >>= 1) {
                                i7++;
                            }
                            c14573.m35161(i7);
                        }
                    }
                    c14573.m35159();
                    int iM35167 = c14573.m35163(13);
                    c14573.m35159();
                    int iM35168 = c14573.m35163(13);
                    c14573.m35159();
                    c14573.m35159();
                    C20124 c20124 = new C20124();
                    c20124.m46309(str);
                    c20124.m46327("video/mp2t");
                    c20124.m46315("video/mp4v-es");
                    c20124.m46291(iM35167);
                    c20124.m46333(iM35168);
                    c20124.m46325(f);
                    c20124.m46301(Collections.singletonList(bArrCopyOf));
                    interfaceC22024.mo14384(c20124.m46295());
                    this.f74741 = true;
                }
            }
            this.f74743.m28047(iM48516, iM34820, bArrM48497);
            if (c20795 != null) {
                if (i4 > 0) {
                    c20795.m47575(iM48516, iM34820, bArrM48497);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (c20795.m47577(i)) {
                    int iM34821 = C14399.m34821(c20795.f66605, c20795.f66602);
                    String str2 = C7116.f23455;
                    byte[] bArr = c20795.f66602;
                    C21287 c21288 = this.f74742;
                    c21288.m48491(iM34821, bArr);
                    this.f74748.m36780(this.f74745, c21288);
                }
                if (i3 == 178 && c21287.m48497()[iM34820 + 2] == 1) {
                    c20795.m47579(i3);
                }
            }
            int i9 = iM48509 - iM34820;
            this.f74743.m28049(this.f74740 - ((long) i9), i9, this.f74741);
            this.f74743.m28048(i3, this.f74745);
            iM48516 = i2;
        }
        if (!this.f74741) {
            c22287.m50350(iM48516, iM48509, bArrM48497);
        }
        this.f74743.m28047(iM48516, iM48509, bArrM48497);
        if (c20795 != null) {
            c20795.m47575(iM48516, iM48509, bArrM48497);
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
        C20782.m47566(this.f74743);
        if (z) {
            this.f74743.m28049(this.f74740, 0, this.f74741);
            this.f74743.m28046();
        }
    }
}
