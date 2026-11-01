package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩹᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22525 extends AbstractC18245 implements InterfaceC13353 {
    public static final C22525 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 2;
    public static final InterfaceC6271 PARSER;
    public static final int SIZE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public AbstractC23725 hash_;
    public byte memoizedIsInitialized;
    public long size_;

    public /* synthetic */ C22525(C5591 c5591) {
        this((AbstractC0584) c5591);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C22525.class.getName());
        DEFAULT_INSTANCE = new C22525();
        PARSER = new C2768();
    }

    public C22525(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.size_ = 0L;
        this.hash_ = AbstractC23725.f76778;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C22525() {
        this.size_ = 0L;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.memoizedIsInitialized = (byte) -1;
        this.hash_ = abstractC23725;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable;
        c6956.m18696(C22525.class, C5591.class);
        return c6956;
    }

    @Override // l.InterfaceC13353
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC13353
    public long getSize() {
        return this.size_;
    }

    @Override // l.InterfaceC13353
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC13353
    public AbstractC23725 getHash() {
        return this.hash_;
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
            abstractC22044.mo14253(1, this.size_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14239(2, this.hash_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48962 = (this.bitField0_ & 1) != 0 ? AbstractC22044.m48962(1, this.size_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM48962 += AbstractC22044.m48968(2, this.hash_);
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
        if (!(obj instanceof C22525)) {
            return super.equals(obj);
        }
        C22525 c22525 = (C22525) obj;
        if (hasSize() != c22525.hasSize()) {
            return false;
        }
        if ((!hasSize() || getSize() == c22525.getSize()) && hasHash() == c22525.hasHash()) {
            return (!hasHash() || getHash().equals(c22525.getHash())) && getUnknownFields().equals(c22525.getUnknownFields());
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
        if (hasSize()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + C9779.m24887(getSize());
        }
        if (hasHash()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + getHash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22525 parseFrom(ByteBuffer byteBuffer) {
        return (C22525) PARSER.parseFrom(byteBuffer);
    }

    public static C22525 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C22525) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C22525 parseFrom(AbstractC23725 abstractC23725) {
        return (C22525) PARSER.parseFrom(abstractC23725);
    }

    public static C22525 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C22525) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C22525 parseFrom(byte[] bArr) {
        return (C22525) PARSER.parseFrom(bArr);
    }

    public static C22525 parseFrom(byte[] bArr, C2701 c2701) {
        return (C22525) PARSER.parseFrom(bArr, c2701);
    }

    public static C22525 parseFrom(InputStream inputStream) {
        return (C22525) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C22525 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C22525) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C22525 parseDelimitedFrom(InputStream inputStream) {
        return (C22525) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C22525 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C22525) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C22525 parseFrom(AbstractC3262 abstractC3262) {
        return (C22525) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C22525 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C22525) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C5591 newBuilderForType() {
        return newBuilder();
    }

    public static C5591 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C5591 newBuilder(C22525 c22525) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c22525);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C5591 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C5591(i) : new C5591(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C5591 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C5591(interfaceC6790, 0);
    }

    public static C22525 getDefaultInstance() {
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
    public C22525 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
