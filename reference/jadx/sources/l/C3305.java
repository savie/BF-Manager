package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۗۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C3305 extends AbstractC9035 implements InterfaceC12254 {
    public static final int DATA_FIELD_NUMBER = 2;
    public static final C3305 DEFAULT_INSTANCE;
    public static final InterfaceC11490 PARSER;
    public static final int UNPADDED_SIGNATURE_SIZE_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC17084 data_;
    public byte memoizedIsInitialized;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C3305(C23443 c23443) {
        this((AbstractC15001) c23443);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C3305.class.getName());
        DEFAULT_INSTANCE = new C3305();
        PARSER = new C15983();
    }

    public C3305(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.version_ = 0;
        this.data_ = AbstractC17084.f55772;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C3305() {
        this.version_ = 0;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.unpaddedSignatureSize_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.data_ = abstractC17084;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable;
        c7544.m20621(C3305.class, C23443.class);
        return c7544;
    }

    @Override // l.InterfaceC12254
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC12254
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Override // l.InterfaceC12254
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC12254
    public AbstractC17084 getData() {
        return this.data_;
    }

    @Override // l.InterfaceC12254
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC12254
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
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

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC14846.mo14027(1, this.version_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14008(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14846.mo14004(3, this.unpaddedSignatureSize_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35764 = (this.bitField0_ & 1) != 0 ? AbstractC14846.m35764(1, this.version_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35764 += AbstractC14846.m35761(2, this.data_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35764 += AbstractC14846.m35767(3);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35764;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3305)) {
            return super.equals(obj);
        }
        C3305 c3305 = (C3305) obj;
        if (hasVersion() != c3305.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c3305.getVersion()) || hasData() != c3305.hasData()) {
            return false;
        }
        if ((!hasData() || getData().equals(c3305.getData())) && hasUnpaddedSignatureSize() == c3305.hasUnpaddedSignatureSize()) {
            return (!hasUnpaddedSignatureSize() || getUnpaddedSignatureSize() == c3305.getUnpaddedSignatureSize()) && getUnknownFields().equals(c3305.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasVersion()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getVersion();
        }
        if (hasData()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + getData().hashCode();
        }
        if (hasUnpaddedSignatureSize()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + getUnpaddedSignatureSize();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C3305 parseFrom(ByteBuffer byteBuffer) {
        return (C3305) PARSER.parseFrom(byteBuffer);
    }

    public static C3305 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C3305) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C3305 parseFrom(AbstractC17084 abstractC17084) {
        return (C3305) PARSER.parseFrom(abstractC17084);
    }

    public static C3305 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C3305) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C3305 parseFrom(byte[] bArr) {
        return (C3305) PARSER.parseFrom(bArr);
    }

    public static C3305 parseFrom(byte[] bArr, C24215 c24215) {
        return (C3305) PARSER.parseFrom(bArr, c24215);
    }

    public static C3305 parseFrom(InputStream inputStream) {
        return (C3305) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C3305 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C3305) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C3305 parseDelimitedFrom(InputStream inputStream) {
        return (C3305) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C3305 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C3305) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C3305 parseFrom(AbstractC3660 abstractC3660) {
        return (C3305) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C3305 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C3305) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C23443 newBuilderForType() {
        return newBuilder();
    }

    public static C23443 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C23443 newBuilder(C3305 c3305) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c3305);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C23443 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C23443(i) : new C23443(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C23443 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C23443(interfaceC7937, 0);
    }

    public static C3305 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC11490 parser() {
        return PARSER;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public InterfaceC11490 getParserForType() {
        return PARSER;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public C3305 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
