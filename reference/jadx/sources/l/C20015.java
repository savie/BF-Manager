package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20015 extends AbstractC18245 implements InterfaceC16487 {
    public static final int COMPRESSION_FACTOR_FIELD_NUMBER = 7;
    public static final int COW_VERSION_FIELD_NUMBER = 5;
    public static final C20015 DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    public static final InterfaceC6271 PARSER;
    public static final int SNAPSHOT_ENABLED_FIELD_NUMBER = 2;
    public static final int VABC_COMPRESSION_PARAM_FIELD_NUMBER = 4;
    public static final int VABC_ENABLED_FIELD_NUMBER = 3;
    public static final int VABC_FEATURE_SET_FIELD_NUMBER = 6;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long compressionFactor_;
    public int cowVersion_;
    public List groups_;
    public byte memoizedIsInitialized;
    public boolean snapshotEnabled_;
    public volatile Object vabcCompressionParam_;
    public boolean vabcEnabled_;
    public C21113 vabcFeatureSet_;

    public /* synthetic */ C20015(C15782 c15782) {
        this((AbstractC0584) c15782);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C20015.class.getName());
        DEFAULT_INSTANCE = new C20015();
        PARSER = new C20720();
    }

    public C20015(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C20015() {
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable;
        c6956.m18696(C20015.class, C15782.class);
        return c6956;
    }

    @Override // l.InterfaceC16487
    public List getGroupsList() {
        return this.groups_;
    }

    @Override // l.InterfaceC16487
    public List getGroupsOrBuilderList() {
        return this.groups_;
    }

    @Override // l.InterfaceC16487
    public int getGroupsCount() {
        return this.groups_.size();
    }

    @Override // l.InterfaceC16487
    public C8726 getGroups(int i) {
        return (C8726) this.groups_.get(i);
    }

    @Override // l.InterfaceC16487
    public InterfaceC7314 getGroupsOrBuilder(int i) {
        return (InterfaceC7314) this.groups_.get(i);
    }

    @Override // l.InterfaceC16487
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC16487
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    @Override // l.InterfaceC16487
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC16487
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    @Override // l.InterfaceC16487
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC16487
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.vabcCompressionParam_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC16487
    public AbstractC23725 getVabcCompressionParamBytes() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.vabcCompressionParam_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC16487
    public boolean hasCowVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC16487
    public int getCowVersion() {
        return this.cowVersion_;
    }

    @Override // l.InterfaceC16487
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC16487
    public C21113 getVabcFeatureSet() {
        C21113 c21113 = this.vabcFeatureSet_;
        return c21113 == null ? C21113.getDefaultInstance() : c21113;
    }

    @Override // l.InterfaceC16487
    public InterfaceC20408 getVabcFeatureSetOrBuilder() {
        C21113 c21113 = this.vabcFeatureSet_;
        return c21113 == null ? C21113.getDefaultInstance() : c21113;
    }

    @Override // l.InterfaceC16487
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC16487
    public long getCompressionFactor() {
        return this.compressionFactor_;
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
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        for (int i = 0; i < this.groups_.size(); i++) {
            abstractC22044.mo14254(1, (InterfaceC23206) this.groups_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC22044.mo14240(2, this.snapshotEnabled_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14240(3, this.vabcEnabled_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC18245.m42405(abstractC22044, 4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC22044.mo14231(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC22044.mo14254(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC22044.mo14253(7, this.compressionFactor_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48962 = 0;
        for (int i2 = 0; i2 < this.groups_.size(); i2++) {
            iM48962 += AbstractC22044.m48963(1, (InterfaceC23206) this.groups_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            iM48962 += AbstractC22044.m48961(2);
        }
        if ((this.bitField0_ & 2) != 0) {
            iM48962 += AbstractC22044.m48961(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM48962 += AbstractC18245.m42390(4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM48962 += AbstractC22044.m48960(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM48962 += AbstractC22044.m48963(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM48962 += AbstractC22044.m48962(7, this.compressionFactor_);
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
        if (!(obj instanceof C20015)) {
            return super.equals(obj);
        }
        C20015 c20015 = (C20015) obj;
        if (!getGroupsList().equals(c20015.getGroupsList()) || hasSnapshotEnabled() != c20015.hasSnapshotEnabled()) {
            return false;
        }
        if ((hasSnapshotEnabled() && getSnapshotEnabled() != c20015.getSnapshotEnabled()) || hasVabcEnabled() != c20015.hasVabcEnabled()) {
            return false;
        }
        if ((hasVabcEnabled() && getVabcEnabled() != c20015.getVabcEnabled()) || hasVabcCompressionParam() != c20015.hasVabcCompressionParam()) {
            return false;
        }
        if ((hasVabcCompressionParam() && !getVabcCompressionParam().equals(c20015.getVabcCompressionParam())) || hasCowVersion() != c20015.hasCowVersion()) {
            return false;
        }
        if ((hasCowVersion() && getCowVersion() != c20015.getCowVersion()) || hasVabcFeatureSet() != c20015.hasVabcFeatureSet()) {
            return false;
        }
        if ((!hasVabcFeatureSet() || getVabcFeatureSet().equals(c20015.getVabcFeatureSet())) && hasCompressionFactor() == c20015.hasCompressionFactor()) {
            return (!hasCompressionFactor() || getCompressionFactor() == c20015.getCompressionFactor()) && getUnknownFields().equals(c20015.getUnknownFields());
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
        if (getGroupsCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getGroupsList().hashCode();
        }
        if (hasSnapshotEnabled()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24888(getSnapshotEnabled());
        }
        if (hasVabcEnabled()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + C9779.m24888(getVabcEnabled());
        }
        if (hasVabcCompressionParam()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + getVabcCompressionParam().hashCode();
        }
        if (hasCowVersion()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + getCowVersion();
        }
        if (hasVabcFeatureSet()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + getVabcFeatureSet().hashCode();
        }
        if (hasCompressionFactor()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + C9779.m24887(getCompressionFactor());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C20015 parseFrom(ByteBuffer byteBuffer) {
        return (C20015) PARSER.parseFrom(byteBuffer);
    }

    public static C20015 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C20015) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C20015 parseFrom(AbstractC23725 abstractC23725) {
        return (C20015) PARSER.parseFrom(abstractC23725);
    }

    public static C20015 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C20015) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C20015 parseFrom(byte[] bArr) {
        return (C20015) PARSER.parseFrom(bArr);
    }

    public static C20015 parseFrom(byte[] bArr, C2701 c2701) {
        return (C20015) PARSER.parseFrom(bArr, c2701);
    }

    public static C20015 parseFrom(InputStream inputStream) {
        return (C20015) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C20015 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C20015) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C20015 parseDelimitedFrom(InputStream inputStream) {
        return (C20015) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C20015 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C20015) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C20015 parseFrom(AbstractC3262 abstractC3262) {
        return (C20015) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C20015 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C20015) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C15782 newBuilderForType() {
        return newBuilder();
    }

    public static C15782 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C15782 newBuilder(C20015 c20015) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c20015);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C15782 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C15782(i) : new C15782(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C15782 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C15782(interfaceC6790, 0);
    }

    public static C20015 getDefaultInstance() {
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
    public C20015 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
