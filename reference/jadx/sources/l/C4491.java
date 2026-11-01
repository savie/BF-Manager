package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۙ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4491 extends AbstractC18245 implements InterfaceC11548 {
    public static final int DECOMPRESSED_SIZE_FIELD_NUMBER = 4;
    public static final C4491 DEFAULT_INSTANCE;
    public static final int IS_COMPRESSED_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    public static final InterfaceC6271 PARSER;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public byte memoizedIsInitialized;
    public volatile Object packageName_;
    public long version_;

    public /* synthetic */ C4491(C3163 c3163) {
        this((AbstractC0584) c3163);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C4491.class.getName());
        DEFAULT_INSTANCE = new C4491();
        PARSER = new C9515();
    }

    public C4491(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C4491() {
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.packageName_ = "";
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable;
        c6956.m18696(C4491.class, C3163.class);
        return c6956;
    }

    @Override // l.InterfaceC11548
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC11548
    public String getPackageName() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.packageName_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC11548
    public AbstractC23725 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.packageName_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC11548
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC11548
    public long getVersion() {
        return this.version_;
    }

    @Override // l.InterfaceC11548
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC11548
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    @Override // l.InterfaceC11548
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC11548
    public long getDecompressedSize() {
        return this.decompressedSize_;
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
            AbstractC18245.m42405(abstractC22044, 1, this.packageName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14253(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC22044.mo14240(3, this.isCompressed_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC22044.mo14253(4, this.decompressedSize_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.bitField0_ & 1) != 0 ? AbstractC18245.m42390(1, this.packageName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM42390 += AbstractC22044.m48967(2, this.version_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM42390 += AbstractC22044.m48961(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM42390 += AbstractC22044.m48967(4, this.decompressedSize_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM42390;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4491)) {
            return super.equals(obj);
        }
        C4491 c4491 = (C4491) obj;
        if (hasPackageName() != c4491.hasPackageName()) {
            return false;
        }
        if ((hasPackageName() && !getPackageName().equals(c4491.getPackageName())) || hasVersion() != c4491.hasVersion()) {
            return false;
        }
        if ((hasVersion() && getVersion() != c4491.getVersion()) || hasIsCompressed() != c4491.hasIsCompressed()) {
            return false;
        }
        if ((!hasIsCompressed() || getIsCompressed() == c4491.getIsCompressed()) && hasDecompressedSize() == c4491.hasDecompressedSize()) {
            return (!hasDecompressedSize() || getDecompressedSize() == c4491.getDecompressedSize()) && getUnknownFields().equals(c4491.getUnknownFields());
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
        if (hasPackageName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getPackageName().hashCode();
        }
        if (hasVersion()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24887(getVersion());
        }
        if (hasIsCompressed()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + C9779.m24888(getIsCompressed());
        }
        if (hasDecompressedSize()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + C9779.m24887(getDecompressedSize());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4491 parseFrom(ByteBuffer byteBuffer) {
        return (C4491) PARSER.parseFrom(byteBuffer);
    }

    public static C4491 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C4491) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C4491 parseFrom(AbstractC23725 abstractC23725) {
        return (C4491) PARSER.parseFrom(abstractC23725);
    }

    public static C4491 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C4491) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C4491 parseFrom(byte[] bArr) {
        return (C4491) PARSER.parseFrom(bArr);
    }

    public static C4491 parseFrom(byte[] bArr, C2701 c2701) {
        return (C4491) PARSER.parseFrom(bArr, c2701);
    }

    public static C4491 parseFrom(InputStream inputStream) {
        return (C4491) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C4491 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C4491) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C4491 parseDelimitedFrom(InputStream inputStream) {
        return (C4491) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C4491 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C4491) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C4491 parseFrom(AbstractC3262 abstractC3262) {
        return (C4491) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C4491 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C4491) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C3163 newBuilderForType() {
        return newBuilder();
    }

    public static C3163 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C3163 newBuilder(C4491 c4491) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c4491);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C3163 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C3163(i) : new C3163(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C3163 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C3163(interfaceC6790, 0);
    }

    public static C4491 getDefaultInstance() {
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
    public C4491 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
