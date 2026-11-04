package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M6EB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2039 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f6785 = C16980.m40037(C2039.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7012(String str, ArrayList arrayList, List list) {
        m7010(str, arrayList, list);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7013(ArrayList arrayList, List list) {
        m7010(null, arrayList, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7011(ArrayList arrayList, List list) {
        m7010(null, arrayList, list);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7010(String str, ArrayList arrayList, List list) {
        String string;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC13343 interfaceC13343 = (InterfaceC13343) it.next();
            if (interfaceC13343.getVisibility() == EnumC11105.SYSTEM) {
                String strMo17110 = interfaceC13343.mo17110();
                strMo17110.getClass();
                byte b = -1;
                switch (strMo17110.hashCode()) {
                    case -1911645549:
                        if (strMo17110.equals("Ldalvik/annotation/InnerClass;")) {
                            b = 0;
                        }
                        break;
                    case -1104599473:
                        if (strMo17110.equals("Ldalvik/annotation/AnnotationDefault;")) {
                            b = 1;
                        }
                        break;
                    case -858881176:
                        if (strMo17110.equals("Ldalvik/annotation/Throws;")) {
                            b = 2;
                        }
                        break;
                    case 1338970954:
                        if (strMo17110.equals("Ldalvik/annotation/MethodParameters;")) {
                            b = 3;
                        }
                        break;
                    case 1664436329:
                        if (strMo17110.equals("Ldalvik/annotation/Signature;")) {
                            b = 4;
                        }
                        break;
                }
                InterfaceC25186 interfaceC25186 = f6785;
                String str2 = null;
                switch (b) {
                    case 0:
                        try {
                            String str3 = (String) C17933.m41870(interfaceC13343, "name", EnumC23040.ENCODED_STRING, null);
                            int iIntValue = ((Integer) C17933.m41870(interfaceC13343, "accessFlags", EnumC23040.ENCODED_INT, 0)).intValue();
                            if (str3 != null || iIntValue != 0) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC13343 interfaceC13344 = (InterfaceC13343) it2.next();
                                    if (interfaceC13344.getVisibility() == EnumC11105.SYSTEM && interfaceC13344.mo17110().equals("Ldalvik/annotation/EnclosingClass;")) {
                                        str2 = (String) C17933.m41870(interfaceC13344, b.d, EnumC23040.ENCODED_TYPE, null);
                                        arrayList.add(new C12597(Collections.singletonMap(str, new C6632(str, iIntValue, str2, str3))));
                                        break;
                                    }
                                }
                                arrayList.add(new C12597(Collections.singletonMap(str, new C6632(str, iIntValue, str2, str3))));
                            }
                        } catch (Exception e) {
                            interfaceC25186.mo13710("Failed to parse annotation: {}", interfaceC13343, e);
                        }
                        break;
                    case 1:
                        C15580 c15580Mo17111 = interfaceC13343.mo17111();
                        if (c15580Mo17111 != null && c15580Mo17111.m37317() == EnumC23040.ENCODED_ANNOTATION) {
                            arrayList.add(new C16326(((InterfaceC13343) c15580Mo17111.m37318()).mo17112()));
                        }
                        break;
                    case 2:
                        try {
                            C15580 c15580Mo17112 = interfaceC13343.mo17111();
                            if (c15580Mo17112 != null) {
                                arrayList.add(new C20802((List) C1170.stream((List) c15580Mo17112.m37318()).map(new C0948(8)).collect(C2025.toList())));
                            }
                        } catch (Exception e2) {
                            interfaceC25186.mo13702("Failed to convert dalvik throws annotation", (Throwable) e2);
                        }
                        break;
                    case 3:
                        try {
                            List listM41871 = C17933.m41871(interfaceC13343, "names");
                            List listM41872 = C17933.m41871(interfaceC13343, "accessFlags");
                            if (!listM41871.isEmpty() && listM41871.size() == listM41872.size()) {
                                int size = listM41871.size();
                                ArrayList arrayList2 = new ArrayList(size);
                                for (int i = 0; i < size; i++) {
                                    C15580 c15580 = (C15580) listM41871.get(i);
                                    arrayList2.add(new C24532(((Integer) ((C15580) listM41872.get(i)).m37318()).intValue(), c15580.m37317() == EnumC23040.ENCODED_STRING ? (String) c15580.m37318() : null));
                                }
                                arrayList.add(new C4394(arrayList2));
                            }
                        } catch (Exception e3) {
                            interfaceC25186.mo13710("Failed to parse annotation: {}", interfaceC13343, e3);
                        }
                        break;
                    case 4:
                        List list2 = (List) interfaceC13343.mo17111().m37318();
                        if (list2.size() == 1) {
                            string = (String) ((C15580) list2.get(0)).m37318();
                        } else {
                            StringBuilder sb = new StringBuilder();
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                sb.append((String) ((C15580) it3.next()).m37318());
                            }
                            string = sb.toString();
                        }
                        arrayList.add(new C14834(string));
                        break;
                }
            }
        }
        C3648 c3648M11819 = C3648.m11819(list);
        if (c3648M11819 != null) {
            arrayList.add(c3648M11819);
        }
    }
}
