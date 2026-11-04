package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩴ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20035 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15559 f64351;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f64352 = new HashMap(64);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9002 f64353 = new C9002(EnumC6121.f20881);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f64348 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f64350 = new ArrayDeque();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f64349 = null;

    public C20035(C15559 c15559) {
        this.f64351 = c15559;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46076(C20035 c20035, InterfaceC13564 interfaceC13564) {
        AbstractC19728 abstractC19728M36600;
        ArrayDeque arrayDeque = c20035.f64350;
        C15559 c15559 = c20035.f64351;
        C20035 c20036 = c15559.f50605;
        Object objMo2971 = interfaceC13564.mo2971(c15559.f50602);
        HashMap map = c20035.f64352;
        Integer numValueOf = (Integer) map.get(objMo2971);
        if (numValueOf == null) {
            int i = c20035.f64348;
            c20035.f64348 = i + 1;
            numValueOf = Integer.valueOf(i);
            map.put(objMo2971, numValueOf);
            boolean zIsEmpty = arrayDeque.isEmpty();
            arrayDeque.addLast(interfaceC13564);
            if (zIsEmpty) {
                while (!arrayDeque.isEmpty()) {
                    InterfaceC13564 interfaceC13565 = (InterfaceC13564) arrayDeque.peekFirst();
                    C9002 c9002 = c20035.f64353;
                    int iMo2973 = interfaceC13565.mo2973();
                    switch (iMo2973) {
                        case 1:
                            AbstractC19728 abstractC19728 = (AbstractC19728) interfaceC13565;
                            c9002.m24017(iMo2973);
                            int iMo42395 = abstractC19728.mo42395();
                            byte[] bArr = new byte[iMo42395];
                            abstractC19728.m45431(0, bArr);
                            c9002.m24022(iMo42395);
                            c9002.m24018(0, iMo42395, bArr);
                            if (c20035.f64349 == null && iMo42395 > 65535) {
                                c20035.f64349 = new String(bArr);
                            }
                            break;
                        case 2:
                        case 13:
                        case 14:
                        default:
                            throw new AssertionError(C13645.m33382(iMo2973, "Unexpected constant tag: "));
                        case 3:
                            c9002.m24017(iMo2973);
                            c9002.m24020(((Integer) ((C2378) interfaceC13565).f7649).intValue());
                            break;
                        case 4:
                            c9002.m24017(iMo2973);
                            float fFloatValue = ((Float) ((C2378) interfaceC13565).f7649).floatValue();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
                            try {
                                new DataOutputStream(byteArrayOutputStream).writeFloat(fFloatValue);
                                c9002.m24018(0, 4, byteArrayOutputStream.toByteArray());
                            } catch (IOException unused) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 5:
                            c20035.f64348++;
                            c9002.m24017(iMo2973);
                            long jLongValue = ((Long) ((C2378) interfaceC13565).f7649).longValue();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream2).writeLong(jLongValue);
                                c9002.m24018(0, 8, byteArrayOutputStream2.toByteArray());
                            } catch (IOException unused2) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 6:
                            c20035.f64348++;
                            c9002.m24017(iMo2973);
                            double dDoubleValue = ((Double) ((C2378) interfaceC13565).f7649).doubleValue();
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream3).writeDouble(dDoubleValue);
                                c9002.m24018(0, 8, byteArrayOutputStream3.toByteArray());
                            } catch (IOException unused3) {
                                throw new AssertionError("write");
                            }
                            break;
                        case 7:
                            AbstractC22664 abstractC22664 = (AbstractC22664) interfaceC13565;
                            if (abstractC22664.m51067(EnumC21172.ARRAY)) {
                                C23019 c23019 = c15559.f50603;
                                c23019.f74703.f29318 = 0;
                                c23019.mo25984(abstractC22664);
                                C9002 c9003 = c23019.f74703;
                                C15252 c15252 = c23019.f74702.f50601;
                                abstractC19728M36600 = c15252.f49864.mo2068(0, c9003.f29318, c9003.f29317);
                            } else {
                                abstractC19728M36600 = c15559.f50601.m36600(C20693.m47330(abstractC22664.f73596.mo29575()));
                            }
                            c9002.m24017(iMo2973);
                            c9002.m24022(m46076(c20036, abstractC19728M36600));
                            if (abstractC22664.m51067(EnumC21172.CLASS)) {
                                c15559.m37273((C24550) abstractC22664.f73596);
                            }
                            break;
                        case 8:
                            AbstractC19728 abstractC19728M51194 = c15559.f50601.f49864.m51194((String) ((C2378) interfaceC13565).f7649);
                            c9002.m24017(iMo2973);
                            c9002.m24022(m46076(c20036, abstractC19728M51194));
                            break;
                        case 9:
                        case 10:
                        case 11:
                            AbstractC11781 abstractC11781 = (AbstractC11781) interfaceC13565;
                            c9002.m24017(iMo2973);
                            c9002.m24022(c15559.m37272(((C24550) abstractC11781.f38069).f38067));
                            c9002.m24022(c15559.m37275(abstractC11781));
                            break;
                        case 12:
                            C6853 c6853 = (C6853) interfaceC13565;
                            c9002.m24017(iMo2973);
                            c9002.m24022(m46076(c20036, c6853.f22764));
                            c9002.m24022(c15559.m37276(c6853.f22765));
                            break;
                        case 15:
                            C8141 c8141 = (C8141) interfaceC13565;
                            c9002.m24017(iMo2973);
                            c9002.m24017(c8141.m22020());
                            c9002.m24022(m46076(c20036, c8141.mo10410()));
                            break;
                        case 16:
                            c9002.m24017(iMo2973);
                            c9002.m24022(c15559.m37276(((C23191) interfaceC13565).mo4935()));
                            break;
                        case 17:
                            C0683 c0683 = (C0683) interfaceC13565;
                            c9002.m24017(iMo2973);
                            c9002.m24022(C15559.m37266(c15559, c0683));
                            c9002.m24022(c15559.m37275(c0683));
                            break;
                        case 18:
                            C18582 c18582 = (C18582) interfaceC13565;
                            c9002.m24017(iMo2973);
                            c9002.m24022(C15559.m37266(c15559, c18582));
                            c9002.m24022(c15559.m37275(c18582));
                            break;
                        case 19:
                            int iM46076 = m46076(c20036, ((C2920) interfaceC13565).f38072);
                            c9002.m24017(19);
                            c9002.m24022(iM46076);
                            break;
                        case 20:
                            AbstractC19728 abstractC19728M36601 = c15559.f50601.m36600(C20693.m47330(((C14106) interfaceC13565).f44619));
                            c9002.m24017(iMo2973);
                            c9002.m24022(m46076(c20036, abstractC19728M36601));
                            break;
                    }
                    arrayDeque.removeFirst();
                }
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46077() {
        this.f64352.clear();
        this.f64348 = 1;
        this.f64350.clear();
        this.f64349 = null;
        this.f64353.f29318 = 0;
    }
}
