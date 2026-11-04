package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes.dex */
public final class C24874 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C24874 f80500;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24215 f80501;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6228 f80502;

    static {
        int i = C6228.f21154;
        f80500 = new C24874(C12193.f39202, C24215.m54206());
    }

    public C24874(C6228 c6228, C24215 c24215) {
        this.f80502 = c6228;
        this.f80501 = c24215;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55404(InterfaceC9078 interfaceC9078, C16668 c16668) {
        if (interfaceC9078.getDescriptorForType().mo5002().equals("google.protobuf.Any")) {
            C24478 descriptorForType = interfaceC9078.getDescriptorForType();
            C7323 c7323M54735 = descriptorForType.m54735(1);
            C7323 c7323M54736 = descriptorForType.m54735(2);
            if (c7323M54735 != null && c7323M54735.getType() == EnumC8814.f28807 && c7323M54736 != null && c7323M54736.getType() == EnumC8814.f28791) {
                String str = (String) interfaceC9078.getField(c7323M54735);
                if (!str.isEmpty()) {
                    Object field = interfaceC9078.getField(c7323M54736);
                    try {
                        this.f80502.getClass();
                        String[] strArrSplit = str.split("/");
                        if (strArrSplit.length <= 1) {
                            throw new C20463("Invalid type url found: ".concat(str));
                        }
                        C24478 c24478 = (C24478) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
                        if (c24478 != null) {
                            C1840 c1840NewBuilderForType = C11534.m29035(c24478).newBuilderForType();
                            c1840NewBuilderForType.mo4453mergeFrom((AbstractC17084) field, this.f80501);
                            c16668.m39379("[");
                            c16668.m39379(str);
                            c16668.m39379("] {");
                            c16668.m39378();
                            c16668.m39381();
                            m55404(c1840NewBuilderForType, c16668);
                            c16668.m39380();
                            c16668.m39379(l.d);
                            c16668.m39378();
                            return;
                        }
                    } catch (C20463 unused) {
                    }
                }
            }
        }
        for (Map.Entry entry : interfaceC9078.getAllFields().entrySet()) {
            C7323 c7323 = (C7323) entry.getKey();
            Object value = entry.getValue();
            if (c7323.m20096()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C11447(c7323, it.next()));
                }
                Collections.sort(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m55402(c7323, ((C11447) it2.next()).m28807(), c16668);
                }
            } else if (c7323.mo8649()) {
                Iterator it3 = ((List) value).iterator();
                while (it3.hasNext()) {
                    m55402(c7323, it3.next(), c16668);
                }
            } else {
                m55402(c7323, value, c16668);
            }
        }
        m55403(interfaceC9078.getUnknownFields(), c16668);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m55405(InterfaceC9078 interfaceC9078) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C17414.f56613;
            m55404(interfaceC9078, new C16668(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55399(C7719 c7719) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C17414.f56613;
            m55403(c7719, new C16668(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55402(C7323 c7323, Object obj, C16668 c16668) {
        String string;
        String string2;
        if (c7323.m20083()) {
            c16668.m39379("[");
            if (c7323.m20099().m54744().m17896() && c7323.getType() == EnumC8814.f28803 && c7323.m20091() && c7323.m20087() == c7323.m20093()) {
                c16668.m39379(c7323.m20093().mo5002());
            } else {
                c16668.m39379(c7323.mo5002());
            }
            c16668.m39379("]");
        } else if (c7323.m20088()) {
            c16668.m39379(c7323.m20093().getName());
        } else {
            c16668.m39379(c7323.getName());
        }
        EnumC2848 enumC2848M20086 = c7323.m20086();
        EnumC2848 enumC2848 = EnumC2848.MESSAGE;
        if (enumC2848M20086 == enumC2848) {
            c16668.m39379(" {");
            c16668.m39378();
            c16668.m39381();
        } else {
            c16668.m39379(": ");
        }
        switch (C12939.f41493[c7323.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                c16668.m39379(((Integer) obj).toString());
                break;
            case 4:
            case 5:
            case 6:
                c16668.m39379(((Long) obj).toString());
                break;
            case 7:
                c16668.m39379(((Boolean) obj).toString());
                break;
            case 8:
                c16668.m39379(((Float) obj).toString());
                break;
            case 9:
                c16668.m39379(((Double) obj).toString());
                break;
            case 10:
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                int i = C17414.f56613;
                if (iIntValue >= 0) {
                    string = Integer.toString(iIntValue);
                } else {
                    string = Long.toString(((long) iIntValue) & 4294967295L);
                }
                c16668.m39379(string);
                break;
            case 12:
            case 13:
                long jLongValue = ((Long) obj).longValue();
                int i2 = C17414.f56613;
                if (jLongValue >= 0) {
                    string2 = Long.toString(jLongValue);
                } else {
                    string2 = BigInteger.valueOf(jLongValue & C25227.FOREVER_NS).setBit(63).toString();
                }
                c16668.m39379(string2);
                break;
            case 14:
                c16668.m39379("\"");
                c16668.m39379(C20398.m46799(AbstractC17084.m40219((String) obj)));
                c16668.m39379("\"");
                break;
            case 15:
                c16668.m39379("\"");
                if (obj instanceof AbstractC17084) {
                    int i3 = C17414.f56613;
                    c16668.m39379(C20398.m46799((AbstractC17084) obj));
                } else {
                    int i4 = C17414.f56613;
                    c16668.m39379(C20398.m46798(new C23382((byte[]) obj)));
                }
                c16668.m39379("\"");
                break;
            case 16:
                c16668.m39379(((C1357) obj).getName());
                break;
            case 17:
            case 18:
                m55404((InterfaceC9078) obj, c16668);
                break;
        }
        if (c7323.m20086() == enumC2848) {
            c16668.m39380();
            c16668.m39379(l.d);
        }
        c16668.m39378();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55403(C7719 c7719, C16668 c16668) {
        for (Map.Entry entry : c7719.m21004().entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C18160 c18160 = (C18160) entry.getValue();
            m55401(iIntValue, 0, c18160.m42331(), c16668);
            m55401(iIntValue, 5, c18160.m42327(), c16668);
            m55401(iIntValue, 1, c18160.m42333(), c16668);
            m55401(iIntValue, 2, c18160.m42335(), c16668);
            for (C7719 c77110 : c18160.m42330()) {
                c16668.m39379(((Integer) entry.getKey()).toString());
                c16668.m39379(" {");
                c16668.m39378();
                c16668.m39381();
                m55403(c77110, c16668);
                c16668.m39380();
                c16668.m39379(l.d);
                c16668.m39378();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55401(int i, int i2, List list, C16668 c16668) {
        for (Object obj : list) {
            c16668.m39379(String.valueOf(i));
            c16668.m39379(": ");
            int i3 = i2 & 7;
            if (i3 == 0) {
                long jLongValue = ((Long) obj).longValue();
                int i4 = C17414.f56613;
                c16668.m39379(jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & C25227.FOREVER_NS).setBit(63).toString());
            } else if (i3 == 1) {
                c16668.m39379(String.format(null, "0x%016x", (Long) obj));
            } else if (i3 == 2) {
                try {
                    AbstractC17084 abstractC17084 = (AbstractC17084) obj;
                    int i5 = C7719.f25443;
                    C14430 c14430M34853 = C14430.m34853();
                    try {
                        try {
                            AbstractC3660 abstractC3660Mo29725 = abstractC17084.mo29725();
                            c14430M34853.m34858(abstractC3660Mo29725);
                            abstractC3660Mo29725.mo11879(0);
                            C7719 c7719Build = c14430M34853.build();
                            c16668.m39379("{");
                            c16668.m39378();
                            c16668.m39381();
                            m55403(c7719Build, c16668);
                            c16668.m39380();
                            c16668.m39379(l.d);
                        } catch (IOException e) {
                            throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e);
                        }
                    } catch (C20463 e2) {
                        throw e2;
                    }
                } catch (C20463 unused) {
                    c16668.m39379("\"");
                    int i6 = C17414.f56613;
                    c16668.m39379(C20398.m46799((AbstractC17084) obj));
                    c16668.m39379("\"");
                }
            } else if (i3 == 3) {
                m55403((C7719) obj, c16668);
            } else {
                if (i3 != 5) {
                    throw new IllegalArgumentException(C13645.m33382(i2, "Bad tag: "));
                }
                c16668.m39379(String.format(null, "0x%08x", (Integer) obj));
            }
            c16668.m39378();
        }
    }
}
