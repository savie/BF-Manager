package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14251 extends AbstractC15001 implements InterfaceC0082 {
    public int bitField0_;
    public long compressionFactor_;
    public int cowVersion_;
    public C14473 groupsBuilder_;
    public List groups_;
    public boolean snapshotEnabled_;
    public Object vabcCompressionParam_;
    public boolean vabcEnabled_;
    public C9998 vabcFeatureSetBuilder_;
    public C4051 vabcFeatureSet_;

    public /* synthetic */ C14251(int i) {
        this();
    }

    public /* synthetic */ C14251(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable;
        c7544.m20621(C20965.class, C14251.class);
        return c7544;
    }

    public C14251() {
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    public C14251(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC9035.alwaysUseFieldBuilders) {
            getGroupsFieldBuilder();
            getVabcFeatureSetFieldBuilder();
        }
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C14251 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            this.groups_ = Collections.EMPTY_LIST;
        } else {
            this.groups_ = null;
            c14473.m34945();
        }
        this.bitField0_ &= -2;
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.vabcFeatureSet_ = null;
        C9998 c9998 = this.vabcFeatureSetBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.vabcFeatureSetBuilder_ = null;
        }
        this.compressionFactor_ = 0L;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C20965 getDefaultInstanceForType() {
        return C20965.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C20965 build() {
        C20965 c20965BuildPartial = buildPartial();
        if (c20965BuildPartial.isInitialized()) {
            return c20965BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20965BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C20965 buildPartial() {
        C20965 c20965 = new C20965(this);
        buildPartialRepeatedFields(c20965);
        if (this.bitField0_ != 0) {
            buildPartial0(c20965);
        }
        onBuilt();
        return c20965;
    }

    private void buildPartialRepeatedFields(C20965 c20965) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            if ((this.bitField0_ & 1) != 0) {
                this.groups_ = C4681.unmodifiableList(this.groups_);
                this.bitField0_ &= -2;
            }
            c20965.groups_ = this.groups_;
            return;
        }
        c20965.groups_ = c14473.m34950();
    }

    private void buildPartial0(C20965 c20965) {
        int i;
        C4051 c4051;
        int i2 = this.bitField0_;
        if ((i2 & 2) != 0) {
            c20965.snapshotEnabled_ = this.snapshotEnabled_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            c20965.vabcEnabled_ = this.vabcEnabled_;
            i |= 2;
        }
        if ((i2 & 8) != 0) {
            c20965.vabcCompressionParam_ = this.vabcCompressionParam_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c20965.cowVersion_ = this.cowVersion_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            C9998 c9998 = this.vabcFeatureSetBuilder_;
            if (c9998 == null) {
                c4051 = this.vabcFeatureSet_;
            } else {
                c4051 = (C4051) c9998.m25854();
            }
            c20965.vabcFeatureSet_ = c4051;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            c20965.compressionFactor_ = this.compressionFactor_;
            i |= 32;
        }
        c20965.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C14251 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20965) {
            return mergeFrom((C20965) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C14251 mergeFrom(C20965 c20965) {
        if (c20965 == C20965.getDefaultInstance()) {
            return this;
        }
        if (this.groupsBuilder_ == null) {
            if (!c20965.groups_.isEmpty()) {
                if (this.groups_.isEmpty()) {
                    this.groups_ = c20965.groups_;
                    this.bitField0_ &= -2;
                } else {
                    ensureGroupsIsMutable();
                    this.groups_.addAll(c20965.groups_);
                }
                onChanged();
            }
        } else if (!c20965.groups_.isEmpty()) {
            if (this.groupsBuilder_.m34938()) {
                this.groupsBuilder_.m34954();
                this.groupsBuilder_ = null;
                this.groups_ = c20965.groups_;
                this.bitField0_ &= -2;
                this.groupsBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getGroupsFieldBuilder() : null;
            } else {
                this.groupsBuilder_.m34942(c20965.groups_);
            }
        }
        if (c20965.hasSnapshotEnabled()) {
            setSnapshotEnabled(c20965.getSnapshotEnabled());
        }
        if (c20965.hasVabcEnabled()) {
            setVabcEnabled(c20965.getVabcEnabled());
        }
        if (c20965.hasVabcCompressionParam()) {
            this.vabcCompressionParam_ = c20965.vabcCompressionParam_;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (c20965.hasCowVersion()) {
            setCowVersion(c20965.getCowVersion());
        }
        if (c20965.hasVabcFeatureSet()) {
            mergeVabcFeatureSet(c20965.getVabcFeatureSet());
        }
        if (c20965.hasCompressionFactor()) {
            setCompressionFactor(c20965.getCompressionFactor());
        }
        mo2317mergeUnknownFields(c20965.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C14251 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            C12014 c12014 = (C12014) abstractC3660.mo11877(C12014.parser(), c24215);
                            C14473 c14473 = this.groupsBuilder_;
                            if (c14473 == null) {
                                ensureGroupsIsMutable();
                                this.groups_.add(c12014);
                            } else {
                                c14473.m34953(c12014);
                            }
                        } else if (iMo11876 == 16) {
                            this.snapshotEnabled_ = abstractC3660.mo11894();
                            this.bitField0_ |= 2;
                        } else if (iMo11876 == 24) {
                            this.vabcEnabled_ = abstractC3660.mo11894();
                            this.bitField0_ |= 4;
                        } else if (iMo11876 == 34) {
                            this.vabcCompressionParam_ = abstractC3660.mo11890();
                            this.bitField0_ |= 8;
                        } else if (iMo11876 == 40) {
                            this.cowVersion_ = abstractC3660.mo11889();
                            this.bitField0_ |= 16;
                        } else if (iMo11876 == 50) {
                            abstractC3660.mo11881(getVabcFeatureSetFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 32;
                        } else if (iMo11876 == 56) {
                            this.compressionFactor_ = abstractC3660.mo11896();
                            this.bitField0_ |= 64;
                        } else if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
                        }
                    }
                    z = true;
                } catch (C20463 e) {
                    throw e.m46971();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
        return this;
    }

    private void ensureGroupsIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.groups_ = new ArrayList(this.groups_);
            this.bitField0_ |= 1;
        }
    }

    @Override // l.InterfaceC0082
    public List getGroupsList() {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.groups_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC0082
    public int getGroupsCount() {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            return this.groups_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC0082
    public C12014 getGroups(int i) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            return (C12014) this.groups_.get(i);
        }
        return (C12014) c14473.m34951(i);
    }

    public C14251 setGroups(int i, C12014 c12014) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            c12014.getClass();
            ensureGroupsIsMutable();
            this.groups_.set(i, c12014);
            onChanged();
            return this;
        }
        c14473.m34946(i, c12014);
        return this;
    }

    public C14251 setGroups(int i, C20219 c20219) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            ensureGroupsIsMutable();
            this.groups_.set(i, c20219.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c20219.build());
        return this;
    }

    public C14251 addGroups(C12014 c12014) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            c12014.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(c12014);
            onChanged();
            return this;
        }
        c14473.m34953(c12014);
        return this;
    }

    public C14251 addGroups(int i, C12014 c12014) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            c12014.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(i, c12014);
            onChanged();
            return this;
        }
        c14473.m34952(i, c12014);
        return this;
    }

    public C14251 addGroups(C20219 c20219) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(c20219.build());
            onChanged();
            return this;
        }
        c14473.m34953(c20219.build());
        return this;
    }

    public C14251 addGroups(int i, C20219 c20219) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(i, c20219.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c20219.build());
        return this;
    }

    public C14251 addAllGroups(Iterable iterable) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            ensureGroupsIsMutable();
            AbstractC1225.m4447(iterable, this.groups_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C14251 clearGroups() {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            this.groups_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C14251 removeGroups(int i) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            ensureGroupsIsMutable();
            this.groups_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C20219 getGroupsBuilder(int i) {
        return (C20219) getGroupsFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC0082
    public InterfaceC23949 getGroupsOrBuilder(int i) {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 == null) {
            return (InterfaceC23949) this.groups_.get(i);
        }
        return (InterfaceC23949) c14473.m34944(i);
    }

    @Override // l.InterfaceC0082
    public List getGroupsOrBuilderList() {
        C14473 c14473 = this.groupsBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.groups_);
    }

    public C20219 addGroupsBuilder() {
        return (C20219) getGroupsFieldBuilder().m34941(C12014.getDefaultInstance());
    }

    public C20219 addGroupsBuilder(int i) {
        return (C20219) getGroupsFieldBuilder().m34940(i, C12014.getDefaultInstance());
    }

    public List getGroupsBuilderList() {
        return getGroupsFieldBuilder().m34949();
    }

    private C14473 getGroupsFieldBuilder() {
        if (this.groupsBuilder_ == null) {
            this.groupsBuilder_ = new C14473(this.groups_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
            this.groups_ = null;
        }
        return this.groupsBuilder_;
    }

    @Override // l.InterfaceC0082
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC0082
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    public C14251 setSnapshotEnabled(boolean z) {
        this.snapshotEnabled_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C14251 clearSnapshotEnabled() {
        this.bitField0_ &= -3;
        this.snapshotEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC0082
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC0082
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    public C14251 setVabcEnabled(boolean z) {
        this.vabcEnabled_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C14251 clearVabcEnabled() {
        this.bitField0_ &= -5;
        this.vabcEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC0082
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC0082
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.vabcCompressionParam_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
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

    public C14251 setVabcCompressionParam(String str) {
        str.getClass();
        this.vabcCompressionParam_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C14251 clearVabcCompressionParam() {
        this.vabcCompressionParam_ = C20965.getDefaultInstance().getVabcCompressionParam();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C14251 setVabcCompressionParamBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.vabcCompressionParam_ = abstractC17084;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC0082
    public boolean hasCowVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC0082
    public int getCowVersion() {
        return this.cowVersion_;
    }

    public C14251 setCowVersion(int i) {
        this.cowVersion_ = i;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C14251 clearCowVersion() {
        this.bitField0_ &= -17;
        this.cowVersion_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC0082
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC0082
    public C4051 getVabcFeatureSet() {
        C9998 c9998 = this.vabcFeatureSetBuilder_;
        if (c9998 == null) {
            C4051 c4051 = this.vabcFeatureSet_;
            return c4051 == null ? C4051.getDefaultInstance() : c4051;
        }
        return (C4051) c9998.m25853();
    }

    public C14251 setVabcFeatureSet(C4051 c4051) {
        C9998 c9998 = this.vabcFeatureSetBuilder_;
        if (c9998 == null) {
            c4051.getClass();
            this.vabcFeatureSet_ = c4051;
        } else {
            c9998.m25855(c4051);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C14251 setVabcFeatureSet(C24189 c24189) {
        C9998 c9998 = this.vabcFeatureSetBuilder_;
        if (c9998 == null) {
            this.vabcFeatureSet_ = c24189.build();
        } else {
            c9998.m25855(c24189.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C14251 mergeVabcFeatureSet(C4051 c4051) {
        C4051 c4052;
        C9998 c9998 = this.vabcFeatureSetBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 32) != 0 && (c4052 = this.vabcFeatureSet_) != null && c4052 != C4051.getDefaultInstance()) {
                getVabcFeatureSetBuilder().mergeFrom(c4051);
            } else {
                this.vabcFeatureSet_ = c4051;
            }
        } else {
            c9998.m25850(c4051);
        }
        if (this.vabcFeatureSet_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C14251 clearVabcFeatureSet() {
        this.bitField0_ &= -33;
        this.vabcFeatureSet_ = null;
        C9998 c9998 = this.vabcFeatureSetBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.vabcFeatureSetBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C24189 getVabcFeatureSetBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C24189) getVabcFeatureSetFieldBuilder().m25856();
    }

    @Override // l.InterfaceC0082
    public InterfaceC21205 getVabcFeatureSetOrBuilder() {
        C9998 c9998 = this.vabcFeatureSetBuilder_;
        if (c9998 != null) {
            return (InterfaceC21205) c9998.m25852();
        }
        C4051 c4051 = this.vabcFeatureSet_;
        return c4051 == null ? C4051.getDefaultInstance() : c4051;
    }

    private C9998 getVabcFeatureSetFieldBuilder() {
        if (this.vabcFeatureSetBuilder_ == null) {
            this.vabcFeatureSetBuilder_ = new C9998(getVabcFeatureSet(), getParentForChildren(), isClean());
            this.vabcFeatureSet_ = null;
        }
        return this.vabcFeatureSetBuilder_;
    }

    @Override // l.InterfaceC0082
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC0082
    public long getCompressionFactor() {
        return this.compressionFactor_;
    }

    public C14251 setCompressionFactor(long j) {
        this.compressionFactor_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C14251 clearCompressionFactor() {
        this.bitField0_ &= -65;
        this.compressionFactor_ = 0L;
        onChanged();
        return this;
    }
}
