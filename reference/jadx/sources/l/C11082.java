package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayDeque;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۧܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8RX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11082 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f37614;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC23782 f37615;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f37616;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f37617;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f37618 = new byte[8];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f37613 = new ArrayDeque();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4918 f37612 = new C4918();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27928(InterfaceC23782 interfaceC23782) {
        this.f37615 = interfaceC23782;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27927() {
        this.f37616 = 0;
        this.f37613.clear();
        this.f37612.m13684();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27929(InterfaceC7222 interfaceC7222) throws C22861 {
        int i;
        String str;
        double dLongBitsToDouble;
        int iM13680;
        int iM13681;
        C2023.m6508(this.f37615);
        while (true) {
            ArrayDeque arrayDeque = this.f37613;
            C6142 c6142 = (C6142) arrayDeque.peek();
            if (c6142 != null && interfaceC7222.getPosition() >= c6142.f20957) {
                ((C14610) this.f37615).f47814.m24592(((C6142) arrayDeque.pop()).f20958);
                return true;
            }
            int i2 = this.f37616;
            C4918 c4918 = this.f37612;
            if (i2 == 0) {
                long jM13683 = c4918.m13683(interfaceC7222, true, false, 4);
                if (jM13683 == -2) {
                    interfaceC7222.mo19217();
                    while (true) {
                        byte[] bArr = this.f37618;
                        interfaceC7222.mo19210(0, 4, bArr);
                        iM13680 = C4918.m13680(bArr[0]);
                        if (iM13680 != -1 && iM13680 <= 4) {
                            iM13681 = (int) C4918.m13681(bArr, iM13680, false);
                            C9671 c9671 = ((C14610) this.f37615).f47814;
                            if (iM13681 == 357149030 || iM13681 == 524531317 || iM13681 == 475249515 || iM13681 == 374648427) {
                            }
                        }
                        interfaceC7222.mo19214(1);
                    }
                    interfaceC7222.mo19214(iM13680);
                    jM13683 = iM13681;
                }
                if (jM13683 == -1) {
                    return false;
                }
                this.f37617 = (int) jM13683;
                this.f37616 = 1;
            }
            if (this.f37616 == 1) {
                this.f37614 = c4918.m13683(interfaceC7222, false, true, 8);
                this.f37616 = 2;
            }
            InterfaceC23782 interfaceC23782 = this.f37615;
            int i3 = this.f37617;
            C9671 c9672 = ((C14610) interfaceC23782).f47814;
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
                    long position = interfaceC7222.getPosition();
                    arrayDeque.push(new C6142(this.f37617, this.f37614 + position));
                    ((C14610) this.f37615).f47814.m24597(position, this.f37617, this.f37614);
                    this.f37616 = 0;
                    return true;
                }
                if (i == 2) {
                    long j = this.f37614;
                    if (j > 8) {
                        throw C22861.m50610("Invalid integer size: " + this.f37614, (Throwable) null);
                    }
                    ((C14610) interfaceC23782).f47814.m24595(i3, m27926(interfaceC7222, (int) j));
                    this.f37616 = 0;
                    return true;
                }
                if (i == 3) {
                    long j2 = this.f37614;
                    if (j2 > 2147483647L) {
                        throw C22861.m50610("String element size: " + this.f37614, (Throwable) null);
                    }
                    int i4 = (int) j2;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i4];
                        interfaceC7222.readFully(bArr2, 0, i4);
                        while (i4 > 0 && bArr2[i4 - 1] == 0) {
                            i4--;
                        }
                        str = new String(bArr2, 0, i4);
                    }
                    ((C14610) interfaceC23782).f47814.m24596(i3, str);
                    this.f37616 = 0;
                    return true;
                }
                if (i == 4) {
                    ((C14610) interfaceC23782).f47814.m24594(i3, (int) this.f37614, interfaceC7222);
                    this.f37616 = 0;
                    return true;
                }
                if (i == 5) {
                    long j3 = this.f37614;
                    if (j3 != 4 && j3 != 8) {
                        throw C22861.m50610("Invalid float size: " + this.f37614, (Throwable) null);
                    }
                    int i5 = (int) j3;
                    long jM27926 = m27926(interfaceC7222, i5);
                    if (i5 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jM27926);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jM27926);
                    }
                    ((C14610) interfaceC23782).f47814.m24593(i3, dLongBitsToDouble);
                    this.f37616 = 0;
                    return true;
                }
                throw C22861.m50610("Invalid element type " + i, (Throwable) null);
            }
            interfaceC7222.mo19214((int) this.f37614);
            this.f37616 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m27926(InterfaceC7222 interfaceC7222, int i) {
        byte[] bArr = this.f37618;
        interfaceC7222.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
