package l;

import android.util.Pair;
import com.umeng.analytics.pro.bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.Collections;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۙ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5133 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final double[] f17874 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17875;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21287 f17876;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f17877;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f17878 = new boolean[4];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f17879;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f17880;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f17881;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f17882;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f17883;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f17884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f17885;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f17886;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C15332 f17887;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13578 f17888;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f17889;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20795 f17890;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f17891;

    public C5133(C15332 c15332, String str) {
        this.f17887 = c15332;
        this.f17877 = str;
        C13578 c13578 = new C13578();
        c13578.f43126 = new byte[128];
        this.f17888 = c13578;
        if (c15332 != null) {
            this.f17890 = new C20795(178);
            this.f17876 = new C21287();
        } else {
            this.f17890 = null;
            this.f17876 = null;
        }
        this.f17881 = -9223372036854775807L;
        this.f17884 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        C14399.m34828(this.f17878);
        this.f17888.m33285();
        C20795 c20795 = this.f17890;
        if (c20795 != null) {
            c20795.m47578();
        }
        this.f17883 = 0L;
        this.f17885 = false;
        this.f17881 = -9223372036854775807L;
        this.f17884 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f17879 = c10857.m27596();
        this.f17882 = interfaceC12789.mo16658(c10857.m27595(), 2);
        C15332 c15332 = this.f17887;
        if (c15332 != null) {
            c15332.m36781(interfaceC12789, c10857);
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f17881 = j;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0131  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        C13578 c13578;
        C20795 c20795;
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j;
        C20782.m47566(this.f17882);
        int iM48516 = c21287.m48516();
        int iM48509 = c21287.m48509();
        byte[] bArrM48497 = c21287.m48497();
        this.f17883 += (long) c21287.m48486();
        this.f17882.mo14381(c21287.m48486(), c21287);
        while (true) {
            int iM34820 = C14399.m34820(iM48516, iM48509, bArrM48497, this.f17878);
            c13578 = this.f17888;
            c20795 = this.f17890;
            if (iM34820 == iM48509) {
                break;
            }
            int i5 = iM34820 + 3;
            int i6 = c21287.m48497()[i5] & 255;
            int i7 = iM34820 - iM48516;
            if (this.f17886) {
                i6 = i6;
                i5 = i5;
            } else {
                if (i7 > 0) {
                    c13578.m33286(iM48516, iM34820, bArrM48497);
                }
                if (c13578.m33287(i6, i7 < 0 ? -i7 : 0)) {
                    String str = this.f17879;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c13578.f43126, c13578.f43127);
                    int i8 = bArrCopyOf[4] & 255;
                    byte b = bArrCopyOf[5];
                    int i9 = (i8 << 4) | ((b & 255) >> 4);
                    int i10 = (bArrCopyOf[6] & 255) | ((b & 15) << 8);
                    int i11 = (bArrCopyOf[7] & 240) >> 4;
                    if (i11 == 2) {
                        f = i10 * 4;
                        i3 = i9 * 3;
                    } else if (i11 != 3) {
                        if (i11 != 4) {
                            f2 = 1.0f;
                        } else {
                            f = i10 * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i3 = i9 * 100;
                        }
                        C20124 c20124 = new C20124();
                        c20124.m46309(str);
                        c20124.m46327(this.f17877);
                        c20124.m46315("video/mpeg2");
                        c20124.m46291(i9);
                        c20124.m46333(i10);
                        c20124.m46325(f2);
                        c20124.m46301(Collections.singletonList(bArrCopyOf));
                        C15648 c15648M46295 = c20124.m46295();
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        if (i4 >= 0 || i4 >= 8) {
                            i6 = i6;
                            i5 = i5;
                            j = 0;
                        } else {
                            double d = f17874[i4];
                            byte b2 = bArrCopyOf[c13578.f43129 + 9];
                            int i12 = (b2 & UTF8.S_P4B) >> 5;
                            int i13 = b2 & bo.j;
                            if (i12 != i13) {
                                d *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(c15648M46295, Long.valueOf(j));
                        this.f17882.mo14384((C15648) pairCreate.first);
                        this.f17889 = ((Long) pairCreate.second).longValue();
                        this.f17886 = true;
                    } else {
                        f = i10 * 16;
                        i3 = i9 * 9;
                    }
                    f2 = f / i3;
                    C20124 c20125 = new C20124();
                    c20125.m46309(str);
                    c20125.m46327(this.f17877);
                    c20125.m46315("video/mpeg2");
                    c20125.m46291(i9);
                    c20125.m46333(i10);
                    c20125.m46325(f2);
                    c20125.m46301(Collections.singletonList(bArrCopyOf));
                    C15648 c15648M46296 = c20125.m46295();
                    i4 = (bArrCopyOf[7] & 15) - 1;
                    if (i4 >= 0) {
                        i6 = i6;
                        i5 = i5;
                        j = 0;
                    } else {
                        i6 = i6;
                        i5 = i5;
                        j = 0;
                    }
                    Pair pairCreate2 = Pair.create(c15648M46296, Long.valueOf(j));
                    this.f17882.mo14384((C15648) pairCreate2.first);
                    this.f17889 = ((Long) pairCreate2.second).longValue();
                    this.f17886 = true;
                } else {
                    i6 = i6;
                    i5 = i5;
                }
            }
            if (c20795 != null) {
                if (i7 > 0) {
                    c20795.m47575(iM48516, iM34820, bArrM48497);
                    i2 = 0;
                } else {
                    i2 = -i7;
                }
                if (c20795.m47577(i2)) {
                    int iM34821 = C14399.m34821(c20795.f66605, c20795.f66602);
                    String str2 = C7116.f23455;
                    byte[] bArr = c20795.f66602;
                    C21287 c21288 = this.f17876;
                    c21288.m48491(iM34821, bArr);
                    this.f17887.m36780(this.f17884, c21288);
                }
                i = i6;
                if (i == 178 && c21287.m48497()[iM34820 + 2] == 1) {
                    c20795.m47579(i);
                }
            } else {
                i = i6;
            }
            if (i == 0 || i == 179) {
                int i14 = iM48509 - iM34820;
                if (this.f17875 && this.f17886) {
                    long j2 = this.f17884;
                    if (j2 != -9223372036854775807L) {
                        this.f17882.mo14383(j2, this.f17880 ? 1 : 0, ((int) (this.f17883 - this.f17891)) - i14, i14, null);
                    }
                }
                if (!this.f17885 || this.f17875) {
                    this.f17891 = this.f17883 - ((long) i14);
                    long j3 = this.f17881;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f17884;
                        j3 = j4 != -9223372036854775807L ? j4 + this.f17889 : -9223372036854775807L;
                    }
                    this.f17884 = j3;
                    this.f17880 = false;
                    this.f17881 = -9223372036854775807L;
                    this.f17885 = true;
                }
                this.f17875 = i == 0;
            } else if (i == 184) {
                this.f17880 = true;
            }
            iM48516 = i5;
        }
        if (!this.f17886) {
            c13578.m33286(iM48516, iM48509, bArrM48497);
        }
        if (c20795 != null) {
            c20795.m47575(iM48516, iM48509, bArrM48497);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
        C20782.m47566(this.f17882);
        if (z) {
            boolean z2 = this.f17880;
            this.f17882.mo14383(this.f17884, z2 ? 1 : 0, (int) (this.f17883 - this.f17891), 0, null);
        }
    }
}
