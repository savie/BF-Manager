package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۘۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3971 implements InterfaceC21299, InterfaceC18315, InterfaceC7874 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f13582 = C16980.m40037(AbstractC3971.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C24109 f13583;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Long f13584;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public String f13585;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f13586;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f13587;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f13588;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f13589;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f13590;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f13591;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f13592;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Exception f13593;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f13594;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f13595;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3971 f13596;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f13597;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13598;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f13599;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f13600;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f13601;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f13602;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC5878 f13603;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f13604;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f13605;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f13606;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f13607;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f13608;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f13609;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f13610;

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: getNext, reason: merged with bridge method [inline-methods] */
    public AbstractC3971 mo12790() {
        return null;
    }

    @Override // l.InterfaceC21299
    public final int size() {
        return 0;
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo12755() {
        return false;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo12756() {
        return 1;
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12763(int i) {
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12767(InterfaceC21299 interfaceC21299) {
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21299 mo12774() {
        return null;
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo1722(int i, byte[] bArr);

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo12778(InterfaceC21299 interfaceC21299) {
        return false;
    }

    /* JADX INFO: renamed from: ۫ */
    public abstract int mo1723(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo12783() {
        return this instanceof C12854;
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo12789() {
        return false;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo1724(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo1725(int i, byte[] bArr);

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10336(long j) {
    }

    public AbstractC3971(InterfaceC5878 interfaceC5878) {
        this(interfaceC5878, (byte) 0, null);
    }

    public AbstractC3971(InterfaceC5878 interfaceC5878, byte b) {
        this(interfaceC5878, b, null);
    }

    public AbstractC3971(InterfaceC5878 interfaceC5878, byte b, String str) {
        this.f13610 = 65535;
        this.f13583 = null;
        this.f13603 = interfaceC5878;
        this.f13606 = b;
        this.f13608 = str;
        this.f13586 = (byte) 24;
        this.f13605 = ((C14826) interfaceC5878).m35715();
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ܿ */
    public final int mo10330() {
        return this.f13606;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10331(int i) {
        this.f13606 = (byte) i;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int m12770() {
        return this.f13598;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final byte m12779() {
        return this.f13586;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12762(byte b) {
        this.f13586 = b;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m12772(int i) {
        this.f13591 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m12785(int i) {
        this.f13591 = i | this.f13591;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ܳ */
    public final void mo1466() {
        m12785(4096);
    }

    @Override // l.InterfaceC17965
    public final int getErrorCode() {
        return this.f13604;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m12782(int i) {
        this.f13604 = i;
    }

    @Override // l.InterfaceC7874
    public final String getPath() {
        return this.f13608;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۗ */
    public final String mo1460() {
        return this.f13589;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1471() {
        return this.f13590;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۙ */
    public final String mo1462() {
        return this.f13585;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۙ */
    public final void mo1464(String str, String str2, String str3) {
        this.f13590 = str;
        this.f13585 = str2;
        this.f13589 = str3;
    }

    @Override // l.InterfaceC7874
    /* JADX INFO: renamed from: ۙ */
    public final void mo1463(String str) {
        this.f13608 = str;
    }

    @Override // l.InterfaceC14585
    public final InterfaceC10110 getDigest() {
        return this.f13583;
    }

    @Override // l.InterfaceC14585
    public final C24109 getDigest() {
        return this.f13583;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ */
    public final void mo10310(InterfaceC10110 interfaceC10110) {
        this.f13583 = (C24109) interfaceC10110;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12787() {
        return this.f13592;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ */
    public final void mo10312(boolean z) {
        this.f13592 = z;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12781() {
        return this.f13602;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12792(boolean z) {
        this.f13602 = z;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo12784() {
        return this.f13599;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo12751() {
        this.f13599 = false;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12752() {
        this.f13599 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12764(Exception exc) {
        this.f13593 = exc;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void mo12775() {
        this.f13587 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public AbstractC3971 mo1727() {
        return this.f13596;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12766(InterfaceC18315 interfaceC18315) {
        if (!(interfaceC18315 instanceof AbstractC3971)) {
            throw new IllegalArgumentException();
        }
        this.f13596 = (AbstractC3971) interfaceC18315;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long mo12771() {
        return this.f13594;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ */
    public final void mo10309(long j) {
        this.f13594 = (int) j;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m12776() {
        return this.f13610;
    }

    @Override // l.InterfaceC21299
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo12795(int i) {
        this.f13610 = i;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int m12791() {
        return this.f13601;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10335(int i) {
        this.f13601 = i;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int m12796() {
        return this.f13595;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12753(int i) {
        this.f13595 = i;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo12780() {
        return this.f13600;
    }

    @Override // l.InterfaceC17965
    public final Exception getException() {
        return this.f13593;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean mo12788() {
        return this.f13587;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12754() {
        return this.f13588;
    }

    @Override // l.InterfaceC14235
    /* JADX INFO: renamed from: ᩵ */
    public final void mo10333() {
        this.f13588 = true;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Long mo12777() {
        return this.f13584;
    }

    @Override // l.InterfaceC17965
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12765(Long l2) {
        this.f13584 = l2;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5878 m12793() {
        return this.f13603;
    }

    @Override // l.InterfaceC14585, l.InterfaceC17965
    public void reset() {
        this.f13586 = (byte) 24;
        this.f13591 = 0;
        this.f13604 = 0;
        this.f13599 = false;
        this.f13583 = null;
        this.f13601 = 0;
        this.f13610 = 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12769(int i, int i2, byte[] bArr) {
        C24109 c24109 = this.f13583;
        if (c24109 == null || this.f13604 != 0) {
            return true;
        }
        boolean zM53660 = c24109.m53660(bArr, 4, i2, this);
        this.f13600 = zM53660;
        return !zM53660;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12758(String str, int i, byte[] bArr) {
        return m12759(str, bArr, i, this.f13602);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12759(String str, byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            if ((i - this.f13597) % 2 != 0) {
                i3 = i + 1;
                bArr[i] = 0;
            } else {
                i3 = i;
            }
            System.arraycopy(C23933.m53455(str), 0, bArr, i3, str.length() * 2);
            int length = (str.length() * 2) + i3;
            int i4 = length + 1;
            bArr[length] = 0;
            i2 = length + 2;
            bArr[i4] = 0;
        } else {
            byte[] bArrM53452 = C23933.m53452(str, this.f13603);
            System.arraycopy(bArrM53452, 0, bArr, i, bArrM53452.length);
            int length2 = bArrM53452.length + i;
            bArr[length2] = 0;
            i2 = length2 + 1;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m12794(int i, byte[] bArr) {
        return m12760(this.f13602, i, 255, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12760(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if ((i - this.f13597) % 2 != 0) {
                i++;
            }
            return C23933.m53453(i, C23933.m53454(i, i2, bArr), bArr);
        }
        return C23933.m53450(bArr, i, C23933.m53449(i, i2, bArr), this.f13603);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12761(byte[] bArr, int i, boolean z) {
        if (z) {
            if ((i - this.f13597) % 2 != 0) {
                i++;
            }
            return C23933.m53453(i, C23933.m53454(i, 255, bArr), bArr);
        }
        return C23933.m53450(bArr, i, C23933.m53449(i, 255, bArr), this.f13603);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12757(int i, String str) {
        int length = str.length() + 1;
        if (this.f13602) {
            int length2 = str.length() * 2;
            length = length2 + 2;
            if (i % 2 != 0) {
                return length2 + 3;
            }
        }
        return length;
    }

    @Override // l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ */
    public int mo10305(int i, byte[] bArr) {
        this.f13597 = i;
        m12786(i, bArr);
        int i2 = i + 33;
        int iMo1723 = mo1723(i2, bArr);
        this.f13609 = iMo1723;
        int i3 = iMo1723 / 2;
        bArr[i + 32] = (byte) (i3 & 255);
        int i4 = i2 + iMo1723;
        this.f13609 = i3;
        int i5 = i4 + 2;
        int iMo1724 = mo1724(i5, bArr);
        this.f13598 = iMo1724;
        bArr[i4] = (byte) (iMo1724 & 255);
        bArr[i4 + 1] = (byte) ((iMo1724 >> 8) & 255);
        int i6 = (i5 + iMo1724) - i;
        this.f13607 = i6;
        C24109 c24109 = this.f13583;
        if (c24109 != null) {
            c24109.m53659(bArr, this.f13597, i6, this, this.f13596);
        }
        return this.f13607;
    }

    @Override // l.InterfaceC14585
    public int decode(byte[] bArr) throws C19061 {
        this.f13597 = 4;
        m12768(bArr);
        byte b = bArr[36];
        this.f13609 = b;
        InterfaceC25186 interfaceC25186 = f13582;
        int i = 37;
        if (b != 0) {
            int iMo1722 = mo1722(37, bArr);
            if (iMo1722 != this.f13609 * 2 && interfaceC25186.mo13713()) {
                interfaceC25186.mo13717("wordCount * 2=" + (this.f13609 * 2) + " but readParameterWordsWireFormat returned " + iMo1722);
            }
            i = 37 + (this.f13609 * 2);
        }
        int iM2318 = C0481.m2318(i, bArr);
        this.f13598 = iM2318;
        int i2 = i + 2;
        if (iM2318 != 0) {
            int iMo1725 = mo1725(i2, bArr);
            if (iMo1725 != this.f13598 && interfaceC25186.mo13713()) {
                interfaceC25186.mo13717("byteCount=" + this.f13598 + " but readBytesWireFormat returned " + iMo1725);
            }
            i2 += this.f13598;
        }
        int i3 = i2 - 4;
        this.f13607 = i3;
        if (this.f13588) {
            System.arraycopy(bArr, 4, new byte[i3], 0, i3);
        }
        if (m12769(4, i3, bArr)) {
            return i3;
        }
        throw new C19061("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m12786(int i, byte[] bArr) {
        System.arraycopy(C0481.f2110, 0, bArr, i, 24);
        bArr[i + 4] = this.f13606;
        bArr[i + 9] = this.f13586;
        C0481.m2319(this.f13591, i + 10, bArr);
        C0481.m2319(this.f13610, i + 24, bArr);
        C0481.m2319(this.f13605, i + 26, bArr);
        C0481.m2319(this.f13601, i + 28, bArr);
        C0481.m2319(this.f13594, i + 30, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12768(byte[] bArr) {
        this.f13606 = bArr[8];
        this.f13604 = C0481.m2322(9, bArr);
        this.f13586 = bArr[13];
        this.f13591 = C0481.m2318(14, bArr);
        this.f13610 = C0481.m2318(28, bArr);
        this.f13605 = C0481.m2318(30, bArr);
        this.f13601 = C0481.m2318(32, bArr);
        this.f13594 = C0481.m2318(34, bArr);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12773() {
        return (this.f13586 & GCMSIVBlockCipher.MASK) == 128;
    }

    public final int hashCode() {
        return this.f13594;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC3971) && ((AbstractC3971) obj).f13594 == this.f13594;
    }

    public String toString() {
        String str;
        byte b = this.f13606;
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
        int i = this.f13604;
        String strM47405 = i == 0 ? "0" : C20728.m47405(i);
        StringBuilder sbM51387 = C22783.m51387("command=", str, ",received=");
        sbM51387.append(this.f13599);
        sbM51387.append(",errorCode=");
        sbM51387.append(strM47405);
        sbM51387.append(",flags=0x");
        C8008.m21876(this.f13586 & 255, 4, ",flags2=0x", sbM51387);
        C8008.m21876(this.f13591, 4, ",signSeq=", sbM51387);
        sbM51387.append(this.f13595);
        sbM51387.append(",tid=");
        sbM51387.append(this.f13610);
        sbM51387.append(",pid=");
        sbM51387.append(this.f13605);
        sbM51387.append(",uid=");
        sbM51387.append(this.f13601);
        sbM51387.append(",mid=");
        sbM51387.append(this.f13594);
        sbM51387.append(",wordCount=");
        sbM51387.append(this.f13609);
        sbM51387.append(",byteCount=");
        sbM51387.append(this.f13598);
        return new String(sbM51387.toString());
    }
}
