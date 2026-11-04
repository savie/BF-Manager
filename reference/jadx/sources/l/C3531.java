package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayDeque;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۗܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V8RX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3531 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f12125;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f12126;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC20685 f12129;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12130;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f12128 = new byte[8];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f12131 = new ArrayDeque();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14717 f12127 = new C14717();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11557(InterfaceC20685 interfaceC20685) {
        this.f12129 = interfaceC20685;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11556() {
        this.f12126 = 0;
        this.f12131.clear();
        this.f12127.m35411();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11558(InterfaceC19502 interfaceC19502) throws C2970 {
        int i;
        String str;
        double dLongBitsToDouble;
        int iM35407;
        int iM35408;
        C20782.m47566(this.f12129);
        while (true) {
            ArrayDeque arrayDeque = this.f12131;
            C23669 c23669 = (C23669) arrayDeque.peek();
            if (c23669 != null && interfaceC19502.getPosition() >= c23669.f76764) {
                ((C12480) this.f12129).f40077.m54630(((C23669) arrayDeque.pop()).f76765);
                return true;
            }
            int i2 = this.f12126;
            C14717 c14717 = this.f12127;
            if (i2 == 0) {
                long jM35410 = c14717.m35410(interfaceC19502, true, false, 4);
                if (jM35410 == -2) {
                    interfaceC19502.mo10076();
                    while (true) {
                        byte[] bArr = this.f12128;
                        interfaceC19502.mo10069(0, 4, bArr);
                        iM35407 = C14717.m35407(bArr[0]);
                        if (iM35407 != -1 && iM35407 <= 4) {
                            iM35408 = (int) C14717.m35408(bArr, iM35407, false);
                            C24415 c24415 = ((C12480) this.f12129).f40077;
                            if (iM35408 == 357149030 || iM35408 == 524531317 || iM35408 == 475249515 || iM35408 == 374648427) {
                            }
                        }
                        interfaceC19502.mo10073(1);
                    }
                    interfaceC19502.mo10073(iM35407);
                    jM35410 = iM35408;
                }
                if (jM35410 == -1) {
                    return false;
                }
                this.f12130 = (int) jM35410;
                this.f12126 = 1;
            }
            if (this.f12126 == 1) {
                this.f12125 = c14717.m35410(interfaceC19502, false, true, 8);
                this.f12126 = 2;
            }
            InterfaceC20685 interfaceC20685 = this.f12129;
            int i3 = this.f12130;
            C24415 c24416 = ((C12480) interfaceC20685).f40077;
            switch (i3) {
                case 131:
                case 136:
                case 155:
                case 159:
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i = 3;
                    break;
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                case 166:
                case 174:
                case 183:
                case 187:
                case BERTags.FLAGS /* 224 */:
                case HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS /* 225 */:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i = 5;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                if (i == 1) {
                    long position = interfaceC19502.getPosition();
                    arrayDeque.push(new C23669(this.f12130, this.f12125 + position));
                    ((C12480) this.f12129).f40077.m54635(position, this.f12130, this.f12125);
                    this.f12126 = 0;
                    return true;
                }
                if (i == 2) {
                    long j = this.f12125;
                    if (j > 8) {
                        throw C2970.m9688("Invalid integer size: " + this.f12125, (Throwable) null);
                    }
                    ((C12480) interfaceC20685).f40077.m54633(i3, m11555(interfaceC19502, (int) j));
                    this.f12126 = 0;
                    return true;
                }
                if (i == 3) {
                    long j2 = this.f12125;
                    if (j2 > 2147483647L) {
                        throw C2970.m9688("String element size: " + this.f12125, (Throwable) null);
                    }
                    int i4 = (int) j2;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i4];
                        interfaceC19502.readFully(bArr2, 0, i4);
                        while (i4 > 0 && bArr2[i4 - 1] == 0) {
                            i4--;
                        }
                        str = new String(bArr2, 0, i4);
                    }
                    ((C12480) interfaceC20685).f40077.m54634(i3, str);
                    this.f12126 = 0;
                    return true;
                }
                if (i == 4) {
                    ((C12480) interfaceC20685).f40077.m54632(i3, (int) this.f12125, interfaceC19502);
                    this.f12126 = 0;
                    return true;
                }
                if (i == 5) {
                    long j3 = this.f12125;
                    if (j3 != 4 && j3 != 8) {
                        throw C2970.m9688("Invalid float size: " + this.f12125, (Throwable) null);
                    }
                    int i5 = (int) j3;
                    long jM11555 = m11555(interfaceC19502, i5);
                    if (i5 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jM11555);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jM11555);
                    }
                    ((C12480) interfaceC20685).f40077.m54631(i3, dLongBitsToDouble);
                    this.f12126 = 0;
                    return true;
                }
                throw C2970.m9688("Invalid element type " + i, (Throwable) null);
            }
            interfaceC19502.mo10073((int) this.f12125);
            this.f12126 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m11555(InterfaceC19502 interfaceC19502, int i) {
        byte[] bArr = this.f12128;
        interfaceC19502.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
