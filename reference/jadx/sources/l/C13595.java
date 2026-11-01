package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAUY */
/* JADX INFO: loaded from: classes3.dex */
public final class C13595 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f44824 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f44825;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15275[] f44826;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Constructor f44827;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Method f44828;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f44829;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Constructor f44830;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f44831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f44832;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f44833;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15275[] f44834;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f44835;

    public C13595(Class cls, Constructor constructor, Constructor constructor2, Method method, C15275[] c15275Arr, C15275[] c15275Arr2, InterfaceC5797 interfaceC5797, String[] strArr) {
        int i;
        boolean z;
        int length = 0;
        this.f44830 = constructor;
        this.f44827 = constructor2;
        this.f44828 = method;
        this.f44834 = c15275Arr;
        if (strArr != null && strArr.length == c15275Arr.length) {
            this.f44832 = null;
        } else {
            this.f44832 = strArr;
        }
        if (interfaceC5797 != null) {
            String strTypeName = interfaceC5797.typeName();
            this.f44833 = strTypeName.length() <= 0 ? cls.getName() : strTypeName;
            String strTypeKey = interfaceC5797.typeKey();
            this.f44835 = strTypeKey.length() > 0 ? strTypeKey : null;
            i = 0;
            for (EnumC9326 enumC9326 : interfaceC5797.parseFeatures()) {
                i |= enumC9326.f31669;
            }
        } else {
            this.f44833 = cls.getName();
            this.f44835 = null;
            i = 0;
        }
        String str = this.f44835;
        if (str != null) {
            C8219.m21530(str);
        }
        this.f44831 = i;
        if (interfaceC5797 != null) {
            EnumC9326[] features = interfaceC5797.parseFeatures();
            z = false;
            for (EnumC9326 enumC9327 : features) {
                if (enumC9327 == EnumC9326.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.f44829 = z;
        this.f44826 = Arrays.equals(c15275Arr, c15275Arr2) ? c15275Arr : c15275Arr2;
        if (constructor != null) {
            length = constructor.getParameterTypes().length;
        } else if (method != null) {
            length = method.getParameterTypes().length;
        }
        this.f44825 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33215(ArrayList arrayList, C15275 c15275) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15275 c15276 = (C15275) arrayList.get(i);
            if (c15276.f49788.equals(c15275.f49788) && (!c15276.f49797 || c15275.f49797)) {
                return;
            }
        }
        arrayList.add(c15275);
    }
}
