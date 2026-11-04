package l;

import com.alipay.sdk.m.u0.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19124 extends AbstractC9427 implements InterfaceC21013 {
    public int memoizedSize = -1;

    @Override // l.InterfaceC9824
    public /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.InterfaceC18775
    public /* bridge */ /* synthetic */ InterfaceC7588 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // l.InterfaceC18775
    public /* bridge */ /* synthetic */ InterfaceC7588 toBuilder() {
        return toBuilder();
    }

    public InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public List findInitializationErrors() {
        return C21933.m49628(this);
    }

    public String getInitializationErrorString() {
        return C21933.m49627(findInitializationErrors());
    }

    public boolean hasOneof(C10788 c10788) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C7323 getOneofFieldDescriptor(C10788 c10788) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    public final String toString() {
        int i = C17414.f56613;
        return C24874.f80500.m55405(this);
    }

    @Override // l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        C21933.m49630(this, getAllFields(), abstractC14846);
    }

    @Override // l.AbstractC9427
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    @Override // l.InterfaceC9824
    public boolean isInitialized() {
        for (C7323 c7323 : getDescriptorForType().getFields()) {
            if (c7323.m20090() && !hasField(c7323)) {
                return false;
            }
        }
        for (Map.Entry entry : getAllFields().entrySet()) {
            C7323 c7324 = (C7323) entry.getKey();
            if (c7324.m20086() == EnumC2848.MESSAGE) {
                if (c7324.mo8649()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC21013) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC21013) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // l.AbstractC9427
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    @Override // l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM49625 = C21933.m49625(this, getAllFields());
        this.memoizedSize = iM49625;
        return iM49625;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC21013)) {
            return false;
        }
        InterfaceC21013 interfaceC21013 = (InterfaceC21013) obj;
        return getDescriptorForType() == interfaceC21013.getDescriptorForType() && m44252(getAllFields(), interfaceC21013.getAllFields()) && getUnknownFields().equals(interfaceC21013.getUnknownFields());
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + (m44248(getDescriptorForType().hashCode() + 779, getAllFields()) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC17084 m44253(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return AbstractC17084.m40218(0, bArr.length, bArr);
        }
        return (AbstractC17084) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44251(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return m44253(obj).equals(m44253(obj2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m44250(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        InterfaceC21013 interfaceC21013 = (InterfaceC21013) it.next();
        C24478 descriptorForType = interfaceC21013.getDescriptorForType();
        C7323 c7323M54736 = descriptorForType.m54736("key");
        C7323 c7323M54737 = descriptorForType.m54736(b.d);
        Object field = interfaceC21013.getField(c7323M54737);
        if (field instanceof C1357) {
            field = Integer.valueOf(((C1357) field).getNumber());
        }
        map.put(interfaceC21013.getField(c7323M54736), field);
        while (it.hasNext()) {
            InterfaceC21013 interfaceC21014 = (InterfaceC21013) it.next();
            Object field2 = interfaceC21014.getField(c7323M54737);
            if (field2 instanceof C1357) {
                field2 = Integer.valueOf(((C1357) field2).getNumber());
            }
            map.put(interfaceC21014.getField(c7323M54736), field2);
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m44254(Object obj, Object obj2) {
        return C3113.m10187(m44250((List) obj), m44250((List) obj2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44252(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C7323 c7323 : map.keySet()) {
            if (!map2.containsKey(c7323)) {
                return false;
            }
            Object obj = map.get(c7323);
            Object obj2 = map2.get(c7323);
            if (c7323.getType() == EnumC8814.f28791) {
                if (c7323.mo8649()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!m44251(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                } else if (!m44251(obj, obj2)) {
                    return false;
                }
            } else if (c7323.m20096()) {
                if (!m44254(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m44249(Object obj) {
        return C3113.m10186(m44250((List) obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m44248(int i, Map map) {
        int iM44249;
        int i2;
        int iHashCode;
        for (Map.Entry entry : map.entrySet()) {
            C7323 c7323 = (C7323) entry.getKey();
            Object value = entry.getValue();
            int number = c7323.getNumber() + (i * 37);
            if (c7323.m20096()) {
                iM44249 = (number * 53) + m44249(value);
            } else {
                if (c7323.getType() != EnumC8814.f28806) {
                    i2 = number * 53;
                    iHashCode = value.hashCode();
                } else if (!c7323.mo8649()) {
                    i2 = number * 53;
                    iHashCode = ((InterfaceC5547) value).getNumber();
                } else {
                    int i3 = number * 53;
                    Iterator it = ((List) value).iterator();
                    int number2 = 1;
                    while (it.hasNext()) {
                        number2 = (number2 * 31) + ((InterfaceC5547) it.next()).getNumber();
                    }
                    iM44249 = i3 + number2;
                }
                i = iHashCode + i2;
            }
            i = iM44249;
        }
        return i;
    }

    @Override // l.AbstractC9427
    public C24128 newUninitializedMessageException() {
        return AbstractC0479.m2311((InterfaceC21013) this);
    }
}
