package l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֡ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0479 extends AbstractC1225 implements InterfaceC14299 {
    @Override // l.InterfaceC9824
    public /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4451mergeFrom(AbstractC3660 abstractC3660) {
        return mergeFrom(abstractC3660, (C24215) C20485.f65620);
    }

    @Override // l.InterfaceC7588
    public /* bridge */ /* synthetic */ InterfaceC18775 build() {
        return build();
    }

    @Override // l.InterfaceC7588
    public /* bridge */ /* synthetic */ InterfaceC18775 buildPartial() {
        return buildPartial();
    }

    @Override // l.AbstractC1225, l.InterfaceC7588
    public /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(InterfaceC18775 interfaceC18775) {
        return super.mergeFrom(interfaceC18775);
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo2316clone() {
        throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
    }

    public boolean hasOneof(C10788 c10788) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C7323 getOneofFieldDescriptor(C10788 c10788) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // 
    /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo2314clearOneof(C10788 c10788) {
        throw new UnsupportedOperationException("clearOneof() is not implemented.");
    }

    @Override // 
    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC0479 mo2313clear() {
        Iterator it = getAllFields().entrySet().iterator();
        while (it.hasNext()) {
            clearField((C7323) ((Map.Entry) it.next()).getKey());
        }
        return this;
    }

    public List findInitializationErrors() {
        return C21933.m49628(this);
    }

    public String getInitializationErrorString() {
        return C21933.m49627(findInitializationErrors());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC1225
    public AbstractC0479 internalMergeFrom(AbstractC9427 abstractC9427) {
        return mergeFrom((InterfaceC21013) abstractC9427);
    }

    @Override // l.InterfaceC14299
    public AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        return mergeFrom(interfaceC21013, interfaceC21013.getAllFields());
    }

    public AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013, Map map) {
        if (interfaceC21013.getDescriptorForType() != getDescriptorForType()) {
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }
        for (Map.Entry entry : map.entrySet()) {
            C7323 c7323 = (C7323) entry.getKey();
            if (c7323.mo8649()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    addRepeatedField(c7323, it.next());
                }
            } else if (c7323.m20086() == EnumC2848.MESSAGE) {
                InterfaceC21013 interfaceC21014 = (InterfaceC21013) getField(c7323);
                if (interfaceC21014 == interfaceC21014.getDefaultInstanceForType()) {
                    setField(c7323, entry.getValue());
                } else {
                    setField(c7323, interfaceC21014.newBuilderForType().mergeFrom(interfaceC21014).mergeFrom((InterfaceC21013) entry.getValue()).build());
                }
            } else {
                setField(c7323, entry.getValue());
            }
        }
        mo2317mergeUnknownFields(interfaceC21013.getUnknownFields());
        return this;
    }

    @Override // l.AbstractC1225, l.InterfaceC7588
    public AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        int iMo11876;
        abstractC3660.getClass();
        C14430 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
        C8333 c8333 = new C8333(this);
        C24478 descriptorForType = getDescriptorForType();
        do {
            iMo11876 = abstractC3660.mo11876();
            if (iMo11876 == 0) {
                break;
            }
        } while (C21933.m49631(abstractC3660, unknownFieldSetBuilder, c24215, descriptorForType, c8333, iMo11876));
        if (unknownFieldSetBuilder != null) {
            setUnknownFieldSetBuilder(unknownFieldSetBuilder);
        }
        return this;
    }

    public C14430 getUnknownFieldSetBuilder() {
        C7719 unknownFields = getUnknownFields();
        int i = C7719.f25443;
        C14430 c14430M34853 = C14430.m34853();
        c14430M34853.m34859(unknownFields);
        return c14430M34853;
    }

    public void setUnknownFieldSetBuilder(C14430 c14430) {
        setUnknownFields(c14430.build());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo2317mergeUnknownFields(C7719 c7719) {
        C7719 unknownFields = getUnknownFields();
        int i = C7719.f25443;
        C14430 c14430M34853 = C14430.m34853();
        c14430M34853.m34859(unknownFields);
        c14430M34853.m34859(c7719);
        setUnknownFields(c14430M34853.build());
        return this;
    }

    @Override // l.InterfaceC14299
    public InterfaceC14299 getFieldBuilder(C7323 c7323) {
        throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
    }

    public InterfaceC14299 getRepeatedFieldBuilder(C7323 c7323, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
    }

    public String toString() {
        int i = C17414.f56613;
        return C24874.f80500.m55405(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24128 m2311(InterfaceC21013 interfaceC21013) {
        ArrayList<String> arrayListM49628 = C21933.m49628(interfaceC21013);
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : arrayListM49628) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return new C24128(sb.toString());
    }

    public void markClean() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    public void dispose() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4452mergeFrom(AbstractC17084 abstractC17084) {
        return (AbstractC0479) super.mo4452mergeFrom(abstractC17084);
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4453mergeFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (AbstractC0479) super.mo4453mergeFrom(abstractC17084, c24215);
    }

    @Override // l.AbstractC1225, l.InterfaceC7588
    public AbstractC0479 mergeFrom(byte[] bArr) {
        return (AbstractC0479) super.mergeFrom(bArr);
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4454mergeFrom(byte[] bArr, int i, int i2) {
        return (AbstractC0479) super.mo4454mergeFrom(bArr, i, i2);
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4456mergeFrom(byte[] bArr, C24215 c24215) {
        return (AbstractC0479) super.mo4456mergeFrom(bArr, c24215);
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4455mergeFrom(byte[] bArr, int i, int i2, C24215 c24215) {
        return (AbstractC0479) super.mo4455mergeFrom(bArr, i, i2, c24215);
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4449mergeFrom(InputStream inputStream) {
        return (AbstractC0479) super.mo4449mergeFrom(inputStream);
    }

    @Override // l.AbstractC1225
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0479 mo4450mergeFrom(InputStream inputStream, C24215 c24215) {
        return (AbstractC0479) super.mo4450mergeFrom(inputStream, c24215);
    }
}
