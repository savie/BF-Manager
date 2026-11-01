package l;

import com.umeng.analytics.pro.cb;
import java.math.BigInteger;
import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩸ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7X1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21418 extends AbstractC2367 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC2367 f69629;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69613 = {42, -122, 72, -122, -9, cb.k, 1, 1, 1};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69614 = {42, -122, 72, -50, 56, 4, 1};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f69610 = {42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 2, 1};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f69627 = {43, 101, KeyFactorySpi.Ed25519_type};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69620 = {43, 101, KeyFactorySpi.Ed448_type};

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69608 = {42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7};

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69618 = {43, -127, 4, 0, 34};

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69616 = {43, -127, 4, 0, 35};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69615 = {42, -122, 72, -122, -9, cb.k, 1, 5, cb.k};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f69628 = {42, -122, 72, -122, -9, cb.k, 1, 5, 12};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69607 = {43, 6, 1, 4, 1, -38, 71, 4, 11};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69623 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 2};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69624 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 22};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final byte[] f69611 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 42};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69612 = {43, cb.f77931l, 3, 2, 7};

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f69625 = {42, -122, 72, -122, -9, cb.k, 3, 7};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69619 = {42, -122, 72, -122, -9, cb.k, 3, 2};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f69606 = {42, -122, 72, -122, -9, cb.k, 3, 9};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f69626 = {42, -122, 72, -122, -9, cb.k, 1, 5, 1};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f69605 = {42, -122, 72, -122, -9, cb.k, 1, 5, 4};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69621 = {42, -122, 72, -122, -9, cb.k, 1, 5, 3};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f69617 = {42, -122, 72, -122, -9, cb.k, 1, 5, 6};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69622 = {42, -122, 72, -122, -9, cb.k, 1, 5, 10};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69609 = {42, -122, 72, -122, -9, cb.k, 1, 5, 11};

    static {
        C8491.m22185("-----BEGIN DSA PRIVATE KEY-----");
        C8491.m22185("-----END DSA PRIVATE KEY-----");
    }

    public C21418(C19925 c19925) {
        super(c19925);
        this.f69629 = null;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x04ba A[PHI: r2 r3 r5 r9
      0x04ba: PHI (r2v8 java.lang.Object) = (r2v120 java.lang.Object), (r2v121 java.lang.Object) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r3v10 l.ۖۜᩳ) = (r3v81 l.ۖۜᩳ), (r3v82 l.ۖۜᩳ) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r5v7 byte[]) = (r5v5 byte[]), (r5v8 byte[]) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r9v8 ??) = (r9v59 ??), (r9v60 ??) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x04d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [l.ۖۜᩳ] */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [byte[]] */
    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo7210(byte[] bArr) throws Throwable {
        ?? r2;
        ?? r3;
        ?? r9;
        byte[] bArr2;
        AbstractC2367 abstractC2367;
        ?? r10;
        byte[] bArr3;
        AbstractC2367 abstractC2368;
        ?? r11;
        ?? r12;
        ?? r13;
        AbstractC2367 abstractC2369;
        Object obj;
        Object obj2;
        C12952 c12952;
        byte[] bArr4;
        C12952 c12953;
        byte[] bArr5;
        C12952 c12954;
        ?? r14;
        ?? r15;
        ?? r16;
        Object obj3;
        Object obj4;
        AbstractC2367 abstractC23610;
        byte[] bArr6;
        AbstractC2367 abstractC23611;
        byte[] bArr7;
        Object obj5;
        C12952 c12955;
        byte[] bArr8;
        C12952 c12956;
        byte[] bArr9;
        C12952 c12957;
        byte[] bArrM22185;
        C9197 c9197;
        byte[] bArrM23652;
        C5190 c5190;
        C19925 c19925 = this.f8365;
        Object obj6 = "unsupported privateKeyAlgorithm oid: ";
        Object obj7 = "unsupported named curve oid: ";
        byte[] bArr10 = null;
        ?? r5 = 0;
        ?? r6 = 0;
        ?? r7 = 0;
        bArr10 = null;
        bArr10 = null;
        byte[] bArr11 = null;
        try {
            try {
                C9197 c9198 = new C9197(bArr);
                if (!c9198.m23650()) {
                    throw new C10608();
                }
                C9197[] c9197ArrM23656 = c9198.m23656();
                if (c9197ArrM23656.length >= 3) {
                    ?? r17 = 4;
                    ?? r18 = 4;
                    ?? r19 = 4;
                    if (c9197ArrM23656.length <= 4) {
                        if (!c9197ArrM23656[0].m23657()) {
                            throw new C10608();
                        }
                        if (!c9197ArrM23656[1].m23650()) {
                            throw new C10608();
                        }
                        if (!c9197ArrM23656[2].m23655()) {
                            throw new C10608();
                        }
                        if (c9197ArrM23656.length > 3 && !c9197ArrM23656[3].m23651(0)) {
                            throw new C10608();
                        }
                        if (C9197.m23646(c9197ArrM23656[0].m23652()) != 0) {
                            throw new C10608();
                        }
                        C9197 c9199 = c9197ArrM23656[1];
                        C9197 c91910 = c9197ArrM23656[2];
                        C9197[] c9197ArrM23657 = c9199.m23656();
                        if (c9197ArrM23657.length == 0) {
                            throw new C10608();
                        }
                        if (!c9197ArrM23657[0].m23648()) {
                            throw new C10608();
                        }
                        byte[] bArrM23653 = c9197ArrM23657[0].m23652();
                        byte[] bArrM23654 = c91910.m23652();
                        try {
                            if (C8491.m22174(bArrM23653, f69613)) {
                                if (c9197ArrM23657.length != 2) {
                                    throw new C10608();
                                }
                                if (!(c9197ArrM23657[1].m23649() == 5)) {
                                    throw new C10608();
                                }
                                C17890 c17890 = new C17890(c19925);
                                c17890.m7204(this);
                                if (!c17890.mo7210(bArrM23654)) {
                                    throw new C5813("failed to parse RSA");
                                }
                                this.f69629 = c17890;
                                C8491.m22182(bArrM23654);
                                return true;
                            }
                            if (C8491.m22174(bArrM23653, f69614)) {
                                ArrayList arrayList = new ArrayList(3);
                                if (c9197ArrM23657.length > 1 && c9197ArrM23657[1].m23650()) {
                                    C9197[] c9197ArrM23658 = c9197ArrM23657[1].m23656();
                                    if (c9197ArrM23658.length != 3) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM23658[0].m23657()) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM23658[1].m23657()) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM23658[2].m23657()) {
                                        throw new C10608();
                                    }
                                    arrayList.add(c9197ArrM23658[0].m23652());
                                    arrayList.add(c9197ArrM23658[1].m23652());
                                    arrayList.add(c9197ArrM23658[2].m23652());
                                }
                                C9197 c91911 = new C9197(bArrM23654);
                                if (arrayList.size() == 0) {
                                    if (!c91911.m23650()) {
                                        throw new C10608();
                                    }
                                    C9197[] c9197ArrM23659 = c91911.m23656();
                                    if (c9197ArrM23659.length != 2) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM23659[0].m23650()) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM23659[1].m23657()) {
                                        throw new C10608();
                                    }
                                    byte[] bArrM23655 = c9197ArrM23659[1].m23652();
                                    try {
                                        C9197[] c9197ArrM236510 = c9197ArrM23659[0].m23656();
                                        if (c9197ArrM236510.length != 3) {
                                            throw new C10608();
                                        }
                                        if (!c9197ArrM236510[0].m23657()) {
                                            throw new C10608();
                                        }
                                        if (!c9197ArrM236510[1].m23657()) {
                                            throw new C10608();
                                        }
                                        if (!c9197ArrM236510[2].m23657()) {
                                            throw new C10608();
                                        }
                                        arrayList.add(c9197ArrM236510[0].m23652());
                                        arrayList.add(c9197ArrM236510[1].m23652());
                                        arrayList.add(c9197ArrM236510[2].m23652());
                                        bArrM23652 = bArrM23655;
                                    } catch (C10608 unused) {
                                        bArr7 = null;
                                        abstractC23611 = null;
                                        r16 = bArrM23655;
                                        bArr10 = bArrM23654;
                                        bArr3 = bArr7;
                                        abstractC2368 = abstractC23611;
                                        r11 = r16;
                                        c19925.getClass();
                                        C0168.f1257.getClass();
                                        C8491.m22182(bArr10);
                                        C8491.m22182((byte[]) r11);
                                        C8491.m22182(bArr3);
                                        obj = bArr3;
                                        abstractC2369 = abstractC2368;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC2368;
                                        r12 = r11;
                                        if (abstractC2368 != null) {
                                            abstractC2369.mo7203();
                                            obj6 = obj;
                                            obj7 = abstractC2369;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused2) {
                                        bArr6 = null;
                                        abstractC23610 = null;
                                        r15 = bArrM23655;
                                        bArr10 = bArrM23654;
                                        bArr2 = bArr6;
                                        abstractC2367 = abstractC23610;
                                        r10 = r15;
                                        c19925.getClass();
                                        C0168.f1257.getClass();
                                        C8491.m22182(bArr10);
                                        C8491.m22182((byte[]) r10);
                                        C8491.m22182(bArr2);
                                        obj = bArr2;
                                        abstractC2369 = abstractC2367;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC2367;
                                        r12 = r10;
                                        if (abstractC2367 != null) {
                                            abstractC2369.mo7203();
                                            obj6 = obj;
                                            obj7 = abstractC2369;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj4 = null;
                                        obj3 = null;
                                        r14 = bArrM23655;
                                        bArr11 = bArrM23654;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C8491.m22182(bArr11);
                                        C8491.m22182((byte[]) r9);
                                        C8491.m22182((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo7203();
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (!c91911.m23657()) {
                                        throw new C10608();
                                    }
                                    bArrM23652 = c91911.m23652();
                                }
                                try {
                                    byte[] bArr12 = (byte[]) arrayList.get(0);
                                    byte[] bArr13 = (byte[]) arrayList.get(1);
                                    byte[] bArr14 = (byte[]) arrayList.get(2);
                                    c5190 = new C5190(this.f8365, bArr12, bArr13, bArr14, new BigInteger(bArr14).modPow(new BigInteger(bArrM23652), new BigInteger(bArr12)).toByteArray(), bArrM23652);
                                    try {
                                        byte[] bArrM14351 = c5190.m14351();
                                        C5190 c5191 = new C5190(c19925);
                                        c5191.m7204(this);
                                        if (!c5191.mo7210(bArrM14351)) {
                                            throw new C5813("failed to parse DSA");
                                        }
                                        this.f69629 = c5191;
                                        C8491.m22182(bArrM23654);
                                        C8491.m22182(bArrM23652);
                                        C8491.m22182(bArrM14351);
                                        c5190.mo7203();
                                        return true;
                                    } catch (C10608 unused3) {
                                        abstractC23611 = c5190;
                                        bArr7 = null;
                                        r16 = bArrM23652;
                                        bArr10 = bArrM23654;
                                        bArr3 = bArr7;
                                        abstractC2368 = abstractC23611;
                                        r11 = r16;
                                        c19925.getClass();
                                        C0168.f1257.getClass();
                                        C8491.m22182(bArr10);
                                        C8491.m22182((byte[]) r11);
                                        C8491.m22182(bArr3);
                                        obj = bArr3;
                                        abstractC2369 = abstractC2368;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC2368;
                                        r12 = r11;
                                        if (abstractC2368 != null) {
                                            abstractC2369.mo7203();
                                            obj6 = obj;
                                            obj7 = abstractC2369;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused4) {
                                        abstractC23610 = c5190;
                                        bArr6 = null;
                                        r15 = bArrM23652;
                                        bArr10 = bArrM23654;
                                        bArr2 = bArr6;
                                        abstractC2367 = abstractC23610;
                                        r10 = r15;
                                        c19925.getClass();
                                        C0168.f1257.getClass();
                                        C8491.m22182(bArr10);
                                        C8491.m22182((byte[]) r10);
                                        C8491.m22182(bArr2);
                                        obj = bArr2;
                                        abstractC2369 = abstractC2367;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC2367;
                                        r12 = r10;
                                        if (abstractC2367 != null) {
                                            abstractC2369.mo7203();
                                            obj6 = obj;
                                            obj7 = abstractC2369;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj3 = c5190;
                                        obj4 = null;
                                        r14 = bArrM23652;
                                        bArr11 = bArrM23654;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C8491.m22182(bArr11);
                                        C8491.m22182((byte[]) r9);
                                        C8491.m22182((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo7203();
                                        }
                                        throw th;
                                    }
                                } catch (C10608 unused5) {
                                    c5190 = null;
                                } catch (Exception unused6) {
                                    c5190 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c5190 = null;
                                }
                            } else {
                                try {
                                    if (!C8491.m22174(bArrM23653, f69610)) {
                                        byte[] bArr15 = f69627;
                                        if (!C8491.m22174(bArrM23653, bArr15) && !C8491.m22174(bArrM23653, f69620)) {
                                            throw new C5813("unsupported privateKeyAlgorithm oid: " + C8491.m22179(bArrM23653));
                                        }
                                        if (c9197ArrM23657.length != 1) {
                                            throw new C10608();
                                        }
                                        C9197 c91912 = new C9197(bArrM23654);
                                        if (!c91912.m23655()) {
                                            throw new C10608();
                                        }
                                        byte[] bArrM23656 = c91912.m23652();
                                        AbstractC2367 c3778 = C8491.m22174(bArrM23653, bArr15) ? new C3778(c19925) : new C6601(c19925);
                                        c3778.m7204(this);
                                        if (!c3778.mo7210(bArrM23656)) {
                                            throw new C5813("failed to parse EdDSA");
                                        }
                                        this.f69629 = c3778;
                                        C8491.m22182(bArrM23654);
                                        C8491.m22182(bArrM23656);
                                        return true;
                                    }
                                    if (c9197ArrM23657.length != 2) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM23657[1].m23648()) {
                                        throw new C10608();
                                    }
                                    byte[] bArrM23657 = c9197ArrM23657[1].m23652();
                                    if (!C8491.m22174(bArrM23657, f69608)) {
                                        bArrM22185 = C8491.m22185("nistp256");
                                    } else if (!C8491.m22174(bArrM23657, f69618)) {
                                        bArrM22185 = C8491.m22185("nistp384");
                                    } else {
                                        if (C8491.m22174(bArrM23657, f69616)) {
                                            throw new C5813("unsupported named curve oid: " + C8491.m22179(bArrM23657));
                                        }
                                        bArrM22185 = C8491.m22185("nistp521");
                                    }
                                    byte[] bArr16 = bArrM22185;
                                    C9197 c91913 = new C9197(bArrM23654);
                                    if (!c91913.m23650()) {
                                        throw new C10608();
                                    }
                                    C9197[] c9197ArrM236511 = c91913.m23656();
                                    if (c9197ArrM236511.length < 3 || c9197ArrM236511.length > 4) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM236511[0].m23657()) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM236511[1].m23655()) {
                                        throw new C10608();
                                    }
                                    if (C9197.m23646(c9197ArrM236511[0].m23652()) != 1) {
                                        throw new C10608();
                                    }
                                    byte[] bArrM23658 = c9197ArrM236511[1].m23652();
                                    if (c9197ArrM236511.length == 3) {
                                        c9197 = c9197ArrM236511[2];
                                    } else {
                                        C9197 c91914 = c9197ArrM236511[3];
                                        if (!c9197ArrM236511[2].m23651(0)) {
                                            throw new C10608();
                                        }
                                        C9197[] c9197ArrM236512 = c9197ArrM236511[2].m23656();
                                        if (c9197ArrM236512.length != 1) {
                                            throw new C10608();
                                        }
                                        if (!c9197ArrM236512[0].m23648()) {
                                            throw new C10608();
                                        }
                                        if (!C8491.m22174(c9197ArrM236512[0].m23652(), bArrM23657)) {
                                            throw new C10608();
                                        }
                                        c9197 = c91914;
                                    }
                                    if (!c9197.m23651(1)) {
                                        throw new C10608();
                                    }
                                    C9197[] c9197ArrM236513 = c9197.m23656();
                                    if (c9197ArrM236513.length != 1) {
                                        throw new C10608();
                                    }
                                    if (!c9197ArrM236513[0].m23653()) {
                                        throw new C10608();
                                    }
                                    byte[][] bArrM32086 = C12952.m32086(c9197ArrM236513[0].m23652());
                                    C12952 c12958 = new C12952(this.f8365, bArr16, bArrM32086[0], bArrM32086[1], bArrM23658);
                                    try {
                                        byte[] bArrM32088 = c12958.m32088();
                                        C12952 c12959 = new C12952(c19925);
                                        c12959.m7204(this);
                                        if (!c12959.mo7210(bArrM32088)) {
                                            throw new C5813("failed to parse ECDSA");
                                        }
                                        this.f69629 = c12959;
                                        C8491.m22182(bArrM23654);
                                        C8491.m22182(bArrM23658);
                                        C8491.m22182(bArrM32088);
                                        c12958.mo7203();
                                        return true;
                                    } catch (C10608 unused7) {
                                        c12957 = c12958;
                                        bArr9 = null;
                                        r18 = bArrM23658;
                                        r5 = r18;
                                        bArr5 = bArr9;
                                        c12954 = c12957;
                                        r16 = r5;
                                        bArr7 = bArr5;
                                        abstractC23611 = c12954;
                                        bArr10 = bArrM23654;
                                        bArr3 = bArr7;
                                        abstractC2368 = abstractC23611;
                                        r11 = r16;
                                        c19925.getClass();
                                        C0168.f1257.getClass();
                                        C8491.m22182(bArr10);
                                        C8491.m22182((byte[]) r11);
                                        C8491.m22182(bArr3);
                                        obj = bArr3;
                                        abstractC2369 = abstractC2368;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC2368;
                                        r12 = r11;
                                        if (abstractC2368 != null) {
                                            abstractC2369.mo7203();
                                            obj6 = obj;
                                            obj7 = abstractC2369;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused8) {
                                        c12956 = c12958;
                                        bArr8 = null;
                                        r19 = bArrM23658;
                                        r6 = r19;
                                        bArr4 = bArr8;
                                        c12953 = c12956;
                                        r15 = r6;
                                        bArr6 = bArr4;
                                        abstractC23610 = c12953;
                                        bArr10 = bArrM23654;
                                        bArr2 = bArr6;
                                        abstractC2367 = abstractC23610;
                                        r10 = r15;
                                        c19925.getClass();
                                        C0168.f1257.getClass();
                                        C8491.m22182(bArr10);
                                        C8491.m22182((byte[]) r10);
                                        C8491.m22182(bArr2);
                                        obj = bArr2;
                                        abstractC2369 = abstractC2367;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC2367;
                                        r12 = r10;
                                        if (abstractC2367 != null) {
                                            abstractC2369.mo7203();
                                            obj6 = obj;
                                            obj7 = abstractC2369;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c12955 = c12958;
                                        obj5 = null;
                                        r17 = bArrM23658;
                                        r7 = r17;
                                        obj2 = obj5;
                                        c12952 = c12955;
                                        r14 = r7;
                                        obj4 = obj2;
                                        obj3 = c12952;
                                        bArr11 = bArrM23654;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C8491.m22182(bArr11);
                                        C8491.m22182((byte[]) r9);
                                        C8491.m22182((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo7203();
                                        }
                                        throw th;
                                    }
                                } catch (C10608 unused9) {
                                    bArr9 = null;
                                    c12957 = null;
                                } catch (Exception unused10) {
                                    bArr8 = null;
                                    c12956 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj5 = null;
                                    c12955 = null;
                                }
                            }
                        } catch (C10608 unused11) {
                            bArr5 = null;
                            c12954 = null;
                        } catch (Exception unused12) {
                            bArr4 = null;
                            c12953 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            obj2 = null;
                            c12952 = null;
                        }
                    }
                }
                throw new C10608();
            } catch (Throwable th7) {
                th = th7;
                r9 = r12;
                bArr11 = bArr10;
                r3 = obj7;
                r2 = obj6;
            }
        } catch (C10608 unused13) {
            bArr3 = null;
            abstractC2368 = null;
            r11 = 0;
        } catch (Exception unused14) {
            bArr2 = null;
            abstractC2367 = null;
            r10 = 0;
        } catch (Throwable th8) {
            th = th8;
            r2 = 0;
            r3 = 0;
            r9 = 0;
        }
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۚ */
    public final byte[] mo7208() {
        AbstractC2367 abstractC2367 = this.f69629;
        if (abstractC2367 != null) {
            return abstractC2367.mo7208();
        }
        return super.mo7208();
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo7202() {
        AbstractC2367 abstractC2367 = this.f69629;
        return abstractC2367 != null ? abstractC2367.mo7202() : new byte[0];
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7212(byte[] bArr) {
        return this.f69629.mo7212(bArr);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo7206(String str, byte[] bArr) {
        return this.f69629.mo7206(str, bArr);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7211() {
        return this.f69629.mo7211();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7205(byte[] bArr) throws Throwable {
        byte[] bArr2;
        byte[] bArrMo12512;
        byte[] bArr3;
        byte[] bArr4;
        String str;
        String str2;
        InterfaceC4484 interfaceC4484M47955;
        C19925 c19925 = this.f8365;
        boolean z = this.f8367;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        byte[] bArr5 = null;
        try {
            try {
                C9197 c9197 = new C9197(this.f8369);
                if (!c9197.m23650()) {
                    throw new C10608();
                }
                C9197[] c9197ArrM23656 = c9197.m23656();
                if (c9197ArrM23656.length != 2) {
                    throw new C10608();
                }
                if (!c9197ArrM23656[0].m23650()) {
                    throw new C10608();
                }
                if (!c9197ArrM23656[1].m23655()) {
                    throw new C10608();
                }
                byte[] bArrM23652 = c9197ArrM23656[1].m23652();
                try {
                    C9197[] c9197ArrM23657 = c9197ArrM23656[0].m23656();
                    if (c9197ArrM23657.length != 2) {
                        throw new C10608();
                    }
                    if (!c9197ArrM23657[0].m23648()) {
                        throw new C10608();
                    }
                    if (!c9197ArrM23657[1].m23650()) {
                        throw new C10608();
                    }
                    byte[] bArrM23653 = c9197ArrM23657[0].m23652();
                    C9197 c9198 = c9197ArrM23657[1];
                    if (!C8491.m22174(bArrM23653, f69615)) {
                        if (C8491.m22174(bArrM23653, f69626)) {
                            str = "pbeWithMD2AndDES-CBC unsupported";
                        } else if (C8491.m22174(bArrM23653, f69605)) {
                            str = "pbeWithMD2AndRC2-CBC unsupported";
                        } else if (C8491.m22174(bArrM23653, f69621)) {
                            str = "pbeWithMD5AndDES-CBC unsupported";
                        } else if (C8491.m22174(bArrM23653, f69617)) {
                            str = "pbeWithMD5AndRC2-CBC unsupported";
                        } else if (C8491.m22174(bArrM23653, f69622)) {
                            str = "pbeWithSHA1AndDES-CBC unsupported";
                        } else if (C8491.m22174(bArrM23653, f69609)) {
                            str = "pbeWithSHA1AndRC2-CBC unsupported";
                        } else {
                            str = "unsupported encryption oid: " + C8491.m22179(bArrM23653);
                        }
                        throw new C5813(str);
                    }
                    C9197[] c9197ArrM23658 = c9198.m23656();
                    if (c9197ArrM23658.length != 2) {
                        throw new C10608();
                    }
                    C9197 c9199 = c9197ArrM23658[0];
                    C9197 c91910 = c9197ArrM23658[1];
                    if (!c9199.m23650()) {
                        throw new C10608();
                    }
                    if (!c91910.m23650()) {
                        throw new C10608();
                    }
                    C9197[] c9197ArrM23659 = c91910.m23656();
                    if (c9197ArrM23659.length != 2) {
                        throw new C10608();
                    }
                    if (!c9197ArrM23659[0].m23648()) {
                        throw new C10608();
                    }
                    byte[] bArrM23654 = c9197ArrM23659[0].m23652();
                    C9197 c91911 = c9197ArrM23659[1];
                    C9197[] c9197ArrM236510 = c9199.m23656();
                    if (c9197ArrM236510.length != 2) {
                        throw new C10608();
                    }
                    if (!c9197ArrM236510[0].m23648()) {
                        throw new C10608();
                    }
                    if (!c9197ArrM236510[1].m23650()) {
                        throw new C10608();
                    }
                    byte[] bArrM23655 = c9197ArrM236510[0].m23652();
                    if (C8491.m22174(bArrM23655, f69628)) {
                        str2 = "pbkdf2";
                        interfaceC4484M47955 = m47955("pbkdf2");
                        interfaceC4484M47955.mo12513(c9197ArrM236510[1].m23654());
                    } else {
                        if (!C8491.m22174(bArrM23655, f69607)) {
                            throw new C5813("unsupported kdf oid: " + C8491.m22179(bArrM23655));
                        }
                        str2 = "scrypt";
                        interfaceC4484M47955 = m47955("scrypt");
                        interfaceC4484M47955.mo12513(c9197ArrM236510[1].m23654());
                    }
                    byte[][] bArr6 = new byte[1][];
                    InterfaceC1142 interfaceC1142M47954 = m47954(bArrM23654, c91911, bArr6);
                    byte[] bArr7 = bArr6[0];
                    bArrMo12512 = interfaceC4484M47955.mo12512(interfaceC1142M47954.getBlockSize(), bArr);
                    try {
                        if (bArrMo12512 == null) {
                            throw new C5813("failed to generate key from KDF ".concat(str2));
                        }
                        interfaceC1142M47954.mo2386(1, bArrMo12512, bArr7);
                        byte[] bArr8 = new byte[bArrM23652.length];
                        interfaceC1142M47954.mo2385(0, bArrM23652, bArrM23652.length, bArr8, 0);
                        if (!mo7210(bArr8)) {
                            throw new C5813("failed to parse decrypted key");
                        }
                        this.f8367 = false;
                        C8491.m22182(this.f8369);
                        C8491.m22182(bArrM23652);
                        C8491.m22182(bArrMo12512);
                        C8491.m22182(bArr8);
                        return true;
                    } catch (C10608 unused) {
                        bArr4 = null;
                        bArr5 = bArrM23652;
                        c19925.getClass();
                        C0168.f1257.getClass();
                        C8491.m22182(bArr5);
                        C8491.m22182(bArrMo12512);
                        C8491.m22182(bArr4);
                        return false;
                    } catch (Exception unused2) {
                        bArr3 = null;
                        bArr5 = bArrM23652;
                        c19925.getClass();
                        C0168.f1257.getClass();
                        C8491.m22182(bArr5);
                        C8491.m22182(bArrMo12512);
                        C8491.m22182(bArr3);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bArr2 = 0;
                        bArr5 = bArrM23652;
                        C8491.m22182(bArr5);
                        C8491.m22182(bArrMo12512);
                        C8491.m22182(bArr2);
                        throw th;
                    }
                } catch (C10608 unused3) {
                    bArrMo12512 = null;
                } catch (Exception unused4) {
                    bArrMo12512 = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArrMo12512 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                bArr5 = null;
                bArr2 = "unsupported encryption oid: ";
            }
        } catch (C10608 unused5) {
            bArr4 = null;
            bArrMo12512 = null;
        } catch (Exception unused6) {
            bArr3 = null;
            bArrMo12512 = null;
        } catch (Throwable th4) {
            th = th4;
            bArr2 = 0;
            bArrMo12512 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4484 m47955(String str) throws C5813 {
        try {
            return (InterfaceC4484) Class.forName(C0168.m1327(str)).asSubclass(InterfaceC4484.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception | LinkageError e) {
            throw new C5813(str.concat(" is not supported"), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1142 m47954(byte[] bArr, C9197 c9197, byte[][] bArr2) throws C5813, C10608 {
        String str;
        if (C8491.m22174(bArr, f69623)) {
            str = "aes128-cbc";
        } else if (C8491.m22174(bArr, f69624)) {
            str = "aes192-cbc";
        } else if (C8491.m22174(bArr, f69611)) {
            str = "aes256-cbc";
        } else {
            if (C8491.m22174(bArr, f69612)) {
                throw new C5813("unsupported cipher function: des-cbc");
            }
            if (C8491.m22174(bArr, f69625)) {
                throw new C5813("unsupported cipher function: 3des-cbc");
            }
            if (C8491.m22174(bArr, f69619)) {
                throw new C5813("unsupported cipher function: rc2-cbc");
            }
            if (C8491.m22174(bArr, f69606)) {
                throw new C5813("unsupported cipher function: rc5-cbc");
            }
            str = null;
        }
        if (str == null) {
            throw new C5813("unsupported cipher function oid: " + C8491.m22179(bArr));
        }
        if (!c9197.m23655()) {
            throw new C10608();
        }
        bArr2[0] = c9197.m23652();
        try {
            return (InterfaceC1142) Class.forName(C0168.m1327(str)).asSubclass(InterfaceC1142.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception | LinkageError e) {
            throw new C5813(str.concat(" is not supported"), e);
        }
    }
}
