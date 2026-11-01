package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17177 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5888 f54753;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f54755 = new HashMap(64);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20809 f54751 = new C20809(EnumC23529.f76192);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54752 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayDeque f54756 = new ArrayDeque();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f54754 = null;

    public C17177(C5888 c5888) {
        this.f54753 = c5888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40100(C17177 c17177, InterfaceC15767 interfaceC15767) {
        AbstractC11242 abstractC11242M52777;
        ArrayDeque arrayDeque = c17177.f54756;
        C5888 c5888 = c17177.f54753;
        C17177 c17178 = c5888.f20079;
        Object objMo18742 = interfaceC15767.mo18742(c5888.f20084);
        HashMap map = c17177.f54755;
        Integer numValueOf = (Integer) map.get(objMo18742);
        if (numValueOf == null) {
            int i = c17177.f54752;
            c17177.f54752 = i + 1;
            numValueOf = Integer.valueOf(i);
            map.put(objMo18742, numValueOf);
            boolean zIsEmpty = arrayDeque.isEmpty();
            arrayDeque.addLast(interfaceC15767);
            if (zIsEmpty) {
                while (!arrayDeque.isEmpty()) {
                    InterfaceC15767 interfaceC15768 = (InterfaceC15767) arrayDeque.peekFirst();
                    C20809 c20809 = c17177.f54751;
                    int iMo1941 = interfaceC15768.mo1941();
                    switch (iMo1941) {
                        case 1:
                            AbstractC11242 abstractC11242 = (AbstractC11242) interfaceC15768;
                            c20809.m46793(iMo1941);
                            int iMo28217 = abstractC11242.mo28217();
                            byte[] bArr = new byte[iMo28217];
                            abstractC11242.m28212(0, bArr);
                            c20809.m46798(iMo28217);
                            c20809.m46794(0, iMo28217, bArr);
                            if (c17177.f54754 == null && iMo28217 > 65535) {
                                c17177.f54754 = new String(bArr);
                            }
                            break;
                        case 2:
                        case 13:
                        case 14:
                        default:
                            throw new AssertionError(C8479.m22141(iMo1941, "Unexpected constant tag: "));
                        case 3:
                            c20809.m46793(iMo1941);
                            c20809.m46797(((Integer) ((C10122) interfaceC15768).f34604).intValue());
                            break;
                        case 4:
                            c20809.m46793(iMo1941);
                            float fFloatValue = ((Float) ((C10122) interfaceC15768).f34604).floatValue();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
                            try {
                                new DataOutputStream(byteArrayOutputStream).writeFloat(fFloatValue);
                                c20809.m46794(0, 4, byteArrayOutputStream.toByteArray());
                            } catch (IOException unused) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 5:
                            c17177.f54752++;
                            c20809.m46793(iMo1941);
                            long jLongValue = ((Long) ((C10122) interfaceC15768).f34604).longValue();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream2).writeLong(jLongValue);
                                c20809.m46794(0, 8, byteArrayOutputStream2.toByteArray());
                            } catch (IOException unused2) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 6:
                            c17177.f54752++;
                            c20809.m46793(iMo1941);
                            double dDoubleValue = ((Double) ((C10122) interfaceC15768).f34604).doubleValue();
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream3).writeDouble(dDoubleValue);
                                c20809.m46794(0, 8, byteArrayOutputStream3.toByteArray());
                            } catch (IOException unused3) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 7:
                            AbstractC16579 abstractC16579 = (AbstractC16579) interfaceC15768;
                            if (abstractC16579.m39001(EnumC6617.ARRAY)) {
                                C12239 c12239 = c5888.f20081;
                                c12239.f40971.f67646 = 0;
                                c12239.mo30442(abstractC16579);
                                C20809 c208010 = c12239.f40971;
                                C23942 c23942 = c12239.f40970.f20082;
                                abstractC11242M52777 = c23942.f77631.mo17388(0, c208010.f67646, c208010.f67645);
                            } else {
                                abstractC11242M52777 = c5888.f20082.m52777(C2194.m6809(abstractC16579.f53222.mo50003()));
                            }
                            c20809.m46793(iMo1941);
                            c20809.m46798(m40100(c17178, abstractC11242M52777));
                            if (abstractC16579.m39001(EnumC6617.CLASS)) {
                                c5888.m16115((C22492) abstractC16579.f53222);
                            }
                            break;
                        case 8:
                            AbstractC11242 abstractC11242M17389 = c5888.f20082.f77631.m17389((String) ((C10122) interfaceC15768).f34604);
                            c20809.m46793(iMo1941);
                            c20809.m46798(m40100(c17178, abstractC11242M17389));
                            break;
                        case 9:
                        case 10:
                        case 11:
                            AbstractC23903 abstractC23903 = (AbstractC23903) interfaceC15768;
                            c20809.m46793(iMo1941);
                            c20809.m46798(c5888.m16113(((C22492) abstractC23903.f77448).f77449));
                            c20809.m46798(c5888.m16118(abstractC23903));
                            break;
                        case 12:
                            C20705 c20705 = (C20705) interfaceC15768;
                            c20809.m46793(iMo1941);
                            c20809.m46798(m40100(c17178, c20705.f67327));
                            c20809.m46798(c5888.m16117(c20705.f67328));
                            break;
                        case 15:
                            C15437 c15437 = (C15437) interfaceC15768;
                            c20809.m46793(iMo1941);
                            c20809.m46793(c15437.m36946());
                            c20809.m46798(m40100(c17178, c15437.mo10880()));
                            break;
                        case 16:
                            c20809.m46793(iMo1941);
                            c20809.m46798(c5888.m16117(((C13757) interfaceC15768).mo5593()));
                            break;
                        case 17:
                            C23198 c23198 = (C23198) interfaceC15768;
                            c20809.m46793(iMo1941);
                            c20809.m46798(C5888.m16108(c5888, c23198));
                            c20809.m46798(c5888.m16118(c23198));
                            break;
                        case 18:
                            C6969 c6969 = (C6969) interfaceC15768;
                            c20809.m46793(iMo1941);
                            c20809.m46798(C5888.m16108(c5888, c6969));
                            c20809.m46798(c5888.m16118(c6969));
                            break;
                        case 19:
                            int iM40100 = m40100(c17178, ((C19670) interfaceC15768).f77453);
                            c20809.m46793(19);
                            c20809.m46798(iM40100);
                            break;
                        case 20:
                            AbstractC11242 abstractC11242M52778 = c5888.f20082.m52777(C2194.m6809(((C7675) interfaceC15768).f25396));
                            c20809.m46793(iMo1941);
                            c20809.m46798(m40100(c17178, abstractC11242M52778));
                            break;
                    }
                    arrayDeque.removeFirst();
                }
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40101() {
        this.f54755.clear();
        this.f54752 = 1;
        this.f54756.clear();
        this.f54754 = null;
        this.f54751.f67646 = 0;
    }
}
