package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܿۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17172 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5655 f54741;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f54742 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Integer f54743;

    public C17172(C5655 c5655) {
        this.f54741 = c5655;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] m40099(ArrayList arrayList, int i) throws C12711 {
        Object objM39681;
        Object objValueOf;
        Object[] objArr = new Object[i];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) it.next();
            EnumC10297 enumC10297Mo5435 = interfaceC1594.mo5435();
            int i2 = C12234.f40875[enumC10297Mo5435.ordinal()];
            byte b = 0;
            C5655 c5655 = this.f54741;
            HashMap map = this.f54742;
            switch (i2) {
                case 1:
                case 2:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = ((InterfaceC20852) ((InterfaceC13859) interfaceC1594).getReference()).getString();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    int iMo1140 = ((InterfaceC4685) interfaceC1594).mo1140();
                    long jMo4062 = ((InterfaceC6802) interfaceC1594).mo4062();
                    objArr[iMo1140] = Integer.valueOf((int) (jMo4062 & 4294967295L));
                    objArr[iMo1140 + 1] = Integer.valueOf((int) ((jMo4062 >>> 32) & 4294967295L));
                    break;
                case 11:
                    InterfaceC18735 interfaceC18735 = (InterfaceC18735) ((InterfaceC13859) interfaceC1594).getReference();
                    if (!interfaceC18735.getType().equals("[S")) {
                        throw new UnsupportedOperationException("sget-object " + interfaceC18735.getType());
                    }
                    String string = interfaceC18735.toString();
                    if (map.containsKey(string)) {
                        objM39681 = map.get(string);
                    } else {
                        objM39681 = c5655.f19321.m39681(AbstractC1421.m4982(interfaceC18735.mo1183()), interfaceC18735.getName());
                        map.put(string, objM39681);
                    }
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = objM39681;
                    break;
                    break;
                case 12:
                    InterfaceC18735 interfaceC18736 = (InterfaceC18735) ((InterfaceC13859) interfaceC1594).getReference();
                    if (!interfaceC18736.getType().equals("I")) {
                        throw new UnsupportedOperationException("sget " + interfaceC18736.getType());
                    }
                    String string2 = interfaceC18736.toString();
                    if (map.containsKey(string2)) {
                        objValueOf = map.get(string2);
                    } else {
                        objValueOf = Integer.valueOf(c5655.f19321.m39679(AbstractC1421.m4982(interfaceC18736.mo1183()), interfaceC18736.getName()));
                        map.put(string2, objValueOf);
                    }
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = objValueOf;
                    break;
                    break;
                case 13:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Array.get(objArr[((InterfaceC1157) interfaceC1594).mo1144()], ((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue());
                    break;
                case 14:
                case 15:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() + ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 16:
                case 17:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() - ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 18:
                case 19:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() * ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 20:
                case 21:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() / ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 22:
                case 23:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() % ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 24:
                case 25:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((InterfaceC9357) interfaceC1594).mo4063() & ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 26:
                case 27:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((InterfaceC9357) interfaceC1594).mo4063() | ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 28:
                case 29:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((InterfaceC9357) interfaceC1594).mo4063() ^ ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 30:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() << ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 31:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() >> ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 32:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() >>> ((InterfaceC9357) interfaceC1594).mo4063());
                    break;
                case 33:
                    int iMo1141 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1141] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() + ((Number) objArr[iMo1141]).intValue());
                    break;
                case 34:
                    int iMo1142 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1142] = Integer.valueOf(((Number) objArr[iMo1142]).intValue() - ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 35:
                    int iMo1143 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1143] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() * ((Number) objArr[iMo1143]).intValue());
                    break;
                case 36:
                    int iMo1144 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1144] = Integer.valueOf(((Number) objArr[iMo1144]).intValue() / ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 37:
                    int iMo1145 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1145] = Integer.valueOf(((Number) objArr[iMo1145]).intValue() % ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 38:
                    int iMo1146 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1146] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() & ((Number) objArr[iMo1146]).intValue());
                    break;
                case 39:
                    int iMo1147 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1147] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() | ((Number) objArr[iMo1147]).intValue());
                    break;
                case 40:
                    int iMo1148 = ((InterfaceC4685) interfaceC1594).mo1140();
                    objArr[iMo1148] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() ^ ((Number) objArr[iMo1148]).intValue());
                    break;
                case 41:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue() + ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 42:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() - ((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue());
                    break;
                case 43:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue() * ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 44:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() / ((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue());
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue() % ((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue());
                    break;
                case 46:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue() & ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 47:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue() | ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 48:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = Integer.valueOf(((Number) objArr[((InterfaceC22325) interfaceC1594).mo26898()]).intValue() ^ ((Number) objArr[((InterfaceC1157) interfaceC1594).mo1144()]).intValue());
                    break;
                case 49:
                case 50:
                case 51:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = objArr[((InterfaceC1157) interfaceC1594).mo1144()];
                    break;
                case 52:
                case 53:
                    objArr[((InterfaceC4685) interfaceC1594).mo1140()] = this.f54743;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    int iMo2109 = interfaceC1594 instanceof InterfaceC11742 ? ((InterfaceC11742) interfaceC1594).mo2109() : ((InterfaceC10768) interfaceC1594).mo3085();
                    InterfaceC8858 interfaceC8858 = (InterfaceC8858) ((InterfaceC13859) interfaceC1594).getReference();
                    if (!interfaceC8858.mo9698().equals("I") || interfaceC8858.mo9699().size() != 1 || !(objArr[iMo2109] instanceof String)) {
                        throw new UnsupportedOperationException(enumC10297Mo5435.f35326 + " " + interfaceC8858);
                    }
                    C11018 c11018 = new C11018();
                    c11018.m27782((CharSequence) AbstractC1421.m4982(interfaceC8858.mo9700()));
                    c11018.m27782((CharSequence) interfaceC8858.getName());
                    c11018.writeByte(1);
                    c11018.writeByte(((CharSequence) interfaceC8858.mo9699().get(0)).equals("Ljava/lang/String;") ? 8 : 9);
                    c11018.m27782((CharSequence) objArr[iMo2109]);
                    this.f54743 = Integer.valueOf(c5655.f19321.m39682(c11018.m27773()));
                    break;
                    break;
                case 56:
                    int iMo1149 = ((InterfaceC4685) interfaceC1594).mo1140();
                    int iMo11410 = ((InterfaceC1157) interfaceC1594).mo1144();
                    String type = ((InterfaceC15914) ((InterfaceC13859) interfaceC1594).getReference()).getType();
                    int iIntValue = ((Number) objArr[iMo11410]).intValue();
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
                            objArr[iMo1149] = new byte[iIntValue];
                            break;
                        case 1:
                            objArr[iMo1149] = new char[iIntValue];
                            break;
                        case 2:
                            objArr[iMo1149] = new int[iIntValue];
                            break;
                        case 3:
                            objArr[iMo1149] = new short[iIntValue];
                            break;
                        default:
                            throw new UnsupportedOperationException("new-array ".concat(type));
                    }
                    break;
                default:
                    throw new UnsupportedOperationException(enumC10297Mo5435.f35326);
            }
        }
        return objArr;
    }
}
