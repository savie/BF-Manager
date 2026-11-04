package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAUY */
/* JADX INFO: loaded from: classes.dex */
public final class C22371 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16558[] f72422;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Constructor f72423;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f72424;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Constructor f72425;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f72426;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f72427 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16558[] f72428;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f72429;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Method f72430;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f72431;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f72432;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f72433;

    public C22371(Class cls, Constructor constructor, Constructor constructor2, Method method, C16558[] c16558Arr, C16558[] c16558Arr2, InterfaceC10216 interfaceC10216, String[] strArr) {
        int i;
        boolean z;
        int length = 0;
        this.f72425 = constructor;
        this.f72423 = constructor2;
        this.f72430 = method;
        this.f72428 = c16558Arr;
        if (strArr != null && strArr.length == c16558Arr.length) {
            this.f72431 = null;
        } else {
            this.f72431 = strArr;
        }
        if (interfaceC10216 != null) {
            String strTypeName = interfaceC10216.typeName();
            this.f72429 = strTypeName.length() <= 0 ? cls.getName() : strTypeName;
            String strTypeKey = interfaceC10216.typeKey();
            this.f72433 = strTypeKey.length() > 0 ? strTypeKey : null;
            i = 0;
            for (EnumC7234 enumC7234 : interfaceC10216.parseFeatures()) {
                i |= enumC7234.f23858;
            }
        } else {
            this.f72429 = cls.getName();
            this.f72433 = null;
            i = 0;
        }
        String str = this.f72433;
        if (str != null) {
            C3134.m10237(str);
        }
        this.f72424 = i;
        if (interfaceC10216 != null) {
            EnumC7234[] features = interfaceC10216.parseFeatures();
            z = false;
            for (EnumC7234 enumC7235 : features) {
                if (enumC7235 == EnumC7234.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.f72426 = z;
        this.f72422 = Arrays.equals(c16558Arr, c16558Arr2) ? c16558Arr : c16558Arr2;
        if (constructor != null) {
            length = constructor.getParameterTypes().length;
        } else if (method != null) {
            length = method.getParameterTypes().length;
        }
        this.f72432 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50444(ArrayList arrayList, C16558 c16558) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C16558 c16559 = (C16558) arrayList.get(i);
            if (c16559.f53585.equals(c16558.f53585) && (!c16559.f53588 || c16558.f53588)) {
                return;
            }
        }
        arrayList.add(c16558);
    }
}
