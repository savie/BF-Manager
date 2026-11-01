package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.CharBuffer;
import java.util.HashSet;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ܽ᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7RX */
/* JADX INFO: loaded from: classes4.dex */
public class C16907 extends C6218 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16802 f54061;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f54062;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f54063;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20414 f54064;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23942 f54065;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2008 f54066;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C18213 f54067;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC11909 f54068;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f54069;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16826 f54070;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f54071;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC0573 f54072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public StringBuilder f54073;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f54074;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f54075;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m39582(char c) {
        if (c == '!' || c == '-' || c == ':' || c == '^' || c == '|' || c == '~' || c == '%' || c == '&' || c == '*' || c == '+') {
            return true;
        }
        switch (c) {
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16907(C18213 c18213, CharBuffer charBuffer) {
        char[] charArray;
        int i = C14315.f46886;
        if (charBuffer.hasArray()) {
            charArray = (char[]) charBuffer.compact().flip().array();
        } else {
            charArray = charBuffer.toString().toCharArray();
        }
        this(c18213, charArray, charBuffer.limit());
    }

    public C16907(C18213 c18213, char[] cArr, int i) {
        super(c18213, cArr, i);
        this.f54062 = -1;
        this.f54075 = -1;
        this.f54067 = c18213;
        this.f54064 = c18213.f58179;
        this.f54065 = c18213.f58178;
        this.f54061 = c18213.f58180;
        this.f54068 = c18213.f58177;
        this.f54066 = c18213.f58175;
        this.f54070 = c18213.f58176;
        this.f54073 = new StringBuilder(256);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39590(int i, EnumC14026 enumC14026) {
        C2008 c2008 = this.f54066;
        boolean zM6478 = c2008.m6478(enumC14026);
        C20414 c20414 = this.f54064;
        if (!zM6478 || c2008.m6473()) {
            EnumC11909 enumC11909 = this.f54068;
            if (enumC14026.m33945(enumC11909)) {
                if (c2008.m6478(enumC14026)) {
                    c2008.m6471(new C3086(i), enumC14026);
                    return;
                }
                return;
            }
            c20414.m48192(EnumC0264.SOURCE_LEVEL, i, enumC14026.m33943(enumC11909.f39974));
        } else {
            c20414.m48192(EnumC0264.SOURCE_LEVEL, i, c2008.m6469(enumC14026));
        }
        this.f54075 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39589(int i, C5909 c5909) {
        this.f54064.m48188(i, c5909);
        this.f54072 = EnumC0573.f2434;
        this.f54075 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m39588(char c) {
        this.f54073.append(c);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m39592() {
        if (m17255()) {
            this.f54073.appendCodePoint(m17252());
        } else {
            m39588(m17241());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m39594() {
        m39592();
        mo17251();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m39583() {
        if (m17249('\\')) {
            m39588(m17241());
            mo17251();
            this.f54074 = true;
            char cM17241 = m17241();
            if (cM17241 != '\n' && cM17241 != '\r') {
                if (cM17241 != '\"' && cM17241 != '\'' && cM17241 != '\\' && cM17241 != 'b' && cM17241 != 'f' && cM17241 != 'n') {
                    switch (cM17241) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            char cM17242 = m17241();
                            m39594();
                            if (m17254('7')) {
                                m39594();
                                if (cM17242 > '3' || !m17254('7')) {
                                    return;
                                }
                                m39594();
                                return;
                            }
                            return;
                        default:
                            switch (cM17241) {
                                case 'r':
                                case 't':
                                    break;
                                case 's':
                                    m39590(m17240(), EnumC14026.f46119);
                                    m39594();
                                    break;
                                default:
                                    m39589(m17240(), C23879.f77218);
                                    break;
                            }
                            return;
                    }
                }
                m39594();
                return;
            }
            if (this.f54069) {
                m17243('\r');
                m17243('\n');
                m39588('\n');
                return;
            }
            m39589(m17240(), C23879.f77218);
            return;
        }
        m39594();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39591(char c, char c2) {
        if (!m17244(c, c2)) {
            return false;
        }
        m39588(m17241());
        mo17251();
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m39584(int i) {
        int iM17240;
        boolean zM17249 = m17249('_');
        int i2 = this.f54062;
        int iM17241 = zM17249 ? m17240() : i2;
        while (true) {
            if (!m17249('_')) {
                m39592();
                iM17240 = i2;
            } else {
                iM17240 = m17240();
            }
            mo17251();
            if (m17242(i) < 0 && !m17249('_')) {
                break;
            }
        }
        if (iM17241 != i2) {
            m39589(iM17241, C23879.f77192);
        } else if (iM17240 != i2) {
            m39589(iM17240, C23879.f77192);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m39581(int i) {
        if (m39591('p', 'P')) {
            m39587();
            m39591('+', '-');
            m39587();
            if (m17242(10) >= 0) {
                m39584(10);
            } else {
                m39589(i, C23879.f77186);
            }
        } else {
            m39589(i, C23879.f77186);
        }
        if (m39591('f', 'F')) {
            this.f54072 = EnumC0573.f2406;
            this.f54063 = 16;
        } else {
            m39591('d', 'D');
            this.f54072 = EnumC0573.f2458;
            this.f54063 = 16;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m39580(int i) {
        this.f54063 = 10;
        m39587();
        if (m17242(10) >= 0) {
            m39584(10);
        }
        StringBuilder sb = this.f54073;
        int length = sb.length();
        if (m39591('e', 'E')) {
            m39587();
            m39591('+', '-');
            m39587();
            if (m17242(10) >= 0) {
                m39584(10);
            } else {
                m39589(i, C23879.f77186);
                sb.setLength(length);
            }
        }
        if (m39591('f', 'F')) {
            this.f54072 = EnumC0573.f2406;
        } else {
            m39591('d', 'D');
            this.f54072 = EnumC0573.f2458;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m39587() {
        if (m17249('_')) {
            m39589(m17240(), C23879.f77192);
            while (m17243('_')) {
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m39585(int i, int i2) {
        this.f54063 = i2;
        int i3 = i2 == 8 ? 10 : i2;
        int iM17242 = m17242(Math.max(10, i3));
        boolean z = false;
        boolean z2 = true;
        boolean z3 = iM17242 >= 0;
        boolean z4 = iM17242 >= 0 && iM17242 < i3;
        if (z3) {
            m39584(i3);
        }
        if (i2 == 16 && m17249('.')) {
            this.f54063 = 16;
            C6171.m17176(m17249('.'));
            m39594();
            m39587();
            if (m17242(16) >= 0) {
                m39584(16);
            } else {
                z2 = z3;
            }
            if (!z2) {
                m39589(i, C23879.f77242);
                return;
            } else {
                m39581(i);
                return;
            }
        }
        if (z3 && i2 == 16 && m17244('p', 'P')) {
            m39581(i);
            return;
        }
        if (i3 != 10 || !m17249('.')) {
            if (i3 == 10) {
                if (m17249('e') || m17249('E') || m17249('f') || m17249('F') || m17249('d') || m17249('D')) {
                    m39580(i);
                    return;
                }
            }
            if (!z4) {
                if (i2 == 2) {
                    m39589(i, C23879.f77323);
                } else if (i2 == 16) {
                    m39589(i, C23879.f77242);
                }
            }
            if (i2 == 8) {
                this.f54073.setLength(0);
                m17253(i);
                m39584(8);
            }
            if (m17244('l', 'L')) {
                mo17251();
                z = true;
            }
            if (z) {
                this.f54072 = EnumC0573.f2483;
                return;
            } else {
                this.f54072 = EnumC0573.f2477;
                return;
            }
        }
        m39594();
        m39580(i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0022. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0013. Please report as an issue. */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m39586() {
        C16802 c16802;
        StringBuilder sb;
        C23942 c23942;
        boolean zIsJavaIdentifierPart;
        m39594();
        while (true) {
            char cM17241 = m17241();
            if (cM17241 != '$' && cM17241 != '_') {
                if (cM17241 != 127) {
                    switch (cM17241) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            break;
                    }
                    c16802 = this.f54061;
                    sb = this.f54073;
                    c23942 = this.f54065;
                    switch (cM17241) {
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                            break;
                        case 26:
                            if (m17247()) {
                                mo17251();
                            }
                            break;
                        default:
                            switch (cM17241) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case '8':
                                case '9':
                                    break;
                                default:
                                    switch (cM17241) {
                                        case 'A':
                                        case 'B':
                                        case 'C':
                                        case 'D':
                                        case 'E':
                                        case 'F':
                                        case 'G':
                                        case 'H':
                                        case 'I':
                                        case 'J':
                                        case 'K':
                                        case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                        case 'M':
                                        case 'N':
                                        case 'O':
                                        case 'P':
                                        case 'Q':
                                        case 'R':
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        case 'T':
                                        case 'U':
                                        case HRSS1373Polynomial.K /* 86 */:
                                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                        case 'X':
                                        case 'Y':
                                        case 'Z':
                                            break;
                                        default:
                                            switch (cM17241) {
                                                case 'a':
                                                case 'b':
                                                case q.f /* 99 */:
                                                case 'd':
                                                case 'e':
                                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                                case 'l':
                                                case 'm':
                                                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                                case 'r':
                                                case 's':
                                                case 't':
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                case 'v':
                                                case 'w':
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                case 'z':
                                                    break;
                                                default:
                                                    if (m17239()) {
                                                        zIsJavaIdentifierPart = false;
                                                    } else if (Character.isIdentifierIgnorable(m17241())) {
                                                        mo17251();
                                                    } else if (m17255()) {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m17252());
                                                    } else {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m17241());
                                                    }
                                                    if (!zIsJavaIdentifierPart) {
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                mo17251();
            }
            m39594();
        }
        AbstractC11242 abstractC11242M17389 = c23942.f77631.m17389(sb.toString());
        this.f54071 = abstractC11242M17389;
        this.f54072 = c16802.m39452(abstractC11242M17389);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x017e  */
    /* JADX WARN: Code duplicated, block: B:192:0x036a  */
    /* JADX WARN: Code duplicated, block: B:193:0x036d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0374  */
    /* JADX WARN: Code duplicated, block: B:200:0x0384  */
    /* JADX WARN: Code duplicated, block: B:202:0x038a  */
    /* JADX WARN: Code duplicated, block: B:204:0x038e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0398  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:219:0x03da A[PHI: r0
      0x03da: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v1 java.lang.String), (r0v11 java.lang.String) binds: [B:207:0x039e, B:218:0x03d9, B:216:0x03d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:227:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x03de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0161 A[LOOP:2: B:93:0x0161->B:282:0x0161, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:95:0x0167  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20330 m39593() {
        int iM17240;
        C5909 c5909;
        int iM17241;
        int iM17242;
        EnumC0573 enumC0573;
        EnumC16097 enumC16097;
        String string;
        EnumC0597 enumC0597;
        HashSet hashSetM21765;
        boolean zContains;
        C20414 c20414;
        boolean z;
        String string2;
        EnumC19625 enumC19625;
        InterfaceC9042 interfaceC9042Mo11642;
        StringBuilder sb = this.f54073;
        boolean z2 = false;
        sb.setLength(0);
        this.f54071 = null;
        this.f54063 = 0;
        this.f54069 = false;
        this.f54074 = false;
        C21825 c21825M48597 = null;
        while (true) {
            int iM17243 = m17240();
            char cM17241 = m17241();
            if (cM17241 != '\t') {
                if (cM17241 == '\n') {
                    mo17251();
                } else if (cM17241 != '\f') {
                    if (cM17241 == '\r') {
                        mo17251();
                        m17243('\n');
                    } else if (cM17241 != ' ') {
                        if (cM17241 != '\"') {
                            if (cM17241 != '$') {
                                if (cM17241 == ',') {
                                    mo17251();
                                    this.f54072 = EnumC0573.f2469;
                                } else if (cM17241 == ';') {
                                    mo17251();
                                    this.f54072 = EnumC0573.f2491;
                                } else if (cM17241 == ']') {
                                    mo17251();
                                    this.f54072 = EnumC0573.f2445;
                                } else if (cM17241 != '_') {
                                    if (cM17241 != '}') {
                                        switch (cM17241) {
                                            case '\'':
                                                mo17251();
                                                if (!m17243('\'')) {
                                                    if (m17244('\n', '\r')) {
                                                        m39589(iM17243, C23879.f77354);
                                                    }
                                                    m39583();
                                                    if (!m17243('\'')) {
                                                        m39589(iM17243, C23879.f77194);
                                                    } else {
                                                        this.f54072 = EnumC0573.f2414;
                                                    }
                                                } else {
                                                    m39589(iM17243, C23879.f77260);
                                                }
                                                break;
                                            case '(':
                                                mo17251();
                                                this.f54072 = EnumC0573.f2460;
                                                break;
                                            case ')':
                                                mo17251();
                                                this.f54072 = EnumC0573.f2415;
                                                break;
                                            default:
                                                boolean z3 = true;
                                                switch (cM17241) {
                                                    case '.':
                                                        if (!m17245("...")) {
                                                            mo17251();
                                                            int iM17244 = m17240();
                                                            if (m17243('.')) {
                                                                m39589(iM17244, C23879.f77266);
                                                            } else if (m17242(10) < 0) {
                                                                this.f54072 = EnumC0573.f2417;
                                                            } else {
                                                                m39588('.');
                                                                m39580(iM17243);
                                                            }
                                                        } else {
                                                            sb.append("...");
                                                            this.f54072 = EnumC0573.f2478;
                                                        }
                                                        break;
                                                    case '/':
                                                        mo17251();
                                                        if (m17243('/')) {
                                                            while (m17247() && !m17244('\r', '\n')) {
                                                                mo17251();
                                                            }
                                                            if (m17247()) {
                                                                interfaceC9042Mo11642 = mo11642(iM17243, m17240(), EnumC19625.LINE);
                                                                if (c21825M48597 != null) {
                                                                }
                                                            }
                                                        } else if (m17243('*')) {
                                                            if (m17243('*')) {
                                                                enumC19625 = EnumC19625.JAVADOC;
                                                                if (!m17249('/')) {
                                                                }
                                                                if (!z3) {
                                                                    while (m17247()) {
                                                                        if (m17243('*')) {
                                                                            mo17251();
                                                                        } else if (m17249('/')) {
                                                                        }
                                                                    }
                                                                }
                                                                if (m17243('/')) {
                                                                    m39589(iM17243, C23879.f77207);
                                                                } else {
                                                                    interfaceC9042Mo11642 = mo11642(iM17243, m17240(), enumC19625);
                                                                    c21825M48597 = c21825M48597 == null ? c21825M48597.m48597(interfaceC9042Mo11642) : C21825.of((Object) interfaceC9042Mo11642);
                                                                }
                                                            } else {
                                                                enumC19625 = EnumC19625.BLOCK;
                                                            }
                                                            z3 = false;
                                                            if (!z3) {
                                                                while (m17247()) {
                                                                    if (m17243('*')) {
                                                                        mo17251();
                                                                    } else if (m17249('/')) {
                                                                    }
                                                                }
                                                            }
                                                            if (m17243('/')) {
                                                                m39589(iM17243, C23879.f77207);
                                                            } else {
                                                                interfaceC9042Mo11642 = mo11642(iM17243, m17240(), enumC19625);
                                                                if (c21825M48597 == null) {
                                                                }
                                                            }
                                                            break;
                                                        } else if (!m17243(a.h)) {
                                                            this.f54072 = EnumC0573.f2485;
                                                        } else {
                                                            this.f54072 = EnumC0573.f2470;
                                                        }
                                                        break;
                                                    case '0':
                                                        mo17251();
                                                        if (m17244('x', 'X')) {
                                                            mo17251();
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (!z) {
                                                            if (m17244('b', 'B')) {
                                                                mo17251();
                                                                z2 = true;
                                                            }
                                                            if (!z2) {
                                                                m39588('0');
                                                                if (m17249('_')) {
                                                                    int iM17245 = m17240();
                                                                    while (m17243('_')) {
                                                                    }
                                                                    if (m17242(10) < 0) {
                                                                        m39589(iM17245, C23879.f77192);
                                                                    }
                                                                }
                                                                m39585(iM17243, 8);
                                                            } else {
                                                                m39587();
                                                                m39585(iM17243, 2);
                                                            }
                                                        } else {
                                                            m39587();
                                                            m39585(iM17243, 16);
                                                        }
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                    case '8':
                                                    case '9':
                                                        m39585(iM17243, 10);
                                                        break;
                                                    default:
                                                        switch (cM17241) {
                                                            case 'A':
                                                            case 'B':
                                                            case 'C':
                                                            case 'D':
                                                            case 'E':
                                                            case 'F':
                                                            case 'G':
                                                            case 'H':
                                                            case 'I':
                                                            case 'J':
                                                            case 'K':
                                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                            case 'M':
                                                            case 'N':
                                                            case 'O':
                                                            case 'P':
                                                            case 'Q':
                                                            case 'R':
                                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                            case 'T':
                                                            case 'U':
                                                            case HRSS1373Polynomial.K /* 86 */:
                                                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                                            case 'X':
                                                            case 'Y':
                                                            case 'Z':
                                                                break;
                                                            case '[':
                                                                mo17251();
                                                                this.f54072 = EnumC0573.f2432;
                                                                break;
                                                            default:
                                                                switch (cM17241) {
                                                                    case 'a':
                                                                    case 'b':
                                                                    case q.f /* 99 */:
                                                                    case 'd':
                                                                    case 'e':
                                                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                                                    case 'l':
                                                                    case 'm':
                                                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                                                    case 'r':
                                                                    case 's':
                                                                    case 't':
                                                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                                    case 'v':
                                                                    case 'w':
                                                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                                    case 'z':
                                                                        break;
                                                                    case '{':
                                                                        mo17251();
                                                                        this.f54072 = EnumC0573.f2425;
                                                                        break;
                                                                    default:
                                                                        if (!m39582(m17241())) {
                                                                            if (m17239() ? false : m17255() ? Character.isJavaIdentifierStart(m17252()) : Character.isJavaIdentifierStart(m17241())) {
                                                                                m39586();
                                                                            } else if (m17242(10) >= 0) {
                                                                                m39585(iM17243, 10);
                                                                            } else if (!m17249((char) 26) && m17247()) {
                                                                                if (m17255()) {
                                                                                    int iM17252 = m17252();
                                                                                    string2 = String.format("\\u%04x\\u%04x", Integer.valueOf(Character.highSurrogate(iM17252)), Integer.valueOf(Character.lowSurrogate(iM17252)));
                                                                                } else {
                                                                                    char cM17242 = m17241();
                                                                                    if (' ' >= cM17242 || cM17242 >= 127) {
                                                                                        string2 = String.format("\\u%04x", Integer.valueOf(cM17242));
                                                                                    } else {
                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                        sb2.append(cM17242);
                                                                                        string2 = sb2.toString();
                                                                                    }
                                                                                }
                                                                                C5909 c59010 = C23879.f77204;
                                                                                m39589(iM17243, new C5909("compiler", "illegal.char", string2));
                                                                                mo17251();
                                                                            } else {
                                                                                this.f54072 = EnumC0573.f2441;
                                                                                iM17241 = m17240();
                                                                            }
                                                                        } else {
                                                                            do {
                                                                                m39592();
                                                                                EnumC0573 enumC0573M39451 = this.f54061.m39451(sb.toString());
                                                                                if (enumC0573M39451 == EnumC0573.f2416) {
                                                                                    sb.setLength(sb.length() - 1);
                                                                                } else {
                                                                                    this.f54072 = enumC0573M39451;
                                                                                    mo17251();
                                                                                }
                                                                            } while (m39582(m17241()));
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        iM17242 = m17240();
                                        enumC0573 = this.f54072;
                                        enumC16097 = enumC0573.f2498;
                                        if (enumC16097 == EnumC16097.DEFAULT) {
                                            return new C20330(enumC0573, iM17241, iM17242, c21825M48597);
                                        }
                                        if (enumC16097 == EnumC16097.NAMED) {
                                            return new C10453(enumC0573, iM17241, iM17242, this.f54071, c21825M48597);
                                        }
                                        string = sb.toString();
                                        if (this.f54069) {
                                            if (this.f54074) {
                                                string = C13486.m32994(string);
                                            }
                                            String str = string;
                                            EnumC0573 enumC0574 = this.f54072;
                                            if (enumC0574.f2498 == EnumC16097.STRING) {
                                            }
                                        }
                                        enumC0597 = EnumC0597.TEXT_BLOCKS;
                                        if (this.f54070.m39467(enumC0597)) {
                                            hashSetM21765 = C8336.m21765(string);
                                            zContains = hashSetM21765.contains(EnumC18919.INCONSISTENT);
                                            c20414 = this.f54064;
                                            if (zContains) {
                                                c20414.m48203(enumC0597, new C3086(iM17241), C9768.f32844);
                                            }
                                            if (hashSetM21765.contains(EnumC18919.TRAILING)) {
                                                c20414.m48203(enumC0597, new C3086(iM17241), C9768.f32847);
                                            }
                                        }
                                        try {
                                            string = C13486.m32995(string);
                                        } catch (Exception unused) {
                                        }
                                        if (this.f54074) {
                                            try {
                                                string = C13486.m32994(string);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        String str2 = string;
                                        EnumC0573 enumC0575 = this.f54072;
                                        return enumC0575.f2498 == EnumC16097.STRING ? new C21035(enumC0575, iM17241, iM17242, str2, c21825M48597) : new C7630(enumC0575, iM17241, iM17242, str2, this.f54063, c21825M48597);
                                        throw th;
                                    }
                                    mo17251();
                                    this.f54072 = EnumC0573.f2387;
                                }
                            }
                            m39586();
                        } else {
                            this.f54072 = EnumC0573.f2431;
                            boolean zM17245 = m17245("\"\"\"");
                            this.f54069 = zM17245;
                            int i = this.f54062;
                            if (zM17245) {
                                m39590(iM17243, EnumC14026.f46119);
                                m17248();
                                if (m17244('\n', '\r')) {
                                    m17243('\r');
                                    m17243('\n');
                                    iM17240 = i;
                                    while (true) {
                                        if (!m17247()) {
                                            if (this.f54069) {
                                                c5909 = C23879.f77261;
                                            } else {
                                                c5909 = C23879.f77278;
                                            }
                                            m39589(iM17243, c5909);
                                            if (iM17240 != i) {
                                                m17253(iM17240);
                                            }
                                        } else if (!m17245("\"\"\"")) {
                                            if (m17244('\n', '\r')) {
                                                m17243('\r');
                                                m17243('\n');
                                                m39588('\n');
                                                if (iM17240 == i) {
                                                    iM17240 = m17240();
                                                }
                                            } else {
                                                m39583();
                                            }
                                        }
                                    }
                                } else {
                                    m39589(m17240(), C23879.f77263);
                                }
                            } else {
                                mo17251();
                                while (true) {
                                    if (m17247()) {
                                        if (!m17243('\"')) {
                                            if (!m17244('\n', '\r')) {
                                                m39583();
                                            }
                                        }
                                    }
                                    iM17240 = i;
                                    if (this.f54069) {
                                        c5909 = C23879.f77261;
                                    } else {
                                        c5909 = C23879.f77278;
                                    }
                                    m39589(iM17243, c5909);
                                    if (iM17240 != i) {
                                        m17253(iM17240);
                                    }
                                }
                            }
                        }
                        iM17241 = iM17243;
                        iM17242 = m17240();
                        enumC0573 = this.f54072;
                        enumC16097 = enumC0573.f2498;
                        if (enumC16097 == EnumC16097.DEFAULT) {
                            return new C20330(enumC0573, iM17241, iM17242, c21825M48597);
                        }
                        if (enumC16097 == EnumC16097.NAMED) {
                            return new C10453(enumC0573, iM17241, iM17242, this.f54071, c21825M48597);
                        }
                        string = sb.toString();
                        if (this.f54069) {
                            if (this.f54074) {
                                string = C13486.m32994(string);
                            }
                            String str3 = string;
                            EnumC0573 enumC0576 = this.f54072;
                            if (enumC0576.f2498 == EnumC16097.STRING) {
                            }
                        }
                        enumC0597 = EnumC0597.TEXT_BLOCKS;
                        if (this.f54070.m39467(enumC0597)) {
                            hashSetM21765 = C8336.m21765(string);
                            zContains = hashSetM21765.contains(EnumC18919.INCONSISTENT);
                            c20414 = this.f54064;
                            if (zContains) {
                                c20414.m48203(enumC0597, new C3086(iM17241), C9768.f32844);
                            }
                            if (hashSetM21765.contains(EnumC18919.TRAILING)) {
                                c20414.m48203(enumC0597, new C3086(iM17241), C9768.f32847);
                            }
                        }
                        string = C13486.m32995(string);
                        if (this.f54074) {
                            string = C13486.m32994(string);
                        }
                        String str4 = string;
                        EnumC0573 enumC0577 = this.f54072;
                        if (enumC0577.f2498 == EnumC16097.STRING) {
                        }
                        throw th;
                    }
                }
            }
            m17248();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC9042 mo11642(int i, int i2, EnumC19625 enumC19625) {
        return new C0678(enumC19625, this.f54067, m17246(i, i2), i);
    }

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC9831 mo11643() {
        return C13919.m33759(m17250(), m17238(), false);
    }
}
