package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܶۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public class C15156 extends AbstractC20413 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49500 = 0;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public String f49502;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f49505;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f49507;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49510;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C5222 f49504 = new C5222();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C16608 f49506 = new C16608(false);

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public HashSet f49503 = new HashSet();

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C11465 f49509 = new C11465();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f49508 = new HashSet();

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f49501 = new HashSet();

    /* JADX WARN: Bottom block not found for handler: all -> 0x0242 */
    /* JADX WARN: Code duplicated, block: B:248:0x0571 A[Catch: all -> 0x07fa, TRY_ENTER, TryCatch #7 {all -> 0x07fa, blocks: (B:212:0x04a5, B:222:0x04ea, B:229:0x0503, B:230:0x050b, B:234:0x0523, B:248:0x0571, B:249:0x0577, B:256:0x0595, B:257:0x05ab, B:259:0x05b1, B:226:0x04fc), top: B:365:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:251:0x057d A[Catch: all -> 0x04e7, TRY_ENTER, TryCatch #5 {all -> 0x04e7, blocks: (B:215:0x04b2, B:216:0x04bb, B:218:0x04cb, B:224:0x04f8, B:232:0x0511, B:237:0x052c, B:238:0x0535, B:240:0x053b, B:242:0x0557, B:243:0x055b, B:244:0x0563, B:246:0x0569, B:251:0x057d, B:253:0x0589, B:228:0x0500), top: B:361:0x04b2 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x05b1 A[Catch: all -> 0x07fa, TRY_LEAVE, TryCatch #7 {all -> 0x07fa, blocks: (B:212:0x04a5, B:222:0x04ea, B:229:0x0503, B:230:0x050b, B:234:0x0523, B:248:0x0571, B:249:0x0577, B:256:0x0595, B:257:0x05ab, B:259:0x05b1, B:226:0x04fc), top: B:365:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x05cf A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:264:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:269:0x0619 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0628  */
    /* JADX WARN: Code duplicated, block: B:272:0x0642 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:274:0x064d A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:277:0x067c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x067e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0684  */
    /* JADX WARN: Code duplicated, block: B:283:0x0685 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:296:0x0706 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:298:0x070a A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:301:0x0712 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0765 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:392:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:? A[LOOP:4: B:75:0x01ee->B:394:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x067a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0681 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x068a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0773 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f5 A[Catch: all -> 0x0234, TRY_LEAVE, TryCatch #3 {all -> 0x0234, blocks: (B:74:0x01de, B:75:0x01ee, B:77:0x01f5), top: B:357:0x01de, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0208 A[Catch: all -> 0x0242, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:73:0x01da, B:79:0x01ff, B:82:0x0208, B:96:0x0241, B:95:0x023e, B:74:0x01de, B:75:0x01ee, B:77:0x01f5, B:91:0x0238), top: B:353:0x01da, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0212  */
    /* JADX WARN: Code restructure failed: missing block: B:438:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:263:0x05cf, please report this as an issue */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5202 mo3077() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15156.mo3077():l.ۚ۟ۜ");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        String[] strArrM41566 = m41566("ARG_PATHS");
        return strArrM41566.length == 1 ? C16737.m39264(R.string.MT_Protector, C6730.m18175(strArrM41566[0])) : C16737.m39264(R.string.MT_Protector, m41567("extractDir"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5726;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36325(C15156 c15156, AbstractC20745 abstractC20745, int i, IInArchive iInArchive, AbstractC20745 abstractC20746, String[] strArr, C6688[] c6688Arr) {
        boolean zM39280 = C16737.m39280();
        ArrayList<C18334> arrayList = new ArrayList();
        C19533 c19533 = new C19533();
        C2189.m6798(null, null, new C3865(c15156, c15156, iInArchive, abstractC20746, arrayList, c6688Arr, strArr, abstractC20745, zM39280, c19533, i));
        if (c15156.mo2357()) {
            return;
        }
        c15156.m41591(R.string.MT_Protector);
        C8516 c8516 = new C8516(arrayList.size());
        c8516.m22241(new C7937(c15156));
        for (C18334 c18334 : arrayList) {
            c8516.m22242(1);
            String str = strArr[c18334.m42575()];
            c15156.mo41554(str);
            AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(str);
            c15156.m36329(abstractC20745M46690);
            if (c18334.m42570() >= 0 && zM39280 && abstractC20745M46690.mo8448()) {
                abstractC20745M46690.mo32855(c18334.m42570());
            }
            c15156.m36330(str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C6688 c6688 : c6688Arr) {
            if (c6688 != null) {
                arrayList2.add(c6688);
            }
        }
        c15156.m36326(abstractC20745, i, arrayList2, c19533);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m36322(AbstractC20745 abstractC20745, String str, long j, long j2) {
        int iMo11423;
        boolean zM28649 = this.f49509.m28649(abstractC20745);
        C16608 c16608 = this.f49506;
        if (c16608.mo11425(zM28649)) {
            iMo11423 = c16608.mo11423(str, C20321.m45854(j, j2), C20321.m45856(abstractC20745), abstractC20745.mo35233(), zM28649);
        } else {
            C20321 c20321 = C20321.f65801;
            iMo11423 = c16608.mo11423(str, c20321, c20321, false, zM28649);
        }
        if (c16608.mo2357()) {
            cancel();
        }
        return iMo11423;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36326(AbstractC20745 abstractC20745, int i, ArrayList arrayList, C19533 c19533) {
        if (arrayList.isEmpty()) {
            return;
        }
        m41591(R.string.MT_Protector);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6688 c6688 = (C6688) it.next();
            if (!mo2357()) {
                String str = c6688.f22556;
                String strConcat = str.concat("/");
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(str);
                        if (!abstractC20745M46690.mo33975()) {
                            mo41554(str);
                            m36329(abstractC20745M46690.m46689());
                            abstractC20745M46690.mo33977(c19533.m44617(str, c6688.f22555));
                            if (!c6688.f22554) {
                                int i2 = C22252.f72742;
                                C22252.m49408(abstractC20745M46690.mo33986(), true);
                            }
                            m36330(abstractC20745M46690.mo33986().substring(i));
                            break;
                        }
                        break;
                    }
                    C6688 c6689 = (C6688) it2.next();
                    if (c6689 != c6688 && c6689.f22556.startsWith(strConcat)) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m36330(String str) {
        int iIndexOf = str.indexOf(47);
        HashSet hashSet = this.f49503;
        if (iIndexOf == -1) {
            hashSet.add(str);
        } else {
            hashSet.add(str.substring(0, iIndexOf));
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380()) {
            boolean z = this.f49507;
            HashSet hashSet = this.f49503;
            if (z) {
                if (m41559(c11546)) {
                    c11546.m28831();
                    c11546.m28777((Collection) hashSet);
                    c11546.m28830();
                    return;
                }
                return;
            }
            if (m41579(c11545)) {
                c11545.m28831();
                c11545.m28777((Collection) hashSet);
                c11545.m28830();
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m36327(AbstractC20745 abstractC20745) throws IOException {
        if (this.f49501.add(abstractC20745.mo33986())) {
            try {
                C2462.m7542(abstractC20745, EnumC11636.MODIFY_DIRECTORY);
                if (!abstractC20745.mo33975() && !abstractC20745.mo33987()) {
                    throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Cannot create extract directory: ")));
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m36329(AbstractC20745 abstractC20745) {
        if (abstractC20745 == null) {
            return;
        }
        String strMo33986 = abstractC20745.mo33986();
        HashSet hashSet = this.f49508;
        if (hashSet.contains(strMo33986)) {
            return;
        }
        if (!abstractC20745.mo33975()) {
            abstractC20745.mo33987();
        }
        hashSet.add(abstractC20745.mo33986());
        do {
            abstractC20745 = abstractC20745.m46689();
            if (abstractC20745 == null) {
                return;
            }
        } while (hashSet.add(abstractC20745.mo33986()));
    }
}
