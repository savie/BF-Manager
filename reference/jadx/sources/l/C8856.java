package l;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C8856 implements InterfaceC9601 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2649 f28938 = new C2890();

    @Override // l.InterfaceC9601
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo23731(C10852 c10852, C6117 c6117, InterfaceC1399 interfaceC1399) {
        return interfaceC1399.mo5109(c6117);
    }

    @Override // l.InterfaceC9601
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo23732(C10852 c10852, C24652 c24652, C6117 c6117, InterfaceC1399 interfaceC1399) throws C10347 {
        C2277 c2277;
        String strM23910;
        if (((C18684) c24652.mo3632()).m43472() != EnumC20243.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            return interfaceC1399.mo5109(c6117);
        }
        C11971 c11971M55006 = c24652.m55006();
        if (c11971M55006 == null) {
            c2277 = null;
            break;
        }
        Iterator it = c11971M55006.m30012().iterator();
        while (true) {
            if (!it.hasNext()) {
                c2277 = null;
                break;
            }
            InterfaceC6006 interfaceC6006 = (InterfaceC6006) it.next();
            if (interfaceC6006 instanceof C2277) {
                c2277 = (C2277) interfaceC6006;
                break;
            }
        }
        if (c2277 == null) {
            throw new C10347(((C18684) c24652.mo3632()).m43472(), "Create failed for " + c6117 + ": missing symlink data");
        }
        String strM17651 = c6117.m17651();
        int iM7722 = c2277.m7722();
        byte[] bArrM40357 = C17192.m40357(strM17651);
        int length = bArrM40357.length - iM7722;
        Charset charset = C22150.f71350;
        String str = new String(bArrM40357, length, iM7722, charset);
        String strM7720 = c2277.m7720();
        if (c2277.m7721()) {
            strM23910 = C14483.m34972(strM7720, str);
        } else {
            byte[] bArrM40358 = C17192.m40357(strM17651);
            String str2 = new String(bArrM40358, 0, bArrM40358.length - iM7722, charset);
            StringBuilder sb = new StringBuilder();
            int iLastIndexOf = str2.lastIndexOf("\\");
            if (iLastIndexOf != -1) {
                sb.append((CharSequence) str2, 0, iLastIndexOf);
                sb.append('\\');
            }
            strM23910 = C8947.m23910(sb, strM7720, str);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iIndexOf = strM23910.indexOf(92, i);
            if (iIndexOf == -1) {
                break;
            }
            arrayList.add(strM23910.substring(i, iIndexOf));
            i = iIndexOf + 1;
        }
        arrayList.add(strM23910.substring(i));
        int i2 = 0;
        while (i2 < arrayList.size()) {
            String str3 = (String) arrayList.get(i2);
            if (".".equals(str3)) {
                arrayList.remove(i2);
            } else if ("..".equals(str3)) {
                if (i2 > 0) {
                    arrayList.remove(i2);
                    i2--;
                }
                arrayList.remove(i2);
            } else {
                i2++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (i3 > 0) {
                sb2.append('\\');
            }
            sb2.append((String) arrayList.get(i3));
        }
        return interfaceC1399.mo5109(new C6117(c6117.m17648(), c6117.m17650(), sb2.toString()));
    }

    @Override // l.InterfaceC9601
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2649 mo23733() {
        return this.f28938;
    }
}
