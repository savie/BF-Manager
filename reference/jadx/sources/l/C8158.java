package l;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8158 implements InterfaceC18035 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC18472 f28510 = new C18741();

    @Override // l.InterfaceC18035
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo21469(C20858 c20858, C11748 c11748, InterfaceC21563 interfaceC21563) {
        return interfaceC21563.mo16392(c11748);
    }

    @Override // l.InterfaceC18035
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo21470(C20858 c20858, C11771 c11771, C11748 c11748, InterfaceC21563 interfaceC21563) throws C15214 {
        C12747 c12747;
        String strM50267;
        if (((C1186) c11771.mo25478()).m4349() != EnumC3055.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            return interfaceC21563.mo16392(c11748);
        }
        C17685 c17685M29402 = c11771.m29402();
        if (c17685M29402 == null) {
            c12747 = null;
            break;
        }
        Iterator it = c17685M29402.m41206().iterator();
        while (true) {
            if (!it.hasNext()) {
                c12747 = null;
                break;
            }
            InterfaceC16980 interfaceC16980 = (InterfaceC16980) it.next();
            if (interfaceC16980 instanceof C12747) {
                c12747 = (C12747) interfaceC16980;
                break;
            }
        }
        if (c12747 == null) {
            throw new C15214(((C1186) c11771.mo25478()).m4349(), "Create failed for " + c11748 + ": missing symlink data");
        }
        String strM29358 = c11748.m29358();
        int iM31680 = c12747.m31680();
        byte[] bArrM28401 = C11336.m28401(strM29358);
        int length = bArrM28401.length - iM31680;
        Charset charset = C7393.f24570;
        String str = new String(bArrM28401, length, iM31680, charset);
        String strM31678 = c12747.m31678();
        if (c12747.m31679()) {
            strM50267 = C15489.m37076(strM31678, str);
        } else {
            byte[] bArrM28402 = C11336.m28401(strM29358);
            String str2 = new String(bArrM28402, 0, bArrM28402.length - iM31680, charset);
            StringBuilder sb = new StringBuilder();
            int iLastIndexOf = str2.lastIndexOf("\\");
            if (iLastIndexOf != -1) {
                sb.append((CharSequence) str2, 0, iLastIndexOf);
                sb.append('\\');
            }
            strM50267 = C22697.m50267(sb, strM31678, str);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iIndexOf = strM50267.indexOf(92, i);
            if (iIndexOf == -1) {
                break;
            }
            arrayList.add(strM50267.substring(i, iIndexOf));
            i = iIndexOf + 1;
        }
        arrayList.add(strM50267.substring(i));
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
        return interfaceC21563.mo16392(new C11748(c11748.m29355(), c11748.m29357(), sb2.toString()));
    }

    @Override // l.InterfaceC18035
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18472 mo21471() {
        return this.f28510;
    }
}
