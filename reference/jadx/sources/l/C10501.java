package l;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10501 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f35971;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f35972;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f35973;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35974;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f35975;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f35976;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f35977;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f35980;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f35981;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2377 f35982;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f35984;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f35985;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f35986;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35987;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f35988;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final SparseArray f35979 = new SparseArray();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final SparseArray f35989 = new SparseArray();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C9090 f35983 = new C9090();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C9090 f35978 = new C9090();

    public C10501(InterfaceC8011 interfaceC8011, boolean z, boolean z2) {
        this.f35976 = interfaceC8011;
        this.f35974 = z;
        this.f35975 = z2;
        byte[] bArr = new byte[128];
        this.f35980 = bArr;
        this.f35982 = new C2377(bArr, 0, 0);
        m26651();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26649() {
        return this.f35975;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26648(C13668 c13668) {
        this.f35979.append(c13668.f45076, c13668);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26647(C4494 c4494) {
        this.f35989.append(c4494.f15997, c4494);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26651() {
        this.f35988 = false;
        this.f35984 = false;
        this.f35978.m23430();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26646(int i, long j, long j2, boolean z) {
        this.f35973 = i;
        this.f35981 = j2;
        this.f35971 = j;
        this.f35987 = z;
        if (!this.f35974 || i != 1) {
            if (!this.f35975) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C9090 c9090 = this.f35983;
        this.f35983 = this.f35978;
        this.f35978 = c9090;
        c9090.m23430();
        this.f35972 = 0;
        this.f35988 = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26645(int i, int i2, byte[] bArr) {
        boolean zM7233;
        boolean z;
        boolean z2;
        boolean zM7234;
        boolean z3;
        int iM7231;
        int i3;
        int iM7234;
        int iM7227;
        int i4;
        int i5;
        int i6;
        int iM7228;
        int i7;
        int i8;
        int iM7229;
        if (this.f35988) {
            int i9 = i2 - i;
            byte[] bArr2 = this.f35980;
            int length = bArr2.length;
            int i10 = this.f35972 + i9;
            if (length < i10) {
                this.f35980 = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, this.f35980, this.f35972, i9);
            int i11 = this.f35972 + i9;
            this.f35972 = i11;
            byte[] bArr3 = this.f35980;
            C2377 c2377 = this.f35982;
            c2377.m7229(0, i11, bArr3);
            if (c2377.m7230(8)) {
                c2377.m7236();
                int iM7235 = c2377.m7234(2);
                c2377.m7232(5);
                if (c2377.m7235()) {
                    c2377.m7231();
                    if (c2377.m7235()) {
                        int iM7232 = c2377.m7231();
                        if (!this.f35975) {
                            this.f35988 = false;
                            this.f35978.m23431(iM7232);
                            return;
                        }
                        if (c2377.m7235()) {
                            int iM7233 = c2377.m7231();
                            SparseArray sparseArray = this.f35989;
                            if (sparseArray.indexOfKey(iM7233) < 0) {
                                this.f35988 = false;
                                return;
                            }
                            C4494 c4494 = (C4494) sparseArray.get(iM7233);
                            int i12 = c4494.f15996;
                            boolean z4 = c4494.f15995;
                            C13668 c13668 = (C13668) this.f35979.get(i12);
                            boolean z5 = c13668.f45084;
                            int i13 = c13668.f45085;
                            int i14 = c13668.f45071;
                            if (z5) {
                                if (!c2377.m7230(2)) {
                                    return;
                                } else {
                                    c2377.m7232(2);
                                }
                            }
                            if (c2377.m7230(i14)) {
                                int iM7236 = c2377.m7234(i14);
                                if (!c13668.f45079) {
                                    if (c2377.m7230(1)) {
                                        zM7233 = c2377.m7233();
                                        if (zM7233) {
                                            if (!c2377.m7230(1)) {
                                                return;
                                            }
                                            z2 = true;
                                            zM7234 = c2377.m7233();
                                            z = zM7233;
                                        }
                                        if (this.f35973 == 5) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            iM7231 = 0;
                                        } else if (!c2377.m7235()) {
                                            return;
                                        } else {
                                            iM7231 = c2377.m7231();
                                        }
                                        i3 = c13668.f45082;
                                        if (i3 == 0) {
                                            if (c2377.m7230(i13)) {
                                                iM7234 = c2377.m7234(i13);
                                                if (!z4 && !z) {
                                                    if (!c2377.m7235()) {
                                                        return;
                                                    } else {
                                                        iM7229 = c2377.m7227();
                                                    }
                                                }
                                                i5 = iM7229;
                                                i4 = iM7234;
                                                iM7227 = 0;
                                                i6 = iM7227;
                                                i7 = i4;
                                                i8 = i5;
                                                iM7228 = 0;
                                                this.f35978.m23432(c13668, iM7235, iM7232, iM7236, iM7233, z, z2, zM7234, z3, iM7231, i7, i8, i6, iM7228);
                                                this.f35988 = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || c13668.f45069) {
                                            iM7234 = 0;
                                        } else {
                                            if (!c2377.m7235()) {
                                                return;
                                            }
                                            iM7227 = c2377.m7227();
                                            if (!z4 || z) {
                                                i4 = 0;
                                                i5 = 0;
                                                i6 = iM7227;
                                                i7 = i4;
                                                i8 = i5;
                                                iM7228 = 0;
                                            } else {
                                                if (!c2377.m7235()) {
                                                    return;
                                                }
                                                i6 = iM7227;
                                                iM7228 = c2377.m7227();
                                                i7 = 0;
                                                i8 = 0;
                                            }
                                        }
                                        this.f35978.m23432(c13668, iM7235, iM7232, iM7236, iM7233, z, z2, zM7234, z3, iM7231, i7, i8, i6, iM7228);
                                        this.f35988 = false;
                                        iM7229 = 0;
                                        i5 = iM7229;
                                        i4 = iM7234;
                                        iM7227 = 0;
                                        i6 = iM7227;
                                        i7 = i4;
                                        i8 = i5;
                                        iM7228 = 0;
                                        this.f35978.m23432(c13668, iM7235, iM7232, iM7236, iM7233, z, z2, zM7234, z3, iM7231, i7, i8, i6, iM7228);
                                        this.f35988 = false;
                                    }
                                    return;
                                }
                                zM7233 = false;
                                z = zM7233;
                                z2 = false;
                                zM7234 = false;
                                if (this.f35973 == 5) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    iM7231 = 0;
                                } else if (!c2377.m7235()) {
                                    return;
                                } else {
                                    iM7231 = c2377.m7231();
                                }
                                i3 = c13668.f45082;
                                if (i3 == 0) {
                                    if (c2377.m7230(i13)) {
                                        return;
                                    }
                                    iM7234 = c2377.m7234(i13);
                                    if (!z4) {
                                    }
                                    i5 = iM7229;
                                    i4 = iM7234;
                                    iM7227 = 0;
                                    i6 = iM7227;
                                    i7 = i4;
                                    i8 = i5;
                                    iM7228 = 0;
                                    this.f35978.m23432(c13668, iM7235, iM7232, iM7236, iM7233, z, z2, zM7234, z3, iM7231, i7, i8, i6, iM7228);
                                    this.f35988 = false;
                                }
                                if (i3 == 1) {
                                }
                                iM7234 = 0;
                                iM7229 = 0;
                                i5 = iM7229;
                                i4 = iM7234;
                                iM7227 = 0;
                                i6 = iM7227;
                                i7 = i4;
                                i8 = i5;
                                iM7228 = 0;
                                this.f35978.m23432(c13668, iM7235, iM7232, iM7236, iM7233, z, z2, zM7234, z3, iM7231, i7, i8, i6, iM7228);
                                this.f35988 = false;
                            }
                        }
                    }
                }
            }
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26650(long j, int i, boolean z) {
        boolean z2 = true;
        if (this.f35973 == 9 || (this.f35975 && C9090.m23429(this.f35978, this.f35983))) {
            if (z && this.f35984) {
                long j2 = this.f35971;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f35986;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f35977;
                    if (j2 != j4) {
                        this.f35976.mo8114(j3, this.f35985 ? 1 : 0, (int) (j2 - j4), i2, null);
                    }
                }
            }
            this.f35977 = this.f35971;
            this.f35986 = this.f35981;
            this.f35985 = false;
            this.f35984 = true;
        }
        boolean zM23433 = this.f35974 ? this.f35978.m23433() : this.f35987;
        boolean z3 = this.f35985;
        int i3 = this.f35973;
        if (i3 != 5 && (!zM23433 || i3 != 1)) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        this.f35985 = z4;
        this.f35973 = 24;
        return z4;
    }
}
