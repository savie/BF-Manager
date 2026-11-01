package l;

import java.lang.reflect.Member;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: renamed from: l.ܿۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AWK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17122 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f54602;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12184 f54603;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f54604;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public char[] f54605;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f54606;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15275 f54607;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f54607.compareTo(((C17122) obj).f54607);
    }

    public C17122(C15275 c15275) {
        boolean z;
        this.f54607 = c15275;
        InterfaceC17086 interfaceC17086M36579 = c15275.m36579();
        String str = null;
        if (interfaceC17086M36579 != null) {
            z = false;
            for (EnumC3984 enumC3984 : interfaceC17086M36579.serialzeFeatures()) {
                if (enumC3984 == EnumC3984.WriteMapNullValue) {
                    z = true;
                }
            }
            String strTrim = interfaceC17086M36579.format().trim();
            str = strTrim.length() != 0 ? strTrim : null;
            this.f54604 = EnumC3984.m11482(interfaceC17086M36579.serialzeFeatures());
        } else {
            this.f54604 = 0;
            z = false;
        }
        this.f54606 = z;
        this.f54602 = str;
        String str2 = c15275.f49788;
        int length = str2.length();
        char[] cArr = new char[length + 3];
        this.f54605 = cArr;
        str2.getChars(0, str2.length(), cArr, 1);
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39979(C23473 c23473) {
        C13158 c13158 = c23473.f76006;
        int i = c13158.f43818;
        int i2 = EnumC3984.QuoteFieldNames.f14811 & i;
        C15275 c15275 = this.f54607;
        if (i2 != 0) {
            if ((i & EnumC3984.UseSingleQuotes.f14811) != 0) {
                c13158.m32533(c15275.f49788, true);
                return;
            } else {
                char[] cArr = this.f54605;
                c13158.write(cArr, 0, cArr.length);
                return;
            }
        }
        c13158.m32533(c15275.f49788, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m39978(Object obj) {
        C15275 c15275 = this.f54607;
        try {
            return c15275.f49794 ? c15275.f49783.get(obj) : c15275.f49784.invoke(obj, null);
        } catch (Exception e) {
            Member member = c15275.f49784;
            if (member == null) {
                member = c15275.f49783;
            }
            throw new C20614(C0252.m1693("get property error。 ", member.getDeclaringClass().getName() + "." + member.getName()), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39980(C23473 c23473, Object obj) {
        Class<?> cls;
        C1162 c1162 = c23473.f76005;
        C13158 c13158 = c23473.f76006;
        String str = this.f54602;
        if (str == null) {
            C12184 c12184 = this.f54603;
            C15275 c15275 = this.f54607;
            if (c12184 == null) {
                if (obj == null) {
                    cls = c15275.f49790;
                } else {
                    cls = obj.getClass();
                }
                InterfaceC11747 interfaceC11747M4271 = c1162.m4271(cls);
                C12184 c12185 = new C12184();
                c12185.f40777 = interfaceC11747M4271;
                c12185.f40778 = cls;
                this.f54603 = c12185;
            }
            C12184 c12186 = this.f54603;
            if (obj == null) {
                int i = EnumC3984.WriteNullNumberAsZero.f14811;
                int i2 = this.f54604;
                if ((i & i2) != 0 && Number.class.isAssignableFrom(c12186.f40778)) {
                    c13158.write(48);
                    return;
                }
                if ((EnumC3984.WriteNullBooleanAsFalse.f14811 & i2) != 0 && Boolean.class == c12186.f40778) {
                    c13158.write("false");
                    return;
                } else if ((EnumC3984.WriteNullListAsEmpty.f14811 & i2) != 0 && Collection.class.isAssignableFrom(c12186.f40778)) {
                    c13158.write("[]");
                    return;
                } else {
                    c12186.f40777.mo1396(c23473, null, c15275.f49788, c12186.f40778);
                    return;
                }
            }
            Class<?> cls2 = obj.getClass();
            if (cls2 == c12186.f40778) {
                c12186.f40777.mo1396(c23473, obj, c15275.f49788, c15275.f49787);
                return;
            } else {
                c1162.m4271(cls2).mo1396(c23473, obj, c15275.f49788, c15275.f49787);
                return;
            }
        }
        if (obj instanceof Date) {
            DateFormat dateFormatM51729 = c23473.m51729();
            if (dateFormatM51729 == null) {
                dateFormatM51729 = new SimpleDateFormat(str, c23473.f76010);
                dateFormatM51729.setTimeZone(c23473.f76008);
            }
            c13158.m32531(dateFormatM51729.format((Date) obj));
            return;
        }
        c23473.m51725(obj);
    }
}
