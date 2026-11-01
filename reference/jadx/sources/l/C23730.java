package l;

import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes.dex */
public final class C23730 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52262(C14164 c14164) {
        C12379.f41374 = c14164;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52264(boolean z) {
        C12379.f41373 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52261(C8479 c8479) {
        C12379.f41375 = c8479;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52263(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, C14558 c14558, InterfaceC17379 interfaceC17379) {
        C12107 entry;
        AbstractC17131 abstractC17131M35031 = c14558.m35031();
        EnumC7501 enumC7501M35034 = c14558.m35034();
        String strM35030 = c14558.m35030();
        boolean zM35033 = c14558.m35033();
        try {
            boolean z = enumC7501M35034.f24976;
            boolean z2 = enumC7501M35034.f24978;
            boolean z3 = enumC7501M35034.f24975;
            if (!z && !z2 && !z3) {
                throw new RuntimeException();
            }
            if (!z2 && !z3) {
                C2455 c2455 = new C2455(abstractC20745);
                try {
                    if (!c2455.m7465() && (entry = c2455.getEntry("AndroidManifest.xml")) != null && C20240.m45744(C20945.m47094(c2455.m7471(entry))) >= 30) {
                        z2 = true;
                    }
                    c2455.close();
                } catch (Throwable th) {
                    try {
                        c2455.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            boolean z4 = z2;
            if (z) {
                if ((z4 || z3) && interfaceC17379 != null) {
                    interfaceC17379 = new C6090(interfaceC17379);
                }
                C12379.m30794(abstractC20745, abstractC20746, abstractC17131M35031, strM35030, z4, z3, interfaceC17379);
            } else {
                if (interfaceC17379 != null) {
                    C11030 c11030 = new C11030(interfaceC17379);
                    interfaceC17379.mo2647(z4, z3);
                    c11030.f20606 = false;
                    interfaceC17379 = c11030;
                }
                if (zM35033) {
                    C1388 c1388M46710 = abstractC20745.m46710("r");
                    try {
                        if (new C18459(c1388M46710).m42806()) {
                            throw new C4987(R.string.MT_Protector);
                        }
                        c1388M46710.close();
                        InputStream inputStreamMo33970 = abstractC20745.mo33970();
                        try {
                            OutputStream outputStreamMo33976 = abstractC20746.mo33976(false);
                            try {
                                C1088 c1088 = new C1088(abstractC20745.mo33964(), interfaceC17379);
                                byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                                while (true) {
                                    int i = inputStreamMo33970.read(bArr);
                                    if (i == -1) {
                                        if (outputStreamMo33976 != null) {
                                            outputStreamMo33976.close();
                                        }
                                        inputStreamMo33970.close();
                                        break;
                                    }
                                    outputStreamMo33976.write(bArr, 0, i);
                                    c1088.m4089(i);
                                    if (interfaceC17379 != null && interfaceC17379.mo2357()) {
                                        outputStreamMo33976.close();
                                        inputStreamMo33970.close();
                                        abstractC17131M35031.mo1458();
                                        return;
                                    }
                                    if (inputStreamMo33970 != null) {
                                        try {
                                            inputStreamMo33970.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                if (outputStreamMo33976 != null) {
                                    try {
                                        outputStreamMo33976.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            if (inputStreamMo33970 != null) {
                                inputStreamMo33970.close();
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        try {
                            c1388M46710.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                    abstractC17131M35031.mo1458();
                    throw th;
                }
                C12379.m30795(abstractC20745, abstractC20746, interfaceC17379);
            }
            if (interfaceC17379 == null || !interfaceC17379.mo2357()) {
                if (z4 || z3) {
                    C6464.m17660(abstractC20746, abstractC17131M35031, z4, z3, interfaceC17379);
                }
                abstractC17131M35031.mo1458();
                return;
            }
            abstractC17131M35031.mo1458();
        } catch (Throwable th9) {
            abstractC17131M35031.mo1458();
            throw th9;
        }
    }
}
