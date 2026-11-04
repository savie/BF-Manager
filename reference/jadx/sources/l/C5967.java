package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5967 extends AbstractC17153 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15661[] f20438;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f20439;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15661 f20440;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13424 f20441;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f20442;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f20443;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f20444;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21287 f20435 = new C21287();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14573 f20437 = new C14573();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f20436 = -1;

    @Override // l.InterfaceC19860
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo12() {
    }

    public C5967(int i, List list) {
        this.f20442 = i == -1 ? 1 : i;
        if (list != null) {
            int i2 = C21528.f68786;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f20438 = new C15661[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f20438[i3] = new C15661();
        }
        this.f20440 = this.f20438[0];
    }

    @Override // l.AbstractC17153, l.InterfaceC19860
    public final void flush() {
        super.flush();
        this.f20444 = null;
        this.f20443 = null;
        this.f20439 = 0;
        this.f20440 = this.f20438[0];
        m17373();
        this.f20441 = null;
    }

    @Override // l.AbstractC17153
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo17375() {
        return this.f20444 != this.f20443;
    }

    @Override // l.AbstractC17153
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC24393 mo17376() {
        List list = this.f20444;
        this.f20443 = list;
        list.getClass();
        return new C17899(list);
    }

    @Override // l.AbstractC17153
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17374(C0526 c0526) {
        ByteBuffer byteBuffer = c0526.f19651;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C21287 c21287 = this.f20435;
        c21287.m48491(iLimit, bArrArray);
        while (c21287.m48486() >= 3) {
            int iM48493 = c21287.m48493();
            int i = iM48493 & 3;
            boolean z = (iM48493 & 4) == 4;
            byte bM48493 = (byte) c21287.m48493();
            byte bM48494 = (byte) c21287.m48493();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m17372();
                        int i2 = (bM48493 & 192) >> 6;
                        int i3 = this.f20436;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m17373();
                            C1896.m6517("Sequence number discontinuity. previous=" + this.f20436 + " current=" + i2);
                        }
                        this.f20436 = i2;
                        int i4 = bM48493 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C13424 c13424 = new C13424(i2, i4);
                        this.f20441 = c13424;
                        c13424.f42750 = 1;
                        c13424.f42752[0] = bM48494;
                    } else {
                        C20782.m47565(i == 2);
                        C13424 c13425 = this.f20441;
                        if (c13425 == null) {
                            C1896.m6515("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c13425.f42752;
                            int i5 = c13425.f42750;
                            int i6 = i5 + 1;
                            c13425.f42750 = i6;
                            bArr[i5] = bM48493;
                            c13425.f42750 = i5 + 2;
                            bArr[i6] = bM48494;
                        }
                    }
                    C13424 c13426 = this.f20441;
                    if (c13426.f42750 == (c13426.f42751 * 2) - 1) {
                        m17372();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0487  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m17372() {
        String str;
        String str2;
        C13424 c13424 = this.f20441;
        if (c13424 == null) {
            return;
        }
        if (c13424.f42750 != (c13424.f42751 * 2) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.f20441.f42751 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.f20441.f42750);
            sb.append(" (sequence number ");
            sb.append(this.f20441.f42753);
            sb.append(");");
            C1896.m6511(sb.toString());
        }
        C13424 c13425 = this.f20441;
        byte[] bArr = c13425.f42752;
        int i = c13425.f42750;
        C14573 c14573 = this.f20437;
        c14573.m35158(i, bArr);
        boolean z = false;
        while (c14573.m35152() > 0) {
            int iM35163 = c14573.m35163(3);
            int iM35164 = c14573.m35163(5);
            if (iM35163 == 7) {
                c14573.m35161(2);
                iM35163 = c14573.m35163(6);
                if (iM35163 < 7) {
                    j$$ExternalSyntheticOutline0.m(iM35163, "Invalid extended service number: ");
                }
            }
            if (iM35164 == 0) {
                if (iM35163 != 0) {
                    C1896.m6517("serviceNumber is non-zero (" + iM35163 + ") when blockSize is 0");
                }
                if (z) {
                    this.f20444 = m17371();
                }
                this.f20441 = null;
            }
            if (iM35163 != this.f20442) {
                c14573.m35160(iM35164);
            } else {
                int iM35166 = (iM35164 * 8) + c14573.m35166();
                while (c14573.m35166() < iM35166) {
                    int iM35165 = c14573.m35163(8);
                    if (iM35165 != 16) {
                        if (iM35165 > 31) {
                            if (iM35165 <= 127) {
                                if (iM35165 == 127) {
                                    this.f20440.m37414((char) 9835);
                                } else {
                                    this.f20440.m37414((char) (iM35165 & 255));
                                }
                            } else if (iM35165 <= 159) {
                                C15661[] c15661Arr = this.f20438;
                                switch (iM35165) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i2 = iM35165 + a.g;
                                        if (this.f20439 != i2) {
                                            this.f20439 = i2;
                                            this.f20440 = c15661Arr[i2];
                                        }
                                        break;
                                    case 136:
                                        for (int i3 = 1; i3 <= 8; i3++) {
                                            if (c14573.m35162()) {
                                                c15661Arr[8 - i3].m37427();
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i4 = 1; i4 <= 8; i4++) {
                                            if (c14573.m35162()) {
                                                c15661Arr[8 - i4].m37417(true);
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (c14573.m35162()) {
                                                c15661Arr[8 - i5].m37417(false);
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (c14573.m35162()) {
                                                C15661 c15661 = c15661Arr[8 - i6];
                                                c15661.m37417(!c15661.m37422());
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (c14573.m35162()) {
                                                c15661Arr[8 - i7].m37420();
                                            }
                                        }
                                        break;
                                    case 141:
                                        c14573.m35161(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        m17373();
                                        break;
                                    case 144:
                                        if (this.f20440.m37424()) {
                                            c14573.m35163(4);
                                            c14573.m35163(2);
                                            c14573.m35163(2);
                                            boolean zM35162 = c14573.m35162();
                                            boolean zM35163 = c14573.m35162();
                                            c14573.m35163(3);
                                            c14573.m35163(3);
                                            this.f20440.m37419(zM35162, zM35163);
                                        } else {
                                            c14573.m35161(16);
                                        }
                                        break;
                                    case 145:
                                        if (this.f20440.m37424()) {
                                            int iM37412 = C15661.m37412(c14573.m35163(2), c14573.m35163(2), c14573.m35163(2), c14573.m35163(2));
                                            int iM37413 = C15661.m37412(c14573.m35163(2), c14573.m35163(2), c14573.m35163(2), c14573.m35163(2));
                                            c14573.m35161(2);
                                            C15661.m37412(c14573.m35163(2), c14573.m35163(2), c14573.m35163(2), 0);
                                            this.f20440.m37416(iM37412, iM37413);
                                        } else {
                                            c14573.m35161(24);
                                        }
                                        break;
                                    case 146:
                                        if (this.f20440.m37424()) {
                                            c14573.m35161(4);
                                            int iM35167 = c14573.m35163(4);
                                            c14573.m35161(2);
                                            c14573.m35163(6);
                                            this.f20440.m37415(iM35167);
                                        } else {
                                            c14573.m35161(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        str2 = "Invalid C1 command: ";
                                        j$$ExternalSyntheticOutline0.m(iM35165, str2);
                                        break;
                                    case 151:
                                        if (this.f20440.m37424()) {
                                            int iM37414 = C15661.m37412(c14573.m35163(2), c14573.m35163(2), c14573.m35163(2), c14573.m35163(2));
                                            c14573.m35163(2);
                                            C15661.m37412(c14573.m35163(2), c14573.m35163(2), c14573.m35163(2), 0);
                                            c14573.m35162();
                                            c14573.m35162();
                                            c14573.m35163(2);
                                            c14573.m35163(2);
                                            int iM35168 = c14573.m35163(2);
                                            c14573.m35161(8);
                                            this.f20440.m37426(iM37414, iM35168);
                                        } else {
                                            c14573.m35161(32);
                                        }
                                        break;
                                    case 152:
                                    case 153:
                                    case EnumC24309.f78687 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i8 = iM35165 - 152;
                                        C15661 c15662 = c15661Arr[i8];
                                        c14573.m35161(2);
                                        boolean zM35164 = c14573.m35162();
                                        c14573.m35161(2);
                                        int iM35169 = c14573.m35163(3);
                                        boolean zM35165 = c14573.m35162();
                                        int iM351610 = c14573.m35163(7);
                                        int iM351611 = c14573.m35163(8);
                                        int iM351612 = c14573.m35163(4);
                                        int iM351613 = c14573.m35163(4);
                                        c14573.m35161(2);
                                        c14573.m35161(6);
                                        c14573.m35161(2);
                                        c15662.m37418(zM35164, iM35169, zM35165, iM351610, iM351611, iM351613, iM351612, c14573.m35163(3), c14573.m35163(3));
                                        if (this.f20439 != i8) {
                                            this.f20439 = i8;
                                            this.f20440 = c15661Arr[i8];
                                        }
                                        break;
                                }
                            } else if (iM35165 <= 255) {
                                this.f20440.m37414((char) (iM35165 & 255));
                            } else {
                                str = "Invalid base command: ";
                            }
                            z = true;
                        } else if (iM35165 != 0) {
                            if (iM35165 == 3) {
                                this.f20444 = m17371();
                            } else if (iM35165 != 8) {
                                switch (iM35165) {
                                    case 12:
                                        m17373();
                                        break;
                                    case 13:
                                        this.f20440.m37414('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iM35165 >= 17 && iM35165 <= 23) {
                                            C1896.m6517("Currently unsupported COMMAND_EXT1 Command: " + iM35165);
                                            c14573.m35161(8);
                                        } else if (iM35165 < 24 || iM35165 > 31) {
                                            str = "Invalid C0 command: ";
                                        } else {
                                            C1896.m6517("Currently unsupported COMMAND_P16 Command: " + iM35165);
                                            c14573.m35161(16);
                                        }
                                        break;
                                }
                            } else {
                                this.f20440.m37413();
                            }
                        }
                        j$$ExternalSyntheticOutline0.m(iM35165, str);
                    } else {
                        iM35165 = c14573.m35163(8);
                        if (iM35165 > 31) {
                            if (iM35165 <= 127) {
                                if (iM35165 == 32) {
                                    this.f20440.m37414(' ');
                                } else if (iM35165 == 33) {
                                    this.f20440.m37414((char) 160);
                                } else if (iM35165 == 37) {
                                    this.f20440.m37414((char) 8230);
                                } else if (iM35165 == 42) {
                                    this.f20440.m37414((char) 352);
                                } else if (iM35165 == 44) {
                                    this.f20440.m37414((char) 338);
                                } else if (iM35165 == 63) {
                                    this.f20440.m37414((char) 376);
                                } else if (iM35165 == 57) {
                                    this.f20440.m37414((char) 8482);
                                } else if (iM35165 == 58) {
                                    this.f20440.m37414((char) 353);
                                } else if (iM35165 == 60) {
                                    this.f20440.m37414((char) 339);
                                } else if (iM35165 != 61) {
                                    switch (iM35165) {
                                        case 48:
                                            this.f20440.m37414((char) 9608);
                                            break;
                                        case 49:
                                            this.f20440.m37414((char) 8216);
                                            break;
                                        case 50:
                                            this.f20440.m37414((char) 8217);
                                            break;
                                        case 51:
                                            this.f20440.m37414((char) 8220);
                                            break;
                                        case 52:
                                            this.f20440.m37414((char) 8221);
                                            break;
                                        case 53:
                                            this.f20440.m37414((char) 8226);
                                            break;
                                        default:
                                            switch (iM35165) {
                                                case 118:
                                                    this.f20440.m37414((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f20440.m37414((char) 8540);
                                                    break;
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                    this.f20440.m37414((char) 8541);
                                                    break;
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                    this.f20440.m37414((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f20440.m37414(UMLog.HORIZONTAL_LINE);
                                                    break;
                                                case 123:
                                                    this.f20440.m37414((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f20440.m37414(UMLog.BOTTOM_LEFT_CORNER);
                                                    break;
                                                case q.h /* 125 */:
                                                    this.f20440.m37414((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f20440.m37414((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f20440.m37414(UMLog.TOP_LEFT_CORNER);
                                                    break;
                                                default:
                                                    str2 = "Invalid G2 character: ";
                                                    j$$ExternalSyntheticOutline0.m(iM35165, str2);
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f20440.m37414((char) 8480);
                                }
                            } else if (iM35165 <= 159) {
                                if (iM35165 <= 135) {
                                    c14573.m35161(32);
                                } else if (iM35165 <= 143) {
                                    c14573.m35161(40);
                                } else if (iM35165 <= 159) {
                                    c14573.m35161(2);
                                    c14573.m35161(c14573.m35163(6) * 8);
                                }
                            } else if (iM35165 > 255) {
                                str = "Invalid extended command: ";
                                j$$ExternalSyntheticOutline0.m(iM35165, str);
                            } else if (iM35165 == 160) {
                                this.f20440.m37414((char) 13252);
                            } else {
                                j$$ExternalSyntheticOutline0.m(iM35165, "Invalid G3 character: ");
                                this.f20440.m37414('_');
                            }
                            z = true;
                        } else if (iM35165 > 7) {
                            if (iM35165 <= 15) {
                                c14573.m35161(8);
                            } else if (iM35165 <= 23) {
                                c14573.m35161(16);
                            } else if (iM35165 <= 31) {
                                c14573.m35161(24);
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            this.f20444 = m17371();
        }
        this.f20441 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m17371() {
        C20137 c20137M37425;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C15661[] c15661Arr = this.f20438;
            if (!c15661Arr[i].m37423() && c15661Arr[i].m37422() && (c20137M37425 = c15661Arr[i].m37425()) != null) {
                arrayList.add(c20137M37425);
            }
        }
        Collections.sort(arrayList, C20137.f64715);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C20137) arrayList.get(i2)).f64716);
        }
        return C4681.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17373() {
        for (int i = 0; i < 8; i++) {
            this.f20438[i].m37420();
        }
    }
}
