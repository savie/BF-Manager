package l;

import com.alipay.sdk.m.u0.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23019 extends AbstractC18079 implements InterfaceC1332 {
    public int memoizedSize = -1;

    @Override // l.InterfaceC15445, l.InterfaceC18266
    public /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.InterfaceC23206
    public /* bridge */ /* synthetic */ InterfaceC6977 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // l.InterfaceC23206
    public /* bridge */ /* synthetic */ InterfaceC6977 toBuilder() {
        return toBuilder();
    }

    public InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public List findInitializationErrors() {
        return C7683.m20313(this);
    }

    public String getInitializationErrorString() {
        return C7683.m20312(findInitializationErrors());
    }

    public boolean hasOneof(C21151 c21151) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C19741 getOneofFieldDescriptor(C21151 c21151) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    public final String toString() {
        int i = C14430.f47308;
        return C10902.f37084.m27334(this);
    }

    @Override // l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        C7683.m20315(this, getAllFields(), abstractC22044);
    }

    @Override // l.AbstractC18079
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    @Override // l.InterfaceC15445
    public boolean isInitialized() {
        for (C19741 c19741 : getDescriptorForType().getFields()) {
            if (c19741.m44914() && !hasField(c19741)) {
                return false;
            }
        }
        for (Map.Entry entry : getAllFields().entrySet()) {
            C19741 c19742 = (C19741) entry.getKey();
            if (c19742.m44913() == EnumC19035.MESSAGE) {
                if (c19742.mo23408()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC1332) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC1332) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // l.AbstractC18079
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    @Override // l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM20310 = C7683.m20310(this, getAllFields());
        this.memoizedSize = iM20310;
        return iM20310;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1332)) {
            return false;
        }
        InterfaceC1332 interfaceC1332 = (InterfaceC1332) obj;
        return getDescriptorForType() == interfaceC1332.getDescriptorForType() && m50915(getAllFields(), interfaceC1332.getAllFields()) && getUnknownFields().equals(interfaceC1332.getUnknownFields());
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + (m50911(getDescriptorForType().hashCode() + 779, getAllFields()) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC23725 m50916(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return AbstractC23725.m52255(0, bArr.length, bArr);
        }
        return (AbstractC23725) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50914(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return m50916(obj).equals(m50916(obj2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m50913(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        InterfaceC1332 interfaceC1332 = (InterfaceC1332) it.next();
        C2806 descriptorForType = interfaceC1332.getDescriptorForType();
        C19741 c19741M8522 = descriptorForType.m8522("key");
        C19741 c19741M8523 = descriptorForType.m8522(b.d);
        Object field = interfaceC1332.getField(c19741M8523);
        if (field instanceof C21857) {
            field = Integer.valueOf(((C21857) field).getNumber());
        }
        map.put(interfaceC1332.getField(c19741M8522), field);
        while (it.hasNext()) {
            InterfaceC1332 interfaceC1333 = (InterfaceC1332) it.next();
            Object field2 = interfaceC1333.getField(c19741M8523);
            if (field2 instanceof C21857) {
                field2 = Integer.valueOf(((C21857) field2).getNumber());
            }
            map.put(interfaceC1333.getField(c19741M8522), field2);
        }
        return map;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m50917(Object obj, Object obj2) {
        return C3118.m9386(m50913((List) obj), m50913((List) obj2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50915(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C19741 c19741 : map.keySet()) {
            if (!map2.containsKey(c19741)) {
                return false;
            }
            Object obj = map.get(c19741);
            Object obj2 = map2.get(c19741);
            if (c19741.getType() == EnumC8452.f29321) {
                if (c19741.mo23408()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!m50914(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                } else if (!m50914(obj, obj2)) {
                    return false;
                }
            } else if (c19741.m44909()) {
                if (!m50917(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50912(Object obj) {
        return C3118.m9385(m50913((List) obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50911(int i, Map map) {
        int iM50912;
        int i2;
        int iHashCode;
        for (Map.Entry entry : map.entrySet()) {
            C19741 c19741 = (C19741) entry.getKey();
            Object value = entry.getValue();
            int number = c19741.getNumber() + (i * 37);
            if (c19741.m44909()) {
                iM50912 = (number * 53) + m50912(value);
            } else {
                if (c19741.getType() != EnumC8452.f29322) {
                    i2 = number * 53;
                    iHashCode = value.hashCode();
                } else if (!c19741.mo23408()) {
                    i2 = number * 53;
                    iHashCode = ((InterfaceC12601) value).getNumber();
                } else {
                    int i3 = number * 53;
                    Iterator it = ((List) value).iterator();
                    int number2 = 1;
                    while (it.hasNext()) {
                        number2 = (number2 * 31) + ((InterfaceC12601) it.next()).getNumber();
                    }
                    iM50912 = i3 + number2;
                }
                i = iHashCode + i2;
            }
            i = iM50912;
        }
        return i;
    }

    @Override // l.AbstractC18079
    public C2474 newUninitializedMessageException() {
        return AbstractC3967.m11452((InterfaceC1332) this);
    }
}
