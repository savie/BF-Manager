package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC23543 extends InterfaceC18266 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC18266
    /* synthetic */ Map getAllFields();

    @Override // l.InterfaceC18266
    /* synthetic */ InterfaceC1332 getDefaultInstanceForType();

    @Override // l.InterfaceC15445, l.InterfaceC18266
    /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType();

    @Override // l.InterfaceC18266
    /* synthetic */ C2806 getDescriptorForType();

    @Override // l.InterfaceC18266
    /* synthetic */ Object getField(C19741 c19741);

    /* synthetic */ String getInitializationErrorString();

    long getNumBlocks();

    /* synthetic */ C19741 getOneofFieldDescriptor(C21151 c21151);

    /* synthetic */ Object getRepeatedField(C19741 c19741, int i);

    /* synthetic */ int getRepeatedFieldCount(C19741 c19741);

    long getStartBlock();

    @Override // l.InterfaceC18266
    /* synthetic */ C6708 getUnknownFields();

    @Override // l.InterfaceC18266
    /* synthetic */ boolean hasField(C19741 c19741);

    boolean hasNumBlocks();

    /* synthetic */ boolean hasOneof(C21151 c21151);

    boolean hasStartBlock();

    @Override // l.InterfaceC15445
    /* synthetic */ boolean isInitialized();
}
