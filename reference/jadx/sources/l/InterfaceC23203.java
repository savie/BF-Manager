package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC23203 extends InterfaceC9078 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC9078
    /* synthetic */ Map getAllFields();

    C4557 getApexInfo(int i);

    int getApexInfoCount();

    List getApexInfoList();

    InterfaceC10522 getApexInfoOrBuilder(int i);

    List getApexInfoOrBuilderList();

    int getBlockSize();

    @Override // l.InterfaceC9824
    /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType();

    @Override // l.InterfaceC9078, l.InterfaceC9824
    /* synthetic */ InterfaceC21013 getDefaultInstanceForType();

    @Override // l.InterfaceC9078
    /* synthetic */ C24478 getDescriptorForType();

    C20965 getDynamicPartitionMetadata();

    InterfaceC0082 getDynamicPartitionMetadataOrBuilder();

    @Override // l.InterfaceC9078
    /* synthetic */ Object getField(C7323 c7323);

    /* synthetic */ String getInitializationErrorString();

    long getMaxTimestamp();

    int getMinorVersion();

    /* synthetic */ C7323 getOneofFieldDescriptor(C10788 c10788);

    boolean getPartialUpdate();

    C24935 getPartitions(int i);

    int getPartitionsCount();

    List getPartitionsList();

    InterfaceC17475 getPartitionsOrBuilder(int i);

    List getPartitionsOrBuilderList();

    /* synthetic */ Object getRepeatedField(C7323 c7323, int i);

    /* synthetic */ int getRepeatedFieldCount(C7323 c7323);

    String getSecurityPatchLevel();

    AbstractC17084 getSecurityPatchLevelBytes();

    long getSignaturesOffset();

    long getSignaturesSize();

    @Override // l.InterfaceC9078
    /* synthetic */ C7719 getUnknownFields();

    boolean hasBlockSize();

    boolean hasDynamicPartitionMetadata();

    @Override // l.InterfaceC9078
    /* synthetic */ boolean hasField(C7323 c7323);

    boolean hasMaxTimestamp();

    boolean hasMinorVersion();

    /* synthetic */ boolean hasOneof(C10788 c10788);

    boolean hasPartialUpdate();

    boolean hasSecurityPatchLevel();

    boolean hasSignaturesOffset();

    boolean hasSignaturesSize();

    @Override // l.InterfaceC9824
    /* synthetic */ boolean isInitialized();
}
