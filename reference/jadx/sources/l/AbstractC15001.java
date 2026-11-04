package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܳ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15001 extends AbstractC0479 {
    public InterfaceC7937 builderParent;
    public boolean isClean;
    public C19477 meAsParent;
    public Object unknownFieldsOrBuilder;

    public abstract C7544 internalGetFieldAccessorTable();

    public AbstractC15001() {
        this(null);
    }

    public AbstractC15001(InterfaceC7937 interfaceC7937) {
        this.unknownFieldsOrBuilder = C7719.m21003();
        this.builderParent = interfaceC7937;
    }

    @Override // l.AbstractC0479
    public void dispose() {
        this.builderParent = null;
    }

    public void onBuilt() {
        if (this.builderParent != null) {
            markClean();
        }
    }

    @Override // l.AbstractC0479
    public void markClean() {
        this.isClean = true;
    }

    public boolean isClean() {
        return this.isClean;
    }

    @Override // l.AbstractC0479, l.AbstractC1225
    /* JADX INFO: renamed from: clone */
    public AbstractC15001 mo2316clone() {
        AbstractC15001 abstractC15001 = (AbstractC15001) getDefaultInstanceForType().newBuilderForType();
        abstractC15001.mergeFrom(buildPartial());
        return abstractC15001;
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public AbstractC15001 mo2313clear() {
        this.unknownFieldsOrBuilder = C7719.m21003();
        onChanged();
        return this;
    }

    public C24478 getDescriptorForType() {
        return internalGetFieldAccessorTable().f24884;
    }

    public Map getAllFields() {
        return C4681.unmodifiableMap(m36130());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map m36130() {
        TreeMap treeMap = new TreeMap();
        List fields = internalGetFieldAccessorTable().f24884.getFields();
        int iM27502 = 0;
        while (iM27502 < fields.size()) {
            C7323 oneofFieldDescriptor = (C7323) fields.get(iM27502);
            C10788 c10788M20094 = oneofFieldDescriptor.m20094();
            if (c10788M20094 != null) {
                iM27502 += c10788M20094.m27502() - 1;
                if (hasOneof(c10788M20094)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(c10788M20094);
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            } else if (oneofFieldDescriptor.mo8649()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
            }
            iM27502++;
        }
        return treeMap;
    }

    public InterfaceC14299 newBuilderForField(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo17567();
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public InterfaceC14299 getFieldBuilder(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30214(this);
    }

    @Override // l.AbstractC0479
    public InterfaceC14299 getRepeatedFieldBuilder(C7323 c7323, int i) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo17568(this, i);
    }

    @Override // l.AbstractC0479
    public boolean hasOneof(C10788 c10788) {
        return C7544.m20618(internalGetFieldAccessorTable(), c10788).mo1157(this);
    }

    @Override // l.AbstractC0479
    public C7323 getOneofFieldDescriptor(C10788 c10788) {
        return C7544.m20618(internalGetFieldAccessorTable(), c10788).mo1158(this);
    }

    public boolean hasField(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30210(this);
    }

    public Object getField(C7323 c7323) {
        Object objMo10008 = C7544.m20619(internalGetFieldAccessorTable(), c7323).mo10008(this);
        return c7323.mo8649() ? C4681.unmodifiableList((List) objMo10008) : objMo10008;
    }

    @Override // l.InterfaceC14299
    public AbstractC15001 setField(C7323 c7323, Object obj) {
        C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30208(this, obj);
        return this;
    }

    @Override // l.InterfaceC14299
    public AbstractC15001 clearField(C7323 c7323) {
        C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30207(this);
        return this;
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: clearOneof */
    public AbstractC15001 mo2314clearOneof(C10788 c10788) {
        C7544.m20618(internalGetFieldAccessorTable(), c10788).mo1156(this);
        return this;
    }

    public int getRepeatedFieldCount(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30211(this);
    }

    public Object getRepeatedField(C7323 c7323, int i) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo10009(this, i);
    }

    @Override // 
    public AbstractC15001 setRepeatedField(C7323 c7323, int i, Object obj) {
        C7544.m20619(internalGetFieldAccessorTable(), c7323).mo10007(this, i, obj);
        return this;
    }

    @Override // l.InterfaceC14299
    public AbstractC15001 addRepeatedField(C7323 c7323, Object obj) {
        C7544.m20619(internalGetFieldAccessorTable(), c7323).mo10010(this, obj);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC15001 m36132(C7719 c7719) {
        this.unknownFieldsOrBuilder = c7719;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC14299
    public AbstractC15001 setUnknownFields(C7719 c7719) {
        return m36132(c7719);
    }

    public AbstractC15001 setUnknownFieldsProto3(C7719 c7719) {
        return m36132(c7719);
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: mergeUnknownFields */
    public AbstractC15001 mo2317mergeUnknownFields(C7719 c7719) {
        if (C7719.m21003().equals(c7719)) {
            return this;
        }
        if (C7719.m21003().equals(this.unknownFieldsOrBuilder)) {
            this.unknownFieldsOrBuilder = c7719;
            onChanged();
            return this;
        }
        getUnknownFieldSetBuilder().m34859(c7719);
        onChanged();
        return this;
    }

    @Override // l.InterfaceC9824
    public boolean isInitialized() {
        for (C7323 c7323 : getDescriptorForType().getFields()) {
            if (c7323.m20090() && !hasField(c7323)) {
                return false;
            }
            if (c7323.m20086() == EnumC2848.MESSAGE) {
                if (c7323.mo8649()) {
                    Iterator it = ((List) getField(c7323)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC21013) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c7323) && !((InterfaceC21013) getField(c7323)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // l.InterfaceC9078
    public final C7719 getUnknownFields() {
        Object obj = this.unknownFieldsOrBuilder;
        if (!(obj instanceof C7719)) {
            return ((C14430) obj).build();
        }
        return (C7719) obj;
    }

    public boolean parseUnknownField(AbstractC3660 abstractC3660, C24215 c24215, int i) {
        abstractC3660.getClass();
        return getUnknownFieldSetBuilder().m34860(i, abstractC3660);
    }

    public final void mergeUnknownLengthDelimitedField(int i, AbstractC17084 abstractC17084) {
        getUnknownFieldSetBuilder().m34856(i, abstractC17084);
    }

    public final void mergeUnknownVarintField(int i, int i2) {
        getUnknownFieldSetBuilder().m34855(i, i2);
    }

    @Override // l.AbstractC0479
    public C14430 getUnknownFieldSetBuilder() {
        Object obj = this.unknownFieldsOrBuilder;
        if (obj instanceof C7719) {
            C14430 c14430M34853 = C14430.m34853();
            c14430M34853.m34859((C7719) obj);
            this.unknownFieldsOrBuilder = c14430M34853;
        }
        onChanged();
        return (C14430) this.unknownFieldsOrBuilder;
    }

    @Override // l.AbstractC0479
    public void setUnknownFieldSetBuilder(C14430 c14430) {
        this.unknownFieldsOrBuilder = c14430;
        onChanged();
    }

    public InterfaceC7937 getParentForChildren() {
        if (this.meAsParent == null) {
            this.meAsParent = new C19477(this);
        }
        return this.meAsParent;
    }

    public final void onChanged() {
        InterfaceC7937 interfaceC7937;
        if (!this.isClean || (interfaceC7937 = this.builderParent) == null) {
            return;
        }
        interfaceC7937.mo21509();
        this.isClean = false;
    }

    public AbstractC20267 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C23251 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public AbstractC20267 internalGetMutableMapFieldReflection(int i) {
        return internalGetMutableMapField(i);
    }

    @Deprecated
    public C23251 internalGetMutableMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }
}
