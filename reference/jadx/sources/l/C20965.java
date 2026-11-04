package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20965 extends AbstractC9035 implements InterfaceC0082 {
    public static final int COMPRESSION_FACTOR_FIELD_NUMBER = 7;
    public static final int COW_VERSION_FIELD_NUMBER = 5;
    public static final C20965 DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    public static final InterfaceC11490 PARSER;
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
    public C4051 vabcFeatureSet_;

    public /* synthetic */ C20965(C14251 c14251) {
        this((AbstractC15001) c14251);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C20965.class.getName());
        DEFAULT_INSTANCE = new C20965();
        PARSER = new C3811();
    }

    public C20965(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C20965() {
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.compressionFactor_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable;
        c7544.m20621(C20965.class, C14251.class);
        return c7544;
    }

    @Override // l.InterfaceC0082
    public List getGroupsList() {
        return this.groups_;
    }

    @Override // l.InterfaceC0082
    public List getGroupsOrBuilderList() {
        return this.groups_;
    }

    @Override // l.InterfaceC0082
    public int getGroupsCount() {
        return this.groups_.size();
    }

    @Override // l.InterfaceC0082
    public C12014 getGroups(int i) {
        return (C12014) this.groups_.get(i);
    }

    @Override // l.InterfaceC0082
    public InterfaceC23949 getGroupsOrBuilder(int i) {
        return (InterfaceC23949) this.groups_.get(i);
    }

    @Override // l.InterfaceC0082
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC0082
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    @Override // l.InterfaceC0082
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC0082
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    @Override // l.InterfaceC0082
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC0082
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.vabcCompressionParam_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC0082
    public AbstractC17084 getVabcCompressionParamBytes() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.vabcCompressionParam_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC0082
    public boolean hasCowVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC0082
    public int getCowVersion() {
        return this.cowVersion_;
    }

    @Override // l.InterfaceC0082
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC0082
    public C4051 getVabcFeatureSet() {
        C4051 c4051 = this.vabcFeatureSet_;
        return c4051 == null ? C4051.getDefaultInstance() : c4051;
    }

    @Override // l.InterfaceC0082
    public InterfaceC21205 getVabcFeatureSetOrBuilder() {
        C4051 c4051 = this.vabcFeatureSet_;
        return c4051 == null ? C4051.getDefaultInstance() : c4051;
    }

    @Override // l.InterfaceC0082
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC0082
    public long getCompressionFactor() {
        return this.compressionFactor_;
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
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        for (int i = 0; i < this.groups_.size(); i++) {
            abstractC14846.mo14025(1, (InterfaceC18775) this.groups_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC14846.mo14010(2, this.snapshotEnabled_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14010(3, this.vabcEnabled_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC9035.m24111(abstractC14846, 4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14846.mo14027(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14846.mo14025(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14846.mo14023(7, this.compressionFactor_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35773 = 0;
        for (int i2 = 0; i2 < this.groups_.size(); i2++) {
            iM35773 += AbstractC14846.m35774(1, (InterfaceC18775) this.groups_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            iM35773 += AbstractC14846.m35772(2);
        }
        if ((this.bitField0_ & 2) != 0) {
            iM35773 += AbstractC14846.m35772(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35773 += AbstractC9035.m24096(4, this.vabcCompressionParam_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35773 += AbstractC14846.m35764(5, this.cowVersion_);
        }
        if ((this.bitField0_ & 16) != 0) {
            iM35773 += AbstractC14846.m35774(6, getVabcFeatureSet());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM35773 += AbstractC14846.m35773(7, this.compressionFactor_);
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
        if (!(obj instanceof C20965)) {
            return super.equals(obj);
        }
        C20965 c20965 = (C20965) obj;
        if (!getGroupsList().equals(c20965.getGroupsList()) || hasSnapshotEnabled() != c20965.hasSnapshotEnabled()) {
            return false;
        }
        if ((hasSnapshotEnabled() && getSnapshotEnabled() != c20965.getSnapshotEnabled()) || hasVabcEnabled() != c20965.hasVabcEnabled()) {
            return false;
        }
        if ((hasVabcEnabled() && getVabcEnabled() != c20965.getVabcEnabled()) || hasVabcCompressionParam() != c20965.hasVabcCompressionParam()) {
            return false;
        }
        if ((hasVabcCompressionParam() && !getVabcCompressionParam().equals(c20965.getVabcCompressionParam())) || hasCowVersion() != c20965.hasCowVersion()) {
            return false;
        }
        if ((hasCowVersion() && getCowVersion() != c20965.getCowVersion()) || hasVabcFeatureSet() != c20965.hasVabcFeatureSet()) {
            return false;
        }
        if ((!hasVabcFeatureSet() || getVabcFeatureSet().equals(c20965.getVabcFeatureSet())) && hasCompressionFactor() == c20965.hasCompressionFactor()) {
            return (!hasCompressionFactor() || getCompressionFactor() == c20965.getCompressionFactor()) && getUnknownFields().equals(c20965.getUnknownFields());
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
        if (getGroupsCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getGroupsList().hashCode();
        }
        if (hasSnapshotEnabled()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52661(getSnapshotEnabled());
        }
        if (hasVabcEnabled()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + C23447.m52661(getVabcEnabled());
        }
        if (hasVabcCompressionParam()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + getVabcCompressionParam().hashCode();
        }
        if (hasCowVersion()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + getCowVersion();
        }
        if (hasVabcFeatureSet()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + getVabcFeatureSet().hashCode();
        }
        if (hasCompressionFactor()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + C23447.m52660(getCompressionFactor());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C20965 parseFrom(ByteBuffer byteBuffer) {
        return (C20965) PARSER.parseFrom(byteBuffer);
    }

    public static C20965 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C20965) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C20965 parseFrom(AbstractC17084 abstractC17084) {
        return (C20965) PARSER.parseFrom(abstractC17084);
    }

    public static C20965 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C20965) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C20965 parseFrom(byte[] bArr) {
        return (C20965) PARSER.parseFrom(bArr);
    }

    public static C20965 parseFrom(byte[] bArr, C24215 c24215) {
        return (C20965) PARSER.parseFrom(bArr, c24215);
    }

    public static C20965 parseFrom(InputStream inputStream) {
        return (C20965) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C20965 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C20965) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C20965 parseDelimitedFrom(InputStream inputStream) {
        return (C20965) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C20965 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C20965) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C20965 parseFrom(AbstractC3660 abstractC3660) {
        return (C20965) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C20965 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C20965) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C14251 newBuilderForType() {
        return newBuilder();
    }

    public static C14251 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C14251 newBuilder(C20965 c20965) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c20965);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C14251 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C14251(i) : new C14251(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C14251 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C14251(interfaceC7937, 0);
    }

    public static C20965 getDefaultInstance() {
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
    public C20965 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
