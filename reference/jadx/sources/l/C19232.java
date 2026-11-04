package l;

import com.umeng.analytics.pro.cb;
import java.math.BigInteger;
import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ᩳܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7X1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19232 extends AbstractC6554 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC6554 f62215;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62198 = {42, -122, 72, -122, -9, cb.k, 1, 1, 1};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62197 = {42, -122, 72, -50, 56, 4, 1};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final byte[] f62214 = {42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 2, 1};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62195 = {43, 101, KeyFactorySpi.Ed25519_type};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62206 = {43, 101, KeyFactorySpi.Ed448_type};

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62196 = {42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7};

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62212 = {43, -127, 4, 0, 34};

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62203 = {43, -127, 4, 0, 35};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f62192 = {42, -122, 72, -122, -9, cb.k, 1, 5, cb.k};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62201 = {42, -122, 72, -122, -9, cb.k, 1, 5, 12};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f62205 = {43, 6, 1, 4, 1, -38, 71, 4, 11};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62207 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 2};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f62213 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 22};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62194 = {UTF8.S_P4B, -122, 72, 1, 101, 3, 4, 1, 42};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62204 = {43, cb.f82047l, 3, 2, 7};

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f62210 = {42, -122, 72, -122, -9, cb.k, 3, 7};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62193 = {42, -122, 72, -122, -9, cb.k, 3, 2};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final byte[] f62200 = {42, -122, 72, -122, -9, cb.k, 3, 9};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f62211 = {42, -122, 72, -122, -9, cb.k, 1, 5, 1};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62208 = {42, -122, 72, -122, -9, cb.k, 1, 5, 4};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f62191 = {42, -122, 72, -122, -9, cb.k, 1, 5, 3};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f62199 = {42, -122, 72, -122, -9, cb.k, 1, 5, 6};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62209 = {42, -122, 72, -122, -9, cb.k, 1, 5, 10};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62202 = {42, -122, 72, -122, -9, cb.k, 1, 5, 11};

    static {
        C9011.m24065("-----BEGIN DSA PRIVATE KEY-----");
        C9011.m24065("-----END DSA PRIVATE KEY-----");
    }

    public C19232(C22962 c22962) {
        super(c22962);
        this.f62215 = null;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x04ba A[PHI: r2 r3 r5 r9
      0x04ba: PHI (r2v8 java.lang.Object) = (r2v120 java.lang.Object), (r2v121 java.lang.Object) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r3v10 l.ۛܿܶ) = (r3v81 l.ۛܿܶ), (r3v82 l.ۛܿܶ) binds: [B:289:0x04a1, B:294:0x04b8] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Type inference failed for: r3v7, types: [l.ۛܿܶ] */
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
    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2670(byte[] bArr) throws Throwable {
        ?? r2;
        ?? r3;
        ?? r9;
        byte[] bArr2;
        AbstractC6554 abstractC6554;
        ?? r10;
        byte[] bArr3;
        AbstractC6554 abstractC6555;
        ?? r11;
        ?? r12;
        ?? r13;
        AbstractC6554 abstractC6556;
        Object obj;
        Object obj2;
        C14756 c14756;
        byte[] bArr4;
        C14756 c14757;
        byte[] bArr5;
        C14756 c14758;
        ?? r14;
        ?? r15;
        ?? r16;
        Object obj3;
        Object obj4;
        AbstractC6554 abstractC6557;
        byte[] bArr6;
        AbstractC6554 abstractC6558;
        byte[] bArr7;
        Object obj5;
        C14756 c14759;
        byte[] bArr8;
        C14756 c147510;
        byte[] bArr9;
        C14756 c147511;
        byte[] bArrM24065;
        C8266 c8266;
        byte[] bArrM22307;
        C24454 c24454;
        C22962 c22962 = this.f22008;
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
                C8266 c8267 = new C8266(bArr);
                if (!c8267.m22305()) {
                    throw new C6775();
                }
                C8266[] c8266ArrM22313 = c8267.m22313();
                if (c8266ArrM22313.length >= 3) {
                    ?? r17 = 4;
                    ?? r18 = 4;
                    ?? r19 = 4;
                    if (c8266ArrM22313.length <= 4) {
                        if (!c8266ArrM22313[0].m22311()) {
                            throw new C6775();
                        }
                        if (!c8266ArrM22313[1].m22305()) {
                            throw new C6775();
                        }
                        if (!c8266ArrM22313[2].m22308()) {
                            throw new C6775();
                        }
                        if (c8266ArrM22313.length > 3 && !c8266ArrM22313[3].m22306(0)) {
                            throw new C6775();
                        }
                        if (C8266.m22303(c8266ArrM22313[0].m22307()) != 0) {
                            throw new C6775();
                        }
                        C8266 c8268 = c8266ArrM22313[1];
                        C8266 c8269 = c8266ArrM22313[2];
                        C8266[] c8266ArrM22314 = c8268.m22313();
                        if (c8266ArrM22314.length == 0) {
                            throw new C6775();
                        }
                        if (!c8266ArrM22314[0].m22310()) {
                            throw new C6775();
                        }
                        byte[] bArrM22308 = c8266ArrM22314[0].m22307();
                        byte[] bArrM22309 = c8269.m22307();
                        try {
                            if (C9011.m24054(bArrM22308, f62198)) {
                                if (c8266ArrM22314.length != 2) {
                                    throw new C6775();
                                }
                                if (!(c8266ArrM22314[1].m22314() == 5)) {
                                    throw new C6775();
                                }
                                C10281 c10281 = new C10281(c22962);
                                c10281.m18456(this);
                                if (!c10281.mo2670(bArrM22309)) {
                                    throw new C2079("failed to parse RSA");
                                }
                                this.f62215 = c10281;
                                C9011.m24062(bArrM22309);
                                return true;
                            }
                            if (C9011.m24054(bArrM22308, f62197)) {
                                ArrayList arrayList = new ArrayList(3);
                                if (c8266ArrM22314.length > 1 && c8266ArrM22314[1].m22305()) {
                                    C8266[] c8266ArrM22315 = c8266ArrM22314[1].m22313();
                                    if (c8266ArrM22315.length != 3) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22315[0].m22311()) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22315[1].m22311()) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22315[2].m22311()) {
                                        throw new C6775();
                                    }
                                    arrayList.add(c8266ArrM22315[0].m22307());
                                    arrayList.add(c8266ArrM22315[1].m22307());
                                    arrayList.add(c8266ArrM22315[2].m22307());
                                }
                                C8266 c82610 = new C8266(bArrM22309);
                                if (arrayList.size() == 0) {
                                    if (!c82610.m22305()) {
                                        throw new C6775();
                                    }
                                    C8266[] c8266ArrM22316 = c82610.m22313();
                                    if (c8266ArrM22316.length != 2) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22316[0].m22305()) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22316[1].m22311()) {
                                        throw new C6775();
                                    }
                                    byte[] bArrM223010 = c8266ArrM22316[1].m22307();
                                    try {
                                        C8266[] c8266ArrM22317 = c8266ArrM22316[0].m22313();
                                        if (c8266ArrM22317.length != 3) {
                                            throw new C6775();
                                        }
                                        if (!c8266ArrM22317[0].m22311()) {
                                            throw new C6775();
                                        }
                                        if (!c8266ArrM22317[1].m22311()) {
                                            throw new C6775();
                                        }
                                        if (!c8266ArrM22317[2].m22311()) {
                                            throw new C6775();
                                        }
                                        arrayList.add(c8266ArrM22317[0].m22307());
                                        arrayList.add(c8266ArrM22317[1].m22307());
                                        arrayList.add(c8266ArrM22317[2].m22307());
                                        bArrM22307 = bArrM223010;
                                    } catch (C6775 unused) {
                                        bArr7 = null;
                                        abstractC6558 = null;
                                        r16 = bArrM223010;
                                        bArr10 = bArrM22309;
                                        bArr3 = bArr7;
                                        abstractC6555 = abstractC6558;
                                        r11 = r16;
                                        c22962.getClass();
                                        C19978.f64189.getClass();
                                        C9011.m24062(bArr10);
                                        C9011.m24062((byte[]) r11);
                                        C9011.m24062(bArr3);
                                        obj = bArr3;
                                        abstractC6556 = abstractC6555;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC6555;
                                        r12 = r11;
                                        if (abstractC6555 != null) {
                                            abstractC6556.mo2668();
                                            obj6 = obj;
                                            obj7 = abstractC6556;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused2) {
                                        bArr6 = null;
                                        abstractC6557 = null;
                                        r15 = bArrM223010;
                                        bArr10 = bArrM22309;
                                        bArr2 = bArr6;
                                        abstractC6554 = abstractC6557;
                                        r10 = r15;
                                        c22962.getClass();
                                        C19978.f64189.getClass();
                                        C9011.m24062(bArr10);
                                        C9011.m24062((byte[]) r10);
                                        C9011.m24062(bArr2);
                                        obj = bArr2;
                                        abstractC6556 = abstractC6554;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC6554;
                                        r12 = r10;
                                        if (abstractC6554 != null) {
                                            abstractC6556.mo2668();
                                            obj6 = obj;
                                            obj7 = abstractC6556;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj4 = null;
                                        obj3 = null;
                                        r14 = bArrM223010;
                                        bArr11 = bArrM22309;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C9011.m24062(bArr11);
                                        C9011.m24062((byte[]) r9);
                                        C9011.m24062((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo2668();
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (!c82610.m22311()) {
                                        throw new C6775();
                                    }
                                    bArrM22307 = c82610.m22307();
                                }
                                try {
                                    byte[] bArr12 = (byte[]) arrayList.get(0);
                                    byte[] bArr13 = (byte[]) arrayList.get(1);
                                    byte[] bArr14 = (byte[]) arrayList.get(2);
                                    c24454 = new C24454(this.f22008, bArr12, bArr13, bArr14, new BigInteger(bArr14).modPow(new BigInteger(bArrM22307), new BigInteger(bArr12)).toByteArray(), bArrM22307);
                                    try {
                                        byte[] bArrM54698 = c24454.m54698();
                                        C24454 c24455 = new C24454(c22962);
                                        c24455.m18456(this);
                                        if (!c24455.mo2670(bArrM54698)) {
                                            throw new C2079("failed to parse DSA");
                                        }
                                        this.f62215 = c24455;
                                        C9011.m24062(bArrM22309);
                                        C9011.m24062(bArrM22307);
                                        C9011.m24062(bArrM54698);
                                        c24454.mo2668();
                                        return true;
                                    } catch (C6775 unused3) {
                                        abstractC6558 = c24454;
                                        bArr7 = null;
                                        r16 = bArrM22307;
                                        bArr10 = bArrM22309;
                                        bArr3 = bArr7;
                                        abstractC6555 = abstractC6558;
                                        r11 = r16;
                                        c22962.getClass();
                                        C19978.f64189.getClass();
                                        C9011.m24062(bArr10);
                                        C9011.m24062((byte[]) r11);
                                        C9011.m24062(bArr3);
                                        obj = bArr3;
                                        abstractC6556 = abstractC6555;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC6555;
                                        r12 = r11;
                                        if (abstractC6555 != null) {
                                            abstractC6556.mo2668();
                                            obj6 = obj;
                                            obj7 = abstractC6556;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused4) {
                                        abstractC6557 = c24454;
                                        bArr6 = null;
                                        r15 = bArrM22307;
                                        bArr10 = bArrM22309;
                                        bArr2 = bArr6;
                                        abstractC6554 = abstractC6557;
                                        r10 = r15;
                                        c22962.getClass();
                                        C19978.f64189.getClass();
                                        C9011.m24062(bArr10);
                                        C9011.m24062((byte[]) r10);
                                        C9011.m24062(bArr2);
                                        obj = bArr2;
                                        abstractC6556 = abstractC6554;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC6554;
                                        r12 = r10;
                                        if (abstractC6554 != null) {
                                            abstractC6556.mo2668();
                                            obj6 = obj;
                                            obj7 = abstractC6556;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj3 = c24454;
                                        obj4 = null;
                                        r14 = bArrM22307;
                                        bArr11 = bArrM22309;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C9011.m24062(bArr11);
                                        C9011.m24062((byte[]) r9);
                                        C9011.m24062((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo2668();
                                        }
                                        throw th;
                                    }
                                } catch (C6775 unused5) {
                                    c24454 = null;
                                } catch (Exception unused6) {
                                    c24454 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c24454 = null;
                                }
                            } else {
                                try {
                                    if (!C9011.m24054(bArrM22308, f62214)) {
                                        byte[] bArr15 = f62195;
                                        if (!C9011.m24054(bArrM22308, bArr15) && !C9011.m24054(bArrM22308, f62206)) {
                                            throw new C2079("unsupported privateKeyAlgorithm oid: " + C9011.m24059(bArrM22308));
                                        }
                                        if (c8266ArrM22314.length != 1) {
                                            throw new C6775();
                                        }
                                        C8266 c82611 = new C8266(bArrM22309);
                                        if (!c82611.m22308()) {
                                            throw new C6775();
                                        }
                                        byte[] bArrM223011 = c82611.m22307();
                                        AbstractC6554 c21470 = C9011.m24054(bArrM22308, bArr15) ? new C21470(c22962) : new C18486(c22962);
                                        c21470.m18456(this);
                                        if (!c21470.mo2670(bArrM223011)) {
                                            throw new C2079("failed to parse EdDSA");
                                        }
                                        this.f62215 = c21470;
                                        C9011.m24062(bArrM22309);
                                        C9011.m24062(bArrM223011);
                                        return true;
                                    }
                                    if (c8266ArrM22314.length != 2) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22314[1].m22310()) {
                                        throw new C6775();
                                    }
                                    byte[] bArrM223012 = c8266ArrM22314[1].m22307();
                                    if (!C9011.m24054(bArrM223012, f62196)) {
                                        bArrM24065 = C9011.m24065("nistp256");
                                    } else if (!C9011.m24054(bArrM223012, f62212)) {
                                        bArrM24065 = C9011.m24065("nistp384");
                                    } else {
                                        if (C9011.m24054(bArrM223012, f62203)) {
                                            throw new C2079("unsupported named curve oid: " + C9011.m24059(bArrM223012));
                                        }
                                        bArrM24065 = C9011.m24065("nistp521");
                                    }
                                    byte[] bArr16 = bArrM24065;
                                    C8266 c82612 = new C8266(bArrM22309);
                                    if (!c82612.m22305()) {
                                        throw new C6775();
                                    }
                                    C8266[] c8266ArrM22318 = c82612.m22313();
                                    if (c8266ArrM22318.length < 3 || c8266ArrM22318.length > 4) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22318[0].m22311()) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM22318[1].m22308()) {
                                        throw new C6775();
                                    }
                                    if (C8266.m22303(c8266ArrM22318[0].m22307()) != 1) {
                                        throw new C6775();
                                    }
                                    byte[] bArrM223013 = c8266ArrM22318[1].m22307();
                                    if (c8266ArrM22318.length == 3) {
                                        c8266 = c8266ArrM22318[2];
                                    } else {
                                        C8266 c82613 = c8266ArrM22318[3];
                                        if (!c8266ArrM22318[2].m22306(0)) {
                                            throw new C6775();
                                        }
                                        C8266[] c8266ArrM22319 = c8266ArrM22318[2].m22313();
                                        if (c8266ArrM22319.length != 1) {
                                            throw new C6775();
                                        }
                                        if (!c8266ArrM22319[0].m22310()) {
                                            throw new C6775();
                                        }
                                        if (!C9011.m24054(c8266ArrM22319[0].m22307(), bArrM223012)) {
                                            throw new C6775();
                                        }
                                        c8266 = c82613;
                                    }
                                    if (!c8266.m22306(1)) {
                                        throw new C6775();
                                    }
                                    C8266[] c8266ArrM223110 = c8266.m22313();
                                    if (c8266ArrM223110.length != 1) {
                                        throw new C6775();
                                    }
                                    if (!c8266ArrM223110[0].m22312()) {
                                        throw new C6775();
                                    }
                                    byte[][] bArrM35440 = C14756.m35440(c8266ArrM223110[0].m22307());
                                    C14756 c147512 = new C14756(this.f22008, bArr16, bArrM35440[0], bArrM35440[1], bArrM223013);
                                    try {
                                        byte[] bArrM35441 = c147512.m35441();
                                        C14756 c147513 = new C14756(c22962);
                                        c147513.m18456(this);
                                        if (!c147513.mo2670(bArrM35441)) {
                                            throw new C2079("failed to parse ECDSA");
                                        }
                                        this.f62215 = c147513;
                                        C9011.m24062(bArrM22309);
                                        C9011.m24062(bArrM223013);
                                        C9011.m24062(bArrM35441);
                                        c147512.mo2668();
                                        return true;
                                    } catch (C6775 unused7) {
                                        c147511 = c147512;
                                        bArr9 = null;
                                        r18 = bArrM223013;
                                        r5 = r18;
                                        bArr5 = bArr9;
                                        c14758 = c147511;
                                        r16 = r5;
                                        bArr7 = bArr5;
                                        abstractC6558 = c14758;
                                        bArr10 = bArrM22309;
                                        bArr3 = bArr7;
                                        abstractC6555 = abstractC6558;
                                        r11 = r16;
                                        c22962.getClass();
                                        C19978.f64189.getClass();
                                        C9011.m24062(bArr10);
                                        C9011.m24062((byte[]) r11);
                                        C9011.m24062(bArr3);
                                        obj = bArr3;
                                        abstractC6556 = abstractC6555;
                                        r13 = r11;
                                        obj6 = bArr3;
                                        obj7 = abstractC6555;
                                        r12 = r11;
                                        if (abstractC6555 != null) {
                                            abstractC6556.mo2668();
                                            obj6 = obj;
                                            obj7 = abstractC6556;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Exception unused8) {
                                        c147510 = c147512;
                                        bArr8 = null;
                                        r19 = bArrM223013;
                                        r6 = r19;
                                        bArr4 = bArr8;
                                        c14757 = c147510;
                                        r15 = r6;
                                        bArr6 = bArr4;
                                        abstractC6557 = c14757;
                                        bArr10 = bArrM22309;
                                        bArr2 = bArr6;
                                        abstractC6554 = abstractC6557;
                                        r10 = r15;
                                        c22962.getClass();
                                        C19978.f64189.getClass();
                                        C9011.m24062(bArr10);
                                        C9011.m24062((byte[]) r10);
                                        C9011.m24062(bArr2);
                                        obj = bArr2;
                                        abstractC6556 = abstractC6554;
                                        r13 = r10;
                                        obj6 = bArr2;
                                        obj7 = abstractC6554;
                                        r12 = r10;
                                        if (abstractC6554 != null) {
                                            abstractC6556.mo2668();
                                            obj6 = obj;
                                            obj7 = abstractC6556;
                                            r12 = r13;
                                        }
                                        return false;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c14759 = c147512;
                                        obj5 = null;
                                        r17 = bArrM223013;
                                        r7 = r17;
                                        obj2 = obj5;
                                        c14756 = c14759;
                                        r14 = r7;
                                        obj4 = obj2;
                                        obj3 = c14756;
                                        bArr11 = bArrM22309;
                                        r2 = obj4;
                                        r3 = obj3;
                                        r9 = r14;
                                        C9011.m24062(bArr11);
                                        C9011.m24062((byte[]) r9);
                                        C9011.m24062((byte[]) r2);
                                        if (r3 != 0) {
                                            r3.mo2668();
                                        }
                                        throw th;
                                    }
                                } catch (C6775 unused9) {
                                    bArr9 = null;
                                    c147511 = null;
                                } catch (Exception unused10) {
                                    bArr8 = null;
                                    c147510 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj5 = null;
                                    c14759 = null;
                                }
                            }
                        } catch (C6775 unused11) {
                            bArr5 = null;
                            c14758 = null;
                        } catch (Exception unused12) {
                            bArr4 = null;
                            c14757 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            obj2 = null;
                            c14756 = null;
                        }
                    }
                }
                throw new C6775();
            } catch (Throwable th7) {
                th = th7;
                r9 = r12;
                bArr11 = bArr10;
                r3 = obj7;
                r2 = obj6;
            }
        } catch (C6775 unused13) {
            bArr3 = null;
            abstractC6555 = null;
            r11 = 0;
        } catch (Exception unused14) {
            bArr2 = null;
            abstractC6554 = null;
            r10 = 0;
        } catch (Throwable th8) {
            th = th8;
            r2 = 0;
            r3 = 0;
            r9 = 0;
        }
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩴ */
    public final byte[] mo2673() {
        AbstractC6554 abstractC6554 = this.f62215;
        if (abstractC6554 != null) {
            return abstractC6554.mo2673();
        }
        return super.mo2673();
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩸ */
    public final byte[] mo2676() {
        AbstractC6554 abstractC6554 = this.f62215;
        return abstractC6554 != null ? abstractC6554.mo2676() : new byte[0];
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2675(byte[] bArr) {
        return this.f62215.mo2675(bArr);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo2669(String str, byte[] bArr) {
        return this.f62215.mo2669(str, bArr);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2674() {
        return this.f62215.mo2674();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18457(byte[] bArr) throws Throwable {
        byte[] bArr2;
        byte[] bArrMo11617;
        byte[] bArr3;
        byte[] bArr4;
        String str;
        String str2;
        InterfaceC3570 interfaceC3570M44561;
        C22962 c22962 = this.f22008;
        boolean z = this.f22004;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        byte[] bArr5 = null;
        try {
            try {
                C8266 c8266 = new C8266(this.f22009);
                if (!c8266.m22305()) {
                    throw new C6775();
                }
                C8266[] c8266ArrM22313 = c8266.m22313();
                if (c8266ArrM22313.length != 2) {
                    throw new C6775();
                }
                if (!c8266ArrM22313[0].m22305()) {
                    throw new C6775();
                }
                if (!c8266ArrM22313[1].m22308()) {
                    throw new C6775();
                }
                byte[] bArrM22307 = c8266ArrM22313[1].m22307();
                try {
                    C8266[] c8266ArrM22314 = c8266ArrM22313[0].m22313();
                    if (c8266ArrM22314.length != 2) {
                        throw new C6775();
                    }
                    if (!c8266ArrM22314[0].m22310()) {
                        throw new C6775();
                    }
                    if (!c8266ArrM22314[1].m22305()) {
                        throw new C6775();
                    }
                    byte[] bArrM22308 = c8266ArrM22314[0].m22307();
                    C8266 c8267 = c8266ArrM22314[1];
                    if (!C9011.m24054(bArrM22308, f62192)) {
                        if (C9011.m24054(bArrM22308, f62211)) {
                            str = "pbeWithMD2AndDES-CBC unsupported";
                        } else if (C9011.m24054(bArrM22308, f62208)) {
                            str = "pbeWithMD2AndRC2-CBC unsupported";
                        } else if (C9011.m24054(bArrM22308, f62191)) {
                            str = "pbeWithMD5AndDES-CBC unsupported";
                        } else if (C9011.m24054(bArrM22308, f62199)) {
                            str = "pbeWithMD5AndRC2-CBC unsupported";
                        } else if (C9011.m24054(bArrM22308, f62209)) {
                            str = "pbeWithSHA1AndDES-CBC unsupported";
                        } else if (C9011.m24054(bArrM22308, f62202)) {
                            str = "pbeWithSHA1AndRC2-CBC unsupported";
                        } else {
                            str = "unsupported encryption oid: " + C9011.m24059(bArrM22308);
                        }
                        throw new C2079(str);
                    }
                    C8266[] c8266ArrM22315 = c8267.m22313();
                    if (c8266ArrM22315.length != 2) {
                        throw new C6775();
                    }
                    C8266 c8268 = c8266ArrM22315[0];
                    C8266 c8269 = c8266ArrM22315[1];
                    if (!c8268.m22305()) {
                        throw new C6775();
                    }
                    if (!c8269.m22305()) {
                        throw new C6775();
                    }
                    C8266[] c8266ArrM22316 = c8269.m22313();
                    if (c8266ArrM22316.length != 2) {
                        throw new C6775();
                    }
                    if (!c8266ArrM22316[0].m22310()) {
                        throw new C6775();
                    }
                    byte[] bArrM22309 = c8266ArrM22316[0].m22307();
                    C8266 c82610 = c8266ArrM22316[1];
                    C8266[] c8266ArrM22317 = c8268.m22313();
                    if (c8266ArrM22317.length != 2) {
                        throw new C6775();
                    }
                    if (!c8266ArrM22317[0].m22310()) {
                        throw new C6775();
                    }
                    if (!c8266ArrM22317[1].m22305()) {
                        throw new C6775();
                    }
                    byte[] bArrM223010 = c8266ArrM22317[0].m22307();
                    if (C9011.m24054(bArrM223010, f62201)) {
                        str2 = "pbkdf2";
                        interfaceC3570M44561 = m44561("pbkdf2");
                        interfaceC3570M44561.mo11618(c8266ArrM22317[1].m22309());
                    } else {
                        if (!C9011.m24054(bArrM223010, f62205)) {
                            throw new C2079("unsupported kdf oid: " + C9011.m24059(bArrM223010));
                        }
                        str2 = "scrypt";
                        interfaceC3570M44561 = m44561("scrypt");
                        interfaceC3570M44561.mo11618(c8266ArrM22317[1].m22309());
                    }
                    byte[][] bArr6 = new byte[1][];
                    InterfaceC21360 interfaceC21360M44562 = m44562(bArrM22309, c82610, bArr6);
                    byte[] bArr7 = bArr6[0];
                    bArrMo11617 = interfaceC3570M44561.mo11617(interfaceC21360M44562.getBlockSize(), bArr);
                    try {
                        if (bArrMo11617 == null) {
                            throw new C2079("failed to generate key from KDF ".concat(str2));
                        }
                        interfaceC21360M44562.mo3923(1, bArrMo11617, bArr7);
                        byte[] bArr8 = new byte[bArrM22307.length];
                        interfaceC21360M44562.mo3922(0, bArrM22307, bArrM22307.length, bArr8, 0);
                        if (!mo2670(bArr8)) {
                            throw new C2079("failed to parse decrypted key");
                        }
                        this.f22004 = false;
                        C9011.m24062(this.f22009);
                        C9011.m24062(bArrM22307);
                        C9011.m24062(bArrMo11617);
                        C9011.m24062(bArr8);
                        return true;
                    } catch (C6775 unused) {
                        bArr4 = null;
                        bArr5 = bArrM22307;
                        c22962.getClass();
                        C19978.f64189.getClass();
                        C9011.m24062(bArr5);
                        C9011.m24062(bArrMo11617);
                        C9011.m24062(bArr4);
                        return false;
                    } catch (Exception unused2) {
                        bArr3 = null;
                        bArr5 = bArrM22307;
                        c22962.getClass();
                        C19978.f64189.getClass();
                        C9011.m24062(bArr5);
                        C9011.m24062(bArrMo11617);
                        C9011.m24062(bArr3);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bArr2 = 0;
                        bArr5 = bArrM22307;
                        C9011.m24062(bArr5);
                        C9011.m24062(bArrMo11617);
                        C9011.m24062(bArr2);
                        throw th;
                    }
                } catch (C6775 unused3) {
                    bArrMo11617 = null;
                } catch (Exception unused4) {
                    bArrMo11617 = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArrMo11617 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                bArr5 = null;
                bArr2 = "unsupported encryption oid: ";
            }
        } catch (C6775 unused5) {
            bArr4 = null;
            bArrMo11617 = null;
        } catch (Exception unused6) {
            bArr3 = null;
            bArrMo11617 = null;
        } catch (Throwable th4) {
            th = th4;
            bArr2 = 0;
            bArrMo11617 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3570 m44561(String str) throws C2079 {
        try {
            return (InterfaceC3570) Class.forName(C19978.m45892(str)).asSubclass(InterfaceC3570.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception | LinkageError e) {
            throw new C2079(str.concat(" is not supported"), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21360 m44562(byte[] bArr, C8266 c8266, byte[][] bArr2) throws C2079, C6775 {
        String str;
        if (C9011.m24054(bArr, f62207)) {
            str = "aes128-cbc";
        } else if (C9011.m24054(bArr, f62213)) {
            str = "aes192-cbc";
        } else if (C9011.m24054(bArr, f62194)) {
            str = "aes256-cbc";
        } else {
            if (C9011.m24054(bArr, f62204)) {
                throw new C2079("unsupported cipher function: des-cbc");
            }
            if (C9011.m24054(bArr, f62210)) {
                throw new C2079("unsupported cipher function: 3des-cbc");
            }
            if (C9011.m24054(bArr, f62193)) {
                throw new C2079("unsupported cipher function: rc2-cbc");
            }
            if (C9011.m24054(bArr, f62200)) {
                throw new C2079("unsupported cipher function: rc5-cbc");
            }
            str = null;
        }
        if (str == null) {
            throw new C2079("unsupported cipher function oid: " + C9011.m24059(bArr));
        }
        if (!c8266.m22308()) {
            throw new C6775();
        }
        bArr2[0] = c8266.m22307();
        try {
            return (InterfaceC21360) Class.forName(C19978.m45892(str)).asSubclass(InterfaceC21360.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception | LinkageError e) {
            throw new C2079(str.concat(" is not supported"), e);
        }
    }
}
