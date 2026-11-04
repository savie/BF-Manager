package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22420 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14960 f72608;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f72609;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f72611;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8850 f72612;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f72607 = new HashSet();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f72610 = new HashMap();

    public C22420(AbstractC22044 abstractC22044, C14960 c14960, boolean z, boolean z2, InterfaceC23517 interfaceC23517) {
        boolean z3;
        this.f72608 = c14960;
        this.f72609 = z;
        ArrayList<C24975> arrayList = new ArrayList();
        C22941 c22941 = new C22941(abstractC22044.m49876("base.apk"));
        try {
            C8002 entry = c22941.getEntry("classes.dex");
            if (entry != null) {
                int i = 0;
                byte[] bArrM46522 = C20244.m46522(c22941.m51727(entry), 0);
                byte[] bArrCopyOf = Arrays.copyOf(bArrM46522, 20);
                C13778 c13778M29290 = C11650.m29290(bArrCopyOf);
                if (!c13778M29290.m33676()) {
                    throw new C3090(C1364.m5010(c13778M29290, R.string.MT_Protector));
                }
                if (C17933.m41873(c13778M29290.m33677(), bArrCopyOf)) {
                    z3 = true;
                } else {
                    for (int length = bArrM46522.length / 2; length < bArrM46522.length; length++) {
                        bArrM46522[length] = (byte) (bArrM46522[length] / 2);
                    }
                    z3 = false;
                }
                C24975 c24975M55779 = C24975.m55779(bArrM46522);
                c24975M55779.m55788("classes.dex");
                arrayList.add(c24975M55779);
                int i2 = 1;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("classes");
                    i2++;
                    sb.append(i2);
                    sb.append(".dex");
                    String string = sb.toString();
                    C8002 entry2 = c22941.getEntry(string);
                    if (entry2 == null) {
                        break;
                    }
                    byte[] bArrM46523 = C20244.m46522(c22941.m51727(entry2), 0);
                    if (!z3) {
                        for (int length2 = bArrM46523.length / 2; length2 < bArrM46523.length; length2++) {
                            bArrM46523[length2] = (byte) (bArrM46523[length2] / 2);
                        }
                    }
                    C24975 c24975M557710 = C24975.m55779(bArrM46523);
                    c24975M557710.m55788(string);
                    arrayList.add(c24975M557710);
                }
                c22941.close();
                c14960.m36011(abstractC22044.mo4294(), z, z2);
                C8850 c8850 = new C8850(((C24975) arrayList.get(0)).mo4326());
                this.f72612 = c8850;
                this.f72611 = c8850.f74945.m36267();
                interfaceC23517.mo11092();
                Iterator it = arrayList.iterator();
                int iM55804 = 0;
                while (it.hasNext()) {
                    iM55804 += ((C24975) it.next()).m55804();
                }
                int i3 = -1;
                for (C24975 c24975 : arrayList) {
                    HashSet hashSet = new HashSet();
                    for (C22737 c22737 : (AbstractC8696) c24975.mo4327()) {
                        i++;
                        int i4 = (i * 100) / iM55804;
                        if (i4 != i3) {
                            interfaceC23517.mo11094(i4);
                            i3 = i4;
                        }
                        if (!this.f72612.f74945.m36267().containsKey(c22737.getType())) {
                            this.f72612.m23712((InterfaceC10122) c22737);
                            hashSet.add(c22737.getType());
                            if (interfaceC23517.mo924()) {
                                return;
                            }
                        }
                    }
                    this.f72610.put((String) c24975.m55811(), hashSet);
                }
                return;
            }
            throw new IOException("classes.dex not found");
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
