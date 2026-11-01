package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7558 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f25060;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C7558 f25061;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f25062;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20259 f25063;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25064;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile Object f25065;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte f25066;

    static {
        C3844.m11171(EnumC13018.PUBLIC, C7558.class.getName());
        f25061 = new C7558();
        f25060 = new C8970();
    }

    public C7558(C10381 c10381, int i) {
        super(c10381);
        this.f25065 = "";
        this.f25066 = (byte) -1;
    }

    public C7558() {
        this.f25065 = "";
        this.f25066 = (byte) -1;
        this.f25065 = "";
        this.f25062 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46288;
        c6956.m18696(C7558.class, C10381.class);
        return c6956;
    }

    public final boolean hasName() {
        return (this.f25064 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f25065;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f25065 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m20078() {
        return this.f25062.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22375 m20076(int i) {
        return (C22375) this.f25062.get(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m20077() {
        return (this.f25064 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20259 m20075() {
        C20259 c20259 = this.f25063;
        return c20259 == null ? C20259.getDefaultInstance() : c20259;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f25066;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f25062.size(); i++) {
            if (!m20076(i).isInitialized()) {
                this.f25066 = (byte) 0;
                return false;
            }
        }
        if (m20077() && !m20075().isInitialized()) {
            this.f25066 = (byte) 0;
            return false;
        }
        this.f25066 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        if ((this.f25064 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f25065);
        }
        for (int i = 0; i < this.f25062.size(); i++) {
            abstractC22044.mo14254(2, (InterfaceC23206) this.f25062.get(i));
        }
        if ((this.f25064 & 2) != 0) {
            abstractC22044.mo14254(3, m20075());
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f25064 & 1) != 0 ? AbstractC18245.m42390(1, this.f25065) : 0;
        for (int i2 = 0; i2 < this.f25062.size(); i2++) {
            iM42390 += AbstractC22044.m48963(2, (InterfaceC23206) this.f25062.get(i2));
        }
        if ((this.f25064 & 2) != 0) {
            iM42390 += AbstractC22044.m48963(3, m20075());
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
        if (!(obj instanceof C7558)) {
            return super.equals(obj);
        }
        C7558 c7558 = (C7558) obj;
        if (hasName() != c7558.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c7558.getName())) && this.f25062.equals(c7558.f25062) && m20077() == c7558.m20077()) {
            return (!m20077() || m20075().equals(c7558.m20075())) && getUnknownFields().equals(c7558.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46315.hashCode() + 779;
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (this.f25062.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + this.f25062.hashCode();
        }
        if (m20077()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + m20075().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C10381 newBuilder() {
        return f25061.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f25061.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f25061.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C10381 toBuilder() {
        int i = 0;
        if (this == f25061) {
            return new C10381(i);
        }
        C10381 c10381 = new C10381(i);
        c10381.m26273(this);
        return c10381;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C10381(interfaceC6790, 0);
    }

    public static C7558 getDefaultInstance() {
        return f25061;
    }

    public static InterfaceC6271 parser() {
        return f25060;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f25060;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f25061;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f25061;
    }
}
