package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܿۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C1WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22420 f59656;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f59657 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Integer f59658;

    public C18295(C22420 c22420) {
        this.f59656 = c22420;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] m42629(ArrayList arrayList, int i) throws C21674 {
        Object objM36008;
        Object objValueOf;
        Object[] objArr = new Object[i];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) it.next();
            EnumC22631 enumC22631Mo30864 = interfaceC23331.mo30864();
            int i2 = C21279.f67842[enumC22631Mo30864.ordinal()];
            byte b = 0;
            C22420 c22420 = this.f59656;
            HashMap map = this.f59657;
            switch (i2) {
                case 1:
                case 2:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = ((InterfaceC22759) ((InterfaceC6177) interfaceC23331).getReference()).getString();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    int iMo1542 = ((InterfaceC12142) interfaceC23331).mo1542();
                    long jMo1545 = ((InterfaceC18855) interfaceC23331).mo1545();
                    objArr[iMo1542] = Integer.valueOf((int) (jMo1545 & 4294967295L));
                    objArr[iMo1542 + 1] = Integer.valueOf((int) ((jMo1545 >>> 32) & 4294967295L));
                    break;
                case 11:
                    InterfaceC8304 interfaceC8304 = (InterfaceC8304) ((InterfaceC6177) interfaceC23331).getReference();
                    if (!interfaceC8304.getType().equals("[S")) {
                        throw new UnsupportedOperationException("sget-object " + interfaceC8304.getType());
                    }
                    String string = interfaceC8304.toString();
                    if (map.containsKey(string)) {
                        objM36008 = map.get(string);
                    } else {
                        objM36008 = c22420.f72608.m36008(AbstractC23166.m52090(interfaceC8304.mo4500()), interfaceC8304.getName());
                        map.put(string, objM36008);
                    }
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = objM36008;
                    break;
                    break;
                case 12:
                    InterfaceC8304 interfaceC8305 = (InterfaceC8304) ((InterfaceC6177) interfaceC23331).getReference();
                    if (!interfaceC8305.getType().equals("I")) {
                        throw new UnsupportedOperationException("sget " + interfaceC8305.getType());
                    }
                    String string2 = interfaceC8305.toString();
                    if (map.containsKey(string2)) {
                        objValueOf = map.get(string2);
                    } else {
                        objValueOf = Integer.valueOf(c22420.f72608.m36016(AbstractC23166.m52090(interfaceC8305.mo4500()), interfaceC8305.getName()));
                        map.put(string2, objValueOf);
                    }
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = objValueOf;
                    break;
                    break;
                case 13:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Array.get(objArr[((InterfaceC18109) interfaceC23331).mo1541()], ((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue());
                    break;
                case 14:
                case 15:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() + ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 16:
                case 17:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() - ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 18:
                case 19:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() * ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 20:
                case 21:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() / ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 22:
                case 23:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() % ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 24:
                case 25:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((InterfaceC3193) interfaceC23331).mo1546() & ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 26:
                case 27:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((InterfaceC3193) interfaceC23331).mo1546() | ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 28:
                case 29:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((InterfaceC3193) interfaceC23331).mo1546() ^ ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 30:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() << ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 31:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() >> ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 32:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() >>> ((InterfaceC3193) interfaceC23331).mo1546());
                    break;
                case 33:
                    int iMo1543 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo1543] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() + ((Number) objArr[iMo1543]).intValue());
                    break;
                case 34:
                    int iMo1544 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo1544] = Integer.valueOf(((Number) objArr[iMo1544]).intValue() - ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 35:
                    int iMo1545 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo1545] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() * ((Number) objArr[iMo1545]).intValue());
                    break;
                case 36:
                    int iMo1546 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo1546] = Integer.valueOf(((Number) objArr[iMo1546]).intValue() / ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 37:
                    int iMo1547 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo1547] = Integer.valueOf(((Number) objArr[iMo1547]).intValue() % ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 38:
                    int iMo1548 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo1548] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() & ((Number) objArr[iMo1548]).intValue());
                    break;
                case 39:
                    int iMo1549 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo1549] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() | ((Number) objArr[iMo1549]).intValue());
                    break;
                case 40:
                    int iMo15410 = ((InterfaceC12142) interfaceC23331).mo1542();
                    objArr[iMo15410] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() ^ ((Number) objArr[iMo15410]).intValue());
                    break;
                case 41:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue() + ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 42:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() - ((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue());
                    break;
                case 43:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue() * ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 44:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() / ((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue());
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue() % ((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue());
                    break;
                case 46:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue() & ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 47:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue() | ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 48:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = Integer.valueOf(((Number) objArr[((InterfaceC21093) interfaceC23331).mo8187()]).intValue() ^ ((Number) objArr[((InterfaceC18109) interfaceC23331).mo1541()]).intValue());
                    break;
                case 49:
                case 50:
                case 51:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = objArr[((InterfaceC18109) interfaceC23331).mo1541()];
                    break;
                case 52:
                case 53:
                    objArr[((InterfaceC12142) interfaceC23331).mo1542()] = this.f59658;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    int iMo2772 = interfaceC23331 instanceof InterfaceC24077 ? ((InterfaceC24077) interfaceC23331).mo2772() : ((InterfaceC16617) interfaceC23331).mo7063();
                    InterfaceC4859 interfaceC4859 = (InterfaceC4859) ((InterfaceC6177) interfaceC23331).getReference();
                    if (!interfaceC4859.mo6802().equals("I") || interfaceC4859.mo6805().size() != 1 || !(objArr[iMo2772] instanceof String)) {
                        throw new UnsupportedOperationException(enumC22631Mo30864.f73509 + " " + interfaceC4859);
                    }
                    C6178 c6178 = new C6178();
                    c6178.m17786((CharSequence) AbstractC23166.m52090(interfaceC4859.mo6804()));
                    c6178.m17786((CharSequence) interfaceC4859.getName());
                    c6178.writeByte(1);
                    c6178.writeByte(((CharSequence) interfaceC4859.mo6805().get(0)).equals("Ljava/lang/String;") ? 8 : 9);
                    c6178.m17786((CharSequence) objArr[iMo2772]);
                    this.f59658 = Integer.valueOf(c22420.f72608.m36009(c6178.m17796()));
                    break;
                    break;
                case 56:
                    int iMo15411 = ((InterfaceC12142) interfaceC23331).mo1542();
                    int iMo1541 = ((InterfaceC18109) interfaceC23331).mo1541();
                    String type = ((InterfaceC19775) ((InterfaceC6177) interfaceC23331).getReference()).getType();
                    int iIntValue = ((Number) objArr[iMo1541]).intValue();
                    type.getClass();
                    switch (type.hashCode()) {
                        case 2887:
                            if (!type.equals("[B")) {
                                b = -1;
                            }
                            break;
                        case 2888:
                            if (!type.equals("[C")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2894:
                            if (!type.equals("[I")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 2904:
                            if (!type.equals("[S")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            objArr[iMo15411] = new byte[iIntValue];
                            break;
                        case 1:
                            objArr[iMo15411] = new char[iIntValue];
                            break;
                        case 2:
                            objArr[iMo15411] = new int[iIntValue];
                            break;
                        case 3:
                            objArr[iMo15411] = new short[iIntValue];
                            break;
                        default:
                            throw new UnsupportedOperationException("new-array ".concat(type));
                    }
                    break;
                default:
                    throw new UnsupportedOperationException(enumC22631Mo30864.f73509);
            }
        }
        return objArr;
    }
}
