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

/* JADX INFO: renamed from: l.۬ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7RX */
/* JADX INFO: loaded from: classes4.dex */
public class C13652 extends C10603 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C7312 f43341;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public StringBuilder f43342;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17638 f43343;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43344;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15252 f43345;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC20820 f43346;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f43347;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21637 f43348;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f43349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14177 f43350;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f43351;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC7466 f43352;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15400 f43353;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f43354;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f43355;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m33419(char c) {
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
    public C13652(C21637 c21637, CharBuffer charBuffer) {
        char[] charArray;
        int i = C2026.f6742;
        if (charBuffer.hasArray()) {
            charArray = (char[]) charBuffer.compact().flip().array();
        } else {
            charArray = charBuffer.toString().toCharArray();
        }
        this(c21637, charArray, charBuffer.limit());
    }

    public C13652(C21637 c21637, char[] cArr, int i) {
        super(c21637, cArr, i);
        this.f43344 = -1;
        this.f43355 = -1;
        this.f43348 = c21637;
        this.f43341 = c21637.f69085;
        this.f43345 = c21637.f69082;
        this.f43350 = c21637.f69083;
        this.f43346 = c21637.f69084;
        this.f43343 = c21637.f69086;
        this.f43353 = c21637.f69081;
        this.f43342 = new StringBuilder(256);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33424(int i, EnumC3666 enumC3666) {
        C17638 c17638 = this.f43343;
        boolean zM41300 = c17638.m41300(enumC3666);
        C7312 c7312 = this.f43341;
        if (!zM41300 || c17638.m41295()) {
            EnumC20820 enumC20820 = this.f43346;
            if (enumC3666.m11915(enumC20820)) {
                if (c17638.m41300(enumC3666)) {
                    c17638.m41292(new C2092(i), enumC3666);
                    return;
                }
                return;
            }
            c7312.m34522(EnumC6984.SOURCE_LEVEL, i, enumC3666.m11913(enumC20820.f66685));
        } else {
            c7312.m34522(EnumC6984.SOURCE_LEVEL, i, c17638.m41290(enumC3666));
        }
        this.f43355 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33425(int i, C11040 c11040) {
        this.f43341.m34517(i, c11040);
        this.f43352 = EnumC7466.f24604;
        this.f43355 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33430(char c) {
        this.f43342.append(c);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m33427() {
        if (m27064()) {
            this.f43342.appendCodePoint(m27066());
        } else {
            m33430(m27054());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33428() {
        m33427();
        mo14465();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m33416() {
        if (m27060('\\')) {
            m33430(m27054());
            mo14465();
            this.f43349 = true;
            char cM27054 = m27054();
            if (cM27054 != '\n' && cM27054 != '\r') {
                if (cM27054 != '\"' && cM27054 != '\'' && cM27054 != '\\' && cM27054 != 'b' && cM27054 != 'f' && cM27054 != 'n') {
                    switch (cM27054) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            char cM27055 = m27054();
                            m33428();
                            if (m27068('7')) {
                                m33428();
                                if (cM27055 > '3' || !m27068('7')) {
                                    return;
                                }
                                m33428();
                                return;
                            }
                            return;
                        default:
                            switch (cM27054) {
                                case 'r':
                                case 't':
                                    break;
                                case 's':
                                    m33424(m27053(), EnumC3666.f12571);
                                    m33428();
                                    break;
                                default:
                                    m33425(m27053(), C22843.f74096);
                                    break;
                            }
                            return;
                    }
                }
                m33428();
                return;
            }
            if (this.f43347) {
                m27056('\r');
                m27056('\n');
                m33430('\n');
                return;
            }
            m33425(m27053(), C22843.f74096);
            return;
        }
        m33428();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m33429(char c, char c2) {
        if (!m27057(c, c2)) {
            return false;
        }
        m33430(m27054());
        mo14465();
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33417(int i) {
        int iM27053;
        boolean zM27060 = m27060('_');
        int i2 = this.f43344;
        int iM27054 = zM27060 ? m27053() : i2;
        while (true) {
            if (!m27060('_')) {
                m33427();
                iM27053 = i2;
            } else {
                iM27053 = m27053();
            }
            mo14465();
            if (m27055(i) < 0 && !m27060('_')) {
                break;
            }
        }
        if (iM27054 != i2) {
            m33425(iM27054, C22843.f74193);
        } else if (iM27053 != i2) {
            m33425(iM27053, C22843.f74193);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m33418(int i) {
        if (m33429('p', 'P')) {
            m33420();
            m33429('+', '-');
            m33420();
            if (m27055(10) >= 0) {
                m33417(10);
            } else {
                m33425(i, C22843.f74088);
            }
        } else {
            m33425(i, C22843.f74088);
        }
        if (m33429('f', 'F')) {
            this.f43352 = EnumC7466.f24622;
            this.f43354 = 16;
        } else {
            m33429('d', 'D');
            this.f43352 = EnumC7466.f24666;
            this.f43354 = 16;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m33422(int i) {
        this.f43354 = 10;
        m33420();
        if (m27055(10) >= 0) {
            m33417(10);
        }
        StringBuilder sb = this.f43342;
        int length = sb.length();
        if (m33429('e', 'E')) {
            m33420();
            m33429('+', '-');
            m33420();
            if (m27055(10) >= 0) {
                m33417(10);
            } else {
                m33425(i, C22843.f74088);
                sb.setLength(length);
            }
        }
        if (m33429('f', 'F')) {
            this.f43352 = EnumC7466.f24622;
        } else {
            m33429('d', 'D');
            this.f43352 = EnumC7466.f24666;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m33420() {
        if (m27060('_')) {
            m33425(m27053(), C22843.f74193);
            while (m27056('_')) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33421(int i, int i2) {
        this.f43354 = i2;
        int i3 = i2 == 8 ? 10 : i2;
        int iM27055 = m27055(Math.max(10, i3));
        boolean z = false;
        boolean z2 = true;
        boolean z3 = iM27055 >= 0;
        boolean z4 = iM27055 >= 0 && iM27055 < i3;
        if (z3) {
            m33417(i3);
        }
        if (i2 == 16 && m27060('.')) {
            this.f43354 = 16;
            C11972.m30026(m27060('.'));
            m33428();
            m33420();
            if (m27055(16) >= 0) {
                m33417(16);
            } else {
                z2 = z3;
            }
            if (!z2) {
                m33425(i, C22843.f74115);
                return;
            } else {
                m33418(i);
                return;
            }
        }
        if (z3 && i2 == 16 && m27057('p', 'P')) {
            m33418(i);
            return;
        }
        if (i3 != 10 || !m27060('.')) {
            if (i3 == 10) {
                if (m27060('e') || m27060('E') || m27060('f') || m27060('F') || m27060('d') || m27060('D')) {
                    m33422(i);
                    return;
                }
            }
            if (!z4) {
                if (i2 == 2) {
                    m33425(i, C22843.f74176);
                } else if (i2 == 16) {
                    m33425(i, C22843.f74115);
                }
            }
            if (i2 == 8) {
                this.f43342.setLength(0);
                m27067(i);
                m33417(8);
            }
            if (m27057('l', 'L')) {
                mo14465();
                z = true;
            }
            if (z) {
                this.f43352 = EnumC7466.f24619;
                return;
            } else {
                this.f43352 = EnumC7466.f24694;
                return;
            }
        }
        m33428();
        m33422(i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0022. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0013. Please report as an issue. */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m33423() {
        C14177 c14177;
        StringBuilder sb;
        C15252 c15252;
        boolean zIsJavaIdentifierPart;
        m33428();
        while (true) {
            char cM27054 = m27054();
            if (cM27054 != '$' && cM27054 != '_') {
                if (cM27054 != 127) {
                    switch (cM27054) {
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
                    c14177 = this.f43350;
                    sb = this.f43342;
                    c15252 = this.f43345;
                    switch (cM27054) {
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
                            if (m27065()) {
                                mo14465();
                            }
                            break;
                        default:
                            switch (cM27054) {
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
                                    switch (cM27054) {
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
                                            switch (cM27054) {
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
                                                    if (m27069()) {
                                                        zIsJavaIdentifierPart = false;
                                                    } else if (Character.isIdentifierIgnorable(m27054())) {
                                                        mo14465();
                                                    } else if (m27064()) {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m27066());
                                                    } else {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m27054());
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
                mo14465();
            }
            m33428();
        }
        AbstractC19728 abstractC19728M51194 = c15252.f49864.m51194(sb.toString());
        this.f43351 = abstractC19728M51194;
        this.f43352 = c14177.m34466(abstractC19728M51194);
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
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C8957 m33426() {
        int iM27053;
        C11040 c11040;
        int iM27054;
        int iM27055;
        EnumC7466 enumC7466;
        EnumC2991 enumC2991;
        String string;
        EnumC19876 enumC19876;
        HashSet hashSetM3120;
        boolean zContains;
        C7312 c7312;
        boolean z;
        String string2;
        EnumC8212 enumC8212;
        InterfaceC19399 interfaceC19399Mo31479;
        StringBuilder sb = this.f43342;
        boolean z2 = false;
        sb.setLength(0);
        this.f43351 = null;
        this.f43354 = 0;
        this.f43347 = false;
        this.f43349 = false;
        C14769 c14769M35552 = null;
        while (true) {
            int iM27056 = m27053();
            char cM27054 = m27054();
            if (cM27054 != '\t') {
                if (cM27054 == '\n') {
                    mo14465();
                } else if (cM27054 != '\f') {
                    if (cM27054 == '\r') {
                        mo14465();
                        m27056('\n');
                    } else if (cM27054 != ' ') {
                        if (cM27054 != '\"') {
                            if (cM27054 != '$') {
                                if (cM27054 == ',') {
                                    mo14465();
                                    this.f43352 = EnumC7466.f24672;
                                } else if (cM27054 == ';') {
                                    mo14465();
                                    this.f43352 = EnumC7466.f24712;
                                } else if (cM27054 == ']') {
                                    mo14465();
                                    this.f43352 = EnumC7466.f24625;
                                } else if (cM27054 != '_') {
                                    if (cM27054 != '}') {
                                        switch (cM27054) {
                                            case '\'':
                                                mo14465();
                                                if (!m27056('\'')) {
                                                    if (m27057('\n', '\r')) {
                                                        m33425(iM27056, C22843.f74091);
                                                    }
                                                    m33416();
                                                    if (!m27056('\'')) {
                                                        m33425(iM27056, C22843.f74127);
                                                    } else {
                                                        this.f43352 = EnumC7466.f24653;
                                                    }
                                                } else {
                                                    m33425(iM27056, C22843.f74101);
                                                }
                                                break;
                                            case '(':
                                                mo14465();
                                                this.f43352 = EnumC7466.f24668;
                                                break;
                                            case ')':
                                                mo14465();
                                                this.f43352 = EnumC7466.f24654;
                                                break;
                                            default:
                                                boolean z3 = true;
                                                switch (cM27054) {
                                                    case '.':
                                                        if (!m27058("...")) {
                                                            mo14465();
                                                            int iM27057 = m27053();
                                                            if (m27056('.')) {
                                                                m33425(iM27057, C22843.f74081);
                                                            } else if (m27055(10) < 0) {
                                                                this.f43352 = EnumC7466.f24708;
                                                            } else {
                                                                m33430('.');
                                                                m33422(iM27056);
                                                            }
                                                        } else {
                                                            sb.append("...");
                                                            this.f43352 = EnumC7466.f24695;
                                                        }
                                                        break;
                                                    case '/':
                                                        mo14465();
                                                        if (m27056('/')) {
                                                            while (m27065() && !m27057('\r', '\n')) {
                                                                mo14465();
                                                            }
                                                            if (m27065()) {
                                                                interfaceC19399Mo31479 = mo31479(iM27056, m27053(), EnumC8212.LINE);
                                                                if (c14769M35552 != null) {
                                                                }
                                                            }
                                                        } else if (m27056('*')) {
                                                            if (m27056('*')) {
                                                                enumC8212 = EnumC8212.JAVADOC;
                                                                if (!m27060('/')) {
                                                                }
                                                                if (!z3) {
                                                                    while (m27065()) {
                                                                        if (m27056('*')) {
                                                                            mo14465();
                                                                        } else if (m27060('/')) {
                                                                        }
                                                                    }
                                                                }
                                                                if (m27056('/')) {
                                                                    m33425(iM27056, C22843.f74061);
                                                                } else {
                                                                    interfaceC19399Mo31479 = mo31479(iM27056, m27053(), enumC8212);
                                                                    c14769M35552 = c14769M35552 == null ? c14769M35552.m35552(interfaceC19399Mo31479) : C14769.of((Object) interfaceC19399Mo31479);
                                                                }
                                                            } else {
                                                                enumC8212 = EnumC8212.BLOCK;
                                                            }
                                                            z3 = false;
                                                            if (!z3) {
                                                                while (m27065()) {
                                                                    if (m27056('*')) {
                                                                        mo14465();
                                                                    } else if (m27060('/')) {
                                                                    }
                                                                }
                                                            }
                                                            if (m27056('/')) {
                                                                m33425(iM27056, C22843.f74061);
                                                            } else {
                                                                interfaceC19399Mo31479 = mo31479(iM27056, m27053(), enumC8212);
                                                                if (c14769M35552 == null) {
                                                                }
                                                            }
                                                            break;
                                                        } else if (!m27056(a.h)) {
                                                            this.f43352 = EnumC7466.f24679;
                                                        } else {
                                                            this.f43352 = EnumC7466.f24673;
                                                        }
                                                        break;
                                                    case '0':
                                                        mo14465();
                                                        if (m27057('x', 'X')) {
                                                            mo14465();
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (!z) {
                                                            if (m27057('b', 'B')) {
                                                                mo14465();
                                                                z2 = true;
                                                            }
                                                            if (!z2) {
                                                                m33430('0');
                                                                if (m27060('_')) {
                                                                    int iM27058 = m27053();
                                                                    while (m27056('_')) {
                                                                    }
                                                                    if (m27055(10) < 0) {
                                                                        m33425(iM27058, C22843.f74193);
                                                                    }
                                                                }
                                                                m33421(iM27056, 8);
                                                            } else {
                                                                m33420();
                                                                m33421(iM27056, 2);
                                                            }
                                                        } else {
                                                            m33420();
                                                            m33421(iM27056, 16);
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
                                                        m33421(iM27056, 10);
                                                        break;
                                                    default:
                                                        switch (cM27054) {
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
                                                                mo14465();
                                                                this.f43352 = EnumC7466.f24629;
                                                                break;
                                                            default:
                                                                switch (cM27054) {
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
                                                                        mo14465();
                                                                        this.f43352 = EnumC7466.f24658;
                                                                        break;
                                                                    default:
                                                                        if (!m33419(m27054())) {
                                                                            if (m27069() ? false : m27064() ? Character.isJavaIdentifierStart(m27066()) : Character.isJavaIdentifierStart(m27054())) {
                                                                                m33423();
                                                                            } else if (m27055(10) >= 0) {
                                                                                m33421(iM27056, 10);
                                                                            } else if (!m27060((char) 26) && m27065()) {
                                                                                if (m27064()) {
                                                                                    int iM27066 = m27066();
                                                                                    string2 = String.format("\\u%04x\\u%04x", Integer.valueOf(Character.highSurrogate(iM27066)), Integer.valueOf(Character.lowSurrogate(iM27066)));
                                                                                } else {
                                                                                    char cM27055 = m27054();
                                                                                    if (' ' >= cM27055 || cM27055 >= 127) {
                                                                                        string2 = String.format("\\u%04x", Integer.valueOf(cM27055));
                                                                                    } else {
                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                        sb2.append(cM27055);
                                                                                        string2 = sb2.toString();
                                                                                    }
                                                                                }
                                                                                C11040 c11041 = C22843.f74058;
                                                                                m33425(iM27056, new C11040("compiler", "illegal.char", string2));
                                                                                mo14465();
                                                                            } else {
                                                                                this.f43352 = EnumC7466.f24635;
                                                                                iM27054 = m27053();
                                                                            }
                                                                        } else {
                                                                            do {
                                                                                m33427();
                                                                                EnumC7466 enumC7466M34465 = this.f43350.m34465(sb.toString());
                                                                                if (enumC7466M34465 == EnumC7466.f24655) {
                                                                                    sb.setLength(sb.length() - 1);
                                                                                } else {
                                                                                    this.f43352 = enumC7466M34465;
                                                                                    mo14465();
                                                                                }
                                                                            } while (m33419(m27054()));
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        iM27055 = m27053();
                                        enumC7466 = this.f43352;
                                        enumC2991 = enumC7466.f24715;
                                        if (enumC2991 == EnumC2991.DEFAULT) {
                                            return new C8957(enumC7466, iM27054, iM27055, c14769M35552);
                                        }
                                        if (enumC2991 == EnumC2991.NAMED) {
                                            return new C10448(enumC7466, iM27054, iM27055, this.f43351, c14769M35552);
                                        }
                                        string = sb.toString();
                                        if (this.f43347) {
                                            if (this.f43349) {
                                                string = C0547.m2543(string);
                                            }
                                            String str = string;
                                            EnumC7466 enumC7467 = this.f43352;
                                            if (enumC7467.f24715 == EnumC2991.STRING) {
                                            }
                                        }
                                        enumC19876 = EnumC19876.TEXT_BLOCKS;
                                        if (this.f43353.m36878(enumC19876)) {
                                            hashSetM3120 = C0754.m3120(string);
                                            zContains = hashSetM3120.contains(EnumC18653.INCONSISTENT);
                                            c7312 = this.f43341;
                                            if (zContains) {
                                                c7312.m34532(enumC19876, new C2092(iM27054), C13146.f42047);
                                            }
                                            if (hashSetM3120.contains(EnumC18653.TRAILING)) {
                                                c7312.m34532(enumC19876, new C2092(iM27054), C13146.f42053);
                                            }
                                        }
                                        try {
                                            string = C0547.m2544(string);
                                        } catch (Exception unused) {
                                        }
                                        if (this.f43349) {
                                            try {
                                                string = C0547.m2543(string);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        String str2 = string;
                                        EnumC7466 enumC7468 = this.f43352;
                                        return enumC7468.f24715 == EnumC2991.STRING ? new C9702(enumC7468, iM27054, iM27055, str2, c14769M35552) : new C1500(enumC7468, iM27054, iM27055, str2, this.f43354, c14769M35552);
                                        throw th;
                                    }
                                    mo14465();
                                    this.f43352 = EnumC7466.f24660;
                                }
                            }
                            m33423();
                        } else {
                            this.f43352 = EnumC7466.f24628;
                            boolean zM27058 = m27058("\"\"\"");
                            this.f43347 = zM27058;
                            int i = this.f43344;
                            if (zM27058) {
                                m33424(iM27056, EnumC3666.f12571);
                                m27062();
                                if (m27057('\n', '\r')) {
                                    m27056('\r');
                                    m27056('\n');
                                    iM27053 = i;
                                    while (true) {
                                        if (!m27065()) {
                                            if (this.f43347) {
                                                c11040 = C22843.f74103;
                                            } else {
                                                c11040 = C22843.f74186;
                                            }
                                            m33425(iM27056, c11040);
                                            if (iM27053 != i) {
                                                m27067(iM27053);
                                            }
                                        } else if (!m27058("\"\"\"")) {
                                            if (m27057('\n', '\r')) {
                                                m27056('\r');
                                                m27056('\n');
                                                m33430('\n');
                                                if (iM27053 == i) {
                                                    iM27053 = m27053();
                                                }
                                            } else {
                                                m33416();
                                            }
                                        }
                                    }
                                } else {
                                    m33425(m27053(), C22843.f74104);
                                }
                            } else {
                                mo14465();
                                while (true) {
                                    if (m27065()) {
                                        if (!m27056('\"')) {
                                            if (!m27057('\n', '\r')) {
                                                m33416();
                                            }
                                        }
                                    }
                                    iM27053 = i;
                                    if (this.f43347) {
                                        c11040 = C22843.f74103;
                                    } else {
                                        c11040 = C22843.f74186;
                                    }
                                    m33425(iM27056, c11040);
                                    if (iM27053 != i) {
                                        m27067(iM27053);
                                    }
                                }
                            }
                        }
                        iM27054 = iM27056;
                        iM27055 = m27053();
                        enumC7466 = this.f43352;
                        enumC2991 = enumC7466.f24715;
                        if (enumC2991 == EnumC2991.DEFAULT) {
                            return new C8957(enumC7466, iM27054, iM27055, c14769M35552);
                        }
                        if (enumC2991 == EnumC2991.NAMED) {
                            return new C10448(enumC7466, iM27054, iM27055, this.f43351, c14769M35552);
                        }
                        string = sb.toString();
                        if (this.f43347) {
                            if (this.f43349) {
                                string = C0547.m2543(string);
                            }
                            String str3 = string;
                            EnumC7466 enumC7469 = this.f43352;
                            if (enumC7469.f24715 == EnumC2991.STRING) {
                            }
                        }
                        enumC19876 = EnumC19876.TEXT_BLOCKS;
                        if (this.f43353.m36878(enumC19876)) {
                            hashSetM3120 = C0754.m3120(string);
                            zContains = hashSetM3120.contains(EnumC18653.INCONSISTENT);
                            c7312 = this.f43341;
                            if (zContains) {
                                c7312.m34532(enumC19876, new C2092(iM27054), C13146.f42047);
                            }
                            if (hashSetM3120.contains(EnumC18653.TRAILING)) {
                                c7312.m34532(enumC19876, new C2092(iM27054), C13146.f42053);
                            }
                        }
                        string = C0547.m2544(string);
                        if (this.f43349) {
                            string = C0547.m2543(string);
                        }
                        String str4 = string;
                        EnumC7466 enumC74610 = this.f43352;
                        if (enumC74610.f24715 == EnumC2991.STRING) {
                        }
                        throw th;
                    }
                }
            }
            m27062();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC19399 mo31479(int i, int i2, EnumC8212 enumC8212) {
        return new C6941(enumC8212, this.f43348, m27059(i, i2), i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC1829 mo31480() {
        return C16744.m39520(m27061(), m27063(), false);
    }
}
