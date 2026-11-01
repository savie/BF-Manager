package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 57O6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18806 extends AbstractC4425 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f60950;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0192 f60954;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f60955;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19243 f60959;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f60951 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20234 f60957 = C20234.m45738();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f60958 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f60949 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f60952 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f60956 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public StringBuilder f60960 = new StringBuilder();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public StringBuilder f60953 = new StringBuilder();

    public C18806(String str, C0192 c0192, C19243 c19243) {
        this.f60955 = str;
        this.f60954 = c0192;
        this.f60959 = c19243;
        this.f60950 = c0192.m1422();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43376(int i, AbstractC1557 abstractC1557) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f60951;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), ((AbstractC1557) map.get(Integer.valueOf(i))).mo5336(abstractC1557));
        } else {
            map.put(Integer.valueOf(i), abstractC1557);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43378(InterfaceC15670 interfaceC15670, InterfaceC15670 interfaceC15671) {
        this.f60957.mo26252(C9548.m24395(Integer.valueOf(m43374(interfaceC15670).getIndex()), Integer.valueOf(m43373(interfaceC15671).getIndex())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43377(C9548 c9548, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!c9548.m24404()) {
            C0192 c0192 = this.f60954;
            int iM1244 = c0192.m1244();
            boolean z = false;
            while (true) {
                int i = this.f60949;
                if (i >= iM1244 || (!c0192.m1247(i).m24404() && ((Integer) c0192.m1247(this.f60949).m24407()).intValue() > ((Integer) c9548.m24409()).intValue())) {
                    break;
                }
                if (c0192.m1247(this.f60949).m24404()) {
                    z = true;
                }
                this.f60949++;
            }
            AbstractC1557 abstractC1557 = (AbstractC1557) C9735.getOrDefault(this.f60951, Integer.valueOf(this.f60952), AbstractC1557.f6287);
            if ((z && (str.startsWith("//") || str.startsWith("/*"))) || ((Boolean) abstractC1557.mo5337().orElse(Boolean.valueOf(z))).booleanValue()) {
                this.f60956++;
            }
        }
        if (C17080.m39865(str)) {
            int i2 = this.f60956;
            if (i2 == 0) {
                this.f60956 = i2 + 1;
            }
            this.f60953 = new StringBuilder();
        } else {
            int length = str.length();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '\t') {
                    this.f60953.append('\t');
                } else if (cCharAt == '\n') {
                    this.f60953 = new StringBuilder();
                    this.f60956++;
                } else if (cCharAt == '\r') {
                    int i4 = i3 + 1;
                    if (i4 < str.length() && str.charAt(i4) == '\n') {
                        i3 = i4;
                    }
                    this.f60953 = new StringBuilder();
                    this.f60956++;
                } else if (cCharAt == ' ') {
                    this.f60953.append(' ');
                } else {
                    while (true) {
                        int i5 = this.f60956;
                        arrayList = this.f60958;
                        if (i5 <= 0) {
                            break;
                        }
                        if (!arrayList.isEmpty() || this.f60960.length() > 0) {
                            arrayList.add(this.f60960.toString());
                        }
                        this.f60960 = new StringBuilder();
                        this.f60956--;
                        z2 = false;
                    }
                    if (this.f60953.length() > 0) {
                        this.f60960.append((CharSequence) this.f60953);
                        this.f60953 = new StringBuilder();
                    }
                    this.f60960.append(cCharAt);
                    if (!c9548.m24404() && !z2) {
                        while (true) {
                            arrayList2 = this.f1199;
                            if (arrayList2.size() > arrayList.size()) {
                                break;
                            } else {
                                arrayList2.add(C17831.f56466);
                            }
                        }
                        int size = arrayList.size();
                        C9548 c9548M24403 = (C9548) arrayList2.get(arrayList.size());
                        if (c9548M24403.m24404()) {
                            c9548M24403 = c9548;
                        } else if (!c9548.m24404()) {
                            c9548M24403 = c9548M24403.m24402(c9548).m24403(AbstractC8177.m21475());
                        }
                        arrayList2.set(size, c9548M24403);
                        z2 = true;
                    }
                }
                i3++;
            }
        }
        if (c9548.m24404()) {
            return;
        }
        this.f60952 = ((Integer) c9548.m24407()).intValue();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43380(int i) {
        this.f60953.append(C11249.m28219(i, " "));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43381() {
        String string = this.f60960.toString();
        boolean zMo27210 = AbstractC14384.m34616().mo27210(string);
        ArrayList arrayList = this.f60958;
        if (!zMo27210) {
            arrayList.add(string);
        }
        int size = arrayList.size();
        int i = this.f60950;
        C9548 c9548M24401 = C9548.m24401(Integer.valueOf(i), Integer.valueOf(i + 1));
        while (true) {
            ArrayList arrayList2 = this.f1199;
            if (arrayList2.size() < size) {
                arrayList2.add(C17831.f56466);
            } else {
                arrayList2.add(c9548M24401);
                m1248(AbstractC22433.copyOf((Collection) arrayList));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13553 m43379() {
        return this.f60959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m43375(C20234 c20234) {
        String str;
        C9548 c9548M24401;
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        HashMap mapM1243 = AbstractC0146.m1243(this);
        C20234 c20234M45738 = C20234.m45738();
        C0192 c0192 = this.f60954;
        Iterator it = ((C20234) c20234.mo26253(C9548.m24395((Integer) 0, Integer.valueOf(c0192.m1422())))).mo13811().iterator();
        while (it.hasNext()) {
            C9548 c9548M24403 = ((C9548) it.next()).m24403(AbstractC8177.m21475());
            Integer num = (Integer) c9548M24403.m24409();
            num.getClass();
            int iIntValue = ((Integer) c9548M24403.m24407()).intValue() - 1;
            C20234 c20235 = this.f60957;
            boolean zMo26254 = c20235.mo26254(num);
            C9548 c9548 = AbstractC0146.f1197;
            if (zMo26254 && c20235.mo26254(Integer.valueOf(iIntValue))) {
                Integer num2 = (Integer) c20235.mo13812(num).m24409();
                num2.getClass();
                c9548M24401 = C9548.m24401(num2, Integer.valueOf(((Integer) c20235.mo13812(Integer.valueOf(iIntValue)).m24407()).intValue() + 1));
            } else {
                c9548M24401 = c9548;
            }
            if (!c9548M24401.equals(c9548)) {
                c20234M45738.mo26252(c9548M24401);
            }
        }
        for (C9548 c9549 : (AbstractC20172) c20234M45738.mo13811()) {
            InterfaceC20608 interfaceC20608M43374 = m43374(c0192.m1423(((Integer) c9549.m24409()).intValue()));
            InterfaceC20608 interfaceC20608M43373 = m43373(c0192.m1423(((Integer) c9549.m24407()).intValue() - 1));
            StringBuilder sb = new StringBuilder();
            int position = interfaceC20608M43374.getPosition();
            while (position > 0) {
                if (!AbstractC14384.m34616().mo1772(c0192.m1425().charAt(position - 1))) {
                    break;
                }
                position--;
            }
            int iIntValue2 = ((Integer) ((C9548) mapM1243.get(Integer.valueOf(interfaceC20608M43374.getIndex()))).m24409()).intValue();
            while (iIntValue2 > 0 && m1245(iIntValue2 - 1).isEmpty()) {
                iIntValue2--;
            }
            while (true) {
                int iIntValue3 = ((Integer) ((C9548) mapM1243.get(Integer.valueOf(interfaceC20608M43373.getIndex()))).m24407()).intValue();
                str = this.f60955;
                if (iIntValue2 >= iIntValue3) {
                    break;
                }
                if (iIntValue2 < m1244()) {
                    if (iIntValue2 > 0) {
                        sb.append(str);
                    }
                    sb.append(m1245(iIntValue2));
                }
                iIntValue2++;
            }
            int iMin = Math.min(interfaceC20608M43373.length() + interfaceC20608M43373.getPosition(), c0192.m1425().length());
            if (interfaceC20608M43373.getIndex() == c0192.m1422() - 1) {
                iMin = c0192.m1425().length();
            }
            int i2 = -1;
            while (iMin < c0192.m1425().length()) {
                if (!AbstractC14384.m34616().mo1772(c0192.m1425().charAt(iMin))) {
                    break;
                }
                int iM39862 = C17080.m39862(iMin, c0192.m1425());
                if (iM39862 != -1) {
                    i2 = iMin;
                    iMin = iM39862 + iMin;
                } else {
                    iMin++;
                }
            }
            if (i2 != -1) {
                iMin = i2;
            }
            if (i2 == -1) {
                sb.append(str);
            }
            while (iIntValue2 < m1244()) {
                String strM1245 = m1245(iIntValue2);
                int iMo27211 = AbstractC14384.m34616().mo27209().mo27211(strM1245);
                if (iMo27211 != -1) {
                    if (i2 != -1) {
                        break;
                    }
                    sb.append((CharSequence) strM1245, 0, iMo27211);
                    break;
                }
                sb.append(str);
                iIntValue2++;
            }
            c4793.m52163(C16690.m39160(position, iMin, sb.toString()));
        }
        return c4793.m13309();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43372(String str, List list) {
        ArrayList<C16690> arrayList = new ArrayList(list);
        C23846.sort(arrayList, C21023.reversed(C7618.comparing(new C13874(7))));
        StringBuilder sb = new StringBuilder(str);
        for (C16690 c16690 : arrayList) {
            sb.replace(((Integer) c16690.m39161().m24409()).intValue(), ((Integer) c16690.m39161().m24407()).intValue(), c16690.m39162());
        }
        if (!str.endsWith("\n")) {
            while (sb.length() != 0 && sb.charAt(sb.length() - 1) == '\n') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20608 m43374(InterfaceC15670 interfaceC15670) {
        AbstractC16706 abstractC16706ListIterator = interfaceC15670.mo37337().listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            InterfaceC20608 interfaceC20608 = (InterfaceC20608) abstractC16706ListIterator.next();
            if (interfaceC20608.getIndex() >= 0) {
                return interfaceC20608;
            }
        }
        return interfaceC15670.mo37335();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20608 m43373(InterfaceC15670 interfaceC15670) {
        InterfaceC20608 interfaceC20608;
        int size = interfaceC15670.mo37336().size();
        do {
            size--;
            if (size >= 0) {
                interfaceC20608 = (InterfaceC20608) interfaceC15670.mo37336().get(size);
            } else {
                return interfaceC15670.mo37335();
            }
        } while (interfaceC20608.getIndex() < 0);
        return interfaceC20608;
    }

    @Override // l.AbstractC4425, l.AbstractC0146
    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51285("iLine", this.f60949);
        c23244M37072.m51285("lastK", this.f60952);
        c23244M37072.m51284((Object) this.f60953.toString().replace("\t", "\\t"), "spacesPending");
        c23244M37072.m51285("newlinesPending", this.f60956);
        c23244M37072.m51284(this.f60951, "blankLines");
        c23244M37072.m51284((Object) super.toString(), "super");
        return c23244M37072.toString();
    }
}
