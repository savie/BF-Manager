package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۨ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12014 extends AbstractC9035 implements InterfaceC23949 {
    public static final C12014 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final InterfaceC11490 PARSER;
    public static final int PARTITION_NAMES_FIELD_NUMBER = 3;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public volatile Object name_;
    public C1072 partitionNames_;
    public long size_;

    public /* synthetic */ C12014(C20219 c20219) {
        this((AbstractC15001) c20219);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C12014.class.getName());
        DEFAULT_INSTANCE = new C12014();
        PARSER = new C3065();
    }

    public C12014(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C1072.m4023();
        this.memoizedIsInitialized = (byte) -1;
    }

    public C12014() {
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C1072.m4023();
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.partitionNames_ = C1072.m4023();
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable;
        c7544.m20621(C12014.class, C20219.class);
        return c7544;
    }

    @Override // l.InterfaceC23949
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC23949
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.name_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC23949
    public AbstractC17084 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.name_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC23949
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC23949
    public long getSize() {
        return this.size_;
    }

    @Override // l.InterfaceC23949
    public InterfaceC3287 getPartitionNamesList() {
        return this.partitionNames_;
    }

    @Override // l.InterfaceC23949
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // l.InterfaceC23949
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // l.InterfaceC23949
    public AbstractC17084 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m4027(i);
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
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14023(2, this.size_);
        }
        for (int i = 0; i < this.partitionNames_.size(); i++) {
            AbstractC9035.m24111(abstractC14846, 3, this.partitionNames_.mo4025(i));
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.bitField0_ & 1) != 0 ? AbstractC9035.m24096(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM24096 += AbstractC14846.m35773(2, this.size_);
        }
        int iM24117 = 0;
        for (int i2 = 0; i2 < this.partitionNames_.size(); i2++) {
            iM24117 += AbstractC9035.m24117(this.partitionNames_.mo4025(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getPartitionNamesList().size() + iM24096 + iM24117;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12014)) {
            return super.equals(obj);
        }
        C12014 c12014 = (C12014) obj;
        if (hasName() != c12014.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c12014.getName())) && hasSize() == c12014.hasSize()) {
            return (!hasSize() || getSize() == c12014.getSize()) && getPartitionNamesList().equals(c12014.getPartitionNamesList()) && getUnknownFields().equals(c12014.getUnknownFields());
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
        if (hasName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasSize()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52660(getSize());
        }
        if (getPartitionNamesCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + getPartitionNamesList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C12014 parseFrom(ByteBuffer byteBuffer) {
        return (C12014) PARSER.parseFrom(byteBuffer);
    }

    public static C12014 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C12014) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C12014 parseFrom(AbstractC17084 abstractC17084) {
        return (C12014) PARSER.parseFrom(abstractC17084);
    }

    public static C12014 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C12014) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C12014 parseFrom(byte[] bArr) {
        return (C12014) PARSER.parseFrom(bArr);
    }

    public static C12014 parseFrom(byte[] bArr, C24215 c24215) {
        return (C12014) PARSER.parseFrom(bArr, c24215);
    }

    public static C12014 parseFrom(InputStream inputStream) {
        return (C12014) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C12014 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C12014) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C12014 parseDelimitedFrom(InputStream inputStream) {
        return (C12014) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C12014 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C12014) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C12014 parseFrom(AbstractC3660 abstractC3660) {
        return (C12014) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C12014 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C12014) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C20219 newBuilderForType() {
        return newBuilder();
    }

    public static C20219 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C20219 newBuilder(C12014 c12014) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c12014);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C20219 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C20219(i) : new C20219(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C20219 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C20219(interfaceC7937, 0);
    }

    public static C12014 getDefaultInstance() {
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
    public C12014 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
