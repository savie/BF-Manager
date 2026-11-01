package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11942 extends InterfaceC18266 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC18266
    /* synthetic */ Map getAllFields();

    long getDataLength();

    long getDataOffset();

    AbstractC23725 getDataSha256Hash();

    @Override // l.InterfaceC18266
    /* synthetic */ InterfaceC1332 getDefaultInstanceForType();

    @Override // l.InterfaceC15445, l.InterfaceC18266
    /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType();

    @Override // l.InterfaceC18266
    /* synthetic */ C2806 getDescriptorForType();

    C5903 getDstExtents(int i);

    int getDstExtentsCount();

    List getDstExtentsList();

    InterfaceC23543 getDstExtentsOrBuilder(int i);

    List getDstExtentsOrBuilderList();

    long getDstLength();

    @Override // l.InterfaceC18266
    /* synthetic */ Object getField(C19741 c19741);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C19741 getOneofFieldDescriptor(C21151 c21151);

    /* synthetic */ Object getRepeatedField(C19741 c19741, int i);

    /* synthetic */ int getRepeatedFieldCount(C19741 c19741);

    C5903 getSrcExtents(int i);

    int getSrcExtentsCount();

    List getSrcExtentsList();

    InterfaceC23543 getSrcExtentsOrBuilder(int i);

    List getSrcExtentsOrBuilderList();

    long getSrcLength();

    AbstractC23725 getSrcSha256Hash();

    EnumC3080 getType();

    @Override // l.InterfaceC18266
    /* synthetic */ C6708 getUnknownFields();

    boolean hasDataLength();

    boolean hasDataOffset();

    boolean hasDataSha256Hash();

    boolean hasDstLength();

    @Override // l.InterfaceC18266
    /* synthetic */ boolean hasField(C19741 c19741);

    /* synthetic */ boolean hasOneof(C21151 c21151);

    boolean hasSrcLength();

    boolean hasSrcSha256Hash();

    boolean hasType();

    @Override // l.InterfaceC15445
    /* synthetic */ boolean isInitialized();
}
