package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۡ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9035 extends AbstractC19124 implements Serializable {
    public static boolean alwaysUseFieldBuilders = false;
    public static final long serialVersionUID = 1;
    public C7719 unknownFields;

    public abstract C7544 internalGetFieldAccessorTable();

    public AbstractC9035() {
        this.unknownFields = C7719.m21003();
    }

    public AbstractC9035(AbstractC15001 abstractC15001) {
        this.unknownFields = abstractC15001.getUnknownFields();
    }

    @Override // l.InterfaceC18775
    public InterfaceC11490 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m24120() {
        m24130(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24130(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    @Override // l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return internalGetFieldAccessorTable().f24884;
    }

    @Deprecated
    public void mergeFromAndMakeImmutableInternal(AbstractC3660 abstractC3660, C24215 c24215) throws C20463 {
        C17457 c17457M40958 = C17457.m40958();
        c17457M40958.getClass();
        InterfaceC7762 interfaceC7762M40959 = c17457M40958.m40959(getClass());
        try {
            interfaceC7762M40959.mo21142(this, C20814.m47607(abstractC3660), c24215);
            interfaceC7762M40959.mo21140((Object) this);
        } catch (C20463 e) {
            e.m46972(this);
            throw e;
        } catch (IOException e2) {
            C20463 c20463 = new C20463(e2.getMessage(), e2);
            c20463.m46972(this);
            throw c20463;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map m24100(boolean z) {
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
                    if (!z && oneofFieldDescriptor.m20086() == EnumC2848.STRING) {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.mo8649()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                if (!z) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                } else {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            }
            iM27502++;
        }
        return treeMap;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
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
    public Map getAllFields() {
        return C4681.unmodifiableMap(m24100(false));
    }

    public Map getAllFieldsRaw() {
        return C4681.unmodifiableMap(m24100(true));
    }

    @Override // l.AbstractC19124
    public boolean hasOneof(C10788 c10788) {
        return C7544.m20618(internalGetFieldAccessorTable(), c10788).mo1159(this);
    }

    @Override // l.AbstractC19124
    public C7323 getOneofFieldDescriptor(C10788 c10788) {
        return C7544.m20618(internalGetFieldAccessorTable(), c10788).mo1155(this);
    }

    @Override // l.InterfaceC9078
    public boolean hasField(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30212(this);
    }

    @Override // l.InterfaceC9078
    public Object getField(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo10006(this);
    }

    public Object getFieldRaw(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30209(this);
    }

    public int getRepeatedFieldCount(C7323 c7323) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo30213(this);
    }

    public Object getRepeatedField(C7323 c7323, int i) {
        return C7544.m20619(internalGetFieldAccessorTable(), c7323).mo10005(i, this);
    }

    @Override // l.InterfaceC9078
    public C7719 getUnknownFields() {
        return this.unknownFields;
    }

    public void setUnknownFields(C7719 c7719) {
        this.unknownFields = c7719;
    }

    public boolean parseUnknownField(AbstractC3660 abstractC3660, C14430 c14430, C24215 c24215, int i) {
        abstractC3660.getClass();
        return c14430.m34860(i, abstractC3660);
    }

    public boolean parseUnknownFieldProto3(AbstractC3660 abstractC3660, C14430 c14430, C24215 c24215, int i) {
        return parseUnknownField(abstractC3660, c14430, c24215, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC21013 m24127(InterfaceC11490 interfaceC11490, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC21013) interfaceC11490.parseFrom(inputStream);
        } catch (C20463 e) {
            throw e.m46971();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC21013 m24128(InterfaceC11490 interfaceC11490, InputStream inputStream, C24215 c24215) throws IOException {
        try {
            return (InterfaceC21013) interfaceC11490.parseFrom(inputStream, c24215);
        } catch (C20463 e) {
            throw e.m46971();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21013 m24109(InterfaceC11490 interfaceC11490, AbstractC3660 abstractC3660) throws IOException {
        try {
            return (InterfaceC21013) interfaceC11490.parseFrom(abstractC3660);
        } catch (C20463 e) {
            throw e.m46971();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21013 m24110(InterfaceC11490 interfaceC11490, AbstractC3660 abstractC3660, C24215 c24215) throws IOException {
        try {
            return (InterfaceC21013) interfaceC11490.parseFrom(abstractC3660, c24215);
        } catch (C20463 e) {
            throw e.m46971();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21013 m24107(InterfaceC11490 interfaceC11490, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC21013) interfaceC11490.parseDelimitedFrom(inputStream);
        } catch (C20463 e) {
            throw e.m46971();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21013 m24108(InterfaceC11490 interfaceC11490, InputStream inputStream, C24215 c24215) throws IOException {
        try {
            return (InterfaceC21013) interfaceC11490.parseDelimitedFrom(inputStream, c24215);
        } catch (C20463 e) {
            throw e.m46971();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24116() {
        return C22832.m51532() && C22832.m51523();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC16733 m24122() {
        return C19717.m45412();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17479 m24121() {
        return C13749.m33595();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC24939 m24131() {
        return C21715.m49284();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13004 m24118() {
        return C15263.m36615();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC15241 m24125() {
        return C13902.m33850();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15987 m24104(InterfaceC15987 interfaceC15987) {
        return m24105(interfaceC15987, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15987 m24105(InterfaceC15987 interfaceC15987, int i) {
        int size = interfaceC15987.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return interfaceC15987.mo4024(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15987 m24103(Class cls) {
        return C15965.m38083();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        C21933.m49630(this, getAllFieldsRaw(), abstractC14846);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM49625 = C21933.m49625(this, getAllFieldsRaw());
        this.memoizedSize = iM49625;
        return iM49625;
    }

    public Object newInstance(C0832 c0832) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9780 m24102(InterfaceC21013 interfaceC21013, int i, Class cls, InterfaceC21013 interfaceC21014) {
        return new C9780(new C10526(interfaceC21013, i), cls, interfaceC21014, EnumC24961.IMMUTABLE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9780 m24101(Class cls, InterfaceC21013 interfaceC21013) {
        return new C9780(null, cls, interfaceC21013, EnumC24961.IMMUTABLE);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Method m24124(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m24123(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IllegalStateException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public AbstractC20267 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C23251 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public Object writeReplace() {
        return new C10766(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC16755 m24126(AbstractC17501 abstractC17501) {
        if (abstractC17501.mo39567()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (AbstractC16755) abstractC17501;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m24133(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        return ((AbstractC17084) obj).size() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24096(int i, Object obj) {
        if (obj instanceof String) {
            return AbstractC14846.m35769((String) obj) + AbstractC14846.m35765(i);
        }
        return AbstractC14846.m35761(i, (AbstractC17084) obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m24117(Object obj) {
        if (!(obj instanceof String)) {
            int i = AbstractC14846.f48541;
            int size = ((AbstractC17084) obj).size();
            return AbstractC14846.m35763(size) + size;
        }
        return AbstractC14846.m35769((String) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24111(AbstractC14846 abstractC14846, int i, Object obj) {
        if (obj instanceof String) {
            abstractC14846.mo14007(i, (String) obj);
        } else {
            abstractC14846.mo14008(i, (AbstractC17084) obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24112(AbstractC14846 abstractC14846, Object obj) {
        if (obj instanceof String) {
            abstractC14846.mo14013((String) obj);
        } else {
            abstractC14846.mo14014((AbstractC17084) obj);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24129(AbstractC14846 abstractC14846, C23251 c23251, C15045 c15045, int i) {
        Map mapM52272 = c23251.m52272();
        abstractC14846.getClass();
        m24113(abstractC14846, mapM52272, c15045, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m24119(AbstractC14846 abstractC14846, C23251 c23251, C15045 c15045, int i) {
        Map mapM52272 = c23251.m52272();
        abstractC14846.getClass();
        m24113(abstractC14846, mapM52272, c15045, i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m24132(AbstractC14846 abstractC14846, C23251 c23251, C15045 c15045, int i) {
        Map mapM52272 = c23251.m52272();
        abstractC14846.getClass();
        m24113(abstractC14846, mapM52272, c15045, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24115(AbstractC14846 abstractC14846, C23251 c23251, C15045 c15045, int i) {
        Map mapM52272 = c23251.m52272();
        abstractC14846.getClass();
        m24113(abstractC14846, mapM52272, c15045, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24114(AbstractC14846 abstractC14846, Map map, C15045 c15045, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            c15045.getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24113(AbstractC14846 abstractC14846, Map map, C15045 c15045, int i) {
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            c15045.getClass();
            throw null;
        }
    }
}
