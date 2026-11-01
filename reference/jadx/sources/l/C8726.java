package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۡ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8726 extends AbstractC18245 implements InterfaceC7314 {
    public static final C8726 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final InterfaceC6271 PARSER;
    public static final int PARTITION_NAMES_FIELD_NUMBER = 3;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public volatile Object name_;
    public C21463 partitionNames_;
    public long size_;

    public /* synthetic */ C8726(C19309 c19309) {
        this((AbstractC0584) c19309);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C8726.class.getName());
        DEFAULT_INSTANCE = new C8726();
        PARSER = new C8020();
    }

    public C8726(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C21463.m48084();
        this.memoizedIsInitialized = (byte) -1;
    }

    public C8726() {
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C21463.m48084();
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.partitionNames_ = C21463.m48084();
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable;
        c6956.m18696(C8726.class, C19309.class);
        return c6956;
    }

    @Override // l.InterfaceC7314
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC7314
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.name_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC7314
    public AbstractC23725 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.name_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC7314
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC7314
    public long getSize() {
        return this.size_;
    }

    @Override // l.InterfaceC7314
    public InterfaceC3448 getPartitionNamesList() {
        return this.partitionNames_;
    }

    @Override // l.InterfaceC7314
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // l.InterfaceC7314
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // l.InterfaceC7314
    public AbstractC23725 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m48086(i);
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
        if (!hasName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14253(2, this.size_);
        }
        for (int i = 0; i < this.partitionNames_.size(); i++) {
            AbstractC18245.m42405(abstractC22044, 3, this.partitionNames_.mo21384(i));
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.bitField0_ & 1) != 0 ? AbstractC18245.m42390(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM42390 += AbstractC22044.m48962(2, this.size_);
        }
        int iM42412 = 0;
        for (int i2 = 0; i2 < this.partitionNames_.size(); i2++) {
            iM42412 += AbstractC18245.m42412(this.partitionNames_.mo21384(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + getPartitionNamesList().size() + iM42390 + iM42412;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8726)) {
            return super.equals(obj);
        }
        C8726 c8726 = (C8726) obj;
        if (hasName() != c8726.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(c8726.getName())) && hasSize() == c8726.hasSize()) {
            return (!hasSize() || getSize() == c8726.getSize()) && getPartitionNamesList().equals(c8726.getPartitionNamesList()) && getUnknownFields().equals(c8726.getUnknownFields());
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
        if (hasName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasSize()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24887(getSize());
        }
        if (getPartitionNamesCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + getPartitionNamesList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8726 parseFrom(ByteBuffer byteBuffer) {
        return (C8726) PARSER.parseFrom(byteBuffer);
    }

    public static C8726 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C8726) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C8726 parseFrom(AbstractC23725 abstractC23725) {
        return (C8726) PARSER.parseFrom(abstractC23725);
    }

    public static C8726 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C8726) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C8726 parseFrom(byte[] bArr) {
        return (C8726) PARSER.parseFrom(bArr);
    }

    public static C8726 parseFrom(byte[] bArr, C2701 c2701) {
        return (C8726) PARSER.parseFrom(bArr, c2701);
    }

    public static C8726 parseFrom(InputStream inputStream) {
        return (C8726) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C8726 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C8726) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C8726 parseDelimitedFrom(InputStream inputStream) {
        return (C8726) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C8726 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C8726) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C8726 parseFrom(AbstractC3262 abstractC3262) {
        return (C8726) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C8726 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C8726) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C19309 newBuilderForType() {
        return newBuilder();
    }

    public static C19309 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C19309 newBuilder(C8726 c8726) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c8726);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C19309 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C19309(i) : new C19309(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C19309 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C19309(interfaceC6790, 0);
    }

    public static C8726 getDefaultInstance() {
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
    public C8726 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
