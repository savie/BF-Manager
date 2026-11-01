package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18603 extends InterfaceC18266 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC18266
    /* synthetic */ Map getAllFields();

    C4491 getApexInfo(int i);

    int getApexInfoCount();

    List getApexInfoList();

    InterfaceC11548 getApexInfoOrBuilder(int i);

    List getApexInfoOrBuilderList();

    int getBlockSize();

    @Override // l.InterfaceC18266
    /* synthetic */ InterfaceC1332 getDefaultInstanceForType();

    @Override // l.InterfaceC15445, l.InterfaceC18266
    /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType();

    @Override // l.InterfaceC18266
    /* synthetic */ C2806 getDescriptorForType();

    C20015 getDynamicPartitionMetadata();

    InterfaceC16487 getDynamicPartitionMetadataOrBuilder();

    @Override // l.InterfaceC18266
    /* synthetic */ Object getField(C19741 c19741);

    /* synthetic */ String getInitializationErrorString();

    long getMaxTimestamp();

    int getMinorVersion();

    /* synthetic */ C19741 getOneofFieldDescriptor(C21151 c21151);

    boolean getPartialUpdate();

    C23231 getPartitions(int i);

    int getPartitionsCount();

    List getPartitionsList();

    InterfaceC21819 getPartitionsOrBuilder(int i);

    List getPartitionsOrBuilderList();

    /* synthetic */ Object getRepeatedField(C19741 c19741, int i);

    /* synthetic */ int getRepeatedFieldCount(C19741 c19741);

    String getSecurityPatchLevel();

    AbstractC23725 getSecurityPatchLevelBytes();

    long getSignaturesOffset();

    long getSignaturesSize();

    @Override // l.InterfaceC18266
    /* synthetic */ C6708 getUnknownFields();

    boolean hasBlockSize();

    boolean hasDynamicPartitionMetadata();

    @Override // l.InterfaceC18266
    /* synthetic */ boolean hasField(C19741 c19741);

    boolean hasMaxTimestamp();

    boolean hasMinorVersion();

    /* synthetic */ boolean hasOneof(C21151 c21151);

    boolean hasPartialUpdate();

    boolean hasSecurityPatchLevel();

    boolean hasSignaturesOffset();

    boolean hasSignaturesSize();

    @Override // l.InterfaceC15445
    /* synthetic */ boolean isInitialized();
}
