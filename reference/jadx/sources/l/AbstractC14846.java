package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܰ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14846 extends AbstractC5152 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48541 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21560 f48543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Logger f48542 = Logger.getLogger(AbstractC14846.class.getName());

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final boolean f48540 = C22832.m51532();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo18582();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14002(byte b);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14003(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14004(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14006(int i, long j);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14007(int i, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14008(int i, AbstractC17084 abstractC17084);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14009(int i, InterfaceC18775 interfaceC18775, InterfaceC7762 interfaceC7762);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14010(int i, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14011(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14012(long j);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14013(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14014(AbstractC17084 abstractC17084);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14015(InterfaceC18775 interfaceC18775);

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo14018(int i);

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo14019(int i, int i2);

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo14020(int i, InterfaceC18775 interfaceC18775);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo14021(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo14022(int i, int i2);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo14023(int i, long j);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo14024(int i, AbstractC17084 abstractC17084);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo14025(int i, InterfaceC18775 interfaceC18775);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo14026(long j);

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo14027(int i, int i2);

    public AbstractC14846() {
    }

    public /* synthetic */ AbstractC14846(int i) {
        this();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m35766(int i, int i2) {
        return m35762(i2) + m35765(i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m35764(int i, int i2) {
        return m35763(i2) + m35765(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m35767(int i) {
        return m35765(i) + 4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m35760(int i, long j) {
        return m35762(j) + m35765(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m35773(int i, long j) {
        return m35762(j) + m35765(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m35772(int i) {
        return m35765(i) + 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m35768(int i, int i2) {
        return m35762(i2) + m35765(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m35761(int i, AbstractC17084 abstractC17084) {
        int iM35765 = m35765(i);
        int size = abstractC17084.size();
        return m35763(size) + size + iM35765;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35759(int i, C10020 c10020) {
        int iM35765 = m35765(i);
        int iM25869 = c10020.m25869();
        return m35763(iM25869) + iM25869 + iM35765;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m35774(int i, InterfaceC18775 interfaceC18775) {
        return m35770(interfaceC18775) + m35765(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m35765(int i) {
        return m35763(i << 3);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m35763(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m35762(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m35769(String str) {
        int length;
        try {
            length = C11643.m29256(str);
        } catch (C5678 unused) {
            length = str.getBytes(C23447.f75888).length;
        }
        return m35763(length) + length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m35770(InterfaceC18775 interfaceC18775) {
        int serializedSize = interfaceC18775.getSerializedSize();
        return m35763(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35776(String str, C5678 c5678) throws C24544 {
        f48542.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c5678);
        byte[] bytes = str.getBytes(C23447.f75888);
        try {
            mo14018(bytes.length);
            mo14005(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C24544(e);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35775(int i, InterfaceC18775 interfaceC18775) {
        mo14019(i, 3);
        interfaceC18775.writeTo(this);
        mo14019(i, 4);
    }
}
