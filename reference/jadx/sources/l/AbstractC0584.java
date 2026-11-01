package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֡ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0584 extends AbstractC3967 {
    public InterfaceC6790 builderParent;
    public boolean isClean;
    public C20341 meAsParent;
    public Object unknownFieldsOrBuilder;

    public abstract C6956 internalGetFieldAccessorTable();

    public AbstractC0584() {
        this(null);
    }

    public AbstractC0584(InterfaceC6790 interfaceC6790) {
        this.unknownFieldsOrBuilder = C6708.m18141();
        this.builderParent = interfaceC6790;
    }

    @Override // l.AbstractC3967
    public void dispose() {
        this.builderParent = null;
    }

    public void onBuilt() {
        if (this.builderParent != null) {
            markClean();
        }
    }

    @Override // l.AbstractC3967
    public void markClean() {
        this.isClean = true;
    }

    public boolean isClean() {
        return this.isClean;
    }

    @Override // l.AbstractC3967, l.AbstractC21607
    /* JADX INFO: renamed from: clone */
    public AbstractC0584 mo2780clone() {
        AbstractC0584 abstractC0584 = (AbstractC0584) getDefaultInstanceForType().newBuilderForType();
        abstractC0584.mergeFrom(buildPartial());
        return abstractC0584;
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public AbstractC0584 mo2777clear() {
        this.unknownFieldsOrBuilder = C6708.m18141();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return internalGetFieldAccessorTable().f23387;
    }

    @Override // l.InterfaceC18266
    public Map getAllFields() {
        return C0561.unmodifiableMap(m2773());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map m2773() {
        TreeMap treeMap = new TreeMap();
        List fields = internalGetFieldAccessorTable().f23387.getFields();
        int iM47594 = 0;
        while (iM47594 < fields.size()) {
            C19741 oneofFieldDescriptor = (C19741) fields.get(iM47594);
            C21151 c21151M44906 = oneofFieldDescriptor.m44906();
            if (c21151M44906 != null) {
                iM47594 += c21151M44906.m47594() - 1;
                if (hasOneof(c21151M44906)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(c21151M44906);
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            } else if (oneofFieldDescriptor.mo23408()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
            }
            iM47594++;
        }
        return treeMap;
    }

    @Override // l.InterfaceC22500
    public InterfaceC22500 newBuilderForField(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo4665();
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public InterfaceC22500 getFieldBuilder(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo4664(this);
    }

    @Override // l.AbstractC3967
    public InterfaceC22500 getRepeatedFieldBuilder(C19741 c19741, int i) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo29658(this, i);
    }

    @Override // l.AbstractC3967
    public boolean hasOneof(C21151 c21151) {
        return C6956.m18693(internalGetFieldAccessorTable(), c21151).mo6413(this);
    }

    @Override // l.AbstractC3967
    public C19741 getOneofFieldDescriptor(C21151 c21151) {
        return C6956.m18693(internalGetFieldAccessorTable(), c21151).mo6414(this);
    }

    @Override // l.InterfaceC18266
    public boolean hasField(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo33883(this);
    }

    @Override // l.InterfaceC18266
    public Object getField(C19741 c19741) {
        Object objMo8304 = C6956.m18695(internalGetFieldAccessorTable(), c19741).mo8304(this);
        return c19741.mo23408() ? C0561.unmodifiableList((List) objMo8304) : objMo8304;
    }

    @Override // l.InterfaceC22500
    public AbstractC0584 setField(C19741 c19741, Object obj) {
        C6956.m18695(internalGetFieldAccessorTable(), c19741).mo4666(this, obj);
        return this;
    }

    @Override // l.InterfaceC22500
    public AbstractC0584 clearField(C19741 c19741) {
        C6956.m18695(internalGetFieldAccessorTable(), c19741).mo33881(this);
        return this;
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: clearOneof */
    public AbstractC0584 mo2778clearOneof(C21151 c21151) {
        C6956.m18693(internalGetFieldAccessorTable(), c21151).mo6412(this);
        return this;
    }

    public int getRepeatedFieldCount(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo33882(this);
    }

    public Object getRepeatedField(C19741 c19741, int i) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo10107(this, i);
    }

    @Override // 
    /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public AbstractC0584 mo2782setRepeatedField(C19741 c19741, int i, Object obj) {
        C6956.m18695(internalGetFieldAccessorTable(), c19741).mo10106(this, i, obj);
        return this;
    }

    @Override // l.InterfaceC22500
    public AbstractC0584 addRepeatedField(C19741 c19741, Object obj) {
        C6956.m18695(internalGetFieldAccessorTable(), c19741).mo10108(this, obj);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC0584 m2775(C6708 c6708) {
        this.unknownFieldsOrBuilder = c6708;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC22500
    public AbstractC0584 setUnknownFields(C6708 c6708) {
        return m2775(c6708);
    }

    public AbstractC0584 setUnknownFieldsProto3(C6708 c6708) {
        return m2775(c6708);
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: mergeUnknownFields */
    public AbstractC0584 mo2781mergeUnknownFields(C6708 c6708) {
        if (C6708.m18141().equals(c6708)) {
            return this;
        }
        if (C6708.m18141().equals(this.unknownFieldsOrBuilder)) {
            this.unknownFieldsOrBuilder = c6708;
            onChanged();
            return this;
        }
        getUnknownFieldSetBuilder().m49360(c6708);
        onChanged();
        return this;
    }

    @Override // l.InterfaceC15445
    public boolean isInitialized() {
        for (C19741 c19741 : getDescriptorForType().getFields()) {
            if (c19741.m44914() && !hasField(c19741)) {
                return false;
            }
            if (c19741.m44913() == EnumC19035.MESSAGE) {
                if (c19741.mo23408()) {
                    Iterator it = ((List) getField(c19741)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC1332) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c19741) && !((InterfaceC1332) getField(c19741)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // l.InterfaceC18266
    public final C6708 getUnknownFields() {
        Object obj = this.unknownFieldsOrBuilder;
        if (!(obj instanceof C6708)) {
            return ((C22231) obj).build();
        }
        return (C6708) obj;
    }

    public boolean parseUnknownField(AbstractC3262 abstractC3262, C2701 c2701, int i) {
        abstractC3262.getClass();
        return getUnknownFieldSetBuilder().m49361(i, abstractC3262);
    }

    public final void mergeUnknownLengthDelimitedField(int i, AbstractC23725 abstractC23725) {
        getUnknownFieldSetBuilder().m49358(i, abstractC23725);
    }

    public final void mergeUnknownVarintField(int i, int i2) {
        getUnknownFieldSetBuilder().m49356(i, i2);
    }

    @Override // l.AbstractC3967
    public C22231 getUnknownFieldSetBuilder() {
        Object obj = this.unknownFieldsOrBuilder;
        if (obj instanceof C6708) {
            C22231 c22231M49355 = C22231.m49355();
            c22231M49355.m49360((C6708) obj);
            this.unknownFieldsOrBuilder = c22231M49355;
        }
        onChanged();
        return (C22231) this.unknownFieldsOrBuilder;
    }

    @Override // l.AbstractC3967
    public void setUnknownFieldSetBuilder(C22231 c22231) {
        this.unknownFieldsOrBuilder = c22231;
        onChanged();
    }

    public InterfaceC6790 getParentForChildren() {
        if (this.meAsParent == null) {
            this.meAsParent = new C20341(this);
        }
        return this.meAsParent;
    }

    public final void onChanged() {
        InterfaceC6790 interfaceC6790;
        if (!this.isClean || (interfaceC6790 = this.builderParent) == null) {
            return;
        }
        interfaceC6790.mo18391();
        this.isClean = false;
    }

    public AbstractC4860 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C9470 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public AbstractC4860 internalGetMutableMapFieldReflection(int i) {
        return internalGetMutableMapField(i);
    }

    @Deprecated
    public C9470 internalGetMutableMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }
}
