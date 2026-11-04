package l;

import java.lang.reflect.Member;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: renamed from: l.ᩳ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AWK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19387 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public char[] f62629;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C8200 f62630;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f62631;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f62632;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f62633;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16558 f62634;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f62634.compareTo(((C19387) obj).f62634);
    }

    public C19387(C16558 c16558) {
        boolean z;
        this.f62634 = c16558;
        InterfaceC19167 interfaceC19167M39203 = c16558.m39203();
        String str = null;
        if (interfaceC19167M39203 != null) {
            z = false;
            for (EnumC1643 enumC1643 : interfaceC19167M39203.serialzeFeatures()) {
                if (enumC1643 == EnumC1643.WriteMapNullValue) {
                    z = true;
                }
            }
            String strTrim = interfaceC19167M39203.format().trim();
            str = strTrim.length() != 0 ? strTrim : null;
            this.f62631 = EnumC1643.m5815(interfaceC19167M39203.serialzeFeatures());
        } else {
            this.f62631 = 0;
            z = false;
        }
        this.f62633 = z;
        this.f62632 = str;
        String str2 = c16558.f53585;
        int length = str2.length();
        char[] cArr = new char[length + 3];
        this.f62629 = cArr;
        str2.getChars(0, str2.length(), cArr, 1);
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44831(C9690 c9690) {
        C5372 c5372 = c9690.f31276;
        int i = c5372.f18847;
        int i2 = EnumC1643.QuoteFieldNames.f5702 & i;
        C16558 c16558 = this.f62634;
        if (i2 != 0) {
            if ((i & EnumC1643.UseSingleQuotes.f5702) != 0) {
                c5372.m16049(c16558.f53585, true);
                return;
            } else {
                char[] cArr = this.f62629;
                c5372.write(cArr, 0, cArr.length);
                return;
            }
        }
        c5372.m16049(c16558.f53585, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m44830(Object obj) {
        C16558 c16558 = this.f62634;
        try {
            return c16558.f53581 ? c16558.f53592.get(obj) : c16558.f53587.invoke(obj, null);
        } catch (Exception e) {
            Member member = c16558.f53587;
            if (member == null) {
                member = c16558.f53592;
            }
            throw new C4251(C25272.m56409("get property error。 ", member.getDeclaringClass().getName() + "." + member.getName()), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44832(C9690 c9690, Object obj) {
        Class<?> cls;
        C12829 c12829 = c9690.f31277;
        C5372 c5372 = c9690.f31276;
        String str = this.f62632;
        if (str == null) {
            C8200 c8200 = this.f62630;
            C16558 c16558 = this.f62634;
            if (c8200 == null) {
                if (obj == null) {
                    cls = c16558.f53586;
                } else {
                    cls = obj.getClass();
                }
                InterfaceC10591 interfaceC10591M31835 = c12829.m31835(cls);
                C8200 c8201 = new C8200();
                c8201.f27019 = interfaceC10591M31835;
                c8201.f27020 = cls;
                this.f62630 = c8201;
            }
            C8200 c8202 = this.f62630;
            if (obj == null) {
                int i = EnumC1643.WriteNullNumberAsZero.f5702;
                int i2 = this.f62631;
                if ((i & i2) != 0 && Number.class.isAssignableFrom(c8202.f27020)) {
                    c5372.write(48);
                    return;
                }
                if ((EnumC1643.WriteNullBooleanAsFalse.f5702 & i2) != 0 && Boolean.class == c8202.f27020) {
                    c5372.write("false");
                    return;
                } else if ((EnumC1643.WriteNullListAsEmpty.f5702 & i2) != 0 && Collection.class.isAssignableFrom(c8202.f27020)) {
                    c5372.write("[]");
                    return;
                } else {
                    c8202.f27019.mo3063(c9690, null, c16558.f53585, c8202.f27020);
                    return;
                }
            }
            Class<?> cls2 = obj.getClass();
            if (cls2 == c8202.f27020) {
                c8202.f27019.mo3063(c9690, obj, c16558.f53585, c16558.f53589);
                return;
            } else {
                c12829.m31835(cls2).mo3063(c9690, obj, c16558.f53585, c16558.f53589);
                return;
            }
        }
        if (obj instanceof Date) {
            DateFormat dateFormatM25281 = c9690.m25281();
            if (dateFormatM25281 == null) {
                dateFormatM25281 = new SimpleDateFormat(str, c9690.f31280);
                dateFormatM25281.setTimeZone(c9690.f31281);
            }
            c5372.m16047(dateFormatM25281.format((Date) obj));
            return;
        }
        c9690.m25277(obj);
    }
}
