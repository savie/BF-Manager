package l;

import com.alipay.sdk.m.y.q;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۟ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7965 extends C3622 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f26449;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f26450;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14676 f26451;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Predicate f26452;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f26453;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f26454;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26455;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double f26456;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26457;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C4236 f26458;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f26459;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f26460;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f26461;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f26462;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f26463 = new char[32];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f26464;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public EnumC5202 f26465;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f26466;

    public C7965(C1122 c1122) {
        C4236 c4236 = new C4236();
        this.f26458 = c4236;
        this.f26451 = new C14676(0, this);
        this.f12426 = c1122;
        this.f26452 = c4236;
        this.f26461 = c1122.f4183.m44110();
        m21676();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m21668(C7965 c7965, Integer num) {
        boolean z = num.intValue() == 92 || num.intValue() == 58 || num.intValue() == 64;
        if (z) {
            c7965.m21666(92);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21678() {
        C4236 c4236 = this.f26458;
        try {
            this.f26452 = this.f26451;
            m21671();
        } finally {
            this.f26452 = c4236;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21671() {
        int[] iArr;
        this.f26450 = this.f26464;
        int i = 1;
        while (true) {
            m21676();
            iArr = C0507.f2187;
            if (iArr[this.f26465.ordinal()] != 1) {
                break;
            } else {
                i *= this.f26459;
            }
        }
        switch (iArr[this.f26465.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.f26455 = i;
                break;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21679(EnumC5202 enumC5202) {
        m21674(enumC5202);
        m21671();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21677(EnumC5202 enumC5202) {
        if (this.f26465 == EnumC5202.f18168 && this.f26453.equals(enumC5202.m15637())) {
            m21671();
        } else {
            this.f12426.m4162(this.f26464, "\"{0}\" token is expected", C7376.m20248(enumC5202, new StringBuilder("\""), "\""));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21673(List list, EnumC5202... enumC5202Arr) {
        boolean z;
        boolean zM21675 = m21675(enumC5202Arr);
        int i = 0;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (this.f26465 != EnumC5202.f18168) {
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
                if (this.f26453.equals(strArr[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (zM21675 || z) {
            return;
        }
        this.f12426.mo4159(this.f26464, "One of {0} tokens is expected", String.format("[ %s,%s ]", (String) C1170.stream(list).map(new C21390(i)).collect(C2025.joining(",")), C13847.stream(enumC5202Arr).map(new C18406()).collect(C2025.joining(","))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21675(EnumC5202... enumC5202Arr) {
        for (EnumC5202 enumC5202 : enumC5202Arr) {
            if (this.f26465 == enumC5202) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21674(EnumC5202 enumC5202) {
        EnumC5202 enumC5203 = this.f26465;
        if (enumC5203 != enumC5202) {
            EnumC5202 enumC5204 = EnumC5202.f18168;
            if (enumC5202 == enumC5204 && enumC5203.m15644()) {
                return;
            }
            this.f12426.m32315("expect: " + enumC5202 + " instead of " + this.f26465, new Object[0]);
            if (enumC5202 == enumC5204) {
                this.f12426.mo4159(this.f26464, "Jasm identifier expected", new Object[0]);
            } else {
                this.f12426.mo4159(this.f26464, "\"{0}\" token is expected", C7376.m20248(enumC5202, new StringBuilder("<"), ">"));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21666(int i) {
        int i2 = this.f26457;
        char[] cArr = this.f26463;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f26463 = cArr2;
        }
        char[] cArr3 = this.f26463;
        int i3 = this.f26457;
        this.f26457 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private String m21670() {
        int i = this.f26457;
        char[] cArr = new char[i];
        System.arraycopy(this.f26463, 0, cArr, 0, i);
        return new String(cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:67:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002c. Please report as an issue. */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m21669() {
        boolean z;
        int i = this.f26461;
        if (i == 46) {
            m21666(i);
            this.f26461 = this.f12426.f4183.m44110();
        }
        boolean z2 = false;
        while (true) {
            int i2 = this.f26461;
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
                        m21666(i2);
                        this.f26461 = this.f12426.f4183.m44110();
                        break;
                    default:
                        switch (i2) {
                            case 68:
                                this.f26461 = this.f12426.f4183.m44110();
                                z = false;
                                break;
                            case 69:
                                if (z2) {
                                    m21666(i2);
                                    z2 = true;
                                    this.f26461 = this.f12426.f4183.m44110();
                                } else {
                                    z = false;
                                }
                                break;
                            case 70:
                                this.f26461 = this.f12426.f4183.m44110();
                                z = true;
                                break;
                            default:
                                switch (i2) {
                                    case 100:
                                        this.f26461 = this.f12426.f4183.m44110();
                                        z = false;
                                        break;
                                    case 101:
                                        if (z2) {
                                            m21666(i2);
                                            z2 = true;
                                            this.f26461 = this.f12426.f4183.m44110();
                                        } else {
                                            z = false;
                                        }
                                        break;
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                        this.f26461 = this.f12426.f4183.m44110();
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
                char c = this.f26463[this.f26457 - 1];
                if (c == 'e' || c == 'E') {
                    m21666(i2);
                    this.f26461 = this.f12426.f4183.m44110();
                } else {
                    z = false;
                }
            }
            if (!Character.isLetterOrDigit(this.f26461) && this.f26461 != 46) {
                this.f26465 = z ? EnumC5202.f18239 : EnumC5202.f18267;
                try {
                    char c2 = this.f26463[this.f26457 - 1];
                    if (c2 == 'e' || c2 == 'E' || c2 == '+' || c2 == '-') {
                        C1122 c1122 = this.f12426;
                        c1122.mo4159(c1122.m4164() - 1, "Invalid floating point format", new Object[0]);
                        return;
                    }
                    if (z) {
                        float f = Float.parseFloat(m21670());
                        this.f26449 = f;
                        if (Float.isInfinite(f)) {
                            this.f12426.mo4159(this.f26464, "Numeric overflow", new Object[0]);
                            return;
                        }
                        return;
                    }
                    double d = Double.parseDouble(m21670());
                    this.f26456 = d;
                    if (Double.isInfinite(d)) {
                        this.f12426.mo4159(this.f26464, "Numeric overflow", new Object[0]);
                        this.f12426.mo4159(this.f26464, "Numeric overflow", new Object[0]);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    this.f12426.mo4159(this.f26464, "Invalid floating point format", new Object[0]);
                    this.f26456 = 0.0d;
                    this.f26449 = 0.0f;
                    return;
                }
            }
            C1122 c1123 = this.f12426;
            c1123.mo4159(c1123.m4164(), "Invalid character \"{0}\" in number", Character.toString((char) this.f26461));
            while (true) {
                int iM44110 = this.f12426.f4183.m44110();
                this.f26461 = iM44110;
                if (!Character.isLetterOrDigit(iM44110) && this.f26461 != 46) {
                    this.f26456 = 0.0d;
                    this.f26465 = EnumC5202.f18267;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21667(char[] cArr) {
        this.f26457 = 0;
        boolean z = true;
        if (cArr != null) {
            while (true) {
                for (char c : cArr) {
                    m21666(c);
                }
                int iM44110 = this.f12426.f4183.m44110();
                this.f26461 = iM44110;
                if (iM44110 != 92) {
                    break;
                }
                int iM44111 = this.f12426.f4183.m44110();
                this.f26461 = iM44111;
                if (iM44111 != 117) {
                    if (!this.f26452.test(Integer.valueOf(iM44111))) {
                        this.f12426.mo4159(this.f12426.m4164(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f26461};
                } else {
                    int iM44109 = this.f12426.f4183.m44109();
                    this.f26461 = iM44109;
                    if (Character.isLetterOrDigit(iM44109)) {
                        this.f12426.mo4159(this.f12426.m4164(), "Invalid escape character", new Object[0]);
                        break;
                    }
                    cArr = new char[]{(char) this.f26461};
                }
            }
        }
        int i = this.f26461;
        while (true) {
            m21666(this.f26461);
            int iM44112 = this.f12426.f4183.m44110();
            this.f26461 = iM44112;
            if (z && i == 64) {
                if (iM44112 == 84) {
                    m21666(iM44112);
                    this.f26461 = this.f12426.f4183.m44110();
                }
                int i2 = this.f26461;
                if (i2 == 43 || i2 == 45) {
                    m21666(i2);
                    this.f26461 = this.f12426.f4183.m44110();
                }
                String strM21670 = m21670();
                this.f26454 = strM21670;
                this.f26453 = strM21670;
                this.f26465 = EnumC5202.f18198;
                return;
            }
            if (!Character.isJavaIdentifierPart(iM44112)) {
                char[] cArr2 = {'-', '[', ']', '(', ')', '<', '>'};
                char c2 = (char) this.f26461;
                int i3 = 0;
                while (true) {
                    if (i3 >= 7) {
                        int i4 = this.f26461;
                        if (i4 == 47) {
                            int iM44113 = this.f12426.f4183.m44111();
                            if (iM44113 != 42 && iM44113 != 47) {
                                break;
                            } else {
                                break;
                            }
                        }
                        if (i4 == 92) {
                            int iM44114 = this.f12426.f4183.m44110();
                            this.f26461 = iM44114;
                            if (iM44114 == 117) {
                                int iM441010 = this.f12426.f4183.m44109();
                                this.f26461 = iM441010;
                                if (!Character.isLetterOrDigit(iM441010)) {
                                    break;
                                }
                                this.f12426.mo4159(this.f12426.m4164(), "Invalid escape character", new Object[0]);
                                break;
                            }
                            if (!this.f26452.test(Integer.valueOf(iM44114))) {
                                this.f12426.mo4159(this.f12426.m4164(), "Invalid escape character", new Object[0]);
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
        String strM21671 = m21670();
        this.f26454 = strM21671;
        this.f26453 = strM21671;
        EnumC5202 enumC5202 = (EnumC5202) EnumC5202.m15626(strM21671, EnumC2613.KEYWORD).orElse(EnumC5202.f18168);
        this.f26465 = enumC5202;
        C17359.toString(enumC5202);
    }

    /* JADX WARN: Code duplicated, block: B:306:0x062f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0639  */
    /* JADX WARN: Code duplicated, block: B:314:0x0643  */
    /* JADX WARN: Code duplicated, block: B:315:0x0645  */
    /* JADX WARN: Code duplicated, block: B:319:0x0650  */
    /* JADX WARN: Code duplicated, block: B:443:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0686 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21676() {
        int iM44110;
        int iM44111;
        int iM44112;
        long j;
        long j2;
        long j3;
        int iM44109;
        long j4;
        long j5;
        int i;
        char c;
        loop0: while (true) {
            this.f26464 = this.f12426.m4164();
            if (Character.isLetter(this.f26461)) {
                break;
            }
            char[] cArr = {'$', '_', '@', '[', ']', '(', ')', '<', '>'};
            char c2 = (char) this.f26461;
            for (int i2 = 0; i2 < 9; i2++) {
                if (cArr[i2] == c2) {
                    break loop0;
                }
            }
            int i3 = this.f26461;
            if (i3 == -1) {
                this.f26465 = EnumC5202.f18303;
                return;
            }
            if (i3 == 10 || i3 == 13 || i3 == 32 || i3 == 9 || i3 == 12) {
                this.f26461 = this.f12426.f4183.m44110();
            } else if (i3 == 47) {
                int iM44113 = this.f12426.f4183.m44110();
                this.f26461 = iM44113;
                if (iM44113 != 42) {
                    if (iM44113 != 47) {
                        this.f26465 = EnumC5202.f18196;
                        return;
                    }
                    do {
                        iM44110 = this.f12426.f4183.m44110();
                        this.f26461 = iM44110;
                        if (iM44110 == -1) {
                            break;
                        }
                    } while (iM44110 != 10);
                } else {
                    int iM44114 = this.f12426.f4183.m44110();
                    this.f26461 = iM44114;
                    if (iM44114 != 42) {
                        while (true) {
                            int i4 = this.f26461;
                            if (i4 == -1) {
                                this.f12426.mo4159(this.f26464, "Comment isn't terminated at the end of input", new Object[0]);
                                break;
                            } else if (i4 == 42) {
                                int iM44115 = this.f12426.f4183.m44110();
                                this.f26461 = iM44115;
                                if (iM44115 == 47) {
                                    this.f26461 = this.f12426.f4183.m44110();
                                    break;
                                }
                            } else {
                                this.f26461 = this.f12426.f4183.m44110();
                            }
                        }
                    } else {
                        this.f26457 = 0;
                        if (iM44114 == 42) {
                            do {
                                iM44112 = this.f12426.f4183.m44110();
                                this.f26461 = iM44112;
                            } while (iM44112 == 42);
                            if (iM44112 == 47) {
                                this.f26461 = this.f12426.f4183.m44110();
                            }
                        }
                        int i5 = this.f26461;
                        if (i5 == 10 || i5 == 32) {
                            this.f26461 = this.f12426.f4183.m44110();
                        }
                        int i6 = this.f26457;
                        while (true) {
                            boolean z = false;
                            while (true) {
                                int i7 = this.f26461;
                                if (i7 == -1) {
                                    this.f12426.mo4159(this.f26464, "Comment isn't terminated at the end of input", new Object[0]);
                                    m21670();
                                    break;
                                }
                                if (i7 != 32) {
                                    if (i7 != 42) {
                                        if (i7 != 9) {
                                            if (i7 != 10) {
                                                if (!z) {
                                                    z = true;
                                                }
                                                m21666(i7);
                                                this.f26461 = this.f12426.f4183.m44110();
                                                i6 = this.f26457;
                                            }
                                        }
                                    } else if (z) {
                                        int iM44116 = this.f12426.f4183.m44110();
                                        this.f26461 = iM44116;
                                        if (iM44116 == 47) {
                                            this.f26461 = this.f12426.f4183.m44110();
                                            this.f26457 = i6;
                                            m21670();
                                            break;
                                        }
                                        m21666(42);
                                    } else {
                                        this.f26457 = i6;
                                        do {
                                            iM44111 = this.f12426.f4183.m44110();
                                            this.f26461 = iM44111;
                                        } while (iM44111 == 42);
                                        if (iM44111 == 32) {
                                            this.f26461 = this.f12426.f4183.m44110();
                                        } else if (iM44111 == 47) {
                                            this.f26461 = this.f12426.f4183.m44110();
                                            this.f26457 = i6;
                                            m21670();
                                            break;
                                        }
                                        z = true;
                                    }
                                }
                                m21666(i7);
                                this.f26461 = this.f12426.f4183.m44110();
                            }
                            m21666(10);
                            this.f26461 = this.f12426.f4183.m44110();
                            i6 = this.f26457;
                        }
                    }
                }
            } else {
                int i8 = 34;
                if (i3 == 34) {
                    this.f26465 = EnumC5202.f18252;
                    this.f26457 = 0;
                    this.f26461 = this.f12426.f4183.m44110();
                    while (true) {
                        int i9 = this.f26461;
                        if (i9 == -1) {
                            this.f12426.mo4159(this.f26464, "String isn't terminated at the end of input", new Object[0]);
                            this.f26453 = m21670();
                            return;
                        }
                        if (i9 == 10) {
                            this.f26461 = this.f12426.f4183.m44110();
                            this.f12426.mo4159(this.f26464, "String isn't terminated at the end of line", new Object[0]);
                            this.f26453 = m21670();
                            return;
                        }
                        if (i9 == i8) {
                            this.f26461 = this.f12426.f4183.m44110();
                            this.f26453 = m21670();
                            return;
                        }
                        if (i9 != 92) {
                            m21666(i9);
                            this.f26461 = this.f12426.f4183.m44110();
                        } else {
                            long jM4164 = this.f12426.m4164();
                            int iM44117 = this.f12426.f4183.m44110();
                            this.f26461 = iM44117;
                            if (iM44117 == i8) {
                                j = 0;
                                this.f26461 = this.f12426.f4183.m44110();
                                j2 = 34;
                            } else if (iM44117 != 39) {
                                j2 = 92;
                                if (iM44117 == 92) {
                                    j = 0;
                                    this.f26461 = this.f12426.f4183.m44110();
                                } else if (iM44117 == 98) {
                                    j = 0;
                                    this.f26461 = this.f12426.f4183.m44110();
                                    j2 = 8;
                                } else if (iM44117 == 102) {
                                    j = 0;
                                    this.f26461 = this.f12426.f4183.m44110();
                                    j2 = 12;
                                } else if (iM44117 == 110) {
                                    this.f26461 = this.f12426.f4183.m44110();
                                    j = 0;
                                    j2 = 10;
                                } else if (iM44117 == 114) {
                                    j = 0;
                                    this.f26461 = this.f12426.f4183.m44110();
                                    j2 = 13;
                                } else if (iM44117 != 116) {
                                    if (iM44117 != 117) {
                                        switch (iM44117) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                iM44109 = iM44117 - 48;
                                                int i10 = 2;
                                                while (true) {
                                                    if (i10 <= 0) {
                                                        j3 = 0;
                                                        this.f26461 = this.f12426.f4183.m44110();
                                                        if (iM44109 > 255) {
                                                            this.f12426.mo4159(jM4164, "Invalid escape character", new Object[0]);
                                                        }
                                                        break;
                                                    } else {
                                                        j3 = 0;
                                                        int iM44118 = this.f12426.f4183.m44110();
                                                        this.f26461 = iM44118;
                                                        switch (iM44118) {
                                                            case 48:
                                                            case 49:
                                                            case 50:
                                                            case 51:
                                                            case 52:
                                                            case 53:
                                                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                                iM44109 = ((iM44109 << 3) + iM44118) - 48;
                                                                i10--;
                                                                break;
                                                            default:
                                                                if (iM44109 > 255) {
                                                                    this.f12426.mo4159(jM4164, "Invalid escape character", new Object[0]);
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
                                        iM44109 = this.f12426.f4183.m44109();
                                        this.f26461 = this.f12426.f4183.m44110();
                                    }
                                    j2 = iM44109;
                                    j = j3;
                                } else {
                                    j = 0;
                                    this.f26461 = this.f12426.f4183.m44110();
                                    j2 = 9;
                                }
                            } else {
                                j = 0;
                                this.f26461 = this.f12426.f4183.m44110();
                                j2 = 39;
                            }
                            if (j2 >= j) {
                                m21666((char) j2);
                            }
                            i8 = 34;
                        }
                    }
                } else {
                    if (i3 == 45) {
                        this.f26459 = -1;
                        this.f26465 = EnumC5202.f18229;
                        this.f26461 = this.f12426.f4183.m44110();
                        return;
                    }
                    if (i3 == 43) {
                        this.f26459 = 1;
                        this.f26461 = this.f12426.f4183.m44110();
                        this.f26465 = EnumC5202.f18229;
                        return;
                    }
                    int i11 = 46;
                    if (i3 == 48 || i3 == 49 || i3 == 50 || i3 == 51 || i3 == 52 || i3 == 53 || i3 == 54 || i3 == 55 || i3 == 56 || i3 == 57) {
                        this.f26462 = i3 == 48 ? 8 : 10;
                        long lowerCase = i3 - 48;
                        this.f26457 = 0;
                        m21666(i3);
                        boolean z2 = false;
                        boolean z3 = false;
                        while (true) {
                            int iM44119 = this.f12426.f4183.m44110();
                            this.f26461 = iM44119;
                            if (iM44119 != i11) {
                                if (iM44119 != 76) {
                                    if (iM44119 != 88) {
                                        if (iM44119 != 108) {
                                            if (iM44119 != 120) {
                                                switch (iM44119) {
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
                                                        m21666(iM44119);
                                                        int i12 = this.f26462;
                                                        if (i12 == 10) {
                                                            boolean z4 = z2 || (lowerCase * 10) / 10 != lowerCase;
                                                            lowerCase = (lowerCase * 10) + ((long) (this.f26461 - 48));
                                                            z2 = z4 || lowerCase - 1 < -1;
                                                        } else {
                                                            if (i12 == 8) {
                                                                z2 = z2 || (lowerCase >>> 61) != 0;
                                                                j5 = lowerCase << 3;
                                                                i = this.f26461;
                                                            } else {
                                                                z2 = z2 || (lowerCase >>> 60) != 0;
                                                                j5 = lowerCase << 4;
                                                                i = this.f26461;
                                                            }
                                                            lowerCase = ((long) (i - 48)) + j5;
                                                        }
                                                        i11 = 46;
                                                        break;
                                                    default:
                                                        switch (iM44119) {
                                                            case 65:
                                                            case 66:
                                                            case 67:
                                                                c = '<';
                                                                m21666(iM44119);
                                                                if (this.f26462 != 16) {
                                                                    if (z2 && (lowerCase >>> c) == 0) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f26461))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            case 68:
                                                            case 69:
                                                            case 70:
                                                                c = '<';
                                                                if (this.f26462 != 16) {
                                                                    m21669();
                                                                    return;
                                                                }
                                                                m21666(iM44119);
                                                                if (this.f26462 != 16) {
                                                                    if (z2) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f26461))) - 97;
                                                                    i11 = 46;
                                                                }
                                                                break;
                                                            default:
                                                                switch (iM44119) {
                                                                    case 97:
                                                                    case 98:
                                                                    case q.f /* 99 */:
                                                                        c = '<';
                                                                        m21666(iM44119);
                                                                        if (this.f26462 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f26461))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    case 100:
                                                                    case 101:
                                                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                                        c = '<';
                                                                        if (this.f26462 != 16) {
                                                                            m21669();
                                                                            return;
                                                                        }
                                                                        m21666(iM44119);
                                                                        if (this.f26462 != 16) {
                                                                            if (z2) {
                                                                                z2 = true;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            lowerCase = (((lowerCase << 4) + 10) + ((long) Character.toLowerCase((char) this.f26461))) - 97;
                                                                            i11 = 46;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        this.f26459 = (int) lowerCase;
                                                                        this.f26465 = EnumC5202.f18162;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    if (this.f26457 == 1 && this.f26462 == 8) {
                                        this.f26462 = 16;
                                        i11 = 46;
                                    }
                                }
                                this.f26461 = this.f12426.f4183.m44110();
                                this.f26460 = lowerCase;
                                this.f26465 = EnumC5202.f18159;
                            } else if (this.f26462 != 16) {
                                m21669();
                                return;
                            }
                        }
                        if (!Character.isLetterOrDigit(this.f26461) && this.f26461 != 46) {
                            int i13 = this.f26462;
                            if (i13 == 8 && z3) {
                                this.f26459 = 0;
                                this.f26465 = EnumC5202.f18162;
                                C1122 c1122 = this.f12426;
                                c1122.mo4159(c1122.m4164(), "Invalid character in octal number", new Object[0]);
                                return;
                            }
                            if (z2) {
                                j4 = 0;
                            } else {
                                if (this.f26465 != EnumC5202.f18162) {
                                    return;
                                }
                                if (i13 == 10) {
                                    if (this.f26459 - 1 >= -1) {
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
                            this.f26459 = 0;
                            this.f26460 = j4;
                            this.f12426.mo4159(this.f26464, "Numeric overflow", new Object[0]);
                            return;
                        }
                        C1122 c1123 = this.f12426;
                        c1123.mo4159(c1123.m4164(), "Invalid character \"{0}\" in number", Character.toString((char) this.f26461));
                        while (true) {
                            int iM441110 = this.f12426.f4183.m44110();
                            this.f26461 = iM441110;
                            if (!Character.isLetterOrDigit(iM441110) && this.f26461 != 46) {
                                this.f26459 = 0;
                                this.f26465 = EnumC5202.f18162;
                                return;
                            }
                        }
                    } else {
                        if (i3 == 46) {
                            int iM441111 = this.f12426.f4183.m44110();
                            this.f26461 = iM441111;
                            switch (iM441111) {
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
                                    this.f26457 = 0;
                                    m21666(46);
                                    m21669();
                                    return;
                                default:
                                    this.f26465 = EnumC5202.f18331;
                                    return;
                            }
                        }
                        if (i3 == 123) {
                            this.f26461 = this.f12426.f4183.m44110();
                            this.f26465 = EnumC5202.f18213;
                            return;
                        }
                        if (i3 == 125) {
                            this.f26461 = this.f12426.f4183.m44110();
                            this.f26465 = EnumC5202.f18314;
                            return;
                        }
                        if (i3 == 44) {
                            this.f26461 = this.f12426.f4183.m44110();
                            this.f26465 = EnumC5202.f18309;
                            return;
                        }
                        if (i3 == 59) {
                            this.f26461 = this.f12426.f4183.m44110();
                            this.f26465 = EnumC5202.f18144;
                            return;
                        }
                        if (i3 == 58) {
                            this.f26461 = this.f12426.f4183.m44110();
                            this.f26465 = EnumC5202.f18334;
                            return;
                        }
                        if (i3 == 61) {
                            int iM441112 = this.f12426.f4183.m44110();
                            this.f26461 = iM441112;
                            if (iM441112 != 61) {
                                this.f26465 = EnumC5202.f18167;
                                return;
                            } else {
                                this.f26461 = this.f12426.f4183.m44110();
                                this.f26465 = EnumC5202.f18230;
                                return;
                            }
                        }
                        if (i3 == 26) {
                            int iM441113 = this.f12426.f4183.m44110();
                            this.f26461 = iM441113;
                            if (iM441113 == -1) {
                                this.f26465 = EnumC5202.f18303;
                                return;
                            } else {
                                this.f12426.mo4166(this.f26450, "Invalid character with code {0} in input", Integer.valueOf(iM441113));
                                this.f26461 = this.f12426.f4183.m44110();
                            }
                        } else if (i3 == 35) {
                            if (this.f12426.f4183.m44111() == 123) {
                                this.f26461 = this.f12426.f4183.m44110();
                                this.f26465 = EnumC5202.f18308;
                                return;
                            }
                            int i14 = this.f26461;
                            int iM441114 = this.f12426.f4183.m44110();
                            this.f26461 = iM441114;
                            switch (iM441114) {
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
                                    long j6 = iM441114 - 48;
                                    this.f26457 = 0;
                                    m21666(iM441114);
                                    while (true) {
                                        boolean z5 = false;
                                        while (true) {
                                            int iM441115 = this.f12426.f4183.m44110();
                                            this.f26461 = iM441115;
                                            switch (iM441115) {
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
                                                    m21666(iM441115);
                                                    if (!z5) {
                                                        j6 = (j6 * 10) + ((long) (this.f26461 - 48));
                                                        if (j6 > 65535) {
                                                            z5 = true;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    this.f26459 = (int) j6;
                                                    this.f26453 = m21670();
                                                    this.f26465 = EnumC5202.f18285;
                                                    if (z5) {
                                                        this.f12426.mo4159(this.f26464, "Numeric overflow", new Object[0]);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    this.f26453 = Character.toString((char) i14);
                                    C1122 c1124 = this.f12426;
                                    c1124.m4162(c1124.m4164(), "Invalid character \"{0}\" in number", this.f26453);
                                    throw null;
                            }
                        } else if (i3 == 92) {
                            int iM441116 = this.f12426.f4183.m44110();
                            this.f26461 = iM441116;
                            if (iM441116 == 117) {
                                int iM441010 = this.f12426.f4183.m44109();
                                this.f26461 = iM441010;
                                if (Character.isLetterOrDigit(iM441010) && !Character.isDigit(this.f26461)) {
                                    m21667((char[]) null);
                                    return;
                                }
                            } else if (this.f26452.test(Integer.valueOf(iM441116))) {
                                m21667(new char[]{'\\', (char) this.f26461});
                                return;
                            }
                            final long jM4158 = this.f12426.m4158(this.f26464);
                            final long jM14629 = ((C4728) this.f12426.m32312()).m14629(jM4158, this.f26464);
                            this.f12426.m32299(new Supplier() { // from class: l.ۛܳ᩺
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f21772.f26461), Long.valueOf(jM4158), Long.valueOf(jM14629));
                                }
                            });
                            this.f12426.mo4166(this.f26464, "Invalid character with code {0} in input", Integer.valueOf(this.f26461));
                            this.f26461 = this.f12426.f4183.m44110();
                        } else {
                            final long jM4159 = this.f12426.m4158(this.f26464);
                            final long jM146210 = ((C4728) this.f12426.m32312()).m14629(jM4159, this.f26464);
                            this.f12426.m32299(new Supplier() { // from class: l.᩺ܳ᩺
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return String.format("Funny char with code='%c' at %d:%d", Integer.valueOf(this.f79086.f26461), Long.valueOf(jM4159), Long.valueOf(jM146210));
                                }
                            });
                            this.f12426.mo4166(this.f26464, "Invalid character with code {0} in input", Integer.valueOf(this.f26461));
                            this.f26461 = this.f12426.f4183.m44110();
                        }
                    }
                }
            }
        }
        m21667((char[]) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21672(String str) {
        if (this.f12426.m32305()) {
            EnumC5202 enumC5202 = this.f26465;
            if (enumC5202 == null) {
                this.f12426.m32315(str.concat("<<<NULL TOKEN>>>"), new Object[0]);
                return;
            }
            this.f12426.m32304(str.concat(enumC5202.toString()), new Object[0]);
            int i = C0507.f2187[this.f26465.ordinal()];
            if (i == 2) {
                this.f12426.m32315(" = {intValue}: " + this.f26459, new Object[0]);
                return;
            }
            if (i == 4) {
                this.f12426.m32315(" = {floatValue}: " + this.f26449, new Object[0]);
                return;
            }
            if (i == 5) {
                this.f12426.m32315(" = {doubleValue}: " + this.f26456, new Object[0]);
                return;
            }
            if (i != 8) {
                if (i != 9) {
                    this.f12426.m32315("", new Object[0]);
                    return;
                } else {
                    this.f12426.m32315(C8947.m23910(new StringBuilder(" = {stringValue}: \""), this.f26453, "\""), new Object[0]);
                    return;
                }
            }
            C1122 c1122 = this.f12426;
            StringBuilder sb = new StringBuilder(" = '");
            sb.append(this.f26453);
            sb.append("' {idValue = '");
            c1122.m32315(C8947.m23910(sb, this.f26454, "'}"), new Object[0]);
        }
    }
}
