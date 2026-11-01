package l;

import com.alipay.sdk.m.y.q;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۬ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12842 extends C4561 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f42716;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public char[] f42717 = new char[32];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f42718;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42719;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f42720;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC20934 f42721;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f42722;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f42723;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f42724;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Predicate f42725;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f42726;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2257 f42727;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f42728;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f42729;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5080 f42730;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f42731;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42732;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f42733;

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۚۗۡ] */
    public C12842(C18111 c18111) {
        C2257 c2257 = new C2257(0);
        this.f42727 = c2257;
        this.f42730 = new Predicate() { // from class: l.ۚۗۡ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C12842.m31838(this.f17720, (Integer) obj);
            }
        };
        this.f16198 = c18111;
        this.f42725 = c2257;
        this.f42719 = c18111.f57921.m36608();
        m31845();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m31838(C12842 c12842, Integer num) {
        boolean z = num.intValue() == 92 || num.intValue() == 58 || num.intValue() == 64;
        if (z) {
            c12842.m31836(92);
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31847() {
        C2257 c2257 = this.f42727;
        try {
            this.f42725 = this.f42730;
            m31840();
        } finally {
            this.f42725 = c2257;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31840() {
        int[] iArr;
        this.f42722 = this.f42728;
        int i = 1;
        while (true) {
            m31845();
            iArr = C0846.f3489;
            if (iArr[this.f42721.ordinal()] != 1) {
                break;
            } else {
                i *= this.f42726;
            }
        }
        switch (iArr[this.f42721.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.f42723 = i;
                break;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31848(EnumC20934 enumC20934) {
        m31843(enumC20934);
        m31840();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31846(EnumC20934 enumC20934) {
        if (this.f42721 == EnumC20934.f68096 && this.f42724.equals(enumC20934.m47084())) {
            m31840();
        } else {
            this.f16198.m42172(this.f42728, "\"{0}\" token is expected", C16236.m38348(enumC20934, new StringBuilder("\""), "\""));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31842(List list, EnumC20934... enumC20934Arr) {
        boolean z;
        boolean zM31844 = m31844(enumC20934Arr);
        int i = 0;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (this.f42721 != EnumC20934.f68096) {
            z = false;
            break;
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else {
                if (this.f42724.equals(strArr[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (zM31844 || z) {
            return;
        }
        this.f16198.mo2149(this.f42728, "One of {0} tokens is expected", String.format("[ %s,%s ]", (String) C9030.stream(list).map(new C1443(8)).collect(C1890.joining(",")), C20318.stream(enumC20934Arr).map(new C22014(i)).collect(C1890.joining(","))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31844(EnumC20934... enumC20934Arr) {
        for (EnumC20934 enumC20934 : enumC20934Arr) {
            if (this.f42721 == enumC20934) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31843(EnumC20934 enumC20934) {
        EnumC20934 enumC20935 = this.f42721;
        if (enumC20935 != enumC20934) {
            EnumC20934 enumC20936 = EnumC20934.f68096;
            if (enumC20934 == enumC20936 && enumC20935.m47088()) {
                return;
            }
            this.f16198.m2146("expect: " + enumC20934 + " instead of " + this.f42721, new Object[0]);
            if (enumC20934 == enumC20936) {
                this.f16198.mo2149(this.f42728, "Jasm identifier expected", new Object[0]);
            } else {
                this.f16198.mo2149(this.f42728, "\"{0}\" token is expected", C16236.m38348(enumC20934, new StringBuilder("<"), ">"));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31836(int i) {
        int i2 = this.f42732;
        char[] cArr = this.f42717;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f42717 = cArr2;
        }
        char[] cArr3 = this.f42717;
        int i3 = this.f42732;
        this.f42732 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m31835() {
        int i = this.f42732;
        char[] cArr = new char[i];
        System.arraycopy(this.f42717, 0, cArr, 0, i);
        return new String(cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:67:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002c. Please report as an issue. */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m31839() {
        boolean z;
        int i = this.f42719;
        if (i == 46) {
            m31836(i);
            this.f42719 = this.f16198.f57921.m36608();
        }
        boolean z2 = false;
        while (true) {
            int i2 = this.f42719;
            if (i2 != 43 && i2 != 45) {
                switch (i2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case 56:
                    case 57:
                        m31836(i2);
                        this.f42719 = this.f16198.f57921.m36608();
                        break;
                    default:
                        switch (i2) {
                            case 68:
                                this.f42719 = this.f16198.f57921.m36608();
                                z = false;
                                break;
                            case 69:
                                if (z2) {
                                    m31836(i2);
                                    z2 = true;
                                    this.f42719 = this.f16198.f57921.m36608();
                                } else {
                                    z = false;
                                }
                                break;
                            case 70:
                                this.f42719 = this.f16198.f57921.m36608();
                                z = true;
                                break;
                            default:
                                switch (i2) {
                                    case 100:
                                        this.f42719 = this.f16198.f57921.m36608();
                                        z = false;
                                        break;
                                    case 101:
                                        if (z2) {
                                            m31836(i2);
                                            z2 = true;
                                            this.f42719 = this.f16198.f57921.m36608();
                                        } else {
                                            z = false;
                                        }
                                        break;
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                        this.f42719 = this.f16198.f57921.m36608();
                                        z = true;
                                        break;
                                    default:
                                        z = false;
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                char c = this.f42717[this.f42732 - 1];
                if (c == 'e' || c == 'E') {
                    m31836(i2);
                    this.f42719 = this.f16198.f57921.m36608();
                } else {
                    z = false;
                }
            }
            if (!Character.isLetterOrDigit(this.f42719) && this.f42719 != 46) {
                this.f42721 = z ? EnumC20934.f68084 : EnumC20934.f68167;
                try {
                    char c2 = this.f42717[this.f42732 - 1];
                    if (c2 == 'e' || c2 == 'E' || c2 == '+' || c2 == '-') {
                        C18111 c18111 = this.f16198;
                        c18111.mo2149(c18111.m42173() - 1, "Invalid floating point format", new Object[0]);
                        return;
                    }
                    if (z) {
                        float f = Float.parseFloat(m31835());
                        this.f42718 = f;
                        if (Float.isInfinite(f)) {
                            this.f16198.mo2149(this.f42728, "Numeric overflow", new Object[0]);
                            return;
                        }
                        return;
                    }
                    double d = Double.parseDouble(m31835());
                    this.f42716 = d;
                    if (Double.isInfinite(d)) {
                        this.f16198.mo2149(this.f42728, "Numeric overflow", new Object[0]);
                        this.f16198.mo2149(this.f42728, "Numeric overflow", new Object[0]);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    this.f16198.mo2149(this.f42728, "Invalid floating point format", new Object[0]);
                    this.f42716 = 0.0d;
                    this.f42718 = 0.0f;
                    return;
                }
            }
            C18111 c18112 = this.f16198;
            c18112.mo2149(c18112.m42173(), "Invalid character \"{0}\" in number", Character.toString((char) this.f42719));
            while (true) {
                int iM36608 = this.f16198.f57921.m36608();
                this.f42719 = iM36608;
                if (!Character.isLetterOrDigit(iM36608) && this.f42719 != 46) {
                    this.f42716 = 0.0d;
                    this.f42721 = EnumC20934.f68167;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31837(char[] cArr) {
        this.f42732 = 0;
        boolean z = true;
        if (cArr != null) {
            while (true) {
                for (char c : cArr) {
                    m31836(c);
                }
                int iM36608 = this.f16198.f57921.m36608();
                this.f42719 = iM36608;
                if (iM36608 != 92) {
                    break;
                }
                int iM36609 = this.f16198.f57921.m36608();
                this.f42719 = iM36609;
                if (iM36609 != 117) {
                    if (!this.f42725.test(Integer.valueOf(iM36609))) {
                        this.f16198.mo2149(this.f16198.m42173(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f42719};
                } else {
                    int iM36607 = this.f16198.f57921.m36607();
                    this.f42719 = iM36607;
                    if (Character.isLetterOrDigit(iM36607)) {
                        this.f16198.mo2149(this.f16198.m42173(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f42719};
                }
            }
        }
        int i = this.f42719;
        while (true) {
            m31836(this.f42719);
            int iM366010 = this.f16198.f57921.m36608();
            this.f42719 = iM366010;
            if (z && i == 64) {
                if (iM366010 == 84) {
                    m31836(iM366010);
                    this.f42719 = this.f16198.f57921.m36608();
                }
                int i2 = this.f42719;
                if (i2 == 43 || i2 == 45) {
                    m31836(i2);
                    this.f42719 = this.f16198.f57921.m36608();
                }
                String strM31835 = m31835();
                this.f42720 = strM31835;
                this.f42724 = strM31835;
                this.f42721 = EnumC20934.f68105;
                return;
            }
            if (!Character.isJavaIdentifierPart(iM366010)) {
                char[] cArr2 = {'-', '[', ']', '(', ')', '<', '>'};
                char c2 = (char) this.f42719;
                int i3 = 0;
                while (true) {
                    if (i3 >= 7) {
                        int i4 = this.f42719;
                        if (i4 == 47) {
                            int iM366011 = this.f16198.f57921.m36609();
                            if (iM366011 != 42 && iM366011 != 47) {
                                break;
                            } else {
                                break;
                            }
                        }
                        if (i4 == 92) {
                            int iM366012 = this.f16198.f57921.m36608();
                            this.f42719 = iM366012;
                            if (iM366012 == 117) {
                                int iM366013 = this.f16198.f57921.m36607();
                                this.f42719 = iM366013;
                                if (!Character.isLetterOrDigit(iM366013)) {
                                    break;
                                }
                                this.f16198.mo2149(this.f16198.m42173(), "Invalid escape character", new Object[0]);
                                break;
                            }
                            if (!this.f42725.test(Integer.valueOf(iM366012))) {
                                this.f16198.mo2149(this.f16198.m42173(), "Invalid escape character", new Object[0]);
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    if (cArr2[i3] == c2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z = false;
        }
        String strM31836 = m31835();
        this.f42720 = strM31836;
        this.f42724 = strM31836;
        EnumC20934 enumC20934 = (EnumC20934) EnumC20934.m47073(strM31836, EnumC8234.KEYWORD).orElse(EnumC20934.f68096);
        this.f42721 = enumC20934;
        C13638.toString(enumC20934);
    }

    /* JADX WARN: Code duplicated, block: B:306:0x062f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0639  */
    /* JADX WARN: Code duplicated, block: B:314:0x0643  */
    /* JADX WARN: Code duplicated, block: B:315:0x0645  */
    /* JADX WARN: Code duplicated, block: B:319:0x0650  */
    /* JADX WARN: Code duplicated, block: B:443:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0686 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31845() {
        int iM36608;
        int iM36609;
        int iM366010;
        long j;
        long j2;
        long j3;
        int iM36607;
        long j4;
        long j5;
        int i;
        char c;
        loop0: while (true) {
            this.f42728 = this.f16198.m42173();
            if (Character.isLetter(this.f42719)) {
                break;
            }
            char[] cArr = {'$', '_', '@', '[', ']', '(', ')', '<', '>'};
            char c2 = (char) this.f42719;
            for (int i2 = 0; i2 < 9; i2++) {
                if (cArr[i2] == c2) {
                    break loop0;
                }
            }
            int i3 = this.f42719;
            if (i3 == -1) {
                this.f42721 = EnumC20934.f68179;
                return;
            }
            if (i3 == 10 || i3 == 13 || i3 == 32 || i3 == 9 || i3 == 12) {
                this.f42719 = this.f16198.f57921.m36608();
            } else if (i3 == 47) {
                int iM366011 = this.f16198.f57921.m36608();
                this.f42719 = iM366011;
                if (iM366011 != 42) {
                    if (iM366011 != 47) {
                        this.f42721 = EnumC20934.f68116;
                        return;
                    }
                    do {
                        iM36608 = this.f16198.f57921.m36608();
                        this.f42719 = iM36608;
                        if (iM36608 == -1) {
                            break;
                        }
                    } while (iM36608 != 10);
                } else {
                    int iM366012 = this.f16198.f57921.m36608();
                    this.f42719 = iM366012;
                    if (iM366012 != 42) {
                        while (true) {
                            int i4 = this.f42719;
                            if (i4 == -1) {
                                this.f16198.mo2149(this.f42728, "Comment isn't terminated at the end of input", new Object[0]);
                                break;
                            } else if (i4 == 42) {
                                int iM366013 = this.f16198.f57921.m36608();
                                this.f42719 = iM366013;
                                if (iM366013 == 47) {
                                    this.f42719 = this.f16198.f57921.m36608();
                                    break;
                                }
                            } else {
                                this.f42719 = this.f16198.f57921.m36608();
                            }
                        }
                    } else {
                        this.f42732 = 0;
                        if (iM366012 == 42) {
                            do {
                                iM366010 = this.f16198.f57921.m36608();
                                this.f42719 = iM366010;
                            } while (iM366010 == 42);
                            if (iM366010 == 47) {
                                this.f42719 = this.f16198.f57921.m36608();
                            }
                        }
                        int i5 = this.f42719;
                        if (i5 == 10 || i5 == 32) {
                            this.f42719 = this.f16198.f57921.m36608();
                        }
                        int i6 = this.f42732;
                        while (true) {
                            boolean z = false;
                            while (true) {
                                int i7 = this.f42719;
                                if (i7 == -1) {
                                    this.f16198.mo2149(this.f42728, "Comment isn't terminated at the end of input", new Object[0]);
                                    m31835();
                                    break;
                                }
                                if (i7 != 32) {
                                    if (i7 != 42) {
                                        if (i7 != 9) {
                                            if (i7 != 10) {
                                                if (!z) {
                                                    z = true;
                                                }
                                                m31836(i7);
                                                this.f42719 = this.f16198.f57921.m36608();
                                                i6 = this.f42732;
                                            }
                                        }
                                    } else if (z) {
                                        int iM366014 = this.f16198.f57921.m36608();
                                        this.f42719 = iM366014;
                                        if (iM366014 == 47) {
                                            this.f42719 = this.f16198.f57921.m36608();
                                            this.f42732 = i6;
                                            m31835();
                                            break;
                                        }
                                        m31836(42);
                                    } else {
                                        this.f42732 = i6;
                                        do {
                                            iM36609 = this.f16198.f57921.m36608();
                                            this.f42719 = iM36609;
                                        } while (iM36609 == 42);
                                        if (iM36609 == 32) {
                                            this.f42719 = this.f16198.f57921.m36608();
                                        } else if (iM36609 == 47) {
                                            this.f42719 = this.f16198.f57921.m36608();
                                            this.f42732 = i6;
                                            m31835();
                                            break;
                                        }
                                        z = true;
                                    }
                                }
                                m31836(i7);
                                this.f42719 = this.f16198.f57921.m36608();
                            }
                            m31836(10);
                            this.f42719 = this.f16198.f57921.m36608();
                            i6 = this.f42732;
                        }
                    }
                }
            } else {
                int i8 = 34;
                if (i3 == 34) {
                    this.f42721 = EnumC20934.f68034;
                    this.f42732 = 0;
                    this.f42719 = this.f16198.f57921.m36608();
                    while (true) {
                        int i9 = this.f42719;
                        if (i9 == -1) {
                            this.f16198.mo2149(this.f42728, "String isn't terminated at the end of input", new Object[0]);
                            this.f42724 = m31835();
                            return;
                        }
                        if (i9 == 10) {
                            this.f42719 = this.f16198.f57921.m36608();
                            this.f16198.mo2149(this.f42728, "String isn't terminated at the end of line", new Object[0]);
                            this.f42724 = m31835();
                            return;
                        }
                        if (i9 == i8) {
                            this.f42719 = this.f16198.f57921.m36608();
                            this.f42724 = m31835();
                            return;
                        }
                        if (i9 != 92) {
                            m31836(i9);
                            this.f42719 = this.f16198.f57921.m36608();
                        } else {
                            long jM42173 = this.f16198.m42173();
                            int iM366015 = this.f16198.f57921.m36608();
                            this.f42719 = iM366015;
                            if (iM366015 == i8) {
                                j = 0;
                                this.f42719 = this.f16198.f57921.m36608();
                                j2 = 34;
                            } else if (iM366015 != 39) {
                                j2 = 92;
                                if (iM366015 == 92) {
                                    j = 0;
                                    this.f42719 = this.f16198.f57921.m36608();
                                } else if (iM366015 == 98) {
                                    j = 0;
                                    this.f42719 = this.f16198.f57921.m36608();
                                    j2 = 8;
                                } else if (iM366015 == 102) {
                                    j = 0;
                                    this.f42719 = this.f16198.f57921.m36608();
                                    j2 = 12;
                                } else if (iM366015 == 110) {
                                    this.f42719 = this.f16198.f57921.m36608();
                                    j = 0;
                                    j2 = 10;
                                } else if (iM366015 == 114) {
                                    j = 0;
                                    this.f42719 = this.f16198.f57921.m36608();
                                    j2 = 13;
                                } else if (iM366015 != 116) {
                                    if (iM366015 != 117) {
                                        switch (iM366015) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                iM36607 = iM366015 - 48;
                                                int i10 = 2;
                                                while (true) {
                                                    if (i10 <= 0) {
                                                        j3 = 0;
                                                        this.f42719 = this.f16198.f57921.m36608();
                                                        if (iM36607 > 255) {
                                                            this.f16198.mo2149(jM42173, "Invalid escape character", new Object[0]);
                                                        }
                                                        break;
                                                    } else {
                                                        j3 = 0;
                                                        int iM366016 = this.f16198.f57921.m36608();
                                                        this.f42719 = iM366016;
                                                        switch (iM366016) {
                                                            case 48:
                                                            case 49:
                                                            case 50:
                                                            case 51:
                                                            case 52:
                                                            case 53:
                                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                                iM36607 = ((iM36607 << 3) + iM366016) - 48;
                                                                i10--;
                                                                break;
                                                            default:
                                                                if (iM36607 > 255) {
                                                                    this.f16198.mo2149(jM42173, "Invalid escape character", new Object[0]);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                j = 0;
                                                break;
                                        }
                                    } else {
                                        j3 = 0;
                                        iM36607 = this.f16198.f57921.m36607();
                                        this.f42719 = this.f16198.f57921.m36608();
                                    }
                                    j2 = iM36607;
                                    j = j3;
                                } else {
                                    j = 0;
                                    this.f42719 = this.f16198.f57921.m36608();
                                    j2 = 9;
                                }
                            } else {
                                j = 0;
                                this.f42719 = this.f16198.f57921.m36608();
                                j2 = 39;
                            }
                            if (j2 >= j) {
                                m31836((char) j2);
                            }
                            i8 = 34;
                        }
                    }
                } else {
                    if (i3 == 45) {
                        this.f42726 = -1;
                        this.f42721 = EnumC20934.f68077;
                        this.f42719 = this.f16198.f57921.m36608();
                        return;
                    }
                    if (i3 == 43) {
                        this.f42726 = 1;
                        this.f42719 = this.f16198.f57921.m36608();
                        this.f42721 = EnumC20934.f68077;
                        return;
                    }
                    int i11 = 46;
                    if (i3 == 48 || i3 == 49 || i3 == 50 || i3 == 51 || i3 == 52 || i3 == 53 || i3 == 54 || i3 == 55 || i3 == 56 || i3 == 57) {
                        this.f42729 = i3 == 48 ? 8 : 10;
                        long lowerCase = i3 - 48;
                        this.f42732 = 0;
                        m31836(i3);
                        boolean z2 = false;
                        boolean z3 = false;
                        while (true) {
                            int iM366017 = this.f16198.f57921.m36608();
                            this.f42719 = iM366017;
                            if (iM366017 != i11) {
                                if (iM366017 != 76) {
                                    if (iM366017 != 88) {
                                        if (iM366017 != 108) {
                                            if (iM366017 != 120) {
                                                switch (iM366017) {
                                                    case 56:
                                                    case 57:
                                                        z3 = true;
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                        m31836(iM366017);
                                                        int i12 = this.f42729;
                                                        if (i12 == 10) {
                                                            boolean z4 = z2 || (lowerCase * 10) / 10 != lowerCase;
                                                            lowerCase = (lowerCase * 10) + ((long) (this.f42719 - 48));
                                                            z2 = z4 || lowerCase - 1 < -1;
                                                        } else {
                                                            if (i12 == 8) {
                                                                z2 = z2 || (lowerCase >>> 61) != 0;
                                                                j5 = lowerCase << 3;
                                                                i = this.f42719;
                                                            } else {
                                                                z2 = z2 || (lowerCase >>> 60) != 0;
                                                                j5 = lowerCase << 4;
                                                                i = this.f42719;
                                                            }
                                                            lowerCase = ((long) (i - 48)) + j5;
                                                        }
                                                        i11 = 46;
                                                        break;
                                                    default:
                                                        switch (iM366017) {
                                                            case 65:
                                                            case 66:
                                                            case 67:
                                                                c = '<';
                                                                m31836(iM366017);
                                                                if (this.f42729 != 16) {
                                                                    if (z2 && (lowerCase >>> c) == 0) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f42719))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            case 68:
                                                            case 69:
                                                            case 70:
                                                                c = '<';
                                                                if (this.f42729 != 16) {
                                                                    m31839();
                                                                    return;
                                                                }
                                                                m31836(iM366017);
                                                                if (this.f42729 != 16) {
                                                                    if (z2) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f42719))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            default:
                                                                switch (iM366017) {
                                                                    case 97:
                                                                    case 98:
                                                                    case q.f /* 99 */:
                                                                        c = '<';
                                                                        m31836(iM366017);
                                                                        if (this.f42729 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f42719))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    case 100:
                                                                    case 101:
                                                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                                        c = '<';
                                                                        if (this.f42729 != 16) {
                                                                            m31839();
                                                                            return;
                                                                        }
                                                                        m31836(iM366017);
                                                                        if (this.f42729 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f42719))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        this.f42726 = (int) lowerCase;
                                                                        this.f42721 = EnumC20934.f68154;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    if (this.f42732 == 1 && this.f42729 == 8) {
                                        this.f42729 = 16;
                                        i11 = 46;
                                    }
                                }
                                this.f42719 = this.f16198.f57921.m36608();
                                this.f42731 = lowerCase;
                                this.f42721 = EnumC20934.f68055;
                            } else if (this.f42729 != 16) {
                                m31839();
                                return;
                            }
                        }
                        if (!Character.isLetterOrDigit(this.f42719) && this.f42719 != 46) {
                            int i13 = this.f42729;
                            if (i13 == 8 && z3) {
                                this.f42726 = 0;
                                this.f42721 = EnumC20934.f68154;
                                C18111 c18111 = this.f16198;
                                c18111.mo2149(c18111.m42173(), "Invalid character in octal number", new Object[0]);
                                return;
                            }
                            if (z2) {
                                j4 = 0;
                            } else {
                                if (this.f42721 != EnumC20934.f68154) {
                                    return;
                                }
                                if (i13 == 10) {
                                    if (this.f42726 - 1 >= -1) {
                                        return;
                                    }
                                    j4 = 0;
                                } else {
                                    j4 = 0;
                                    if (((-4294967296L) & lowerCase) == 0) {
                                        return;
                                    }
                                }
                            }
                            this.f42726 = 0;
                            this.f42731 = j4;
                            this.f16198.mo2149(this.f42728, "Numeric overflow", new Object[0]);
                            return;
                        }
                        C18111 c18112 = this.f16198;
                        c18112.mo2149(c18112.m42173(), "Invalid character \"{0}\" in number", Character.toString((char) this.f42719));
                        while (true) {
                            int iM366018 = this.f16198.f57921.m36608();
                            this.f42719 = iM366018;
                            if (!Character.isLetterOrDigit(iM366018) && this.f42719 != 46) {
                                this.f42726 = 0;
                                this.f42721 = EnumC20934.f68154;
                                return;
                            }
                        }
                    } else {
                        if (i3 == 46) {
                            int iM366019 = this.f16198.f57921.m36608();
                            this.f42719 = iM366019;
                            switch (iM366019) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case 56:
                                case 57:
                                    this.f42732 = 0;
                                    m31836(46);
                                    m31839();
                                    return;
                                default:
                                    this.f42721 = EnumC20934.f68045;
                                    return;
                            }
                        }
                        if (i3 == 123) {
                            this.f42719 = this.f16198.f57921.m36608();
                            this.f42721 = EnumC20934.f68039;
                            return;
                        }
                        if (i3 == 125) {
                            this.f42719 = this.f16198.f57921.m36608();
                            this.f42721 = EnumC20934.f68195;
                            return;
                        }
                        if (i3 == 44) {
                            this.f42719 = this.f16198.f57921.m36608();
                            this.f42721 = EnumC20934.f68072;
                            return;
                        }
                        if (i3 == 59) {
                            this.f42719 = this.f16198.f57921.m36608();
                            this.f42721 = EnumC20934.f68171;
                            return;
                        }
                        if (i3 == 58) {
                            this.f42719 = this.f16198.f57921.m36608();
                            this.f42721 = EnumC20934.f68046;
                            return;
                        }
                        if (i3 == 61) {
                            int iM366020 = this.f16198.f57921.m36608();
                            this.f42719 = iM366020;
                            if (iM366020 != 61) {
                                this.f42721 = EnumC20934.f68094;
                                return;
                            } else {
                                this.f42719 = this.f16198.f57921.m36608();
                                this.f42721 = EnumC20934.f68079;
                                return;
                            }
                        }
                        if (i3 == 26) {
                            int iM366021 = this.f16198.f57921.m36608();
                            this.f42719 = iM366021;
                            if (iM366021 == -1) {
                                this.f42721 = EnumC20934.f68179;
                                return;
                            } else {
                                this.f16198.mo2164(this.f42722, "Invalid character with code {0} in input", Integer.valueOf(iM366021));
                                this.f42719 = this.f16198.f57921.m36608();
                            }
                        } else if (i3 == 35) {
                            if (this.f16198.f57921.m36609() == 123) {
                                this.f42719 = this.f16198.f57921.m36608();
                                this.f42721 = EnumC20934.f68070;
                                return;
                            }
                            int i14 = this.f42719;
                            int iM366022 = this.f16198.f57921.m36608();
                            this.f42719 = iM366022;
                            switch (iM366022) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case 56:
                                case 57:
                                    long j6 = iM366022 - 48;
                                    this.f42732 = 0;
                                    m31836(iM366022);
                                    while (true) {
                                        boolean z5 = false;
                                        while (true) {
                                            int iM366023 = this.f16198.f57921.m36608();
                                            this.f42719 = iM366023;
                                            switch (iM366023) {
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                case 56:
                                                case 57:
                                                    m31836(iM366023);
                                                    if (!z5) {
                                                        j6 = (j6 * 10) + ((long) (this.f42719 - 48));
                                                        if (j6 > 65535) {
                                                            z5 = true;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    this.f42726 = (int) j6;
                                                    this.f42724 = m31835();
                                                    this.f42721 = EnumC20934.f68161;
                                                    if (z5) {
                                                        this.f16198.mo2149(this.f42728, "Numeric overflow", new Object[0]);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    this.f42724 = Character.toString((char) i14);
                                    C18111 c18113 = this.f16198;
                                    c18113.m42172(c18113.m42173(), "Invalid character \"{0}\" in number", this.f42724);
                                    throw null;
                            }
                        } else if (i3 == 92) {
                            int iM366024 = this.f16198.f57921.m36608();
                            this.f42719 = iM366024;
                            if (iM366024 == 117) {
                                int iM366025 = this.f16198.f57921.m36607();
                                this.f42719 = iM366025;
                                if (Character.isLetterOrDigit(iM366025) && !Character.isDigit(this.f42719)) {
                                    m31837((char[]) null);
                                    return;
                                }
                            } else if (this.f42725.test(Integer.valueOf(iM366024))) {
                                m31837(new char[]{'\\', (char) this.f42719});
                                return;
                            }
                            final long jM42171 = this.f16198.m42171(this.f42728);
                            final long jM23025 = ((C8878) this.f16198.m2163()).m23025(jM42171, this.f42728);
                            this.f16198.m2152(new Supplier() { // from class: l.ܰۗۡ
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f44718.f42719), Long.valueOf(jM42171), Long.valueOf(jM23025));
                                }
                            });
                            this.f16198.mo2164(this.f42728, "Invalid character with code {0} in input", Integer.valueOf(this.f42719));
                            this.f42719 = this.f16198.f57921.m36608();
                        } else {
                            final long jM42172 = this.f16198.m42171(this.f42728);
                            final long jM23026 = ((C8878) this.f16198.m2163()).m23025(jM42172, this.f42728);
                            this.f16198.m2152(new Supplier() { // from class: l.ۨۗۡ
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f38480.f42719), Long.valueOf(jM42172), Long.valueOf(jM23026));
                                }
                            });
                            this.f16198.mo2164(this.f42728, "Invalid character with code {0} in input", Integer.valueOf(this.f42719));
                            this.f42719 = this.f16198.f57921.m36608();
                        }
                    }
                }
            }
        }
        m31837((char[]) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31841(String str) {
        if (this.f16198.m2158()) {
            EnumC20934 enumC20934 = this.f42721;
            if (enumC20934 == null) {
                this.f16198.m2146(str.concat("<<<NULL TOKEN>>>"), new Object[0]);
                return;
            }
            this.f16198.m2160(str.concat(enumC20934.toString()), new Object[0]);
            int i = C0846.f3489[this.f42721.ordinal()];
            if (i == 2) {
                this.f16198.m2146(" = {intValue}: " + this.f42726, new Object[0]);
                return;
            }
            if (i == 4) {
                this.f16198.m2146(" = {floatValue}: " + this.f42718, new Object[0]);
                return;
            }
            if (i == 5) {
                this.f16198.m2146(" = {doubleValue}: " + this.f42716, new Object[0]);
                return;
            }
            if (i != 8) {
                if (i != 9) {
                    this.f16198.m2146("", new Object[0]);
                    return;
                } else {
                    this.f16198.m2146(C22697.m50267(new StringBuilder(" = {stringValue}: \""), this.f42724, "\""), new Object[0]);
                    return;
                }
            }
            C18111 c18111 = this.f16198;
            StringBuilder sb = new StringBuilder(" = '");
            sb.append(this.f42724);
            sb.append("' {idValue = '");
            c18111.m2146(C22697.m50267(sb, this.f42720, "'}"), new Object[0]);
        }
    }
}
