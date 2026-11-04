package l;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47S6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7698 extends AbstractC17567 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f25402 = new C0240();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f25403;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f25404;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f25405;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        c21362.m48602(r3 == null ? null : (String) this.f25403.get(r3));
    }

    public C7698(Class cls) {
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
            int iCeil = (int) Math.ceil(i / 0.75f);
            this.f25405 = new HashMap(iCeil);
            this.f25404 = new HashMap(iCeil);
            this.f25403 = new HashMap(iCeil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r3 = (Enum) field2.get(null);
                String strName = r3.name();
                String string = r3.toString();
                InterfaceC3397 interfaceC3397 = (InterfaceC3397) field2.getAnnotation(InterfaceC3397.class);
                if (interfaceC3397 != null) {
                    strName = interfaceC3397.value();
                    for (String str : interfaceC3397.alternate()) {
                        this.f25405.put(str, r3);
                    }
                }
                this.f25405.put(strName, r3);
                this.f25404.put(string, r3);
                this.f25403.put(r3, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        Enum r0 = (Enum) this.f25405.get(strM13453);
        return r0 == null ? (Enum) this.f25404.get(strM13453) : r0;
    }
}
