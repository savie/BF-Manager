package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܳ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14792 implements InterfaceC3314, InterfaceC4913, InterfaceC11970 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f48353 = C13488.m32997(AbstractC14792.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC10601 f48354;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC14792 f48355;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48356;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f48357;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f48358;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public String f48359;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f48360;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f48361;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Exception f48362;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f48363;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f48364;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Long f48365;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f48366;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f48367;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48368;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f48369;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f48370;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f48371;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48372;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23964 f48373;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48374;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f48375;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f48376;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f48377;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48378;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f48379;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f48380;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f48381;

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: getNext, reason: merged with bridge method [inline-methods] */
    public AbstractC14792 mo9818() {
        return null;
    }

    @Override // l.InterfaceC3314
    public final int size() {
        return 0;
    }

    /* JADX INFO: renamed from: ֨ */
    public abstract int mo2724(int i, byte[] bArr);

    /* JADX INFO: renamed from: ֨ۙ */
    public boolean mo23399() {
        return this instanceof C19647;
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ۙ */
    public final void mo9817(int i) {
    }

    @Override // l.InterfaceC4913
    /* JADX INFO: renamed from: ۙ */
    public final void mo5635(InterfaceC3314 interfaceC3314) {
    }

    /* JADX INFO: renamed from: ۚ */
    public abstract int mo2725(int i, byte[] bArr);

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC3314 mo9819() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo2726(int i, byte[] bArr);

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9820(InterfaceC3314 interfaceC3314) {
        return false;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo2727(int i, byte[] bArr);

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final void mo24572(long j) {
    }

    @Override // l.InterfaceC4913
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo13670() {
        return false;
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo9822() {
        return false;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ᩷ */
    public final int mo24368() {
        return 1;
    }

    public AbstractC14792(InterfaceC10601 interfaceC10601) {
        this(interfaceC10601, (byte) 0, null);
    }

    public AbstractC14792(InterfaceC10601 interfaceC10601, byte b) {
        this(interfaceC10601, b, null);
    }

    public AbstractC14792(InterfaceC10601 interfaceC10601, byte b, String str) {
        this.f48380 = 65535;
        this.f48373 = null;
        this.f48354 = interfaceC10601;
        this.f48377 = b;
        this.f48357 = str;
        this.f48370 = (byte) 24;
        this.f48361 = ((C9895) interfaceC10601).m25053();
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ֡ */
    public final int mo24564() {
        return this.f48377;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ۚ */
    public final void mo24570(int i) {
        this.f48377 = (byte) i;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int m35447() {
        return this.f48372;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final byte m35450() {
        return this.f48370;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35444(byte b) {
        this.f48370 = b;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m35451(int i) {
        this.f48356 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35455(int i) {
        this.f48356 = i | this.f48356;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ᩹ */
    public final void mo12632() {
        m35455(4096);
    }

    @Override // l.InterfaceC9522
    public final int getErrorCode() {
        return this.f48374;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m35433(int i) {
        this.f48374 = i;
    }

    @Override // l.InterfaceC11970
    public final String getPath() {
        return this.f48357;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۠ */
    public final String mo12625() {
        return this.f48364;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۨ */
    public final String mo12627() {
        return this.f48367;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۙ */
    public final String mo12622() {
        return this.f48359;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۙ */
    public final void mo12624(String str, String str2, String str3) {
        this.f48367 = str;
        this.f48359 = str2;
        this.f48364 = str3;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ۙ */
    public final void mo12623(String str) {
        this.f48357 = str;
    }

    @Override // l.InterfaceC9666
    public final InterfaceC5619 getDigest() {
        return this.f48373;
    }

    @Override // l.InterfaceC9666
    public final C23964 getDigest() {
        return this.f48373;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public final void mo24568(InterfaceC5619 interfaceC5619) {
        this.f48373 = (C23964) interfaceC5619;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35457() {
        return this.f48381;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public final void mo24569(boolean z) {
        this.f48381 = z;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35449() {
        return this.f48378;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35453(boolean z) {
        this.f48378 = z;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo17295() {
        return this.f48379;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۧ */
    public final void mo17301() {
        this.f48379 = false;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۘ */
    public final void mo17296() {
        this.f48379 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۙ */
    public final void mo17298(Exception exc) {
        this.f48362 = exc;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۫ */
    public final void mo17302() {
        this.f48360 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public AbstractC14792 mo9821() {
        return this.f48355;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public final void mo24567(InterfaceC4913 interfaceC4913) {
        if (!(interfaceC4913 instanceof AbstractC14792)) {
            throw new IllegalArgumentException();
        }
        this.f48355 = (AbstractC14792) interfaceC4913;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۬ */
    public final long mo24367() {
        return this.f48366;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public final void mo24566(long j) {
        this.f48366 = (int) j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35434() {
        return this.f48380;
    }

    @Override // l.InterfaceC3314
    /* JADX INFO: renamed from: ۖ */
    public final void mo9816(int i) {
        this.f48380 = i;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int m35448() {
        return this.f48371;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final void mo24571(int i) {
        this.f48371 = i;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int m35436() {
        return this.f48363;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m35437(int i) {
        this.f48363 = i;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo17300() {
        return this.f48375;
    }

    @Override // l.InterfaceC9522
    public final Exception getException() {
        return this.f48362;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo17304() {
        return this.f48360;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35438() {
        return this.f48368;
    }

    @Override // l.InterfaceC14461
    /* JADX INFO: renamed from: ᩵ */
    public final void mo31361() {
        this.f48368 = true;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۖ */
    public final Long mo17294() {
        return this.f48365;
    }

    @Override // l.InterfaceC9522
    /* JADX INFO: renamed from: ۙ */
    public final void mo17299(Long l2) {
        this.f48365 = l2;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10601 m35454() {
        return this.f48354;
    }

    @Override // l.InterfaceC9666, l.InterfaceC9522
    public void reset() {
        this.f48370 = (byte) 24;
        this.f48356 = 0;
        this.f48374 = 0;
        this.f48379 = false;
        this.f48373 = null;
        this.f48371 = 0;
        this.f48380 = 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35446(int i, int i2, byte[] bArr) {
        C23964 c23964 = this.f48373;
        if (c23964 == null || this.f48374 != 0) {
            return true;
        }
        boolean zM52789 = c23964.m52789(bArr, 4, i2, this);
        this.f48375 = zM52789;
        return !zM52789;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35440(String str, int i, byte[] bArr) {
        return m35441(str, bArr, i, this.f48378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35441(String str, byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            if ((i - this.f48358) % 2 != 0) {
                i3 = i + 1;
                bArr[i] = 0;
            } else {
                i3 = i;
            }
            System.arraycopy(C10933.m27421(str), 0, bArr, i3, str.length() * 2);
            int length = (str.length() * 2) + i3;
            int i4 = length + 1;
            bArr[length] = 0;
            i2 = length + 2;
            bArr[i4] = 0;
        } else {
            byte[] bArrM27418 = C10933.m27418(str, this.f48354);
            System.arraycopy(bArrM27418, 0, bArr, i, bArrM27418.length);
            int length2 = bArrM27418.length + i;
            bArr[length2] = 0;
            i2 = length2 + 1;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m35435(int i, byte[] bArr) {
        return m35442(this.f48378, i, 255, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35442(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if ((i - this.f48358) % 2 != 0) {
                i++;
            }
            return C10933.m27419(i, C10933.m27420(i, i2, bArr), bArr);
        }
        return C10933.m27416(bArr, i, C10933.m27415(i, i2, bArr), this.f48354);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35443(byte[] bArr, int i, boolean z) {
        if (z) {
            if ((i - this.f48358) % 2 != 0) {
                i++;
            }
            return C10933.m27419(i, C10933.m27420(i, 255, bArr), bArr);
        }
        return C10933.m27416(bArr, i, C10933.m27415(i, 255, bArr), this.f48354);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35439(int i, String str) {
        int length = str.length() + 1;
        if (this.f48378) {
            int length2 = str.length() * 2;
            length = length2 + 2;
            if (i % 2 != 0) {
                return length2 + 3;
            }
        }
        return length;
    }

    @Override // l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public int mo24565(int i, byte[] bArr) {
        this.f48358 = i;
        m35456(i, bArr);
        int i2 = i + 33;
        int iMo2724 = mo2724(i2, bArr);
        this.f48376 = iMo2724;
        int i3 = iMo2724 / 2;
        bArr[i + 32] = (byte) (i3 & 255);
        int i4 = i2 + iMo2724;
        this.f48376 = i3;
        int i5 = i4 + 2;
        int iMo2725 = mo2725(i5, bArr);
        this.f48372 = iMo2725;
        bArr[i4] = (byte) (iMo2725 & 255);
        bArr[i4 + 1] = (byte) ((iMo2725 >> 8) & 255);
        int i6 = (i5 + iMo2725) - i;
        this.f48369 = i6;
        C23964 c23964 = this.f48373;
        if (c23964 != null) {
            c23964.m52788(bArr, this.f48358, i6, this, this.f48355);
        }
        return this.f48369;
    }

    @Override // l.InterfaceC9666
    public int decode(byte[] bArr) throws C2796 {
        this.f48358 = 4;
        m35445(bArr);
        byte b = bArr[36];
        this.f48376 = b;
        InterfaceC4314 interfaceC4314 = f48353;
        int i = 37;
        if (b != 0) {
            int iMo2726 = mo2726(37, bArr);
            if (iMo2726 != this.f48376 * 2 && interfaceC4314.mo12133()) {
                interfaceC4314.mo12127("wordCount * 2=" + (this.f48376 * 2) + " but readParameterWordsWireFormat returned " + iMo2726);
            }
            i = 37 + (this.f48376 * 2);
        }
        int iM13545 = C4850.m13545(i, bArr);
        this.f48372 = iM13545;
        int i2 = i + 2;
        if (iM13545 != 0) {
            int iMo2727 = mo2727(i2, bArr);
            if (iMo2727 != this.f48372 && interfaceC4314.mo12133()) {
                interfaceC4314.mo12127("byteCount=" + this.f48372 + " but readBytesWireFormat returned " + iMo2727);
            }
            i2 += this.f48372;
        }
        int i3 = i2 - 4;
        this.f48369 = i3;
        if (this.f48368) {
            System.arraycopy(bArr, 4, new byte[i3], 0, i3);
        }
        if (m35446(4, i3, bArr)) {
            return i3;
        }
        throw new C2796("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35456(int i, byte[] bArr) {
        System.arraycopy(C4850.f17079, 0, bArr, i, 24);
        bArr[i + 4] = this.f48377;
        bArr[i + 9] = this.f48370;
        C4850.m13546(this.f48356, i + 10, bArr);
        C4850.m13546(this.f48380, i + 24, bArr);
        C4850.m13546(this.f48361, i + 26, bArr);
        C4850.m13546(this.f48371, i + 28, bArr);
        C4850.m13546(this.f48366, i + 30, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35445(byte[] bArr) {
        this.f48377 = bArr[8];
        this.f48374 = C4850.m13549(9, bArr);
        this.f48370 = bArr[13];
        this.f48356 = C4850.m13545(14, bArr);
        this.f48380 = C4850.m13545(28, bArr);
        this.f48361 = C4850.m13545(30, bArr);
        this.f48371 = C4850.m13545(32, bArr);
        this.f48366 = C4850.m13545(34, bArr);
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35452() {
        return (this.f48370 & GCMSIVBlockCipher.MASK) == 128;
    }

    public final int hashCode() {
        return this.f48366;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC14792) && ((AbstractC14792) obj).f48366 == this.f48366;
    }

    public String toString() {
        String str;
        byte b = this.f48377;
        if (b == 0) {
            str = "SMB_COM_CREATE_DIRECTORY";
        } else if (b == 1) {
            str = "SMB_COM_DELETE_DIRECTORY";
        } else if (b == 4) {
            str = "SMB_COM_CLOSE";
        } else if (b == 16) {
            str = "SMB_COM_CHECK_DIRECTORY";
        } else if (b == 50) {
            str = "SMB_COM_TRANSACTION2";
        } else if (b == 52) {
            str = "SMB_COM_FIND_CLOSE2";
        } else if (b == 6) {
            str = "SMB_COM_DELETE";
        } else if (b == 7) {
            str = "SMB_COM_RENAME";
        } else if (b == 8) {
            str = "SMB_COM_QUERY_INFORMATION";
        } else if (b == 42) {
            str = "SMB_COM_MOVE";
        } else if (b != 43) {
            switch (b) {
                case -96:
                    str = "SMB_COM_NT_TRANSACT";
                    break;
                case -95:
                    str = "SMB_COM_NT_TRANSACT_SECONDARY";
                    break;
                case -94:
                    str = "SMB_COM_NT_CREATE_ANDX";
                    break;
                default:
                    switch (b) {
                        case 36:
                            str = "SMB_COM_LOCKING_ANDX";
                            break;
                        case 37:
                            str = "SMB_COM_TRANSACTION";
                            break;
                        case 38:
                            str = "SMB_COM_TRANSACTION_SECONDARY";
                            break;
                        default:
                            switch (b) {
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    str = "SMB_COM_OPEN_ANDX";
                                    break;
                                case 46:
                                    str = "SMB_COM_READ_ANDX";
                                    break;
                                case 47:
                                    str = "SMB_COM_WRITE_ANDX";
                                    break;
                                default:
                                    switch (b) {
                                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            str = "SMB_COM_TREE_DISCONNECT";
                                            break;
                                        case 114:
                                            str = "SMB_COM_NEGOTIATE";
                                            break;
                                        case 115:
                                            str = "SMB_COM_SESSION_SETUP_ANDX";
                                            break;
                                        case 116:
                                            str = "SMB_COM_LOGOFF_ANDX";
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                            str = "SMB_COM_TREE_CONNECT_ANDX";
                                            break;
                                        default:
                                            str = "UNKNOWN";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str = "SMB_COM_ECHO";
        }
        int i = this.f48374;
        String strM30558 = i == 0 ? "0" : C12303.m30558(i);
        StringBuilder sbM30914 = C12441.m30914("command=", str, ",received=");
        sbM30914.append(this.f48379);
        sbM30914.append(",errorCode=");
        sbM30914.append(strM30558);
        sbM30914.append(",flags=0x");
        C18855.m43491(this.f48370 & 255, 4, ",flags2=0x", sbM30914);
        C18855.m43491(this.f48356, 4, ",signSeq=", sbM30914);
        sbM30914.append(this.f48363);
        sbM30914.append(",tid=");
        sbM30914.append(this.f48380);
        sbM30914.append(",pid=");
        sbM30914.append(this.f48361);
        sbM30914.append(",uid=");
        sbM30914.append(this.f48371);
        sbM30914.append(",mid=");
        sbM30914.append(this.f48366);
        sbM30914.append(",wordCount=");
        sbM30914.append(this.f48376);
        sbM30914.append(",byteCount=");
        sbM30914.append(this.f48372);
        return new String(sbM30914.toString());
    }
}
