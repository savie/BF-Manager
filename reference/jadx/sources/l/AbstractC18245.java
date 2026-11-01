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

/* JADX INFO: renamed from: l.ᩳᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18245 extends AbstractC23019 implements Serializable {
    public static boolean alwaysUseFieldBuilders = false;
    public static final long serialVersionUID = 1;
    public C6708 unknownFields;

    public abstract C6956 internalGetFieldAccessorTable();

    public AbstractC18245() {
        this.unknownFields = C6708.m18141();
    }

    public AbstractC18245(AbstractC0584 abstractC0584) {
        this.unknownFields = abstractC0584.getUnknownFields();
    }

    @Override // l.InterfaceC23206
    public InterfaceC6271 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m42386() {
        m42422(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42422(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    @Override // l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return internalGetFieldAccessorTable().f23387;
    }

    @Deprecated
    public void mergeFromAndMakeImmutableInternal(AbstractC3262 abstractC3262, C2701 c2701) throws C4529 {
        C14739 c14739M35321 = C14739.m35321();
        c14739M35321.getClass();
        InterfaceC6667 interfaceC6667M35322 = c14739M35321.m35322(getClass());
        try {
            interfaceC6667M35322.mo18058(this, C4404.m12275(abstractC3262), c2701);
            interfaceC6667M35322.mo18055((Object) this);
        } catch (C4529 e) {
            e.m12651(this);
            throw e;
        } catch (IOException e2) {
            C4529 c4529 = new C4529(e2.getMessage(), e2);
            c4529.m12651(this);
            throw c4529;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map m42394(boolean z) {
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
                    if (!z && oneofFieldDescriptor.m44913() == EnumC19035.STRING) {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.mo23408()) {
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
            iM47594++;
        }
        return treeMap;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445
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

    public Map getAllFields() {
        return C0561.unmodifiableMap(m42394(false));
    }

    public Map getAllFieldsRaw() {
        return C0561.unmodifiableMap(m42394(true));
    }

    @Override // l.AbstractC23019
    public boolean hasOneof(C21151 c21151) {
        return C6956.m18693(internalGetFieldAccessorTable(), c21151).mo6415(this);
    }

    @Override // l.AbstractC23019
    public C19741 getOneofFieldDescriptor(C21151 c21151) {
        return C6956.m18693(internalGetFieldAccessorTable(), c21151).mo6411(this);
    }

    public boolean hasField(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo33884(this);
    }

    public Object getField(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo8303(this);
    }

    public Object getFieldRaw(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo32796(this);
    }

    public int getRepeatedFieldCount(C19741 c19741) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo33880(this);
    }

    public Object getRepeatedField(C19741 c19741, int i) {
        return C6956.m18695(internalGetFieldAccessorTable(), c19741).mo10105(i, this);
    }

    @Override // l.InterfaceC18266
    public C6708 getUnknownFields() {
        return this.unknownFields;
    }

    public void setUnknownFields(C6708 c6708) {
        this.unknownFields = c6708;
    }

    public boolean parseUnknownField(AbstractC3262 abstractC3262, C22231 c22231, C2701 c2701, int i) {
        abstractC3262.getClass();
        return c22231.m49361(i, abstractC3262);
    }

    public boolean parseUnknownFieldProto3(AbstractC3262 abstractC3262, C22231 c22231, C2701 c2701, int i) {
        return parseUnknownField(abstractC3262, c22231, c2701, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1332 m42418(InterfaceC6271 interfaceC6271, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC1332) interfaceC6271.parseFrom(inputStream);
        } catch (C4529 e) {
            throw e.m12650();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1332 m42419(InterfaceC6271 interfaceC6271, InputStream inputStream, C2701 c2701) throws IOException {
        try {
            return (InterfaceC1332) interfaceC6271.parseFrom(inputStream, c2701);
        } catch (C4529 e) {
            throw e.m12650();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1332 m42397(InterfaceC6271 interfaceC6271, AbstractC3262 abstractC3262) throws IOException {
        try {
            return (InterfaceC1332) interfaceC6271.parseFrom(abstractC3262);
        } catch (C4529 e) {
            throw e.m12650();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1332 m42398(InterfaceC6271 interfaceC6271, AbstractC3262 abstractC3262, C2701 c2701) throws IOException {
        try {
            return (InterfaceC1332) interfaceC6271.parseFrom(abstractC3262, c2701);
        } catch (C4529 e) {
            throw e.m12650();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1332 m42395(InterfaceC6271 interfaceC6271, InputStream inputStream) throws IOException {
        try {
            return (InterfaceC1332) interfaceC6271.parseDelimitedFrom(inputStream);
        } catch (C4529 e) {
            throw e.m12650();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1332 m42396(InterfaceC6271 interfaceC6271, InputStream inputStream, C2701 c2701) throws IOException {
        try {
            return (InterfaceC1332) interfaceC6271.parseDelimitedFrom(inputStream, c2701);
        } catch (C4529 e) {
            throw e.m12650();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42410() {
        return C15882.m37762() && C15882.m37783();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23890 m42411() {
        return C20362.m45939();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC14718 m42423() {
        return C8764.m22768();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11190 m42387() {
        return C7641.m20195();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC16834 m42413() {
        return C0689.m3071();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0605 m42417() {
        return C8908.m23170();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2016 m42400(InterfaceC2016 interfaceC2016) {
        return m42401(interfaceC2016, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2016 m42401(InterfaceC2016 interfaceC2016, int i) {
        int size = interfaceC2016.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return interfaceC2016.mo3072(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2016 m42399(Class cls) {
        return C2037.m6534();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        C7683.m20315(this, getAllFieldsRaw(), abstractC22044);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM20310 = C7683.m20310(this, getAllFieldsRaw());
        this.memoizedSize = iM20310;
        return iM20310;
    }

    public Object newInstance(C21773 c21773) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15424 m42403(InterfaceC1332 interfaceC1332, int i, Class cls, InterfaceC1332 interfaceC1333) {
        return new C15424(new C21046(interfaceC1332, i), cls, interfaceC1333, EnumC11274.IMMUTABLE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15424 m42402(Class cls, InterfaceC1332 interfaceC1332) {
        return new C15424(null, cls, interfaceC1332, EnumC11274.IMMUTABLE);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Method m42416(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m42415(Method method, Object obj, Object... objArr) {
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

    public AbstractC4860 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C9470 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public Object writeReplace() {
        return new C21067(this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC23974 m42420(AbstractC14802 abstractC14802) {
        if (abstractC14802.mo35468()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (AbstractC23974) abstractC14802;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m42389(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        return ((AbstractC23725) obj).size() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42390(int i, Object obj) {
        if (obj instanceof String) {
            return AbstractC22044.m48970((String) obj) + AbstractC22044.m48973(i);
        }
        return AbstractC22044.m48968(i, (AbstractC23725) obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m42412(Object obj) {
        if (!(obj instanceof String)) {
            int i = AbstractC22044.f71447;
            int size = ((AbstractC23725) obj).size();
            return AbstractC22044.m48959(size) + size;
        }
        return AbstractC22044.m48970((String) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42405(AbstractC22044 abstractC22044, int i, Object obj) {
        if (obj instanceof String) {
            abstractC22044.mo14237(i, (String) obj);
        } else {
            abstractC22044.mo14239(i, (AbstractC23725) obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42406(AbstractC22044 abstractC22044, Object obj) {
        if (obj instanceof String) {
            abstractC22044.mo14243((String) obj);
        } else {
            abstractC22044.mo14245((AbstractC23725) obj);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42421(AbstractC22044 abstractC22044, C9470 c9470, C0296 c0296, int i) {
        Map mapM24248 = c9470.m24248();
        abstractC22044.getClass();
        m42407(abstractC22044, mapM24248, c0296, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m42414(AbstractC22044 abstractC22044, C9470 c9470, C0296 c0296, int i) {
        Map mapM24248 = c9470.m24248();
        abstractC22044.getClass();
        m42407(abstractC22044, mapM24248, c0296, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m42388(AbstractC22044 abstractC22044, C9470 c9470, C0296 c0296, int i) {
        Map mapM24248 = c9470.m24248();
        abstractC22044.getClass();
        m42407(abstractC22044, mapM24248, c0296, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42409(AbstractC22044 abstractC22044, C9470 c9470, C0296 c0296, int i) {
        Map mapM24248 = c9470.m24248();
        abstractC22044.getClass();
        m42407(abstractC22044, mapM24248, c0296, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42408(AbstractC22044 abstractC22044, Map map, C0296 c0296, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            c0296.getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42407(AbstractC22044 abstractC22044, Map map, C0296 c0296, int i) {
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            c0296.getClass();
            throw null;
        }
    }
}
