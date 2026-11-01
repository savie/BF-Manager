package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩷᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21113 extends AbstractC18245 implements InterfaceC20408 {
    public static final int BATCH_WRITES_FIELD_NUMBER = 2;
    public static final C21113 DEFAULT_INSTANCE;
    public static final InterfaceC6271 PARSER;
    public static final int THREADED_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public boolean batchWrites_;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public boolean threaded_;

    public /* synthetic */ C21113(C7708 c7708) {
        this((AbstractC0584) c7708);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C21113.class.getName());
        DEFAULT_INSTANCE = new C21113();
        PARSER = new C10531();
    }

    public C21113(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C21113() {
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable;
        c6956.m18696(C21113.class, C7708.class);
        return c6956;
    }

    @Override // l.InterfaceC20408
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC20408
    public boolean getThreaded() {
        return this.threaded_;
    }

    @Override // l.InterfaceC20408
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC20408
    public boolean getBatchWrites() {
        return this.batchWrites_;
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
            abstractC22044.mo14240(1, this.threaded_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14240(2, this.batchWrites_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48961 = (this.bitField0_ & 1) != 0 ? AbstractC22044.m48961(1) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM48961 += AbstractC22044.m48961(2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48961;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21113)) {
            return super.equals(obj);
        }
        C21113 c21113 = (C21113) obj;
        if (hasThreaded() != c21113.hasThreaded()) {
            return false;
        }
        if ((!hasThreaded() || getThreaded() == c21113.getThreaded()) && hasBatchWrites() == c21113.hasBatchWrites()) {
            return (!hasBatchWrites() || getBatchWrites() == c21113.getBatchWrites()) && getUnknownFields().equals(c21113.getUnknownFields());
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
        if (hasThreaded()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + C9779.m24888(getThreaded());
        }
        if (hasBatchWrites()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24888(getBatchWrites());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C21113 parseFrom(ByteBuffer byteBuffer) {
        return (C21113) PARSER.parseFrom(byteBuffer);
    }

    public static C21113 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C21113) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C21113 parseFrom(AbstractC23725 abstractC23725) {
        return (C21113) PARSER.parseFrom(abstractC23725);
    }

    public static C21113 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C21113) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C21113 parseFrom(byte[] bArr) {
        return (C21113) PARSER.parseFrom(bArr);
    }

    public static C21113 parseFrom(byte[] bArr, C2701 c2701) {
        return (C21113) PARSER.parseFrom(bArr, c2701);
    }

    public static C21113 parseFrom(InputStream inputStream) {
        return (C21113) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C21113 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C21113) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C21113 parseDelimitedFrom(InputStream inputStream) {
        return (C21113) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C21113 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C21113) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C21113 parseFrom(AbstractC3262 abstractC3262) {
        return (C21113) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C21113 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C21113) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C7708 newBuilderForType() {
        return newBuilder();
    }

    public static C7708 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C7708 newBuilder(C21113 c21113) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c21113);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C7708 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C7708(i) : new C7708(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C7708 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C7708(interfaceC6790, 0);
    }

    public static C21113 getDefaultInstance() {
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
    public C21113 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
