package l;

import android.util.Pair;
import com.umeng.analytics.pro.bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.Collections;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ᩳ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18261 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final double[] f58264 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f58265;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f58266;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f58267;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58268;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f58269;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f58270;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C2460 f58271;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f58272;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean[] f58273 = new boolean[4];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21789 f58274;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f58275;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f58276;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23906 f58277;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C10191 f58278;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f58279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f58280;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f58281;

    public C18261(C10191 c10191, String str) {
        this.f58278 = c10191;
        this.f58268 = str;
        C21789 c21789 = new C21789();
        c21789.f70574 = new byte[128];
        this.f58274 = c21789;
        if (c10191 != null) {
            this.f58277 = new C23906(178);
            this.f58271 = new C2460();
        } else {
            this.f58277 = null;
            this.f58271 = null;
        }
        this.f58265 = -9223372036854775807L;
        this.f58275 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        C11551.m28855(this.f58273);
        this.f58274.m48548();
        C23906 c23906 = this.f58277;
        if (c23906 != null) {
            c23906.m52733();
        }
        this.f58276 = 0L;
        this.f58279 = false;
        this.f58265 = -9223372036854775807L;
        this.f58275 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f58272 = c8074.m21288();
        this.f58280 = interfaceC15690.mo7684(c8074.m21287(), 2);
        C10191 c10191 = this.f58278;
        if (c10191 != null) {
            c10191.m25968(interfaceC15690, c8074);
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f58265 = j;
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
    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        C21789 c21789;
        C23906 c23906;
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j;
        C2023.m6508(this.f58280);
        int iM7500 = c2460.m7500();
        int iM7509 = c2460.m7509();
        byte[] bArrM7518 = c2460.m7518();
        this.f58276 += (long) c2460.m7503();
        this.f58280.mo8112(c2460.m7503(), c2460);
        while (true) {
            int iM28847 = C11551.m28847(iM7500, iM7509, bArrM7518, this.f58273);
            c21789 = this.f58274;
            c23906 = this.f58277;
            if (iM28847 == iM7509) {
                break;
            }
            int i5 = iM28847 + 3;
            int i6 = c2460.m7518()[i5] & 255;
            int i7 = iM28847 - iM7500;
            if (this.f58269) {
                i6 = i6;
                i5 = i5;
            } else {
                if (i7 > 0) {
                    c21789.m48549(iM7500, iM28847, bArrM7518);
                }
                if (c21789.m48550(i6, i7 < 0 ? -i7 : 0)) {
                    String str = this.f58272;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c21789.f70574, c21789.f70575);
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
                        C10471 c10471 = new C10471();
                        c10471.m26516(str);
                        c10471.m26521(this.f58268);
                        c10471.m26533("video/mpeg2");
                        c10471.m26525(i9);
                        c10471.m26534(i10);
                        c10471.m26519(f2);
                        c10471.m26503(Collections.singletonList(bArrCopyOf));
                        C7648 c7648M26497 = c10471.m26497();
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        if (i4 >= 0 || i4 >= 8) {
                            i6 = i6;
                            i5 = i5;
                            j = 0;
                        } else {
                            double d = f58264[i4];
                            byte b2 = bArrCopyOf[c21789.f70573 + 9];
                            int i12 = (b2 & UTF8.S_P4B) >> 5;
                            int i13 = b2 & bo.j;
                            if (i12 != i13) {
                                d *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(c7648M26497, Long.valueOf(j));
                        this.f58280.mo8116((C7648) pairCreate.first);
                        this.f58266 = ((Long) pairCreate.second).longValue();
                        this.f58269 = true;
                    } else {
                        f = i10 * 16;
                        i3 = i9 * 9;
                    }
                    f2 = f / i3;
                    C10471 c10472 = new C10471();
                    c10472.m26516(str);
                    c10472.m26521(this.f58268);
                    c10472.m26533("video/mpeg2");
                    c10472.m26525(i9);
                    c10472.m26534(i10);
                    c10472.m26519(f2);
                    c10472.m26503(Collections.singletonList(bArrCopyOf));
                    C7648 c7648M26498 = c10472.m26497();
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
                    Pair pairCreate2 = Pair.create(c7648M26498, Long.valueOf(j));
                    this.f58280.mo8116((C7648) pairCreate2.first);
                    this.f58266 = ((Long) pairCreate2.second).longValue();
                    this.f58269 = true;
                } else {
                    i6 = i6;
                    i5 = i5;
                }
            }
            if (c23906 != null) {
                if (i7 > 0) {
                    c23906.m52730(iM7500, iM28847, bArrM7518);
                    i2 = 0;
                } else {
                    i2 = -i7;
                }
                if (c23906.m52732(i2)) {
                    int iM28848 = C11551.m28848(c23906.f77457, c23906.f77460);
                    String str2 = C17983.f57504;
                    byte[] bArr = c23906.f77460;
                    C2460 c2461 = this.f58271;
                    c2461.m7508(iM28848, bArr);
                    this.f58278.m25967(this.f58275, c2461);
                }
                i = i6;
                if (i == 178 && c2460.m7518()[iM28847 + 2] == 1) {
                    c23906.m52734(i);
                }
            } else {
                i = i6;
            }
            if (i == 0 || i == 179) {
                int i14 = iM7509 - iM28847;
                if (this.f58267 && this.f58269) {
                    long j2 = this.f58275;
                    if (j2 != -9223372036854775807L) {
                        this.f58280.mo8114(j2, this.f58270 ? 1 : 0, ((int) (this.f58276 - this.f58281)) - i14, i14, null);
                    }
                }
                if (!this.f58279 || this.f58267) {
                    this.f58281 = this.f58276 - ((long) i14);
                    long j3 = this.f58265;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f58275;
                        j3 = j4 != -9223372036854775807L ? j4 + this.f58266 : -9223372036854775807L;
                    }
                    this.f58275 = j3;
                    this.f58270 = false;
                    this.f58265 = -9223372036854775807L;
                    this.f58279 = true;
                }
                this.f58267 = i == 0;
            } else if (i == 184) {
                this.f58270 = true;
            }
            iM7500 = i5;
        }
        if (!this.f58269) {
            c21789.m48549(iM7500, iM7509, bArrM7518);
        }
        if (c23906 != null) {
            c23906.m52730(iM7500, iM7509, bArrM7518);
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
    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
        C2023.m6508(this.f58280);
        if (z) {
            boolean z2 = this.f58270;
            this.f58280.mo8114(this.f58275, z2 ? 1 : 0, (int) (this.f58276 - this.f58281), 0, null);
        }
    }
}
