package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۠᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8414 extends AbstractC18245 implements InterfaceC9120 {
    public static final int DATA_FIELD_NUMBER = 2;
    public static final C8414 DEFAULT_INSTANCE;
    public static final InterfaceC6271 PARSER;
    public static final int UNPADDED_SIGNATURE_SIZE_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC23725 data_;
    public byte memoizedIsInitialized;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C8414(C18997 c18997) {
        this((AbstractC0584) c18997);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C8414.class.getName());
        DEFAULT_INSTANCE = new C8414();
        PARSER = new C18291();
    }

    public C8414(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.version_ = 0;
        this.data_ = AbstractC23725.f76778;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C8414() {
        this.version_ = 0;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.data_ = abstractC23725;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable;
        c6956.m18696(C8414.class, C18997.class);
        return c6956;
    }

    @Override // l.InterfaceC9120
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC9120
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Override // l.InterfaceC9120
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC9120
    public AbstractC23725 getData() {
        return this.data_;
    }

    @Override // l.InterfaceC9120
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC9120
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
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
            abstractC22044.mo14231(1, this.version_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14239(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC22044.mo14234(3, this.unpaddedSignatureSize_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48960 = (this.bitField0_ & 1) != 0 ? AbstractC22044.m48960(1, this.version_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM48960 += AbstractC22044.m48968(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM48960 += AbstractC22044.m48965(3);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48960;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8414)) {
            return super.equals(obj);
        }
        C8414 c8414 = (C8414) obj;
        if (hasVersion() != c8414.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c8414.getVersion()) || hasData() != c8414.hasData()) {
            return false;
        }
        if ((!hasData() || getData().equals(c8414.getData())) && hasUnpaddedSignatureSize() == c8414.hasUnpaddedSignatureSize()) {
            return (!hasUnpaddedSignatureSize() || getUnpaddedSignatureSize() == c8414.getUnpaddedSignatureSize()) && getUnknownFields().equals(c8414.getUnknownFields());
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
        if (hasVersion()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getVersion();
        }
        if (hasData()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + getData().hashCode();
        }
        if (hasUnpaddedSignatureSize()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + getUnpaddedSignatureSize();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8414 parseFrom(ByteBuffer byteBuffer) {
        return (C8414) PARSER.parseFrom(byteBuffer);
    }

    public static C8414 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C8414) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C8414 parseFrom(AbstractC23725 abstractC23725) {
        return (C8414) PARSER.parseFrom(abstractC23725);
    }

    public static C8414 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C8414) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C8414 parseFrom(byte[] bArr) {
        return (C8414) PARSER.parseFrom(bArr);
    }

    public static C8414 parseFrom(byte[] bArr, C2701 c2701) {
        return (C8414) PARSER.parseFrom(bArr, c2701);
    }

    public static C8414 parseFrom(InputStream inputStream) {
        return (C8414) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C8414 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C8414) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C8414 parseDelimitedFrom(InputStream inputStream) {
        return (C8414) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C8414 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C8414) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C8414 parseFrom(AbstractC3262 abstractC3262) {
        return (C8414) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C8414 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C8414) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C18997 newBuilderForType() {
        return newBuilder();
    }

    public static C18997 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C18997 newBuilder(C8414 c8414) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c8414);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C18997 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C18997(i) : new C18997(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C18997 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C18997(interfaceC6790, 0);
    }

    public static C8414 getDefaultInstance() {
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
    public C8414 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
