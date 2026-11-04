package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۨܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12479 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40073 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f40074;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f40075;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40076;

    public String toString() {
        switch (this.f40073) {
            case 0:
                return "SectionReader{buf=" + ((ByteBuffer) this.f40075) + ", offset=" + this.f40076 + '}';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int m31011() {
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        do {
            int iM31002 = m31002();
            i2 |= (iM31002 & 127) << (i3 * 7);
            i4 <<= 7;
            i3++;
            i = iM31002 & 128;
            if (i != 128) {
                break;
            }
        } while (i3 < 5);
        if (i != 128) {
            return ((i4 >> 1) & i2) != 0 ? i2 | i4 : i2;
        }
        throw new C13817("Invalid LEB128 sequence");
    }

    public C12479(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Missing Seed for KDF");
        }
        this.f40075 = Arrays.copyOf(bArr, bArr.length);
        if (bArr2 == null) {
            this.f40074 = new byte[0];
        } else {
            this.f40074 = Arrays.copyOf(bArr2, bArr2.length);
        }
        this.f40076 = 32;
    }

    public C12479(C2281 c2281, int i) {
        this.f40074 = c2281;
        this.f40076 = i;
        ByteBuffer byteBufferDuplicate = c2281.m7725().duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferDuplicate.position(i);
        this.f40075 = byteBufferDuplicate;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12479 m30987() {
        return new C12479((C2281) this.f40074, this.f40076);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] m30999() {
        return (byte[]) this.f40075;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12479 m31006(int i) {
        return new C12479((C2281) this.f40074, i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] m31004() {
        return (byte[]) this.f40074;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int m30992() {
        return this.f40076;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m30995(int i) {
        this.f40076 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m31010() {
        this.f40076 += 32;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m30991(int i) {
        ((ByteBuffer) this.f40075).position(this.f40076 + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30988(int i) {
        ((ByteBuffer) this.f40075).position(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m31005() {
        return ((ByteBuffer) this.f40075).position();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m31012(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f40075;
        byteBuffer.position(byteBuffer.position() + i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int m30990() {
        return ((ByteBuffer) this.f40075).getInt();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List m31001() {
        int i = ((ByteBuffer) this.f40075).getInt();
        if (i != 0) {
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = m31000();
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(m30997(iArr[i3]));
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long m30982() {
        return ((ByteBuffer) this.f40075).getLong();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte m30996() {
        return ((ByteBuffer) this.f40075).get();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int m31002() {
        return ((ByteBuffer) this.f40075).get() & 255;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int m31000() {
        return ((ByteBuffer) this.f40075).getShort() & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m30994() {
        return ((ByteBuffer) this.f40075).getShort();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] m30983(int i) {
        byte[] bArr = new byte[i];
        ((ByteBuffer) this.f40075).get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String m30997(int i) {
        if (i == -1) {
            return null;
        }
        m30988((i * 4) + ((C2281) this.f40074).m7728().m41452());
        return m30998(((ByteBuffer) this.f40075).getInt());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String m30998(int i) {
        if (i == -1) {
            return null;
        }
        m30988((i * 4) + ((C2281) this.f40074).m7728().m41454());
        m30988(((ByteBuffer) this.f40075).getInt());
        char[] cArr = new char[C22463.m50647(this)];
        int i2 = 0;
        while (true) {
            char cM31002 = (char) (m31002() & 255);
            if (cM31002 == 0) {
                return new String(cArr, 0, i2);
            }
            cArr[i2] = cM31002;
            if (cM31002 >= 128) {
                if ((cM31002 & 224) == 192) {
                    int iM31002 = m31002();
                    if ((iM31002 & 192) != 128) {
                        throw new C13817("Bad second byte");
                    }
                    cArr[i2] = (char) (((cM31002 & 31) << 6) | (iM31002 & 63));
                } else if ((cM31002 & 240) == 224) {
                    int iM31003 = m31002();
                    int iM31004 = m31002();
                    if ((iM31003 & 192) != 128 || (iM31004 & 192) != 128) {
                        throw new C13817("Bad second or third byte");
                    }
                    cArr[i2] = (char) (((cM31002 & 15) << 12) | ((iM31003 & 63) << 6) | (iM31004 & 63));
                } else {
                    throw new C13817("Bad byte");
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m30985(C16954 c16954, int i) {
        m30988((i * 8) + ((C2281) this.f40074).m7728().m41460());
        int iM31000 = m31000();
        int iM31001 = m31000();
        int i2 = ((ByteBuffer) this.f40075).getInt();
        c16954.m39933(m30997(iM31001));
        c16954.m39931(m30998(i2));
        return iM31000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0665 m30986(int i, C12479 c12479) {
        m30988((i * 4) + ((C2281) this.f40074).m7728().m41453());
        m30988(((ByteBuffer) this.f40075).getInt());
        return new C0665(C24414.m54616(this, c12479));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC8670 m30993(int i) {
        EnumC22294 enumC22294;
        m30988((i * 8) + ((C2281) this.f40074).m7728().m41458());
        int iM31000 = m31000();
        switch (iM31000) {
            case 0:
                enumC22294 = EnumC22294.STATIC_PUT;
                break;
            case 1:
                enumC22294 = EnumC22294.STATIC_GET;
                break;
            case 2:
                enumC22294 = EnumC22294.INSTANCE_PUT;
                break;
            case 3:
                enumC22294 = EnumC22294.INSTANCE_GET;
                break;
            case 4:
                enumC22294 = EnumC22294.INVOKE_STATIC;
                break;
            case 5:
                enumC22294 = EnumC22294.INVOKE_INSTANCE;
                break;
            case 6:
                enumC22294 = EnumC22294.INVOKE_CONSTRUCTOR;
                break;
            case 7:
                enumC22294 = EnumC22294.INVOKE_DIRECT;
                break;
            case 8:
                enumC22294 = EnumC22294.INVOKE_INTERFACE;
                break;
            default:
                throw new IllegalArgumentException(C4791.m14766(new StringBuilder("Unknown method handle type: 0x"), iM31000));
        }
        m31012(2);
        int iM31001 = m31000();
        if (enumC22294.m50355()) {
            C16954 c16954 = new C16954(null);
            c16954.m39935(m30997(m30985(c16954, iM31001)));
            return new C1411(enumC22294, c16954);
        }
        C20684 c20684 = new C20684();
        m30989(iM31001, c20684);
        return new C2902(enumC22294, c20684);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30989(int i, C20684 c20684) {
        c20684.m47320((C2281) this.f40074, i);
        c20684.m47317(i);
        c20684.m47321(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m31007(int i, C20684 c20684) {
        List listM31001;
        C17700 c17700M7728 = ((C2281) this.f40074).m7728();
        m30988((i * 8) + c17700M7728.m41457());
        int iM31000 = m31000();
        int iM31001 = m31000();
        ByteBuffer byteBuffer = (ByteBuffer) this.f40075;
        int i2 = byteBuffer.getInt();
        m30988((iM31001 * 12) + c17700M7728.m41456());
        m31012(4);
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (i4 != 0) {
            byteBuffer.position(i4);
            listM31001 = m31001();
        } else {
            listM31001 = Collections.EMPTY_LIST;
        }
        c20684.m47324(m30997(iM31000));
        c20684.m47318(m30998(i2));
        c20684.m47322(m30997(i3));
        c20684.m47319(listM31001);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3530 m31003(int i) {
        List listM31001;
        m30988((i * 12) + ((C2281) this.f40074).m7728().m41456());
        m31012(4);
        ByteBuffer byteBuffer = (ByteBuffer) this.f40075;
        int i2 = byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        if (i3 != 0) {
            byteBuffer.position(i3);
            listM31001 = m31001();
        } else {
            listM31001 = Collections.EMPTY_LIST;
        }
        return new C3530(m30997(i2), listM31001);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List m31008(int i) {
        C17700 c17700M7728 = ((C2281) this.f40074).m7728();
        m30988((i * 8) + c17700M7728.m41457() + 2);
        m30988((m31000() * 12) + c17700M7728.m41456() + 8);
        ByteBuffer byteBuffer = (ByteBuffer) this.f40075;
        int i2 = byteBuffer.getInt();
        if (i2 != 0) {
            byteBuffer.position(i2);
            return m31001();
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2281 m31009() {
        return (C2281) this.f40074;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int m30984() {
        return ((ByteBuffer) this.f40075).capacity();
    }
}
