package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5655 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8485 f19318;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f19319 = new HashSet();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f19320 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16944 f19321;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f19322;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f19323;

    public C5655(AbstractC20745 abstractC20745, C16944 c16944, boolean z, boolean z2, InterfaceC8706 interfaceC8706) throws Exception {
        boolean z3;
        this.f19321 = c16944;
        this.f19323 = z;
        ArrayList<C17684> arrayList = new ArrayList();
        C2455 c2455 = new C2455(abstractC20745.m46690("base.apk"));
        try {
            C12107 entry = c2455.getEntry("classes.dex");
            if (entry != null) {
                int i = 0;
                byte[] bArrM44470 = C19431.m44470(c2455.m7471(entry), 0);
                byte[] bArrCopyOf = Arrays.copyOf(bArrM44470, 20);
                C1313 c1313M48030 = C21444.m48030(bArrCopyOf);
                if (!c1313M48030.m4686()) {
                    throw new C8142(C4820.m13401(c1313M48030, R.string.MT_Protector));
                }
                if (C21460.m48083(c1313M48030.m4683(), bArrCopyOf)) {
                    z3 = true;
                } else {
                    for (int length = bArrM44470.length / 2; length < bArrM44470.length; length++) {
                        bArrM44470[length] = (byte) (bArrM44470[length] / 2);
                    }
                    z3 = false;
                }
                C17684 c17684M41161 = C17684.m41161(bArrM44470);
                c17684M41161.m41173("classes.dex");
                arrayList.add(c17684M41161);
                int i2 = 1;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("classes");
                    i2++;
                    sb.append(i2);
                    sb.append(".dex");
                    String string = sb.toString();
                    C12107 entry2 = c2455.getEntry(string);
                    if (entry2 == null) {
                        break;
                    }
                    byte[] bArrM44471 = C19431.m44470(c2455.m7471(entry2), 0);
                    if (!z3) {
                        for (int length2 = bArrM44471.length / 2; length2 < bArrM44471.length; length2++) {
                            bArrM44471[length2] = (byte) (bArrM44471[length2] / 2);
                        }
                    }
                    C17684 c17684M41162 = C17684.m41161(bArrM44471);
                    c17684M41162.m41173(string);
                    arrayList.add(c17684M41162);
                }
                c2455.close();
                c16944.m39684(abstractC20745.mo33986(), z, z2);
                C8485 c8485 = new C8485(((C17684) arrayList.get(0)).mo34147());
                this.f19318 = c8485;
                this.f19322 = c8485.f51692.m1292();
                interfaceC8706.mo22531();
                Iterator it = arrayList.iterator();
                int iM41201 = 0;
                while (it.hasNext()) {
                    iM41201 += ((C17684) it.next()).m41201();
                }
                int i3 = -1;
                for (C17684 c17684 : arrayList) {
                    HashSet hashSet = new HashSet();
                    for (C7807 c7807 : (AbstractC18494) c17684.mo34148()) {
                        i++;
                        int i4 = (i * 100) / iM41201;
                        if (i4 != i3) {
                            interfaceC8706.mo22533(i4);
                            i3 = i4;
                        }
                        if (!this.f19318.f51692.m1292().containsKey(c7807.getType())) {
                            this.f19318.m22160((InterfaceC22762) c7807);
                            hashSet.add(c7807.getType());
                            if (interfaceC8706.mo2357()) {
                                return;
                            }
                        }
                    }
                    this.f19320.put((String) c17684.m41200(), hashSet);
                }
                return;
            }
            throw new IOException("classes.dex not found");
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
