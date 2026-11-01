package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۛ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5903 extends AbstractC18245 implements InterfaceC23543 {
    public static final C5903 DEFAULT_INSTANCE;
    public static final int NUM_BLOCKS_FIELD_NUMBER = 2;
    public static final InterfaceC6271 PARSER;
    public static final int START_BLOCK_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C5903(C17192 c17192) {
        this((AbstractC0584) c17192);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C5903.class.getName());
        DEFAULT_INSTANCE = new C5903();
        PARSER = new C12254();
    }

    public C5903(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C5903() {
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable;
        c6956.m18696(C5903.class, C17192.class);
        return c6956;
    }

    @Override // l.InterfaceC23543
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC23543
    public long getStartBlock() {
        return this.startBlock_;
    }

    @Override // l.InterfaceC23543
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC23543
    public long getNumBlocks() {
        return this.numBlocks_;
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
            abstractC22044.mo14253(1, this.startBlock_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14253(2, this.numBlocks_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48962 = (this.bitField0_ & 1) != 0 ? AbstractC22044.m48962(1, this.startBlock_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM48962 += AbstractC22044.m48962(2, this.numBlocks_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48962;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5903)) {
            return super.equals(obj);
        }
        C5903 c5903 = (C5903) obj;
        if (hasStartBlock() != c5903.hasStartBlock()) {
            return false;
        }
        if ((!hasStartBlock() || getStartBlock() == c5903.getStartBlock()) && hasNumBlocks() == c5903.hasNumBlocks()) {
            return (!hasNumBlocks() || getNumBlocks() == c5903.getNumBlocks()) && getUnknownFields().equals(c5903.getUnknownFields());
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
        if (hasStartBlock()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + C9779.m24887(getStartBlock());
        }
        if (hasNumBlocks()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24887(getNumBlocks());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5903 parseFrom(ByteBuffer byteBuffer) {
        return (C5903) PARSER.parseFrom(byteBuffer);
    }

    public static C5903 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C5903) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C5903 parseFrom(AbstractC23725 abstractC23725) {
        return (C5903) PARSER.parseFrom(abstractC23725);
    }

    public static C5903 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C5903) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C5903 parseFrom(byte[] bArr) {
        return (C5903) PARSER.parseFrom(bArr);
    }

    public static C5903 parseFrom(byte[] bArr, C2701 c2701) {
        return (C5903) PARSER.parseFrom(bArr, c2701);
    }

    public static C5903 parseFrom(InputStream inputStream) {
        return (C5903) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C5903 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C5903) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C5903 parseDelimitedFrom(InputStream inputStream) {
        return (C5903) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C5903 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C5903) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C5903 parseFrom(AbstractC3262 abstractC3262) {
        return (C5903) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C5903 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C5903) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C17192 newBuilderForType() {
        return newBuilder();
    }

    public static C17192 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C17192 newBuilder(C5903 c5903) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c5903);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C17192 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C17192(i) : new C17192(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C17192 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C17192(interfaceC6790, 0);
    }

    public static C5903 getDefaultInstance() {
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
    public C5903 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
