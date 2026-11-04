package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M73F */
/* JADX INFO: loaded from: classes4.dex */
public final class C18003 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13921 f58955 = new C13921(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f58956;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f58957;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f58958;

    public C18003(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z) {
        this.f58956 = abstractC22044;
        this.f58957 = abstractC22045;
        this.f58958 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18003 m41975(AbstractC22044 abstractC22044, boolean z) {
        AbstractC22044 abstractC22044M49862;
        if (z) {
            abstractC22044M49862 = abstractC22044.m49862(".compress" + abstractC22044.m49864());
        } else {
            abstractC22044M49862 = abstractC22044;
        }
        return new C18003(abstractC22044, abstractC22044M49862, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m41983() {
        return this.f58957;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m41982(List list, EnumC20987 enumC20987) throws IOException {
        if (!this.f58958) {
            return list;
        }
        try {
            ArrayList arrayListM41980 = m41980(list, enumC20987);
            m41981(arrayListM41980);
            m41977(arrayListM41980);
            m41978(list, enumC20987, null);
            ArrayList arrayList = new ArrayList(arrayListM41980.size());
            Iterator it = arrayListM41980.iterator();
            while (it.hasNext()) {
                arrayList.add(((C14273) it.next()).f45097);
            }
            return arrayList;
        } catch (IOException e) {
            m41978(list, enumC20987, e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ArrayList m41980(List list, EnumC20987 enumC20987) throws IOException {
        boolean z;
        if (list.isEmpty()) {
            throw new IOException("Compression output list is empty");
        }
        EnumC20987 enumC20988 = EnumC20987.NONE;
        AbstractC22044 abstractC22044 = this.f58957;
        if (enumC20987 == enumC20988 && (list.size() != 1 || !abstractC22044.equals(list.get(0)))) {
            throw new IOException("Unexpected non-split compression output");
        }
        ArrayList arrayList = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        boolean zEquals = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC22044 abstractC22045 = (AbstractC22044) it.next();
            AbstractC22044 abstractC22044M41976 = m41976(abstractC22045, enumC20987);
            if (!hashSet.add(abstractC22044M41976.mo4294())) {
                throw new IOException(C1402.m5125(abstractC22044M41976, new StringBuilder("Duplicate compression output target: ")));
            }
            arrayList.add(new C14273(abstractC22045, abstractC22044M41976));
            zEquals |= abstractC22045.equals(abstractC22044);
            if (enumC20987 == EnumC20987.SEVEN_ZIP) {
                if (abstractC22045.getName().equals(abstractC22044.getName() + ".001")) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            z2 |= z;
        }
        if (enumC20987 == EnumC20987.ZIP && !zEquals) {
            throw new IOException("ZIP split output is missing the final volume");
        }
        if (enumC20987 != EnumC20987.SEVEN_ZIP || z2) {
            return arrayList;
        }
        throw new IOException("7z split output is missing the first volume");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22044 m41976(AbstractC22044 abstractC22044, EnumC20987 enumC20987) throws IOException {
        AbstractC22044 abstractC22045 = this.f58957;
        if (!C17359.equals(abstractC22045.getParent(), abstractC22044.getParent())) {
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Compression output is outside the working directory: ")));
        }
        EnumC20987 enumC20988 = EnumC20987.NONE;
        AbstractC22044 abstractC22046 = this.f58956;
        if (enumC20987 == enumC20988) {
            if (abstractC22045.equals(abstractC22044)) {
                return abstractC22046;
            }
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unexpected non-split compression output: ")));
        }
        if (enumC20987 != EnumC20987.ZIP) {
            String strM41974 = m41974(abstractC22044.getName(), 3, abstractC22045.getName(), ".");
            return abstractC22046.m49856().m49876(abstractC22046.getName() + strM41974);
        }
        if (abstractC22045.equals(abstractC22044)) {
            return abstractC22046;
        }
        String strM41975 = m41974(abstractC22044.getName(), 2, C7605.m20779(abstractC22045.getName()), ".z");
        String strM20779 = C7605.m20779(abstractC22046.getName());
        return abstractC22046.m49856().m49876(strM20779 + strM41975);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41974(String str, int i, String str2, String str3) throws IOException {
        boolean z;
        String strM34972 = C14483.m34972(str2, str3);
        if (!str.startsWith(strM34972)) {
            throw new IOException("Unexpected compression volume name: ".concat(str));
        }
        String strSubstring = str.substring(strM34972.length());
        if (strSubstring.length() >= i) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                z = true;
                if (i2 >= strSubstring.length()) {
                    z = true ^ z2;
                    break;
                }
                char cCharAt = strSubstring.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if (cCharAt == '0') {
                    z = false;
                }
                z2 |= z;
                i2++;
            }
            if (!z) {
                return str3.concat(strSubstring);
            }
        }
        throw new IOException("Unexpected compression volume name: ".concat(str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m41981(ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14273 c14273 = (C14273) it.next();
            AbstractC22044 abstractC22044 = c14273.f45094;
            AbstractC22044 abstractC22045 = c14273.f45097;
            if (!abstractC22044.mo2934() || !abstractC22044.mo4304()) {
                throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Compression output file is missing: ")));
            }
            boolean zMo2934 = abstractC22045.mo2934();
            c14273.f45095 = zMo2934;
            if (zMo2934 && abstractC22045.mo4281()) {
                throw new IOException(C1402.m5125(abstractC22045, new StringBuilder("Compression output target is a directory: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41977(ArrayList arrayList) throws IOException {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14273 c14273 = (C14273) it.next();
                boolean z = c14273.f45095;
                AbstractC22044 abstractC22044 = c14273.f45097;
                if (z) {
                    if (abstractC22044.mo19981() || (abstractC22044 instanceof C0678) || (abstractC22044 instanceof C18379)) {
                        C24523 c24523 = new C24523();
                        c14273.f45096 = c24523;
                        c24523.m54796(abstractC22044);
                    }
                    AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".compress_rollback");
                    if (!abstractC22044.mo4301(abstractC22044M49862)) {
                        throw new IOException("Unable to move compression target to rollback file: " + abstractC22044.mo4294());
                    }
                    c14273.f45093 = abstractC22044M49862;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C14273 c14274 = (C14273) it2.next();
                c14274.f45092 = true;
                AbstractC22044 abstractC22045 = c14274.f45097;
                c14274.f45094.m49845(abstractC22045, (Runnable) null);
                C24523 c24524 = c14274.f45096;
                if (c24524 != null) {
                    c24524.m54797(abstractC22045);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C14273 c14275 = (C14273) it3.next();
                AbstractC22044 abstractC22046 = c14275.f45093;
                if (abstractC22046 != null && abstractC22046.mo2934()) {
                    c14275.f45093.mo4296();
                }
            }
        } catch (IOException e) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C14273 c14276 = (C14273) arrayList.get(size);
                AbstractC22044 abstractC22047 = c14276.f45093;
                AbstractC22044 abstractC22048 = c14276.f45097;
                if (abstractC22047 != null) {
                    if (abstractC22047.mo2934()) {
                        if (c14276.f45092) {
                            m41979(c14276, e);
                        }
                        try {
                            c14276.f45093.m49848(abstractC22048, false, false, null);
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else {
                        e.addSuppressed(new IOException(C1402.m5125(abstractC22048, new StringBuilder("Compression rollback file is missing: "))));
                    }
                } else if (!c14276.f45095 && c14276.f45092) {
                    m41979(c14276, e);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41979(C14273 c14273, IOException iOException) {
        AbstractC22044 abstractC22044 = c14273.f45097;
        if (!abstractC22044.mo2934() || abstractC22044.mo4296()) {
            return;
        }
        iOException.addSuppressed(new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to delete published compression output: "))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41978(List list, EnumC20987 enumC20987, IOException iOException) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
            try {
                m41976(abstractC22044, enumC20987);
                if (abstractC22044.mo2934() && !abstractC22044.mo4296() && iOException != null) {
                    iOException.addSuppressed(new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to delete temporary compression output: "))));
                }
            } catch (IOException unused) {
            }
        }
    }
}
