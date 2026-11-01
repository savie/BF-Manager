package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۬۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12959 extends AbstractC18245 implements InterfaceC6608 {
    public static final C12959 DEFAULT_INSTANCE;
    public static final int DST_EXTENT_FIELD_NUMBER = 3;
    public static final InterfaceC6271 PARSER;
    public static final int SRC_EXTENT_FIELD_NUMBER = 2;
    public static final int SRC_OFFSET_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public C5903 dstExtent_;
    public byte memoizedIsInitialized;
    public C5903 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C12959(C5197 c5197) {
        this((AbstractC0584) c5197);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C12959.class.getName());
        DEFAULT_INSTANCE = new C12959();
        PARSER = new C2374();
    }

    public C12959(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.type_ = 0;
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C12959() {
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable;
        c6956.m18696(C12959.class, C5197.class);
        return c6956;
    }

    @Override // l.InterfaceC6608
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC6608
    public EnumC0963 getType() {
        EnumC0963 enumC0963ForNumber = EnumC0963.forNumber(this.type_);
        return enumC0963ForNumber == null ? EnumC0963.COW_COPY : enumC0963ForNumber;
    }

    @Override // l.InterfaceC6608
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC6608
    public C5903 getSrcExtent() {
        C5903 c5903 = this.srcExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC6608
    public InterfaceC23543 getSrcExtentOrBuilder() {
        C5903 c5903 = this.srcExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC6608
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC6608
    public C5903 getDstExtent() {
        C5903 c5903 = this.dstExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC6608
    public InterfaceC23543 getDstExtentOrBuilder() {
        C5903 c5903 = this.dstExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC6608
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC6608
    public int getSrcOffset() {
        return this.srcOffset_;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC22044.mo14252(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14254(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC22044.mo14254(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC22044.mo14231(4, this.srcOffset_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48966 = (this.bitField0_ & 1) != 0 ? AbstractC22044.m48966(1, this.type_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM48966 += AbstractC22044.m48963(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            iM48966 += AbstractC22044.m48963(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            iM48966 += AbstractC22044.m48960(4, this.srcOffset_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48966;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12959)) {
            return super.equals(obj);
        }
        C12959 c12959 = (C12959) obj;
        if (hasType() != c12959.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c12959.type_) || hasSrcExtent() != c12959.hasSrcExtent()) {
            return false;
        }
        if ((hasSrcExtent() && !getSrcExtent().equals(c12959.getSrcExtent())) || hasDstExtent() != c12959.hasDstExtent()) {
            return false;
        }
        if ((!hasDstExtent() || getDstExtent().equals(c12959.getDstExtent())) && hasSrcOffset() == c12959.hasSrcOffset()) {
            return (!hasSrcOffset() || getSrcOffset() == c12959.getSrcOffset()) && getUnknownFields().equals(c12959.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasType()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.type_;
        }
        if (hasSrcExtent()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + getSrcExtent().hashCode();
        }
        if (hasDstExtent()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + getDstExtent().hashCode();
        }
        if (hasSrcOffset()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + getSrcOffset();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C12959 parseFrom(ByteBuffer byteBuffer) {
        return (C12959) PARSER.parseFrom(byteBuffer);
    }

    public static C12959 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C12959) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C12959 parseFrom(AbstractC23725 abstractC23725) {
        return (C12959) PARSER.parseFrom(abstractC23725);
    }

    public static C12959 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C12959) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C12959 parseFrom(byte[] bArr) {
        return (C12959) PARSER.parseFrom(bArr);
    }

    public static C12959 parseFrom(byte[] bArr, C2701 c2701) {
        return (C12959) PARSER.parseFrom(bArr, c2701);
    }

    public static C12959 parseFrom(InputStream inputStream) {
        return (C12959) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C12959 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C12959) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C12959 parseDelimitedFrom(InputStream inputStream) {
        return (C12959) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C12959 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C12959) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C12959 parseFrom(AbstractC3262 abstractC3262) {
        return (C12959) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C12959 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C12959) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C5197 newBuilderForType() {
        return newBuilder();
    }

    public static C5197 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C5197 newBuilder(C12959 c12959) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c12959);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C5197 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C5197(i) : new C5197(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C5197 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C5197(interfaceC6790, 0);
    }

    public static C12959 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC6271 parser() {
        return PARSER;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public InterfaceC6271 getParserForType() {
        return PARSER;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public C12959 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
