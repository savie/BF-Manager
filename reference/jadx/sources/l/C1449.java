package l;

import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1449 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5218(C13680 c13680) {
        C0374.f1904 = c13680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5221(boolean z) {
        C0374.f1903 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5219(C19967 c19967) {
        C0374.f1905 = c19967;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5220(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, C9651 c9651, InterfaceC8161 interfaceC8161) {
        C8002 entry;
        AbstractC14806 abstractC14806M25168 = c9651.m25168();
        EnumC6670 enumC6670M25170 = c9651.m25170();
        String strM25169 = c9651.m25169();
        boolean zM25171 = c9651.m25171();
        try {
            boolean z = enumC6670M25170.f22243;
            boolean z2 = enumC6670M25170.f22245;
            boolean z3 = enumC6670M25170.f22244;
            if (!z && !z2 && !z3) {
                throw new RuntimeException();
            }
            if (!z2 && !z3) {
                C22941 c22941 = new C22941(abstractC22044);
                try {
                    if (!c22941.m51741() && (entry = c22941.getEntry("AndroidManifest.xml")) != null && C18685.m43481(C14955.m35973(c22941.m51727(entry))) >= 30) {
                        z2 = true;
                    }
                    c22941.close();
                } catch (Throwable th) {
                    try {
                        c22941.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            boolean z4 = z2;
            if (z) {
                if ((z4 || z3) && interfaceC8161 != null) {
                    interfaceC8161 = new C19348(interfaceC8161);
                }
                C0374.m2171(abstractC22044, abstractC22045, abstractC14806M25168, strM25169, z4, z3, interfaceC8161);
            } else {
                if (interfaceC8161 != null) {
                    C10397 c10397 = new C10397(interfaceC8161);
                    interfaceC8161.mo1553(z4, z3);
                    c10397.f62521 = false;
                    interfaceC8161 = c10397;
                }
                if (zM25171) {
                    C13961 c13961M49855 = abstractC22044.m49855("r");
                    try {
                        if (new C11911(c13961M49855).m29857()) {
                            throw new C4866(R.string.MT_Protector);
                        }
                        c13961M49855.close();
                        InputStream inputStreamMo4290 = abstractC22044.mo4290();
                        try {
                            OutputStream outputStreamMo4289 = abstractC22045.mo4289(false);
                            try {
                                C15289 c15289 = new C15289(abstractC22044.mo4285(), interfaceC8161);
                                byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                                while (true) {
                                    int i = inputStreamMo4290.read(bArr);
                                    if (i == -1) {
                                        if (outputStreamMo4289 != null) {
                                            outputStreamMo4289.close();
                                        }
                                        inputStreamMo4290.close();
                                        break;
                                    }
                                    outputStreamMo4289.write(bArr, 0, i);
                                    c15289.m36690(i);
                                    if (interfaceC8161 != null && interfaceC8161.mo924()) {
                                        outputStreamMo4289.close();
                                        inputStreamMo4290.close();
                                        abstractC14806M25168.mo18535();
                                        return;
                                    }
                                    if (inputStreamMo4290 != null) {
                                        try {
                                            inputStreamMo4290.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                if (outputStreamMo4289 != null) {
                                    try {
                                        outputStreamMo4289.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            if (inputStreamMo4290 != null) {
                                inputStreamMo4290.close();
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        try {
                            c13961M49855.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                    abstractC14806M25168.mo18535();
                    throw th;
                }
                C0374.m2170(abstractC22044, abstractC22045, interfaceC8161);
            }
            if (interfaceC8161 == null || !interfaceC8161.mo924()) {
                if (z4 || z3) {
                    C20116.m46243(abstractC22045, abstractC14806M25168, z4, z3, interfaceC8161);
                }
                abstractC14806M25168.mo18535();
                return;
            }
            abstractC14806M25168.mo18535();
        } catch (Throwable th9) {
            abstractC14806M25168.mo18535();
            throw th9;
        }
    }
}
