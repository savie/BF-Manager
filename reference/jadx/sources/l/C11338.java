package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11338 extends AbstractC2760 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f35711;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4472 f35713;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17896 f35716;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f35718;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f35720 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C24654 f35721 = C24654.m55012();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35719 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f35715 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f35714 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f35717 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public StringBuilder f35722 = new StringBuilder();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public StringBuilder f35712 = new StringBuilder();

    public C11338(String str, C4472 c4472, C17896 c17896) {
        this.f35718 = str;
        this.f35713 = c4472;
        this.f35716 = c17896;
        this.f35711 = c4472.m14169();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28630(int i, AbstractC10217 abstractC10217) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f35720;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), ((AbstractC10217) map.get(Integer.valueOf(i))).mo21764(abstractC10217));
        } else {
            map.put(Integer.valueOf(i), abstractC10217);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28632(InterfaceC12455 interfaceC12455, InterfaceC12455 interfaceC12456) {
        this.f35721.mo12238(C2346.m7908(Integer.valueOf(m28628(interfaceC12455).getIndex()), Integer.valueOf(m28627(interfaceC12456).getIndex())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28631(C2346 c2346, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!c2346.m7917()) {
            C4472 c4472 = this.f35713;
            int iM54500 = c4472.m54500();
            boolean z = false;
            while (true) {
                int i = this.f35715;
                if (i >= iM54500 || (!c4472.m54503(i).m7917() && ((Integer) c4472.m54503(this.f35715).m7920()).intValue() > ((Integer) c2346.m7922()).intValue())) {
                    break;
                }
                if (c4472.m54503(this.f35715).m7917()) {
                    z = true;
                }
                this.f35715++;
            }
            AbstractC10217 abstractC10217 = (AbstractC10217) C11392.getOrDefault(this.f35720, Integer.valueOf(this.f35714), AbstractC10217.f32657);
            if ((z && (str.startsWith("//") || str.startsWith("/*"))) || ((Boolean) abstractC10217.mo21765().orElse(Boolean.valueOf(z))).booleanValue()) {
                this.f35717++;
            }
        }
        if (C21406.m48703(str)) {
            int i2 = this.f35717;
            if (i2 == 0) {
                this.f35717 = i2 + 1;
            }
            this.f35712 = new StringBuilder();
        } else {
            int length = str.length();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '\t') {
                    this.f35712.append('\t');
                } else if (cCharAt == '\n') {
                    this.f35712 = new StringBuilder();
                    this.f35717++;
                } else if (cCharAt == '\r') {
                    int i4 = i3 + 1;
                    if (i4 < str.length() && str.charAt(i4) == '\n') {
                        i3 = i4;
                    }
                    this.f35712 = new StringBuilder();
                    this.f35717++;
                } else if (cCharAt == ' ') {
                    this.f35712.append(' ');
                } else {
                    while (true) {
                        int i5 = this.f35717;
                        arrayList = this.f35719;
                        if (i5 <= 0) {
                            break;
                        }
                        if (!arrayList.isEmpty() || this.f35722.length() > 0) {
                            arrayList.add(this.f35722.toString());
                        }
                        this.f35722 = new StringBuilder();
                        this.f35717--;
                        z2 = false;
                    }
                    if (this.f35712.length() > 0) {
                        this.f35722.append((CharSequence) this.f35712);
                        this.f35712 = new StringBuilder();
                    }
                    this.f35722.append(cCharAt);
                    if (!c2346.m7917() && !z2) {
                        while (true) {
                            arrayList2 = this.f79115;
                            if (arrayList2.size() > arrayList.size()) {
                                break;
                            } else {
                                arrayList2.add(C11929.f38425);
                            }
                        }
                        int size = arrayList.size();
                        C2346 c2346M7916 = (C2346) arrayList2.get(arrayList.size());
                        if (c2346M7916.m7917()) {
                            c2346M7916 = c2346;
                        } else if (!c2346.m7917()) {
                            c2346M7916 = c2346M7916.m7924(c2346).m7916(AbstractC6468.m18293());
                        }
                        arrayList2.set(size, c2346M7916);
                        z2 = true;
                    }
                }
                i3++;
            }
        }
        if (c2346.m7917()) {
            return;
        }
        this.f35714 = ((Integer) c2346.m7920()).intValue();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28634(int i) {
        this.f35712.append(C8399.m22569(i, " "));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28635() {
        String string = this.f35722.toString();
        boolean zMo23312 = AbstractC21825.m49482().mo23312(string);
        ArrayList arrayList = this.f35719;
        if (!zMo23312) {
            arrayList.add(string);
        }
        int size = arrayList.size();
        int i = this.f35711;
        C2346 c2346M7914 = C2346.m7914(Integer.valueOf(i), Integer.valueOf(i + 1));
        while (true) {
            ArrayList arrayList2 = this.f79115;
            if (arrayList2.size() < size) {
                arrayList2.add(C11929.f38425);
            } else {
                arrayList2.add(c2346M7914);
                m54504(AbstractC1928.copyOf((Collection) arrayList));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8770 m28633() {
        return this.f35716;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m28629(C24654 c24654) {
        String str;
        C2346 c2346M7914;
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        HashMap mapM54499 = AbstractC24390.m54499(this);
        C24654 c24654M55012 = C24654.m55012();
        C4472 c4472 = this.f35713;
        Iterator it = ((C24654) c24654.mo12239(C2346.m7908((Integer) 0, Integer.valueOf(c4472.m14169())))).mo4357().iterator();
        while (it.hasNext()) {
            C2346 c2346M7916 = ((C2346) it.next()).m7916(AbstractC6468.m18293());
            Integer num = (Integer) c2346M7916.m7922();
            num.getClass();
            int iIntValue = ((Integer) c2346M7916.m7920()).intValue() - 1;
            C24654 c24655 = this.f35721;
            boolean zMo12240 = c24655.mo12240(num);
            C2346 c2346 = AbstractC24390.f79112;
            if (zMo12240 && c24655.mo12240(Integer.valueOf(iIntValue))) {
                Integer num2 = (Integer) c24655.mo4358(num).m7922();
                num2.getClass();
                c2346M7914 = C2346.m7914(num2, Integer.valueOf(((Integer) c24655.mo4358(Integer.valueOf(iIntValue)).m7920()).intValue() + 1));
            } else {
                c2346M7914 = c2346;
            }
            if (!c2346M7914.equals(c2346)) {
                c24654M55012.mo12238(c2346M7914);
            }
        }
        for (C2346 c2347 : (AbstractC7959) c24654M55012.mo4357()) {
            InterfaceC20660 interfaceC20660M28628 = m28628(c4472.m14170(((Integer) c2347.m7922()).intValue()));
            InterfaceC20660 interfaceC20660M28627 = m28627(c4472.m14170(((Integer) c2347.m7920()).intValue() - 1));
            StringBuilder sb = new StringBuilder();
            int position = interfaceC20660M28628.getPosition();
            while (position > 0) {
                if (!AbstractC21825.m49482().mo4420(c4472.m14168().charAt(position - 1))) {
                    break;
                }
                position--;
            }
            int iIntValue2 = ((Integer) ((C2346) mapM54499.get(Integer.valueOf(interfaceC20660M28628.getIndex()))).m7922()).intValue();
            while (iIntValue2 > 0 && m54501(iIntValue2 - 1).isEmpty()) {
                iIntValue2--;
            }
            while (true) {
                int iIntValue3 = ((Integer) ((C2346) mapM54499.get(Integer.valueOf(interfaceC20660M28627.getIndex()))).m7920()).intValue();
                str = this.f35718;
                if (iIntValue2 >= iIntValue3) {
                    break;
                }
                if (iIntValue2 < m54500()) {
                    if (iIntValue2 > 0) {
                        sb.append(str);
                    }
                    sb.append(m54501(iIntValue2));
                }
                iIntValue2++;
            }
            int iMin = Math.min(interfaceC20660M28627.length() + interfaceC20660M28627.getPosition(), c4472.m14168().length());
            if (interfaceC20660M28627.getIndex() == c4472.m14169() - 1) {
                iMin = c4472.m14168().length();
            }
            int i2 = -1;
            while (iMin < c4472.m14168().length()) {
                if (!AbstractC21825.m49482().mo4420(c4472.m14168().charAt(iMin))) {
                    break;
                }
                int iM48701 = C21406.m48701(iMin, c4472.m14168());
                if (iM48701 != -1) {
                    i2 = iMin;
                    iMin = iM48701 + iMin;
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
            while (iIntValue2 < m54500()) {
                String strM54501 = m54501(iIntValue2);
                int iMo33825 = AbstractC21825.m49482().mo23311().mo33825(strM54501);
                if (iMo33825 != -1) {
                    if (i2 != -1) {
                        break;
                    }
                    sb.append((CharSequence) strM54501, 0, iMo33825);
                    break;
                }
                sb.append(str);
                iIntValue2++;
            }
            c22811.m19807(C24019.m53573(position, iMin, sb.toString()));
        }
        return c22811.m51441();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28626(String str, List list) {
        ArrayList<C24019> arrayList = new ArrayList(list);
        C12884.sort(arrayList, C8627.reversed(C2661.comparing(new C3398(4))));
        StringBuilder sb = new StringBuilder(str);
        for (C24019 c24019 : arrayList) {
            sb.replace(((Integer) c24019.m53574().m7922()).intValue(), ((Integer) c24019.m53574().m7920()).intValue(), c24019.m53575());
        }
        if (!str.endsWith("\n")) {
            while (sb.length() != 0 && sb.charAt(sb.length() - 1) == '\n') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC20660 m28628(InterfaceC12455 interfaceC12455) {
        AbstractC14956 abstractC14956ListIterator = interfaceC12455.mo30932().listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            InterfaceC20660 interfaceC20660 = (InterfaceC20660) abstractC14956ListIterator.next();
            if (interfaceC20660.getIndex() >= 0) {
                return interfaceC20660;
            }
        }
        return interfaceC12455.mo30930();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20660 m28627(InterfaceC12455 interfaceC12455) {
        InterfaceC20660 interfaceC20660;
        int size = interfaceC12455.mo30931().size();
        do {
            size--;
            if (size >= 0) {
                interfaceC20660 = (InterfaceC20660) interfaceC12455.mo30931().get(size);
            } else {
                return interfaceC12455.mo30930();
            }
        } while (interfaceC20660.getIndex() < 0);
        return interfaceC20660;
    }

    @Override // l.AbstractC2760, l.AbstractC24390
    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10380("iLine", this.f35715);
        c3179M46714.m10380("lastK", this.f35714);
        c3179M46714.m10379((Object) this.f35712.toString().replace("\t", "\\t"), "spacesPending");
        c3179M46714.m10380("newlinesPending", this.f35717);
        c3179M46714.m10379(this.f35720, "blankLines");
        c3179M46714.m10379((Object) super.toString(), "super");
        return c3179M46714.toString();
    }
}
