package l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3967 extends AbstractC21607 implements InterfaceC22500 {
    @Override // l.InterfaceC15445, l.InterfaceC18266
    public /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11455mergeFrom(AbstractC3262 abstractC3262) {
        return mergeFrom(abstractC3262, (C2701) C4818.f16954);
    }

    @Override // l.InterfaceC6977, l.InterfaceC22500
    public /* bridge */ /* synthetic */ InterfaceC23206 build() {
        return build();
    }

    @Override // l.InterfaceC6977, l.InterfaceC22500
    public /* bridge */ /* synthetic */ InterfaceC23206 buildPartial() {
        return buildPartial();
    }

    @Override // l.AbstractC21607, l.InterfaceC6977
    public /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(InterfaceC23206 interfaceC23206) {
        return super.mergeFrom(interfaceC23206);
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo2780clone() {
        throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
    }

    public boolean hasOneof(C21151 c21151) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C19741 getOneofFieldDescriptor(C21151 c21151) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // 
    /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo2778clearOneof(C21151 c21151) {
        throw new UnsupportedOperationException("clearOneof() is not implemented.");
    }

    @Override // 
    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC3967 mo2777clear() {
        Iterator it = getAllFields().entrySet().iterator();
        while (it.hasNext()) {
            clearField((C19741) ((Map.Entry) it.next()).getKey());
        }
        return this;
    }

    public List findInitializationErrors() {
        return C7683.m20313(this);
    }

    public String getInitializationErrorString() {
        return C7683.m20312(findInitializationErrors());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC21607
    public AbstractC3967 internalMergeFrom(AbstractC18079 abstractC18079) {
        return mergeFrom((InterfaceC1332) abstractC18079);
    }

    public AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        return mergeFrom(interfaceC1332, interfaceC1332.getAllFields());
    }

    public AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332, Map map) {
        if (interfaceC1332.getDescriptorForType() != getDescriptorForType()) {
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }
        for (Map.Entry entry : map.entrySet()) {
            C19741 c19741 = (C19741) entry.getKey();
            if (c19741.mo23408()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    addRepeatedField(c19741, it.next());
                }
            } else if (c19741.m44913() == EnumC19035.MESSAGE) {
                InterfaceC1332 interfaceC1333 = (InterfaceC1332) getField(c19741);
                if (interfaceC1333 == interfaceC1333.getDefaultInstanceForType()) {
                    setField(c19741, entry.getValue());
                } else {
                    setField(c19741, interfaceC1333.newBuilderForType().mergeFrom(interfaceC1333).mergeFrom((InterfaceC1332) entry.getValue()).build());
                }
            } else {
                setField(c19741, entry.getValue());
            }
        }
        mo2781mergeUnknownFields(interfaceC1332.getUnknownFields());
        return this;
    }

    @Override // l.AbstractC21607, l.InterfaceC6977
    public AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        int iMo6048;
        abstractC3262.getClass();
        C22231 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
        C8389 c8389 = new C8389(this);
        C2806 descriptorForType = getDescriptorForType();
        do {
            iMo6048 = abstractC3262.mo6048();
            if (iMo6048 == 0) {
                break;
            }
        } while (C7683.m20316(abstractC3262, unknownFieldSetBuilder, c2701, descriptorForType, c8389, iMo6048));
        if (unknownFieldSetBuilder != null) {
            setUnknownFieldSetBuilder(unknownFieldSetBuilder);
        }
        return this;
    }

    public C22231 getUnknownFieldSetBuilder() {
        C6708 unknownFields = getUnknownFields();
        int i = C6708.f22609;
        C22231 c22231M49355 = C22231.m49355();
        c22231M49355.m49360(unknownFields);
        return c22231M49355;
    }

    public void setUnknownFieldSetBuilder(C22231 c22231) {
        setUnknownFields(c22231.build());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo2781mergeUnknownFields(C6708 c6708) {
        C6708 unknownFields = getUnknownFields();
        int i = C6708.f22609;
        C22231 c22231M49355 = C22231.m49355();
        c22231M49355.m49360(unknownFields);
        c22231M49355.m49360(c6708);
        setUnknownFields(c22231M49355.build());
        return this;
    }

    public InterfaceC22500 getFieldBuilder(C19741 c19741) {
        throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
    }

    public InterfaceC22500 getRepeatedFieldBuilder(C19741 c19741, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
    }

    public String toString() {
        int i = C14430.f47308;
        return C10902.f37084.m27334(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2474 m11452(InterfaceC1332 interfaceC1332) {
        ArrayList<String> arrayListM20313 = C7683.m20313(interfaceC1332);
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : arrayListM20313) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return new C2474(sb.toString());
    }

    public void markClean() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    public void dispose() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11456mergeFrom(AbstractC23725 abstractC23725) {
        return (AbstractC3967) super.mo11456mergeFrom(abstractC23725);
    }

    @Override // l.AbstractC21607, l.InterfaceC22500
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11457mergeFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (AbstractC3967) super.mo11457mergeFrom(abstractC23725, c2701);
    }

    @Override // l.AbstractC21607, l.InterfaceC6977
    public AbstractC3967 mergeFrom(byte[] bArr) {
        return (AbstractC3967) super.mergeFrom(bArr);
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11458mergeFrom(byte[] bArr, int i, int i2) {
        return (AbstractC3967) super.mo11458mergeFrom(bArr, i, i2);
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11460mergeFrom(byte[] bArr, C2701 c2701) {
        return (AbstractC3967) super.mo11460mergeFrom(bArr, c2701);
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11459mergeFrom(byte[] bArr, int i, int i2, C2701 c2701) {
        return (AbstractC3967) super.mo11459mergeFrom(bArr, i, i2, c2701);
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11453mergeFrom(InputStream inputStream) {
        return (AbstractC3967) super.mo11453mergeFrom(inputStream);
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC3967 mo11454mergeFrom(InputStream inputStream, C2701 c2701) {
        return (AbstractC3967) super.mo11454mergeFrom(inputStream, c2701);
    }
}
