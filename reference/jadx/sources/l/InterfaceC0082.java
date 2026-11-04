package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֡֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0082 extends InterfaceC9078 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC9078
    /* synthetic */ Map getAllFields();

    long getCompressionFactor();

    int getCowVersion();

    @Override // l.InterfaceC9824
    /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType();

    @Override // l.InterfaceC9078, l.InterfaceC9824
    /* synthetic */ InterfaceC21013 getDefaultInstanceForType();

    @Override // l.InterfaceC9078
    /* synthetic */ C24478 getDescriptorForType();

    @Override // l.InterfaceC9078
    /* synthetic */ Object getField(C7323 c7323);

    C12014 getGroups(int i);

    int getGroupsCount();

    List getGroupsList();

    InterfaceC23949 getGroupsOrBuilder(int i);

    List getGroupsOrBuilderList();

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C7323 getOneofFieldDescriptor(C10788 c10788);

    /* synthetic */ Object getRepeatedField(C7323 c7323, int i);

    /* synthetic */ int getRepeatedFieldCount(C7323 c7323);

    boolean getSnapshotEnabled();

    @Override // l.InterfaceC9078
    /* synthetic */ C7719 getUnknownFields();

    String getVabcCompressionParam();

    AbstractC17084 getVabcCompressionParamBytes();

    boolean getVabcEnabled();

    C4051 getVabcFeatureSet();

    InterfaceC21205 getVabcFeatureSetOrBuilder();

    boolean hasCompressionFactor();

    boolean hasCowVersion();

    @Override // l.InterfaceC9078
    /* synthetic */ boolean hasField(C7323 c7323);

    /* synthetic */ boolean hasOneof(C10788 c10788);

    boolean hasSnapshotEnabled();

    boolean hasVabcCompressionParam();

    boolean hasVabcEnabled();

    boolean hasVabcFeatureSet();

    @Override // l.InterfaceC9824
    /* synthetic */ boolean isInitialized();
}
