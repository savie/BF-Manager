package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC10762 extends InterfaceC9078 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC9078
    /* synthetic */ Map getAllFields();

    long getDataLength();

    long getDataOffset();

    AbstractC17084 getDataSha256Hash();

    @Override // l.InterfaceC9824
    /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType();

    @Override // l.InterfaceC9078, l.InterfaceC9824
    /* synthetic */ InterfaceC21013 getDefaultInstanceForType();

    @Override // l.InterfaceC9078
    /* synthetic */ C24478 getDescriptorForType();

    C9776 getDstExtents(int i);

    int getDstExtentsCount();

    List getDstExtentsList();

    InterfaceC9031 getDstExtentsOrBuilder(int i);

    List getDstExtentsOrBuilderList();

    long getDstLength();

    @Override // l.InterfaceC9078
    /* synthetic */ Object getField(C7323 c7323);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C7323 getOneofFieldDescriptor(C10788 c10788);

    /* synthetic */ Object getRepeatedField(C7323 c7323, int i);

    /* synthetic */ int getRepeatedFieldCount(C7323 c7323);

    C9776 getSrcExtents(int i);

    int getSrcExtentsCount();

    List getSrcExtentsList();

    InterfaceC9031 getSrcExtentsOrBuilder(int i);

    List getSrcExtentsOrBuilderList();

    long getSrcLength();

    AbstractC17084 getSrcSha256Hash();

    EnumC13506 getType();

    @Override // l.InterfaceC9078
    /* synthetic */ C7719 getUnknownFields();

    boolean hasDataLength();

    boolean hasDataOffset();

    boolean hasDataSha256Hash();

    boolean hasDstLength();

    @Override // l.InterfaceC9078
    /* synthetic */ boolean hasField(C7323 c7323);

    /* synthetic */ boolean hasOneof(C10788 c10788);

    boolean hasSrcLength();

    boolean hasSrcSha256Hash();

    boolean hasType();

    @Override // l.InterfaceC9824
    /* synthetic */ boolean isInitialized();
}
