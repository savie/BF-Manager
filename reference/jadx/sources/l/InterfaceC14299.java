package l;

/* JADX INFO: renamed from: l.ܰۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9WK */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC14299 extends InterfaceC7588, InterfaceC9078 {
    InterfaceC14299 addRepeatedField(C7323 c7323, Object obj);

    @Override // l.InterfaceC7588
    InterfaceC21013 build();

    @Override // l.InterfaceC7588
    InterfaceC21013 buildPartial();

    InterfaceC14299 clearField(C7323 c7323);

    @Override // l.InterfaceC9078
    C24478 getDescriptorForType();

    InterfaceC14299 getFieldBuilder(C7323 c7323);

    /* JADX INFO: renamed from: mergeFrom */
    InterfaceC14299 mo4453mergeFrom(AbstractC17084 abstractC17084, C24215 c24215);

    InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013);

    InterfaceC14299 newBuilderForField(C7323 c7323);

    InterfaceC14299 setField(C7323 c7323, Object obj);

    InterfaceC14299 setUnknownFields(C7719 c7719);
}
