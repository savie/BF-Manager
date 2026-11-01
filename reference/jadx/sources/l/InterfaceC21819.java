package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC21819 extends InterfaceC18266 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC18266
    /* synthetic */ Map getAllFields();

    @Override // l.InterfaceC18266
    /* synthetic */ InterfaceC1332 getDefaultInstanceForType();

    @Override // l.InterfaceC15445, l.InterfaceC18266
    /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType();

    @Override // l.InterfaceC18266
    /* synthetic */ C2806 getDescriptorForType();

    long getEstimateCowSize();

    long getEstimateOpCountMax();

    C5903 getFecDataExtent();

    InterfaceC23543 getFecDataExtentOrBuilder();

    C5903 getFecExtent();

    InterfaceC23543 getFecExtentOrBuilder();

    int getFecRoots();

    @Override // l.InterfaceC18266
    /* synthetic */ Object getField(C19741 c19741);

    String getFilesystemType();

    AbstractC23725 getFilesystemTypeBytes();

    String getHashTreeAlgorithm();

    AbstractC23725 getHashTreeAlgorithmBytes();

    C5903 getHashTreeDataExtent();

    InterfaceC23543 getHashTreeDataExtentOrBuilder();

    C5903 getHashTreeExtent();

    InterfaceC23543 getHashTreeExtentOrBuilder();

    AbstractC23725 getHashTreeSalt();

    /* synthetic */ String getInitializationErrorString();

    C12959 getMergeOperations(int i);

    int getMergeOperationsCount();

    List getMergeOperationsList();

    InterfaceC6608 getMergeOperationsOrBuilder(int i);

    List getMergeOperationsOrBuilderList();

    C22525 getNewPartitionInfo();

    InterfaceC13353 getNewPartitionInfoOrBuilder();

    C8414 getNewPartitionSignature(int i);

    int getNewPartitionSignatureCount();

    List getNewPartitionSignatureList();

    InterfaceC9120 getNewPartitionSignatureOrBuilder(int i);

    List getNewPartitionSignatureOrBuilderList();

    C22525 getOldPartitionInfo();

    InterfaceC13353 getOldPartitionInfoOrBuilder();

    /* synthetic */ C19741 getOneofFieldDescriptor(C21151 c21151);

    C4885 getOperations(int i);

    int getOperationsCount();

    List getOperationsList();

    InterfaceC11942 getOperationsOrBuilder(int i);

    List getOperationsOrBuilderList();

    String getPartitionName();

    AbstractC23725 getPartitionNameBytes();

    boolean getPostinstallOptional();

    String getPostinstallPath();

    AbstractC23725 getPostinstallPathBytes();

    /* synthetic */ Object getRepeatedField(C19741 c19741, int i);

    /* synthetic */ int getRepeatedFieldCount(C19741 c19741);

    boolean getRunPostinstall();

    @Override // l.InterfaceC18266
    /* synthetic */ C6708 getUnknownFields();

    String getVersion();

    AbstractC23725 getVersionBytes();

    boolean hasEstimateCowSize();

    boolean hasEstimateOpCountMax();

    boolean hasFecDataExtent();

    boolean hasFecExtent();

    boolean hasFecRoots();

    @Override // l.InterfaceC18266
    /* synthetic */ boolean hasField(C19741 c19741);

    boolean hasFilesystemType();

    boolean hasHashTreeAlgorithm();

    boolean hasHashTreeDataExtent();

    boolean hasHashTreeExtent();

    boolean hasHashTreeSalt();

    boolean hasNewPartitionInfo();

    boolean hasOldPartitionInfo();

    /* synthetic */ boolean hasOneof(C21151 c21151);

    boolean hasPartitionName();

    boolean hasPostinstallOptional();

    boolean hasPostinstallPath();

    boolean hasRunPostinstall();

    boolean hasVersion();

    @Override // l.InterfaceC15445
    /* synthetic */ boolean isInitialized();
}
