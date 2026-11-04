package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17475 extends InterfaceC9078 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC9078
    /* synthetic */ Map getAllFields();

    @Override // l.InterfaceC9824
    /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType();

    @Override // l.InterfaceC9078, l.InterfaceC9824
    /* synthetic */ InterfaceC21013 getDefaultInstanceForType();

    @Override // l.InterfaceC9078
    /* synthetic */ C24478 getDescriptorForType();

    long getEstimateCowSize();

    long getEstimateOpCountMax();

    C9776 getFecDataExtent();

    InterfaceC9031 getFecDataExtentOrBuilder();

    C9776 getFecExtent();

    InterfaceC9031 getFecExtentOrBuilder();

    int getFecRoots();

    @Override // l.InterfaceC9078
    /* synthetic */ Object getField(C7323 c7323);

    String getFilesystemType();

    AbstractC17084 getFilesystemTypeBytes();

    String getHashTreeAlgorithm();

    AbstractC17084 getHashTreeAlgorithmBytes();

    C9776 getHashTreeDataExtent();

    InterfaceC9031 getHashTreeDataExtentOrBuilder();

    C9776 getHashTreeExtent();

    InterfaceC9031 getHashTreeExtentOrBuilder();

    AbstractC17084 getHashTreeSalt();

    /* synthetic */ String getInitializationErrorString();

    C5303 getMergeOperations(int i);

    int getMergeOperationsCount();

    List getMergeOperationsList();

    InterfaceC11268 getMergeOperationsOrBuilder(int i);

    List getMergeOperationsOrBuilderList();

    C15237 getNewPartitionInfo();

    InterfaceC5543 getNewPartitionInfoOrBuilder();

    C3305 getNewPartitionSignature(int i);

    int getNewPartitionSignatureCount();

    List getNewPartitionSignatureList();

    InterfaceC12254 getNewPartitionSignatureOrBuilder(int i);

    List getNewPartitionSignatureOrBuilderList();

    C15237 getOldPartitionInfo();

    InterfaceC5543 getOldPartitionInfoOrBuilder();

    /* synthetic */ C7323 getOneofFieldDescriptor(C10788 c10788);

    C4797 getOperations(int i);

    int getOperationsCount();

    List getOperationsList();

    InterfaceC10762 getOperationsOrBuilder(int i);

    List getOperationsOrBuilderList();

    String getPartitionName();

    AbstractC17084 getPartitionNameBytes();

    boolean getPostinstallOptional();

    String getPostinstallPath();

    AbstractC17084 getPostinstallPathBytes();

    /* synthetic */ Object getRepeatedField(C7323 c7323, int i);

    /* synthetic */ int getRepeatedFieldCount(C7323 c7323);

    boolean getRunPostinstall();

    @Override // l.InterfaceC9078
    /* synthetic */ C7719 getUnknownFields();

    String getVersion();

    AbstractC17084 getVersionBytes();

    boolean hasEstimateCowSize();

    boolean hasEstimateOpCountMax();

    boolean hasFecDataExtent();

    boolean hasFecExtent();

    boolean hasFecRoots();

    @Override // l.InterfaceC9078
    /* synthetic */ boolean hasField(C7323 c7323);

    boolean hasFilesystemType();

    boolean hasHashTreeAlgorithm();

    boolean hasHashTreeDataExtent();

    boolean hasHashTreeExtent();

    boolean hasHashTreeSalt();

    boolean hasNewPartitionInfo();

    boolean hasOldPartitionInfo();

    /* synthetic */ boolean hasOneof(C10788 c10788);

    boolean hasPartitionName();

    boolean hasPostinstallOptional();

    boolean hasPostinstallPath();

    boolean hasRunPostinstall();

    boolean hasVersion();

    @Override // l.InterfaceC9824
    /* synthetic */ boolean isInitialized();
}
