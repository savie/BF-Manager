package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20408 extends InterfaceC18266 {
    /* synthetic */ List findInitializationErrors();

    @Override // l.InterfaceC18266
    /* synthetic */ Map getAllFields();

    boolean getBatchWrites();

    @Override // l.InterfaceC18266
    /* synthetic */ InterfaceC1332 getDefaultInstanceForType();

    @Override // l.InterfaceC15445, l.InterfaceC18266
    /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType();

    @Override // l.InterfaceC18266
    /* synthetic */ C2806 getDescriptorForType();

    @Override // l.InterfaceC18266
    /* synthetic */ Object getField(C19741 c19741);

    /* synthetic */ String getInitializationErrorString();

    /* synthetic */ C19741 getOneofFieldDescriptor(C21151 c21151);

    /* synthetic */ Object getRepeatedField(C19741 c19741, int i);

    /* synthetic */ int getRepeatedFieldCount(C19741 c19741);

    boolean getThreaded();

    @Override // l.InterfaceC18266
    /* synthetic */ C6708 getUnknownFields();

    boolean hasBatchWrites();

    @Override // l.InterfaceC18266
    /* synthetic */ boolean hasField(C19741 c19741);

    /* synthetic */ boolean hasOneof(C21151 c21151);

    boolean hasThreaded();

    @Override // l.InterfaceC15445
    /* synthetic */ boolean isInitialized();
}
