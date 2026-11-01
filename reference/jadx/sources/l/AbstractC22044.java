package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩹ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22044 extends AbstractC10319 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Logger f71445 = Logger.getLogger(AbstractC22044.class.getName());

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final boolean f71446 = C15882.m37762();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71447 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0876 f71448;

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo14231(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo28606();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14232(byte b);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14233(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14234(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14236(int i, long j);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14237(int i, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14238(int i, InterfaceC23206 interfaceC23206, InterfaceC6667 interfaceC6667);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14239(int i, AbstractC23725 abstractC23725);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14240(int i, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14241(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14242(long j);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14243(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14244(InterfaceC23206 interfaceC23206);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14245(AbstractC23725 abstractC23725);

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo14248(int i);

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo14249(int i, int i2);

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo14250(int i, InterfaceC23206 interfaceC23206);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14251(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14252(int i, int i2);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14253(int i, long j);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14254(int i, InterfaceC23206 interfaceC23206);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14255(int i, AbstractC23725 abstractC23725);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14256(long j);

    public AbstractC22044() {
    }

    public /* synthetic */ AbstractC22044(int i) {
        this();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int m48974(int i, int i2) {
        return m48969(i2) + m48973(i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m48960(int i, int i2) {
        return m48959(i2) + m48973(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m48965(int i) {
        return m48973(i) + 4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m48967(int i, long j) {
        return m48969(j) + m48973(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m48962(int i, long j) {
        return m48969(j) + m48973(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m48961(int i) {
        return m48973(i) + 1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m48966(int i, int i2) {
        return m48969(i2) + m48973(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m48968(int i, AbstractC23725 abstractC23725) {
        int iM48973 = m48973(i);
        int size = abstractC23725.size();
        return m48959(size) + size + iM48973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48964(int i, C15114 c15114) {
        int iM48973 = m48973(i);
        int iM36204 = c15114.m36204();
        return m48959(iM36204) + iM36204 + iM48973;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m48963(int i, InterfaceC23206 interfaceC23206) {
        return m48971(interfaceC23206) + m48973(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int m48973(int i) {
        return m48959(i << 3);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m48959(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m48969(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m48970(String str) {
        int length;
        try {
            length = C6003.m16291(str);
        } catch (C12354 unused) {
            length = str.getBytes(C9779.f33479).length;
        }
        return m48959(length) + length;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m48971(InterfaceC23206 interfaceC23206) {
        int serializedSize = interfaceC23206.getSerializedSize();
        return m48959(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48976(String str, C12354 c12354) throws C2287 {
        f71445.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c12354);
        byte[] bytes = str.getBytes(C9779.f33479);
        try {
            mo14248(bytes.length);
            mo14235(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C2287(e);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48975(int i, InterfaceC23206 interfaceC23206) {
        mo14249(i, 3);
        interfaceC23206.writeTo(this);
        mo14249(i, 4);
    }
}
