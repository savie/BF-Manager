package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܳۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15237 extends AbstractC9035 implements InterfaceC5543 {
    public static final C15237 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 2;
    public static final InterfaceC11490 PARSER;
    public static final int SIZE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC17084 hash_;
    public byte memoizedIsInitialized;
    public long size_;

    public /* synthetic */ C15237(C19713 c19713) {
        this((AbstractC15001) c19713);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C15237.class.getName());
        DEFAULT_INSTANCE = new C15237();
        PARSER = new C22697();
    }

    public C15237(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.size_ = 0L;
        this.hash_ = AbstractC17084.f55772;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C15237() {
        this.size_ = 0L;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.memoizedIsInitialized = (byte) -1;
        this.hash_ = abstractC17084;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable;
        c7544.m20621(C15237.class, C19713.class);
        return c7544;
    }

    @Override // l.InterfaceC5543
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC5543
    public long getSize() {
        return this.size_;
    }

    @Override // l.InterfaceC5543
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC5543
    public AbstractC17084 getHash() {
        return this.hash_;
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
            abstractC14846.mo14023(1, this.size_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14008(2, this.hash_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35773 = (this.bitField0_ & 1) != 0 ? AbstractC14846.m35773(1, this.size_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35773 += AbstractC14846.m35761(2, this.hash_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35773;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15237)) {
            return super.equals(obj);
        }
        C15237 c15237 = (C15237) obj;
        if (hasSize() != c15237.hasSize()) {
            return false;
        }
        if ((!hasSize() || getSize() == c15237.getSize()) && hasHash() == c15237.hasHash()) {
            return (!hasHash() || getHash().equals(c15237.getHash())) && getUnknownFields().equals(c15237.getUnknownFields());
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
        if (hasSize()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + C23447.m52660(getSize());
        }
        if (hasHash()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + getHash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C15237 parseFrom(ByteBuffer byteBuffer) {
        return (C15237) PARSER.parseFrom(byteBuffer);
    }

    public static C15237 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C15237) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C15237 parseFrom(AbstractC17084 abstractC17084) {
        return (C15237) PARSER.parseFrom(abstractC17084);
    }

    public static C15237 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C15237) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C15237 parseFrom(byte[] bArr) {
        return (C15237) PARSER.parseFrom(bArr);
    }

    public static C15237 parseFrom(byte[] bArr, C24215 c24215) {
        return (C15237) PARSER.parseFrom(bArr, c24215);
    }

    public static C15237 parseFrom(InputStream inputStream) {
        return (C15237) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C15237 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C15237) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C15237 parseDelimitedFrom(InputStream inputStream) {
        return (C15237) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C15237 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C15237) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C15237 parseFrom(AbstractC3660 abstractC3660) {
        return (C15237) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C15237 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C15237) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C19713 newBuilderForType() {
        return newBuilder();
    }

    public static C19713 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C19713 newBuilder(C15237 c15237) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c15237);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C19713 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C19713(i) : new C19713(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C19713 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C19713(interfaceC7937, 0);
    }

    public static C15237 getDefaultInstance() {
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
    public C15237 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
