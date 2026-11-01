package l;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 47S6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14326 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f46938 = new C23498();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f46941 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f46940 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f46939 = new HashMap();

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        c1145.m4212(r3 == null ? null : (String) this.f46939.get(r3));
    }

    public C14326(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r3 = (Enum) field2.get(null);
                String strName = r3.name();
                String string = r3.toString();
                InterfaceC19887 interfaceC19887 = (InterfaceC19887) field2.getAnnotation(InterfaceC19887.class);
                if (interfaceC19887 != null) {
                    strName = interfaceC19887.value();
                    for (String str : interfaceC19887.alternate()) {
                        this.f46941.put(str, r3);
                    }
                }
                this.f46941.put(strName, r3);
                this.f46940.put(string, r3);
                this.f46939.put(r3, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        String strM14922 = c5379.m14922();
        Enum r0 = (Enum) this.f46941.get(strM14922);
        return r0 == null ? (Enum) this.f46940.get(strM14922) : r0;
    }
}
