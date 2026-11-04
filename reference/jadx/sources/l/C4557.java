package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۙ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4557 extends AbstractC9035 implements InterfaceC10522 {
    public static final int DECOMPRESSED_SIZE_FIELD_NUMBER = 4;
    public static final C4557 DEFAULT_INSTANCE;
    public static final int IS_COMPRESSED_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    public static final InterfaceC11490 PARSER;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public byte memoizedIsInitialized;
    public volatile Object packageName_;
    public long version_;

    public /* synthetic */ C4557(C13767 c13767) {
        this((AbstractC15001) c13767);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C4557.class.getName());
        DEFAULT_INSTANCE = new C4557();
        PARSER = new C7056();
    }

    public C4557(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C4557() {
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.packageName_ = "";
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable;
        c7544.m20621(C4557.class, C13767.class);
        return c7544;
    }

    @Override // l.InterfaceC10522
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC10522
    public String getPackageName() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.packageName_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC10522
    public AbstractC17084 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.packageName_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC10522
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC10522
    public long getVersion() {
        return this.version_;
    }

    @Override // l.InterfaceC10522
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC10522
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    @Override // l.InterfaceC10522
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC10522
    public long getDecompressedSize() {
        return this.decompressedSize_;
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
            AbstractC9035.m24111(abstractC14846, 1, this.packageName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14023(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14846.mo14010(3, this.isCompressed_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14846.mo14023(4, this.decompressedSize_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.bitField0_ & 1) != 0 ? AbstractC9035.m24096(1, this.packageName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM24096 += AbstractC14846.m35760(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM24096 += AbstractC14846.m35772(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM24096 += AbstractC14846.m35760(4, this.decompressedSize_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM24096;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4557)) {
            return super.equals(obj);
        }
        C4557 c4557 = (C4557) obj;
        if (hasPackageName() != c4557.hasPackageName()) {
            return false;
        }
        if ((hasPackageName() && !getPackageName().equals(c4557.getPackageName())) || hasVersion() != c4557.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c4557.getVersion()) || hasIsCompressed() != c4557.hasIsCompressed()) {
            return false;
        }
        if ((!hasIsCompressed() || getIsCompressed() == c4557.getIsCompressed()) && hasDecompressedSize() == c4557.hasDecompressedSize()) {
            return (!hasDecompressedSize() || getDecompressedSize() == c4557.getDecompressedSize()) && getUnknownFields().equals(c4557.getUnknownFields());
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
        if (hasPackageName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getPackageName().hashCode();
        }
        if (hasVersion()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52660(getVersion());
        }
        if (hasIsCompressed()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + C23447.m52661(getIsCompressed());
        }
        if (hasDecompressedSize()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + C23447.m52660(getDecompressedSize());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4557 parseFrom(ByteBuffer byteBuffer) {
        return (C4557) PARSER.parseFrom(byteBuffer);
    }

    public static C4557 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C4557) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C4557 parseFrom(AbstractC17084 abstractC17084) {
        return (C4557) PARSER.parseFrom(abstractC17084);
    }

    public static C4557 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C4557) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C4557 parseFrom(byte[] bArr) {
        return (C4557) PARSER.parseFrom(bArr);
    }

    public static C4557 parseFrom(byte[] bArr, C24215 c24215) {
        return (C4557) PARSER.parseFrom(bArr, c24215);
    }

    public static C4557 parseFrom(InputStream inputStream) {
        return (C4557) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C4557 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C4557) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C4557 parseDelimitedFrom(InputStream inputStream) {
        return (C4557) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C4557 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C4557) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C4557 parseFrom(AbstractC3660 abstractC3660) {
        return (C4557) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C4557 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C4557) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C13767 newBuilderForType() {
        return newBuilder();
    }

    public static C13767 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C13767 newBuilder(C4557 c4557) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c4557);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C13767 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C13767(i) : new C13767(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C13767 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C13767(interfaceC7937, 0);
    }

    public static C4557 getDefaultInstance() {
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
    public C4557 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
