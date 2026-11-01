package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10902 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C10902 f37084;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2701 f37085;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11648 f37086;

    static {
        int i = C11648.f39164;
        f37084 = new C10902(C13765.f45373, C2701.m8236());
    }

    public C10902(C11648 c11648, C2701 c2701) {
        this.f37086 = c11648;
        this.f37085 = c2701;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27332(InterfaceC18266 interfaceC18266, C23602 c23602) {
        if (interfaceC18266.getDescriptorForType().mo8523().equals("google.protobuf.Any")) {
            C2806 descriptorForType = interfaceC18266.getDescriptorForType();
            C19741 c19741M8521 = descriptorForType.m8521(1);
            C19741 c19741M8522 = descriptorForType.m8521(2);
            if (c19741M8521 != null && c19741M8521.getType() == EnumC8452.f29312 && c19741M8522 != null && c19741M8522.getType() == EnumC8452.f29321) {
                String str = (String) interfaceC18266.getField(c19741M8521);
                if (!str.isEmpty()) {
                    Object field = interfaceC18266.getField(c19741M8522);
                    try {
                        this.f37086.getClass();
                        String[] strArrSplit = str.split("/");
                        if (strArrSplit.length <= 1) {
                            throw new C4529("Invalid type url found: ".concat(str));
                        }
                        C2806 c2806 = (C2806) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
                        if (c2806 != null) {
                            C17623 c17623NewBuilderForType = C6334.m17438(c2806).newBuilderForType();
                            c17623NewBuilderForType.mo11457mergeFrom((AbstractC23725) field, this.f37085);
                            c23602.m52031("[");
                            c23602.m52031(str);
                            c23602.m52031("] {");
                            c23602.m52030();
                            c23602.m52033();
                            m27332(c17623NewBuilderForType, c23602);
                            c23602.m52032();
                            c23602.m52031(l.d);
                            c23602.m52030();
                            return;
                        }
                    } catch (C4529 unused) {
                    }
                }
            }
        }
        for (Map.Entry entry : interfaceC18266.getAllFields().entrySet()) {
            C19741 c19741 = (C19741) entry.getKey();
            Object value = entry.getValue();
            if (c19741.m44909()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C5962(c19741, it.next()));
                }
                Collections.sort(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m27333(c19741, ((C5962) it2.next()).m16250(), c23602);
                }
            } else if (c19741.mo23408()) {
                Iterator it3 = ((List) value).iterator();
                while (it3.hasNext()) {
                    m27333(c19741, it3.next(), c23602);
                }
            } else {
                m27333(c19741, value, c23602);
            }
        }
        m27331(interfaceC18266.getUnknownFields(), c23602);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27334(InterfaceC18266 interfaceC18266) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C14430.f47308;
            m27332(interfaceC18266, new C23602(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27328(C6708 c6708) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = C14430.f47308;
            m27331(c6708, new C23602(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27333(C19741 c19741, Object obj, C23602 c23602) {
        String string;
        String string2;
        if (c19741.m44908()) {
            c23602.m52031("[");
            if (c19741.m44910().m8525().m29472() && c19741.getType() == EnumC8452.f29310 && c19741.m44899() && c19741.m44902() == c19741.m44907()) {
                c23602.m52031(c19741.m44907().mo8523());
            } else {
                c23602.m52031(c19741.mo8523());
            }
            c23602.m52031("]");
        } else if (c19741.m44904()) {
            c23602.m52031(c19741.m44907().getName());
        } else {
            c23602.m52031(c19741.getName());
        }
        EnumC19035 enumC19035M44913 = c19741.m44913();
        EnumC19035 enumC19035 = EnumC19035.MESSAGE;
        if (enumC19035M44913 == enumC19035) {
            c23602.m52031(" {");
            c23602.m52030();
            c23602.m52033();
        } else {
            c23602.m52031(": ");
        }
        switch (C16546.f53139[c19741.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                c23602.m52031(((Integer) obj).toString());
                break;
            case 4:
            case 5:
            case 6:
                c23602.m52031(((Long) obj).toString());
                break;
            case 7:
                c23602.m52031(((Boolean) obj).toString());
                break;
            case 8:
                c23602.m52031(((Float) obj).toString());
                break;
            case 9:
                c23602.m52031(((Double) obj).toString());
                break;
            case 10:
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                int i = C14430.f47308;
                if (iIntValue >= 0) {
                    string = Integer.toString(iIntValue);
                } else {
                    string = Long.toString(((long) iIntValue) & 4294967295L);
                }
                c23602.m52031(string);
                break;
            case 12:
            case 13:
                long jLongValue = ((Long) obj).longValue();
                int i2 = C14430.f47308;
                if (jLongValue >= 0) {
                    string2 = Long.toString(jLongValue);
                } else {
                    string2 = BigInteger.valueOf(jLongValue & C17492.FOREVER_NS).setBit(63).toString();
                }
                c23602.m52031(string2);
                break;
            case 14:
                c23602.m52031("\"");
                c23602.m52031(C4591.m12739(AbstractC23725.m52256((String) obj)));
                c23602.m52031("\"");
                break;
            case 15:
                c23602.m52031("\"");
                if (obj instanceof AbstractC23725) {
                    int i3 = C14430.f47308;
                    c23602.m52031(C4591.m12739((AbstractC23725) obj));
                } else {
                    int i4 = C14430.f47308;
                    c23602.m52031(C4591.m12738(new C9491((byte[]) obj)));
                }
                c23602.m52031("\"");
                break;
            case 16:
                c23602.m52031(((C21857) obj).getName());
                break;
            case 17:
            case 18:
                m27332((InterfaceC18266) obj, c23602);
                break;
        }
        if (c19741.m44913() == enumC19035) {
            c23602.m52032();
            c23602.m52031(l.d);
        }
        c23602.m52030();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27331(C6708 c6708, C23602 c23602) {
        for (Map.Entry entry : c6708.m18142().entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C13059 c13059 = (C13059) entry.getValue();
            m27330(iIntValue, 0, c13059.m32277(), c23602);
            m27330(iIntValue, 5, c13059.m32274(), c23602);
            m27330(iIntValue, 1, c13059.m32280(), c23602);
            m27330(iIntValue, 2, c13059.m32272(), c23602);
            for (C6708 c6709 : c13059.m32278()) {
                c23602.m52031(((Integer) entry.getKey()).toString());
                c23602.m52031(" {");
                c23602.m52030();
                c23602.m52033();
                m27331(c6709, c23602);
                c23602.m52032();
                c23602.m52031(l.d);
                c23602.m52030();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27330(int i, int i2, List list, C23602 c23602) {
        for (Object obj : list) {
            c23602.m52031(String.valueOf(i));
            c23602.m52031(": ");
            int i3 = i2 & 7;
            if (i3 == 0) {
                long jLongValue = ((Long) obj).longValue();
                int i4 = C14430.f47308;
                c23602.m52031(jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & C17492.FOREVER_NS).setBit(63).toString());
            } else if (i3 == 1) {
                c23602.m52031(String.format(null, "0x%016x", (Long) obj));
            } else if (i3 == 2) {
                try {
                    AbstractC23725 abstractC23725 = (AbstractC23725) obj;
                    int i5 = C6708.f22609;
                    C22231 c22231M49355 = C22231.m49355();
                    try {
                        try {
                            AbstractC3262 abstractC3262Mo16491 = abstractC23725.mo16491();
                            c22231M49355.m49359(abstractC3262Mo16491);
                            abstractC3262Mo16491.mo6025(0);
                            C6708 c6708Build = c22231M49355.build();
                            c23602.m52031("{");
                            c23602.m52030();
                            c23602.m52033();
                            m27331(c6708Build, c23602);
                            c23602.m52032();
                            c23602.m52031(l.d);
                        } catch (C4529 e) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
                    }
                } catch (C4529 unused) {
                    c23602.m52031("\"");
                    int i6 = C14430.f47308;
                    c23602.m52031(C4591.m12739((AbstractC23725) obj));
                    c23602.m52031("\"");
                }
            } else if (i3 == 3) {
                m27331((C6708) obj, c23602);
            } else {
                if (i3 != 5) {
                    throw new IllegalArgumentException(C8479.m22141(i2, "Bad tag: "));
                }
                c23602.m52031(String.format(null, "0x%08x", (Integer) obj));
            }
            c23602.m52030();
        }
    }
}
