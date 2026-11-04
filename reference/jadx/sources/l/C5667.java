package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6EN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5667 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19553 = 0;

    static {
        C16980.m40037(C5667.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        C17752 c17752;
        if (c2551.m8524()) {
            return;
        }
        for (C21943 c21943 : c2551.m8508()) {
            for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                if (c18959.getType() == EnumC24203.INVOKE) {
                    C21219 c21219 = (C21219) c18959;
                    InterfaceC21197 interfaceC21197 = (InterfaceC21197) c21219.mo17862((InterfaceC2157) C11457.f35998);
                    if (interfaceC21197 instanceof C2551) {
                        C2551 c2552 = (C2551) interfaceC21197;
                        try {
                            C17752 c17752M55883 = C25059.m55883(c2552);
                            if (c17752M55883 == null) {
                                c2551.m31133("Class process forced to load method for inline: " + c2552);
                                c2551.mo8527().m5694().m4867(c2552.m8536());
                                C17752 c17752M55884 = C25059.m55883(c2552);
                                if (c17752M55884 == null) {
                                    c2551.m31138("Failed to check method for inline after forced process" + c2552);
                                } else {
                                    c17752 = c17752M55884;
                                }
                            } else {
                                c17752 = c17752M55883;
                            }
                            if (!c17752.m41568()) {
                                if (((Boolean) c17752.m41569().m44009(new C15361(c2551))) == null) {
                                    m16656(c2551, c2552, c17752, c21943, c21219);
                                }
                            }
                        } catch (Exception e) {
                            throw new C8597("Failed to process method for inline: " + c2552, e);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b9 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:3:0x0009, B:5:0x0017, B:6:0x0022, B:8:0x0025, B:9:0x0030, B:10:0x003c, B:12:0x0042, B:15:0x0050, B:16:0x006c, B:18:0x0070, B:19:0x008c, B:21:0x0096, B:22:0x00b3, B:24:0x00b9, B:25:0x00c1, B:36:0x00e7, B:28:0x00cc, B:31:0x00d5, B:34:0x00df), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c1 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:3:0x0009, B:5:0x0017, B:6:0x0022, B:8:0x0025, B:9:0x0030, B:10:0x003c, B:12:0x0042, B:15:0x0050, B:16:0x006c, B:18:0x0070, B:19:0x008c, B:21:0x0096, B:22:0x00b3, B:24:0x00b9, B:25:0x00c1, B:36:0x00e7, B:28:0x00cc, B:31:0x00d5, B:34:0x00df), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7 A[Catch: Exception -> 0x00f9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f9, blocks: (B:3:0x0009, B:5:0x0017, B:6:0x0022, B:8:0x0025, B:9:0x0030, B:10:0x003c, B:12:0x0042, B:15:0x0050, B:16:0x006c, B:18:0x0070, B:19:0x008c, B:21:0x0096, B:22:0x00b3, B:24:0x00b9, B:25:0x00c1, B:36:0x00e7, B:28:0x00cc, B:31:0x00d5, B:34:0x00df), top: B:49:0x0009 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16656(final C2551 c2551, final C2551 c2552, C17752 c17752, C21943 c21943, C21219 c21219) {
        C6041 c6041M44027;
        C18959 c18959Mo4072 = c17752.m41569().mo4072();
        boolean z = false;
        try {
            if (!c2552.mo8532().m49702().isEmpty()) {
                int iM8518 = c2552.m8518();
                AbstractC16481[] abstractC16481Arr = new AbstractC16481[iM8518];
                int[] iArrM41567 = c17752.m41567();
                for (int i = 0; i < iArrM41567.length; i++) {
                    abstractC16481Arr[iArrM41567[i]] = c21219.mo44035(i);
                }
                ArrayList arrayList = new ArrayList();
                c18959Mo4072.mo14760((Collection) arrayList);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C6041 c6041 = (C6041) it.next();
                        int iM17532 = c6041.m17532();
                        if (iM17532 >= iM8518) {
                            c2551.m31138("Unknown register number '" + c6041 + "' in method call: " + c2552);
                        } else {
                            AbstractC16481 abstractC16481 = abstractC16481Arr[iM17532];
                            if (abstractC16481 == null) {
                                c2551.m31138("Not passed register '" + c6041 + "' in method call: " + c2552);
                            } else if (!c18959Mo4072.mo14762(c6041, abstractC16481.mo17528())) {
                                c2551.m31138("Failed to replace arg " + c6041 + " for method inline: " + c2552);
                            }
                        }
                    } else {
                        c6041M44027 = c21219.m44027();
                        if (c6041M44027 != null) {
                            c18959Mo4072.m44031(c6041M44027.mo17528());
                        } else if ((c21219.m44027() != null || c21219.mo17865(EnumC1763.WRAPPED) || c17752.m41569().getType() == EnumC24203.IPUT) ? false : !c2552.m8534()) {
                            C6041 c6041M8495 = c2551.m8495(c2552.mo8519());
                            c6041M8495.setName("unused");
                            c18959Mo4072.m44031(c6041M8495);
                        }
                        z = true;
                    }
                }
            } else {
                c6041M44027 = c21219.m44027();
                if (c6041M44027 != null) {
                    c18959Mo4072.m44031(c6041M44027.mo17528());
                } else {
                    if (c21219.m44027() != null) {
                        if ((c21219.m44027() != null || c21219.mo17865(EnumC1763.WRAPPED) || c17752.m41569().getType() == EnumC24203.IPUT) ? false : !c2552.m8534()) {
                            C6041 c6041M8496 = c2551.m8495(c2552.mo8519());
                            c6041M8496.setName("unused");
                            c18959Mo4072.m44031(c6041M8496);
                        }
                    }
                    if ((c21219.m44027() != null || c21219.mo17865(EnumC1763.WRAPPED) || c17752.m41569().getType() == EnumC24203.IPUT) ? false : !c2552.m8534()) {
                        C6041 c6041M8497 = c2551.m8495(c2552.mo8519());
                        c6041M8497.setName("unused");
                        c18959Mo4072.m44031(c6041M8497);
                    }
                }
                z = true;
            }
        } catch (Exception e) {
            c2551.m31134("Method inline failed with exception", e);
        }
        if (z) {
            InterfaceC21197 interfaceC21197 = (InterfaceC21197) c18959Mo4072.mo17862((InterfaceC2157) C11457.f35998);
            if (C23231.m52179(c2551, c21943, c21219, c18959Mo4072)) {
                if (interfaceC21197 != null) {
                    c18959Mo4072.mo17864(interfaceC21197);
                }
                C18959 c18959M41569 = c17752.m41569();
                ArrayList arrayList2 = new ArrayList(c2552.m8514());
                arrayList2.remove(c2551);
                c2552.m8520(arrayList2);
                c18959M41569.mo14761(new Consumer(this) { // from class: l.ᩴ۬ۗ
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C12312.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        C18959 c18959 = (C18959) obj;
                        int i2 = C13124.f41929[c18959.getType().ordinal()];
                        C2551 c2553 = c2551;
                        C2551 c2554 = c2552;
                        switch (i2) {
                            case 1:
                            case 2:
                                C2551 c2551M5668 = c2553.mo8527().m5668(((AbstractC15251) c18959).mo18926());
                                if (c2551M5668 != null) {
                                    c2551M5668.m8520(C6823.m19002(new ArrayList(c2551M5668.m8514()), c2554, c2553));
                                    C24927 c24927M8536 = c2551M5668.m8536();
                                    c24927M8536.m55580(C6823.m19002(c24927M8536.m55555(), c2554, c2553));
                                    c24927M8536.m55557(C6823.m19002(c24927M8536.m55533(), c2554.m8536(), c2553.m8536()));
                                }
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                C17467 c17467M5670 = c2553.mo8527().m5670((C14022) ((C3319) c18959).m10937());
                                if (c17467M5670 != null) {
                                    c17467M5670.m40971(C6823.m19002(new ArrayList(c17467M5670.m40968()), c2554, c2553));
                                    C24927 c24927M40972 = c17467M5670.m40972();
                                    c24927M40972.m55580(C6823.m19002(c24927M40972.m55555(), c2554, c2553));
                                    c24927M40972.m55557(C6823.m19002(c24927M40972.m55533(), c2554.m8536(), c2553.m8536()));
                                }
                                break;
                        }
                    }
                });
                return;
            }
        }
        c2551.m31138("Failed to inline method: " + c2552);
        C9804.m25538(c2551, c18959Mo4072);
        c21219.mo14759();
    }
}
