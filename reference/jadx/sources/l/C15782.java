package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15782 extends AbstractC0584 implements InterfaceC16487 {
    public int bitField0_;
    public long compressionFactor_;
    public int cowVersion_;
    public C22190 groupsBuilder_;
    public List groups_;
    public boolean snapshotEnabled_;
    public Object vabcCompressionParam_;
    public boolean vabcEnabled_;
    public C15135 vabcFeatureSetBuilder_;
    public C21113 vabcFeatureSet_;

    public /* synthetic */ C15782(int i) {
        this();
    }

    public /* synthetic */ C15782(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable;
        c6956.m18696(C20015.class, C15782.class);
        return c6956;
    }

    public C15782() {
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    public C15782(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC18245.alwaysUseFieldBuilders) {
            getGroupsFieldBuilder();
            getVabcFeatureSetFieldBuilder();
        }
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C15782 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            this.groups_ = Collections.EMPTY_LIST;
        } else {
            this.groups_ = null;
            c22190.m49245();
        }
        this.bitField0_ &= -2;
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.vabcFeatureSet_ = null;
        C15135 c15135 = this.vabcFeatureSetBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.vabcFeatureSetBuilder_ = null;
        }
        this.compressionFactor_ = 0L;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C20015 getDefaultInstanceForType() {
        return C20015.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C20015 build() {
        C20015 c20015BuildPartial = buildPartial();
        if (c20015BuildPartial.isInitialized()) {
            return c20015BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c20015BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C20015 buildPartial() {
        C20015 c20015 = new C20015(this);
        buildPartialRepeatedFields(c20015);
        if (this.bitField0_ != 0) {
            buildPartial0(c20015);
        }
        onBuilt();
        return c20015;
    }

    private void buildPartialRepeatedFields(C20015 c20015) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            if ((this.bitField0_ & 1) != 0) {
                this.groups_ = C0561.unmodifiableList(this.groups_);
                this.bitField0_ &= -2;
            }
            c20015.groups_ = this.groups_;
            return;
        }
        c20015.groups_ = c22190.m49248();
    }

    private void buildPartial0(C20015 c20015) {
        int i;
        C21113 c21113;
        int i2 = this.bitField0_;
        if ((i2 & 2) != 0) {
            c20015.snapshotEnabled_ = this.snapshotEnabled_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            c20015.vabcEnabled_ = this.vabcEnabled_;
            i |= 2;
        }
        if ((i2 & 8) != 0) {
            c20015.vabcCompressionParam_ = this.vabcCompressionParam_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c20015.cowVersion_ = this.cowVersion_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            C15135 c15135 = this.vabcFeatureSetBuilder_;
            if (c15135 == null) {
                c21113 = this.vabcFeatureSet_;
            } else {
                c21113 = (C21113) c15135.m36297();
            }
            c20015.vabcFeatureSet_ = c21113;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            c20015.compressionFactor_ = this.compressionFactor_;
            i |= 32;
        }
        c20015.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C15782 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C20015) {
            return mergeFrom((C20015) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C15782 mergeFrom(C20015 c20015) {
        if (c20015 == C20015.getDefaultInstance()) {
            return this;
        }
        if (this.groupsBuilder_ == null) {
            if (!c20015.groups_.isEmpty()) {
                if (this.groups_.isEmpty()) {
                    this.groups_ = c20015.groups_;
                    this.bitField0_ &= -2;
                } else {
                    ensureGroupsIsMutable();
                    this.groups_.addAll(c20015.groups_);
                }
                onChanged();
            }
        } else if (!c20015.groups_.isEmpty()) {
            if (this.groupsBuilder_.m49238()) {
                this.groupsBuilder_.m49236();
                this.groupsBuilder_ = null;
                this.groups_ = c20015.groups_;
                this.bitField0_ &= -2;
                this.groupsBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getGroupsFieldBuilder() : null;
            } else {
                this.groupsBuilder_.m49242(c20015.groups_);
            }
        }
        if (c20015.hasSnapshotEnabled()) {
            setSnapshotEnabled(c20015.getSnapshotEnabled());
        }
        if (c20015.hasVabcEnabled()) {
            setVabcEnabled(c20015.getVabcEnabled());
        }
        if (c20015.hasVabcCompressionParam()) {
            this.vabcCompressionParam_ = c20015.vabcCompressionParam_;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (c20015.hasCowVersion()) {
            setCowVersion(c20015.getCowVersion());
        }
        if (c20015.hasVabcFeatureSet()) {
            mergeVabcFeatureSet(c20015.getVabcFeatureSet());
        }
        if (c20015.hasCompressionFactor()) {
            setCompressionFactor(c20015.getCompressionFactor());
        }
        mo2781mergeUnknownFields(c20015.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C15782 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            C8726 c8726 = (C8726) abstractC3262.mo6024(C8726.parser(), c2701);
                            C22190 c22190 = this.groupsBuilder_;
                            if (c22190 == null) {
                                ensureGroupsIsMutable();
                                this.groups_.add(c8726);
                            } else {
                                c22190.m49251(c8726);
                            }
                        } else if (iMo6048 == 16) {
                            this.snapshotEnabled_ = abstractC3262.mo6028();
                            this.bitField0_ |= 2;
                        } else if (iMo6048 == 24) {
                            this.vabcEnabled_ = abstractC3262.mo6028();
                            this.bitField0_ |= 4;
                        } else if (iMo6048 == 34) {
                            this.vabcCompressionParam_ = abstractC3262.mo6050();
                            this.bitField0_ |= 8;
                        } else if (iMo6048 == 40) {
                            this.cowVersion_ = abstractC3262.mo6041();
                            this.bitField0_ |= 16;
                        } else if (iMo6048 == 50) {
                            abstractC3262.mo6027(getVabcFeatureSetFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 32;
                        } else if (iMo6048 == 56) {
                            this.compressionFactor_ = abstractC3262.mo6047();
                            this.bitField0_ |= 64;
                        } else if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                        }
                    }
                    z = true;
                } catch (C4529 e) {
                    throw e.m12650();
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

    @Override // l.InterfaceC16487
    public List getGroupsList() {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.groups_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC16487
    public int getGroupsCount() {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            return this.groups_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC16487
    public C8726 getGroups(int i) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            return (C8726) this.groups_.get(i);
        }
        return (C8726) c22190.m49249(i);
    }

    public C15782 setGroups(int i, C8726 c8726) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            c8726.getClass();
            ensureGroupsIsMutable();
            this.groups_.set(i, c8726);
            onChanged();
            return this;
        }
        c22190.m49246(i, c8726);
        return this;
    }

    public C15782 setGroups(int i, C19309 c19309) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            ensureGroupsIsMutable();
            this.groups_.set(i, c19309.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c19309.build());
        return this;
    }

    public C15782 addGroups(C8726 c8726) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            c8726.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(c8726);
            onChanged();
            return this;
        }
        c22190.m49251(c8726);
        return this;
    }

    public C15782 addGroups(int i, C8726 c8726) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            c8726.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(i, c8726);
            onChanged();
            return this;
        }
        c22190.m49250(i, c8726);
        return this;
    }

    public C15782 addGroups(C19309 c19309) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(c19309.build());
            onChanged();
            return this;
        }
        c22190.m49251(c19309.build());
        return this;
    }

    public C15782 addGroups(int i, C19309 c19309) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(i, c19309.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c19309.build());
        return this;
    }

    public C15782 addAllGroups(Iterable iterable) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            ensureGroupsIsMutable();
            AbstractC21607.m48315(iterable, this.groups_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C15782 clearGroups() {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            this.groups_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C15782 removeGroups(int i) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            ensureGroupsIsMutable();
            this.groups_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C19309 getGroupsBuilder(int i) {
        return (C19309) getGroupsFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC16487
    public InterfaceC7314 getGroupsOrBuilder(int i) {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 == null) {
            return (InterfaceC7314) this.groups_.get(i);
        }
        return (InterfaceC7314) c22190.m49244(i);
    }

    @Override // l.InterfaceC16487
    public List getGroupsOrBuilderList() {
        C22190 c22190 = this.groupsBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.groups_);
    }

    public C19309 addGroupsBuilder() {
        return (C19309) getGroupsFieldBuilder().m49241(C8726.getDefaultInstance());
    }

    public C19309 addGroupsBuilder(int i) {
        return (C19309) getGroupsFieldBuilder().m49240(i, C8726.getDefaultInstance());
    }

    public List getGroupsBuilderList() {
        return getGroupsFieldBuilder().m49243();
    }

    private C22190 getGroupsFieldBuilder() {
        if (this.groupsBuilder_ == null) {
            this.groupsBuilder_ = new C22190(this.groups_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
            this.groups_ = null;
        }
        return this.groupsBuilder_;
    }

    @Override // l.InterfaceC16487
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC16487
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    public C15782 setSnapshotEnabled(boolean z) {
        this.snapshotEnabled_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C15782 clearSnapshotEnabled() {
        this.bitField0_ &= -3;
        this.snapshotEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16487
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC16487
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    public C15782 setVabcEnabled(boolean z) {
        this.vabcEnabled_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C15782 clearVabcEnabled() {
        this.bitField0_ &= -5;
        this.vabcEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16487
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC16487
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.vabcCompressionParam_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
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

    public C15782 setVabcCompressionParam(String str) {
        str.getClass();
        this.vabcCompressionParam_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C15782 clearVabcCompressionParam() {
        this.vabcCompressionParam_ = C20015.getDefaultInstance().getVabcCompressionParam();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C15782 setVabcCompressionParamBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.vabcCompressionParam_ = abstractC23725;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16487
    public boolean hasCowVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC16487
    public int getCowVersion() {
        return this.cowVersion_;
    }

    public C15782 setCowVersion(int i) {
        this.cowVersion_ = i;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C15782 clearCowVersion() {
        this.bitField0_ &= -17;
        this.cowVersion_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC16487
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC16487
    public C21113 getVabcFeatureSet() {
        C15135 c15135 = this.vabcFeatureSetBuilder_;
        if (c15135 == null) {
            C21113 c21113 = this.vabcFeatureSet_;
            return c21113 == null ? C21113.getDefaultInstance() : c21113;
        }
        return (C21113) c15135.m36295();
    }

    public C15782 setVabcFeatureSet(C21113 c21113) {
        C15135 c15135 = this.vabcFeatureSetBuilder_;
        if (c15135 == null) {
            c21113.getClass();
            this.vabcFeatureSet_ = c21113;
        } else {
            c15135.m36298(c21113);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C15782 setVabcFeatureSet(C7708 c7708) {
        C15135 c15135 = this.vabcFeatureSetBuilder_;
        if (c15135 == null) {
            this.vabcFeatureSet_ = c7708.build();
        } else {
            c15135.m36298(c7708.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C15782 mergeVabcFeatureSet(C21113 c21113) {
        C21113 c21114;
        C15135 c15135 = this.vabcFeatureSetBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 32) != 0 && (c21114 = this.vabcFeatureSet_) != null && c21114 != C21113.getDefaultInstance()) {
                getVabcFeatureSetBuilder().mergeFrom(c21113);
            } else {
                this.vabcFeatureSet_ = c21113;
            }
        } else {
            c15135.m36294(c21113);
        }
        if (this.vabcFeatureSet_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C15782 clearVabcFeatureSet() {
        this.bitField0_ &= -33;
        this.vabcFeatureSet_ = null;
        C15135 c15135 = this.vabcFeatureSetBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.vabcFeatureSetBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C7708 getVabcFeatureSetBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C7708) getVabcFeatureSetFieldBuilder().m36293();
    }

    @Override // l.InterfaceC16487
    public InterfaceC20408 getVabcFeatureSetOrBuilder() {
        C15135 c15135 = this.vabcFeatureSetBuilder_;
        if (c15135 != null) {
            return (InterfaceC20408) c15135.m36299();
        }
        C21113 c21113 = this.vabcFeatureSet_;
        return c21113 == null ? C21113.getDefaultInstance() : c21113;
    }

    private C15135 getVabcFeatureSetFieldBuilder() {
        if (this.vabcFeatureSetBuilder_ == null) {
            this.vabcFeatureSetBuilder_ = new C15135(getVabcFeatureSet(), getParentForChildren(), isClean());
            this.vabcFeatureSet_ = null;
        }
        return this.vabcFeatureSetBuilder_;
    }

    @Override // l.InterfaceC16487
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC16487
    public long getCompressionFactor() {
        return this.compressionFactor_;
    }

    public C15782 setCompressionFactor(long j) {
        this.compressionFactor_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C15782 clearCompressionFactor() {
        this.bitField0_ &= -65;
        this.compressionFactor_ = 0L;
        onChanged();
        return this;
    }
}
