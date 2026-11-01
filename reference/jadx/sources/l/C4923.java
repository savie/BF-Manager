package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4923 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f17242;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C4923 f17243;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public double f17244;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f17245;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f17246;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f17247;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile Object f17248;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile Object f17249;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f17250;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17251;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC23725 f17252;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C4923.class.getName());
        f17243 = new C4923();
        f17242 = new C23787();
    }

    public C4923(C14615 c14615, int i) {
        super(c14615);
        this.f17249 = "";
        this.f17246 = 0L;
        this.f17245 = 0L;
        this.f17244 = 0.0d;
        this.f17252 = AbstractC23725.f76778;
        this.f17248 = "";
        this.f17247 = (byte) -1;
    }

    public C4923() {
        this.f17249 = "";
        this.f17246 = 0L;
        this.f17245 = 0L;
        this.f17244 = 0.0d;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.f17252 = abstractC23725;
        this.f17248 = "";
        this.f17247 = (byte) -1;
        this.f17250 = Collections.EMPTY_LIST;
        this.f17249 = "";
        this.f17252 = abstractC23725;
        this.f17248 = "";
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46280;
        c6956.m18696(C4923.class, C14615.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m13700() {
        return (this.f17251 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m13699() {
        Object obj = this.f17249;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f17249 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m13701() {
        return (this.f17251 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m13704() {
        return this.f17246;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m13707() {
        return (this.f17251 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m13709() {
        return this.f17245;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m13706() {
        return (this.f17251 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final double m13698() {
        return this.f17244;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m13702() {
        return (this.f17251 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC23725 m13708() {
        return this.f17252;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m13705() {
        return (this.f17251 & 32) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m13703() {
        Object obj = this.f17248;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f17248 = strM52260;
        }
        return strM52260;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f17247;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f17250.size(); i++) {
            if (!((C3324) this.f17250.get(i)).isInitialized()) {
                this.f17247 = (byte) 0;
                return false;
            }
        }
        this.f17247 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        for (int i = 0; i < this.f17250.size(); i++) {
            abstractC22044.mo14254(2, (InterfaceC23206) this.f17250.get(i));
        }
        if ((this.f17251 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 3, this.f17249);
        }
        if ((this.f17251 & 2) != 0) {
            abstractC22044.mo14253(4, this.f17246);
        }
        if ((this.f17251 & 4) != 0) {
            abstractC22044.mo14253(5, this.f17245);
        }
        if ((this.f17251 & 8) != 0) {
            double d = this.f17244;
            abstractC22044.getClass();
            abstractC22044.mo14236(6, Double.doubleToRawLongBits(d));
        }
        if ((this.f17251 & 16) != 0) {
            abstractC22044.mo14239(7, this.f17252);
        }
        if ((this.f17251 & 32) != 0) {
            AbstractC18245.m42405(abstractC22044, 8, this.f17248);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = 0;
        for (int i2 = 0; i2 < this.f17250.size(); i2++) {
            iM42390 += AbstractC22044.m48963(2, (InterfaceC23206) this.f17250.get(i2));
        }
        if ((this.f17251 & 1) != 0) {
            iM42390 += AbstractC18245.m42390(3, this.f17249);
        }
        if ((this.f17251 & 2) != 0) {
            iM42390 += AbstractC22044.m48962(4, this.f17246);
        }
        if ((this.f17251 & 4) != 0) {
            iM42390 += AbstractC22044.m48967(5, this.f17245);
        }
        if ((this.f17251 & 8) != 0) {
            iM42390 += AbstractC22044.m48973(6) + 8;
        }
        if ((this.f17251 & 16) != 0) {
            iM42390 += AbstractC22044.m48968(7, this.f17252);
        }
        if ((this.f17251 & 32) != 0) {
            iM42390 += AbstractC18245.m42390(8, this.f17248);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM42390;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4923)) {
            return super.equals(obj);
        }
        C4923 c4923 = (C4923) obj;
        if (!this.f17250.equals(c4923.f17250) || m13700() != c4923.m13700()) {
            return false;
        }
        if ((m13700() && !m13699().equals(c4923.m13699())) || m13701() != c4923.m13701()) {
            return false;
        }
        if ((m13701() && this.f17246 != c4923.f17246) || m13707() != c4923.m13707()) {
            return false;
        }
        if ((m13707() && this.f17245 != c4923.f17245) || m13706() != c4923.m13706()) {
            return false;
        }
        if ((m13706() && Double.doubleToLongBits(this.f17244) != Double.doubleToLongBits(c4923.f17244)) || m13702() != c4923.m13702()) {
            return false;
        }
        if ((!m13702() || this.f17252.equals(c4923.f17252)) && m13705() == c4923.m13705()) {
            return (!m13705() || m13703().equals(c4923.m13703())) && getUnknownFields().equals(c4923.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46309.hashCode() + 779;
        if (this.f17250.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f17250.hashCode();
        }
        if (m13700()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m13699().hashCode();
        }
        if (m13701()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + C9779.m24887(this.f17246);
        }
        if (m13707()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + C9779.m24887(this.f17245);
        }
        if (m13706()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + C9779.m24887(Double.doubleToLongBits(this.f17244));
        }
        if (m13702()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + this.f17252.hashCode();
        }
        if (m13705()) {
            iHashCode = C17922.m41614(iHashCode, 37, 8, 53) + m13703().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14615 newBuilder() {
        return f17243.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f17243.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f17243.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C14615 toBuilder() {
        int i = 0;
        if (this == f17243) {
            return new C14615(i);
        }
        C14615 c14615 = new C14615(i);
        c14615.m35093(this);
        return c14615;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C14615(interfaceC6790, 0);
    }

    public static C4923 getDefaultInstance() {
        return f17243;
    }

    public static InterfaceC6271 parser() {
        return f17242;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f17242;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f17243;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f17243;
    }
}
