package l;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15573 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50635;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f50636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f50637;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f50638;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f50640;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f50641;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f50643;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f50644;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f50645;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50647;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f50648;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f50649;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21113 f50650;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50651;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50652;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final SparseArray f50639 = new SparseArray();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final SparseArray f50653 = new SparseArray();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20049 f50646 = new C20049();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20049 f50642 = new C20049();

    public C15573(InterfaceC22024 interfaceC22024, boolean z, boolean z2) {
        this.f50641 = interfaceC22024;
        this.f50637 = z;
        this.f50648 = z2;
        byte[] bArr = new byte[128];
        this.f50640 = bArr;
        this.f50650 = new C21113(bArr, 0, 0);
        m37296();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37294() {
        return this.f50648;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37292(C3959 c3959) {
        this.f50639.append(c3959.f13513, c3959);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37293(C24097 c24097) {
        this.f50653.append(c24097.f77904, c24097);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37296() {
        this.f50644 = false;
        this.f50645 = false;
        this.f50642.m46106();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37291(int i, long j, long j2, boolean z) {
        this.f50635 = i;
        this.f50638 = j2;
        this.f50643 = j;
        this.f50647 = z;
        if (!this.f50637 || i != 1) {
            if (!this.f50648) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C20049 c20049 = this.f50646;
        this.f50646 = this.f50642;
        this.f50642 = c20049;
        c20049.m46106();
        this.f50651 = 0;
        this.f50644 = true;
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
    public final void m37290(int i, int i2, byte[] bArr) {
        boolean zM48203;
        boolean z;
        boolean z2;
        boolean zM48204;
        boolean z3;
        int iM48205;
        int i3;
        int iM48206;
        int iM48208;
        int i4;
        int i5;
        int i6;
        int iM48209;
        int i7;
        int i8;
        int iM482010;
        if (this.f50644) {
            int i9 = i2 - i;
            byte[] bArr2 = this.f50640;
            int length = bArr2.length;
            int i10 = this.f50651 + i9;
            if (length < i10) {
                this.f50640 = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, this.f50640, this.f50651, i9);
            int i11 = this.f50651 + i9;
            this.f50651 = i11;
            byte[] bArr3 = this.f50640;
            C21113 c21113 = this.f50650;
            c21113.m48200(0, i11, bArr3);
            if (c21113.m48201(8)) {
                c21113.m48204();
                int iM48207 = c21113.m48206(2);
                c21113.m48202(5);
                if (c21113.m48207()) {
                    c21113.m48205();
                    if (c21113.m48207()) {
                        int iM482011 = c21113.m48205();
                        if (!this.f50648) {
                            this.f50644 = false;
                            this.f50642.m46107(iM482011);
                            return;
                        }
                        if (c21113.m48207()) {
                            int iM482012 = c21113.m48205();
                            SparseArray sparseArray = this.f50653;
                            if (sparseArray.indexOfKey(iM482012) < 0) {
                                this.f50644 = false;
                                return;
                            }
                            C24097 c24097 = (C24097) sparseArray.get(iM482012);
                            int i12 = c24097.f77903;
                            boolean z4 = c24097.f77902;
                            C3959 c3959 = (C3959) this.f50639.get(i12);
                            boolean z5 = c3959.f13520;
                            int i13 = c3959.f13518;
                            int i14 = c3959.f13506;
                            if (z5) {
                                if (!c21113.m48201(2)) {
                                    return;
                                } else {
                                    c21113.m48202(2);
                                }
                            }
                            if (c21113.m48201(i14)) {
                                int iM482013 = c21113.m48206(i14);
                                if (!c3959.f13509) {
                                    if (c21113.m48201(1)) {
                                        zM48203 = c21113.m48203();
                                        if (zM48203) {
                                            if (!c21113.m48201(1)) {
                                                return;
                                            }
                                            z2 = true;
                                            zM48204 = c21113.m48203();
                                            z = zM48203;
                                        }
                                        if (this.f50635 == 5) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            iM48205 = 0;
                                        } else if (!c21113.m48207()) {
                                            return;
                                        } else {
                                            iM48205 = c21113.m48205();
                                        }
                                        i3 = c3959.f13516;
                                        if (i3 == 0) {
                                            if (c21113.m48201(i13)) {
                                                iM48206 = c21113.m48206(i13);
                                                if (!z4 && !z) {
                                                    if (!c21113.m48207()) {
                                                        return;
                                                    } else {
                                                        iM482010 = c21113.m48208();
                                                    }
                                                }
                                                i5 = iM482010;
                                                i4 = iM48206;
                                                iM48208 = 0;
                                                i6 = iM48208;
                                                i7 = i4;
                                                i8 = i5;
                                                iM48209 = 0;
                                                this.f50642.m46108(c3959, iM48207, iM482011, iM482013, iM482012, z, z2, zM48204, z3, iM48205, i7, i8, i6, iM48209);
                                                this.f50644 = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || c3959.f13514) {
                                            iM48206 = 0;
                                        } else {
                                            if (!c21113.m48207()) {
                                                return;
                                            }
                                            iM48208 = c21113.m48208();
                                            if (!z4 || z) {
                                                i4 = 0;
                                                i5 = 0;
                                                i6 = iM48208;
                                                i7 = i4;
                                                i8 = i5;
                                                iM48209 = 0;
                                            } else {
                                                if (!c21113.m48207()) {
                                                    return;
                                                }
                                                i6 = iM48208;
                                                iM48209 = c21113.m48208();
                                                i7 = 0;
                                                i8 = 0;
                                            }
                                        }
                                        this.f50642.m46108(c3959, iM48207, iM482011, iM482013, iM482012, z, z2, zM48204, z3, iM48205, i7, i8, i6, iM48209);
                                        this.f50644 = false;
                                        iM482010 = 0;
                                        i5 = iM482010;
                                        i4 = iM48206;
                                        iM48208 = 0;
                                        i6 = iM48208;
                                        i7 = i4;
                                        i8 = i5;
                                        iM48209 = 0;
                                        this.f50642.m46108(c3959, iM48207, iM482011, iM482013, iM482012, z, z2, zM48204, z3, iM48205, i7, i8, i6, iM48209);
                                        this.f50644 = false;
                                    }
                                    return;
                                }
                                zM48203 = false;
                                z = zM48203;
                                z2 = false;
                                zM48204 = false;
                                if (this.f50635 == 5) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    iM48205 = 0;
                                } else if (!c21113.m48207()) {
                                    return;
                                } else {
                                    iM48205 = c21113.m48205();
                                }
                                i3 = c3959.f13516;
                                if (i3 == 0) {
                                    if (c21113.m48201(i13)) {
                                        return;
                                    }
                                    iM48206 = c21113.m48206(i13);
                                    if (!z4) {
                                    }
                                    i5 = iM482010;
                                    i4 = iM48206;
                                    iM48208 = 0;
                                    i6 = iM48208;
                                    i7 = i4;
                                    i8 = i5;
                                    iM48209 = 0;
                                    this.f50642.m46108(c3959, iM48207, iM482011, iM482013, iM482012, z, z2, zM48204, z3, iM48205, i7, i8, i6, iM48209);
                                    this.f50644 = false;
                                }
                                if (i3 == 1) {
                                }
                                iM48206 = 0;
                                iM482010 = 0;
                                i5 = iM482010;
                                i4 = iM48206;
                                iM48208 = 0;
                                i6 = iM48208;
                                i7 = i4;
                                i8 = i5;
                                iM48209 = 0;
                                this.f50642.m46108(c3959, iM48207, iM482011, iM482013, iM482012, z, z2, zM48204, z3, iM48205, i7, i8, i6, iM48209);
                                this.f50644 = false;
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
    public final boolean m37295(long j, int i, boolean z) {
        boolean z2 = true;
        if (this.f50635 == 9 || (this.f50648 && C20049.m46105(this.f50642, this.f50646))) {
            if (z && this.f50645) {
                long j2 = this.f50643;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f50649;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f50636;
                    if (j2 != j4) {
                        this.f50641.mo14383(j3, this.f50652 ? 1 : 0, (int) (j2 - j4), i2, null);
                    }
                }
            }
            this.f50636 = this.f50643;
            this.f50649 = this.f50638;
            this.f50652 = false;
            this.f50645 = true;
        }
        boolean zM46109 = this.f50637 ? this.f50642.m46109() : this.f50647;
        boolean z3 = this.f50652;
        int i3 = this.f50635;
        if (i3 != 5 && (!zM46109 || i3 != 1)) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        this.f50652 = z4;
        this.f50635 = 24;
        return z4;
    }
}
