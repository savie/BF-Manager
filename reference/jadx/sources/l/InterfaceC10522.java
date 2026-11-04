package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC10522 extends InterfaceC9078 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC9078
    /* synthetic */ Map getAllFields();

    long getDecompressedSize();

    @Override // l.InterfaceC9824
    /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType();

    @Override // l.InterfaceC9078, l.InterfaceC9824
    /* synthetic */ InterfaceC21013 getDefaultInstanceForType();

    @Override // l.InterfaceC9078
    /* synthetic */ C24478 getDescriptorForType();

    @Override // l.InterfaceC9078
    /* synthetic */ Object getField(C7323 c7323);

    /* synthetic */ String getInitializationErrorString();

    boolean getIsCompressed();

    /* synthetic */ C7323 getOneofFieldDescriptor(C10788 c10788);

    String getPackageName();

    AbstractC17084 getPackageNameBytes();

    /* synthetic */ Object getRepeatedField(C7323 c7323, int i);

    /* synthetic */ int getRepeatedFieldCount(C7323 c7323);

    @Override // l.InterfaceC9078
    /* synthetic */ C7719 getUnknownFields();

    long getVersion();

    boolean hasDecompressedSize();

    @Override // l.InterfaceC9078
    /* synthetic */ boolean hasField(C7323 c7323);

    boolean hasIsCompressed();

    /* synthetic */ boolean hasOneof(C10788 c10788);

    boolean hasPackageName();

    boolean hasVersion();

    @Override // l.InterfaceC9824
    /* synthetic */ boolean isInitialized();
}
