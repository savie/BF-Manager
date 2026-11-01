package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21062 extends AbstractC16829 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10480[] f68607;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C10480 f68610;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68611;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f68612;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f68613;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7657 f68614;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public List f68615;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2460 f68606 = new C2460();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11634 f68609 = new C11634();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f68608 = -1;

    @Override // l.InterfaceC10388
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo14() {
    }

    public C21062(int i, List list) {
        this.f68613 = i == -1 ? 1 : i;
        if (list != null) {
            int i2 = C2419.f9699;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f68607 = new C10480[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f68607[i3] = new C10480();
        }
        this.f68610 = this.f68607[0];
    }

    @Override // l.AbstractC16829, l.InterfaceC10388
    public final void flush() {
        super.flush();
        this.f68615 = null;
        this.f68612 = null;
        this.f68611 = 0;
        this.f68610 = this.f68607[0];
        m47470();
        this.f68614 = null;
    }

    @Override // l.AbstractC16829
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo21896() {
        return this.f68615 != this.f68612;
    }

    @Override // l.AbstractC16829
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC9753 mo21897() {
        List list = this.f68615;
        this.f68612 = list;
        list.getClass();
        return new C12596(list);
    }

    @Override // l.AbstractC16829
    /* JADX INFO: renamed from: ۙ */
    public final void mo21898(C2717 c2717) {
        ByteBuffer byteBuffer = c2717.f51912;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C2460 c2460 = this.f68606;
        c2460.m7508(iLimit, bArrArray);
        while (c2460.m7503() >= 3) {
            int iM7516 = c2460.m7516();
            int i = iM7516 & 3;
            boolean z = (iM7516 & 4) == 4;
            byte bM7516 = (byte) c2460.m7516();
            byte bM7517 = (byte) c2460.m7516();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m47471();
                        int i2 = (bM7516 & 192) >> 6;
                        int i3 = this.f68608;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m47470();
                            C0303.m1848("Sequence number discontinuity. previous=" + this.f68608 + " current=" + i2);
                        }
                        this.f68608 = i2;
                        int i4 = bM7516 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C7657 c7657 = new C7657(i2, i4);
                        this.f68614 = c7657;
                        c7657.f25310 = 1;
                        c7657.f25312[0] = bM7517;
                    } else {
                        C2023.m6507(i == 2);
                        C7657 c7658 = this.f68614;
                        if (c7658 == null) {
                            C0303.m1853("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c7658.f25312;
                            int i5 = c7658.f25310;
                            int i6 = i5 + 1;
                            c7658.f25310 = i6;
                            bArr[i5] = bM7516;
                            c7658.f25310 = i5 + 2;
                            bArr[i6] = bM7517;
                        }
                    }
                    C7657 c7659 = this.f68614;
                    if (c7659.f25310 == (c7659.f25311 * 2) - 1) {
                        m47471();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0487  */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m47471() {
        String str;
        String str2;
        C7657 c7657 = this.f68614;
        if (c7657 == null) {
            return;
        }
        if (c7657.f25310 != (c7657.f25311 * 2) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.f68614.f25311 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.f68614.f25310);
            sb.append(" (sequence number ");
            sb.append(this.f68614.f25309);
            sb.append(");");
            C0303.m1849(sb.toString());
        }
        C7657 c7658 = this.f68614;
        byte[] bArr = c7658.f25312;
        int i = c7658.f25310;
        C11634 c11634 = this.f68609;
        c11634.m29038(i, bArr);
        boolean z = false;
        while (c11634.m29030() > 0) {
            int iM29039 = c11634.m29039(3);
            int iM290310 = c11634.m29039(5);
            if (iM29039 == 7) {
                c11634.m29034(2);
                iM29039 = c11634.m29039(6);
                if (iM29039 < 7) {
                    C7309.m19506(iM29039, "Invalid extended service number: ");
                }
            }
            if (iM290310 == 0) {
                if (iM29039 != 0) {
                    C0303.m1848("serviceNumber is non-zero (" + iM29039 + ") when blockSize is 0");
                }
                if (z) {
                    this.f68615 = m47469();
                }
                this.f68614 = null;
            }
            if (iM29039 != this.f68613) {
                c11634.m29043(iM290310);
            } else {
                int iM29028 = (iM290310 * 8) + c11634.m29028();
                while (c11634.m29028() < iM29028) {
                    int iM290311 = c11634.m29039(8);
                    if (iM290311 != 16) {
                        if (iM290311 > 31) {
                            if (iM290311 <= 127) {
                                if (iM290311 == 127) {
                                    this.f68610.m26597((char) 9835);
                                } else {
                                    this.f68610.m26597((char) (iM290311 & 255));
                                }
                            } else if (iM290311 <= 159) {
                                C10480[] c10480Arr = this.f68607;
                                switch (iM290311) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i2 = iM290311 + a.g;
                                        if (this.f68611 != i2) {
                                            this.f68611 = i2;
                                            this.f68610 = c10480Arr[i2];
                                        }
                                        break;
                                    case 136:
                                        for (int i3 = 1; i3 <= 8; i3++) {
                                            if (c11634.m29035()) {
                                                c10480Arr[8 - i3].m26595();
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i4 = 1; i4 <= 8; i4++) {
                                            if (c11634.m29035()) {
                                                c10480Arr[8 - i4].m26600(true);
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (c11634.m29035()) {
                                                c10480Arr[8 - i5].m26600(false);
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (c11634.m29035()) {
                                                C10480 c10480 = c10480Arr[8 - i6];
                                                c10480.m26600(!c10480.m26594());
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (c11634.m29035()) {
                                                c10480Arr[8 - i7].m26605();
                                            }
                                        }
                                        break;
                                    case 141:
                                        c11634.m29034(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        m47470();
                                        break;
                                    case 144:
                                        if (this.f68610.m26603()) {
                                            c11634.m29039(4);
                                            c11634.m29039(2);
                                            c11634.m29039(2);
                                            boolean zM29035 = c11634.m29035();
                                            boolean zM29036 = c11634.m29035();
                                            c11634.m29039(3);
                                            c11634.m29039(3);
                                            this.f68610.m26602(zM29035, zM29036);
                                        } else {
                                            c11634.m29034(16);
                                        }
                                        break;
                                    case 145:
                                        if (this.f68610.m26603()) {
                                            int iM26593 = C10480.m26593(c11634.m29039(2), c11634.m29039(2), c11634.m29039(2), c11634.m29039(2));
                                            int iM26594 = C10480.m26593(c11634.m29039(2), c11634.m29039(2), c11634.m29039(2), c11634.m29039(2));
                                            c11634.m29034(2);
                                            C10480.m26593(c11634.m29039(2), c11634.m29039(2), c11634.m29039(2), 0);
                                            this.f68610.m26599(iM26593, iM26594);
                                        } else {
                                            c11634.m29034(24);
                                        }
                                        break;
                                    case 146:
                                        if (this.f68610.m26603()) {
                                            c11634.m29034(4);
                                            int iM290312 = c11634.m29039(4);
                                            c11634.m29034(2);
                                            c11634.m29039(6);
                                            this.f68610.m26598(iM290312);
                                        } else {
                                            c11634.m29034(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        str2 = "Invalid C1 command: ";
                                        C7309.m19506(iM290311, str2);
                                        break;
                                    case 151:
                                        if (this.f68610.m26603()) {
                                            int iM26595 = C10480.m26593(c11634.m29039(2), c11634.m29039(2), c11634.m29039(2), c11634.m29039(2));
                                            c11634.m29039(2);
                                            C10480.m26593(c11634.m29039(2), c11634.m29039(2), c11634.m29039(2), 0);
                                            c11634.m29035();
                                            c11634.m29035();
                                            c11634.m29039(2);
                                            c11634.m29039(2);
                                            int iM290313 = c11634.m29039(2);
                                            c11634.m29034(8);
                                            this.f68610.m26607(iM26595, iM290313);
                                        } else {
                                            c11634.m29034(32);
                                        }
                                        break;
                                    case 152:
                                    case 153:
                                    case EnumC2300.f8185 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i8 = iM290311 - 152;
                                        C10480 c10481 = c10480Arr[i8];
                                        c11634.m29034(2);
                                        boolean zM29037 = c11634.m29035();
                                        c11634.m29034(2);
                                        int iM290314 = c11634.m29039(3);
                                        boolean zM29038 = c11634.m29035();
                                        int iM290315 = c11634.m29039(7);
                                        int iM290316 = c11634.m29039(8);
                                        int iM290317 = c11634.m29039(4);
                                        int iM290318 = c11634.m29039(4);
                                        c11634.m29034(2);
                                        c11634.m29034(6);
                                        c11634.m29034(2);
                                        c10481.m26601(zM29037, iM290314, zM29038, iM290315, iM290316, iM290318, iM290317, c11634.m29039(3), c11634.m29039(3));
                                        if (this.f68611 != i8) {
                                            this.f68611 = i8;
                                            this.f68610 = c10480Arr[i8];
                                        }
                                        break;
                                }
                            } else if (iM290311 <= 255) {
                                this.f68610.m26597((char) (iM290311 & 255));
                            } else {
                                str = "Invalid base command: ";
                            }
                            z = true;
                        } else if (iM290311 != 0) {
                            if (iM290311 == 3) {
                                this.f68615 = m47469();
                            } else if (iM290311 != 8) {
                                switch (iM290311) {
                                    case 12:
                                        m47470();
                                        break;
                                    case 13:
                                        this.f68610.m26597('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iM290311 >= 17 && iM290311 <= 23) {
                                            C0303.m1848("Currently unsupported COMMAND_EXT1 Command: " + iM290311);
                                            c11634.m29034(8);
                                        } else if (iM290311 < 24 || iM290311 > 31) {
                                            str = "Invalid C0 command: ";
                                        } else {
                                            C0303.m1848("Currently unsupported COMMAND_P16 Command: " + iM290311);
                                            c11634.m29034(16);
                                        }
                                        break;
                                }
                            } else {
                                this.f68610.m26596();
                            }
                        }
                        C7309.m19506(iM290311, str);
                    } else {
                        iM290311 = c11634.m29039(8);
                        if (iM290311 > 31) {
                            if (iM290311 <= 127) {
                                if (iM290311 == 32) {
                                    this.f68610.m26597(' ');
                                } else if (iM290311 == 33) {
                                    this.f68610.m26597((char) 160);
                                } else if (iM290311 == 37) {
                                    this.f68610.m26597((char) 8230);
                                } else if (iM290311 == 42) {
                                    this.f68610.m26597((char) 352);
                                } else if (iM290311 == 44) {
                                    this.f68610.m26597((char) 338);
                                } else if (iM290311 == 63) {
                                    this.f68610.m26597((char) 376);
                                } else if (iM290311 == 57) {
                                    this.f68610.m26597((char) 8482);
                                } else if (iM290311 == 58) {
                                    this.f68610.m26597((char) 353);
                                } else if (iM290311 == 60) {
                                    this.f68610.m26597((char) 339);
                                } else if (iM290311 != 61) {
                                    switch (iM290311) {
                                        case 48:
                                            this.f68610.m26597((char) 9608);
                                            break;
                                        case 49:
                                            this.f68610.m26597((char) 8216);
                                            break;
                                        case 50:
                                            this.f68610.m26597((char) 8217);
                                            break;
                                        case 51:
                                            this.f68610.m26597((char) 8220);
                                            break;
                                        case 52:
                                            this.f68610.m26597((char) 8221);
                                            break;
                                        case 53:
                                            this.f68610.m26597((char) 8226);
                                            break;
                                        default:
                                            switch (iM290311) {
                                                case 118:
                                                    this.f68610.m26597((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f68610.m26597((char) 8540);
                                                    break;
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                    this.f68610.m26597((char) 8541);
                                                    break;
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                    this.f68610.m26597((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f68610.m26597(UMLog.HORIZONTAL_LINE);
                                                    break;
                                                case 123:
                                                    this.f68610.m26597((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f68610.m26597(UMLog.BOTTOM_LEFT_CORNER);
                                                    break;
                                                case q.h /* 125 */:
                                                    this.f68610.m26597((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f68610.m26597((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f68610.m26597(UMLog.TOP_LEFT_CORNER);
                                                    break;
                                                default:
                                                    str2 = "Invalid G2 character: ";
                                                    C7309.m19506(iM290311, str2);
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f68610.m26597((char) 8480);
                                }
                            } else if (iM290311 <= 159) {
                                if (iM290311 <= 135) {
                                    c11634.m29034(32);
                                } else if (iM290311 <= 143) {
                                    c11634.m29034(40);
                                } else if (iM290311 <= 159) {
                                    c11634.m29034(2);
                                    c11634.m29034(c11634.m29039(6) * 8);
                                }
                            } else if (iM290311 > 255) {
                                str = "Invalid extended command: ";
                                C7309.m19506(iM290311, str);
                            } else if (iM290311 == 160) {
                                this.f68610.m26597((char) 13252);
                            } else {
                                C7309.m19506(iM290311, "Invalid G3 character: ");
                                this.f68610.m26597('_');
                            }
                            z = true;
                        } else if (iM290311 > 7) {
                            if (iM290311 <= 15) {
                                c11634.m29034(8);
                            } else if (iM290311 <= 23) {
                                c11634.m29034(16);
                            } else if (iM290311 <= 31) {
                                c11634.m29034(24);
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            this.f68615 = m47469();
        }
        this.f68614 = null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private List m47469() {
        C9069 c9069M26606;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C10480[] c10480Arr = this.f68607;
            if (!c10480Arr[i].m26608() && c10480Arr[i].m26594() && (c9069M26606 = c10480Arr[i].m26606()) != null) {
                arrayList.add(c9069M26606);
            }
        }
        Collections.sort(arrayList, C9069.f30924);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C9069) arrayList.get(i2)).f30925);
        }
        return C0561.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m47470() {
        for (int i = 0; i < 8; i++) {
            this.f68607[i].m26605();
        }
    }
}
